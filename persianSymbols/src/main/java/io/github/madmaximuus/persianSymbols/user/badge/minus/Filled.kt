package io.github.madmaximuus.persianSymbols.user.badge.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBadgeMinus: ImageVector
    get() {
        if (userBadgeMinus != null) {
            return userBadgeMinus!!
        }
        userBadgeMinus = Builder(
            name = "user-badge-minus-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.71f, 7f)
                curveTo(15.71f, 9.485f, 13.695f, 11.5f, 11.21f, 11.5f)
                curveTo(8.725f, 11.5f, 6.71f, 9.485f, 6.71f, 7f)
                curveTo(6.71f, 4.515f, 8.725f, 2.5f, 11.21f, 2.5f)
                curveTo(13.695f, 2.5f, 15.71f, 4.515f, 15.71f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.209f, 12.5f)
                curveTo(8.323f, 12.5f, 5.795f, 14.028f, 4.388f, 16.318f)
                curveTo(3.116f, 18.389f, 5.179f, 20.5f, 7.609f, 20.5f)
                horizontalLineTo(13.1f)
                curveTo(12.716f, 19.75f, 12.5f, 18.9f, 12.5f, 18f)
                curveTo(12.5f, 16.092f, 13.471f, 14.411f, 14.946f, 13.425f)
                curveTo(13.831f, 12.834f, 12.559f, 12.5f, 11.209f, 12.5f)
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
        return userBadgeMinus!!
    }

private var userBadgeMinus: ImageVector? = null