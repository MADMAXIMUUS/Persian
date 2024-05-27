package io.github.madmaximuus.persianSymbols.brightness.low

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

val PersianSymbols.Filled.BrightnessLow: ImageVector
    get() {
        if (brightnessLow != null) {
            return brightnessLow!!
        }
        brightnessLow = Builder(
            name = "brightness-low-filled",
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
                moveTo(10.5846f, 3.4176f)
                curveTo(11.3659f, 2.635f, 12.634f, 2.635f, 13.4153f, 3.4176f)
                lineTo(14.3408f, 4.3446f)
                curveTo(14.7164f, 4.7208f, 15.2263f, 4.932f, 15.7578f, 4.9316f)
                lineTo(17.0677f, 4.9305f)
                curveTo(18.1736f, 4.9296f, 19.0703f, 5.8263f, 19.0694f, 6.9321f)
                lineTo(19.0683f, 8.2421f)
                curveTo(19.0679f, 8.7736f, 19.2791f, 9.2835f, 19.6552f, 9.6591f)
                lineTo(20.5823f, 10.5846f)
                curveTo(21.3648f, 11.3659f, 21.3648f, 12.634f, 20.5823f, 13.4153f)
                lineTo(19.6552f, 14.3408f)
                curveTo(19.2791f, 14.7164f, 19.0679f, 15.2263f, 19.0683f, 15.7578f)
                lineTo(19.0694f, 17.0677f)
                curveTo(19.0703f, 18.1736f, 18.1736f, 19.0703f, 17.0677f, 19.0694f)
                lineTo(15.7578f, 19.0683f)
                curveTo(15.2263f, 19.0679f, 14.7164f, 19.2791f, 14.3408f, 19.6552f)
                lineTo(13.4153f, 20.5823f)
                curveTo(12.634f, 21.3648f, 11.3659f, 21.3648f, 10.5846f, 20.5823f)
                lineTo(9.6591f, 19.6552f)
                curveTo(9.2835f, 19.2791f, 8.7736f, 19.0679f, 8.2421f, 19.0683f)
                lineTo(6.9321f, 19.0694f)
                curveTo(5.8263f, 19.0703f, 4.9296f, 18.1736f, 4.9305f, 17.0677f)
                lineTo(4.9316f, 15.7578f)
                curveTo(4.932f, 15.2263f, 4.7208f, 14.7164f, 4.3446f, 14.3408f)
                lineTo(3.4176f, 13.4153f)
                curveTo(2.635f, 12.634f, 2.635f, 11.3659f, 3.4176f, 10.5846f)
                lineTo(4.3446f, 9.6591f)
                curveTo(4.7208f, 9.2835f, 4.932f, 8.7736f, 4.9316f, 8.2421f)
                lineTo(4.9305f, 6.9321f)
                curveTo(4.9296f, 5.8263f, 5.8263f, 4.9296f, 6.9321f, 4.9305f)
                lineTo(8.2421f, 4.9316f)
                curveTo(8.7736f, 4.932f, 9.2835f, 4.7208f, 9.6591f, 4.3446f)
                lineTo(10.5846f, 3.4176f)
                close()
            }
        }.build()
        return brightnessLow!!
    }

private var brightnessLow: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.BrightnessLow,
                contentDescription = ""
            )
        }
    }
}