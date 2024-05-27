package io.github.madmaximuus.persianSymbols.wifi.two

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

val PersianSymbols.Default.Wifi2: ImageVector
    get() {
        if (wifi2 != null) {
            return wifi2!!
        }
        wifi2 = Builder(
            name = "wifi-2-default",
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
                moveTo(9.2505f, 15.1664f)
                curveTo(9.9583f, 14.4426f, 10.9289f, 14.001f, 11.9983f, 14.001f)
                curveTo(13.0646f, 14.001f, 14.0327f, 14.4401f, 14.74f, 15.1602f)
                curveTo(15.127f, 15.5542f, 15.7601f, 15.5599f, 16.1541f, 15.1729f)
                curveTo(16.5481f, 14.7859f, 16.5538f, 14.1527f, 16.1668f, 13.7587f)
                curveTo(15.1036f, 12.6762f, 13.6292f, 12.001f, 11.9983f, 12.001f)
                curveTo(10.3626f, 12.001f, 8.8845f, 12.6801f, 7.8206f, 13.7681f)
                curveTo(7.4344f, 14.1629f, 7.4415f, 14.7961f, 7.8364f, 15.1822f)
                curveTo(8.2312f, 15.5683f, 8.8643f, 15.5613f, 9.2505f, 15.1664f)
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
                moveTo(11.9982f, 20.0f)
                curveTo(13.0794f, 20.0f, 13.9559f, 19.1047f, 13.9559f, 18.0002f)
                curveTo(13.9559f, 16.8958f, 13.0794f, 16.0005f, 11.9982f, 16.0005f)
                curveTo(10.9169f, 16.0005f, 10.0404f, 16.8958f, 10.0404f, 18.0002f)
                curveTo(10.0404f, 19.1047f, 10.9169f, 20.0f, 11.9982f, 20.0f)
                close()
            }
        }.build()
        return wifi2!!
    }

private var wifi2: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Wifi2,
                contentDescription = ""
            )
        }
    }
}