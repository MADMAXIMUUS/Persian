package io.github.madmaximuus.persianSymbols.sigmal.stream.base

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

val PersianSymbols.Default.SignalStream: ImageVector
    get() {
        if (signalStream != null) {
            return signalStream!!
        }
        signalStream = Builder(
            name = "signal-stream-default",
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
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 14.2065f, 4.892f, 16.2028f, 6.3375f, 17.6512f)
                curveTo(6.7276f, 18.0421f, 6.727f, 18.6753f, 6.3361f, 19.0654f)
                curveTo(5.9452f, 19.4555f, 5.312f, 19.4549f, 4.9219f, 19.064f)
                curveTo(3.1175f, 17.256f, 2.0f, 14.7575f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 14.7575f, 20.8825f, 17.256f, 19.0781f, 19.064f)
                curveTo(18.688f, 19.4549f, 18.0548f, 19.4555f, 17.6639f, 19.0654f)
                curveTo(17.273f, 18.6753f, 17.2724f, 18.0421f, 17.6625f, 17.6512f)
                curveTo(19.108f, 16.2028f, 20.0f, 14.2065f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
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
                moveTo(12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 13.1079f, 8.4491f, 14.1091f, 9.1777f, 14.8345f)
                curveTo(9.569f, 15.2242f, 9.5704f, 15.8574f, 9.1807f, 16.2487f)
                curveTo(8.791f, 16.6401f, 8.1578f, 16.6414f, 7.7665f, 16.2517f)
                curveTo(6.6764f, 15.1663f, 6.0f, 13.6612f, 6.0f, 12.0f)
                curveTo(6.0f, 8.6863f, 8.6863f, 6.0f, 12.0f, 6.0f)
                curveTo(15.3137f, 6.0f, 18.0f, 8.6863f, 18.0f, 12.0f)
                curveTo(18.0f, 13.6612f, 17.3236f, 15.1663f, 16.2335f, 16.2517f)
                curveTo(15.8422f, 16.6414f, 15.209f, 16.6401f, 14.8193f, 16.2487f)
                curveTo(14.4296f, 15.8574f, 14.431f, 15.2242f, 14.8223f, 14.8345f)
                curveTo(15.5509f, 14.1091f, 16.0f, 13.1079f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
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
                moveTo(12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }.build()
        return signalStream!!
    }

private var signalStream: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.SignalStream,
                contentDescription = ""
            )
        }
    }
}