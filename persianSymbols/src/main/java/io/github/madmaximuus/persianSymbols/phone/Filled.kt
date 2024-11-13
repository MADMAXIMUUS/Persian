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
                moveTo(4.046f, 3.001f)
                curveTo(4.03f, 3f, 4.015f, 3f, 4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                curveTo(3f, 14.131f, 12.03f, 21f, 20f, 21f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                curveTo(21f, 19.985f, 21f, 19.969f, 20.999f, 19.954f)
                curveTo(21f, 19.941f, 21f, 19.927f, 21f, 19.913f)
                verticalLineTo(16.904f)
                curveTo(21f, 16.013f, 20.411f, 15.23f, 19.555f, 14.983f)
                lineTo(17.295f, 14.33f)
                curveTo(16.592f, 14.127f, 15.833f, 14.324f, 15.318f, 14.845f)
                lineTo(13.064f, 17.125f)
                curveTo(10.552f, 15.744f, 8.322f, 13.655f, 6.847f, 11.038f)
                lineTo(9.103f, 8.966f)
                curveTo(9.654f, 8.461f, 9.877f, 7.69f, 9.68f, 6.968f)
                lineTo(9.001f, 4.475f)
                curveTo(8.764f, 3.604f, 7.974f, 3f, 7.072f, 3f)
                horizontalLineTo(4.087f)
                curveTo(4.073f, 3f, 4.059f, 3f, 4.046f, 3.001f)
                close()
            }
        }.build()
        return phone!!
    }

private var phone: ImageVector? = null