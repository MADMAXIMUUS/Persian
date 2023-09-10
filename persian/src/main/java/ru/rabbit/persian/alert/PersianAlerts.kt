package ru.rabbit.persian.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
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
import ru.rabbit.persian.buttons.PersianButton
import ru.rabbit.persian.buttons.PersianButtonSizes
import ru.rabbit.persian.dividers.PersianHorizontalDividers
import ru.rabbit.persian.foundation.elevation
import ru.rabbit.persian.foundation.spacing

object PersianAlerts {

    @Composable
    fun OnlyAction(
        modifier: Modifier = Modifier,
        colors: AlertsColors = PersianAlertsColors.primary(),
        actions: List<AlertAction>,
        onDismiss: () -> Unit
    ) {
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
                                .padding(MaterialTheme.spacing.large),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            content = {
                                actions.forEach { action ->
                                    PersianButton.Primary(
                                        modifier = Modifier.fillMaxWidth(),
                                        text = action.title,
                                        colors = colors.actionColor,
                                        onClick = action.onClick,
                                        size = PersianButtonSizes.large()
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
    fun Primary(
        modifier: Modifier = Modifier,
        colors: AlertsColors = PersianAlertsColors.primary(),
        title: String,
        description: String? = null,
        icon: Painter? = null,
        actions: List<AlertAction>,
        onDismiss: () -> Unit,
        content: (@Composable () -> Unit)? = null
    ) {
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
                            verticalArrangement = Arrangement
                                .spacedBy(MaterialTheme.spacing.extraExtraSmall),
                            content = {
                                Column(
                                    modifier = Modifier
                                        .wrapContentHeight()
                                        .fillMaxWidth()
                                        .padding(
                                            start = MaterialTheme.spacing.extraExtraLarge,
                                            end = MaterialTheme.spacing.extraExtraLarge,
                                            top = MaterialTheme.spacing.extraExtraLarge,
                                            bottom = MaterialTheme.spacing.extraSmall
                                        ),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement
                                        .spacedBy(MaterialTheme.spacing.large),
                                ) {
                                    icon?.let {
                                        Icon(
                                            painter = it,
                                            contentDescription = "",
                                            tint = colors.iconColor
                                        )
                                    }
                                    Text(
                                        modifier = Modifier.fillMaxWidth(),
                                        text = title,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.headlineSmall,
                                        color = colors.titleColor
                                    )
                                    description?.let {
                                        Text(
                                            text = it,
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = colors.descriptionColor
                                        )
                                    }
                                }
                                if (content != null) PersianHorizontalDividers.Inset()
                                content?.invoke()
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
                                            PersianButton.Primary(
                                                text = action.title,
                                                colors = colors.actionColor,
                                                onClick = action.onClick,
                                                size = PersianButtonSizes.small()
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
}

data class AlertAction(
    val title: String,
    val onClick: () -> Unit
)