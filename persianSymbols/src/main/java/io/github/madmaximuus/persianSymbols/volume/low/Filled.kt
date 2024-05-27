package io.github.madmaximuus.persianSymbols.volume.low

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Filled.VolumeLow: ImageVector
    get() {
        if (volumeLow != null) {
            return volumeLow!!
        }
        volumeLow = Builder(
            name = "volume-low-filled",
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
                moveTo(4.0f, 8.0f)
                horizontalLineTo(8.2034f)
                curveTo(8.4251f, 8.0f, 8.6406f, 7.9263f, 8.8158f, 7.7905f)
                lineTo(13.3876f, 4.249f)
                curveTo(14.0447f, 3.74f, 15.0f, 4.2083f, 15.0f, 5.0396f)
                verticalLineTo(18.9604f)
                curveTo(15.0f, 19.7916f, 14.0447f, 20.26f, 13.3876f, 19.7509f)
                lineTo(8.8158f, 16.2094f)
                curveTo(8.6406f, 16.0737f, 8.4251f, 16.0f, 8.2034f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 16.0f, 2.0f, 15.1045f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 8.8954f, 2.8954f, 8.0f, 4.0f, 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.7044f, 17.5056f)
                curveTo(16.4109f, 17.7531f, 16.0f, 17.5221f, 16.0f, 17.1381f)
                verticalLineTo(6.862f)
                curveTo(16.0f, 6.478f, 16.4109f, 6.2469f, 16.7044f, 6.4945f)
                curveTo(18.0855f, 7.6591f, 19.0f, 9.6898f, 19.0f, 12.0f)
                curveTo(19.0f, 14.3103f, 18.0855f, 16.3409f, 16.7044f, 17.5056f)
                close()
            }
        }.build()
        return volumeLow!!
    }

private var volumeLow: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.VolumeLow,
                contentDescription = ""
            )
        }
    }
}