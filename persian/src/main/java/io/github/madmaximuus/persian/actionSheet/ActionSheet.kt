package io.github.madmaximuus.persian.actionSheet

import android.app.Activity
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.actionSheet.utils.ActionSheetPopup
import io.github.madmaximuus.persian.actionSheet.utils.ActionSheetProperties
import io.github.madmaximuus.persian.actionSheet.utils.AnimatedSlideInTransition
import io.github.madmaximuus.persian.actionSheet.utils.AnimatedTransitionDialogHelper
import io.github.madmaximuus.persian.actionSheet.utils.startDismissWithExitAnimation
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Action sheet is an element that presents a contextual menu displayed at the bottom of the screen.
 * This element provides the user with several options related to the current context.
 * Action sheet is used in cases where an action selection is required, but there is no need
 * to display these [actions] permanently on the screen.
 *
 * @param onDismissRequest Executes when the user tries to dismiss the action sheet.
 * @param colors The colors of container and content.
 * @param sizes The sizes of container and content.
 * @param title The title of this action sheet.
 * @param message The message of this action sheet
 * @param actions The actions in [ActionSheetItemScope] of this action sheet.
 */
@Composable
fun ActionSheet(
    onDismissRequest: () -> Unit,
    colors: ActionSheetColors = ActionSheetDefaults.colors(),
    sizes: ActionSheetSizes = ActionSheetDefaults.sizes(),
    title: String? = null,
    message: String? = null,
    actions: @Composable ActionSheetItemScope.() -> Unit
) {
    val onDismissSharedFlow: MutableSharedFlow<Any> = remember { MutableSharedFlow() }
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    val animateTrigger = remember { mutableStateOf(false) }

    val configuration = LocalConfiguration.current
    val screenHeight = with(LocalDensity.current) {
        configuration.screenHeightDp.dp.roundToPx()
    }

    val windowWidthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass

    val maxWidth = if (windowWidthSizeClass == WindowWidthSizeClass.COMPACT) Dp.Unspecified
    else 500.dp

    val helper = AnimatedTransitionDialogHelper(
        coroutineScope,
        onDismissSharedFlow
    )

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
                Scrim(
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
                            .widthIn(max = maxWidth)
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
                            if (title != null || message != null) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(horizontal = PersianTheme.spacing.size24)
                                        .padding(
                                            top = PersianTheme.spacing.size24,
                                            bottom = PersianTheme.spacing.size12
                                        ),
                                    verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
                                ) {
                                    title?.let {
                                        Text(
                                            modifier = Modifier.fillMaxWidth(),
                                            text = it,
                                            textAlign = TextAlign.Center,
                                            style = sizes.titleTextStyle,
                                            color = colors.titleColor
                                        )
                                    }
                                    message?.let {
                                        Text(
                                            modifier = Modifier.fillMaxWidth(),
                                            text = it,
                                            textAlign = TextAlign.Center,
                                            style = sizes.messageTextStyle,
                                            color = colors.subtitleColor
                                        )
                                    }
                                }
                            }
                            Column(
                                Modifier
                                    .fillMaxWidth()
                                    .verticalScroll(rememberScrollState())
                            ) {
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

/**
 * Provides a scrim background to visually separate the action sheet from the content on the screen
 *
 * @param showScrim A boolean indicating whether the scrim should be shown.
 * @param onClick A callback function to be invoked when the scrim is clicked.
 */
@Composable
private fun Scrim(
    showScrim: Boolean,
    onClick: () -> Unit,
) {
    val activity = LocalContext.current as Activity
    val isDarkTheme = isSystemInDarkTheme()
    val view = LocalView.current

    val scrimAlpha by animateFloatAsState(
        label = "Scrim animation",
        targetValue = if (showScrim) PersianState38 else 0f
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