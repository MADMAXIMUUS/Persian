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
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

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
                    .padding(horizontal = PersianTheme.spacing.size24),
                shape = PersianTheme.shapes.shape20,
                color = colors.backgroundColor,
                tonalElevation = PersianTheme.elevation.small,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(PersianTheme.spacing.size16)
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
                    .padding(horizontal = PersianTheme.spacing.size24),
                shape = PersianTheme.shapes.shape20,
                color = colors.backgroundColor,
                tonalElevation = PersianTheme.elevation.small,
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
                                    style = PersianTheme.typography.headlineSmall,
                                    color = colors.titleColor
                                )
                            }
                            description?.let {
                                Text(
                                    modifier = Modifier
                                        .padding(horizontal = PersianTheme.spacing.size20),
                                    text = it,
                                    style = PersianTheme.typography.bodyMedium,
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
                                    PaddingValues(PersianTheme.spacing.size16)
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