package io.github.madmaximuus.persianSymbols.speaker.wave.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.SpeakerWave1: ImageVector
    get() {
        if (speakerWave1 != null) {
            return speakerWave1!!
        }
        speakerWave1 = ImageVector.Builder(
            name = "speaker-wave-one-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.203f, 8f)
                horizontalLineTo(5f)
                curveTo(3.343f, 8f, 2f, 9.343f, 2f, 11f)
                verticalLineTo(13f)
                curveTo(2f, 14.657f, 3.343f, 16f, 5f, 16f)
                horizontalLineTo(6.203f)
                curveTo(6.425f, 16f, 6.641f, 16.074f, 6.816f, 16.209f)
                lineTo(11.388f, 19.751f)
                curveTo(12.045f, 20.26f, 13f, 19.792f, 13f, 18.961f)
                verticalLineTo(5.04f)
                curveTo(13f, 4.208f, 12.045f, 3.74f, 11.388f, 4.249f)
                lineTo(6.816f, 7.791f)
                curveTo(6.641f, 7.926f, 6.425f, 8f, 6.203f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.202f, 7.4f)
                curveTo(14.534f, 6.958f, 15.161f, 6.87f, 15.602f, 7.201f)
                curveTo(17.056f, 8.295f, 18f, 10.037f, 18f, 12f)
                curveTo(18f, 13.963f, 17.056f, 15.706f, 15.602f, 16.799f)
                curveTo(15.161f, 17.131f, 14.534f, 17.042f, 14.202f, 16.6f)
                curveTo(13.87f, 16.159f, 13.959f, 15.532f, 14.401f, 15.2f)
                curveTo(15.374f, 14.469f, 16f, 13.308f, 16f, 12f)
                curveTo(16f, 10.693f, 15.374f, 9.532f, 14.401f, 8.8f)
                curveTo(13.959f, 8.468f, 13.87f, 7.841f, 14.202f, 7.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.659f, 5.001f)
                curveTo(17.23f, 4.654f, 16.6f, 4.72f, 16.253f, 5.149f)
                curveTo(15.905f, 5.579f, 15.971f, 6.208f, 16.401f, 6.556f)
                curveTo(17.988f, 7.841f, 19f, 9.802f, 19f, 12f)
                curveTo(19f, 14.198f, 17.988f, 16.159f, 16.401f, 17.444f)
                curveTo(15.971f, 17.792f, 15.905f, 18.421f, 16.253f, 18.851f)
                curveTo(16.6f, 19.28f, 17.23f, 19.346f, 17.659f, 18.999f)
                curveTo(19.695f, 17.35f, 21f, 14.827f, 21f, 12f)
                curveTo(21f, 9.173f, 19.695f, 6.65f, 17.659f, 5.001f)
                close()
            }
        }.build()

        return speakerWave1!!
    }

private var speakerWave1: ImageVector? = null