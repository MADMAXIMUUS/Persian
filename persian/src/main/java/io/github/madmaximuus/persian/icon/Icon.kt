package io.github.madmaximuus.persian.icon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import io.github.madmaximuus.persian.foundation.LocalContentColor

/**
 * A composable function to display an icon with customizable properties.
 *
 * @param modifier The [Modifier] to be applied to the icon.
 * @param painter The [Painter] used to draw the icon.
 * @param contentDescription An optional string describing the content of the icon for accessibility purposes.
 * @param sizes The [IconSizes] defining the width and padding of the icon.
 * @param tint The [Color] to tint the icon.
 */
@Composable
fun Icon(
    modifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String? = null,
    sizes: IconSizes = IconDefaults.size24(),
    tint: Color = LocalContentColor.current
) {
    val colorFilter = remember(tint) {
        if (tint == Color.Unspecified) null else ColorFilter.tint(tint)
    }
    val semantics =
        if (contentDescription != null) {
            Modifier.semantics {
                this.contentDescription = contentDescription
                this.role = Role.Image
            }
        } else {
            Modifier
        }
    Box(
        modifier
            .size(sizes.width)
            .padding(sizes.padding)
            .toolingGraphicsLayer()
            .paint(painter, colorFilter = colorFilter, contentScale = ContentScale.Fit)
            .then(semantics)
    )
}