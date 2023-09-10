package ru.rabbit.persian.topAppBar

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpOffset
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.iconButtons.PersianIconButton
import ru.rabbit.persian.iconButtons.PersianIconButtonColors
import ru.rabbit.persian.menus.PersianMenus

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
    PersianMenus.Dropdown(
        expanded = expanded,
        modifier = modifier,
        interactionSource = interactionSource,
        offset = DpOffset(MaterialTheme.spacing.medium, MaterialTheme.spacing.small),
        onDismissRequest = {
            onDismissRequest?.let { it() }
        },
        anchor = {
            PersianIconButton.Primary(
                icon = overflowIcon,
                style = PersianComponentStyle.STANDARD,
                colors = PersianIconButtonColors.primary(
                    style = PersianComponentStyle.STANDARD,
                    containerColor = colors.iconColor
                ),
                onClick = {
                    expanded.value = true
                }
            )
        },
        children = {
            actions.forEach {
                Primary(
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