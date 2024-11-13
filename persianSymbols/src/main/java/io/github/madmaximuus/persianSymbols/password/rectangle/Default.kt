package io.github.madmaximuus.persianSymbols.password.rectangle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PasswordRectangle: ImageVector
    get() {
        if (passwordRectangle != null) {
            return passwordRectangle!!
        }
        passwordRectangle = Builder(
            name = "password-rectangle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.374f, 10.084f)
                curveTo(6.144f, 9.739f, 5.679f, 9.646f, 5.334f, 9.876f)
                curveTo(4.989f, 10.105f, 4.896f, 10.571f, 5.126f, 10.916f)
                lineTo(5.349f, 11.25f)
                horizontalLineTo(5f)
                curveTo(4.586f, 11.25f, 4.25f, 11.586f, 4.25f, 12f)
                curveTo(4.25f, 12.415f, 4.586f, 12.75f, 5f, 12.75f)
                horizontalLineTo(5.349f)
                lineTo(5.126f, 13.085f)
                curveTo(4.896f, 13.429f, 4.989f, 13.895f, 5.334f, 14.125f)
                curveTo(5.679f, 14.354f, 6.144f, 14.261f, 6.374f, 13.916f)
                lineTo(6.75f, 13.352f)
                lineTo(7.126f, 13.916f)
                curveTo(7.356f, 14.261f, 7.821f, 14.354f, 8.166f, 14.125f)
                curveTo(8.511f, 13.895f, 8.604f, 13.429f, 8.374f, 13.085f)
                lineTo(8.151f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.914f, 12.75f, 9.25f, 12.415f, 9.25f, 12f)
                curveTo(9.25f, 11.586f, 8.914f, 11.25f, 8.5f, 11.25f)
                horizontalLineTo(8.151f)
                lineTo(8.374f, 10.916f)
                curveTo(8.604f, 10.571f, 8.511f, 10.105f, 8.166f, 9.876f)
                curveTo(7.821f, 9.646f, 7.356f, 9.739f, 7.126f, 10.084f)
                lineTo(6.75f, 10.648f)
                lineTo(6.374f, 10.084f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.584f, 9.876f)
                curveTo(10.929f, 9.646f, 11.394f, 9.739f, 11.624f, 10.084f)
                lineTo(12f, 10.648f)
                lineTo(12.376f, 10.084f)
                curveTo(12.606f, 9.739f, 13.071f, 9.646f, 13.416f, 9.876f)
                curveTo(13.761f, 10.105f, 13.854f, 10.571f, 13.624f, 10.916f)
                lineTo(13.401f, 11.25f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 11.25f, 14.5f, 11.586f, 14.5f, 12f)
                curveTo(14.5f, 12.415f, 14.164f, 12.75f, 13.75f, 12.75f)
                horizontalLineTo(13.401f)
                lineTo(13.624f, 13.085f)
                curveTo(13.854f, 13.429f, 13.761f, 13.895f, 13.416f, 14.125f)
                curveTo(13.071f, 14.354f, 12.606f, 14.261f, 12.376f, 13.916f)
                lineTo(12f, 13.352f)
                lineTo(11.624f, 13.916f)
                curveTo(11.394f, 14.261f, 10.929f, 14.354f, 10.584f, 14.125f)
                curveTo(10.239f, 13.895f, 10.146f, 13.429f, 10.376f, 13.085f)
                lineTo(10.599f, 12.75f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 12.75f, 9.5f, 12.415f, 9.5f, 12f)
                curveTo(9.5f, 11.586f, 9.836f, 11.25f, 10.25f, 11.25f)
                horizontalLineTo(10.599f)
                lineTo(10.376f, 10.916f)
                curveTo(10.146f, 10.571f, 10.239f, 10.105f, 10.584f, 9.876f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.874f, 10.084f)
                curveTo(16.644f, 9.739f, 16.179f, 9.646f, 15.834f, 9.876f)
                curveTo(15.489f, 10.105f, 15.396f, 10.571f, 15.626f, 10.916f)
                lineTo(15.849f, 11.25f)
                horizontalLineTo(15.5f)
                curveTo(15.086f, 11.25f, 14.75f, 11.586f, 14.75f, 12f)
                curveTo(14.75f, 12.415f, 15.086f, 12.75f, 15.5f, 12.75f)
                horizontalLineTo(15.849f)
                lineTo(15.626f, 13.085f)
                curveTo(15.396f, 13.429f, 15.489f, 13.895f, 15.834f, 14.125f)
                curveTo(16.179f, 14.354f, 16.644f, 14.261f, 16.874f, 13.916f)
                lineTo(17.25f, 13.352f)
                lineTo(17.626f, 13.916f)
                curveTo(17.856f, 14.261f, 18.321f, 14.354f, 18.666f, 14.125f)
                curveTo(19.011f, 13.895f, 19.104f, 13.429f, 18.874f, 13.085f)
                lineTo(18.651f, 12.75f)
                horizontalLineTo(19f)
                curveTo(19.414f, 12.75f, 19.75f, 12.415f, 19.75f, 12f)
                curveTo(19.75f, 11.586f, 19.414f, 11.25f, 19f, 11.25f)
                horizontalLineTo(18.651f)
                lineTo(18.874f, 10.916f)
                curveTo(19.104f, 10.571f, 19.011f, 10.105f, 18.666f, 9.876f)
                curveTo(18.321f, 9.646f, 17.856f, 9.739f, 17.626f, 10.084f)
                lineTo(17.25f, 10.648f)
                lineTo(16.874f, 10.084f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(6.4f, 6f)
                horizontalLineTo(17.6f)
                curveTo(18.926f, 6f, 20f, 7.075f, 20f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(20f, 16.926f, 18.926f, 18f, 17.6f, 18f)
                horizontalLineTo(6.4f)
                curveTo(5.075f, 18f, 4f, 16.926f, 4f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(4f, 7.075f, 5.075f, 6f, 6.4f, 6f)
                close()
            }
        }.build()
        return passwordRectangle!!
    }

private var passwordRectangle: ImageVector? = null