package io.github.madmaximuus.persianSymbols.rectangle.portrait.rotate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.RectanglePortraitRotate: ImageVector
    get() {
        if (rectanglePortraitRotate != null) {
            return rectanglePortraitRotate!!
        }
        rectanglePortraitRotate = ImageVector.Builder(
            name = "rectangle-portrait-rotate-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.802f, 3.334f)
                curveTo(16.263f, 3.029f, 16.389f, 2.408f, 16.084f, 1.948f)
                curveTo(15.779f, 1.487f, 15.158f, 1.361f, 14.698f, 1.666f)
                lineTo(11.698f, 3.652f)
                curveTo(11.419f, 3.837f, 11.251f, 4.148f, 11.25f, 4.483f)
                curveTo(11.249f, 4.817f, 11.415f, 5.13f, 11.693f, 5.316f)
                lineTo(14.693f, 7.33f)
                curveTo(15.151f, 7.638f, 15.772f, 7.516f, 16.08f, 7.057f)
                curveTo(16.388f, 6.599f, 16.266f, 5.977f, 15.807f, 5.67f)
                lineTo(15.554f, 5.5f)
                horizontalLineTo(16.25f)
                curveTo(17.631f, 5.5f, 18.75f, 6.619f, 18.75f, 8f)
                verticalLineTo(9.5f)
                curveTo(18.75f, 10.052f, 19.198f, 10.5f, 19.75f, 10.5f)
                curveTo(20.302f, 10.5f, 20.75f, 10.052f, 20.75f, 9.5f)
                verticalLineTo(8f)
                curveTo(20.75f, 5.515f, 18.735f, 3.5f, 16.25f, 3.5f)
                horizontalLineTo(15.551f)
                lineTo(15.802f, 3.334f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 8.8f)
                curveTo(9f, 7.806f, 9.806f, 7f, 10.8f, 7f)
                horizontalLineTo(13.2f)
                curveTo(14.194f, 7f, 15f, 7.806f, 15f, 8.8f)
                verticalLineTo(15.2f)
                curveTo(15f, 16.194f, 14.194f, 17f, 13.2f, 17f)
                horizontalLineTo(10.8f)
                curveTo(9.806f, 17f, 9f, 16.194f, 9f, 15.2f)
                verticalLineTo(8.8f)
                close()
                moveTo(11f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.916f, 22.052f)
                curveTo(7.611f, 21.591f, 7.737f, 20.971f, 8.198f, 20.666f)
                lineTo(8.449f, 20.5f)
                horizontalLineTo(7.75f)
                curveTo(5.265f, 20.5f, 3.25f, 18.485f, 3.25f, 16f)
                verticalLineTo(14.5f)
                curveTo(3.25f, 13.948f, 3.698f, 13.5f, 4.25f, 13.5f)
                curveTo(4.802f, 13.5f, 5.25f, 13.948f, 5.25f, 14.5f)
                verticalLineTo(16f)
                curveTo(5.25f, 17.381f, 6.369f, 18.5f, 7.75f, 18.5f)
                horizontalLineTo(8.445f)
                lineTo(8.193f, 18.33f)
                curveTo(7.734f, 18.022f, 7.612f, 17.401f, 7.92f, 16.942f)
                curveTo(8.228f, 16.484f, 8.849f, 16.362f, 9.307f, 16.67f)
                lineTo(12.307f, 18.684f)
                curveTo(12.585f, 18.87f, 12.751f, 19.183f, 12.75f, 19.517f)
                curveTo(12.749f, 19.851f, 12.581f, 20.163f, 12.302f, 20.348f)
                lineTo(9.302f, 22.334f)
                curveTo(8.841f, 22.639f, 8.221f, 22.512f, 7.916f, 22.052f)
                close()
            }
        }.build()

        return rectanglePortraitRotate!!
    }

private var rectanglePortraitRotate: ImageVector? = null