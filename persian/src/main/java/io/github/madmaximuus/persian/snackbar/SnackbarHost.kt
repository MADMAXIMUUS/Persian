package io.github.madmaximuus.persian.snackbar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AccessibilityManager
import androidx.compose.ui.platform.LocalAccessibilityManager
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.fab.FabImpl
import io.github.madmaximuus.persian.navigationBar.NavigationBar
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.topAppBar.TopAppBar
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.delay
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.resume


/**
 * State of the [SnackbarHost], which controls the queue and the current [Snackbar] being shown
 * inside the [SnackbarHost].
 *
 * This state is usually [remember]ed and used to provide a [SnackbarHost] to a [Scaffold].
 */
@Stable
class SnackbarHostState {

    /**
     * Only one [Snackbar] can be shown at a time. Since a suspending Mutex is a fair queue, this
     * manages our message queue and we don't have to maintain one.
     */
    private val mutex = Mutex()

    /** The current [SnackbarData] being shown by the [SnackbarHost], or `null` if none. */
    var currentSnackbarData by mutableStateOf<SnackbarData?>(null)
        private set

    val animateTrigger = mutableStateOf(false)

    /**
     * Shows or queues to be shown a [Snackbar] at the bottom of the [Scaffold] to which this state
     * is attached and suspends until the snackbar has disappeared.
     *
     * [SnackbarHostState] guarantees to show at most one snackbar at a time. If this function is
     * called while another snackbar is already visible, it will be suspended until this snackbar is
     * shown and subsequently addressed. If the caller is cancelled, the snackbar will be removed
     * from display and/or the queue to be displayed.
     *
     * To change the Snackbar appearance, change it in 'snackbarHost' on the [Scaffold].
     *
     * @param message text to be shown in the Snackbar
     * @param duration duration to control how long snackbar will be shown in [SnackbarHost], either
     *   [SnackbarDuration.Short], [SnackbarDuration.Long] or [SnackbarDuration.Indefinite].
     * @return [SnackbarResult.ActionPerformed] if option action has been clicked or
     *   [SnackbarResult.Dismissed] if snackbar has been dismissed via timeout or by the user
     */
    suspend fun showSnackbar(
        message: String,
        snackbarPosition: SnackbarPosition = SnackbarPosition.Bottom,
        left: (@Composable SnackbarLeftScope.() -> Unit)? = null,
        right: (@Composable SnackbarRightScope.() -> Unit)? = null,
        hasProgress: Boolean = false,
        duration: SnackbarDuration = if (right == null) SnackbarDuration.Short
        else SnackbarDuration.Indefinite
    ): SnackbarResult {
        currentSnackbarData?.dismiss()
        return showSnackbar(
            SnackbarVisualsImpl(
                message = message,
                duration = duration,
                snackbarPosition = snackbarPosition,
                hasProgress = hasProgress,
                left = left,
                right = right
            )
        )
    }


    /**
     * Shows or queues to be shown a [Snackbar] at the bottom of the [Scaffold] to which this state
     * is attached and suspends until the snackbar has disappeared.
     *
     * [SnackbarHostState] guarantees to show at most one snackbar at a time. If this function is
     * called while another snackbar is already visible, it will be suspended until this snackbar is
     * shown and subsequently addressed. If the caller is cancelled, the snackbar will be removed
     * from display and/or the queue to be displayed.
     *
     * @param visuals [SnackbarVisuals] that are used to create a Snackbar
     * @return [SnackbarResult.ActionPerformed] if option action has been clicked or
     *   [SnackbarResult.Dismissed] if snackbar has been dismissed via timeout or by the user
     */
    suspend fun showSnackbar(visuals: SnackbarVisuals): SnackbarResult =
        mutex.withLock {
            try {
                currentSnackbarData?.dismiss()
                return suspendCancellableCoroutine { continuation ->
                    currentSnackbarData = SnackbarDataImpl(visuals, continuation)
                }
            } finally {
                currentSnackbarData = null
            }
        }

    private class SnackbarVisualsImpl(
        override val message: String,
        override val duration: SnackbarDuration,
        override val snackbarPosition: SnackbarPosition,
        override val hasProgress: Boolean,
        override val left: @Composable (SnackbarLeftScope.() -> Unit)?,
        override val right: @Composable (SnackbarRightScope.() -> Unit)?
    ) : SnackbarVisuals {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as SnackbarVisualsImpl

            if (message != other.message) return false
            if (left != other.left) return false
            if (snackbarPosition != other.snackbarPosition) return false
            if (hasProgress != other.hasProgress) return false
            if (right != other.right) return false
            if (duration != other.duration) return false

            return true
        }

        override fun hashCode(): Int {
            var result = message.hashCode()
            result = 31 * result + left.hashCode()
            result = 31 * result + snackbarPosition.hashCode()
            result = 31 * result + hasProgress.hashCode()
            result = 31 * result + right.hashCode()
            result = 31 * result + duration.hashCode()
            return result
        }
    }

    private class SnackbarDataImpl(
        override val visuals: SnackbarVisuals,
        private val continuation: CancellableContinuation<SnackbarResult>
    ) : SnackbarData {

        override fun performAction() {
            if (continuation.isActive) continuation.resume(SnackbarResult.ActionPerformed)
        }

        override fun dismiss() {
            if (continuation.isActive) continuation.resume(SnackbarResult.Dismissed)
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as SnackbarDataImpl

            if (visuals != other.visuals) return false
            if (continuation != other.continuation) return false

            return true
        }

        override fun hashCode(): Int {
            var result = visuals.hashCode()
            result = 31 * result + continuation.hashCode()
            return result
        }
    }
}

/**
 * Host for [Snackbar]s to be used in [Scaffold] to properly show, hide and dismiss items based on
 * Material specification and the [hostState].
 *
 * This component with default parameters comes build-in with [Scaffold], if you need to show a
 * default [Snackbar], use [SnackbarHostState.showSnackbar].
 *
 * @param hostState state of this component to read and show [Snackbar]s accordingly
 * @param snackbar the instance of the [Snackbar] to be shown at the appropriate time with
 *   appearance based on the [SnackbarData] provided as a param
 */
@Composable
fun SnackbarHost(
    hostState: SnackbarHostState,
    snackbar: @Composable (SnackbarData) -> Unit = { Snackbar(it) }
) {
    val currentSnackbarData = hostState.currentSnackbarData
    val accessibilityManager = LocalAccessibilityManager.current
    LaunchedEffect(currentSnackbarData) {
        hostState.animateTrigger.value = currentSnackbarData != null
        if (currentSnackbarData != null && !currentSnackbarData.visuals.hasProgress) {
            val duration =
                currentSnackbarData.visuals.duration.toMillis(
                    currentSnackbarData.visuals.right != null,
                    accessibilityManager
                )
            delay(duration)
            startDismissWithExitAnimation(
                hostState.animateTrigger,
                currentSnackbarData
            )
        }
    }
    val configuration = LocalConfiguration.current
    val screenHeight = with(LocalDensity.current) {
        configuration.screenHeightDp.dp.roundToPx()
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = if (currentSnackbarData?.visuals?.snackbarPosition == SnackbarPosition.Top)
            Alignment.TopCenter
        else
            Alignment.BottomCenter
    ) {
        AnimatedVisibility(
            visible = hostState.animateTrigger.value,
            enter = slideInVertically(
                initialOffsetY = {
                    when (currentSnackbarData?.visuals?.snackbarPosition) {
                        SnackbarPosition.Bottom -> screenHeight + it

                        SnackbarPosition.Top -> -it

                        else -> screenHeight + it
                    }
                }
            ),
            exit = slideOutVertically(
                targetOffsetY = {
                    when (currentSnackbarData?.visuals?.snackbarPosition) {
                        SnackbarPosition.Bottom -> screenHeight + it

                        SnackbarPosition.Top -> -it

                        else -> screenHeight + it
                    }
                }
            ),
            content = {
                currentSnackbarData?.let { snackbar(it) }
            }
        )
    }
}

/**
 * Interface to represent the visuals of one particular [Snackbar] as a piece of the [SnackbarData].
 *
 * @property message text to be shown in the Snackbar
 * @property duration duration of the Snackbar
 * @property left
 */
@Stable
interface SnackbarVisuals {
    val message: String
    val duration: SnackbarDuration
    val snackbarPosition: SnackbarPosition
    val hasProgress: Boolean
    val left: (@Composable SnackbarLeftScope.() -> Unit)?
    val right: (@Composable SnackbarRightScope.() -> Unit)?
}

/**
 * Interface to represent the data of one particular [Snackbar] as a piece of the
 * [SnackbarHostState].
 *
 * @property visuals Holds the visual representation for a particular [Snackbar].
 */
@Stable
interface SnackbarData {
    val visuals: SnackbarVisuals

    /** Function to be called when Snackbar action has been performed to notify the listeners. */
    fun performAction()

    /** Function to be called when Snackbar is dismissed either by timeout or by the user. */
    fun dismiss()
}

/** Possible results of the [SnackbarHostState.showSnackbar] call */
enum class SnackbarResult {
    /** [Snackbar] that is shown has been dismissed either by timeout of by user */
    Dismissed,

    /** Action on the [Snackbar] has been clicked before the time out passed */
    ActionPerformed,
}

/** Possible durations of the [Snackbar] in [SnackbarHost] */
enum class SnackbarDuration {
    /** Show the Snackbar for a short period of time */
    Short,

    /** Show the Snackbar for a long period of time */
    Long,

    /** Show the Snackbar indefinitely until explicitly dismissed or action is clicked */
    Indefinite
}

internal fun SnackbarDuration.toMillis(
    hasAction: Boolean,
    accessibilityManager: AccessibilityManager?
): Long {
    val original =
        when (this) {
            SnackbarDuration.Indefinite -> Long.MAX_VALUE
            SnackbarDuration.Long -> 10000L
            SnackbarDuration.Short -> 4000L
        }
    if (accessibilityManager == null) {
        return original
    }
    return accessibilityManager.calculateRecommendedTimeoutMillis(
        original,
        containsIcons = true,
        containsText = true,
        containsControls = hasAction
    )
}

private suspend fun startDismissWithExitAnimation(
    animateTrigger: MutableState<Boolean>,
    data: SnackbarData,
) {
    animateTrigger.value = false
    delay(ANIMATION_COMPACT_TIME)
    data.dismiss()
}

private const val ANIMATION_COMPACT_TIME = 300L

/**
 * The possible positions for a [Snackbar] attached to a [Scaffold].
 */
@JvmInline
value class SnackbarPosition internal constructor(@Suppress("unused") private val value: Int) {
    companion object {
        /**
         * Position Snackbar at the top of the screen, under the [TopAppBar] (if it exists)
         */
        val Top = SnackbarPosition(0)

        /**
         * Position Snackbar at the bottom of the screen, above the [NavigationBar] (if it
         * exists) or [FabImpl] (if it exists)
         */
        val Bottom = SnackbarPosition(1)
    }

    override fun toString(): String {
        return when (this) {
            Top -> "SnackbarPosition.Top"
            Bottom -> "SnackbarPosition.Bottom"
            else -> "SnackbarPosition.Bottom"
        }
    }
}
