package io.github.madmaximuus.persianSymbols.mic.base

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

val PersianSymbols.Default.Mic: ImageVector
    get() {
        if (mic != null) {
            return mic!!
        }
        mic = Builder(
            name = "mic-default",
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
                moveTo(8.0f, 4.9999f)
                curveTo(8.0f, 3.343f, 9.3432f, 1.9999f, 11.0f, 1.9999f)
                horizontalLineTo(13.0f)
                curveTo(14.6569f, 1.9999f, 16.0f, 3.343f, 16.0f, 4.9999f)
                verticalLineTo(10.9999f)
                curveTo(16.0f, 12.6567f, 14.6569f, 13.9999f, 13.0f, 13.9999f)
                horizontalLineTo(11.0f)
                curveTo(9.3432f, 13.9999f, 8.0f, 12.6567f, 8.0f, 10.9999f)
                verticalLineTo(4.9999f)
                close()
                moveTo(11.0f, 3.9999f)
                curveTo(10.4477f, 3.9999f, 10.0f, 4.4476f, 10.0f, 4.9999f)
                verticalLineTo(10.9999f)
                curveTo(10.0f, 11.5522f, 10.4477f, 11.9999f, 11.0f, 11.9999f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 11.9999f, 14.0f, 11.5522f, 14.0f, 10.9999f)
                verticalLineTo(4.9999f)
                curveTo(14.0f, 4.4476f, 13.5523f, 3.9999f, 13.0f, 3.9999f)
                horizontalLineTo(11.0f)
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
                moveTo(5.9999f, 11.0f)
                curveTo(6.5522f, 11.0f, 6.9999f, 11.4477f, 6.9999f, 12.0f)
                curveTo(6.9999f, 13.6569f, 8.343f, 15.0f, 9.9999f, 15.0f)
                horizontalLineTo(13.9999f)
                curveTo(15.6567f, 15.0f, 16.9999f, 13.6569f, 16.9999f, 12.0f)
                curveTo(16.9999f, 11.4477f, 17.4476f, 11.0f, 17.9999f, 11.0f)
                curveTo(18.5522f, 11.0f, 18.9999f, 11.4477f, 18.9999f, 12.0f)
                curveTo(18.9999f, 14.7614f, 16.7613f, 17.0f, 13.9999f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 20.0f, 17.0f, 20.4477f, 17.0f, 21.0f)
                curveTo(17.0f, 21.5523f, 16.5523f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 22.0f, 7.0f, 21.5523f, 7.0f, 21.0f)
                curveTo(7.0f, 20.4477f, 7.4477f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.9999f)
                curveTo(7.2385f, 17.0f, 4.9999f, 14.7614f, 4.9999f, 12.0f)
                curveTo(4.9999f, 11.4477f, 5.4476f, 11.0f, 5.9999f, 11.0f)
                close()
            }
        }.build()
        return mic!!
    }

private var mic: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Mic,
                contentDescription = ""
            )
        }
    }
}