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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.012f, 8.25f)
                curveTo(4.138f, 6.987f, 5.204f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.796f, 6f, 19.862f, 6.987f, 19.988f, 8.25f)
                horizontalLineTo(4.012f)
                close()
                moveTo(4f, 9.75f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 18f, 20f, 16.881f, 20f, 15.5f)
                verticalLineTo(9.75f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        return creditCard!!
    }

private var creditCard: ImageVector? = null