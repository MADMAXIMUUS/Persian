package io.github.madmaximuus.persianSymbols.wifi.one

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

val PersianSymbols.Default.Wifi1: ImageVector
    get() {
        if (wifi1 != null) {
            return wifi1!!
        }
        wifi1 = Builder(
            name = "wifi-1-default",
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
                moveTo(13.9559f, 18.0003f)
                curveTo(13.9559f, 19.1047f, 13.0794f, 20.0f, 11.9982f, 20.0f)
                curveTo(10.9169f, 20.0f, 10.0404f, 19.1047f, 10.0404f, 18.0003f)
                curveTo(10.0404f, 16.8958f, 10.9169f, 16.0005f, 11.9982f, 16.0005f)
                curveTo(13.0794f, 16.0005f, 13.9559f, 16.8958f, 13.9559f, 18.0003f)
                close()
            }
        }.build()
        return wifi1!!
    }

private var wifi1: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Wifi1,
                contentDescription = ""
            )
        }
    }
}