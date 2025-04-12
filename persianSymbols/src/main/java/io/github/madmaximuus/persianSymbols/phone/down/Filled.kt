package io.github.madmaximuus.persianSymbols.phone.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PhoneDown: ImageVector
    get() {
        if (phoneDown != null) {
            return phoneDown!!
        }
        phoneDown = ImageVector.Builder(
            name = "phone-down-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.441f, 8.597f)
                curveTo(15.025f, 6.894f, 8.975f, 6.894f, 4.559f, 8.597f)
                curveTo(2.094f, 9.547f, 1f, 12.198f, 1f, 14.84f)
                curveTo(1f, 16.013f, 2.072f, 16.893f, 3.222f, 16.666f)
                lineTo(5.84f, 16.149f)
                curveTo(6.857f, 15.949f, 7.673f, 15.19f, 7.948f, 14.191f)
                curveTo(8.274f, 13.003f, 9.353f, 12.165f, 10.584f, 12.132f)
                curveTo(11.539f, 12.107f, 12.634f, 12.082f, 13.578f, 12.086f)
                curveTo(14.751f, 12.091f, 15.699f, 12.906f, 16.01f, 14.037f)
                curveTo(16.31f, 15.131f, 17.203f, 15.96f, 18.316f, 16.18f)
                lineTo(20.778f, 16.666f)
                curveTo(21.928f, 16.893f, 23f, 16.013f, 23f, 14.84f)
                curveTo(23f, 12.198f, 21.906f, 9.547f, 19.441f, 8.597f)
                close()
            }
        }.build()

        return phoneDown!!
    }

private var phoneDown: ImageVector? = null