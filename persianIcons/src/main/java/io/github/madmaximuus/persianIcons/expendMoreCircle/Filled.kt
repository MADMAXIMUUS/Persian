package io.github.madmaximuus.persianIcons.expendMoreCircle

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
fun expendMoreCircleFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "expend-more-circle-filled",
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
                moveTo(7.95961f, 10.6264f)
                curveTo(8.3501f, 10.2359f, 8.9833f, 10.2359f, 9.3738f, 10.6264f)
                lineTo(12f, 13.2524f)
                lineTo(14.6261f, 10.6264f)
                curveTo(15.0167f, 10.2359f, 15.6499f, 10.2359f, 16.0404f, 10.6264f)
                curveTo(16.4309f, 11.0169f, 16.4309f, 11.6501f, 16.0404f, 12.0406f)
                lineTo(12.709f, 15.3719f)
                lineTo(12.7071f, 15.3737f)
                curveTo(12.3227f, 15.7581f, 11.7031f, 15.7642f, 11.3114f, 15.3918f)
                curveTo(11.3051f, 15.3858f, 11.299f, 15.3798f, 11.2929f, 15.3737f)
                lineTo(7.95961f, 12.0406f)
                curveTo(7.5691f, 11.6501f, 7.5691f, 11.0169f, 7.9596f, 10.6264f)
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
                imageVector = expendMoreCircleFilled(),
                contentDescription = ""
            )
        }
    }
}