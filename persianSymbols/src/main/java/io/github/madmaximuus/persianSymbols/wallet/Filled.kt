package io.github.madmaximuus.persianSymbols.wallet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Wallet: ImageVector
    get() {
        if (wallet != null) {
            return wallet!!
        }
        wallet = Builder(
            name = "wallet-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 4f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 4f, 3f, 5.97f, 3f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(3f, 18.03f, 4.97f, 20f, 7.4f, 20f)
                horizontalLineTo(17f)
                curveTo(19.209f, 20f, 21f, 18.209f, 21f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(15.5f)
                curveTo(13.843f, 15f, 12.5f, 13.657f, 12.5f, 12f)
                curveTo(12.5f, 10.343f, 13.843f, 9f, 15.5f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                curveTo(21f, 5.791f, 19.209f, 4f, 17f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.5f, 12f)
                curveTo(13.5f, 10.895f, 14.395f, 10f, 15.5f, 10f)
                horizontalLineTo(21f)
                curveTo(21.552f, 10f, 22f, 10.448f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 13.552f, 21.552f, 14f, 21f, 14f)
                horizontalLineTo(15.5f)
                curveTo(14.395f, 14f, 13.5f, 13.105f, 13.5f, 12f)
                close()
                moveTo(15f, 12f)
                curveTo(15f, 11.585f, 15.336f, 11.25f, 15.75f, 11.25f)
                curveTo(16.164f, 11.25f, 16.5f, 11.585f, 16.5f, 12f)
                curveTo(16.5f, 12.414f, 16.164f, 12.75f, 15.75f, 12.75f)
                curveTo(15.336f, 12.75f, 15f, 12.414f, 15f, 12f)
                close()
            }
        }.build()
        return wallet!!
    }

private var wallet: ImageVector? = null