package io.github.madmaximuus.persianSymbols.key.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.KeySlash: ImageVector
    get() {
        if (keySlash != null) {
            return keySlash!!
        }
        keySlash = ImageVector.Builder(
            name = "key-slash-default",
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
                moveTo(1.998f, 12.013f)
                curveTo(1.998f, 9.974f, 3.218f, 8.221f, 4.967f, 7.442f)
                lineTo(6.568f, 9.043f)
                curveTo(5.115f, 9.252f, 3.998f, 10.502f, 3.998f, 12.013f)
                curveTo(3.998f, 13.669f, 5.341f, 15.013f, 6.998f, 15.013f)
                curveTo(8.095f, 15.013f, 9.068f, 14.402f, 9.594f, 13.497f)
                curveTo(9.773f, 13.189f, 10.102f, 13f, 10.458f, 13f)
                horizontalLineTo(10.525f)
                lineTo(12.525f, 15f)
                horizontalLineTo(10.993f)
                curveTo(10.085f, 16.207f, 8.639f, 17.013f, 6.998f, 17.013f)
                curveTo(4.237f, 17.013f, 1.998f, 14.774f, 1.998f, 12.013f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.293f, 13.293f)
                lineTo(16.03f, 13.555f)
                lineTo(19.394f, 16.919f)
                curveTo(19.609f, 16.827f, 19.787f, 16.661f, 19.894f, 16.448f)
                lineTo(21.894f, 12.461f)
                curveTo(21.964f, 12.322f, 22f, 12.168f, 22f, 12.013f)
                verticalLineTo(10.005f)
                curveTo(22f, 9.452f, 21.552f, 9.005f, 21f, 9.005f)
                horizontalLineTo(11.48f)
                lineTo(13.48f, 11.005f)
                horizontalLineTo(20f)
                verticalLineTo(11.776f)
                lineTo(18.727f, 14.313f)
                lineTo(17.707f, 13.293f)
                curveTo(17.317f, 12.902f, 16.683f, 12.902f, 16.293f, 13.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.961f, 13.263f)
                curveTo(7.652f, 13.263f, 8.211f, 12.703f, 8.211f, 12.013f)
                curveTo(8.211f, 11.322f, 7.652f, 10.763f, 6.961f, 10.763f)
                curveTo(6.271f, 10.763f, 5.711f, 11.322f, 5.711f, 12.013f)
                curveTo(5.711f, 12.703f, 6.271f, 13.263f, 6.961f, 13.263f)
                close()
            }
        }.build()

        return keySlash!!
    }

private var keySlash: ImageVector? = null