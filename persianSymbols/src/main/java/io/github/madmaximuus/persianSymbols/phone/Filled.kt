package io.github.madmaximuus.persianSymbols.phone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Phone: ImageVector
    get() {
        if (phone != null) {
            return phone!!
        }
        phone = Builder(
            name = "phone-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.21f, 10.267f)
                curveTo(5.129f, 14.593f, 9.407f, 18.871f, 13.734f, 20.79f)
                curveTo(16.149f, 21.861f, 18.796f, 20.76f, 20.665f, 18.892f)
                curveTo(21.494f, 18.062f, 21.359f, 16.682f, 20.385f, 16.029f)
                lineTo(18.168f, 14.543f)
                curveTo(17.307f, 13.966f, 16.194f, 13.925f, 15.293f, 14.438f)
                curveTo(14.222f, 15.047f, 12.867f, 14.877f, 11.974f, 14.029f)
                curveTo(11.28f, 13.372f, 10.488f, 12.615f, 9.823f, 11.945f)
                curveTo(8.998f, 11.112f, 8.903f, 9.865f, 9.483f, 8.846f)
                curveTo(10.044f, 7.86f, 10f, 6.642f, 9.368f, 5.7f)
                lineTo(7.971f, 3.615f)
                curveTo(7.318f, 2.641f, 5.938f, 2.506f, 5.108f, 3.335f)
                curveTo(3.24f, 5.204f, 2.139f, 7.851f, 3.21f, 10.267f)
                close()
            }
        }.build()
        return phone!!
    }

private var phone: ImageVector? = null