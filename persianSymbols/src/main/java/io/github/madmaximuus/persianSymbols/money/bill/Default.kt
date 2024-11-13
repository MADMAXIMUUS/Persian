package io.github.madmaximuus.persianSymbols.money.bill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MoneyBill: ImageVector
    get() {
        if (moneyBill != null) {
            return moneyBill!!
        }
        moneyBill = ImageVector.Builder(
            name = "money-bill-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
                close()
            }
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
                moveTo(7f, 7f)
                verticalLineTo(6f)
                lineTo(17f, 6f)
                verticalLineTo(7f)
                curveTo(17f, 8.105f, 17.895f, 9f, 19f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                curveTo(17.895f, 15f, 17f, 15.895f, 17f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                lineTo(7f, 17f)
                curveTo(7f, 15.895f, 6.105f, 15f, 5f, 15f)
                lineTo(4f, 15f)
                lineTo(4f, 9f)
                horizontalLineTo(5f)
                curveTo(6.105f, 9f, 7f, 8.105f, 7f, 7f)
                close()
            }
        }.build()

        return moneyBill!!
    }

private var moneyBill: ImageVector? = null
