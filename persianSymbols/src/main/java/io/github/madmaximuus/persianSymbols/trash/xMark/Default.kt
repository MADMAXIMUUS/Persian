package io.github.madmaximuus.persianSymbols.trash.xMark

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.TrashXMark: ImageVector
    get() {
        if (trashXMark != null) {
            return trashXMark!!
        }
        trashXMark = Builder(
            name = "trash-xmark-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.7069f, 9.293f)
                curveTo(9.3163f, 8.9025f, 8.6832f, 8.9025f, 8.2927f, 9.293f)
                curveTo(7.9021f, 9.6835f, 7.9021f, 10.3167f, 8.2927f, 10.7072f)
                lineTo(10.5855f, 13.0001f)
                lineTo(8.2927f, 15.293f)
                curveTo(7.9021f, 15.6835f, 7.9021f, 16.3167f, 8.2927f, 16.7072f)
                curveTo(8.6832f, 17.0978f, 9.3163f, 17.0978f, 9.7069f, 16.7072f)
                lineTo(11.9998f, 14.4143f)
                lineTo(14.2926f, 16.7072f)
                curveTo(14.6832f, 17.0978f, 15.3163f, 17.0978f, 15.7069f, 16.7072f)
                curveTo(16.0974f, 16.3167f, 16.0974f, 15.6835f, 15.7069f, 15.293f)
                lineTo(13.414f, 13.0001f)
                lineTo(15.7069f, 10.7072f)
                curveTo(16.0974f, 10.3167f, 16.0974f, 9.6835f, 15.7069f, 9.293f)
                curveTo(15.3163f, 8.9025f, 14.6832f, 8.9025f, 14.2926f, 9.293f)
                lineTo(11.9998f, 11.5859f)
                lineTo(9.7069f, 9.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.9998f, 2.9999f)
                curveTo(7.4475f, 2.9999f, 6.9998f, 3.4476f, 6.9998f, 3.9999f)
                lineTo(4.0f, 4.0002f)
                curveTo(3.4477f, 4.0002f, 3.0f, 4.4479f, 3.0f, 5.0002f)
                curveTo(3.0f, 5.5524f, 3.4476f, 6.0001f, 3.9999f, 6.0002f)
                verticalLineTo(17.5f)
                curveTo(3.9999f, 19.9853f, 6.0146f, 22.0f, 8.4999f, 22.0f)
                horizontalLineTo(15.4999f)
                curveTo(17.9851f, 22.0f, 19.9999f, 19.9853f, 19.9999f, 17.5f)
                verticalLineTo(6.0002f)
                curveTo(20.5521f, 6.0002f, 21.0f, 5.5525f, 21.0f, 5.0002f)
                curveTo(21.0f, 4.4479f, 20.5523f, 4.0002f, 20.0f, 4.0002f)
                horizontalLineTo(16.9998f)
                curveTo(16.9998f, 3.4479f, 16.5521f, 2.9999f, 15.9998f, 2.9999f)
                horizontalLineTo(7.9998f)
                close()
                moveTo(5.9999f, 17.5f)
                verticalLineTo(6.0002f)
                horizontalLineTo(17.9999f)
                verticalLineTo(17.5f)
                curveTo(17.9999f, 18.8807f, 16.8806f, 20.0f, 15.4999f, 20.0f)
                horizontalLineTo(8.4999f)
                curveTo(7.1192f, 20.0f, 5.9999f, 18.8807f, 5.9999f, 17.5f)
                close()
            }
        }.build()
        return trashXMark!!
    }

private var trashXMark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.TrashXMark,
                contentDescription = ""
            )
        }
    }
}