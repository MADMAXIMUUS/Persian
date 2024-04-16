package io.github.madmaximuus.persianIcons.arrowCircleUp

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
fun arrowCircleUpFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "arrow-circle-up-filled",
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
                moveTo(8.40329f, 12.8063f)
                curveTo(7.9601f, 12.4768f, 7.868f, 11.8503f, 8.1976f, 11.4071f)
                lineTo(11.175f, 7.40326f)
                curveTo(11.2968f, 7.2396f, 11.4638f, 7.1193f, 11.6519f, 7.0545f)
                curveTo(11.761f, 7.014f, 11.8791f, 6.992f, 12.0024f, 6.9922f)
                curveTo(12.4041f, 6.9932f, 12.7499f, 7.2309f, 12.9081f, 7.573f)
                lineTo(15.7981f, 11.4014f)
                curveTo(16.1309f, 11.8422f, 16.0433f, 12.4692f, 15.6025f, 12.802f)
                curveTo(15.1617f, 13.1347f, 14.5347f, 13.0472f, 14.2019f, 12.6064f)
                lineTo(12.9927f, 11.0046f)
                lineTo(12.9807f, 16.0024f)
                curveTo(12.9794f, 16.5547f, 12.5306f, 17.0013f, 11.9783f, 17f)
                curveTo(11.426f, 16.9987f, 10.9794f, 16.5499f, 10.9807f, 15.9976f)
                lineTo(10.9927f, 11f)
                lineTo(9.80246f, 12.6006f)
                curveTo(9.4729f, 13.0438f, 8.8465f, 13.1359f, 8.4033f, 12.8063f)
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
                imageVector = arrowCircleUpFilled(),
                contentDescription = ""
            )
        }
    }
}