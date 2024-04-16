package io.github.madmaximuus.persianIcons.doNotDisturb

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
fun doNotDisturbDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "do-not-disturb-default",
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
                moveTo(7.99988f, 10.9999f)
                curveTo(7.4476f, 10.9999f, 6.9999f, 11.4476f, 6.9999f, 11.9999f)
                curveTo(6.9999f, 12.5522f, 7.4476f, 12.9999f, 7.9999f, 12.9999f)
                horizontalLineTo(15.9999f)
                curveTo(16.5522f, 12.9999f, 16.9999f, 12.5522f, 16.9999f, 11.9999f)
                curveTo(16.9999f, 11.4476f, 16.5522f, 10.9999f, 15.9999f, 10.9999f)
                horizontalLineTo(7.99988f)
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
                moveTo(12f, 1.99988f)
                curveTo(6.4771f, 1.9999f, 2f, 6.477f, 2f, 11.9999f)
                curveTo(2f, 17.5227f, 6.4771f, 21.9999f, 12f, 21.9999f)
                curveTo(17.5228f, 21.9999f, 22f, 17.5227f, 22f, 11.9999f)
                curveTo(22f, 6.477f, 17.5228f, 1.9999f, 12f, 1.9999f)
                close()
                moveTo(4f, 11.9999f)
                curveTo(4f, 7.5816f, 7.5817f, 3.9999f, 12f, 3.9999f)
                curveTo(16.4183f, 3.9999f, 20f, 7.5816f, 20f, 11.9999f)
                curveTo(20f, 16.4182f, 16.4183f, 19.9999f, 12f, 19.9999f)
                curveTo(7.5817f, 19.9999f, 4f, 16.4182f, 4f, 11.9999f)
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
                imageVector = doNotDisturbDefault(),
                contentDescription = ""
            )
        }
    }
}