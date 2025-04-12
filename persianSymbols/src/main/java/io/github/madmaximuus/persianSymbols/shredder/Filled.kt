package io.github.madmaximuus.persianSymbols.shredder

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(4.6f)
                curveTo(5f, 3.164f, 6.164f, 2f, 7.6f, 2f)
                horizontalLineTo(15.13f)
                curveTo(15.369f, 2f, 15.6f, 2.085f, 15.781f, 2.241f)
                lineTo(18.476f, 4.551f)
                curveTo(18.809f, 4.836f, 19f, 5.252f, 19f, 5.69f)
                verticalLineTo(6f)
                close()
                moveTo(15.163f, 3.13f)
                lineTo(17.277f, 4.822f)
                curveTo(17.351f, 4.881f, 17.309f, 5f, 17.215f, 5f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 5f, 15f, 4.776f, 15f, 4.5f)
                verticalLineTo(3.208f)
                curveTo(15f, 3.124f, 15.097f, 3.078f, 15.163f, 3.13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.6f, 7f)
                horizontalLineTo(19.4f)
                curveTo(20.836f, 7f, 22f, 8.164f, 22f, 9.6f)
                verticalLineTo(13.5f)
                curveTo(22f, 14.328f, 21.328f, 15f, 20.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.671f, 15f, 2f, 14.328f, 2f, 13.5f)
                verticalLineTo(9.6f)
                curveTo(2f, 8.164f, 3.164f, 7f, 4.6f, 7f)
                close()
                moveTo(18.25f, 11.5f)
                curveTo(18.664f, 11.5f, 19f, 11.164f, 19f, 10.75f)
                curveTo(19f, 10.336f, 18.664f, 10f, 18.25f, 10f)
                curveTo(17.836f, 10f, 17.5f, 10.336f, 17.5f, 10.75f)
                curveTo(17.5f, 11.164f, 17.836f, 11.5f, 18.25f, 11.5f)
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