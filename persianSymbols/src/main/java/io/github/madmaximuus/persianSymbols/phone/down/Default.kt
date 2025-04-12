package io.github.madmaximuus.persianSymbols.phone.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PhoneDown: ImageVector
    get() {
        if (phoneDown != null) {
            return phoneDown!!
        }
        phoneDown = ImageVector.Builder(
            name = "phone-down-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 14.457f)
                curveTo(23f, 15.859f, 21.717f, 16.911f, 20.342f, 16.636f)
                lineTo(18.201f, 16.208f)
                curveTo(16.921f, 15.952f, 16f, 14.828f, 16f, 13.522f)
                curveTo(16f, 13.218f, 15.835f, 13.021f, 15.667f, 12.959f)
                curveTo(13.378f, 12.111f, 10.622f, 12.111f, 8.333f, 12.959f)
                curveTo(8.165f, 13.021f, 8f, 13.218f, 8f, 13.522f)
                curveTo(8f, 14.828f, 7.078f, 15.952f, 5.798f, 16.208f)
                lineTo(3.658f, 16.636f)
                curveTo(2.283f, 16.911f, 1f, 15.859f, 1f, 14.457f)
                curveTo(1f, 11.975f, 2.301f, 9.436f, 4.847f, 8.535f)
                curveTo(9.415f, 6.919f, 14.585f, 6.919f, 19.153f, 8.535f)
                curveTo(21.699f, 9.436f, 23f, 11.975f, 23f, 14.457f)
                close()
                moveTo(20.735f, 14.675f)
                curveTo(20.872f, 14.702f, 21f, 14.597f, 21f, 14.457f)
                curveTo(21f, 12.593f, 20.036f, 10.969f, 18.485f, 10.42f)
                curveTo(14.35f, 8.957f, 9.65f, 8.957f, 5.515f, 10.42f)
                curveTo(3.964f, 10.969f, 3f, 12.593f, 3f, 14.457f)
                curveTo(3f, 14.597f, 3.128f, 14.702f, 3.266f, 14.675f)
                lineTo(5.406f, 14.247f)
                curveTo(5.751f, 14.178f, 6f, 13.875f, 6f, 13.522f)
                curveTo(6f, 12.51f, 6.571f, 11.479f, 7.638f, 11.083f)
                curveTo(10.375f, 10.069f, 13.624f, 10.069f, 16.362f, 11.083f)
                curveTo(17.429f, 11.479f, 18f, 12.51f, 18f, 13.522f)
                curveTo(18f, 13.875f, 18.248f, 14.178f, 18.594f, 14.247f)
                lineTo(20.735f, 14.675f)
                close()
            }
        }.build()

        return phoneDown!!
    }

private var phoneDown: ImageVector? = null