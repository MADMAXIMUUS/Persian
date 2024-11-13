package io.github.madmaximuus.persianSymbols.creditCard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CreditCard: ImageVector
    get() {
        if (creditCard != null) {
            return creditCard!!
        }
        creditCard = Builder(
            name = "credit-card-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 4f)
                curveTo(4.02f, 4f, 2.082f, 5.889f, 2.003f, 8.25f)
                horizontalLineTo(21.997f)
                curveTo(21.918f, 5.889f, 19.98f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                horizontalLineTo(2f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(9.75f)
                close()
            }
        }.build()
        return creditCard!!
    }

private var creditCard: ImageVector? = null