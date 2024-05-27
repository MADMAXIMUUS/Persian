package io.github.madmaximuus.persianSymbols.device.tablet.unknown

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

val PersianSymbols.Default.DeviceTabletUnknown: ImageVector
    get() {
        if (deviceTabletUnknown != null) {
            return deviceTabletUnknown!!
        }
        deviceTabletUnknown = Builder(
            name = "device-tablet-unknown-default",
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
                moveTo(9.0f, 19.25f)
                curveTo(8.8619f, 19.25f, 8.75f, 19.3619f, 8.75f, 19.5f)
                curveTo(8.75f, 19.6381f, 8.8619f, 19.75f, 9.0f, 19.75f)
                horizontalLineTo(15.0f)
                curveTo(15.1381f, 19.75f, 15.25f, 19.6381f, 15.25f, 19.5f)
                curveTo(15.25f, 19.3619f, 15.1381f, 19.25f, 15.0f, 19.25f)
                horizontalLineTo(9.0f)
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
                moveTo(8.5f, 2.0f)
                curveTo(6.0147f, 2.0f, 4.0f, 4.0147f, 4.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 19.9853f, 6.0147f, 22.0f, 8.5f, 22.0f)
                horizontalLineTo(15.5f)
                curveTo(17.9853f, 22.0f, 20.0f, 19.9853f, 20.0f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(20.0f, 4.0147f, 17.9853f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(8.5f)
                close()
                moveTo(6.0f, 6.5f)
                curveTo(6.0f, 5.1193f, 7.1193f, 4.0f, 8.5f, 4.0f)
                horizontalLineTo(15.5f)
                curveTo(16.8807f, 4.0f, 18.0f, 5.1193f, 18.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(18.0f, 18.8807f, 16.8807f, 20.0f, 15.5f, 20.0f)
                horizontalLineTo(8.5f)
                curveTo(7.1193f, 20.0f, 6.0f, 18.8807f, 6.0f, 17.5f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceTabletUnknown!!
    }

private var deviceTabletUnknown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DeviceTabletUnknown,
                contentDescription = ""
            )
        }
    }
}