package io.github.madmaximuus.persianSymbols.device.tv

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

val PersianSymbols.Default.DeviceTv: ImageVector
    get() {
        if (deviceTv != null) {
            return deviceTv!!
        }
        deviceTv = Builder(
            name = "device-tv-default",
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
                moveTo(6.5f, 3.0f)
                curveTo(4.0147f, 3.0f, 2.0f, 5.0147f, 2.0f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(2.0f, 16.4159f, 3.1973f, 18.0521f, 4.8845f, 18.7013f)
                lineTo(4.2929f, 19.2929f)
                curveTo(3.9024f, 19.6834f, 3.9024f, 20.3166f, 4.2929f, 20.7071f)
                curveTo(4.6834f, 21.0976f, 5.3166f, 21.0976f, 5.7071f, 20.7071f)
                lineTo(7.4142f, 19.0f)
                horizontalLineTo(16.5858f)
                lineTo(18.2929f, 20.7071f)
                curveTo(18.6834f, 21.0976f, 19.3166f, 21.0976f, 19.7071f, 20.7071f)
                curveTo(20.0976f, 20.3166f, 20.0976f, 19.6834f, 19.7071f, 19.2929f)
                lineTo(19.1155f, 18.7013f)
                curveTo(20.8027f, 18.0521f, 22.0f, 16.4159f, 22.0f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 5.0147f, 19.9853f, 3.0f, 17.5f, 3.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(17.5f, 17.0f)
                curveTo(18.8807f, 17.0f, 20.0f, 15.8807f, 20.0f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(20.0f, 6.1193f, 18.8807f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 5.0f, 4.0f, 6.1193f, 4.0f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(4.0f, 15.8807f, 5.1193f, 17.0f, 6.5f, 17.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()
        return deviceTv!!
    }

private var deviceTv: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DeviceTv,
                contentDescription = ""
            )
        }
    }
}