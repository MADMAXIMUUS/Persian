package io.github.madmaximuus.persianSymbols.user.magnifyingGlass

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserMagnifyingGlass: ImageVector
    get() {
        if (userMagnifyingGlass != null) {
            return userMagnifyingGlass!!
        }
        userMagnifyingGlass = Builder(
            name = "user-magnifying-glass-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12f)
                curveTo(14.485f, 12f, 16.5f, 9.985f, 16.5f, 7.5f)
                curveTo(16.5f, 5.015f, 14.485f, 3f, 12f, 3f)
                curveTo(9.515f, 3f, 7.5f, 5.015f, 7.5f, 7.5f)
                curveTo(7.5f, 9.985f, 9.515f, 12f, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.178f, 16.818f)
                curveTo(6.585f, 14.528f, 9.113f, 13f, 11.999f, 13f)
                curveTo(12.709f, 13f, 13.397f, 13.092f, 14.052f, 13.266f)
                curveTo(13.104f, 14.045f, 12.5f, 15.227f, 12.5f, 16.55f)
                curveTo(12.5f, 18.897f, 14.403f, 20.8f, 16.75f, 20.8f)
                curveTo(16.796f, 20.8f, 16.842f, 20.799f, 16.888f, 20.798f)
                curveTo(16.483f, 20.928f, 16.047f, 21f, 15.599f, 21f)
                horizontalLineTo(8.399f)
                curveTo(5.969f, 21f, 3.906f, 18.889f, 5.178f, 16.818f)
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
                curveTo(15.693f, 14.584f, 14.793f, 15.484f, 14.793f, 16.594f)
                curveTo(14.793f, 17.704f, 15.693f, 18.604f, 16.804f, 18.604f)
                curveTo(17.914f, 18.604f, 18.814f, 17.704f, 18.814f, 16.594f)
                curveTo(18.814f, 15.484f, 17.914f, 14.584f, 16.804f, 14.584f)
                close()
            }
        }.build()
        return userMagnifyingGlass!!
    }

private var userMagnifyingGlass: ImageVector? = null