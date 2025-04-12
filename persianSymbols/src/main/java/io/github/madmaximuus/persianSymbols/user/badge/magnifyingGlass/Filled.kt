package io.github.madmaximuus.persianSymbols.user.badge.magnifyingGlass

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBadgeMagnifyingGlass: ImageVector
    get() {
        if (userBadgeMagnifyingGlass != null) {
            return userBadgeMagnifyingGlass!!
        }
        userBadgeMagnifyingGlass = Builder(
            name = "user-badge-magnifying-glass-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.71f, 11f)
                curveTo(14.195f, 11f, 16.21f, 8.985f, 16.21f, 6.5f)
                curveTo(16.21f, 4.015f, 14.195f, 2f, 11.71f, 2f)
                curveTo(9.225f, 2f, 7.21f, 4.015f, 7.21f, 6.5f)
                curveTo(7.21f, 8.985f, 9.225f, 11f, 11.71f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.888f, 15.818f)
                curveTo(6.295f, 13.528f, 8.823f, 12f, 11.709f, 12f)
                curveTo(12.869f, 12f, 13.972f, 12.247f, 14.967f, 12.691f)
                curveTo(13.51f, 13.365f, 12.5f, 14.84f, 12.5f, 16.55f)
                curveTo(12.5f, 17.971f, 13.197f, 19.228f, 14.267f, 20f)
                horizontalLineTo(8.109f)
                curveTo(5.679f, 20f, 3.616f, 17.889f, 4.888f, 15.818f)
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