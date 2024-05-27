package io.github.madmaximuus.persianSymbols.volume.low

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

val PersianSymbols.Default.VolumeLow: ImageVector
    get() {
        if (volumeLow != null) {
            return volumeLow!!
        }
        volumeLow = Builder(
            name = "volume-low-default",
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
                moveTo(15.0f, 6.4142f)
                curveTo(15.0f, 4.6324f, 12.8457f, 3.74f, 11.5858f, 4.9999f)
                lineTo(8.5858f, 7.9999f)
                horizontalLineTo(4.5f)
                curveTo(3.1193f, 7.9999f, 2.0f, 9.1192f, 2.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(2.0f, 14.8807f, 3.1193f, 16.0f, 4.5f, 16.0f)
                horizontalLineTo(8.5858f)
                lineTo(11.5858f, 19.0f)
                curveTo(12.8457f, 20.2599f, 15.0f, 19.3676f, 15.0f, 17.5857f)
                verticalLineTo(6.4142f)
                close()
                moveTo(10.0f, 9.4142f)
                lineTo(13.0f, 6.4142f)
                lineTo(13.0f, 17.5857f)
                lineTo(10.0f, 14.5857f)
                curveTo(9.6249f, 14.2107f, 9.1162f, 14.0f, 8.5858f, 14.0f)
                horizontalLineTo(4.5f)
                curveTo(4.2239f, 14.0f, 4.0f, 13.7761f, 4.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(4.0f, 10.2238f, 4.2239f, 10.0f, 4.5f, 10.0f)
                horizontalLineTo(8.5858f)
                curveTo(9.1162f, 10.0f, 9.6249f, 9.7892f, 10.0f, 9.4142f)
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
                verticalLineTo(6.8619f)
                curveTo(16.0f, 6.478f, 16.4109f, 6.2469f, 16.7044f, 6.4944f)
                curveTo(18.0855f, 7.6591f, 19.0f, 9.6898f, 19.0f, 12.0f)
                curveTo(19.0f, 14.3102f, 18.0855f, 16.3409f, 16.7044f, 17.5056f)
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
                imageVector = PersianSymbols.Default.VolumeLow,
                contentDescription = ""
            )
        }
    }
}