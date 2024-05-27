package io.github.madmaximuus.persianSymbols.battery.three.bolt

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

val PersianSymbols.Default.Battery3Bolt: ImageVector
    get() {
        if (battery3Bolt != null) {
            return battery3Bolt!!
        }
        battery3Bolt = Builder(
            name = "battery-3-bolt-default",
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
                moveTo(11.0f, 2.0f)
                curveTo(10.4477f, 2.0f, 10.0f, 2.4477f, 10.0f, 3.0f)
                verticalLineTo(3.9999f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 3.9999f, 6.0f, 5.164f, 6.0f, 6.5999f)
                verticalLineTo(19.3999f)
                curveTo(6.0f, 20.8359f, 7.1641f, 22.0f, 8.6f, 22.0f)
                horizontalLineTo(15.4f)
                curveTo(16.7462f, 22.0f, 17.8535f, 20.9769f, 17.9866f, 19.6658f)
                curveTo(17.9955f, 19.5784f, 18.0f, 19.4897f, 18.0f, 19.4f)
                curveTo(18.0f, 19.4f, 18.0f, 19.4f, 18.0f, 19.4f)
                verticalLineTo(6.5999f)
                curveTo(18.0f, 5.164f, 16.8359f, 3.9999f, 15.4f, 3.9999f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                curveTo(14.0f, 2.4477f, 13.5523f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(16.0f, 14.0f)
                verticalLineTo(6.5999f)
                curveTo(16.0f, 6.2686f, 15.7314f, 5.9999f, 15.4f, 5.9999f)
                horizontalLineTo(8.6f)
                curveTo(8.2686f, 5.9999f, 8.0f, 6.2686f, 8.0f, 6.5999f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.4262f)
                lineTo(11.123f, 16.0779f)
                curveTo(11.0919f, 16.2912f, 11.3737f, 16.3961f, 11.4896f, 16.2144f)
                lineTo(12.9018f, 14.0001f)
                lineTo(11.4262f, 14.0f)
                lineTo(11.4666f, 13.723f)
                curveTo(11.4842f, 13.6023f, 11.3907f, 13.4941f, 11.2687f, 13.4941f)
                horizontalLineTo(9.8638f)
                curveTo(9.7061f, 13.4941f, 9.6104f, 13.3201f, 9.6949f, 13.187f)
                lineTo(12.4922f, 8.7787f)
                curveTo(12.6074f, 8.5971f, 12.8888f, 8.7004f, 12.8591f, 8.9134f)
                lineTo(12.5317f, 11.2665f)
                curveTo(12.5149f, 11.3868f, 12.6083f, 11.4941f, 12.7298f, 11.4941f)
                horizontalLineTo(14.1352f)
                curveTo(14.2931f, 11.4941f, 14.3888f, 11.6685f, 14.3039f, 11.8016f)
                lineTo(12.9018f, 14.0001f)
                lineTo(16.0f, 14.0f)
                close()
            }
        }.build()
        return battery3Bolt!!
    }

private var battery3Bolt: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Battery3Bolt,
                contentDescription = ""
            )
        }
    }
}