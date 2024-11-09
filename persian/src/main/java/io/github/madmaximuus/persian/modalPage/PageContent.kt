package io.github.madmaximuus.persian.modalPage

import android.util.Log
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
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
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.internal.DraggableAnchors
import io.github.madmaximuus.persian.internal.draggableAnchors
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.surface.Surface
import kotlin.math.max

/**
 * An internal composable function that creates a scrim (overlay) for a modal page.
 *
 * This function animates the alpha value of the scrim based on the page state's offset and visibility.
 * The scrim can be dismissed by tapping on it, invoking the [onDismissRequest] callback.
 *
 * @param color The color of the scrim.
 * @param onDismissRequest A callback to be invoked when the scrim is dismissed.
 * @param pageState The state of the modal page, including the offset.
 * @param visible A boolean indicating whether the scrim is visible.
 */
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

/**
 * An internal composable function that creates the content for a modal bottom sheet.
 *
 * This function handles the layout and behavior of the modal bottom sheet, including dragging,
 * dismissing, and animating the content. It uses the provided [PageState] to manage the state of the sheet.
 *
 * @param predictiveBackProgress An [Animatable] that represents the progress of the predictive back animation.
 * @param settleToDismiss A function that handles the settling of the sheet when it is dismissed.
 * @param onDismissRequest A callback to be invoked when the modal sheet is dismissed.
 * @param modifier The modifier to be applied to the modal sheet.
 * @param pageState The state of the modal page, including drag anchors and visibility.
 * @param colors The colors to be used for the modal page.
 * @param sizes The sizes to be used for the modal page.
 * @param top An optional composable function that defines the content for the top section of the modal page.
 * @param bottom An optional composable function that defines the content for the bottom section of the modal page.
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
@Composable
internal fun BoxScope.ModalBottomSheetContent(
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
    var modalHeight by remember { mutableFloatStateOf(0f) }
    var footerHeight by remember { mutableIntStateOf(0) }
    var headerHeight by remember { mutableIntStateOf(0) }
    Surface(
        modifier = modifier
            .statusBarsPadding()
            .padding(top = PersianTheme.spacing.size8)
            .fillMaxWidth()
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
                modalHeight = fullHeight
                val newAnchors = DraggableAnchors {
                    DragAnchor.Hidden at fullHeight
                    dragAnchor.forEach {
                        it at when (it) {
                            DragAnchor.Full -> max(0f, fullHeight - sheetSize.height)

                            is DragAnchor.Fraction ->
                                fullHeight - fullHeight * (it.value.coerceIn(0.1f, 1f))

                            DragAnchor.Half -> fullHeight / 2f

                            else -> fullHeight
                        }
                    }
                }
                val newTarget =
                    when (val value = pageState.anchoredDraggableState.targetValue) {
                        DragAnchor.Full ->
                            if (newAnchors.hasAnchorFor(DragAnchor.Full))
                                DragAnchor.Full
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
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    bottom = with(LocalDensity.current) {
                        Log.e(
                            "ANCHOR padding",
                            (modalHeight - (modalHeight - pageState.offset)).toString()
                        )
                        Log.e(
                            "ANCHOR height",
                            modalHeight.toString()
                        )
                        (modalHeight - (modalHeight - pageState.offset))
                            .coerceIn(0f, modalHeight - footerHeight - headerHeight)
                            .toDp()
                    }
                ),
            topBar = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onGloballyPositioned {
                            headerHeight = it.size.height
                        }
                ) {
                    val scope = remember(colors, sizes) {
                        ModalPageTopScopeWrapper(sizes, colors, onDismissRequest)
                    }
                    top?.let { scope.it() }
                }
            },
            bottomBar = {
                ActionRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .onGloballyPositioned {
                            footerHeight = it.size.height
                        },
                    paddingValues = PaddingValues(
                        PersianTheme.spacing.size12
                    ),
                    colors = colors,
                    sizes = sizes,
                    bottom = bottom
                )
            },
            contentWindowInsets = contentWindowInsets
        ) { paddingValues ->
            content(paddingValues)
        }
    }
}

/**
 * Creates a [NestedScrollConnection] that consumes swipe gestures within the bounds of a bottom sheet.
 *
 * This connection handles pre-scroll, post-scroll, pre-fling, and post-fling events to manage the dragging
 * and flinging behavior of the bottom sheet. It uses the provided [PageState] to manage the state of the sheet.
 *
 * @param sheetState The state of the modal page, including drag anchors and visibility.
 * @param orientation The orientation of the scroll, either [Orientation.Horizontal] or [Orientation.Vertical].
 * @param onFling A function that handles the fling gesture, receiving the velocity as a parameter.
 */
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