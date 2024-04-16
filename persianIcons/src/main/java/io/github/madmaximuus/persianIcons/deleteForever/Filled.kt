package io.github.madmaximuus.persianIcons.deleteForever

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
fun deleteForeverFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "delete-forever-filled",
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
                moveTo(6.99983f, 3.99994f)
                curveTo(6.9998f, 3.4476f, 7.4475f, 2.9999f, 7.9998f, 2.9999f)
                horizontalLineTo(15.9998f)
                curveTo(16.5521f, 2.9999f, 16.9998f, 3.4476f, 16.9998f, 3.9999f)
                lineTo(20f, 4.00018f)
                curveTo(20.5523f, 4.0002f, 21f, 4.4479f, 21f, 5.0002f)
                curveTo(21f, 5.5525f, 20.5523f, 6.0002f, 20f, 6.0002f)
                verticalLineTo(17.6002f)
                curveTo(20f, 20.0302f, 18.0301f, 22.0002f, 15.6f, 22.0002f)
                horizontalLineTo(8.4f)
                curveTo(5.9699f, 22.0002f, 4f, 20.0302f, 4f, 17.6002f)
                verticalLineTo(6.00018f)
                curveTo(3.4477f, 6.0002f, 3f, 5.5525f, 3f, 5.0002f)
                curveTo(3f, 4.4479f, 3.4477f, 4.0002f, 4f, 4.0002f)
                lineTo(6.99983f, 3.99994f)
                close()
                moveTo(8.29265f, 9.29302f)
                curveTo(8.6832f, 8.9025f, 9.3163f, 8.9025f, 9.7069f, 9.293f)
                lineTo(11.9998f, 11.5859f)
                lineTo(14.2926f, 9.29302f)
                curveTo(14.6832f, 8.9025f, 15.3163f, 8.9025f, 15.7069f, 9.293f)
                curveTo(16.0974f, 9.6835f, 16.0974f, 10.3167f, 15.7069f, 10.7072f)
                lineTo(13.414f, 13.0001f)
                lineTo(15.7069f, 15.293f)
                curveTo(16.0974f, 15.6835f, 16.0974f, 16.3167f, 15.7069f, 16.7072f)
                curveTo(15.3163f, 17.0978f, 14.6832f, 17.0978f, 14.2926f, 16.7072f)
                lineTo(11.9998f, 14.4143f)
                lineTo(9.70686f, 16.7072f)
                curveTo(9.3163f, 17.0978f, 8.6832f, 17.0978f, 8.2927f, 16.7072f)
                curveTo(7.9021f, 16.3167f, 7.9021f, 15.6835f, 8.2927f, 15.293f)
                lineTo(10.5855f, 13.0001f)
                lineTo(8.29265f, 10.7072f)
                curveTo(7.9021f, 10.3167f, 7.9021f, 9.6835f, 8.2927f, 9.293f)
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
                imageVector = deleteForeverFilled(),
                contentDescription = ""
            )
        }
    }
}