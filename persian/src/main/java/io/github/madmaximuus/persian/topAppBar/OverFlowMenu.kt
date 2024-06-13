package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpOffset
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persian.menus.PersianDropdownMenu
import io.github.madmaximuus.persian.menus.PersianMenuItem

@Composable
internal fun OverflowMenu(
    actions: List<ActionItem>,
    overflowIcon: Painter,
    modifier: Modifier = Modifier,
    expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onDismissRequest: (() -> Unit)? = null,
) {
    val colors = LocalPersianTopAppBarColors.current
    PersianDropdownMenu(
        expanded = expanded,
        modifier = modifier,
        interactionSource = interactionSource,
        offset = DpOffset(PersianTheme.spacing.size12, PersianTheme.spacing.size8),
        onDismissRequest = {
            onDismissRequest?.let { it() }
        },
        anchor = {
            PersianTertiaryIconButton(
                icon = overflowIcon,
                colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
                    contentColor = colors.iconColor
                ),
                onClick = {
                    expanded.value = true
                }
            )
        },
        children = {
            actions.forEach {
                PersianMenuItem(
                    title = it.title,
                    onItemClick = {
                        it.onClick()
                        expanded.value = false
                    },
                    leadingIcon = it.icon
                )
            }
        }
    )
}