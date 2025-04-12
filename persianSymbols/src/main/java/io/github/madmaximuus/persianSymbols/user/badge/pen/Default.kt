package io.github.madmaximuus.persianSymbols.user.badge.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBadgePen: ImageVector
    get() {
        if (userBadgePen != null) {
            return userBadgePen!!
        }
        userBadgePen = Builder(
            name = "user-badge-pen-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                curveTo(12.871f, 14.5f, 14.297f, 15.018f, 15.355f, 15.838f)
                lineTo(16.778f, 14.415f)
                curveTo(15.331f, 13.216f, 13.385f, 12.5f, 11.275f, 12.5f)
                curveTo(8.52f, 12.5f, 6.044f, 13.722f, 4.594f, 15.645f)
                curveTo(4.176f, 16.199f, 3.973f, 16.821f, 4.003f, 17.454f)
                curveTo(4.032f, 18.077f, 4.284f, 18.633f, 4.644f, 19.08f)
                curveTo(5.351f, 19.957f, 6.535f, 20.5f, 7.775f, 20.5f)
                horizontalLineTo(12.374f)
                lineTo(12.381f, 20.483f)
                lineTo(13.197f, 18.5f)
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