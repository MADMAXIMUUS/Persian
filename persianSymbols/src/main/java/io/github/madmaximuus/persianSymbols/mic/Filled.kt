package io.github.madmaximuus.persianSymbols.mic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Mic: ImageVector
    get() {
        if (mic != null) {
            return mic!!
        }
        mic = Builder(
            name = "MicFilled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 4.8f)
                curveTo(8f, 3.254f, 9.254f, 2f, 10.8f, 2f)
                horizontalLineTo(13.2f)
                curveTo(14.746f, 2f, 16f, 3.254f, 16f, 4.8f)
                verticalLineTo(11.2f)
                curveTo(16f, 12.746f, 14.746f, 14f, 13.2f, 14f)
                horizontalLineTo(10.8f)
                curveTo(9.254f, 14f, 8f, 12.746f, 8f, 11.2f)
                verticalLineTo(4.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 11f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                curveTo(7f, 13.657f, 8.343f, 15f, 10f, 15f)
                horizontalLineTo(14f)
                curveTo(15.657f, 15f, 17f, 13.657f, 17f, 12f)
                curveTo(17f, 11.448f, 17.448f, 11f, 18f, 11f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                curveTo(19f, 14.761f, 16.761f, 17f, 14f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                curveTo(16.552f, 20f, 17f, 20.448f, 17f, 21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                curveTo(7f, 20.448f, 7.448f, 20f, 8f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                curveTo(7.238f, 17f, 5f, 14.761f, 5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                close()
            }
        }.build()
        return mic!!
    }

private var mic: ImageVector? = null