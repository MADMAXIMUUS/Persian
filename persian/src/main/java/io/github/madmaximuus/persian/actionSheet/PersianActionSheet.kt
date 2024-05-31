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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.foundation.spacing
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

private const val ANIMATION_COMPACT_TIME = 220L
private const val ANIMATION_MEDIUM_TIME = 365L
private const val DIALOG_BUILD_TIME = 80L

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
private fun AnimatedSlideInTransition(
    visible: Boolean,
    screenHeight: Int,
    windowWidthSizeClass: WindowWidthSizeClass,
    content: @Composable AnimatedVisibilityScope.() -> Unit
) {
    val animationTime =
        if (windowWidthSizeClass == WindowWidthSizeClass.COMPACT) ANIMATION_COMPACT_TIME
        else ANIMATION_MEDIUM_TIME
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically(
            animationSpec = tween(animationTime.toInt(), easing = LinearEasing),
            initialOffsetY = {
                screenHeight + it
            }
        ) + fadeIn(animationSpec = tween(animationTime.toInt(), easing = LinearEasing)),
        exit = slideOutVertically(
            animationSpec = tween(animationTime.toInt(), easing = LinearEasing),
            targetOffsetY = {
                screenHeight + it
            }
        ) + fadeOut(animationSpec = tween(animationTime.toInt(), easing = LinearEasing)),
        content = content
    )
}

private suspend fun startDismissWithExitAnimation(
    animateTrigger: MutableState<Boolean>,
    onDismissRequest: () -> Unit,
    windowWidthSizeClass: WindowWidthSizeClass,
) {

    animateTrigger.value = false
    if (windowWidthSizeClass == WindowWidthSizeClass.COMPACT)
        delay(ANIMATION_COMPACT_TIME)
    else
        delay(ANIMATION_MEDIUM_TIME)
    onDismissRequest()
}

/**
 * Action sheet is an element that presents a contextual menu displayed at the bottom of the screen. This element provides the user with several [ActionSheetItem] options related to the current context. Action sheet is used in cases where an action selection is required, but there is no need to display these [actions] permanently on the screen.
 * @param modifier The [Modifier] to be applied to the component
 * @param actions The [ActionSheetItem] actions of your action sheet.
 * [ActionSheetItem] define the look and the event associated to an item in the action sheet.
 * @param title The title of your action sheet.
 * @param subtitle The subtitle of your action sheet.
 * @param shape The shape of container
 * @param colors The [ActionSheetColors] colors of container, title and subtitle of action sheet.
 * @param itemColors The [ActionSheetItemColors] colors of the content of items in enabled, negative and disabled state.
 * @param onDismissRequest Executes when the user tries to dismiss the action sheet.
 */
@Composable
fun PersianActionSheet(
    modifier: Modifier = Modifier,
    actions: List<ActionSheetItem>,
    title: String? = null,
    subtitle: String? = null,
    shape: Shape = PersianActionSheetDefaults.shape,
    colors: ActionSheetColors = PersianActionSheetDefaults.colors(),
    itemColors: ActionSheetItemColors = PersianActionSheetDefaults.itemColors(),
    onDismissRequest: () -> Unit
) {
    val windowWidthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    require(actions.size > 2) {
        throw IllegalArgumentException("Actions must have at least 2 items")
    }

    require(actions.size <= 10) {
        IllegalArgumentException("There should be no more than 10 actions")
    }

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
                startDismissWithExitAnimation(
                    animateTrigger,
                    onDismissRequest,
                    windowWidthSizeClass
                )
            }
        }
    }

    Dialog(
        onDismissRequest = {
            coroutineScope.launch {
                startDismissWithExitAnimation(
                    animateTrigger,
                    onDismissRequest,
                    windowWidthSizeClass
                )
            }
        },
        properties = DialogProperties(
            decorFitsSystemWindows = false,
            usePlatformDefaultWidth = false
        ),
        content = {
            val dialogWindowProvider = LocalView.current.parent as DialogWindowProvider
            dialogWindowProvider.window.apply {
                setGravity(Gravity.BOTTOM)
                setWindowAnimations(-1)
            }

            AnimatedSlideInTransition(visible = animateTrigger.value, screenHeight, windowWidthSizeClass) {
                Surface(
                    modifier = modifier
                        .widthIn(max = 460.dp)
                        .padding(
                            horizontal = MaterialTheme.spacing.size16,
                            vertical = MaterialTheme.spacing.size8,
                        ),
                    shape = shape,
                    color = colors.containerColor
                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                    ) {
                        if (title != null || subtitle != null) {
                            PersianActionSheetHeader(
                                title = title,
                                subtitle = subtitle,
                                colors = colors
                            )
                        }
                        actions.forEach {
                            PersianActionSheetItem(
                                animatedTransitionDialogHelper = AnimatedTransitionDialogHelper(
                                    coroutineScope,
                                    onDismissSharedFlow
                                ),
                                itemColors = itemColors,
                                actionSheetItem = it,
                            )
                        }
                    }
                }
            }
        }
    )
}