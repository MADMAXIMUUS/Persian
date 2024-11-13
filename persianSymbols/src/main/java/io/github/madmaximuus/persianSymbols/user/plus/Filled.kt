package io.github.madmaximuus.persianSymbols.user.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserPlus: ImageVector
    get() {
        if (userPlus != null) {
            return userPlus!!
        }
        userPlus = Builder(
            name = "user-plus-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 12.5f)
                curveTo(13.985f, 12.5f, 16f, 10.485f, 16f, 8f)
                curveTo(16f, 5.515f, 13.985f, 3.5f, 11.5f, 3.5f)
                curveTo(9.015f, 3.5f, 7f, 5.515f, 7f, 8f)
                curveTo(7f, 10.485f, 9.015f, 12.5f, 11.5f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.678f, 17.318f)
                curveTo(6.085f, 15.028f, 8.613f, 13.5f, 11.499f, 13.5f)
                curveTo(12.265f, 13.5f, 13.005f, 13.608f, 13.707f, 13.809f)
                curveTo(12.651f, 14.89f, 12f, 16.369f, 12f, 18f)
                curveTo(12f, 19.306f, 12.417f, 20.515f, 13.126f, 21.5f)
                horizontalLineTo(7.899f)
                curveTo(5.469f, 21.5f, 3.406f, 19.389f, 4.678f, 17.318f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.5f)
                curveTo(18.414f, 15.5f, 18.75f, 15.836f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 17.25f, 20.5f, 17.586f, 20.5f, 18f)
                curveTo(20.5f, 18.414f, 20.164f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.164f, 18.414f, 20.5f, 18f, 20.5f)
                curveTo(17.586f, 20.5f, 17.25f, 20.164f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 18.75f, 15.5f, 18.414f, 15.5f, 18f)
                curveTo(15.5f, 17.586f, 15.836f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.836f, 17.586f, 15.5f, 18f, 15.5f)
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
        return userPlus!!
    }

private var userPlus: ImageVector? = null