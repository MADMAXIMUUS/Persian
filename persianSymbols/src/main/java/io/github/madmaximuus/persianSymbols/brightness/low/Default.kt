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

val PersianSymbols.Default.BrightnessLow: ImageVector
    get() {
        if (brightnessLow != null) {
            return brightnessLow!!
        }
        brightnessLow = Builder(
            name = "brightness-low-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.9385f, 4.0633f)
                curveTo(11.5244f, 3.4763f, 12.4755f, 3.4763f, 13.0615f, 4.0633f)
                lineTo(14.1948f, 5.1984f)
                curveTo(14.4764f, 5.4805f, 14.8588f, 5.6389f, 15.2575f, 5.6386f)
                lineTo(16.8615f, 5.6373f)
                curveTo(17.6909f, 5.6366f, 18.3634f, 6.3091f, 18.3627f, 7.1385f)
                lineTo(18.3614f, 8.7425f)
                curveTo(18.3611f, 9.1411f, 18.5195f, 9.5235f, 18.8016f, 9.8052f)
                lineTo(19.9367f, 10.9385f)
                curveTo(20.5237f, 11.5244f, 20.5237f, 12.4755f, 19.9367f, 13.0615f)
                lineTo(18.8016f, 14.1948f)
                curveTo(18.5195f, 14.4764f, 18.3611f, 14.8588f, 18.3614f, 15.2575f)
                lineTo(18.3627f, 16.8615f)
                curveTo(18.3634f, 17.6909f, 17.6909f, 18.3634f, 16.8615f, 18.3627f)
                lineTo(15.2575f, 18.3614f)
                curveTo(14.8588f, 18.3611f, 14.4764f, 18.5195f, 14.1948f, 18.8016f)
                lineTo(13.0615f, 19.9367f)
                curveTo(12.4755f, 20.5237f, 11.5244f, 20.5237f, 10.9385f, 19.9367f)
                lineTo(9.8052f, 18.8016f)
                curveTo(9.5235f, 18.5195f, 9.1411f, 18.3611f, 8.7425f, 18.3614f)
                lineTo(7.1385f, 18.3627f)
                curveTo(6.3091f, 18.3634f, 5.6366f, 17.6909f, 5.6373f, 16.8615f)
                lineTo(5.6386f, 15.2575f)
                curveTo(5.6389f, 14.8588f, 5.4805f, 14.4764f, 5.1984f, 14.1948f)
                lineTo(4.0633f, 13.0615f)
                curveTo(3.4763f, 12.4755f, 3.4763f, 11.5244f, 4.0633f, 10.9385f)
                lineTo(5.1984f, 9.8052f)
                curveTo(5.4805f, 9.5235f, 5.6389f, 9.1411f, 5.6386f, 8.7425f)
                lineTo(5.6373f, 7.1385f)
                curveTo(5.6366f, 6.3091f, 6.3091f, 5.6366f, 7.1385f, 5.6373f)
                lineTo(8.7425f, 5.6386f)
                curveTo(9.1411f, 5.6389f, 9.5235f, 5.4805f, 9.8052f, 5.1984f)
                lineTo(10.9385f, 4.0633f)
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
                imageVector = PersianSymbols.Default.BrightnessLow,
                contentDescription = ""
            )
        }
    }
}