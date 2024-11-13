package io.github.madmaximuus.persianSymbols.money.bill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MoneyBill: ImageVector
    get() {
        if (moneyBill != null) {
            return moneyBill!!
        }
        moneyBill = ImageVector.Builder(
            name = "money-bill-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
                moveTo(7f, 17f)
                lineTo(7f, 18f)
                horizontalLineTo(6f)
                curveTo(4.895f, 18f, 4f, 17.105f, 4f, 16f)
                verticalLineTo(15f)
                lineTo(5f, 15f)
                curveTo(6.105f, 15f, 7f, 15.895f, 7f, 17f)
                close()
                moveTo(4f, 9f)
                horizontalLineTo(5f)
                curveTo(6.105f, 9f, 7f, 8.105f, 7f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                curveTo(4.895f, 6f, 4f, 6.895f, 4f, 8f)
                verticalLineTo(9f)
                close()
                moveTo(17f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                curveTo(19.105f, 6f, 20f, 6.895f, 20f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                curveTo(17.895f, 9f, 17f, 8.105f, 17f, 7f)
                close()
                moveTo(20f, 15f)
                horizontalLineTo(19f)
                curveTo(17.895f, 15f, 17f, 15.895f, 17f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                curveTo(19.105f, 18f, 20f, 17.105f, 20f, 16f)
                verticalLineTo(15f)
                close()
                moveTo(12f, 15f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return moneyBill!!
    }

private var moneyBill: ImageVector? = null
