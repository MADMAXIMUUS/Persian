package io.github.madmaximuus.persianSymbols.speaker.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.SpeakerSlash: ImageVector
    get() {
        if (speakerSlash != null) {
            return speakerSlash!!
        }
        speakerSlash = ImageVector.Builder(
            name = "speaker-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8f)
                horizontalLineTo(5.525f)
                lineTo(13f, 15.475f)
                verticalLineTo(18.961f)
                curveTo(13f, 19.792f, 12.045f, 20.26f, 11.388f, 19.751f)
                lineTo(6.816f, 16.21f)
                curveTo(6.641f, 16.074f, 6.425f, 16f, 6.203f, 16f)
                horizontalLineTo(5f)
                curveTo(3.343f, 16f, 2f, 14.657f, 2f, 13f)
                verticalLineTo(11f)
                curveTo(2f, 9.343f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 5.04f)
                verticalLineTo(10.525f)
                lineTo(8.76f, 6.285f)
                lineTo(11.388f, 4.249f)
                curveTo(12.045f, 3.74f, 13f, 4.208f, 13f, 5.04f)
                close()
            }
        }.build()

        return speakerSlash!!
    }

private var speakerSlash: ImageVector? = null