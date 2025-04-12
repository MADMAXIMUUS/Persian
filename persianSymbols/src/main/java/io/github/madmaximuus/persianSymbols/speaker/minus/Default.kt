package io.github.madmaximuus.persianSymbols.speaker.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SpeakerMinus: ImageVector
    get() {
        if (speakerMinus != null) {
            return speakerMinus!!
        }
        speakerMinus = ImageVector.Builder(
            name = "speaker-minus-default",
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