package io.github.madmaximuus.persianSymbols.user.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBadgeClock: ImageVector
    get() {
        if (userBadgeClock != null) {
            return userBadgeClock!!
        }
        userBadgeClock = ImageVector.Builder(
            name = "user-badge-clock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.21f, 11.5f)
                curveTo(13.695f, 11.5f, 15.71f, 9.485f, 15.71f, 7f)
                curveTo(15.71f, 4.515f, 13.695f, 2.5f, 11.21f, 2.5f)
                curveTo(8.725f, 2.5f, 6.71f, 4.515f, 6.71f, 7f)
                curveTo(6.71f, 9.485f, 8.725f, 11.5f, 11.21f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.388f, 16.318f)
                curveTo(5.795f, 14.028f, 8.323f, 12.5f, 11.209f, 12.5f)
                curveTo(12.559f, 12.5f, 13.831f, 12.834f, 14.946f, 13.425f)
                curveTo(13.471f, 14.411f, 12.5f, 16.092f, 12.5f, 18f)
                curveTo(12.5f, 18.9f, 12.716f, 19.75f, 13.1f, 20.5f)
                horizontalLineTo(7.609f)
                curveTo(5.179f, 20.5f, 3.116f, 18.389f, 4.388f, 16.318f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.75f)
                curveTo(18.414f, 15.75f, 18.75f, 16.086f, 18.75f, 16.5f)
                verticalLineTo(17.689f)
                lineTo(19.53f, 18.47f)
                curveTo(19.823f, 18.763f, 19.823f, 19.237f, 19.53f, 19.53f)
                curveTo(19.237f, 19.823f, 18.763f, 19.823f, 18.47f, 19.53f)
                lineTo(17.47f, 18.53f)
                curveTo(17.329f, 18.39f, 17.25f, 18.199f, 17.25f, 18f)
                verticalLineTo(16.5f)
                curveTo(17.25f, 16.086f, 17.586f, 15.75f, 18f, 15.75f)
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

        return userBadgeClock!!
    }

private var userBadgeClock: ImageVector? = null