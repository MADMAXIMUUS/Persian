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
                moveTo(16.6f, 3f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 3f, 3f, 4.97f, 3f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3f, 19.03f, 4.97f, 21f, 7.4f, 21f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 21f, 21f, 19.03f, 21f, 16.6f)
                verticalLineTo(16.236f)
                curveTo(20.469f, 16.711f, 19.768f, 17f, 19f, 17f)
                horizontalLineTo(15f)
                curveTo(13.343f, 17f, 12f, 15.657f, 12f, 14f)
                verticalLineTo(10f)
                curveTo(12f, 8.343f, 13.343f, 7f, 15f, 7f)
                horizontalLineTo(19f)
                curveTo(19.768f, 7f, 20.469f, 7.289f, 21f, 7.764f)
                verticalLineTo(7.4f)
                curveTo(21f, 4.97f, 19.03f, 3f, 16.6f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 10f)
                curveTo(14f, 9.448f, 14.448f, 9f, 15f, 9f)
                horizontalLineTo(19f)
                curveTo(19.552f, 9f, 20f, 9.448f, 20f, 10f)
                verticalLineTo(14f)
                curveTo(20f, 14.552f, 19.552f, 15f, 19f, 15f)
                horizontalLineTo(15f)
                curveTo(14.448f, 15f, 14f, 14.552f, 14f, 14f)
                verticalLineTo(10f)
                close()
                moveTo(15f, 11.25f)
                curveTo(15f, 10.974f, 15.224f, 10.75f, 15.5f, 10.75f)
                horizontalLineTo(17f)
                curveTo(17.276f, 10.75f, 17.5f, 10.974f, 17.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(17.5f, 13.026f, 17.276f, 13.25f, 17f, 13.25f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 13.25f, 15f, 13.026f, 15f, 12.75f)
                verticalLineTo(11.25f)
                close()
            }
        }.build()
        return wallet!!
    }

private var wallet: ImageVector? = null