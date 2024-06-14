package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.checkboxes.toggle.PersianCheckboxToggle
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.radioButtons.PersianRadioButtonToggle
import io.github.madmaximuus.persianSymbols.bars.base.Bars
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.minus.base.Minus
import io.github.madmaximuus.persianSymbols.plus.base.Plus

sealed class PersianListItemEdit {

    data class Checkbox(
        val checked: Boolean,
        val onCheckedChange: (Boolean) -> Unit
    ) : PersianListItemEdit()

    data class RadioButton(
        val selected: Boolean,
        val onClick: () -> Unit
    ) : PersianListItemEdit()

    data class Drag(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianListItemEdit()

    data class Add(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianListItemEdit()

    data class Remove(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianListItemEdit()
}

@Composable
internal fun PersianListItemEditCheckbox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    Box(
        modifier = modifier.padding(
            top = PersianTheme.spacing.size4,
            bottom = PersianTheme.spacing.size4,
            start = 0.dp,
            end = PersianTheme.spacing.size16
        )
    ) {
        Box(
            modifier = Modifier
                .padding(PaddingValues(vertical = PersianTheme.spacing.size8))
        ) {
            PersianCheckboxToggle(
                checked = checked,
                onCheckedChange = onCheckedChange
            )
        }
    }
}

@Composable
internal fun PersianListItemEditRadio(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier.padding(
            top = PersianTheme.spacing.size4,
            bottom = PersianTheme.spacing.size4,
            start = 0.dp,
            end = PersianTheme.spacing.size16
        )
    ) {
        Box(
            modifier = Modifier
                .padding(PaddingValues(vertical = PersianTheme.spacing.size8))
        ) {
            PersianRadioButtonToggle(
                checked = checked,
                onClick = onClick
            )
        }
    }
}

@Composable
internal fun PersianListItemEditDrag(
    modifier: Modifier = Modifier,
    customIcon: Painter?,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .padding(
                top = PersianTheme.spacing.size4,
                bottom = PersianTheme.spacing.size4,
                start = 0.dp,
                end = PersianTheme.spacing.size16
            )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
        ) {
            Box(
                modifier = Modifier
                    .padding(PaddingValues(vertical = PersianTheme.spacing.size8))
            ) {
                Icon(
                    modifier = Modifier
                        .minimumInteractiveComponentSize()
                        .clickable { onClick() },
                    painter = customIcon ?: rememberVectorPainter(image = PersianSymbols.Default.Bars),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListItemEditAdd(
    modifier: Modifier = Modifier,
    customIcon: Painter?,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier.padding(
            top = PersianTheme.spacing.size4,
            bottom = PersianTheme.spacing.size4,
            start = 0.dp,
            end = PersianTheme.spacing.size16
        )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
        ) {
            Box(
                modifier = Modifier
                    .padding(PaddingValues(vertical = PersianTheme.spacing.size8))
            ) {
                Icon(
                    modifier = Modifier
                        .minimumInteractiveComponentSize()
                        .clickable { onClick() },
                    painter = customIcon ?: rememberVectorPainter(image = PersianSymbols.Default.Plus),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}

@Composable
internal fun PersianListItemEditRemove(
    modifier: Modifier = Modifier,
    customIcon: Painter?,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier.padding(
            top = PersianTheme.spacing.size4,
            bottom = PersianTheme.spacing.size4,
            start = 0.dp,
            end = PersianTheme.spacing.size16
        )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides PersianTheme.colorScheme.onSurfaceVariant
        ) {
            Box(
                modifier = Modifier
                    .padding(PaddingValues(vertical = PersianTheme.spacing.size8))
            ) {
                Icon(
                    modifier = Modifier
                        .minimumInteractiveComponentSize()
                        .clickable { onClick() },
                    painter = customIcon
                        ?: rememberVectorPainter(image = PersianSymbols.Default.Minus),
                    size = IconDefaults.size24(),
                )
            }
        }
    }
}