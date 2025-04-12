package io.github.madmaximuus.persianSymbols.speaker.xMark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.SpeakerXMark: ImageVector
    get() {
        if (speakerXMark != null) {
            return speakerXMark!!
        }
        speakerXMark = ImageVector.Builder(
            name = "speaker-x-mark-filled",
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
                moveTo(14.295f, 8.291f)
                curveTo(14.687f, 7.902f, 15.321f, 7.903f, 15.711f, 8.294f)
                lineTo(18.002f, 10.586f)
                lineTo(20.293f, 8.294f)
                curveTo(20.684f, 7.903f, 21.318f, 7.902f, 21.71f, 8.291f)
                curveTo(22.102f, 8.68f, 22.103f, 9.313f, 21.713f, 9.703f)
                lineTo(19.416f, 12.001f)
                lineTo(21.712f, 14.298f)
                curveTo(22.103f, 14.689f, 22.102f, 15.321f, 21.71f, 15.71f)
                curveTo(21.318f, 16.099f, 20.684f, 16.098f, 20.293f, 15.707f)
                lineTo(18.002f, 13.415f)
                lineTo(15.712f, 15.707f)
                curveTo(15.321f, 16.098f, 14.687f, 16.099f, 14.295f, 15.71f)
                curveTo(13.903f, 15.321f, 13.902f, 14.689f, 14.292f, 14.298f)
                lineTo(16.589f, 12.001f)
                lineTo(14.292f, 9.703f)
                curveTo(13.902f, 9.312f, 13.903f, 8.68f, 14.295f, 8.291f)
                close()
            }
        }.build()

        return speakerXMark!!
    }

private var speakerXMark: ImageVector? = null