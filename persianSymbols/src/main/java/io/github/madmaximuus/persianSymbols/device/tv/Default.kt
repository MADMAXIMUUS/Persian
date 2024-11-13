package io.github.madmaximuus.persianSymbols.device.tv

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3f)
                curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(2f, 16.416f, 3.197f, 18.052f, 4.884f, 18.701f)
                lineTo(4.293f, 19.293f)
                curveTo(3.902f, 19.683f, 3.902f, 20.317f, 4.293f, 20.707f)
                curveTo(4.683f, 21.098f, 5.317f, 21.098f, 5.707f, 20.707f)
                lineTo(7.414f, 19f)
                horizontalLineTo(16.586f)
                lineTo(18.293f, 20.707f)
                curveTo(18.683f, 21.098f, 19.317f, 21.098f, 19.707f, 20.707f)
                curveTo(20.098f, 20.317f, 20.098f, 19.683f, 19.707f, 19.293f)
                lineTo(19.115f, 18.701f)
                curveTo(20.803f, 18.052f, 22f, 16.416f, 22f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 5.015f, 19.985f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(17.5f, 17f)
                curveTo(18.881f, 17f, 20f, 15.881f, 20f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(20f, 6.119f, 18.881f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 5f, 4f, 6.119f, 4f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(4f, 15.881f, 5.119f, 17f, 6.5f, 17f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()
        return deviceTv!!
    }

private var deviceTv: ImageVector? = null