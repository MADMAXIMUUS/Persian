package io.github.madmaximuus.persian.chip.toggleable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

/**
 * An interface that defines the scope for the trailing content of an InputChip.
 *
 * This interface provides access to the colors, sizes, enabled state, and selected state of the InputChip,
 * allowing customization of the trailing content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property enabled Whether the chip is enabled or disabled.
 * @property selected Whether the chip is selected or not.
 */
interface ToggleableChipTrailingScope {
    val colors: ToggleableChipColors
    val sizes: ToggleableChipSizes
    val enabled: Boolean
    val selected: Boolean
}

/**
 * An internal implementation of the [ToggleableChipTrailingScope] interface that wraps the colors, sizes,
 * enabled state, and selected state of an InputChip.
 *
 * This class is used to provide a concrete implementation of the [ToggleableChipTrailingScope] interface,
 * allowing the trailing content of an InputChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param selected Whether the chip is selected or not.
 */
internal class ToggleableChipTrailingScopeWrapper(
    override val colors: ToggleableChipColors,
    override val sizes: ToggleableChipSizes,
    override val enabled: Boolean,
    override val selected: Boolean
) : ToggleableChipTrailingScope

/**
 * Provides an icon within the trailing scope of an [InputShip].
 *
 * @param modifier The modifier to be applied to the icon.
 * @param icon The painter to be used for the icon.
 * @param onClick Called when this chip is clicked.
 */
@Composable
fun ToggleableChipTrailingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(end = PersianTheme.spacing.size4)
    ) {
        Icon(
            modifier = Modifier
                .clip(PersianTheme.shapes.shape4)
                .clickable(
                    enabled = enabled,
                    onClick = onClick,
                    role = Role.Button
                ),
            painter = icon,
            sizes = sizes.trailingIconSizes,
            tint = colors.trailingIconContentColor(selected),
        )
    }
}