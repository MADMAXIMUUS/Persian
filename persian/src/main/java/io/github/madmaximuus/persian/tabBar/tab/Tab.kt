package io.github.madmaximuus.persian.tabBar.tab

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.counter.Counter
import io.github.madmaximuus.persian.counter.utils.BadgeStyle
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.tabBar.TabColors
import io.github.madmaximuus.persian.tabBar.TabSizes
import io.github.madmaximuus.persian.tabBar.default.TabBar
import io.github.madmaximuus.persian.tabBar.tab.IconSide.LEFT
import io.github.madmaximuus.persian.tabBar.tab.IconSide.TOP
import io.github.madmaximuus.persian.text.Text

/**
 * Enum class representing the side on which the icon should be placed in a tab.
 *
 * @property LEFT The icon is placed on the left side of the tab.
 * @property TOP The icon is placed on the top side of the tab.
 */
enum class IconSide {
    LEFT, TOP
}

/**
 * Interface defining the scope for a tab bar item.
 *
 * This interface provides access to the icon side, colors, and sizes for a tab bar item.
 */
interface TabBarItemScope {
    val iconSide: IconSide
    val badgeStyle: BadgeStyle
    val colors: TabColors
    val sizes: TabSizes
}

/**
 * Wrapper class implementing the [TabBarItemScope] interface.
 *
 * This class provides a concrete implementation of the [TabBarItemScope] interface,
 * encapsulating the icon side, colors, and sizes for a tab bar item.
 *
 * @param iconSide The side on which the icon should be placed.
 * @param colors The colors to be used for the tab.
 * @param sizes The sizes to be used for the tab.
 */
class TabBarItemScopeWrapper(
    override val iconSide: IconSide,
    override val badgeStyle: BadgeStyle,
    override val colors: TabColors,
    override val sizes: TabSizes
) : TabBarItemScope

/**
 * A default Tab, also known as a Primary Navigation Tab. Tabs organize content across different
 * screens, data sets, and other interactions.
 *
 * This should typically be used inside of a [TabBar], see the corresponding documentation for
 * example usage.
 *
 * This Tab has slots for [text] and/or [icon] - see the other Tab overload for a generic Tab that
 * is not opinionated about its content.
 *
 * @param selected whether this tab is selected or not
 * @param onClick called when this tab is clicked
 * @param modifier the [Modifier] to be applied to this tab
 * @param text the text label displayed in this tab
 * @param icon the icon displayed in this tab
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this tab. You can use this to change the tab's appearance or
 *   preview the tab in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 * @see LeadingIconTab
 */
@Composable
@Throws(IllegalArgumentException::class)
fun TabBarItemScope.Tab(
    onClick: () -> Unit,
    selected: Boolean,
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: Painter? = null,
    count: Int = 0,
    interactionSource: MutableInteractionSource? = null
) {
    require(text != null || icon != null) {
        throw IllegalArgumentException("text or icon required")
    }
    when {
        icon != null && text != null -> {
            when (iconSide) {
                LEFT -> {
                    LeadingIconTab(
                        onClick = onClick,
                        selected = selected,
                        modifier = modifier,
                        text = text,
                        icon = icon,
                        count = count,
                        interactionSource = interactionSource
                    )
                }

                TOP -> {
                    TopIconTab(
                        onClick = onClick,
                        selected = selected,
                        modifier = modifier,
                        text = text,
                        icon = icon,
                        interactionSource = interactionSource,
                        count = count
                    )
                }
            }

        }

        icon != null && text == null -> {
            OnlyIconTab(
                onClick = onClick,
                selected = selected,
                modifier = modifier,
                icon = icon,
                count = count,
                interactionSource = interactionSource
            )
        }

        text != null -> {
            OnlyTextTab(
                onClick = onClick,
                selected = selected,
                modifier = modifier,
                text = text,
                count = count,
                interactionSource = interactionSource
            )
        }
    }
}

/**
 * Tabs organize content across different screens, data sets, and other interactions.
 *
 * A LeadingIconTab represents a single page of content using a text label and an icon in front of
 * the label.
 *
 * This should typically be used inside of a [TabBar], see the corresponding documentation for
 * example usage.
 *
 * @param selected whether this tab is selected or not
 * @param onClick called when this tab is clicked
 * @param text the text label displayed in this tab
 * @param icon the icon displayed in this tab. Should be 24.dp.
 * @param modifier the [Modifier] to be applied to this tab
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this tab. You can use this to change the tab's appearance or
 *   preview the tab in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 * @see Tab
 */
@Composable
private fun TabBarItemScope.LeadingIconTab(
    onClick: () -> Unit,
    selected: Boolean,
    modifier: Modifier,
    text: String?,
    icon: Painter?,
    count: Int,
    interactionSource: MutableInteractionSource?
) {
    CompositionLocalProvider(
        LocalContentColor provides colors.contentColorAnimated(selected = selected)
    ) {
        Row(
            modifier = modifier
                .selectable(
                    selected = selected,
                    onClick = onClick,
                    role = Role.Tab,
                    interactionSource = interactionSource,
                    indication = ripple(
                        bounded = true,
                        color = colors.activeContentColor
                    )
                )
                .widthIn(min = 88.dp)
                .heightIn(min = 48.dp)
                .padding(
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                )
                .fillMaxWidth()
                .padding(horizontal = PersianTheme.spacing.size2),
            horizontalArrangement = Arrangement.spacedBy(
                PersianTheme.spacing.size4,
                Alignment.CenterHorizontally
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (icon != null) {
                Icon(
                    painter = icon,
                    sizes = sizes.iconSizes,
                )
            }
            if (text != null) {
                Text(
                    text = text,
                    color = LocalContentColor.current,
                    maxLines = 1,
                    style = sizes.textStyle
                )
            }
            if (count != 0) {
                Counter(
                    count = count,
                    sizes = sizes.counterSizes(side = LEFT),
                    colors = colors.counterColors(side = LEFT)
                )
            }
        }
    }
}

/**
 * Tabs organize content across different screens, data sets, and other interactions.
 *
 * Generic [Tab] overload that is not opinionated about content / color. See the other overload for
 * a Tab that has specific slots for text and / or an icon, as well as providing the correct colors
 * for selected / unselected states.
 *
 * @param selected whether this tab is selected or not
 * @param onClick called when this tab is clicked
 * @param modifier the [Modifier] to be applied to this tab
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this tab. You can use this to change the tab's appearance or
 *   preview the tab in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
private fun TabBarItemScope.TopIconTab(
    onClick: () -> Unit,
    selected: Boolean,
    modifier: Modifier,
    text: String?,
    icon: Painter?,
    count: Int,
    interactionSource: MutableInteractionSource?
) {
    CompositionLocalProvider(
        LocalContentColor provides colors.contentColorAnimated(selected = selected)
    ) {
        Column(
            modifier = modifier
                .selectable(
                    selected = selected,
                    onClick = onClick,
                    role = Role.Tab,
                    interactionSource = interactionSource,
                    indication = ripple(
                        bounded = true,
                        color = colors.activeContentColor
                    )
                )
                .widthIn(min = 88.dp)
                .heightIn(min = 48.dp)
                .padding(
                    top = PersianTheme.spacing.size10,
                    bottom = PersianTheme.spacing.size8
                )
                .fillMaxWidth()
                .padding(horizontal = PersianTheme.spacing.size2),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(
                PersianTheme.spacing.size2,
                Alignment.CenterVertically
            ),
            content = {
                if (icon != null) {
                    if (count == 0) {
                        Icon(
                            painter = icon,
                            sizes = sizes.iconSizes,
                        )
                    } else {
                        Badge(
                            count = count,
                            style = badgeStyle,
                            sizes = sizes.counterSizes(TOP),
                            colors = colors.counterColors(TOP)
                        ) {
                            Icon(
                                painter = icon,
                                sizes = sizes.iconSizes,
                            )
                        }
                    }
                }
                if (text != null) {
                    Text(
                        text = text,
                        color = LocalContentColor.current,
                        maxLines = 1,
                        style = sizes.textStyle
                    )
                }
            }
        )
    }
}

/**
 * Tabs organize content across different screens, data sets, and other interactions.
 *
 * A LeadingIconTab represents a single page of content using a text label and an icon in front of
 * the label.
 *
 * This should typically be used inside of a [TabBar], see the corresponding documentation for
 * example usage.
 *
 * @param selected whether this tab is selected or not
 * @param onClick called when this tab is clicked
 * @param icon the icon displayed in this tab. Should be 24.dp.
 * @param modifier the [Modifier] to be applied to this tab
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this tab. You can use this to change the tab's appearance or
 *   preview the tab in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 * @see Tab
 */
@Composable
private fun TabBarItemScope.OnlyIconTab(
    onClick: () -> Unit,
    selected: Boolean,
    modifier: Modifier,
    icon: Painter,
    count: Int,
    interactionSource: MutableInteractionSource?
) {
    CompositionLocalProvider(
        LocalContentColor provides colors.contentColorAnimated(selected = selected)
    ) {
        Row(
            modifier = modifier
                .selectable(
                    selected = selected,
                    onClick = onClick,
                    role = Role.Tab,
                    interactionSource = interactionSource,
                    indication = ripple(
                        bounded = true,
                        color = colors.activeContentColor
                    )
                )
                .widthIn(min = 88.dp)
                .heightIn(min = 48.dp)
                .padding(
                    top = PersianTheme.spacing.size12,
                    bottom = PersianTheme.spacing.size12
                )
                .fillMaxWidth()
                .padding(horizontal = PersianTheme.spacing.size2),
            horizontalArrangement = Arrangement.spacedBy(
                PersianTheme.spacing.size4,
                Alignment.CenterHorizontally
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (count == 0) {
                Icon(
                    painter = icon,
                    sizes = sizes.iconSizes,
                )
            } else {
                Badge(
                    count = count,
                    style = badgeStyle,
                    sizes = sizes.counterSizes(TOP),
                    colors = colors.counterColors(TOP)
                ) {
                    Icon(
                        painter = icon,
                        sizes = sizes.iconSizes,
                    )
                }
            }
        }
    }
}

/**
 * Tabs organize content across different screens, data sets, and other interactions.
 *
 * A LeadingIconTab represents a single page of content using a text label and an icon in front of
 * the label.
 *
 * This should typically be used inside of a [TabBar], see the corresponding documentation for
 * example usage.
 *
 * @param selected whether this tab is selected or not
 * @param onClick called when this tab is clicked
 * @param text the text label displayed in this tab
 * @param modifier the [Modifier] to be applied to this tab
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this tab. You can use this to change the tab's appearance or
 *   preview the tab in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 * @see Tab
 */
@Composable
private fun TabBarItemScope.OnlyTextTab(
    onClick: () -> Unit,
    selected: Boolean,
    modifier: Modifier,
    text: String,
    count: Int,
    interactionSource: MutableInteractionSource?
) {
    CompositionLocalProvider(
        LocalContentColor provides colors.contentColorAnimated(selected = selected)
    ) {
        Row(
            modifier = modifier
                .selectable(
                    selected = selected,
                    onClick = onClick,
                    role = Role.Tab,
                    interactionSource = interactionSource,
                    indication = ripple(
                        bounded = true,
                        color = colors.activeContentColor
                    )
                )
                .widthIn(min = 88.dp)
                .heightIn(min = 48.dp)
                .padding(
                    top = PersianTheme.spacing.size12,
                    bottom = PersianTheme.spacing.size12
                )
                .fillMaxWidth()
                .padding(horizontal = PersianTheme.spacing.size2),
            horizontalArrangement = Arrangement.spacedBy(
                PersianTheme.spacing.size4,
                Alignment.CenterHorizontally
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                color = LocalContentColor.current,
                maxLines = 1,
                style = sizes.textStyle
            )
            if (count != 0) {
                Counter(
                    count = count,
                    sizes = sizes.counterSizes(side = LEFT),
                    colors = colors.counterColors(side = LEFT)
                )
            }
        }
    }
}