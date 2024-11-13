package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.dividers.HorizontalDivider
import io.github.madmaximuus.persian.dividers.HorizontalInsetSide
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

/**
 * Alert is a dialog that presents an important message or question to the user. This element requires immediate attention and provides options for the user to respond.
 * An alert is used in situations where a decision or acknowledgment is needed, but it does not need to be displayed permanently on the screen.
 *
 * @param modifier the [Modifier] to be applied to this alert.
 * @param title the text to be displayed as title in this alert.
 * @param message the text to be displayed as message in this alert.
 * @param confirmAction The confirm action in [ActionScope] of this alert.
 * @param dismissAction The optional dismiss action in [ActionScope] of this alert.
 * @param cancelAction The optional cancel action in [ActionScope] of this alert.
 * @param colors The [AlertColors] colors of container, title, message and actions of this alert.
 * @param sizes The [AlertSizes] sizes of container, title and subtitle and actions of this alert.
 * @param onDismiss Executes when the user tries to dismiss the action sheet.
 * @param content The optional content in this alert
 */
@Composable
fun Alert(
    modifier: Modifier = Modifier,
    colors: AlertColors = AlertsDefaults.colors(),
    sizes: AlertSizes = AlertsDefaults.alertSizes(),
    title: String,
    message: String? = null,
    confirmAction: @Composable ActionScope.() -> Unit,
    dismissAction: (@Composable ActionScope.() -> Unit)? = null,
    cancelAction: (@Composable ActionScope.() -> Unit)? = null,
    onDismiss: () -> Unit,
    content: (@Composable () -> Unit)? = null
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        ),
        content = {
            Surface(
                modifier = modifier
                    .widthIn(max = 500.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = PersianTheme.spacing.size20),
                shape = sizes.containerShape,
                color = colors.containerColor,
                tonalElevation = PersianTheme.elevation.elevation2,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = modifier
                            .wrapContentHeight()
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            val padding =
                                if (heightSizeClass == WindowHeightSizeClass.COMPACT) PaddingValues(
                                    start = PersianTheme.spacing.size24,
                                    end = PersianTheme.spacing.size24,
                                    top = PersianTheme.spacing.size12,
                                    bottom = PersianTheme.spacing.size6
                                ) else PaddingValues(
                                    start = PersianTheme.spacing.size24,
                                    end = PersianTheme.spacing.size24,
                                    top = PersianTheme.spacing.size24,
                                    bottom = PersianTheme.spacing.size12
                                )
                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .padding(padding),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement
                                    .spacedBy(PersianTheme.spacing.size16),
                            ) {
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = title,
                                    textAlign = TextAlign.Center,
                                    style = sizes.titleTextStyle,
                                    color = colors.titleColor
                                )
                            }
                            message?.let {
                                Text(
                                    modifier = Modifier
                                        .padding(horizontal = PersianTheme.spacing.size20),
                                    text = it,
                                    style = sizes.messageTextStyle,
                                    color = colors.messageColor,
                                    textAlign = TextAlign.Justify
                                )
                            }
                            content?.invoke()
                            if (content != null) {
                                HorizontalDivider(
                                    insetSide = HorizontalInsetSide.BOTH,
                                    strokeColor = colors.dividerColor,
                                    sizes = sizes.dividerSizes
                                )
                            }
                            val actionPadding =
                                if (
                                    widthSizeClass != WindowWidthSizeClass.COMPACT
                                    && heightSizeClass != WindowHeightSizeClass.COMPACT
                                )
                                    PaddingValues(PersianTheme.spacing.size16)
                                else if (heightSizeClass == WindowHeightSizeClass.COMPACT)
                                    PaddingValues(PersianTheme.spacing.size8)
                                else PaddingValues(
                                    horizontal = PersianTheme.spacing.size16,
                                    vertical = PersianTheme.spacing.size8
                                )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(actionPadding),
                                horizontalArrangement = Arrangement.spacedBy(
                                    PersianTheme.spacing.size8,
                                    Alignment.End
                                ),
                                content = {
                                    val scope = remember(colors) {
                                        ActionScopeWrapper(
                                            scope = this,
                                            color = colors.actionColor,
                                            sizes = sizes.actionSize
                                        )
                                    }
                                    cancelAction?.let { scope.it() }
                                    dismissAction?.let { scope.it() }
                                    scope.confirmAction()
                                }
                            )
                        }
                    )
                }
            )
        }
    )
}