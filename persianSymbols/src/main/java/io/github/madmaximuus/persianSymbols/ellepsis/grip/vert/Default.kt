package io.github.madmaximuus.persianSymbols.ellepsis.grip.vert

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EllipsisGripVertical: ImageVector
    get() {
        if (ellipsisGripVertical != null) {
            return ellipsisGripVertical!!
        }
        ellipsisGripVertical = Builder(
            name = "ellipsis-grip-vertical-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 6f)
                curveTo(11f, 7.105f, 10.105f, 8f, 9f, 8f)
                curveTo(7.895f, 8f, 7f, 7.105f, 7f, 6f)
                curveTo(7f, 4.895f, 7.895f, 4f, 9f, 4f)
                curveTo(10.105f, 4f, 11f, 4.895f, 11f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 12f)
                curveTo(11f, 13.105f, 10.105f, 14f, 9f, 14f)
                curveTo(7.895f, 14f, 7f, 13.105f, 7f, 12f)
                curveTo(7f, 10.896f, 7.895f, 10f, 9f, 10f)
                curveTo(10.105f, 10f, 11f, 10.896f, 11f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 20f)
                curveTo(10.105f, 20f, 11f, 19.105f, 11f, 18f)
                curveTo(11f, 16.896f, 10.105f, 16f, 9f, 16f)
                curveTo(7.895f, 16f, 7f, 16.896f, 7f, 18f)
                curveTo(7f, 19.105f, 7.895f, 20f, 9f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 20f)
                curveTo(16.105f, 20f, 17f, 19.105f, 17f, 18f)
                curveTo(17f, 16.896f, 16.105f, 16f, 15f, 16f)
                curveTo(13.895f, 16f, 13f, 16.896f, 13f, 18f)
                curveTo(13f, 19.105f, 13.895f, 20f, 15f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 14f)
                curveTo(16.105f, 14f, 17f, 13.105f, 17f, 12f)
                curveTo(17f, 10.896f, 16.105f, 10f, 15f, 10f)
                curveTo(13.895f, 10f, 13f, 10.896f, 13f, 12f)
                curveTo(13f, 13.105f, 13.895f, 14f, 15f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 8f)
                curveTo(16.105f, 8f, 17f, 7.105f, 17f, 6f)
                curveTo(17f, 4.895f, 16.105f, 4f, 15f, 4f)
                curveTo(13.895f, 4f, 13f, 4.895f, 13f, 6f)
                curveTo(13f, 7.105f, 13.895f, 8f, 15f, 8f)
                close()
            }
        }.build()
        return ellipsisGripVertical!!
    }

private var ellipsisGripVertical: ImageVector? = null