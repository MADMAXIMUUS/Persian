package io.github.madmaximuus.persianSymbols.device.mobile.android

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

val PersianSymbols.Default.DeviceMobileAndroid: ImageVector
    get() {
        if (deviceMobileAndroid != null) {
            return deviceMobileAndroid!!
        }
        deviceMobileAndroid = Builder(
            name = "device-mobile-android-default",
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
                moveTo(12.5f, 5.5f)
                curveTo(12.5f, 5.7761f, 12.2761f, 6.0f, 12.0f, 6.0f)
                curveTo(11.7239f, 6.0f, 11.5f, 5.7761f, 11.5f, 5.5f)
                curveTo(11.5f, 5.2239f, 11.7239f, 5.0f, 12.0f, 5.0f)
                curveTo(12.2761f, 5.0f, 12.5f, 5.2239f, 12.5f, 5.5f)
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
                moveTo(6.0f, 5.0f)
                curveTo(6.0f, 3.3431f, 7.3432f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(16.6569f, 2.0f, 18.0f, 3.3431f, 18.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 20.6569f, 16.6569f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.3432f, 22.0f, 6.0f, 20.6569f, 6.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 4.0f)
                curveTo(8.4477f, 4.0f, 8.0f, 4.4477f, 8.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(8.0f, 19.5523f, 8.4477f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 20.0f, 16.0f, 19.5523f, 16.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 4.4477f, 15.5523f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }.build()
        return deviceMobileAndroid!!
    }

private var deviceMobileAndroid: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DeviceMobileAndroid,
                contentDescription = ""
            )
        }
    }
}