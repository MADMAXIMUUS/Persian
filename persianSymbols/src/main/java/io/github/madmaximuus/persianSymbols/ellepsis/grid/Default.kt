package io.github.madmaximuus.persianSymbols.ellepsis.grid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EllipsisGrid: ImageVector
    get() {
        if (ellipsisGrid != null) {
            return ellipsisGrid!!
        }
        ellipsisGrid = ImageVector.Builder(
            name = "ellipsis-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 8f)
                curveTo(7.105f, 8f, 8f, 7.105f, 8f, 6f)
                curveTo(8f, 4.895f, 7.105f, 4f, 6f, 4f)
                curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
                curveTo(4f, 7.105f, 4.895f, 8f, 6f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 12f)
                curveTo(8f, 13.105f, 7.105f, 14f, 6f, 14f)
                curveTo(4.895f, 14f, 4f, 13.105f, 4f, 12f)
                curveTo(4f, 10.896f, 4.895f, 10f, 6f, 10f)
                curveTo(7.105f, 10f, 8f, 10.896f, 8f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 18f)
                curveTo(8f, 19.105f, 7.105f, 20f, 6f, 20f)
                curveTo(4.895f, 20f, 4f, 19.105f, 4f, 18f)
                curveTo(4f, 16.896f, 4.895f, 16f, 6f, 16f)
                curveTo(7.105f, 16f, 8f, 16.896f, 8f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 18f)
                curveTo(14f, 19.105f, 13.105f, 20f, 12f, 20f)
                curveTo(10.895f, 20f, 10f, 19.105f, 10f, 18f)
                curveTo(10f, 16.896f, 10.895f, 16f, 12f, 16f)
                curveTo(13.105f, 16f, 14f, 16.896f, 14f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 20f)
                curveTo(19.104f, 20f, 20f, 19.105f, 20f, 18f)
                curveTo(20f, 16.896f, 19.104f, 16f, 18f, 16f)
                curveTo(16.895f, 16f, 16f, 16.896f, 16f, 18f)
                curveTo(16f, 19.105f, 16.895f, 20f, 18f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                curveTo(14f, 10.896f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.896f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 12f)
                curveTo(20f, 13.105f, 19.104f, 14f, 18f, 14f)
                curveTo(16.895f, 14f, 16f, 13.105f, 16f, 12f)
                curveTo(16f, 10.896f, 16.895f, 10f, 18f, 10f)
                curveTo(19.104f, 10f, 20f, 10.896f, 20f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 6f)
                curveTo(14f, 7.105f, 13.105f, 8f, 12f, 8f)
                curveTo(10.895f, 8f, 10f, 7.105f, 10f, 6f)
                curveTo(10f, 4.895f, 10.895f, 4f, 12f, 4f)
                curveTo(13.105f, 4f, 14f, 4.895f, 14f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 8f)
                curveTo(19.104f, 8f, 20f, 7.105f, 20f, 6f)
                curveTo(20f, 4.895f, 19.104f, 4f, 18f, 4f)
                curveTo(16.895f, 4f, 16f, 4.895f, 16f, 6f)
                curveTo(16f, 7.105f, 16.895f, 8f, 18f, 8f)
                close()
            }
        }.build()
        return ellipsisGrid!!
    }

private var ellipsisGrid: ImageVector? = null