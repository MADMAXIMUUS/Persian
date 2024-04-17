package io.github.madmaximuus.persianIcons.arrowCircleDown

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
fun arrowCircleDownFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "arrow-circle-down-filled",
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
                moveTo(15.5967f, 11.1937f)
                curveTo(16.0399f, 11.5232f, 16.132f, 12.1497f, 15.8024f, 12.5929f)
                lineTo(12.825f, 16.5967f)
                curveTo(12.7033f, 16.7604f, 12.5362f, 16.8807f, 12.3481f, 16.9455f)
                curveTo(12.239f, 16.986f, 12.1209f, 17.0081f, 11.9977f, 17.0078f)
                curveTo(11.5959f, 17.0068f, 11.2501f, 16.7691f, 11.0919f, 16.427f)
                lineTo(8.20188f, 12.5986f)
                curveTo(7.8691f, 12.1578f, 7.9567f, 11.5308f, 8.3975f, 11.198f)
                curveTo(8.8383f, 10.8653f, 9.4654f, 10.9528f, 9.7981f, 11.3936f)
                lineTo(11.0073f, 12.9954f)
                lineTo(11.0193f, 7.9976f)
                curveTo(11.0206f, 7.4453f, 11.4694f, 6.9987f, 12.0217f, 7f)
                curveTo(12.574f, 7.0013f, 13.0206f, 7.4501f, 13.0193f, 8.0024f)
                lineTo(13.0073f, 13f)
                lineTo(14.1976f, 11.3994f)
                curveTo(14.5271f, 10.9562f, 15.1536f, 10.8641f, 15.5967f, 11.1937f)
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
                imageVector = arrowCircleDownFilled(),
                contentDescription = ""
            )
        }
    }
}