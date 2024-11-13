package io.github.madmaximuus.persianSymbols.ellepsis.vert

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EllipsisVert: ImageVector
    get() {
        if (ellipsisVert != null) {
            return ellipsisVert!!
        }
        ellipsisVert = ImageVector.Builder(
            name = "ellipsis-vert-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 6f)
                curveTo(14f, 7.104f, 13.104f, 8f, 12f, 8f)
                curveTo(10.895f, 8f, 10f, 7.104f, 10f, 6f)
                curveTo(10f, 4.895f, 10.895f, 4f, 12f, 4f)
                curveTo(13.104f, 4f, 14f, 4.895f, 14f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 12f)
                curveTo(14f, 13.104f, 13.104f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.104f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.104f, 10f, 14f, 10.895f, 14f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 20f)
                curveTo(13.104f, 20f, 14f, 19.104f, 14f, 18f)
                curveTo(14f, 16.895f, 13.104f, 16f, 12f, 16f)
                curveTo(10.895f, 16f, 10f, 16.895f, 10f, 18f)
                curveTo(10f, 19.104f, 10.895f, 20f, 12f, 20f)
                close()
            }
        }.build()
        return ellipsisVert!!
    }

private var ellipsisVert: ImageVector? = null