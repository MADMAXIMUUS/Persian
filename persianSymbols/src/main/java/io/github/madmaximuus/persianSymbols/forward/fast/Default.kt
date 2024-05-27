package io.github.madmaximuus.persianSymbols.forward.fast

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ForwardFast: ImageVector
    get() {
        if (forwardFast != null) {
            return forwardFast!!
        }
        forwardFast = ImageVector.Builder(
            name = "forward-fast-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 7f)
                curveTo(21f, 6.4477f, 20.5523f, 6f, 20f, 6f)
                curveTo(19.4477f, 6f, 19f, 6.4477f, 19f, 7f)
                verticalLineTo(9.96383f)
                lineTo(13.5036f, 6.71137f)
                curveTo(12.5037f, 6.1197f, 11.2397f, 6.8404f, 11.2397f, 8.0023f)
                verticalLineTo(10.2476f)
                lineTo(5.2639f, 6.71137f)
                curveTo(4.264f, 6.1197f, 3f, 6.8404f, 3f, 8.0023f)
                verticalLineTo(16.0003f)
                curveTo(3f, 17.1621f, 4.264f, 17.8829f, 5.2639f, 17.2912f)
                lineTo(11.2397f, 13.755f)
                verticalLineTo(16.0003f)
                curveTo(11.2397f, 17.1621f, 12.5037f, 17.8829f, 13.5036f, 17.2912f)
                lineTo(19f, 14.0387f)
                verticalLineTo(17f)
                curveTo(19f, 17.5523f, 19.4477f, 18f, 20f, 18f)
                curveTo(20.5523f, 18f, 21f, 17.5523f, 21f, 17f)
                verticalLineTo(7f)
                close()
                moveTo(13.2397f, 15.1234f)
                lineTo(18.5158f, 12.0013f)
                lineTo(13.2397f, 8.87915f)
                verticalLineTo(15.1234f)
                close()
                moveTo(5f, 15.1234f)
                lineTo(10.2761f, 12.0013f)
                lineTo(5f, 8.87915f)
                verticalLineTo(15.1234f)
                close()
            }
        }.build()
        return forwardFast!!
    }

private var forwardFast: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ForwardFast,
                contentDescription = ""
            )
        }
    }
}