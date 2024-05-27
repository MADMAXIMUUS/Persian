package io.github.madmaximuus.persianSymbols.forward.step

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

val PersianSymbols.Default.ForwardStep: ImageVector
    get() {
        if (forwardStep != null) {
            return forwardStep!!
        }
        forwardStep = ImageVector.Builder(
            name = "forward-step-default",
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
                moveTo(16.8801f, 7f)
                curveTo(16.8801f, 6.4477f, 16.4324f, 6f, 15.8801f, 6f)
                curveTo(15.3278f, 6f, 14.8801f, 6.4477f, 14.8801f, 7f)
                verticalLineTo(9.96383f)
                lineTo(9.38377f, 6.71137f)
                curveTo(8.3839f, 6.1197f, 7.1199f, 6.8404f, 7.1199f, 8.0023f)
                verticalLineTo(16.0003f)
                curveTo(7.1199f, 17.1621f, 8.3839f, 17.8829f, 9.3838f, 17.2912f)
                lineTo(14.8801f, 14.0387f)
                verticalLineTo(17f)
                curveTo(14.8801f, 17.5523f, 15.3278f, 18f, 15.8801f, 18f)
                curveTo(16.4324f, 18f, 16.8801f, 17.5523f, 16.8801f, 17f)
                verticalLineTo(7f)
                close()
                moveTo(14.396f, 12.0013f)
                lineTo(9.11987f, 15.1234f)
                verticalLineTo(8.87915f)
                lineTo(14.396f, 12.0013f)
                close()
            }
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
                moveTo(16.8801f, 7f)
                curveTo(16.8801f, 6.4477f, 16.4324f, 6f, 15.8801f, 6f)
                curveTo(15.3278f, 6f, 14.8801f, 6.4477f, 14.8801f, 7f)
                verticalLineTo(9.96383f)
                lineTo(9.38377f, 6.71137f)
                curveTo(8.3839f, 6.1197f, 7.1199f, 6.8404f, 7.1199f, 8.0023f)
                verticalLineTo(16.0003f)
                curveTo(7.1199f, 17.1621f, 8.3839f, 17.8829f, 9.3838f, 17.2912f)
                lineTo(14.8801f, 14.0387f)
                verticalLineTo(17f)
                curveTo(14.8801f, 17.5523f, 15.3278f, 18f, 15.8801f, 18f)
                curveTo(16.4324f, 18f, 16.8801f, 17.5523f, 16.8801f, 17f)
                verticalLineTo(7f)
                close()
                moveTo(14.396f, 12.0013f)
                lineTo(9.11987f, 15.1234f)
                verticalLineTo(8.87915f)
                lineTo(14.396f, 12.0013f)
                close()
            }
        }.build()
        return forwardStep!!
    }

private var forwardStep: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ForwardStep,
                contentDescription = ""
            )
        }
    }
}