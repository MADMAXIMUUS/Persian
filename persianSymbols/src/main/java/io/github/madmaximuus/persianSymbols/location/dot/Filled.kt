package io.github.madmaximuus.persianSymbols.location.dot

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.LocationDot: ImageVector
    get() {
        if (locationDot != null) {
            return locationDot!!
        }
        locationDot = Builder(
            name = "location-dot-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(13.8f, 22f, 18f, 12f, 18f, 7.556f)
                curveTo(18f, 4.487f, 15.314f, 2f, 12f, 2f)
                curveTo(8.686f, 2f, 6f, 4.487f, 6f, 7.556f)
                curveTo(6f, 12f, 10.2f, 22f, 12f, 22f)
                close()
                moveTo(12f, 10f)
                curveTo(13.105f, 10f, 14f, 9.105f, 14f, 8f)
                curveTo(14f, 6.895f, 13.105f, 6f, 12f, 6f)
                curveTo(10.895f, 6f, 10f, 6.895f, 10f, 8f)
                curveTo(10f, 9.105f, 10.895f, 10f, 12f, 10f)
                close()
            }
        }.build()
        return locationDot!!
    }

private var locationDot: ImageVector? = null