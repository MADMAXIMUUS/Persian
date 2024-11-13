package io.github.madmaximuus.persianSymbols.user.ban

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBan: ImageVector
    get() {
        if (userBan != null) {
            return userBan!!
        }
        userBan = ImageVector.Builder(
            name = "user-ban-filled",
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
                curveTo(12.356f, 12.5f, 13.446f, 12.741f, 14.432f, 13.176f)
                curveTo(12.957f, 14.269f, 12f, 16.023f, 12f, 18f)
                curveTo(12f, 18.892f, 12.195f, 19.739f, 12.544f, 20.5f)
                horizontalLineTo(7.609f)
                curveTo(5.179f, 20.5f, 3.116f, 18.389f, 4.388f, 16.318f)
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
                curveTo(17.467f, 14.75f, 16.964f, 14.878f, 16.52f, 15.106f)
                lineTo(20.894f, 19.48f)
                curveTo(21.122f, 19.036f, 21.25f, 18.533f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
                moveTo(14.75f, 18f)
                curveTo(14.75f, 17.467f, 14.878f, 16.964f, 15.106f, 16.52f)
                lineTo(19.48f, 20.894f)
                curveTo(19.036f, 21.122f, 18.533f, 21.25f, 18f, 21.25f)
                curveTo(16.205f, 21.25f, 14.75f, 19.795f, 14.75f, 18f)
                close()
            }
        }.build()

        return userBan!!
    }

private var userBan: ImageVector? = null
