package io.github.madmaximuus.persianSymbols.shredder

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                moveTo(19f, 10.75f)
                curveTo(19f, 11.164f, 18.664f, 11.5f, 18.25f, 11.5f)
                curveTo(17.836f, 11.5f, 17.5f, 11.164f, 17.5f, 10.75f)
                curveTo(17.5f, 10.336f, 17.836f, 10f, 18.25f, 10f)
                curveTo(18.664f, 10f, 19f, 10.336f, 19f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 7f)
                verticalLineTo(5f)
                curveTo(5f, 3.343f, 6.343f, 2f, 8f, 2f)
                horizontalLineTo(14.728f)
                curveTo(15.126f, 2f, 15.507f, 2.158f, 15.789f, 2.439f)
                lineTo(18.561f, 5.211f)
                curveTo(18.842f, 5.493f, 19f, 5.874f, 19f, 6.272f)
                verticalLineTo(7f)
                curveTo(20.657f, 7f, 22f, 8.343f, 22f, 10f)
                verticalLineTo(13f)
                curveTo(22f, 14.104f, 21.104f, 15f, 20f, 15f)
                horizontalLineTo(4f)
                curveTo(2.895f, 15f, 2f, 14.104f, 2f, 13f)
                verticalLineTo(10f)
                curveTo(2f, 8.343f, 3.343f, 7f, 5f, 7f)
                close()
                moveTo(7f, 5f)
                curveTo(7f, 4.448f, 7.448f, 4f, 8f, 4f)
                horizontalLineTo(14.521f)
                lineTo(17f, 6.479f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 9f)
                curveTo(4.448f, 9f, 4f, 9.448f, 4f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                curveTo(20f, 9.448f, 19.552f, 9f, 19f, 9f)
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
                moveTo(9f, 16f)
                curveTo(9.552f, 16f, 10f, 16.448f, 10f, 17f)
                verticalLineTo(21f)
                curveTo(10f, 21.552f, 9.552f, 22f, 9f, 22f)
                curveTo(8.448f, 22f, 8f, 21.552f, 8f, 21f)
                verticalLineTo(17f)
                curveTo(8f, 16.448f, 8.448f, 16f, 9f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 17f)
                curveTo(13f, 16.448f, 12.552f, 16f, 12f, 16f)
                curveTo(11.448f, 16f, 11f, 16.448f, 11f, 17f)
                verticalLineTo(21f)
                curveTo(11f, 21.552f, 11.448f, 22f, 12f, 22f)
                curveTo(12.552f, 22f, 13f, 21.552f, 13f, 21f)
                verticalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 16f)
                curveTo(15.552f, 16f, 16f, 16.448f, 16f, 17f)
                verticalLineTo(21f)
                curveTo(16f, 21.552f, 15.552f, 22f, 15f, 22f)
                curveTo(14.448f, 22f, 14f, 21.552f, 14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 16.448f, 14.448f, 16f, 15f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 17f)
                curveTo(19f, 16.448f, 18.552f, 16f, 18f, 16f)
                curveTo(17.448f, 16f, 17f, 16.448f, 17f, 17f)
                verticalLineTo(21f)
                curveTo(17f, 21.552f, 17.448f, 22f, 18f, 22f)
                curveTo(18.552f, 22f, 19f, 21.552f, 19f, 21f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return shredder!!
    }

private var shredder: ImageVector? = null
