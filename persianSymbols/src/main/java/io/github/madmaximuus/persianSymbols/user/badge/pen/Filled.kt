package io.github.madmaximuus.persianSymbols.user.badge.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBadgePen: ImageVector
    get() {
        if (userBadgePen != null) {
            return userBadgePen!!
        }
        userBadgePen = Builder(
            name = "user-badge-pen-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                curveTo(13.287f, 12.5f, 15.18f, 13.292f, 16.602f, 14.591f)
                lineTo(13.903f, 17.291f)
                curveTo(13.67f, 17.524f, 13.485f, 17.801f, 13.359f, 18.107f)
                lineTo(12.381f, 20.483f)
                lineTo(12.374f, 20.5f)
                horizontalLineTo(7.609f)
                curveTo(5.179f, 20.5f, 3.116f, 18.389f, 4.388f, 16.318f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.888f, 13.366f)
                curveTo(19.376f, 12.878f, 20.168f, 12.878f, 20.656f, 13.366f)
                lineTo(21.717f, 14.427f)
                curveTo(22.205f, 14.915f, 22.205f, 15.706f, 21.717f, 16.194f)
                lineTo(17.262f, 20.649f)
                curveTo(17.098f, 20.813f, 16.904f, 20.942f, 16.691f, 21.03f)
                lineTo(14.314f, 22.009f)
                curveTo(13.533f, 22.33f, 12.753f, 21.549f, 13.074f, 20.768f)
                lineTo(14.053f, 18.392f)
                curveTo(14.141f, 18.178f, 14.27f, 17.984f, 14.434f, 17.821f)
                lineTo(18.888f, 13.366f)
                close()
                moveTo(19.772f, 14.604f)
                lineTo(19.255f, 15.12f)
                lineTo(19.962f, 15.827f)
                lineTo(20.479f, 15.311f)
                lineTo(19.772f, 14.604f)
                close()
                moveTo(15.494f, 18.882f)
                lineTo(18.485f, 15.891f)
                lineTo(19.192f, 16.598f)
                lineTo(16.201f, 19.589f)
                curveTo(16.178f, 19.612f, 16.15f, 19.631f, 16.12f, 19.643f)
                lineTo(14.964f, 20.119f)
                lineTo(15.44f, 18.963f)
                curveTo(15.452f, 18.933f, 15.471f, 18.905f, 15.494f, 18.882f)
                close()
            }
        }.build()
        return userBadgePen!!
    }

private var userBadgePen: ImageVector? = null