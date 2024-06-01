package io.github.madmaximuus.persian.alert

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.dividers.PersianInsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.foundation.spacing

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
                    .widthIn(max = 460.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = MaterialTheme.spacing.size24),
                shape = MaterialTheme.shape.shape20,
                color = colors.backgroundColor,
                tonalElevation = MaterialTheme.elevation.small,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(MaterialTheme.spacing.size16)
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
    actions: List<AlertAction>,
    onDismiss: () -> Unit,
    content: (@Composable () -> Unit)? = null
) {
    validateActionItems(actions)
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        ),
        content = {
            Surface(
                modifier = modifier
                    .widthIn(max = 460.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = MaterialTheme.spacing.size24),
                shape = MaterialTheme.shape.shape20,
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
                            val padding =
                                if (heightSizeClass == WindowHeightSizeClass.COMPACT) PaddingValues(
                                    start = MaterialTheme.spacing.size24,
                                    end = MaterialTheme.spacing.size24,
                                    top = MaterialTheme.spacing.size12,
                                    bottom = MaterialTheme.spacing.size6
                                ) else PaddingValues(
                                    start = MaterialTheme.spacing.size24,
                                    end = MaterialTheme.spacing.size24,
                                    top = MaterialTheme.spacing.size24,
                                    bottom = MaterialTheme.spacing.size12
                                )
                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .padding(padding),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement
                                    .spacedBy(MaterialTheme.spacing.size16),
                            ) {
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
                                        .padding(horizontal = MaterialTheme.spacing.size20),
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
                            val actionPadding =
                                if (heightSizeClass == WindowHeightSizeClass.COMPACT)
                                    PaddingValues(MaterialTheme.spacing.size16)
                                else PaddingValues(
                                    horizontal = MaterialTheme.spacing.size16,
                                    vertical = MaterialTheme.spacing.size8
                                )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(actionPadding),
                                horizontalArrangement = Arrangement.spacedBy(
                                    MaterialTheme.spacing.size8,
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
    else if (actions.size > 10)
        throw IllegalArgumentException("There should be no more than 10 actions")
}

data class AlertAction(
    val title: String,
    val onClick: () -> Unit
)