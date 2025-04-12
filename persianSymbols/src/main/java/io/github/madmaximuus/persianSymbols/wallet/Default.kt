package io.github.madmaximuus.persianSymbols.wallet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Wallet: ImageVector
    get() {
        if (wallet != null) {
            return wallet!!
        }
        wallet = Builder(
            name = "wallet-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 11.25f)
                curveTo(15.336f, 11.25f, 15f, 11.585f, 15f, 12f)
                curveTo(15f, 12.414f, 15.336f, 12.75f, 15.75f, 12.75f)
                curveTo(16.164f, 12.75f, 16.5f, 12.414f, 16.5f, 12f)
                curveTo(16.5f, 11.585f, 16.164f, 11.25f, 15.75f, 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.079f, 8.5f)
                curveTo(3.079f, 6.015f, 5.094f, 4f, 7.579f, 4f)
                horizontalLineTo(16.579f)
                curveTo(19.065f, 4f, 21.079f, 6.015f, 21.079f, 8.5f)
                verticalLineTo(9.348f)
                curveTo(21.761f, 9.587f, 22.25f, 10.237f, 22.25f, 11f)
                verticalLineTo(13f)
                curveTo(22.25f, 13.763f, 21.761f, 14.413f, 21.079f, 14.652f)
                verticalLineTo(15.5f)
                curveTo(21.079f, 17.985f, 19.065f, 20f, 16.579f, 20f)
                horizontalLineTo(7.579f)
                curveTo(5.094f, 20f, 3.079f, 17.985f, 3.079f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(19.079f, 8.5f)
                verticalLineTo(9.25f)
                horizontalLineTo(15.5f)
                curveTo(13.981f, 9.25f, 12.75f, 10.481f, 12.75f, 12f)
                curveTo(12.75f, 13.519f, 13.981f, 14.75f, 15.5f, 14.75f)
                horizontalLineTo(19.079f)
                verticalLineTo(15.5f)
                curveTo(19.079f, 16.881f, 17.96f, 18f, 16.579f, 18f)
                horizontalLineTo(7.579f)
                curveTo(6.199f, 18f, 5.079f, 16.881f, 5.079f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(5.079f, 7.119f, 6.199f, 6f, 7.579f, 6f)
                horizontalLineTo(16.579f)
                curveTo(17.96f, 6f, 19.079f, 7.119f, 19.079f, 8.5f)
                close()
                moveTo(15.5f, 10.75f)
                curveTo(14.81f, 10.75f, 14.25f, 11.31f, 14.25f, 12f)
                curveTo(14.25f, 12.69f, 14.81f, 13.25f, 15.5f, 13.25f)
                horizontalLineTo(20.5f)
                curveTo(20.638f, 13.25f, 20.75f, 13.138f, 20.75f, 13f)
                verticalLineTo(11f)
                curveTo(20.75f, 10.862f, 20.638f, 10.75f, 20.5f, 10.75f)
                horizontalLineTo(15.5f)
                close()
            }
        }.build()
        return wallet!!
    }

private var wallet: ImageVector? = null