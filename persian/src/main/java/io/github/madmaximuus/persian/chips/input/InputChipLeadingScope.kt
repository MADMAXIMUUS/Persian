package io.github.madmaximuus.persian.chips.input

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

interface InputChipLeadingScope {
    val colors: SelectableChipColors
    val sizes: SelectableChipSizes
    val enabled: Boolean
    val selected: Boolean
}

internal class InputChipLeadingScopeWrapper(
    override val colors: SelectableChipColors,
    override val sizes: SelectableChipSizes,
    override val enabled: Boolean,
    override val selected: Boolean
) : InputChipLeadingScope

@Composable
fun InputChipLeadingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
    selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
) {
    Box(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size8)
    ) {
        Icon(
            painter = if (selected) selectedIcon else icon,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(enabled, selected)
        )
    }
}

@Composable
fun InputChipLeadingScope.Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
    selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
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
            sizes = sizes.imageSizes,
            overlay = selected,
            colors = colors.imageColors,
            overlayIcon = selectedIcon,
            enabled = enabled,
            shape = ImageShape.MEDIUM
        )
    }
}

@Composable
fun InputChipLeadingScope.Avatar(
    modifier: Modifier = Modifier,
    avatarUrl: Uri,
    selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
) {
    Box(
        modifier = modifier
            .padding(
                start = PersianTheme.spacing.size4,
                end = PersianTheme.spacing.size8
            )
    ) {
        Avatar(
            imageUrl = avatarUrl,
            sizes = sizes.avatarSizes,
            overlay = selected,
            overlayIcon = selectedIcon,
            colors = colors.avatarColors,
            enabled = enabled,
        )
    }
}