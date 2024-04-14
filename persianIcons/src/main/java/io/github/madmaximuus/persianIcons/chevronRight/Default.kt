package io.github.madmaximuus.persianIcons.chevronRight

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
fun chevronRightDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "chevron-right-defaults",
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
                moveTo(11.0199f, 7.05788f)
                curveTo(10.6294f, 6.6674f, 9.9928f, 6.664f, 9.5982f, 7.0503f)
                curveTo(9.2035f, 7.4367f, 9.2002f, 8.0664f, 9.5907f, 8.457f)
                lineTo(13.1338f, 12.0001f)
                lineTo(9.59075f, 15.5431f)
                curveTo(9.2002f, 15.9337f, 9.2036f, 16.5634f, 9.5982f, 16.9498f)
                curveTo(9.9929f, 17.3361f, 10.6294f, 17.3327f, 11.0199f, 16.9422f)
                lineTo(15.2508f, 12.7113f)
                lineTo(15.255f, 12.7072f)
                curveTo(15.6497f, 12.3208f, 15.653f, 11.691f, 15.2625f, 11.3005f)
                lineTo(11.0199f, 7.05788f)
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
                imageVector = chevronRightDefault(),
                contentDescription = ""
            )
        }
    }
}
