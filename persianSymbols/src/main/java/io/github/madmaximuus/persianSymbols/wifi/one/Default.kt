package io.github.madmaximuus.persianSymbols.wifi.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Wifi1: ImageVector
    get() {
        if (wifi1 != null) {
            return wifi1!!
        }
        wifi1 = Builder(
            name = "wifi-1-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.956f, 18f)
                curveTo(13.956f, 19.105f, 13.079f, 20f, 11.998f, 20f)
                curveTo(10.917f, 20f, 10.04f, 19.105f, 10.04f, 18f)
                curveTo(10.04f, 16.896f, 10.917f, 16f, 11.998f, 16f)
                curveTo(13.079f, 16f, 13.956f, 16.896f, 13.956f, 18f)
                close()
            }
        }.build()
        return wifi1!!
    }

private var wifi1: ImageVector? = null