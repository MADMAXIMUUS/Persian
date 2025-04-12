package io.github.madmaximuus.persianSymbols.speaker.wave.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SpeakerWave1: ImageVector
    get() {
        if (speakerWave1 != null) {
            return speakerWave1!!
        }
        speakerWave1 = ImageVector.Builder(
            name = "speaker-wave-one-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 5.207f)
                curveTo(13f, 3.871f, 11.384f, 3.201f, 10.439f, 4.146f)
                lineTo(6.586f, 8f)
                horizontalLineTo(5f)
                curveTo(3.343f, 8f, 2f, 9.343f, 2f, 11f)
                verticalLineTo(13f)
                curveTo(2f, 14.657f, 3.343f, 16f, 5f, 16f)
                horizontalLineTo(6.586f)
                lineTo(10.439f, 19.854f)
                curveTo(11.384f, 20.799f, 13f, 20.129f, 13f, 18.793f)
                verticalLineTo(5.207f)
                close()
                moveTo(8f, 9.414f)
                lineTo(11f, 6.414f)
                verticalLineTo(17.586f)
                lineTo(8f, 14.586f)
                curveTo(7.625f, 14.211f, 7.116f, 14f, 6.586f, 14f)
                horizontalLineTo(5f)
                curveTo(4.448f, 14f, 4f, 13.552f, 4f, 13f)
                verticalLineTo(11f)
                curveTo(4f, 10.448f, 4.448f, 10f, 5f, 10f)
                horizontalLineTo(6.586f)
                curveTo(7.116f, 10f, 7.625f, 9.789f, 8f, 9.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.602f, 7.201f)
                curveTo(15.161f, 6.87f, 14.534f, 6.958f, 14.202f, 7.4f)
                curveTo(13.87f, 7.841f, 13.959f, 8.468f, 14.401f, 8.8f)
                curveTo(15.374f, 9.532f, 16f, 10.693f, 16f, 12f)
                curveTo(16f, 13.307f, 15.374f, 14.468f, 14.401f, 15.2f)
                curveTo(13.959f, 15.532f, 13.87f, 16.159f, 14.202f, 16.6f)
                curveTo(14.534f, 17.042f, 15.161f, 17.131f, 15.602f, 16.799f)
                curveTo(17.056f, 15.706f, 18f, 13.963f, 18f, 12f)
                curveTo(18f, 10.037f, 17.056f, 8.294f, 15.602f, 7.201f)
                close()
            }
        }.build()

        return speakerWave1!!
    }

private var speakerWave1: ImageVector? = null