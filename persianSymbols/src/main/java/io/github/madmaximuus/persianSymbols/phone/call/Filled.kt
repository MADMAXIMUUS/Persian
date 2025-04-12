package io.github.madmaximuus.persianSymbols.phone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PhoneCall: ImageVector
    get() {
        if (phoneCall != null) {
            return phoneCall!!
        }
        phoneCall = Builder(
            name = "phone-call-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                moveTo(12f, 4f)
                curveTo(12f, 3.448f, 12.448f, 3f, 13f, 3f)
                curveTo(17.418f, 3f, 21f, 6.582f, 21f, 11f)
                curveTo(21f, 11.552f, 20.552f, 12f, 20f, 12f)
                curveTo(19.448f, 12f, 19f, 11.552f, 19f, 11f)
                curveTo(19f, 7.686f, 16.314f, 5f, 13f, 5f)
                curveTo(12.448f, 5f, 12f, 4.552f, 12f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8f)
                curveTo(12f, 7.448f, 12.448f, 7f, 13f, 7f)
                curveTo(15.209f, 7f, 17f, 8.791f, 17f, 11f)
                curveTo(17f, 11.552f, 16.552f, 12f, 16f, 12f)
                curveTo(15.448f, 12f, 15f, 11.552f, 15f, 11f)
                curveTo(15f, 9.895f, 14.105f, 9f, 13f, 9f)
                curveTo(12.448f, 9f, 12f, 8.552f, 12f, 8f)
                close()
            }
        }.build()
        return phoneCall!!
    }

private var phoneCall: ImageVector? = null