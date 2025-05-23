package io.github.madmaximuus.persianSymbols.bell.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BellBadge: ImageVector
    get() {
        if (bellBadge != null) {
            return bellBadge!!
        }
        bellBadge = ImageVector.Builder(
            name = "bell-badge-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(3.083f)
                curveTo(8.162f, 3.559f, 6f, 6.027f, 6f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                curveTo(4.448f, 17f, 4f, 17.448f, 4f, 18f)
                curveTo(4f, 18.552f, 4.448f, 19f, 5f, 19f)
                lineTo(19f, 19f)
                curveTo(19.552f, 19f, 20f, 18.552f, 20f, 18f)
                curveTo(20f, 17.448f, 19.552f, 17f, 19f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(9.75f)
                curveTo(15.929f, 9.75f, 14.25f, 8.071f, 14.25f, 6f)
                curveTo(14.25f, 5.172f, 14.518f, 4.407f, 14.972f, 3.787f)
                curveTo(14.372f, 3.444f, 13.707f, 3.202f, 13f, 3.083f)
                verticalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.934f, 21.175f)
                curveTo(10.472f, 21.686f, 11.199f, 22f, 12f, 22f)
                curveTo(12.801f, 22f, 13.528f, 21.686f, 14.066f, 21.175f)
                curveTo(14.566f, 20.7f, 14.105f, 20f, 13.415f, 20f)
                horizontalLineTo(10.585f)
                curveTo(9.895f, 20f, 9.434f, 20.7f, 9.934f, 21.175f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9f)
                curveTo(19.657f, 9f, 21f, 7.657f, 21f, 6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                curveTo(16.343f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7.657f, 16.343f, 9f, 18f, 9f)
                close()
            }
        }.build()

        return bellBadge!!
    }

private var bellBadge: ImageVector? = null
