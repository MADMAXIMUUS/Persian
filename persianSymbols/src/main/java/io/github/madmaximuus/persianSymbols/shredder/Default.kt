package io.github.madmaximuus.persianSymbols.shredder

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Shredder: ImageVector
    get() {
        if (shredder != null) {
            return shredder!!
        }
        shredder = ImageVector.Builder(
            name = "shredder-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 4f)
                curveTo(7.119f, 4f, 6f, 5.119f, 6f, 6.5f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(6.5f)
                curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
                horizontalLineTo(13.172f)
                curveTo(13.967f, 2f, 14.73f, 2.316f, 15.293f, 2.879f)
                lineTo(19.121f, 6.707f)
                curveTo(19.684f, 7.27f, 20f, 8.033f, 20f, 8.828f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.896f, 10f, 12f, 9.105f, 12f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 12f)
                curveTo(3.343f, 12f, 2f, 13.343f, 2f, 15f)
                verticalLineTo(17f)
                curveTo(2f, 17.552f, 2.448f, 18f, 3f, 18f)
                curveTo(3.552f, 18f, 4f, 17.552f, 4f, 17f)
                verticalLineTo(15f)
                curveTo(4f, 14.448f, 4.448f, 14f, 5f, 14f)
                horizontalLineTo(19f)
                curveTo(19.552f, 14f, 20f, 14.448f, 20f, 15f)
                verticalLineTo(17f)
                curveTo(20f, 17.552f, 20.448f, 18f, 21f, 18f)
                curveTo(21.552f, 18f, 22f, 17.552f, 22f, 17f)
                verticalLineTo(15f)
                curveTo(22f, 13.343f, 20.657f, 12f, 19f, 12f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 17f)
                curveTo(7f, 16.448f, 6.552f, 16f, 6f, 16f)
                curveTo(5.448f, 16f, 5f, 16.448f, 5f, 17f)
                verticalLineTo(21f)
                curveTo(5f, 21.552f, 5.448f, 22f, 6f, 22f)
                curveTo(6.552f, 22f, 7f, 21.552f, 7f, 21f)
                verticalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16f)
                curveTo(17.448f, 16f, 17f, 16.448f, 17f, 17f)
                verticalLineTo(21f)
                curveTo(17f, 21.552f, 17.448f, 22f, 18f, 22f)
                curveTo(18.552f, 22f, 19f, 21.552f, 19f, 21f)
                verticalLineTo(17f)
                curveTo(19f, 16.448f, 18.552f, 16f, 18f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 17f)
                curveTo(10f, 16.448f, 9.552f, 16f, 9f, 16f)
                curveTo(8.448f, 16f, 8f, 16.448f, 8f, 17f)
                verticalLineTo(21f)
                curveTo(8f, 21.552f, 8.448f, 22f, 9f, 22f)
                curveTo(9.552f, 22f, 10f, 21.552f, 10f, 21f)
                verticalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16f)
                curveTo(12.552f, 16f, 13f, 16.448f, 13f, 17f)
                verticalLineTo(21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
                verticalLineTo(17f)
                curveTo(11f, 16.448f, 11.448f, 16f, 12f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 17f)
                curveTo(16f, 16.448f, 15.552f, 16f, 15f, 16f)
                curveTo(14.448f, 16f, 14f, 16.448f, 14f, 17f)
                verticalLineTo(21f)
                curveTo(14f, 21.552f, 14.448f, 22f, 15f, 22f)
                curveTo(15.552f, 22f, 16f, 21.552f, 16f, 21f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return shredder!!
    }

private var shredder: ImageVector? = null
