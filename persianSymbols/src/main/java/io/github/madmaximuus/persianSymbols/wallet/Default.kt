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
                moveTo(15.5f, 10.75f)
                curveTo(15.224f, 10.75f, 15f, 10.974f, 15f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(15f, 13.026f, 15.224f, 13.25f, 15.5f, 13.25f)
                horizontalLineTo(17f)
                curveTo(17.276f, 13.25f, 17.5f, 13.026f, 17.5f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(17.5f, 10.974f, 17.276f, 10.75f, 17f, 10.75f)
                horizontalLineTo(15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 3f, 21f, 5.015f, 21f, 7.5f)
                verticalLineTo(7.764f)
                curveTo(21.614f, 8.313f, 22f, 9.111f, 22f, 10f)
                verticalLineTo(14f)
                curveTo(22f, 14.889f, 21.614f, 15.687f, 21f, 16.236f)
                verticalLineTo(16.5f)
                curveTo(21f, 18.985f, 18.985f, 21f, 16.5f, 21f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 21f, 3f, 18.985f, 3f, 16.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(16.5f, 5f)
                curveTo(17.709f, 5f, 18.718f, 5.859f, 18.95f, 7f)
                horizontalLineTo(15f)
                curveTo(13.343f, 7f, 12f, 8.343f, 12f, 10f)
                verticalLineTo(14f)
                curveTo(12f, 15.657f, 13.343f, 17f, 15f, 17f)
                horizontalLineTo(18.95f)
                curveTo(18.718f, 18.141f, 17.709f, 19f, 16.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(16.5f)
                close()
                moveTo(15f, 9f)
                curveTo(14.448f, 9f, 14f, 9.448f, 14f, 10f)
                verticalLineTo(14f)
                curveTo(14f, 14.552f, 14.448f, 15f, 15f, 15f)
                horizontalLineTo(19f)
                curveTo(19.552f, 15f, 20f, 14.552f, 20f, 14f)
                verticalLineTo(10f)
                curveTo(20f, 9.448f, 19.552f, 9f, 19f, 9f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        return wallet!!
    }

private var wallet: ImageVector? = null