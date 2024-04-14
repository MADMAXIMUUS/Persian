package io.github.madmaximuus.persianIcons.check

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
fun checkDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "Check",
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
                moveTo(19.1447f, 8.38224f)
                curveTo(19.5352f, 7.9917f, 19.5022f, 7.3953f, 19.0711f, 7.0502f)
                curveTo(18.6399f, 6.7051f, 17.9738f, 6.7419f, 17.5832f, 7.1324f)
                lineTo(9.87869f, 14.837f)
                lineTo(6.41671f, 11.375f)
                curveTo(6.0262f, 10.9845f, 5.3601f, 10.9477f, 4.9289f, 11.2928f)
                curveTo(4.4978f, 11.638f, 4.4649f, 12.2344f, 4.8554f, 12.6249f)
                lineTo(8.99044f, 16.76f)
                curveTo(9.0398f, 16.8287f, 9.1003f, 16.8927f, 9.1716f, 16.9497f)
                curveTo(9.3732f, 17.1112f, 9.6263f, 17.189f, 9.8786f, 17.1862f)
                curveTo(10.1309f, 17.1891f, 10.3841f, 17.1112f, 10.5858f, 16.9497f)
                curveTo(10.657f, 16.8927f, 10.7174f, 16.8288f, 10.7667f, 16.7601f)
                lineTo(19.1447f, 8.38224f)
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
                imageVector = checkDefault(),
                contentDescription = ""
            )
        }
    }
}