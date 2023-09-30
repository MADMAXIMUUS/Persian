package io.github.madmaximuus.persian.actionSheet

import android.view.Gravity
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.spacing
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

const val ANIMATION_TIME = 200L
const val DIALOG_BUILD_TIME = 20L

class AnimatedTransitionDialogHelper(
    private val coroutineScope: CoroutineScope,
    private val onDismissFlow: MutableSharedFlow<Any>
) {

    fun triggerAnimatedDismiss() {
        coroutineScope.launch {
            onDismissFlow.emit(Any())
        }
    }
}

@Composable
internal fun AnimatedSlideInTransition(
    visible: Boolean,
    screenHeight: Int,
    content: @Composable AnimatedVisibilityScope.() -> Unit
) {
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically(
            animationSpec = tween(ANIMATION_TIME.toInt(), easing = LinearEasing),
            initialOffsetY = {
                screenHeight + it
            }
        ) + fadeIn(animationSpec = tween(ANIMATION_TIME.toInt(), easing = LinearEasing)),
        exit = slideOutVertically(
            animationSpec = tween(ANIMATION_TIME.toInt(), easing = LinearEasing),
            targetOffsetY = {
                screenHeight + it
            }
        ) + fadeOut(animationSpec = tween(ANIMATION_TIME.toInt(), easing = LinearEasing)),
        content = content
    )
}

suspend fun startDismissWithExitAnimation(
    animateTrigger: MutableState<Boolean>,
    onDismissRequest: () -> Unit
) {
    animateTrigger.value = false
    delay(ANIMATION_TIME)
    onDismissRequest()
}

object PersianActionSheet {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        actions: List<ActionItem>,
        header: @Composable (PersianActionSheetHeader.() -> Unit)? = null,
        itemColors: ActionItemColors = PersianActionItemColors.primary(),
        onDismissRequest: () -> Unit
    ) {
        val onDismissSharedFlow: MutableSharedFlow<Any> = remember { MutableSharedFlow() }
        val coroutineScope: CoroutineScope = rememberCoroutineScope()
        val animateTrigger = remember { mutableStateOf(false) }

        val configuration = LocalConfiguration.current
        val screenHeight = with(LocalDensity.current) {
            configuration.screenHeightDp.dp.roundToPx()
        }

        LaunchedEffect(key1 = Unit) {
            launch {
                delay(DIALOG_BUILD_TIME)
                animateTrigger.value = true
            }
            launch {
                onDismissSharedFlow.asSharedFlow().collectLatest {
                    startDismissWithExitAnimation(animateTrigger, onDismissRequest)
                }
            }
        }

        Dialog(
            onDismissRequest = {
                coroutineScope.launch {
                    startDismissWithExitAnimation(animateTrigger, onDismissRequest)
                }
            },
            properties = DialogProperties(
                decorFitsSystemWindows = false,
                usePlatformDefaultWidth = false
            ),
            content = {
                val dialogWindowProvider = LocalView.current.parent as DialogWindowProvider
                dialogWindowProvider.window.setGravity(Gravity.BOTTOM)

                AnimatedSlideInTransition(visible = animateTrigger.value, screenHeight) {
                    Surface(
                        modifier = modifier
                            .padding(
                                start = MaterialTheme.spacing.large,
                                end = MaterialTheme.spacing.large,
                                bottom = MaterialTheme.spacing.extraSmall,
                                top = 0.dp
                            ),
                        shape = MaterialTheme.shapes.large,
                        tonalElevation = MaterialTheme.elevation.extraSmall,
                    ) {
                        Column(
                            Modifier
                                .fillMaxWidth()
                        ) {
                            if (header != null) {
                                PersianActionSheetHeader.header()
                            }
                            actions.forEach {
                                PersianActionItem.Primary(
                                    animatedTransitionDialogHelper = AnimatedTransitionDialogHelper(
                                        coroutineScope,
                                        onDismissSharedFlow
                                    ),
                                    itemColors = itemColors,
                                    actionItem = it,
                                )
                            }
                        }
                    }
                }
            }
        )
    }
}