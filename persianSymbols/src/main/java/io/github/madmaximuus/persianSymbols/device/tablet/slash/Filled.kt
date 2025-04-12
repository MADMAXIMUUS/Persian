package io.github.madmaximuus.persianSymbols.device.tablet.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceTabletSlash: ImageVector
    get() {
        if (deviceTabletSlash != null) {
            return deviceTabletSlash!!
        }
        deviceTabletSlash = ImageVector.Builder(
            name = "device-tablet-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.4f, 2f)
                curveTo(7.306f, 2f, 6.305f, 2.399f, 5.535f, 3.06f)
                lineTo(20f, 17.525f)
                verticalLineTo(6.4f)
                curveTo(20f, 3.97f, 18.03f, 2f, 15.6f, 2f)
                horizontalLineTo(8.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 17.6f)
                verticalLineTo(6.475f)
                lineTo(18.465f, 20.94f)
                curveTo(17.695f, 21.601f, 16.694f, 22f, 15.6f, 22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                close()
                moveTo(9f, 19.25f)
                curveTo(8.862f, 19.25f, 8.75f, 19.362f, 8.75f, 19.5f)
                curveTo(8.75f, 19.638f, 8.862f, 19.75f, 9f, 19.75f)
                horizontalLineTo(15f)
                curveTo(15.138f, 19.75f, 15.25f, 19.638f, 15.25f, 19.5f)
                curveTo(15.25f, 19.362f, 15.138f, 19.25f, 15f, 19.25f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return deviceTabletSlash!!
    }

private var deviceTabletSlash: ImageVector? = null