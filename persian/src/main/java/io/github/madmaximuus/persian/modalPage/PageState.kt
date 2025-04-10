package io.github.madmaximuus.persian.modalPage

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.internal.AnchoredDraggableState
import io.github.madmaximuus.persian.internal.animateTo
import io.github.madmaximuus.persian.internal.snapTo
import io.github.madmaximuus.persian.modalPage.PageState.Companion.Saver
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import kotlinx.coroutines.CancellationException

/**
 * State of a sheet composable, such as [ModalPage]
 *
 * Contains states relating to its swipe position as well as animations between state values.
 *
 * @param initialValue The initial value of the state.
 * @param density The density that this state can use to convert values to and from dp.
 * @param dragAnchors The set of drag anchors for the modal page.
 * @param confirmValueChange Optional callback invoked to confirm or veto a pending state change.
 */
@Stable
class PageState(
    density: Density,
    initialValue: DragAnchor = DragAnchor.Hidden,
    dragAnchors: Set<DragAnchor>,
    confirmValueChange: (DragAnchor) -> Boolean = { true },
) {

    val dragAnchors = dragAnchors.sorted().toSet()

    /**
     * The current value of the state.
     *
     * If no swipe or animation is in progress, this corresponds to the state the bottom sheet is
     * currently in. If a swipe or an animation is in progress, this corresponds the state the sheet
     * was in before the swipe or animation started.
     */
    val currentValue: DragAnchor
        get() = anchoredDraggableState.currentValue

    /**
     * The target value of the bottom sheet state.
     *
     * If a swipe is in progress, this is the value that the sheet would animate to if the swipe
     * finishes. If an animation is running, this is the target value of that animation. Finally, if
     * no swipe or animation is in progress, this is the same as the [currentValue].
     */
    val targetValue: DragAnchor
        get() = anchoredDraggableState.targetValue

    /** Whether the modal bottom sheet is visible. */
    val isVisible: Boolean
        get() = anchoredDraggableState.currentValue != DragAnchor.Hidden

    /**
     * Require the current offset (in pixels) of the bottom sheet.
     *
     * The offset will be initialized during the first measurement phase of the provided sheet
     * content.
     *
     * These are the phases: Composition { -> Effects } -> Layout { Measurement -> Placement } ->
     * Drawing
     *
     * During the first composition, an [IllegalStateException] is thrown. In subsequent
     * compositions, the offset will be derived from the anchors of the previous pass. Always prefer
     * accessing the offset from a LaunchedEffect as it will be scheduled to be executed the next
     * frame, after layout.
     *
     * @throws IllegalStateException If the offset has not been initialized yet
     */
    fun requireOffset(): Float = anchoredDraggableState.requireOffset()

    suspend fun show() {
        val targetValue: DragAnchor = dragAnchors.first()
        animateTo(targetValue)
    }

    /**
     * Hide the bottom sheet with animation and suspend until it is fully hidden or animation has
     * been cancelled.
     *
     * @throws [CancellationException] if the animation is interrupted
     */
    suspend fun hide() {
        animateTo(DragAnchor.Hidden)
    }

    /**
     * Animate to a [targetValue]. If the [targetValue] is not in the set of anchors, the
     * [currentValue] will be updated to the [targetValue] without updating the offset.
     *
     * @param targetValue The target value of the animation
     * @throws CancellationException if the interaction interrupted by another interaction like a
     *   gesture interaction or another programmatic interaction like a [animateTo] or [snapTo]
     *   call.
     */
    private suspend fun animateTo(
        targetValue: DragAnchor,
        velocity: Float = anchoredDraggableState.lastVelocity
    ) {
        anchoredDraggableState.animateTo(targetValue, velocity)
    }

    /**
     * Snap to a [targetValue] without any animation.
     *
     * @param targetValue The target value of the animation
     * @throws CancellationException if the interaction interrupted by another interaction like a
     *   gesture interaction or another programmatic interaction like a [animateTo] or [snapTo]
     *   call.
     */
    private suspend fun snapTo(targetValue: DragAnchor) {
        anchoredDraggableState.snapTo(targetValue)
    }

    /**
     * Find the closest anchor taking into account the velocity and settle at it with an animation.
     */
    internal suspend fun settle(velocity: Float) {
        anchoredDraggableState.settle(velocity)
    }

    internal var anchoredDraggableState =
        AnchoredDraggableState(
            initialValue = initialValue,
            animationSpec = BottomSheetAnimationSpec,
            confirmValueChange = confirmValueChange,
            positionalThreshold = { with(density) { 56.dp.toPx() } },
            velocityThreshold = { with(density) { 125.dp.toPx() } },
        )

    internal val offset: Float
        get() = anchoredDraggableState.offset

    companion object {
        /** The default [Saver] implementation for [PageState]. */
        fun Saver(
            confirmValueChange: (DragAnchor) -> Boolean,
            density: Density,
            dragAnchors: Set<DragAnchor>,
        ) = Saver<PageState, DragAnchor>(
            save = { it.currentValue },
            restore = { savedValue ->
                PageState(
                    density,
                    savedValue,
                    dragAnchors,
                    confirmValueChange
                )
            }
        )
    }
}

/** The default animation spec used by [PageState]. */
private val BottomSheetAnimationSpec: AnimationSpec<Float> =
    tween(durationMillis = 300, easing = FastOutSlowInEasing)


@Composable
internal fun rememberPageState(
    skipPartiallyExpanded: Boolean = false,
    confirmValueChange: (DragAnchor) -> Boolean = { true },
    dragAnchors: Set<DragAnchor>,
    initialValue: DragAnchor = DragAnchor.Hidden,
    skipHiddenState: Boolean = false,
): PageState {
    val density = LocalDensity.current
    return rememberSaveable(
        skipPartiallyExpanded,
        confirmValueChange,
        dragAnchors,
        skipHiddenState,
        saver = PageState.Saver(
            confirmValueChange = confirmValueChange,
            dragAnchors = dragAnchors,
            density = density,
        )
    ) {
        PageState(
            density,
            initialValue,
            dragAnchors,
            confirmValueChange,
        )
    }
}

/**
 * Create and [remember] a [PageState] for [ModalPage].
 *
 * @param confirmValueChange Optional callback invoked to confirm or veto a pending state change.
 */
@Composable
fun rememberPageState(
    dragAnchors: Set<DragAnchor> = ModalPageDefaults.defaultDraggableAnchors,
    confirmValueChange: (DragAnchor) -> Boolean = { true },
) = rememberPageState(
    dragAnchors = dragAnchors,
    confirmValueChange = confirmValueChange,
    initialValue = DragAnchor.Hidden,
)