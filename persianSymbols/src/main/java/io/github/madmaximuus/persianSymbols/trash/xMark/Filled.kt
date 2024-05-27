package io.github.madmaximuus.persianSymbols.trash.xMark

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.TrashXNark: ImageVector
    get() {
        if (trashXMark != null) {
            return trashXMark!!
        }
        trashXMark = Builder(
            name = "TrashXmarkFilled",
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
                pathFillType = EvenOdd
            ) {
                moveTo(6.9998f, 3.9999f)
                curveTo(6.9998f, 3.4476f, 7.4475f, 2.9999f, 7.9998f, 2.9999f)
                horizontalLineTo(15.9998f)
                curveTo(16.5521f, 2.9999f, 16.9998f, 3.4476f, 16.9998f, 3.9999f)
                lineTo(20.0f, 4.0002f)
                curveTo(20.5523f, 4.0002f, 21.0f, 4.4479f, 21.0f, 5.0002f)
                curveTo(21.0f, 5.5525f, 20.5523f, 6.0002f, 20.0f, 6.0002f)
                verticalLineTo(17.6002f)
                curveTo(20.0f, 20.0302f, 18.0301f, 22.0002f, 15.6f, 22.0002f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22.0002f, 4.0f, 20.0302f, 4.0f, 17.6002f)
                verticalLineTo(6.0002f)
                curveTo(3.4477f, 6.0002f, 3.0f, 5.5525f, 3.0f, 5.0002f)
                curveTo(3.0f, 4.4479f, 3.4477f, 4.0002f, 4.0f, 4.0002f)
                lineTo(6.9998f, 3.9999f)
                close()
                moveTo(8.2927f, 9.293f)
                curveTo(8.6832f, 8.9025f, 9.3163f, 8.9025f, 9.7069f, 9.293f)
                lineTo(11.9998f, 11.5859f)
                lineTo(14.2926f, 9.293f)
                curveTo(14.6832f, 8.9025f, 15.3163f, 8.9025f, 15.7069f, 9.293f)
                curveTo(16.0974f, 9.6835f, 16.0974f, 10.3167f, 15.7069f, 10.7072f)
                lineTo(13.414f, 13.0001f)
                lineTo(15.7069f, 15.293f)
                curveTo(16.0974f, 15.6835f, 16.0974f, 16.3167f, 15.7069f, 16.7072f)
                curveTo(15.3163f, 17.0978f, 14.6832f, 17.0978f, 14.2926f, 16.7072f)
                lineTo(11.9998f, 14.4143f)
                lineTo(9.7069f, 16.7072f)
                curveTo(9.3163f, 17.0978f, 8.6832f, 17.0978f, 8.2927f, 16.7072f)
                curveTo(7.9021f, 16.3167f, 7.9021f, 15.6835f, 8.2927f, 15.293f)
                lineTo(10.5855f, 13.0001f)
                lineTo(8.2927f, 10.7072f)
                curveTo(7.9021f, 10.3167f, 7.9021f, 9.6835f, 8.2927f, 9.293f)
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
                imageVector = PersianSymbols.Filled.TrashXNark,
                contentDescription = ""
            )
        }
    }
}