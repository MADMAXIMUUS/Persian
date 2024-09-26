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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.dividers.InsetHorizontalDivider
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

@Composable
fun OnlyActionAlert(
    modifier: Modifier = Modifier,
    colors: AlertColors = AlertsDefaults.colors(),
    sizes: AlertSizes = AlertsDefaults.onlyActionSizes(),
    actions: @Composable OnlyActionScope.() -> Unit,
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
                    .widthIn(max = 460.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = PersianTheme.spacing.size20),
                shape = sizes.containerShape,
                color = colors.containerColor,
                tonalElevation = PersianTheme.elevation.small,
                shadowElevation = 0.dp,
                content = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(PersianTheme.spacing.size16)
                            .verticalScroll(rememberScrollState()),
                        content = {
                            val scope = remember(colors, sizes) {
                                OnlyActionScopeWrapper(
                                    scope = this,
                                    colors = colors.actionColor,
                                    sizes = sizes.actionSize
                                )
                            }
                            scope.actions()
                        }
                    )
                }
            )
        }
    )
}

@Composable
fun Alert(
    modifier: Modifier = Modifier,
    colors: AlertColors = AlertsDefaults.colors(),
    sizes: AlertSizes = AlertsDefaults.alertSizes(),
    title: String,
    description: String? = null,
    confirmAction: @Composable ActionScope.() -> Unit,
    dismissAction: (@Composable ActionScope.() -> Unit)? = null,
    cancelAction: (@Composable ActionScope.() -> Unit)? = null,
    onDismiss: () -> Unit,
    content: (@Composable () -> Unit)? = null
) {
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
                    .widthIn(max = 500.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = PersianTheme.spacing.size20),
                shape = sizes.containerShape,
                color = colors.containerColor,
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
                                    style = sizes.titleTextStyle,
                                    color = colors.titleColor
                                )
                            }
                            description?.let {
                                Text(
                                    modifier = Modifier
                                        .padding(horizontal = PersianTheme.spacing.size20),
                                    text = it,
                                    style = sizes.descriptionTextStyle,
                                    color = colors.descriptionColor,
                                    textAlign = TextAlign.Justify
                                )
                            }
                            content?.invoke()
                            if (content != null) {
                                InsetHorizontalDivider(
                                    strokeColor = colors.dividerColor,
                                    sizes = sizes.dividerSizes
                                )
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
                                    val scope = remember(colors) {
                                        ActionScopeWrapper(
                                            scope = this,
                                            colors = colors.actionColor,
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