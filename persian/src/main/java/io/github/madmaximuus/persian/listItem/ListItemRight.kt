package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.counter.PersianCounter
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.switch.PersianSwitch
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

sealed class PersianListCellRight {

    data class Open(
        val customIcon: Painter? = null,
    ) : PersianListCellRight()

    data class Switch(
        val checked: Boolean,
        val onCheckedChange: (Boolean) -> Unit,
        val checkedIcon: Painter? = null,
        val uncheckedIcon: Painter? = null,
        val showOpen: Boolean = false
    ) : PersianListCellRight()

    data class More(
        val customIcon: Painter? = null,
        val showOpen: Boolean = false
    ) : PersianListCellRight()

    data class Icon(
        val icon: Painter,
        val color: Color,
        val showOpen: Boolean = false
    ) : PersianListCellRight()

    data class Counter(
        val count: Int,
        val showOpen: Boolean = false
    ) : PersianListCellRight()

    data class Suffix(
        val suffix: String,
        val showOpen: Boolean = false
    ) : PersianListCellRight()

    data class Button(
        val text: String,
        val onClick: () -> Unit,
        val showOpen: Boolean = false
    ) : PersianListCellRight()
}

@Composable
internal fun PersianListCellRightOpen(
    modifier: Modifier = Modifier,
    icon: Painter?,
    color: Color?
) {
    Box(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
        ) {
            Icon(
                painter = icon ?: rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                size = IconDefaults.size24(),
            )
        }
    }
}

@Composable
internal fun PersianListCellRightSwitch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    checkedIcon: Painter? = null,
    uncheckedIcon: Painter? = null,
    showOpen: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        PersianSwitch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            checkedIcon = checkedIcon,
            uncheckedIcon = uncheckedIcon
        )
        if (showOpen) {
            CompositionLocalProvider(
                LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
            ) {
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListCellRightMore(
    modifier: Modifier = Modifier,
    icon: Painter?,
    color: Color?,
    showOpen: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        CompositionLocalProvider(
            LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
        ) {
            Icon(
                painter = icon ?: rememberVectorPainter(PersianSymbols.Default.EllipsisVert),
                size = IconDefaults.size24(),
            )
        }
        if (showOpen) {
            CompositionLocalProvider(
                LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
            ) {
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListCellRightIcon(
    modifier: Modifier = Modifier,
    icon: Painter,
    color: Color,
    showOpen: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        CompositionLocalProvider(
            LocalContentColor provides color
        ) {
            Icon(
                painter = icon,
                size = IconDefaults.size24(),
            )
        }
        if (showOpen) {
            CompositionLocalProvider(
                LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
            ) {
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListCellRightCounter(
    modifier: Modifier = Modifier,
    count: Int,
    showOpen: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        PersianCounter(count = count)
        if (showOpen) {
            CompositionLocalProvider(
                LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
            ) {
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListCellRightSuffix(
    modifier: Modifier = Modifier,
    text: String,
    showOpen: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        Text(
            text = text,
            style = PersianTheme.typography.bodyMedium,
            color = PersianTheme.colorScheme.onSurfaceVariant
        )
        if (showOpen) {
            CompositionLocalProvider(
                LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
            ) {
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListCellRightButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    showOpen: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 0.dp,
            bottom = 0.dp,
            end = 0.dp,
            start = PersianTheme.spacing.size12
        ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        PersianPrimaryButton(
            sizes = PersianButtonDefaults.smallSizes(),
            text = text,
            onClick = onClick
        )
        if (showOpen) {
            CompositionLocalProvider(
                LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
            ) {
                Icon(
                    painter = rememberVectorPainter(PersianSymbols.Default.ChevronRight),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}