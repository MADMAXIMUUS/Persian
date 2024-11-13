package io.github.madmaximuus.persianSymbols.shredder

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Shredder: ImageVector
    get() {
        if (shredder != null) {
            return shredder!!
        }
        shredder = ImageVector.Builder(
            name = "shredder-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 10f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 10f, 18f, 9.776f, 18f, 9.5f)
                verticalLineTo(9.143f)
                lineTo(12.857f, 4f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 4f, 12f, 4.224f, 12f, 4.5f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(5.5f)
                curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
                horizontalLineTo(13.474f)
                curveTo(13.994f, 2f, 14.495f, 2.203f, 14.868f, 2.566f)
                lineTo(19.394f, 6.967f)
                curveTo(19.781f, 7.343f, 20f, 7.86f, 20f, 8.401f)
                verticalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 14f)
                curveTo(22f, 12.895f, 21.105f, 12f, 20f, 12f)
                horizontalLineTo(4f)
                curveTo(2.895f, 12f, 2f, 12.895f, 2f, 14f)
                verticalLineTo(18f)
                curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
                curveTo(3.552f, 19f, 4f, 18.552f, 4f, 18f)
                verticalLineTo(17.5f)
                curveTo(4f, 16.672f, 4.672f, 16f, 5.5f, 16f)
                horizontalLineTo(18.5f)
                curveTo(19.328f, 16f, 20f, 16.672f, 20f, 17.5f)
                verticalLineTo(18f)
                curveTo(20f, 18.552f, 20.448f, 19f, 21f, 19f)
                curveTo(21.552f, 19f, 22f, 18.552f, 22f, 18f)
                verticalLineTo(14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 18f)
                curveTo(7f, 17.448f, 6.552f, 17f, 6f, 17f)
                curveTo(5.448f, 17f, 5f, 17.448f, 5f, 18f)
                verticalLineTo(21f)
                curveTo(5f, 21.552f, 5.448f, 22f, 6f, 22f)
                curveTo(6.552f, 22f, 7f, 21.552f, 7f, 21f)
                verticalLineTo(18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 17f)
                curveTo(17.448f, 17f, 17f, 17.448f, 17f, 18f)
                verticalLineTo(21f)
                curveTo(17f, 21.552f, 17.448f, 22f, 18f, 22f)
                curveTo(18.552f, 22f, 19f, 21.552f, 19f, 21f)
                verticalLineTo(18f)
                curveTo(19f, 17.448f, 18.552f, 17f, 18f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 18f)
                curveTo(10f, 17.448f, 9.552f, 17f, 9f, 17f)
                curveTo(8.448f, 17f, 8f, 17.448f, 8f, 18f)
                verticalLineTo(21f)
                curveTo(8f, 21.552f, 8.448f, 22f, 9f, 22f)
                curveTo(9.552f, 22f, 10f, 21.552f, 10f, 21f)
                verticalLineTo(18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17f)
                curveTo(12.552f, 17f, 13f, 17.448f, 13f, 18f)
                verticalLineTo(21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
                verticalLineTo(18f)
                curveTo(11f, 17.448f, 11.448f, 17f, 12f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 18f)
                curveTo(16f, 17.448f, 15.552f, 17f, 15f, 17f)
                curveTo(14.448f, 17f, 14f, 17.448f, 14f, 18f)
                verticalLineTo(21f)
                curveTo(14f, 21.552f, 14.448f, 22f, 15f, 22f)
                curveTo(15.552f, 22f, 16f, 21.552f, 16f, 21f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return shredder!!
    }

private var shredder: ImageVector? = null