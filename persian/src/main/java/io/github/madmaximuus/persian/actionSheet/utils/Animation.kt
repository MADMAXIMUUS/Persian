package io.github.madmaximuus.persian.actionSheet.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import io.github.madmaximuus.persian.actionSheet.ActionSheet
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

private const val ANIMATION_COMPACT_TIME = 300L

/**
 * Helper class for [ActionSheet] for launch onDismissFlow
 *
 * @param coroutineScope Coroutine scope for launch onDismissFlow
 * @param onDismissFlow Flow for launch onDismiss with animation
 */
class AnimatedTransitionDialogHelper(
    private val coroutineScope: CoroutineScope,
    private val onDismissFlow: MutableSharedFlow<Any>
) {

    /**
     * Function that called when action was clicked
     */
    internal fun triggerAnimatedDismiss() {
        coroutineScope.launch {
            onDismissFlow.emit(Any())
        }
    }
}

/**
 * Animation for appear/disappear [ActionSheet] on the screen
 *
 * @param visible Trigger appear/disappear animation
 * @param screenHeight Screen height for calculation [ActionSheet] position
 * @param content Content of [ActionSheet]
 */
@Composable
internal fun AnimatedSlideInTransition(
    visible: Boolean,
    screenHeight: Int,
    content: @Composable AnimatedVisibilityScope.() -> Unit
) {
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically(
            initialOffsetY = { screenHeight + it }
        ) + fadeIn(),
        exit = slideOutVertically(
            targetOffsetY = { screenHeight + it }
        ) + fadeOut(),
        content = content
    )
}

/**
 * Helper function for animated appear/disappear on the screen
 *
 * @param animateTrigger Trigger for launch animation
 * @param onDismissRequest request launched when [ActionSheet] disappeared from screen
 */
internal suspend fun startDismissWithExitAnimation(
    animateTrigger: MutableState<Boolean>,
    onDismissRequest: () -> Unit,
) {
    animateTrigger.value = false
    delay(ANIMATION_COMPACT_TIME)
    onDismissRequest()
}