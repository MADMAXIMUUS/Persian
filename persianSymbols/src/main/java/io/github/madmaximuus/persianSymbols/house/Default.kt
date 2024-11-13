package io.github.madmaximuus.persianSymbols.house

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.House: ImageVector
    get() {
        if (house != null) {
            return house!!
        }
        house = ImageVector.Builder(
            name = "home-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.386f, 2.211f)
                curveTo(11.747f, 1.93f, 12.253f, 1.93f, 12.614f, 2.211f)
                lineTo(21.614f, 9.211f)
                curveTo(22.05f, 9.55f, 22.128f, 10.179f, 21.789f, 10.615f)
                curveTo(21.45f, 11.051f, 20.822f, 11.129f, 20.386f, 10.79f)
                lineTo(20f, 10.49f)
                verticalLineTo(17.5f)
                curveTo(20f, 19.985f, 17.985f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                verticalLineTo(10.49f)
                lineTo(3.614f, 10.79f)
                curveTo(3.178f, 11.129f, 2.55f, 11.051f, 2.211f, 10.615f)
                curveTo(1.872f, 10.179f, 1.95f, 9.55f, 2.386f, 9.211f)
                lineTo(11.386f, 2.211f)
                close()
                moveTo(11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                close()
                moveTo(15f, 20f)
                verticalLineTo(15f)
                curveTo(15f, 13.895f, 14.105f, 13f, 13f, 13f)
                horizontalLineTo(11f)
                curveTo(9.895f, 13f, 9f, 13.895f, 9f, 15f)
                verticalLineTo(20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(8.934f)
                lineTo(12f, 4.267f)
                lineTo(18f, 8.934f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        return house!!
    }

private var house: ImageVector? = null