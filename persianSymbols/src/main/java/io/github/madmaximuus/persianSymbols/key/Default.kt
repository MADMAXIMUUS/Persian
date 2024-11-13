package io.github.madmaximuus.persianSymbols.key

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Key: ImageVector
    get() {
        if (key != null) {
            return key!!
        }
        key = Builder(
            name = "key-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.961f, 13.263f)
                curveTo(7.652f, 13.263f, 8.211f, 12.703f, 8.211f, 12.013f)
                curveTo(8.211f, 11.323f, 7.652f, 10.763f, 6.961f, 10.763f)
                curveTo(6.271f, 10.763f, 5.711f, 11.323f, 5.711f, 12.013f)
                curveTo(5.711f, 12.703f, 6.271f, 13.263f, 6.961f, 13.263f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.998f, 7.013f)
                curveTo(4.237f, 7.013f, 1.998f, 9.251f, 1.998f, 12.013f)
                curveTo(1.998f, 14.774f, 4.237f, 17.013f, 6.998f, 17.013f)
                curveTo(8.639f, 17.013f, 10.085f, 16.207f, 10.993f, 15f)
                horizontalLineTo(12.586f)
                lineTo(14.293f, 16.707f)
                curveTo(14.683f, 17.098f, 15.317f, 17.098f, 15.707f, 16.707f)
                lineTo(17f, 15.414f)
                lineTo(18.293f, 16.707f)
                curveTo(18.52f, 16.934f, 18.842f, 17.038f, 19.16f, 16.987f)
                curveTo(19.477f, 16.936f, 19.75f, 16.736f, 19.894f, 16.448f)
                lineTo(21.894f, 12.461f)
                curveTo(21.964f, 12.322f, 22f, 12.168f, 22f, 12.013f)
                verticalLineTo(10.005f)
                curveTo(22f, 9.453f, 21.552f, 9.005f, 21f, 9.005f)
                horizontalLineTo(10.992f)
                curveTo(10.081f, 7.796f, 8.631f, 7.013f, 6.998f, 7.013f)
                close()
                moveTo(3.998f, 12.013f)
                curveTo(3.998f, 10.356f, 5.341f, 9.013f, 6.998f, 9.013f)
                curveTo(8.105f, 9.013f, 9.073f, 9.612f, 9.594f, 10.508f)
                curveTo(9.773f, 10.815f, 10.102f, 11.005f, 10.458f, 11.005f)
                horizontalLineTo(20f)
                verticalLineTo(11.776f)
                lineTo(18.727f, 14.313f)
                lineTo(17.707f, 13.293f)
                curveTo(17.317f, 12.902f, 16.683f, 12.902f, 16.293f, 13.293f)
                lineTo(15f, 14.586f)
                lineTo(13.707f, 13.293f)
                curveTo(13.52f, 13.105f, 13.265f, 13f, 13f, 13f)
                horizontalLineTo(10.458f)
                curveTo(10.102f, 13f, 9.773f, 13.189f, 9.594f, 13.497f)
                curveTo(9.068f, 14.402f, 8.095f, 15.013f, 6.998f, 15.013f)
                curveTo(5.341f, 15.013f, 3.998f, 13.67f, 3.998f, 12.013f)
                close()
            }
        }.build()
        return key!!
    }

private var key: ImageVector? = null