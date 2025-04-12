package io.github.madmaximuus.persianSymbols.bolt.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BoltSlash: ImageVector
    get() {
        if (boltSlash != null) {
            return boltSlash!!
        }
        boltSlash = ImageVector.Builder(
            name = "bolt-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.156f, 13.464f)
                lineTo(8.032f, 10.507f)
                lineTo(9.481f, 11.956f)
                lineTo(8.819f, 13f)
                horizontalLineTo(10.525f)
                lineTo(11.949f, 14.424f)
                lineTo(11.639f, 16.546f)
                lineTo(12.586f, 15.061f)
                lineTo(14.035f, 16.509f)
                lineTo(10.82f, 21.549f)
                curveTo(10.567f, 21.947f, 10.07f, 22.114f, 9.628f, 21.949f)
                curveTo(9.186f, 21.785f, 8.919f, 21.334f, 8.987f, 20.868f)
                lineTo(9.844f, 15f)
                horizontalLineTo(7f)
                curveTo(6.635f, 15f, 6.299f, 14.801f, 6.124f, 14.482f)
                curveTo(5.948f, 14.162f, 5.96f, 13.772f, 6.156f, 13.464f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.347f, 7.441f)
                lineTo(12.05f, 9.575f)
                lineTo(13.475f, 11f)
                horizontalLineTo(15.176f)
                lineTo(14.514f, 12.039f)
                lineTo(15.962f, 13.487f)
                lineTo(17.843f, 10.538f)
                curveTo(18.039f, 10.23f, 18.052f, 9.839f, 17.877f, 9.519f)
                curveTo(17.701f, 9.199f, 17.365f, 9f, 17f, 9f)
                horizontalLineTo(14.149f)
                lineTo(14.963f, 3.15f)
                curveTo(15.028f, 2.684f, 14.759f, 2.235f, 14.317f, 2.073f)
                curveTo(13.875f, 1.911f, 13.38f, 2.079f, 13.128f, 2.476f)
                lineTo(9.954f, 7.479f)
                lineTo(11.403f, 8.928f)
                lineTo(12.347f, 7.441f)
                close()
            }
        }.build()

        return boltSlash!!
    }

private var boltSlash: ImageVector? = null
