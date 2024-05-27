package io.github.madmaximuus.persianSymbols.battery.one.bolt

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

val PersianSymbols.Default.Battery1Bolt: ImageVector
    get() {
        if (battery1Bolt != null) {
            return battery1Bolt!!
        }
        battery1Bolt = Builder(
            name = "battery-1-bolt-default",
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
                moveTo(12.4922f, 8.7787f)
                lineTo(9.6949f, 13.187f)
                curveTo(9.6104f, 13.3201f, 9.7061f, 13.4941f, 9.8638f, 13.4941f)
                horizontalLineTo(11.2687f)
                curveTo(11.3907f, 13.4941f, 11.4842f, 13.6023f, 11.4666f, 13.723f)
                lineTo(11.123f, 16.078f)
                curveTo(11.0919f, 16.2912f, 11.3737f, 16.3961f, 11.4896f, 16.2144f)
                lineTo(14.3039f, 11.8016f)
                curveTo(14.3888f, 11.6685f, 14.2931f, 11.4941f, 14.1352f, 11.4941f)
                horizontalLineTo(12.7298f)
                curveTo(12.6083f, 11.4941f, 12.5149f, 11.3868f, 12.5317f, 11.2665f)
                lineTo(12.8591f, 8.9134f)
                curveTo(12.8888f, 8.7004f, 12.6074f, 8.5971f, 12.4922f, 8.7787f)
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
                moveTo(11.0f, 2.0001f)
                curveTo(10.4477f, 2.0001f, 10.0f, 2.4478f, 10.0f, 3.0001f)
                verticalLineTo(4.0001f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 4.0001f, 6.0f, 5.1641f, 6.0f, 6.6001f)
                verticalLineTo(19.4001f)
                curveTo(6.0f, 20.836f, 7.1641f, 22.0001f, 8.6f, 22.0001f)
                horizontalLineTo(15.4f)
                curveTo(16.8359f, 22.0001f, 18.0f, 20.836f, 18.0f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(18.0f, 5.1641f, 16.8359f, 4.0001f, 15.4f, 4.0001f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0001f)
                curveTo(14.0f, 2.4478f, 13.5523f, 2.0001f, 13.0f, 2.0001f)
                horizontalLineTo(11.0f)
                close()
                moveTo(8.0f, 18.0001f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.6001f)
                curveTo(16.0f, 6.2687f, 15.7314f, 6.0001f, 15.4f, 6.0001f)
                horizontalLineTo(8.6f)
                curveTo(8.2686f, 6.0001f, 8.0f, 6.2687f, 8.0f, 6.6001f)
                verticalLineTo(18.0001f)
                close()
            }
        }.build()
        return battery1Bolt!!
    }

private var battery1Bolt: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Battery1Bolt,
                contentDescription = ""
            )
        }
    }
}