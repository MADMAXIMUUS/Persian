package io.github.madmaximuus.persianSymbols.speaker.xMark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SpeakerXMark: ImageVector
    get() {
        if (speakerXMark != null) {
            return speakerXMark!!
        }
        speakerXMark = ImageVector.Builder(
            name = "speaker-x-mark-default",
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
                moveTo(14.295f, 8.291f)
                curveTo(14.687f, 7.902f, 15.321f, 7.903f, 15.711f, 8.294f)
                lineTo(18.002f, 10.586f)
                lineTo(20.293f, 8.294f)
                curveTo(20.684f, 7.903f, 21.318f, 7.902f, 21.71f, 8.291f)
                curveTo(22.102f, 8.68f, 22.103f, 9.312f, 21.713f, 9.703f)
                lineTo(19.416f, 12f)
                lineTo(21.712f, 14.298f)
                curveTo(22.103f, 14.689f, 22.102f, 15.321f, 21.71f, 15.71f)
                curveTo(21.318f, 16.099f, 20.684f, 16.098f, 20.293f, 15.707f)
                lineTo(18.002f, 13.415f)
                lineTo(15.712f, 15.707f)
                curveTo(15.321f, 16.098f, 14.687f, 16.099f, 14.295f, 15.71f)
                curveTo(13.903f, 15.321f, 13.902f, 14.689f, 14.292f, 14.298f)
                lineTo(16.589f, 12f)
                lineTo(14.292f, 9.703f)
                curveTo(13.902f, 9.312f, 13.903f, 8.68f, 14.295f, 8.291f)
                close()
            }
        }.build()

        return speakerXMark!!
    }

private var speakerXMark: ImageVector? = null