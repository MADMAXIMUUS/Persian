package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
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
 * @param colors The [AlertColors] colors of container, title, message and actions of this alert.
 * @param sizes The [AlertSizes] sizes of container, title and subtitle and actions of this alert.
 * @param onDismissRequest Executes when the user tries to dismiss the action sheet.
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
    onDismissRequest: () -> Unit,
    content: (@Composable () -> Unit)? = null
) {
    val padding = PaddingValues(
        start = PersianTheme.spacing.size20,
        end = PersianTheme.spacing.size20,
        top = PersianTheme.spacing.size20,
        bottom = PersianTheme.spacing.size12
    )

    val actionPadding = PaddingValues(
        horizontal = PersianTheme.spacing.size16,
        vertical = PersianTheme.spacing.size12
    )

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        ),
        content = {
            Surface(
                shape = sizes.containerShape,
                modifier = modifier
                    .padding(horizontal = PersianTheme.spacing.size24)
                    .widthIn(min = 240.dp, max = 560.dp),
                color = colors.containerColor,
                tonalElevation = 0.dp,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            Column(
                                modifier = Modifier
                                    .padding(padding),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement
                                    .spacedBy(PersianTheme.spacing.size4),
                            ) {
                                Text(
                                    text = title,
                                    textAlign = TextAlign.Center,
                                    style = sizes.titleTextStyle,
                                    color = colors.titleColor
                                )
                                message?.let {
                                    Text(
                                        text = it,
                                        style = sizes.messageTextStyle,
                                        color = colors.messageColor,
                                        textAlign = TextAlign.Justify
                                    )
                                }
                            }
                            content?.invoke()
                            Row(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .padding(actionPadding),
                                horizontalArrangement = Arrangement.spacedBy(
                                    PersianTheme.spacing.size2,
                                    Alignment.End
                                ),
                                content = {
                                    val scope = remember(colors, sizes) {
                                        ActionScopeWrapper(
                                            scope = this,
                                            colors = colors.actionColor,
                                            sizes = sizes.actionSize
                                        )
                                    }
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