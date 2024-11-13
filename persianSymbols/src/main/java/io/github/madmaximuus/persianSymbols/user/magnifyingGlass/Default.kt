package io.github.madmaximuus.persianSymbols.user.magnifyingGlass

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserMagnifyingGlass: ImageVector
    get() {
        if (userMagnifyingGlass != null) {
            return userMagnifyingGlass!!
        }
        userMagnifyingGlass = Builder(
            name = "user-magnifying-glass-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 3f)
                curveTo(9.515f, 3f, 7.5f, 5.015f, 7.5f, 7.5f)
                curveTo(7.5f, 9.985f, 9.515f, 12f, 12f, 12f)
                curveTo(14.485f, 12f, 16.5f, 9.985f, 16.5f, 7.5f)
                curveTo(16.5f, 5.015f, 14.485f, 3f, 12f, 3f)
                close()
                moveTo(9.5f, 7.5f)
                curveTo(9.5f, 6.119f, 10.619f, 5f, 12f, 5f)
                curveTo(13.381f, 5f, 14.5f, 6.119f, 14.5f, 7.5f)
                curveTo(14.5f, 8.881f, 13.381f, 10f, 12f, 10f)
                curveTo(10.619f, 10f, 9.5f, 8.881f, 9.5f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.921f, 17.35f)
                curveTo(7.963f, 15.967f, 9.826f, 15f, 12.005f, 15f)
                curveTo(12.267f, 15f, 12.524f, 15.014f, 12.776f, 15.041f)
                curveTo(13.046f, 14.329f, 13.503f, 13.708f, 14.085f, 13.239f)
                curveTo(13.42f, 13.083f, 12.722f, 13f, 12.005f, 13f)
                curveTo(9.25f, 13f, 6.774f, 14.222f, 5.324f, 16.145f)
                curveTo(4.906f, 16.699f, 4.703f, 17.321f, 4.733f, 17.954f)
                curveTo(4.762f, 18.577f, 5.014f, 19.133f, 5.374f, 19.58f)
                curveTo(6.081f, 20.457f, 7.265f, 21f, 8.505f, 21f)
                horizontalLineTo(15.505f)
                curveTo(15.951f, 21f, 16.389f, 20.93f, 16.8f, 20.8f)
                lineTo(16.75f, 20.8f)
                curveTo(15.315f, 20.8f, 14.046f, 20.089f, 13.277f, 19f)
                horizontalLineTo(8.505f)
                curveTo(7.813f, 19f, 7.224f, 18.688f, 6.931f, 18.325f)
                curveTo(6.791f, 18.152f, 6.737f, 17.991f, 6.731f, 17.86f)
                curveTo(6.725f, 17.738f, 6.756f, 17.568f, 6.921f, 17.35f)
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