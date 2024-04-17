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
fun arrowCircleRightFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "arrow-circle-right-filled",
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 6.4771f, 17.5228f, 2f, 12f, 2f)
                curveTo(6.4771f, 2f, 2f, 6.4771f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.4771f, 22f, 12f, 22f)
                close()
                moveTo(11.1937f, 8.40327f)
                curveTo(11.5232f, 7.9601f, 12.1497f, 7.868f, 12.5929f, 8.1976f)
                lineTo(16.5967f, 11.175f)
                curveTo(16.7604f, 11.2967f, 16.8807f, 11.4638f, 16.9455f, 11.6519f)
                curveTo(16.986f, 11.761f, 17.0081f, 11.8791f, 17.0078f, 12.0023f)
                curveTo(17.0068f, 12.4041f, 16.7691f, 12.7499f, 16.427f, 12.9081f)
                lineTo(12.5986f, 15.7981f)
                curveTo(12.1578f, 16.1309f, 11.5308f, 16.0433f, 11.198f, 15.6025f)
                curveTo(10.8653f, 15.1617f, 10.9528f, 14.5346f, 11.3936f, 14.2019f)
                lineTo(12.9954f, 12.9927f)
                lineTo(7.9976f, 12.9807f)
                curveTo(7.4453f, 12.9794f, 6.9987f, 12.5306f, 7f, 11.9783f)
                curveTo(7.0013f, 11.426f, 7.4501f, 10.9794f, 8.0024f, 10.9807f)
                lineTo(13f, 10.9927f)
                lineTo(11.3994f, 9.80244f)
                curveTo(10.9562f, 9.4729f, 10.8641f, 8.8464f, 11.1937f, 8.4033f)
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
                imageVector = arrowCircleRightFilled(),
                contentDescription = ""
            )
        }
    }
}