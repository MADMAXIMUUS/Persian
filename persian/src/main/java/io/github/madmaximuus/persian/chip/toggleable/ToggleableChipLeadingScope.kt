package io.github.madmaximuus.persian.chip.toggleable

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.avatarAndImage.Avatar
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persianSymbols.check.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

/**
 * An interface that defines the scope for the leading content of an InputChip.
 *
 * This interface provides access to the colors, sizes, enabled state, and selected state of the InputChip,
 * allowing customization of the leading content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property selected Whether the chip is selected or not.
 */
interface ToggleableChipLeadingScope {
    val colors: ToggleableChipColors
    val sizes: ToggleableChipSizes
    val selected: Boolean
}

/**
 * An internal implementation of the [ToggleableChipLeadingScope] interface that wraps the colors, sizes,
 * enabled state, and selected state of an InputChip.
 *
 * This class is used to provide a concrete implementation of the [ToggleableChipLeadingScope] interface,
 * allowing the leading content of an InputChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param selected Whether the chip is selected or not.
 */
internal class ToggleableChipLeadingScopeWrapper(
    override val colors: ToggleableChipColors,
    override val sizes: ToggleableChipSizes,
    override val selected: Boolean
) : ToggleableChipLeadingScope

/**
 * Provides an icon within the leading scope of an [ToggleableChip].
 *
 * @param modifier The modifier to be applied to the icon. Default is [Modifier].
 * @param icon The painter to be used for the icon when the chip is not selected.
 * @param selectedIcon The painter to be used for the icon when the chip is selected. Default is a checkmark icon.
 */
@Composable
fun ToggleableChipLeadingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
    selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size4)
    ) {
        Icon(
            painter = if (selected) selectedIcon else icon,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(selected)
        )
    }
}

/**
 * Provides an image within the leading scope of an [ToggleableChip].
 *
 * @param modifier The modifier to be applied to the image.
 * @param imageUrl The URI of the image to be displayed.
 * @param selectedIcon The painter to be used for the overlay icon when the chip is selected.
 */
@Composable
fun ToggleableChipLeadingScope.Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
    selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
) {
    Box(
        modifier = modifier
                .padding(start = PersianTheme.spacing.size4)
    ) {
        io.github.madmaximuus.persian.avatarAndImage.Image(
            imageUrl = imageUrl,
            sizes = sizes.imageSizes,
            overlay = selected,
            colors = colors.imageColors,
            overlayIcon = selectedIcon,
        )
    }
}

/**
 * Provides an avatar within the leading scope of an [ToggleableChip].
 *
 * @param modifier The modifier to be applied to the avatar.
 * @param avatarUrl The URI of the avatar image to be displayed.
 * @param selectedIcon The painter to be used for the overlay icon when the chip is selected.
 */
@Composable
fun ToggleableChipLeadingScope.Avatar(
    modifier: Modifier = Modifier,
    avatarUrl: Uri,
    selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size4)
    ) {
        Avatar(
            imageUrl = avatarUrl,
            sizes = sizes.avatarSizes,
            overlay = selected,
            overlayIcon = selectedIcon,
            colors = colors.avatarColors,
        )
    }
}