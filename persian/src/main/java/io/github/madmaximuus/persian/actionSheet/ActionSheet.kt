package io.github.madmaximuus.persian.actionSheet

import android.app.Activity
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import io.github.madmaximuus.persian.actionSheet.utils.ActionSheetPopup
import io.github.madmaximuus.persian.actionSheet.utils.ActionSheetProperties
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
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
 * @param visible Trigger for launch animation
 * @param screenHeight Screen height for calculation [ActionSheet] position
 * @param content Content of [ActionSheet]
 */
@Composable
private fun AnimatedSlideInTransition(
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
private suspend fun startDismissWithExitAnimation(
    animateTrigger: MutableState<Boolean>,
    onDismissRequest: () -> Unit,
) {
    animateTrigger.value = false
    delay(ANIMATION_COMPACT_TIME)
    onDismissRequest()
}

/**
 * Action sheet is an element that presents a contextual menu displayed at the bottom of the screen.
 * This element provides the user with several options related to the current context.
 * Action sheet is used in cases where an action selection is required, but there is no need to display these [actions] permanently on the screen.
 *
 * @param actions The actions in [ActionSheetItemScope] of this action sheet.
 * @param header The title and subtitle in [ActionSheetHeaderScope] of this action sheet.
 * @param colors The [ActionSheetColors] colors of container, title and subtitle and [ActionSheetItemColors] of this action sheet.
 * @param sizes The [ActionSheetSizes] colors of container, title and subtitle and [ActionSheetItemSizes] of this action sheet.
 * @param onDismissRequest Executes when the user tries to dismiss the action sheet.
 */
@Composable
fun ActionSheet(
    onDismissRequest: () -> Unit,
    colors: ActionSheetColors = ActionSheetDefaults.colors(),
    sizes: ActionSheetSizes = ActionSheetDefaults.sizes(),
    header: (@Composable ActionSheetHeaderScope.() -> Unit)? = null,
    actions: @Composable ActionSheetItemScope.() -> Unit
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
            animateTrigger.value = true
        }
        launch {
            onDismissSharedFlow.asSharedFlow().collectLatest {
                startDismissWithExitAnimation(
                    animateTrigger,
                    onDismissRequest,
                )
            }
        }
    }
    ActionSheetPopup(
        onDismissRequest = {
            coroutineScope.launch {
                startDismissWithExitAnimation(
                    animateTrigger,
                    onDismissRequest,
                )
            }
        },
        properties = ActionSheetProperties(
            isFocusable = true,
            shouldDismissOnBackPress = true
        ),
        windowInsets = WindowInsets(0, 0, 0, 0),
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.BottomCenter,
            ) {
                ScrimBackground(
                    showScrim = animateTrigger.value,
                    onClick = {
                        coroutineScope.launch {
                            startDismissWithExitAnimation(
                                animateTrigger,
                                onDismissRequest
                            )
                        }
                    }
                )
                AnimatedSlideInTransition(
                    visible = animateTrigger.value,
                    screenHeight
                ) {
                    Surface(
                        modifier = Modifier
                            .widthIn(max = 460.dp)
                            .systemBarsPadding()
                            .padding(
                                horizontal = PersianTheme.spacing.size8,
                                vertical = PersianTheme.spacing.size8,
                            ),
                        shape = sizes.containerShape,
                        color = colors.containerColor
                    ) {
                        Column(
                            Modifier
                                .fillMaxWidth()
                        ) {
                            val headerScope = remember(colors, sizes) {
                                ActionSheetHeaderScopeWrapper(
                                    this,
                                    colors = colors,
                                    sizes = sizes
                                )
                            }
                            header?.let { headerScope.it() }
                            Column(
                                Modifier
                                    .fillMaxWidth()
                                    .verticalScroll(rememberScrollState())
                            ) {
                                val helper = AnimatedTransitionDialogHelper(
                                    coroutineScope,
                                    onDismissSharedFlow
                                )
                                val scope = remember(helper, colors, sizes) {
                                    ActionSheetItemScopeWrapper(
                                        scope = this,
                                        animatedTransitionDialogHelper = helper,
                                        colors = colors.itemColors,
                                        sizes = sizes.itemSizes
                                    )
                                }
                                scope.actions()
                            }
                        }
                    }
                }
            }
        }
    )
}

@Composable
private fun ScrimBackground(
    showScrim: Boolean,
    onClick: () -> Unit,
) {
    val activity = LocalContext.current as Activity
    val isDarkTheme = isSystemInDarkTheme()
    val view = LocalView.current

    val scrimAlpha by animateFloatAsState(
        label = "Scrim animation",
        targetValue = if (showScrim) 0.38f else 0f
    )

    if (!isDarkTheme) {
        WindowCompat
            .getInsetsController(activity.window, view)
            .isAppearanceLightStatusBars = !showScrim

        WindowCompat
            .getInsetsController(activity.window, view)
            .isAppearanceLightNavigationBars = !showScrim
    }

    val color = PersianTheme.colorScheme.scrim
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) { detectTapGestures { onClick() } }
    ) {
        drawRect(
            color = color,
            alpha = scrimAlpha
        )
    }
}