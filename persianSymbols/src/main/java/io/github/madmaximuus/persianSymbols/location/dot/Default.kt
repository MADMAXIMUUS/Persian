package io.github.madmaximuus.persianSymbols.location.dot

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.LocationDot: ImageVector
    get() {
        if (locationDot != null) {
            return locationDot!!
        }
        locationDot = Builder(
            name = "location-dot-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4f)
                curveTo(9.791f, 4f, 8f, 5.791f, 8f, 8f)
                curveTo(8f, 9.831f, 8.707f, 12.954f, 9.69f, 15.658f)
                curveTo(10.178f, 17.001f, 10.713f, 18.18f, 11.225f, 19.004f)
                curveTo(11.482f, 19.419f, 11.709f, 19.704f, 11.891f, 19.873f)
                curveTo(11.936f, 19.914f, 11.972f, 19.943f, 12f, 19.964f)
                curveTo(12.028f, 19.943f, 12.064f, 19.914f, 12.109f, 19.873f)
                curveTo(12.291f, 19.704f, 12.518f, 19.419f, 12.775f, 19.004f)
                curveTo(13.287f, 18.18f, 13.822f, 17.001f, 14.31f, 15.658f)
                curveTo(15.293f, 12.954f, 16f, 9.831f, 16f, 8f)
                curveTo(16f, 5.791f, 14.209f, 4f, 12f, 4f)
                close()
                moveTo(6f, 8f)
                curveTo(6f, 4.686f, 8.686f, 2f, 12f, 2f)
                curveTo(15.314f, 2f, 18f, 4.686f, 18f, 8f)
                curveTo(18f, 10.169f, 17.207f, 13.546f, 16.19f, 16.342f)
                curveTo(15.678f, 17.749f, 15.088f, 19.07f, 14.475f, 20.059f)
                curveTo(14.17f, 20.55f, 13.834f, 21f, 13.469f, 21.338f)
                curveTo(13.123f, 21.66f, 12.622f, 22f, 12f, 22f)
                curveTo(11.378f, 22f, 10.877f, 21.66f, 10.531f, 21.338f)
                curveTo(10.166f, 21f, 9.83f, 20.55f, 9.525f, 20.059f)
                curveTo(8.912f, 19.07f, 8.322f, 17.749f, 7.81f, 16.342f)
                curveTo(6.793f, 13.546f, 6f, 10.169f, 6f, 8f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.31f, 6.75f, 10.75f, 7.31f, 10.75f, 8f)
                curveTo(10.75f, 8.69f, 11.31f, 9.25f, 12f, 9.25f)
                curveTo(12.69f, 9.25f, 13.25f, 8.69f, 13.25f, 8f)
                curveTo(13.25f, 7.31f, 12.69f, 6.75f, 12f, 6.75f)
                close()
                moveTo(9.25f, 8f)
                curveTo(9.25f, 6.481f, 10.481f, 5.25f, 12f, 5.25f)
                curveTo(13.519f, 5.25f, 14.75f, 6.481f, 14.75f, 8f)
                curveTo(14.75f, 9.519f, 13.519f, 10.75f, 12f, 10.75f)
                curveTo(10.481f, 10.75f, 9.25f, 9.519f, 9.25f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4f)
                curveTo(9.791f, 4f, 8f, 5.791f, 8f, 8f)
                curveTo(8f, 9.831f, 8.707f, 12.954f, 9.69f, 15.658f)
                curveTo(10.178f, 17.001f, 10.713f, 18.18f, 11.225f, 19.004f)
                curveTo(11.482f, 19.419f, 11.709f, 19.704f, 11.891f, 19.873f)
                curveTo(11.936f, 19.914f, 11.972f, 19.943f, 12f, 19.964f)
                curveTo(12.028f, 19.943f, 12.064f, 19.914f, 12.109f, 19.873f)
                curveTo(12.291f, 19.704f, 12.518f, 19.419f, 12.775f, 19.004f)
                curveTo(13.287f, 18.18f, 13.822f, 17.001f, 14.31f, 15.658f)
                curveTo(15.293f, 12.954f, 16f, 9.831f, 16f, 8f)
                curveTo(16f, 5.791f, 14.209f, 4f, 12f, 4f)
                close()
                moveTo(6f, 8f)
                curveTo(6f, 4.686f, 8.686f, 2f, 12f, 2f)
                curveTo(15.314f, 2f, 18f, 4.686f, 18f, 8f)
                curveTo(18f, 10.169f, 17.207f, 13.546f, 16.19f, 16.342f)
                curveTo(15.678f, 17.749f, 15.088f, 19.07f, 14.475f, 20.059f)
                curveTo(14.17f, 20.55f, 13.834f, 21f, 13.469f, 21.338f)
                curveTo(13.123f, 21.66f, 12.622f, 22f, 12f, 22f)
                curveTo(11.378f, 22f, 10.877f, 21.66f, 10.531f, 21.338f)
                curveTo(10.166f, 21f, 9.83f, 20.55f, 9.525f, 20.059f)
                curveTo(8.912f, 19.07f, 8.322f, 17.749f, 7.81f, 16.342f)
                curveTo(6.793f, 13.546f, 6f, 10.169f, 6f, 8f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.31f, 6.75f, 10.75f, 7.31f, 10.75f, 8f)
                curveTo(10.75f, 8.69f, 11.31f, 9.25f, 12f, 9.25f)
                curveTo(12.69f, 9.25f, 13.25f, 8.69f, 13.25f, 8f)
                curveTo(13.25f, 7.31f, 12.69f, 6.75f, 12f, 6.75f)
                close()
                moveTo(9.25f, 8f)
                curveTo(9.25f, 6.481f, 10.481f, 5.25f, 12f, 5.25f)
                curveTo(13.519f, 5.25f, 14.75f, 6.481f, 14.75f, 8f)
                curveTo(14.75f, 9.519f, 13.519f, 10.75f, 12f, 10.75f)
                curveTo(10.481f, 10.75f, 9.25f, 9.519f, 9.25f, 8f)
                close()
            }
        }.build()
        return locationDot!!
    }

private var locationDot: ImageVector? = null