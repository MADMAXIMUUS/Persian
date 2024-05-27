package io.github.madmaximuus.persianSymbols.device.tablet.android

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

val PersianSymbols.Filled.DeviceTabletAndroid: ImageVector
    get() {
        if (deviceTabletAndroid != null) {
            return deviceTabletAndroid!!
        }
        deviceTabletAndroid = Builder(
            name = "device-tablet-android-filled",
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
                moveTo(13.881f, 13.2262f)
                curveTo(13.5522f, 13.2262f, 13.2857f, 12.9597f, 13.2857f, 12.6309f)
                curveTo(13.2857f, 12.3022f, 13.5522f, 12.0357f, 13.881f, 12.0357f)
                curveTo(14.2097f, 12.0357f, 14.4762f, 12.3022f, 14.4762f, 12.6309f)
                curveTo(14.4762f, 12.9597f, 14.2097f, 13.2262f, 13.881f, 13.2262f)
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
                moveTo(9.5238f, 12.6309f)
                curveTo(9.5238f, 12.9597f, 9.7903f, 13.2262f, 10.119f, 13.2262f)
                curveTo(10.4478f, 13.2262f, 10.7143f, 12.9597f, 10.7143f, 12.6309f)
                curveTo(10.7143f, 12.3022f, 10.4478f, 12.0357f, 10.119f, 12.0357f)
                curveTo(9.7903f, 12.0357f, 9.5238f, 12.3022f, 9.5238f, 12.6309f)
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
                moveTo(9.1044f, 9.3864f)
                curveTo(9.0615f, 9.3156f, 8.9692f, 9.293f, 8.8984f, 9.336f)
                curveTo(8.8276f, 9.379f, 8.805f, 9.4712f, 8.8479f, 9.542f)
                lineTo(9.6223f, 10.8187f)
                curveTo(8.6381f, 11.5474f, 8.0f, 12.717f, 8.0f, 14.0357f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 12.717f, 15.3619f, 11.5474f, 14.3777f, 10.8187f)
                lineTo(15.1521f, 9.542f)
                curveTo(15.195f, 9.4712f, 15.1724f, 9.379f, 15.1016f, 9.336f)
                curveTo(15.0308f, 9.293f, 14.9385f, 9.3156f, 14.8956f, 9.3864f)
                lineTo(14.1297f, 10.6491f)
                curveTo(13.513f, 10.2605f, 12.7828f, 10.0357f, 12.0f, 10.0357f)
                curveTo(11.2172f, 10.0357f, 10.487f, 10.2605f, 9.8703f, 10.6491f)
                lineTo(9.1044f, 9.3864f)
                close()
            }
        }.build()
        return deviceTabletAndroid!!
    }

private var deviceTabletAndroid: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceTabletAndroid,
                contentDescription = ""
            )
        }
    }
}