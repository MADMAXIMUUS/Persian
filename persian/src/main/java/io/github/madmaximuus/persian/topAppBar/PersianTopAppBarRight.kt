package io.github.madmaximuus.persian.topAppBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton
import io.github.madmaximuus.persian.counter.PersianBadge
import io.github.madmaximuus.persian.counter.PersianCounterDefaults
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

sealed class PersianTopAppBarRight {

    data class Icons(
        val actionItem: List<ActionItem>,
        val expanded: MutableState<Boolean>
    ) : PersianTopAppBarRight()

    data class Action(
        val text: String,
        val onClick: () -> Unit
    ) : PersianTopAppBarRight()

}

private const val MAX_ACTIONS = 3

@Composable
internal fun PersianTopAppBarRightIcons(
    actions: List<ActionItem>,
    expanded: MutableState<Boolean> = remember { mutableStateOf(false) }
) {
    val colors = LocalPersianTopAppBarColors.current
    val showAsActionItemsCount =
        if (actions.size > MAX_ACTIONS) MAX_ACTIONS - 1 else MAX_ACTIONS
    val showAsActionItems = actions.take(showAsActionItemsCount)
    val overflowItems = actions.subtract(showAsActionItems.toSet()).toList()
    showAsActionItems.forEach { action ->
        if (action.badgeCount > 0) {
            PersianBadge(
                count = action.badgeCount,
                sizes = PersianCounterDefaults.sizes(
                    badgeHorizontalOffset = (-28).dp,
                    badgeVerticalOffset = 24.dp
                )
            ) {
                PersianTertiaryIconButton(
                    icon = action.icon,
                    sizes = PersianIconButtonDefaults.mediumSizes(),
                    colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
                        contentColor = colors.iconColor
                    ),
                    onClick = action.onClick
                )
            }
        } else {
            PersianTertiaryIconButton(
                icon = action.icon,
                sizes = PersianIconButtonDefaults.mediumSizes(),
                colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
                    contentColor = colors.iconColor
                ),
                onClick = action.onClick
            )
        }
    }
    if (overflowItems.isNotEmpty()) {
        OverflowMenu(
            actions = overflowItems,
            expanded = expanded,
            overflowIcon = rememberVectorPainter(image = PersianSymbols.Default.EllipsisVert)
        )
    }
}

@Composable
internal fun PersianTopAppBarRightButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    PersianTertiaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
    )
}

data class ActionItem(
    val icon: Painter,
    val title: String,
    val contentDescription: String,
    val badgeCount: Int = 0,
    val onClick: () -> Unit,
)