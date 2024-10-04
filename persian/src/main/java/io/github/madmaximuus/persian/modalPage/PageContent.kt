package io.github.madmaximuus.persian.modalPage

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.GraphicsLayerScope
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.internal.DraggableAnchors
import io.github.madmaximuus.persian.internal.draggableAnchors
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.surface.Surface
import kotlin.math.max
import kotlin.math.min

@Composable
internal fun Scrim(
    color: Color,
    onDismissRequest: () -> Unit,
    pageState: PageState,
    visible: Boolean
) {
    val height = with(LocalDensity.current) {
        LocalConfiguration.current.screenHeightDp.dp.toPx()
    }
    val target = (pageState.offset ?: 1f) / height
    if (color.isSpecified) {
        val alpha by animateFloatAsState(
            targetValue = when (target) {
                in 0f..0.1f -> 0.9f
                in 0.1f..0.5f -> 0.6f
                in 0.5f..0.7f -> 0.4f
                else -> 0.3f
            },
            animationSpec = TweenSpec(),
            label = "Modal page drag scrim animation"
        )
        val appearAlpha by animateFloatAsState(
            targetValue = if (visible) 1f else 0f,
            animationSpec = TweenSpec(),
            label = "Modal page scrim animation"
        )
        val dismissSheet = if (visible) {
            Modifier
                .pointerInput(onDismissRequest) { detectTapGestures { onDismissRequest() } }
                .semantics(mergeDescendants = true) {
                    contentDescription = "Close sheet"
                    onClick {
                        onDismissRequest()
                        true
                    }
                }
        } else {
            Modifier
        }
        Canvas(
            Modifier
                .fillMaxSize()
                .then(dismissSheet)
        ) {
            drawRect(color = color.copy(alpha), alpha = appearAlpha)
        }
    }
}


@Composable
internal fun BoxScope.ModalBottomSheetContent(
    predictiveBackProgress: Animatable<Float, AnimationVector1D>,
    settleToDismiss: (velocity: Float) -> Unit,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    pageState: PageState,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    top: @Composable (ModalPageTopScope.() -> Unit)?,
    bottom: @Composable (ModalPageBottomScope.() -> Unit)?,
    contentWindowInsets: WindowInsets,
    content: @Composable (PaddingValues) -> Unit
) {
    val dragAnchor = pageState.dragAnchors
    var modalHeight by remember { mutableIntStateOf(0) }
    var footerHeight by remember { mutableIntStateOf(0) }
    val bottomPadding = WindowInsets.navigationBars.getBottom(LocalDensity.current)
    Surface(
        modifier = modifier
            .statusBarsPadding()
            .padding(top = PersianTheme.spacing.size8)
            .onGloballyPositioned {
                modalHeight = it.size.height
            }
            .align(Alignment.BottomCenter)
            .fillMaxWidth()
            .graphicsLayer {
                val sheetOffset = pageState.anchoredDraggableState.offset
                val sheetHeight = size.height
                if (!sheetOffset.isNaN() && !sheetHeight.isNaN() && sheetHeight != 0f) {
                    val progress = predictiveBackProgress.value
                    scaleX = calculatePredictiveBackScaleX(progress)
                    scaleY = calculatePredictiveBackScaleY(progress)
                    transformOrigin =
                        TransformOrigin(0.5f, (sheetOffset + sheetHeight) / sheetHeight)
                }
            }
            .nestedScroll(
                remember(pageState) {
                    ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
                        sheetState = pageState,
                        orientation = Orientation.Vertical,
                        onFling = settleToDismiss
                    )
                }
            )
            .draggableAnchors(
                pageState.anchoredDraggableState,
                Orientation.Vertical
            ) { sheetSize, constraints ->
                val fullHeight = constraints.maxHeight.toFloat()
                val newAnchors = DraggableAnchors {
                    DragAnchor.Hidden at fullHeight
                    dragAnchor.forEach {
                        it at when (it) {
                            DragAnchor.Expanded -> max(0f, fullHeight - sheetSize.height)
                            is DragAnchor.Fraction ->
                                fullHeight - fullHeight * (it.value.coerceIn(0.1f, 1f))

                            DragAnchor.Half -> fullHeight / 2f

                            else -> fullHeight
                        }
                    }
                }
                val newTarget =
                    when (val value = pageState.anchoredDraggableState.targetValue) {
                        DragAnchor.Expanded ->
                            if (newAnchors.hasAnchorFor(DragAnchor.Expanded))
                                DragAnchor.Expanded
                            else
                                DragAnchor.Hidden

                        is DragAnchor.Fraction ->
                            if (newAnchors.hasAnchorFor(DragAnchor.Fraction(value.value)))
                                DragAnchor.Fraction(value.value)
                            else
                                DragAnchor.Hidden

                        DragAnchor.Half ->
                            if (newAnchors.hasAnchorFor(DragAnchor.Half))
                                DragAnchor.Half
                            else
                                DragAnchor.Hidden

                        DragAnchor.Hidden -> DragAnchor.Hidden
                    }
                return@draggableAnchors newAnchors to newTarget
            }
            .draggable(
                state = pageState.anchoredDraggableState.draggableState,
                orientation = Orientation.Vertical,
                enabled = pageState.isVisible,
                startDragImmediately = pageState.anchoredDraggableState.isAnimationRunning,
                onDragStopped = { settleToDismiss(it) }
            ),
        shape = sizes.containerShape.copy(
            bottomStart = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp)
        ),
        color = colors.containerColor,
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .windowInsetsPadding(contentWindowInsets)
                .graphicsLayer {
                    val progress = predictiveBackProgress.value
                    val predictiveBackScaleX = calculatePredictiveBackScaleX(progress)
                    val predictiveBackScaleY = calculatePredictiveBackScaleY(progress)

                    // Preserve the original aspect ratio and alignment of the child content.
                    scaleY = if (predictiveBackScaleY != 0f)
                        predictiveBackScaleX / predictiveBackScaleY
                    else 1f
                    transformOrigin = PredictiveBackChildTransformOrigin
                }
        ) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    val scope = remember(colors, sizes) {
                        ModalPageTopScopeWrapper(sizes, colors, onDismissRequest)
                    }
                    top?.let { scope.it() }
                },
            ) { paddingValues ->
                Column(
                    modifier = Modifier
                        .offset {
                            IntOffset(
                                0,
                                (modalHeight - pageState.requireOffset() - footerHeight).toInt()
                            )
                        }
                        .onGloballyPositioned {
                            footerHeight = it.size.height + bottomPadding
                        }
                ) {
                    content(paddingValues)
                    ActionRow(
                        modifier = Modifier.fillMaxWidth(),
                        paddingValues = PaddingValues(
                            PersianTheme.spacing.size12
                        ),
                        colors = colors,
                        sizes = sizes,
                        bottom = bottom
                    )
                }
            }
        }
    }
}

private fun GraphicsLayerScope.calculatePredictiveBackScaleX(progress: Float): Float {
    val width = size.width
    return if (width.isNaN() || width == 0f) {
        1f
    } else {
        1f - lerp(0f, min(PredictiveBackMaxScaleXDistance.toPx(), width), progress) / width
    }
}

private fun GraphicsLayerScope.calculatePredictiveBackScaleY(progress: Float): Float {
    val height = size.height
    return if (height.isNaN() || height == 0f) {
        1f
    } else {
        1f - lerp(0f, min(PredictiveBackMaxScaleYDistance.toPx(), height), progress) / height
    }
}

internal fun ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(
    sheetState: PageState,
    orientation: Orientation,
    onFling: (velocity: Float) -> Unit
): NestedScrollConnection =
    object : NestedScrollConnection {
        override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
            val delta = available.toFloat()
            return if (delta < 0 && source == NestedScrollSource.UserInput) {
                sheetState.anchoredDraggableState.dispatchRawDelta(delta).toOffset()
            } else {
                Offset.Zero
            }
        }

        override fun onPostScroll(
            consumed: Offset,
            available: Offset,
            source: NestedScrollSource
        ): Offset {
            return if (source == NestedScrollSource.UserInput) {
                sheetState.anchoredDraggableState.dispatchRawDelta(available.toFloat()).toOffset()
            } else {
                Offset.Zero
            }
        }

        override suspend fun onPreFling(available: Velocity): Velocity {
            val toFling = available.toFloat()
            val currentOffset = sheetState.requireOffset()
            val minAnchor = sheetState.anchoredDraggableState.anchors.minAnchor()
            return if (toFling < 0 && currentOffset > minAnchor) {
                onFling(toFling)
                // since we go to the anchor with tween settling, consume all for the best UX
                available
            } else {
                Velocity.Zero
            }
        }

        override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
            onFling(available.toFloat())
            return available
        }

        private fun Float.toOffset(): Offset =
            Offset(
                x = if (orientation == Orientation.Horizontal) this else 0f,
                y = if (orientation == Orientation.Vertical) this else 0f
            )

        @JvmName("velocityToFloat")
        private fun Velocity.toFloat() = if (orientation == Orientation.Horizontal) x else y

        @JvmName("offsetToFloat")
        private fun Offset.toFloat(): Float = if (orientation == Orientation.Horizontal) x else y
    }

private val PredictiveBackMaxScaleXDistance = 48.dp
private val PredictiveBackMaxScaleYDistance = 24.dp
private val PredictiveBackChildTransformOrigin = TransformOrigin(0.5f, 0f)