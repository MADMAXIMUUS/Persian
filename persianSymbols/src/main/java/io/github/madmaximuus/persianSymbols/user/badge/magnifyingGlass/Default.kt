package io.github.madmaximuus.persianSymbols.user.badge.magnifyingGlass

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBadgeMagnifyingGlass: ImageVector
    get() {
        if (userBadgeMagnifyingGlass != null) {
            return userBadgeMagnifyingGlass!!
        }
        userBadgeMagnifyingGlass = Builder(
            name = "user-badge-magnifying-glass-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.77f, 2f)
                curveTo(9.285f, 2f, 7.27f, 4.015f, 7.27f, 6.5f)
                curveTo(7.27f, 8.985f, 9.285f, 11f, 11.77f, 11f)
                curveTo(14.255f, 11f, 16.27f, 8.985f, 16.27f, 6.5f)
                curveTo(16.27f, 4.015f, 14.255f, 2f, 11.77f, 2f)
                close()
                moveTo(9.27f, 6.5f)
                curveTo(9.27f, 5.119f, 10.389f, 4f, 11.77f, 4f)
                curveTo(13.151f, 4f, 14.27f, 5.119f, 14.27f, 6.5f)
                curveTo(14.27f, 7.881f, 13.151f, 9f, 11.77f, 9f)
                curveTo(10.389f, 9f, 9.27f, 7.881f, 9.27f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.691f, 16.35f)
                curveTo(7.733f, 14.967f, 9.596f, 14f, 11.775f, 14f)
                curveTo(12.283f, 14f, 12.774f, 14.052f, 13.242f, 14.151f)
                curveTo(13.7f, 13.481f, 14.346f, 12.95f, 15.103f, 12.631f)
                curveTo(14.084f, 12.224f, 12.955f, 12f, 11.775f, 12f)
                curveTo(9.02f, 12f, 6.544f, 13.222f, 5.094f, 15.145f)
                curveTo(4.676f, 15.699f, 4.473f, 16.321f, 4.503f, 16.954f)
                curveTo(4.532f, 17.577f, 4.784f, 18.133f, 5.144f, 18.58f)
                curveTo(5.851f, 19.457f, 7.035f, 20f, 8.275f, 20f)
                horizontalLineTo(14.267f)
                curveTo(13.581f, 19.505f, 13.048f, 18.81f, 12.754f, 18f)
                horizontalLineTo(8.275f)
                curveTo(7.583f, 18f, 6.994f, 17.688f, 6.701f, 17.325f)
                curveTo(6.561f, 17.152f, 6.507f, 16.991f, 6.501f, 16.86f)
                curveTo(6.495f, 16.738f, 6.526f, 16.568f, 6.691f, 16.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.293f, 16.594f)
                curveTo(13.293f, 14.655f, 14.865f, 13.084f, 16.804f, 13.084f)
                curveTo(18.743f, 13.084f, 20.314f, 14.655f, 20.314f, 16.594f)
                curveTo(20.314f, 17.346f, 20.078f, 18.043f, 19.675f, 18.614f)
                lineTo(21.612f, 20.551f)
                curveTo(21.905f, 20.844f, 21.905f, 21.319f, 21.612f, 21.612f)
                curveTo(21.319f, 21.904f, 20.844f, 21.904f, 20.552f, 21.612f)
                lineTo(18.569f, 19.629f)
                curveTo(18.05f, 19.931f, 17.447f, 20.104f, 16.804f, 20.104f)
                curveTo(14.865f, 20.104f, 13.293f, 18.533f, 13.293f, 16.594f)
                close()
                moveTo(16.804f, 14.584f)
                curveTo(15.694f, 14.584f, 14.793f, 15.484f, 14.793f, 16.594f)
                curveTo(14.793f, 17.704f, 15.694f, 18.604f, 16.804f, 18.604f)
                curveTo(17.914f, 18.604f, 18.814f, 17.704f, 18.814f, 16.594f)
                curveTo(18.814f, 15.484f, 17.914f, 14.584f, 16.804f, 14.584f)
                close()
            }
        }.build()
        return userBadgeMagnifyingGlass!!
    }

private var userBadgeMagnifyingGlass: ImageVector? = null