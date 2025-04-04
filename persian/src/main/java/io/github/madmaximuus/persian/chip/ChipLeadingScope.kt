package io.github.madmaximuus.persian.chip

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarAndImage.Image
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

/**
 * An interface that defines the scope for the leading content of an AssistChip.
 *
 * This interface provides access to the colors, sizes, and enabled state of the AssistChip,
 * allowing customization of the leading content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property enabled Whether the chip is enabled or disabled.
 */
interface ChipLeadingScope {
    val colors: ChipColors
    val sizes: ChipSizes
    val enabled: Boolean
}

/**
 * An internal implementation of the [ChipLeadingScope] interface that wraps the colors, sizes,
 * and enabled state of an AssistChip.
 *
 * This class is used to provide a concrete implementation of the [ChipLeadingScope] interface,
 * allowing the leading content of an AssistChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 */
internal class ChipLeadingScopeWrapper(
    override val colors: ChipColors,
    override val sizes: ChipSizes,
    override val enabled: Boolean
) : ChipLeadingScope

/**
 * Provides an icon within the leading scope of an [Chip].
 *
 * @param modifier The [Modifier] to be applied to the icon.
 * @param painter The [Painter] used to draw the icon.
 */
@Composable
fun ChipLeadingScope.Icon(
    modifier: Modifier = Modifier,
    painter: Painter,
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size4)
    ) {
        Icon(
            painter = painter,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconColor
        )
    }
}

/**
 *  Provides an image within the leading scope of an [Chip].
 *
 * @param modifier The modifier to be applied to the image.
 * @param imageUrl The URI of the image to be displayed.
 */
@Composable
fun ChipLeadingScope.Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri
) {
    Box(
        modifier = modifier
            .padding(start = PersianTheme.spacing.size4)
    ) {
        Image(
            imageUrl = imageUrl,
            sizes = sizes.leadingImageSizes,
            colors = colors.leadingImageColors,
        )
    }
}