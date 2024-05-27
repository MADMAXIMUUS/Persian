package io.github.madmaximuus.persianSymbols.device.mobile.unknown

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

val PersianSymbols.Default.DeviceMobileUnknown: ImageVector
    get() {
        if (deviceMobileUnknown != null) {
            return deviceMobileUnknown!!
        }
        deviceMobileUnknown = Builder(
            name = "device-mobile-unknown-default",
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
                moveTo(8.0f, 19.0f)
                curveTo(8.0f, 19.5523f, 8.4477f, 20.0f, 9.0f, 20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 20.0f, 16.0f, 19.5523f, 16.0f, 19.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(15.0f, 4.0f)
                curveTo(15.5523f, 4.0f, 16.0f, 4.4477f, 16.0f, 5.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 4.4477f, 8.4477f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }.build()
        return deviceMobileUnknown!!
    }

private var deviceMobileUnknown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.DeviceMobileUnknown,
                contentDescription = ""
            )
        }
    }
}