package io.github.madmaximuus.persianSymbols.rectangle.landscape.rotate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.RectangleLandscapeRotate: ImageVector
    get() {
        if (rectangleLandscapeRotate != null) {
            return rectangleLandscapeRotate!!
        }
        rectangleLandscapeRotate = ImageVector.Builder(
            name = "rectangle-landscape-rotate-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.334f, 8.198f)
                curveTo(3.029f, 7.737f, 2.409f, 7.611f, 1.948f, 7.916f)
                curveTo(1.488f, 8.221f, 1.361f, 8.841f, 1.666f, 9.302f)
                lineTo(3.652f, 12.302f)
                curveTo(3.837f, 12.581f, 4.149f, 12.749f, 4.483f, 12.75f)
                curveTo(4.817f, 12.751f, 5.13f, 12.585f, 5.316f, 12.307f)
                lineTo(7.33f, 9.307f)
                curveTo(7.638f, 8.849f, 7.516f, 8.227f, 7.057f, 7.919f)
                curveTo(6.599f, 7.612f, 5.978f, 7.734f, 5.67f, 8.192f)
                lineTo(5.5f, 8.445f)
                verticalLineTo(7.75f)
                curveTo(5.5f, 6.369f, 6.619f, 5.25f, 8f, 5.25f)
                horizontalLineTo(9.5f)
                curveTo(10.052f, 5.25f, 10.5f, 4.802f, 10.5f, 4.25f)
                curveTo(10.5f, 3.697f, 10.052f, 3.25f, 9.5f, 3.25f)
                horizontalLineTo(8f)
                curveTo(5.515f, 3.25f, 3.5f, 5.264f, 3.5f, 7.75f)
                verticalLineTo(8.449f)
                lineTo(3.334f, 8.198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 15f)
                curveTo(8.172f, 15f, 7.5f, 14.328f, 7.5f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(7.5f, 9.671f, 8.172f, 9f, 9f, 9f)
                horizontalLineTo(15f)
                curveTo(15.829f, 9f, 16.5f, 9.671f, 16.5f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(16.5f, 14.328f, 15.829f, 15f, 15f, 15f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.052f, 16.084f)
                curveTo(21.591f, 16.389f, 20.971f, 16.262f, 20.666f, 15.802f)
                lineTo(20.5f, 15.551f)
                verticalLineTo(16.25f)
                curveTo(20.5f, 18.735f, 18.485f, 20.75f, 16f, 20.75f)
                horizontalLineTo(14.5f)
                curveTo(13.948f, 20.75f, 13.5f, 20.302f, 13.5f, 19.75f)
                curveTo(13.5f, 19.198f, 13.948f, 18.75f, 14.5f, 18.75f)
                horizontalLineTo(16f)
                curveTo(17.381f, 18.75f, 18.5f, 17.631f, 18.5f, 16.25f)
                verticalLineTo(15.554f)
                lineTo(18.33f, 15.807f)
                curveTo(18.022f, 16.266f, 17.401f, 16.388f, 16.943f, 16.08f)
                curveTo(16.484f, 15.772f, 16.362f, 15.151f, 16.67f, 14.692f)
                lineTo(18.684f, 11.692f)
                curveTo(18.87f, 11.415f, 19.183f, 11.249f, 19.517f, 11.25f)
                curveTo(19.852f, 11.251f, 20.163f, 11.419f, 20.348f, 11.698f)
                lineTo(22.334f, 14.698f)
                curveTo(22.639f, 15.158f, 22.513f, 15.779f, 22.052f, 16.084f)
                close()
            }
        }.build()

        return rectangleLandscapeRotate!!
    }

private var rectangleLandscapeRotate: ImageVector? = null