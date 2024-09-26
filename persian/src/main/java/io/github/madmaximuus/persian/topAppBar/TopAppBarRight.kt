package io.github.madmaximuus.persian.topAppBar

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.button.TertiaryButton
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persian.menu.DropdownMenu
import io.github.madmaximuus.persian.menu.DropdownMenuItemScope
import io.github.madmaximuus.persian.topAppBar.util.LayoutId
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

interface TopAppBarRightScope {
    val colors: TopAppBarColors
    val sizes: TopAppBarSizes
}

internal class TopAppBarRightScopeWrapper(
    override val colors: TopAppBarColors,
    override val sizes: TopAppBarSizes
) : TopAppBarRightScope

@Composable
fun TopAppBarRightScope.Action(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(vertical = PersianTheme.spacing.size6)
            .layoutId(LayoutId.RIGHT_BUTTON)
    ) {
        TertiaryButton(
            text = text,
            colors = this@Action.colors.rightActionButtonColors,
            sizes = this@Action.sizes.rightActionButtonSizes,
            onClick = onClick,
        )
    }
}

@Composable
fun TopAppBarRightScope.IconButton(
    modifier: Modifier = Modifier,
    counter: Int = -1,
    icon: Painter,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .size(48.dp)
            .layoutId(LayoutId.RIGHT_ICON),
        contentAlignment = Alignment.Center
    ) {
        when {
            counter == 0 -> {
                Badge(
                    colors = this@IconButton.colors.badgeColors,
                    sizes = this@IconButton.sizes.badgeSizes
                ) {
                    TertiaryIconButton(
                        icon = icon,
                        colors = this@IconButton.colors.rightIconButtonColors,
                        sizes = this@IconButton.sizes.rightIconButtonSizes,
                        onClick = onClick,
                    )
                }
            }

            counter > 0 -> {
                Badge(
                    count = counter,
                    colors = this@IconButton.colors.badgeColors,
                    sizes = this@IconButton.sizes.badgeSizes
                ) {
                    TertiaryIconButton(
                        icon = icon,
                        colors = this@IconButton.colors.rightIconButtonColors,
                        sizes = this@IconButton.sizes.rightIconButtonSizes,
                        onClick = onClick,
                    )
                }
            }

            else -> {
                TertiaryIconButton(
                    icon = icon,
                    colors = this@IconButton.colors.rightIconButtonColors,
                    sizes = this@IconButton.sizes.rightIconButtonSizes,
                    onClick = onClick,
                )
            }
        }
    }
}

@Composable
fun TopAppBarRightScope.Overflow(
    modifier: Modifier = Modifier,
    icon: Painter = rememberVectorPainter(PersianSymbols.Default.EllipsisVert),
    expanded: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onDismissRequest: (() -> Unit)? = null,
    menuItems: @Composable DropdownMenuItemScope.() -> Unit
) {
    val expandedState = remember { MutableTransitionState(expanded) }
    Box(
        modifier = modifier
            .size(48.dp)
            .layoutId(LayoutId.RIGHT_OVERFLOW),
        contentAlignment = Alignment.Center
    ) {
        DropdownMenu(
            expanded = expandedState.targetState,
            modifier = modifier,
            interactionSource = interactionSource,
            colors = this@Overflow.colors.menuColors,
            sizes = this@Overflow.sizes.menuSizes,
            onDismissRequest = {
                onDismissRequest?.let { it() }
            },
            anchor = {
                TertiaryIconButton(
                    icon = icon,
                    colors = this@Overflow.colors.rightIconButtonColors,
                    sizes = this@Overflow.sizes.rightIconButtonSizes,
                    onClick = {
                        expandedState.targetState = true
                    }
                )
            },
            children = menuItems
        )
    }
}

/*
@Composable
internal fun PersianTopAppBarRightIcons(
    actions: List<ActionItem>,
    expanded: Boolean = false
) {
    val colors = LocalPersianTopAppBarColors.current
    val showAsActionItemsCount =
        if (actions.size > MAX_ACTIONS) MAX_ACTIONS - 1 else MAX_ACTIONS
    val showAsActionItems = actions.take(showAsActionItemsCount)
    val overflowItems = actions.subtract(showAsActionItems.toSet()).toList()
    showAsActionItems.forEach { action ->
        if (action.badgeCount > 0) {
            Badge(
                count = action.badgeCount
            ) {
                TertiaryIconButton(
                    icon = action.icon,
                    sizes = IconButtonDefaults.mediumSizes(),
                    colors = IconButtonDefaults.tertiaryIconButtonColors(
                        contentColor = colors.iconColor
                    ),
                    onClick = action.onClick
                )
            }
        } else {
            TertiaryIconButton(
                icon = action.icon,
                sizes = IconButtonDefaults.mediumSizes(),
                colors = IconButtonDefaults.tertiaryIconButtonColors(
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
    TertiaryButton(
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
)*/
