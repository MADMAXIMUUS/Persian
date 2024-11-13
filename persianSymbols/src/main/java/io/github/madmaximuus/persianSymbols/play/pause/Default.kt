package io.github.madmaximuus.persianSymbols.play.pause

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PlayPause: ImageVector
    get() {
        if (playPause != null) {
            return playPause!!
        }
        playPause = Builder(
            name = "play-pause-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.949f, 7.678f)
                lineTo(11.316f, 11.512f)
                curveTo(11.651f, 11.751f, 11.651f, 12.249f, 11.316f, 12.488f)
                lineTo(5.949f, 16.322f)
                curveTo(5.552f, 16.606f, 5f, 16.322f, 5f, 15.834f)
                verticalLineTo(8.166f)
                curveTo(5f, 7.678f, 5.552f, 7.394f, 5.949f, 7.678f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 9f)
                curveTo(15f, 8.448f, 14.552f, 8f, 14f, 8f)
                curveTo(13.448f, 8f, 13f, 8.448f, 13f, 9f)
                verticalLineTo(15f)
                curveTo(13f, 15.552f, 13.448f, 16f, 14f, 16f)
                curveTo(14.552f, 16f, 15f, 15.552f, 15f, 15f)
                verticalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 9f)
                curveTo(19f, 8.448f, 18.552f, 8f, 18f, 8f)
                curveTo(17.448f, 8f, 17f, 8.448f, 17f, 9f)
                verticalLineTo(15f)
                curveTo(17f, 15.552f, 17.448f, 16f, 18f, 16f)
                curveTo(18.552f, 16f, 19f, 15.552f, 19f, 15f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        return playPause!!
    }

private var playPause: ImageVector? = null