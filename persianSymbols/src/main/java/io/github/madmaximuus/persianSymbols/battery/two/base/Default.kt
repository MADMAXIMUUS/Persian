package io.github.madmaximuus.persianSymbols.battery.two.base

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

public val PersianSymbols.Default.Battery2: ImageVector
    get() {
        if (battery2 != null) {
            return battery2!!
        }
        battery2 = Builder(
            name = "battery-2-default",
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
                moveTo(10.0f, 3.0001f)
                curveTo(10.0f, 2.4478f, 10.4477f, 2.0001f, 11.0f, 2.0001f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 2.0001f, 14.0f, 2.4478f, 14.0f, 3.0001f)
                verticalLineTo(4.0001f)
                horizontalLineTo(15.4f)
                curveTo(16.8359f, 4.0001f, 18.0f, 5.1641f, 18.0f, 6.6001f)
                verticalLineTo(19.4f)
                curveTo(18.0f, 19.4f, 18.0f, 19.4f, 18.0f, 19.4f)
                curveTo(18.0f, 19.5655f, 17.9845f, 19.7274f, 17.955f, 19.8843f)
                curveTo(17.7281f, 21.0888f, 16.6705f, 22.0001f, 15.4f, 22.0001f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 22.0001f, 6.0f, 20.836f, 6.0f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(6.0f, 5.1641f, 7.1641f, 4.0001f, 8.6f, 4.0001f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0001f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.6001f)
                curveTo(8.0f, 6.2687f, 8.2686f, 6.0001f, 8.6f, 6.0001f)
                horizontalLineTo(15.4f)
                curveTo(15.7314f, 6.0001f, 16.0f, 6.2687f, 16.0f, 6.6001f)
                verticalLineTo(16.0f)
                close()
            }
        }.build()
        return battery2!!
    }

private var battery2: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Battery2,
                contentDescription = ""
            )
        }
    }
}
