package io.github.madmaximuus.persianSymbols.device.tablet.iPad

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

val PersianSymbols.Filled.DeviceTabletIPad: ImageVector
    get() {
        if (deviceTabletIPad != null) {
            return deviceTabletIPad!!
        }
        deviceTabletIPad = Builder(
            name = "device-tablet-ipad-filled",
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
                moveTo(4.0f, 6.4f)
                curveTo(4.0f, 3.9699f, 5.97f, 2.0f, 8.4f, 2.0f)
                horizontalLineTo(15.6f)
                curveTo(18.0301f, 2.0f, 20.0f, 3.9699f, 20.0f, 6.4f)
                verticalLineTo(17.6f)
                curveTo(20.0f, 20.0301f, 18.0301f, 22.0f, 15.6f, 22.0f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22.0f, 4.0f, 20.0301f, 4.0f, 17.6f)
                verticalLineTo(6.4f)
                close()
                moveTo(8.75f, 19.5f)
                curveTo(8.75f, 19.3619f, 8.8619f, 19.25f, 9.0f, 19.25f)
                horizontalLineTo(15.0f)
                curveTo(15.1381f, 19.25f, 15.25f, 19.3619f, 15.25f, 19.5f)
                curveTo(15.25f, 19.6381f, 15.1381f, 19.75f, 15.0f, 19.75f)
                horizontalLineTo(9.0f)
                curveTo(8.8619f, 19.75f, 8.75f, 19.6381f, 8.75f, 19.5f)
                close()
                moveTo(13.9149f, 7.7264f)
                curveTo(14.4384f, 7.203f, 14.6963f, 6.5468f, 14.645f, 6.0064f)
                curveTo(14.1045f, 5.955f, 13.4484f, 6.213f, 12.925f, 6.7365f)
                curveTo(12.4015f, 7.2599f, 12.1436f, 7.916f, 12.1949f, 8.4565f)
                curveTo(12.7353f, 8.5078f, 13.3915f, 8.2499f, 13.9149f, 7.7264f)
                close()
                moveTo(11.125f, 15.5247f)
                curveTo(11.4305f, 15.5247f, 11.7229f, 15.4682f, 11.9922f, 15.365f)
                curveTo(12.1417f, 15.3078f, 12.3082f, 15.3078f, 12.4578f, 15.365f)
                curveTo(12.727f, 15.4682f, 13.0194f, 15.5247f, 13.325f, 15.5247f)
                curveTo(13.954f, 15.5247f, 14.5271f, 14.8521f, 14.958f, 14.0f)
                curveTo(15.0902f, 13.7386f, 15.209f, 13.4603f, 15.312f, 13.1793f)
                curveTo(14.6309f, 12.9063f, 14.15f, 12.24f, 14.15f, 11.4614f)
                curveTo(14.15f, 10.6834f, 14.6303f, 10.0175f, 15.3107f, 9.7441f)
                curveTo(14.872f, 9.1196f, 14.1461f, 8.7114f, 13.325f, 8.7114f)
                curveTo(13.0194f, 8.7114f, 12.727f, 8.768f, 12.4578f, 8.8711f)
                curveTo(12.3082f, 8.9284f, 12.1417f, 8.9284f, 11.9922f, 8.8711f)
                curveTo(11.7229f, 8.768f, 11.4305f, 8.7114f, 11.125f, 8.7114f)
                curveTo(9.7857f, 8.7114f, 8.7f, 9.7972f, 8.7f, 11.1364f)
                curveTo(8.7f, 11.8467f, 9.0053f, 13.0378f, 9.4919f, 14.0f)
                curveTo(9.9228f, 14.8521f, 10.4959f, 15.5247f, 11.125f, 15.5247f)
                close()
            }
        }.build()
        return deviceTabletIPad!!
    }

private var deviceTabletIPad: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceTabletIPad,
                contentDescription = ""
            )
        }
    }
}