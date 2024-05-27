package io.github.madmaximuus.persianSymbols.backward.step

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

val PersianSymbols.Default.BackwardStep: ImageVector
    get() {
        if (backwardStep != null) {
            return backwardStep!!
        }
        backwardStep = ImageVector.Builder(
            name = "backward-step-default",
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
                moveTo(8.62109f, 7f)
                curveTo(8.6211f, 6.4477f, 8.1734f, 6f, 7.6211f, 6f)
                curveTo(7.0688f, 6f, 6.6211f, 6.4477f, 6.6211f, 7f)
                verticalLineTo(17f)
                curveTo(6.6211f, 17.5523f, 7.0688f, 18f, 7.6211f, 18f)
                curveTo(8.1734f, 18f, 8.6211f, 17.5523f, 8.6211f, 17f)
                verticalLineTo(13.4484f)
                lineTo(15.1151f, 17.2912f)
                curveTo(16.115f, 17.8829f, 17.379f, 17.1621f, 17.379f, 16.0003f)
                verticalLineTo(8.00229f)
                curveTo(17.379f, 6.8404f, 16.115f, 6.1197f, 15.1151f, 6.7114f)
                lineTo(8.62109f, 10.5542f)
                verticalLineTo(7f)
                close()
                moveTo(10.1029f, 12.0013f)
                lineTo(15.379f, 15.1234f)
                verticalLineTo(8.87915f)
                lineTo(10.1029f, 12.0013f)
                close()
            }
        }.build()
        return backwardStep!!
    }

private var backwardStep: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BackwardStep,
                contentDescription = ""
            )
        }
    }
}