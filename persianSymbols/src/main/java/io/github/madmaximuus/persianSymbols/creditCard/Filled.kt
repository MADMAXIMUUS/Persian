package io.github.madmaximuus.persianSymbols.creditCard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
                moveTo(2.003f, 8.25f)
                curveTo(2.082f, 5.889f, 4.02f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(19.98f, 4f, 21.918f, 5.889f, 21.997f, 8.25f)
                horizontalLineTo(2.003f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 9.75f)
                horizontalLineTo(22f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(9.75f)
                close()
                moveTo(6.206f, 13.809f)
                curveTo(5.654f, 13.809f, 5.206f, 14.257f, 5.206f, 14.809f)
                verticalLineTo(15.809f)
                curveTo(5.206f, 16.362f, 5.654f, 16.809f, 6.206f, 16.809f)
                horizontalLineTo(8.206f)
                curveTo(8.758f, 16.809f, 9.206f, 16.362f, 9.206f, 15.809f)
                verticalLineTo(14.809f)
                curveTo(9.206f, 14.257f, 8.758f, 13.809f, 8.206f, 13.809f)
                horizontalLineTo(6.206f)
                close()
            }
        }.build()
        return creditCard!!
    }

private var creditCard: ImageVector? = null