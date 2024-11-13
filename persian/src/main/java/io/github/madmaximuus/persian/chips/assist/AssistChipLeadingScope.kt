package io.github.madmaximuus.persian.chips.assist

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
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
interface AssistChipLeadingScope {
    val colors: ChipColors
    val sizes: ChipSizes
    val enabled: Boolean
}

/**
 * An internal implementation of the [AssistChipLeadingScope] interface that wraps the colors, sizes,
 * and enabled state of an AssistChip.
 *
 * This class is used to provide a concrete implementation of the [AssistChipLeadingScope] interface,
 * allowing the leading content of an AssistChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 */
internal class AssistChipLeadingScopeWrapper(
    override val colors: ChipColors,
    override val sizes: ChipSizes,
    override val enabled: Boolean
) : AssistChipLeadingScope

/**
 * Provides an icon within the leading scope of an [AssistChip].
 *
 * @param modifier The [Modifier] to be applied to the icon.
 * @param painter The [Painter] used to draw the icon.
 */
@Composable
fun AssistChipLeadingScope.Icon(
    modifier: Modifier = Modifier,
    painter: Painter,
) {
    Box(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size8)
    ) {
        Icon(
            painter = painter,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(enabled)
        )
    }
}

/**
 *  Provides an image within the leading scope of an [AssistChip].
 *
 * @param modifier The modifier to be applied to the image. Default is [Modifier].
 * @param imageUrl The URI of the image to be displayed.
 */
@Composable
fun AssistChipLeadingScope.Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri
) {
    Box(
        modifier = modifier
            .padding(
                start = PersianTheme.spacing.size4,
                end = PersianTheme.spacing.size8
            )
    ) {
        Image(
            imageUrl = imageUrl,
            sizes = sizes.leadingImageSizes,
            colors = colors.imageColors,
            enabled = enabled,
            shape = ImageShape.MEDIUM
        )
    }
}