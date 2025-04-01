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
import io.github.madmaximuus.persian.button.Button
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.menu.DropdownMenu
import io.github.madmaximuus.persian.menu.DropdownMenuItemScope
import io.github.madmaximuus.persian.topAppBar.util.LayoutId
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

/**
 * An interface that defines the scope for the right content of a top app bar.
 *
 * This scope provides access to the colors and sizes used by the top app bar,
 * allowing customization of the right content based on these properties.
 *
 * @property colors The colors to be used for the top app bar.
 * @property sizes The sizes to be used for the top app bar.
 */
interface TopAppBarTrailingScope {
    val colors: TopAppBarColors
    val sizes: TopAppBarSizes
}

/**
 * An internal class that implements the [TopAppBarTrailingScope] interface.
 *
 * This class wraps the colors and sizes properties, providing a concrete implementation
 * for the scope used by the right content of a top app bar.
 *
 * @property colors The colors to be used for the top app bar.
 * @property sizes The sizes to be used for the top app bar.
 */
internal class TopAppBarTrailingScopeWrapper(
    override val colors: TopAppBarColors,
    override val sizes: TopAppBarSizes
) : TopAppBarTrailingScope

/**
 * Display an action button within the [TopAppBarTrailingScope].
 *
 * @param modifier The modifier to be applied to the action button.
 * @param text The text to be displayed on the action button.
 * @param onClick The lambda to be executed when the action button is clicked.
 */
@Composable
fun TopAppBarTrailingScope.Action(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(vertical = PersianTheme.spacing.size6)
            .layoutId(LayoutId.RIGHT_BUTTON)
    ) {
        Button(
            text = text,
            colors = ButtonDefaults.tertiaryColors(
                contentColor = this@Action.colors.trailingActionButtonColor
            ),
            sizes = this@Action.sizes.rightActionButtonSizes,
            onClick = onClick,
        )
    }
}

/**
 * Display an icon button with an optional badge within the [TopAppBarTrailingScope].
 *
 * @param modifier The modifier to be applied to the icon button.
 * @param style The style of the badge to be displayed on the icon button.
 * @param counter The counter value to be displayed in the badge.
 * @param icon The painter to be used as the icon for the button.
 * @param onClick The lambda to be executed when the icon button is clicked.
 */
@Composable
fun TopAppBarTrailingScope.IconButton(
    modifier: Modifier = Modifier,
    style: BadgeStyle = BadgeStyle.DOT,
    counter: Int = 0,
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
            counter != 0 -> {
                Badge(
                    count = counter,
                    style = style,
                    colors = this@IconButton.colors.badgeColors,
                    sizes = this@IconButton.sizes.badgeSizes
                ) {
                    IconButton(
                        icon = icon,
                        colors = this@IconButton.colors.trailingIconButtonColors,
                        sizes = this@IconButton.sizes.rightIconButtonSizes,
                        onClick = onClick,
                    )
                }
            }

            else -> {
                IconButton(
                    icon = icon,
                    colors = this@IconButton.colors.trailingIconButtonColors,
                    sizes = this@IconButton.sizes.rightIconButtonSizes,
                    onClick = onClick,
                )
            }
        }
    }
}

/**
 * Display a dropdown menu with an overflow icon within the [TopAppBarTrailingScope].
 *
 * @param modifier The modifier to be applied to the overflow menu.
 * @param icon The painter to be used as the icon for the overflow button.
 * @param expanded The initial expanded state of the dropdown menu.
 * @param interactionSource The interaction source for the dropdown menu.
 * @param onDismissRequest The lambda to be executed when the dropdown menu is dismissed.
 * @param menuItems The composable lambda that defines the content of the dropdown menu.
 */
@Composable
fun TopAppBarTrailingScope.More(
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
            colors = this@More.colors.menuColors,
            sizes = this@More.sizes.menuSizes,
            onDismissRequest = {
                onDismissRequest?.let { it() }
            },
            anchor = {
                IconButton(
                    icon = icon,
                    colors = this@More.colors.trailingIconButtonColors,
                    sizes = this@More.sizes.rightIconButtonSizes,
                    onClick = {
                        expandedState.targetState = true
                    }
                )
            },
            children = menuItems
        )
    }
}