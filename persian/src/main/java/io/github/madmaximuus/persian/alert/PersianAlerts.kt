package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.dividers.PersianInsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox

@Composable
fun PersianOnlyActionAlert(
    modifier: Modifier = Modifier,
    colors: AlertsColors = PersianAlertsDefaults.colors(),
    actions: List<AlertAction>,
    onDismiss: () -> Unit
) {
    validateOnlyActionItems(actions)
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        ),
        content = {
            Surface(
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = MaterialTheme.spacing.extraExtraLarge),
                shape = MaterialTheme.shapes.extraLarge,
                color = colors.backgroundColor,
                tonalElevation = MaterialTheme.elevation.small,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(MaterialTheme.spacing.large)
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            actions.forEach { action ->
                                PersianTertiaryButton(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = action.title,
                                    colors = colors.actionColor,
                                    onClick = action.onClick,
                                    sizes = PersianButtonDefaults.largeSizes()
                                )
                            }
                        }
                    )
                }
            )
        }
    )
}

@Composable
fun PersianAlert(
    modifier: Modifier = Modifier,
    colors: AlertsColors = PersianAlertsDefaults.colors(),
    title: String,
    description: String? = null,
    icon: Painter? = null,
    actions: List<AlertAction>,
    onDismiss: () -> Unit,
    content: (@Composable () -> Unit)? = null
) {
    validateActionItems(actions)
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        ),
        content = {
            Surface(
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = MaterialTheme.spacing.extraExtraLarge),
                shape = MaterialTheme.shapes.extraLarge,
                color = colors.backgroundColor,
                tonalElevation = MaterialTheme.elevation.small,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = modifier
                            .wrapContentHeight()
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        content = {
                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .padding(
                                        start = MaterialTheme.spacing.extraLarge,
                                        end = MaterialTheme.spacing.extraLarge,
                                        top = MaterialTheme.spacing.extraExtraLarge,
                                        bottom = MaterialTheme.spacing.medium
                                    ),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement
                                    .spacedBy(MaterialTheme.spacing.large),
                            ) {
                                icon?.let {
                                    PersianIconBox(icon = it)
                                }
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = title,
                                    textAlign = TextAlign.Center,
                                    style = MaterialTheme.typography.headlineSmall,
                                    color = colors.titleColor
                                )
                            }
                            description?.let {
                                Text(
                                    modifier = Modifier
                                        .padding(horizontal = MaterialTheme.spacing.extraLarge),
                                    text = it,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = colors.descriptionColor,
                                    textAlign = TextAlign.Justify
                                )
                            }
                            content?.invoke()
                            if (content != null) {
                                PersianInsetHorizontalDivider(strokeColor = colors.dividerColor)
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(MaterialTheme.spacing.large),
                                horizontalArrangement = Arrangement.spacedBy(
                                    MaterialTheme.spacing.small,
                                    Alignment.End
                                ),
                                content = {
                                    actions.reversed().forEach { action ->
                                        PersianTertiaryButton(
                                            text = action.title,
                                            colors = colors.actionColor,
                                            onClick = action.onClick,
                                            sizes = PersianButtonDefaults.smallSizes()
                                        )
                                    }
                                }
                            )
                        }
                    )
                }
            )
        }
    )
}

private fun validateActionItems(actions: List<AlertAction>) {
    if (actions.size > 3)
        throw IllegalArgumentException("There should be no more than 3 actions")
    else if (actions.isEmpty())
        throw IllegalArgumentException("Actions must have at least 1 item")
}

private fun validateOnlyActionItems(actions: List<AlertAction>) {
    if (actions.size < 2)
        throw IllegalArgumentException("Actions must have at least 2 items")
}

data class AlertAction(
    val title: String,
    val onClick: () -> Unit
)