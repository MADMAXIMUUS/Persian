package io.github.madmaximuus.persianSymbols.user.ban

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBan: ImageVector
    get() {
        if (userBan != null) {
            return userBan!!
        }
        userBan = ImageVector.Builder(
            name = "user-ban-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.27f, 2.5f)
                curveTo(8.785f, 2.5f, 6.77f, 4.515f, 6.77f, 7f)
                curveTo(6.77f, 9.485f, 8.785f, 11.5f, 11.27f, 11.5f)
                curveTo(13.755f, 11.5f, 15.77f, 9.485f, 15.77f, 7f)
                curveTo(15.77f, 4.515f, 13.755f, 2.5f, 11.27f, 2.5f)
                close()
                moveTo(8.77f, 7f)
                curveTo(8.77f, 5.619f, 9.889f, 4.5f, 11.27f, 4.5f)
                curveTo(12.651f, 4.5f, 13.77f, 5.619f, 13.77f, 7f)
                curveTo(13.77f, 8.381f, 12.651f, 9.5f, 11.27f, 9.5f)
                curveTo(9.889f, 9.5f, 8.77f, 8.381f, 8.77f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.191f, 16.85f)
                curveTo(7.233f, 15.467f, 9.096f, 14.5f, 11.275f, 14.5f)
                curveTo(11.872f, 14.5f, 12.445f, 14.573f, 12.984f, 14.706f)
                curveTo(13.396f, 14.08f, 13.922f, 13.536f, 14.532f, 13.103f)
                curveTo(13.532f, 12.714f, 12.428f, 12.5f, 11.275f, 12.5f)
                curveTo(8.52f, 12.5f, 6.044f, 13.722f, 4.594f, 15.645f)
                curveTo(4.176f, 16.199f, 3.973f, 16.821f, 4.003f, 17.454f)
                curveTo(4.032f, 18.077f, 4.284f, 18.633f, 4.644f, 19.08f)
                curveTo(5.351f, 19.957f, 6.535f, 20.5f, 7.775f, 20.5f)
                horizontalLineTo(12.544f)
                curveTo(12.261f, 19.883f, 12.079f, 19.209f, 12.021f, 18.5f)
                horizontalLineTo(7.775f)
                curveTo(7.083f, 18.5f, 6.494f, 18.188f, 6.201f, 17.825f)
                curveTo(6.061f, 17.652f, 6.007f, 17.491f, 6.001f, 17.36f)
                curveTo(5.995f, 17.238f, 6.026f, 17.068f, 6.191f, 16.85f)
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
