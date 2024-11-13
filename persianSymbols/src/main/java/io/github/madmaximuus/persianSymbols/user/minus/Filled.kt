package io.github.madmaximuus.persianSymbols.user.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserMinus: ImageVector
    get() {
        if (userMinus != null) {
            return userMinus!!
        }
        userMinus = Builder(
            name = "user-minus-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 8f)
                curveTo(16f, 10.485f, 13.985f, 12.5f, 11.5f, 12.5f)
                curveTo(9.015f, 12.5f, 7f, 10.485f, 7f, 8f)
                curveTo(7f, 5.515f, 9.015f, 3.5f, 11.5f, 3.5f)
                curveTo(13.985f, 3.5f, 16f, 5.515f, 16f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.499f, 13.5f)
                curveTo(8.614f, 13.5f, 6.085f, 15.028f, 4.678f, 17.318f)
                curveTo(3.406f, 19.389f, 5.469f, 21.5f, 7.899f, 21.5f)
                horizontalLineTo(13.126f)
                curveTo(12.417f, 20.515f, 12f, 19.306f, 12f, 18f)
                curveTo(12f, 16.369f, 12.651f, 14.89f, 13.707f, 13.809f)
                curveTo(13.005f, 13.608f, 12.265f, 13.5f, 11.499f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.25f)
                curveTo(16.086f, 17.25f, 15.75f, 17.586f, 15.75f, 18f)
                curveTo(15.75f, 18.414f, 16.086f, 18.75f, 16.5f, 18.75f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 18.75f, 20.25f, 18.414f, 20.25f, 18f)
                curveTo(20.25f, 17.586f, 19.914f, 17.25f, 19.5f, 17.25f)
                horizontalLineTo(16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()
        return userMinus!!
    }

private var userMinus: ImageVector? = null