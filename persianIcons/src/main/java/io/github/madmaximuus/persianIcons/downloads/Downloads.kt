package io.github.madmaximuus.persianIcons.downloads

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
fun downloadsDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "downloads-default",
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
                moveTo(8.70794f, 10.2997f)
                curveTo(8.3174f, 9.9092f, 7.6842f, 9.9092f, 7.2937f, 10.2997f)
                curveTo(6.9032f, 10.6902f, 6.9032f, 11.3234f, 7.2937f, 11.7139f)
                lineTo(11.2937f, 15.7139f)
                curveTo(11.6843f, 16.1045f, 12.3174f, 16.1045f, 12.708f, 15.7139f)
                lineTo(16.708f, 11.7139f)
                curveTo(17.0985f, 11.3234f, 17.0985f, 10.6902f, 16.708f, 10.2997f)
                curveTo(16.3174f, 9.9092f, 15.6843f, 9.9092f, 15.2937f, 10.2997f)
                lineTo(13.0008f, 12.5926f)
                verticalLineTo(5.00684f)
                curveTo(13.0008f, 4.4546f, 12.5531f, 4.0068f, 12.0008f, 4.0068f)
                curveTo(11.4486f, 4.0068f, 11.0008f, 4.4546f, 11.0008f, 5.0068f)
                verticalLineTo(12.5926f)
                lineTo(8.70794f, 10.2997f)
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5f, 15.0068f)
                curveTo(5f, 14.4546f, 4.5523f, 14.0068f, 4f, 14.0068f)
                curveTo(3.4477f, 14.0068f, 3f, 14.4546f, 3f, 15.0068f)
                verticalLineTo(15.5188f)
                curveTo(3f, 18.0041f, 5.0147f, 20.0188f, 7.5f, 20.0188f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 20.0188f, 21f, 18.0041f, 21f, 15.5188f)
                verticalLineTo(15.0068f)
                curveTo(21f, 14.4546f, 20.5523f, 14.0068f, 20f, 14.0068f)
                curveTo(19.4477f, 14.0068f, 19f, 14.4546f, 19f, 15.0068f)
                verticalLineTo(15.5188f)
                curveTo(19f, 16.8995f, 17.8807f, 18.0188f, 16.5f, 18.0188f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 18.0188f, 5f, 16.8995f, 5f, 15.5188f)
                verticalLineTo(15.0068f)
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
                imageVector = downloadsDefault(),
                contentDescription = ""
            )
        }
    }
}