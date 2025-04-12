package io.github.madmaximuus.persianSymbols.phone.arrow.up.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PhoneArrowUpRight: ImageVector
    get() {
        if (phoneArrowUpRight != null) {
            return phoneArrowUpRight!!
        }
        phoneArrowUpRight = ImageVector.Builder(
            name = "phone-arrow-up-right-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.734f, 20.79f)
                curveTo(9.407f, 18.871f, 5.129f, 14.593f, 3.21f, 10.267f)
                curveTo(2.139f, 7.851f, 3.24f, 5.204f, 5.108f, 3.335f)
                curveTo(5.938f, 2.506f, 7.318f, 2.641f, 7.971f, 3.615f)
                lineTo(9.368f, 5.7f)
                curveTo(10f, 6.642f, 10.044f, 7.86f, 9.483f, 8.846f)
                curveTo(8.903f, 9.865f, 8.998f, 11.112f, 9.823f, 11.945f)
                curveTo(10.488f, 12.615f, 11.28f, 13.372f, 11.974f, 14.029f)
                curveTo(12.867f, 14.877f, 14.222f, 15.047f, 15.293f, 14.438f)
                curveTo(16.194f, 13.925f, 17.307f, 13.966f, 18.168f, 14.543f)
                lineTo(20.385f, 16.029f)
                curveTo(21.359f, 16.682f, 21.494f, 18.062f, 20.665f, 18.892f)
                curveTo(18.796f, 20.76f, 16.149f, 21.861f, 13.734f, 20.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 3f)
                curveTo(13.448f, 3f, 13f, 3.448f, 13f, 4f)
                curveTo(13f, 4.552f, 13.448f, 5f, 14f, 5f)
                horizontalLineTo(17.586f)
                lineTo(12.293f, 10.293f)
                curveTo(11.902f, 10.683f, 11.902f, 11.317f, 12.293f, 11.707f)
                curveTo(12.683f, 12.098f, 13.317f, 12.098f, 13.707f, 11.707f)
                lineTo(19f, 6.414f)
                verticalLineTo(10f)
                curveTo(19f, 10.552f, 19.447f, 11f, 20f, 11f)
                curveTo(20.552f, 11f, 21f, 10.552f, 21f, 10f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return phoneArrowUpRight!!
    }

private var phoneArrowUpRight: ImageVector? = null