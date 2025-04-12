package io.github.madmaximuus.persianSymbols.speaker.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.SpeakerMinus: ImageVector
    get() {
        if (speakerMinus != null) {
            return speakerMinus!!
        }
        speakerMinus = ImageVector.Builder(
            name = "speaker-minus-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8f)
                horizontalLineTo(6.203f)
                curveTo(6.425f, 8f, 6.641f, 7.926f, 6.816f, 7.791f)
                lineTo(11.388f, 4.249f)
                curveTo(12.045f, 3.74f, 13f, 4.208f, 13f, 5.04f)
                verticalLineTo(18.961f)
                curveTo(13f, 19.792f, 12.045f, 20.26f, 11.388f, 19.751f)
                lineTo(6.816f, 16.209f)
                curveTo(6.641f, 16.074f, 6.425f, 16f, 6.203f, 16f)
                horizontalLineTo(5f)
                curveTo(3.343f, 16f, 2f, 14.657f, 2f, 13f)
                verticalLineTo(11f)
                curveTo(2f, 9.343f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 11.001f)
                curveTo(14.448f, 11.001f, 14f, 11.448f, 14f, 12.001f)
                curveTo(14f, 12.553f, 14.448f, 13.001f, 15f, 13.001f)
                horizontalLineTo(21.002f)
                curveTo(21.554f, 13.001f, 22.002f, 12.553f, 22.002f, 12.001f)
                curveTo(22.002f, 11.448f, 21.554f, 11.001f, 21.002f, 11.001f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return speakerMinus!!
    }

private var speakerMinus: ImageVector? = null