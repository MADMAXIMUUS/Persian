package io.github.madmaximuus.persianSymbols.arrow.right.circle

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

val PersianSymbols.Default.ArrowRightCircle: ImageVector
    get() {
        if (arrowRightCircle != null) {
            return arrowRightCircle!!
        }
        arrowRightCircle = ImageVector.Builder(
            name = "arrow-right-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.2091f, 8.4033f)
                curveTo(11.5387f, 7.9601f, 12.1651f, 7.868f, 12.6083f, 8.1976f)
                lineTo(16.6122f, 11.175f)
                curveTo(16.7758f, 11.2967f, 16.8962f, 11.4638f, 16.961f, 11.6519f)
                curveTo(17.0015f, 11.761f, 17.0235f, 11.8791f, 17.0232f, 12.0023f)
                curveTo(17.0222f, 12.4041f, 16.7845f, 12.7499f, 16.4424f, 12.9081f)
                lineTo(12.6141f, 15.7981f)
                curveTo(12.1733f, 16.1309f, 11.5462f, 16.0433f, 11.2134f, 15.6025f)
                curveTo(10.8807f, 15.1617f, 10.9683f, 14.5346f, 11.4091f, 14.2019f)
                lineTo(13.0108f, 12.9927f)
                lineTo(8.013f, 12.9807f)
                curveTo(7.4608f, 12.9794f, 7.0141f, 12.5306f, 7.0154f, 11.9783f)
                curveTo(7.0168f, 11.426f, 7.4656f, 10.9794f, 8.0178f, 10.9807f)
                lineTo(13.0154f, 10.9927f)
                lineTo(11.4148f, 9.8024f)
                curveTo(10.9717f, 9.4729f, 10.8796f, 8.8464f, 11.2091f, 8.4033f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.9999f, 2.0f)
                curveTo(6.477f, 2.0f, 1.9999f, 6.4771f, 1.9999f, 12.0f)
                curveTo(1.9999f, 17.5228f, 6.477f, 22.0f, 11.9999f, 22.0f)
                curveTo(17.5227f, 22.0f, 21.9999f, 17.5228f, 21.9999f, 12.0f)
                curveTo(21.9999f, 6.4771f, 17.5227f, 2.0f, 11.9999f, 2.0f)
                close()
                moveTo(3.9999f, 12.0f)
                curveTo(3.9999f, 7.5817f, 7.5816f, 4.0f, 11.9999f, 4.0f)
                curveTo(16.4182f, 4.0f, 19.9999f, 7.5817f, 19.9999f, 12.0f)
                curveTo(19.9999f, 16.4183f, 16.4182f, 20.0f, 11.9999f, 20.0f)
                curveTo(7.5816f, 20.0f, 3.9999f, 16.4183f, 3.9999f, 12.0f)
                close()
            }
        }.build()
        return arrowRightCircle!!
    }

private var arrowRightCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowRightCircle,
                contentDescription = ""
            )
        }
    }
}