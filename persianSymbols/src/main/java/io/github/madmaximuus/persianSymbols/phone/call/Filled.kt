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
                moveTo(4f, 3f)
                curveTo(4.015f, 3f, 4.03f, 3f, 4.046f, 3.001f)
                curveTo(4.059f, 3f, 4.073f, 3f, 4.087f, 3f)
                horizontalLineTo(7.072f)
                curveTo(7.974f, 3f, 8.764f, 3.604f, 9.001f, 4.475f)
                lineTo(9.68f, 6.968f)
                curveTo(9.877f, 7.69f, 9.654f, 8.461f, 9.103f, 8.966f)
                lineTo(6.847f, 11.038f)
                curveTo(8.322f, 13.655f, 10.552f, 15.744f, 13.064f, 17.125f)
                lineTo(15.318f, 14.845f)
                curveTo(15.833f, 14.324f, 16.592f, 14.127f, 17.295f, 14.33f)
                lineTo(19.555f, 14.983f)
                curveTo(20.411f, 15.23f, 21f, 16.013f, 21f, 16.904f)
                verticalLineTo(19.913f)
                curveTo(21f, 19.927f, 21f, 19.941f, 20.999f, 19.954f)
                curveTo(21f, 19.969f, 21f, 19.985f, 21f, 20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                curveTo(12.03f, 21f, 3f, 14.131f, 3f, 4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
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