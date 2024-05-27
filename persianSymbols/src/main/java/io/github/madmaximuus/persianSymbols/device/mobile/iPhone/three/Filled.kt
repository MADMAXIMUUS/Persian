package io.github.madmaximuus.persianSymbols.device.mobile.iPhone.three

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

val PersianSymbols.Filled.DeviceMobileIPhone3: ImageVector
    get() {
        if (deviceMobileIPhone3 != null) {
            return deviceMobileIPhone3!!
        }
        deviceMobileIPhone3 = Builder(
            name = "device-mobile-iphone-3-filled",
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
                moveTo(9.0f, 2.0f)
                curveTo(7.3432f, 2.0f, 6.0f, 3.3431f, 6.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(6.0f, 20.6569f, 7.3432f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(16.6569f, 22.0f, 18.0f, 20.6569f, 18.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(18.0f, 3.3431f, 16.6569f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(12.0f, 19.5f)
                curveTo(12.4142f, 19.5f, 12.75f, 19.1642f, 12.75f, 18.75f)
                curveTo(12.75f, 18.3358f, 12.4142f, 18.0f, 12.0f, 18.0f)
                curveTo(11.5858f, 18.0f, 11.25f, 18.3358f, 11.25f, 18.75f)
                curveTo(11.25f, 19.1642f, 11.5858f, 19.5f, 12.0f, 19.5f)
                close()
            }
        }.build()
        return deviceMobileIPhone3!!
    }

private var deviceMobileIPhone3: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeviceMobileIPhone3,
                contentDescription = ""
            )
        }
    }
}