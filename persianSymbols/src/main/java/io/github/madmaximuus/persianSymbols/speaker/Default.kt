package io.github.madmaximuus.persianSymbols.speaker

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Speaker: ImageVector
    get() {
        if (speaker != null) {
            return speaker!!
        }
        speaker = ImageVector.Builder(
            name = "speaker-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.439f, 4.146f)
                curveTo(11.384f, 3.201f, 13f, 3.871f, 13f, 5.207f)
                verticalLineTo(18.793f)
                curveTo(13f, 20.129f, 11.384f, 20.799f, 10.439f, 19.854f)
                lineTo(6.586f, 16f)
                horizontalLineTo(5f)
                curveTo(3.343f, 16f, 2f, 14.657f, 2f, 13f)
                verticalLineTo(11f)
                curveTo(2f, 9.343f, 3.343f, 8f, 5f, 8f)
                horizontalLineTo(6.586f)
                lineTo(10.439f, 4.146f)
                close()
                moveTo(11f, 6.414f)
                lineTo(8f, 9.414f)
                curveTo(7.625f, 9.789f, 7.116f, 10f, 6.586f, 10f)
                horizontalLineTo(5f)
                curveTo(4.448f, 10f, 4f, 10.448f, 4f, 11f)
                verticalLineTo(13f)
                curveTo(4f, 13.552f, 4.448f, 14f, 5f, 14f)
                horizontalLineTo(6.586f)
                curveTo(7.116f, 14f, 7.625f, 14.211f, 8f, 14.586f)
                lineTo(11f, 17.586f)
                verticalLineTo(6.414f)
                close()
            }
        }.build()

        return speaker!!
    }

private var speaker: ImageVector? = null