package io.github.madmaximuus.persianIcons.arrowCircleRight

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun arrowCircleRightDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "arrow-circle-right-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.2091f, 8.40327f)
                curveTo(11.5387f, 7.9601f, 12.1651f, 7.868f, 12.6083f, 8.1976f)
                lineTo(16.6122f, 11.175f)
                curveTo(16.7758f, 11.2967f, 16.8962f, 11.4638f, 16.961f, 11.6519f)
                curveTo(17.0015f, 11.761f, 17.0235f, 11.8791f, 17.0232f, 12.0023f)
                curveTo(17.0222f, 12.4041f, 16.7845f, 12.7499f, 16.4424f, 12.9081f)
                lineTo(12.6141f, 15.7981f)
                curveTo(12.1733f, 16.1309f, 11.5462f, 16.0433f, 11.2134f, 15.6025f)
                curveTo(10.8807f, 15.1617f, 10.9683f, 14.5346f, 11.4091f, 14.2019f)
                lineTo(13.0108f, 12.9927f)
                lineTo(8.01304f, 12.9807f)
                curveTo(7.4608f, 12.9794f, 7.0141f, 12.5306f, 7.0154f, 11.9783f)
                curveTo(7.0168f, 11.426f, 7.4656f, 10.9794f, 8.0178f, 10.9807f)
                lineTo(13.0154f, 10.9927f)
                lineTo(11.4148f, 9.80244f)
                curveTo(10.9717f, 9.4729f, 10.8796f, 8.8464f, 11.2091f, 8.4033f)
                close()
            }
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.9999f, 2f)
                curveTo(6.477f, 2f, 1.9999f, 6.4771f, 1.9999f, 12f)
                curveTo(1.9999f, 17.5228f, 6.477f, 22f, 11.9999f, 22f)
                curveTo(17.5227f, 22f, 21.9999f, 17.5228f, 21.9999f, 12f)
                curveTo(21.9999f, 6.4771f, 17.5227f, 2f, 11.9999f, 2f)
                close()
                moveTo(3.99988f, 12f)
                curveTo(3.9999f, 7.5817f, 7.5816f, 4f, 11.9999f, 4f)
                curveTo(16.4182f, 4f, 19.9999f, 7.5817f, 19.9999f, 12f)
                curveTo(19.9999f, 16.4183f, 16.4182f, 20f, 11.9999f, 20f)
                curveTo(7.5816f, 20f, 3.9999f, 16.4183f, 3.9999f, 12f)
                close()
            }
        }.build()
    }
}

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = arrowCircleRightDefault(),
                contentDescription = ""
            )
        }
    }
}