package io.github.madmaximuus.persianIcons.chevronLeft

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
fun chevronLeftDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "chevron-left-default",
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
                moveTo(13.2353f, 17.2247f)
                curveTo(13.6258f, 17.6152f, 14.2623f, 17.6186f, 14.657f, 17.2323f)
                curveTo(15.0516f, 16.8459f, 15.055f, 16.2161f, 14.6644f, 15.8256f)
                lineTo(11.1214f, 12.2825f)
                lineTo(14.6644f, 8.73943f)
                curveTo(15.0549f, 8.3489f, 15.0516f, 7.7191f, 14.6569f, 7.3328f)
                curveTo(14.2622f, 6.9464f, 13.6257f, 6.9498f, 13.2352f, 7.3403f)
                lineTo(9.00435f, 11.5713f)
                lineTo(9.0001f, 11.5754f)
                curveTo(8.6054f, 11.9618f, 8.6021f, 12.5915f, 8.9926f, 12.9821f)
                lineTo(13.2353f, 17.2247f)
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
                imageVector = chevronLeftDefault(),
                contentDescription = ""
            )
        }
    }
}