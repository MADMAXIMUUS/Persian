package io.github.madmaximuus.persianSymbols.speaker.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.SpeakerPlus: ImageVector
    get() {
        if (speakerPlus != null) {
            return speakerPlus!!
        }
        speakerPlus = ImageVector.Builder(
            name = "speaker-plus-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8f)
                horizontalLineTo(6.203f)
                curveTo(6.425f, 8f, 6.641f, 7.926f, 6.816f, 7.79f)
                lineTo(11.388f, 4.249f)
                curveTo(12.045f, 3.74f, 13f, 4.208f, 13f, 5.039f)
                verticalLineTo(18.96f)
                curveTo(13f, 19.792f, 12.045f, 20.26f, 11.388f, 19.751f)
                lineTo(6.816f, 16.209f)
                curveTo(6.641f, 16.073f, 6.425f, 16f, 6.203f, 16f)
                horizontalLineTo(5f)
                curveTo(3.343f, 16f, 2f, 14.657f, 2f, 13f)
                verticalLineTo(11f)
                curveTo(2f, 9.343f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.001f, 9f)
                curveTo(18.553f, 9f, 19.001f, 9.447f, 19.001f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(21.002f)
                curveTo(21.554f, 12f, 22.002f, 12.448f, 22.002f, 13f)
                curveTo(22.002f, 13.553f, 21.554f, 14f, 21.002f, 14f)
                horizontalLineTo(19.001f)
                verticalLineTo(16.002f)
                curveTo(19.001f, 16.554f, 18.553f, 17.002f, 18.001f, 17.002f)
                curveTo(17.448f, 17.002f, 17.001f, 16.554f, 17.001f, 16.002f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                curveTo(14.448f, 14f, 14f, 13.553f, 14f, 13f)
                curveTo(14f, 12.448f, 14.448f, 12f, 15f, 12f)
                horizontalLineTo(17.001f)
                verticalLineTo(10f)
                curveTo(17.001f, 9.447f, 17.448f, 9f, 18.001f, 9f)
                close()
            }
        }.build()

        return speakerPlus!!
    }

private var speakerPlus: ImageVector? = null