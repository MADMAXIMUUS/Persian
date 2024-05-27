package io.github.madmaximuus.persianSymbols.wifi.three

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

val PersianSymbols.Default.Wifi3: ImageVector
    get() {
        if (wifi3 != null) {
            return wifi3!!
        }
        wifi3 = Builder(
            name = "wifi-3-default",
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
                moveTo(6.4833f, 12.3366f)
                curveTo(7.8995f, 10.89f, 9.8483f, 10.0013f, 11.9982f, 10.0013f)
                curveTo(14.1481f, 10.0013f, 16.0969f, 10.89f, 17.5131f, 12.3366f)
                curveTo(17.8995f, 12.7313f, 18.5326f, 12.738f, 18.9273f, 12.3517f)
                curveTo(19.3219f, 11.9653f, 19.3287f, 11.3322f, 18.9423f, 10.9375f)
                curveTo(17.17f, 9.1271f, 14.7139f, 8.0013f, 11.9982f, 8.0013f)
                curveTo(9.2825f, 8.0013f, 6.8264f, 9.1271f, 5.0541f, 10.9375f)
                curveTo(4.6677f, 11.3322f, 4.6745f, 11.9653f, 5.0691f, 12.3517f)
                curveTo(5.4638f, 12.738f, 6.0969f, 12.7313f, 6.4833f, 12.3366f)
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
                moveTo(11.9982f, 14.001f)
                curveTo(10.9288f, 14.001f, 9.9582f, 14.4426f, 9.2504f, 15.1664f)
                curveTo(8.8643f, 15.5612f, 8.2311f, 15.5683f, 7.8363f, 15.1822f)
                curveTo(7.4414f, 14.796f, 7.4343f, 14.1629f, 7.8205f, 13.7681f)
                curveTo(8.8844f, 12.6801f, 10.3625f, 12.001f, 11.9982f, 12.001f)
                curveTo(13.6291f, 12.001f, 15.1035f, 12.6762f, 16.1667f, 13.7587f)
                curveTo(16.5537f, 14.1527f, 16.5481f, 14.7858f, 16.154f, 15.1728f)
                curveTo(15.76f, 15.5599f, 15.1269f, 15.5542f, 14.7399f, 15.1602f)
                curveTo(14.0326f, 14.4401f, 13.0645f, 14.001f, 11.9982f, 14.001f)
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
                moveTo(13.9558f, 18.0002f)
                curveTo(13.9558f, 19.1047f, 13.0793f, 20.0f, 11.9981f, 20.0f)
                curveTo(10.9168f, 20.0f, 10.0403f, 19.1047f, 10.0403f, 18.0002f)
                curveTo(10.0403f, 16.8958f, 10.9168f, 16.0005f, 11.9981f, 16.0005f)
                curveTo(13.0793f, 16.0005f, 13.9558f, 16.8958f, 13.9558f, 18.0002f)
                close()
            }
        }.build()
        return wifi3!!
    }

private var wifi3: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Wifi3,
                contentDescription = ""
            )
        }
    }
}