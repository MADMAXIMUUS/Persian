package io.github.madmaximuus.persian.chips.filter

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

/**
 * An interface that defines the scope for the trailing content of a FilterChip.
 *
 * This interface provides access to the colors, sizes, enabled state, and selected state of the FilterChip,
 * allowing customization of the trailing content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property enabled Whether the chip is enabled or disabled.
 * @property selected Whether the chip is selected or not.
 */
interface FilterChipTrailingScope {
    val colors: SelectableChipColors
    val sizes: SelectableChipSizes
    val enabled: Boolean
    val selected: Boolean
}

/**
 * An internal implementation of the [FilterChipTrailingScope] interface that wraps the colors, sizes,
 * enabled state, and selected state of a FilterChip.
 *
 * This class is used to provide a concrete implementation of the [FilterChipTrailingScope] interface,
 * allowing the trailing content of a FilterChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param selected Whether the chip is selected or not.
 */
internal class FilterChipTrailingScopeWrapper(
    override val colors: SelectableChipColors,
    override val sizes: SelectableChipSizes,
    override val enabled: Boolean,
    override val selected: Boolean
) : FilterChipTrailingScope

/**
 * Provides an icon within the trailing scope of an [FilterChip].
 *
 * @param modifier The modifier to be applied to the icon.
 * @param icon The painter to be used for the icon.
 * @param onClick called when the icon is clicked by user.
 */
@Composable
fun FilterChipTrailingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size8)
    ) {
        Icon(
            Modifier
                .clip(PersianTheme.shapes.shape4)
                .clickable(
                    enabled,
                    onClick = onClick,
                    role = Role.Image
                ),
            painter = icon,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(enabled, selected),
        )
    }
}