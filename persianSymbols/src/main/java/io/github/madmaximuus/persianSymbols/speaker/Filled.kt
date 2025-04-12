package io.github.madmaximuus.persianSymbols.speaker

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Speaker: ImageVector
    get() {
        if (speaker != null) {
            return speaker!!
        }
        speaker = ImageVector.Builder(
            name = "speaker-filled",
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
                curveTo(12.045f, 20.26f, 13f, 19.792f, 13f, 18.96f)
                verticalLineTo(5.04f)
                curveTo(13f, 4.208f, 12.045f, 3.74f, 11.388f, 4.249f)
                lineTo(6.816f, 7.791f)
                curveTo(6.641f, 7.926f, 6.425f, 8f, 6.203f, 8f)
                close()
            }
        }.build()

        return speaker!!
    }

private var speaker: ImageVector? = null