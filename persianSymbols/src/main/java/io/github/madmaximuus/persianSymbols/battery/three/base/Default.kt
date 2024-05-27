package io.github.madmaximuus.persianSymbols.battery.three.base

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

val PersianSymbols.Default.Battery3: ImageVector
    get() {
        if (battery3 != null) {
            return battery3!!
        }
        battery3 = Builder(
            name = "battery-3-default",
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
                moveTo(10.0f, 4.0001f)
                curveTo(10.0f, 3.4478f, 10.4477f, 3.0001f, 11.0f, 3.0001f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 3.0001f, 14.0f, 3.4478f, 14.0f, 4.0001f)
                verticalLineTo(5.0001f)
                horizontalLineTo(15.4f)
                curveTo(16.8359f, 5.0001f, 18.0f, 6.1641f, 18.0f, 7.6001f)
                verticalLineTo(20.4001f)
                curveTo(18.0f, 21.836f, 16.8359f, 23.0001f, 15.4f, 23.0001f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 23.0001f, 6.0f, 21.836f, 6.0f, 20.4001f)
                verticalLineTo(7.6001f)
                curveTo(6.0f, 6.1641f, 7.1641f, 5.0001f, 8.6f, 5.0001f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0001f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.6001f)
                curveTo(8.0f, 7.2687f, 8.2686f, 7.0001f, 8.6f, 7.0001f)
                horizontalLineTo(15.4f)
                curveTo(15.7314f, 7.0001f, 16.0f, 7.2687f, 16.0f, 7.6001f)
                verticalLineTo(14.0f)
                close()
            }
        }.build()
        return battery3!!
    }

private var battery3: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Battery3,
                contentDescription = ""
            )
        }
    }
}