package io.github.madmaximuus.persianIcons.bolt

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
fun boltFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "bolt-filled",
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
                moveTo(6.89609f, 14.2376f)
                curveTo(6.494f, 14.2376f, 6.2564f, 13.7871f, 6.4834f, 13.4553f)
                lineTo(13.1582f, 3.69852f)
                curveTo(13.458f, 3.2602f, 14.1441f, 3.5299f, 14.0653f, 4.055f)
                lineTo(13.2976f, 9.17212f)
                curveTo(13.2522f, 9.4744f, 13.4864f, 9.7463f, 13.7921f, 9.7463f)
                horizontalLineTo(17.103f)
                curveTo(17.5056f, 9.7463f, 17.7431f, 10.1978f, 17.515f, 10.5296f)
                lineTo(10.8003f, 20.2953f)
                curveTo(10.4987f, 20.7339f, 9.8116f, 20.4602f, 9.8943f, 19.9343f)
                lineTo(10.6995f, 14.8153f)
                curveTo(10.7472f, 14.5119f, 10.5127f, 14.2376f, 10.2056f, 14.2376f)
                horizontalLineTo(6.89609f)
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
                imageVector = boltFilled(),
                contentDescription = ""
            )
        }
    }
}