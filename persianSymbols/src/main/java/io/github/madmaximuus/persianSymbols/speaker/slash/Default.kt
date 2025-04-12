package io.github.madmaximuus.persianSymbols.speaker.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SpeakerSlash: ImageVector
    get() {
        if (speakerSlash != null) {
            return speakerSlash!!
        }
        speakerSlash = ImageVector.Builder(
            name = "speaker-slash-default",
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
                lineTo(7.366f, 9.841f)
                curveTo(7.122f, 9.945f, 6.857f, 10f, 6.586f, 10f)
                horizontalLineTo(5f)
                curveTo(4.448f, 10f, 4f, 10.448f, 4f, 11f)
                verticalLineTo(13f)
                curveTo(4f, 13.552f, 4.448f, 14f, 5f, 14f)
                horizontalLineTo(6.586f)
                curveTo(7.116f, 14f, 7.625f, 14.211f, 8f, 14.586f)
                lineTo(11f, 17.586f)
                verticalLineTo(13.475f)
                lineTo(13f, 15.475f)
                verticalLineTo(18.793f)
                curveTo(13f, 20.129f, 11.384f, 20.799f, 10.439f, 19.854f)
                lineTo(6.586f, 16f)
                horizontalLineTo(5f)
                curveTo(3.343f, 16f, 2f, 14.657f, 2f, 13f)
                verticalLineTo(11f)
                curveTo(2f, 9.343f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.945f, 7.47f)
                lineTo(11f, 6.414f)
                verticalLineTo(8.525f)
                lineTo(13f, 10.525f)
                verticalLineTo(5.207f)
                curveTo(13f, 3.871f, 11.384f, 3.201f, 10.439f, 4.146f)
                lineTo(8.53f, 6.055f)
                lineTo(9.945f, 7.47f)
                close()
            }
        }.build()

        return speakerSlash!!
    }

private var speakerSlash: ImageVector? = null