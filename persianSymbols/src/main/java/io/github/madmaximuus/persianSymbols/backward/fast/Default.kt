package io.github.madmaximuus.persianSymbols.backward.fast

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

val PersianSymbols.Default.BackwardFast: ImageVector
    get() {
        if (backwardFast != null) {
            return backwardFast!!
        }
        backwardFast = ImageVector.Builder(
            name = "backward-fast-default",
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
                moveTo(4.50122f, 7f)
                curveTo(4.5012f, 6.4477f, 4.0535f, 6f, 3.5012f, 6f)
                curveTo(2.9489f, 6f, 2.5012f, 6.4477f, 2.5012f, 7f)
                verticalLineTo(17f)
                curveTo(2.5012f, 17.5523f, 2.9489f, 18f, 3.5012f, 18f)
                curveTo(4.0535f, 18f, 4.5012f, 17.5523f, 4.5012f, 17f)
                verticalLineTo(13.4484f)
                lineTo(10.9953f, 17.2912f)
                curveTo(11.9952f, 17.8829f, 13.2592f, 17.1621f, 13.2592f, 16.0003f)
                verticalLineTo(13.755f)
                lineTo(19.235f, 17.2912f)
                curveTo(20.2349f, 17.8829f, 21.4989f, 17.1621f, 21.4989f, 16.0003f)
                verticalLineTo(8.00229f)
                curveTo(21.4989f, 6.8404f, 20.2349f, 6.1197f, 19.235f, 6.7114f)
                lineTo(13.2592f, 10.2476f)
                verticalLineTo(8.00229f)
                curveTo(13.2592f, 6.8404f, 11.9952f, 6.1197f, 10.9953f, 6.7114f)
                lineTo(4.50122f, 10.5542f)
                verticalLineTo(7f)
                close()
                moveTo(11.2592f, 8.87915f)
                verticalLineTo(15.1234f)
                lineTo(5.98303f, 12.0013f)
                lineTo(11.2592f, 8.87915f)
                close()
                moveTo(19.4989f, 8.87915f)
                verticalLineTo(15.1234f)
                lineTo(14.2227f, 12.0013f)
                lineTo(19.4989f, 8.87915f)
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
                moveTo(4.50122f, 7f)
                curveTo(4.5012f, 6.4477f, 4.0535f, 6f, 3.5012f, 6f)
                curveTo(2.9489f, 6f, 2.5012f, 6.4477f, 2.5012f, 7f)
                verticalLineTo(17f)
                curveTo(2.5012f, 17.5523f, 2.9489f, 18f, 3.5012f, 18f)
                curveTo(4.0535f, 18f, 4.5012f, 17.5523f, 4.5012f, 17f)
                verticalLineTo(13.4484f)
                lineTo(10.9953f, 17.2912f)
                curveTo(11.9952f, 17.8829f, 13.2592f, 17.1621f, 13.2592f, 16.0003f)
                verticalLineTo(13.755f)
                lineTo(19.235f, 17.2912f)
                curveTo(20.2349f, 17.8829f, 21.4989f, 17.1621f, 21.4989f, 16.0003f)
                verticalLineTo(8.00229f)
                curveTo(21.4989f, 6.8404f, 20.2349f, 6.1197f, 19.235f, 6.7114f)
                lineTo(13.2592f, 10.2476f)
                verticalLineTo(8.00229f)
                curveTo(13.2592f, 6.8404f, 11.9952f, 6.1197f, 10.9953f, 6.7114f)
                lineTo(4.50122f, 10.5542f)
                verticalLineTo(7f)
                close()
                moveTo(11.2592f, 15.1234f)
                lineTo(5.98303f, 12.0013f)
                lineTo(11.2592f, 8.87915f)
                verticalLineTo(15.1234f)
                close()
                moveTo(19.4989f, 15.1234f)
                lineTo(14.2227f, 12.0013f)
                lineTo(19.4989f, 8.87915f)
                verticalLineTo(15.1234f)
                close()
            }
        }.build()
        return backwardFast!!
    }

private var backwardFast: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BackwardFast,
                contentDescription = ""
            )
        }
    }
}