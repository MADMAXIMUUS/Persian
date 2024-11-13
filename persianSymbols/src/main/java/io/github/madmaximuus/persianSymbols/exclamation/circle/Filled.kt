package io.github.madmaximuus.persianSymbols.exclamation.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ExclamationCircle: ImageVector
    get() {
        if (exclamationCircle != null) {
            return exclamationCircle!!
        }
        exclamationCircle = Builder(
            name = "exclamation-circle-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(12f, 7.205f)
                curveTo(12.414f, 7.205f, 12.75f, 7.541f, 12.75f, 7.955f)
                lineTo(12.75f, 13.429f)
                curveTo(12.75f, 13.843f, 12.414f, 14.179f, 12f, 14.179f)
                curveTo(11.586f, 14.179f, 11.25f, 13.843f, 11.25f, 13.429f)
                lineTo(11.25f, 7.955f)
                curveTo(11.25f, 7.541f, 11.586f, 7.205f, 12f, 7.205f)
                close()
                moveTo(13.002f, 15.795f)
                curveTo(13.002f, 16.347f, 12.554f, 16.795f, 12.002f, 16.795f)
                curveTo(11.45f, 16.795f, 11.002f, 16.347f, 11.002f, 15.795f)
                curveTo(11.002f, 15.243f, 11.45f, 14.795f, 12.002f, 14.795f)
                curveTo(12.554f, 14.795f, 13.002f, 15.243f, 13.002f, 15.795f)
                close()
            }
        }.build()
        return exclamationCircle!!
    }

private var exclamationCircle: ImageVector? = null