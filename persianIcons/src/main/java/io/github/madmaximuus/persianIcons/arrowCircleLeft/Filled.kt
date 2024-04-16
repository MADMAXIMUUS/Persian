package io.github.madmaximuus.persianIcons.arrowCircleLeft

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
fun arrowCircleLeftFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "arrow-circle-left-filled",
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
                moveTo(12.8063f, 15.5967f)
                curveTo(12.4768f, 16.0399f, 11.8503f, 16.132f, 11.4071f, 15.8024f)
                lineTo(7.40326f, 12.825f)
                curveTo(7.2396f, 12.7033f, 7.1193f, 12.5362f, 7.0545f, 12.3481f)
                curveTo(7.014f, 12.239f, 6.992f, 12.1209f, 6.9922f, 11.9977f)
                curveTo(6.9932f, 11.5959f, 7.2309f, 11.2501f, 7.573f, 11.0919f)
                lineTo(11.4014f, 8.20188f)
                curveTo(11.8422f, 7.8691f, 12.4692f, 7.9567f, 12.802f, 8.3975f)
                curveTo(13.1347f, 8.8383f, 13.0472f, 9.4654f, 12.6064f, 9.7981f)
                lineTo(11.0046f, 11.0073f)
                lineTo(16.0024f, 11.0193f)
                curveTo(16.5547f, 11.0206f, 17.0013f, 11.4694f, 17f, 12.0217f)
                curveTo(16.9987f, 12.574f, 16.5499f, 13.0206f, 15.9976f, 13.0193f)
                lineTo(11f, 13.0073f)
                lineTo(12.6006f, 14.1976f)
                curveTo(13.0438f, 14.5271f, 13.1359f, 15.1536f, 12.8063f, 15.5967f)
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
                imageVector = arrowCircleLeftFilled(),
                contentDescription = ""
            )
        }
    }
}