package io.github.madmaximuus.persianSymbols.creditCard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CreditCard: ImageVector
    get() {
        if (creditCard != null) {
            return creditCard!!
        }
        creditCard = Builder(
            name = "credit-card-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(5.204f, 6f, 4.138f, 6.987f, 4.012f, 8.25f)
                horizontalLineTo(19.988f)
                curveTo(19.862f, 6.987f, 18.796f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 15.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(20f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                close()
            }
        }.build()
        return creditCard!!
    }

private var creditCard: ImageVector? = null