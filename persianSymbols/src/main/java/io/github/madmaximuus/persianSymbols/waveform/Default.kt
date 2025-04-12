package io.github.madmaximuus.persianSymbols.waveform

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Waveform: ImageVector
    get() {
        if (waveform != null) {
            return waveform!!
        }
        waveform = ImageVector.Builder(
            name = "waveform-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 19f)
                curveTo(11.5f, 19.552f, 11.052f, 20f, 10.5f, 20f)
                curveTo(9.948f, 20f, 9.5f, 19.552f, 9.5f, 19f)
                lineTo(9.5f, 5f)
                curveTo(9.5f, 4.448f, 9.948f, 4f, 10.5f, 4f)
                curveTo(11.052f, 4f, 11.5f, 4.448f, 11.5f, 5f)
                verticalLineTo(19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 6f)
                curveTo(15.5f, 5.448f, 15.948f, 5f, 16.5f, 5f)
                curveTo(17.052f, 5f, 17.5f, 5.448f, 17.5f, 6f)
                lineTo(17.5f, 18f)
                curveTo(17.5f, 18.552f, 17.052f, 19f, 16.5f, 19f)
                curveTo(15.948f, 19f, 15.5f, 18.552f, 15.5f, 18f)
                lineTo(15.5f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 10f)
                curveTo(18.5f, 9.448f, 18.948f, 9f, 19.5f, 9f)
                curveTo(20.052f, 9f, 20.5f, 9.448f, 20.5f, 10f)
                verticalLineTo(14f)
                curveTo(20.5f, 14.552f, 20.052f, 15f, 19.5f, 15f)
                curveTo(18.948f, 15f, 18.5f, 14.552f, 18.5f, 14f)
                verticalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 8f)
                curveTo(12.948f, 8f, 12.5f, 8.448f, 12.5f, 9f)
                verticalLineTo(15f)
                curveTo(12.5f, 15.552f, 12.948f, 16f, 13.5f, 16f)
                curveTo(14.052f, 16f, 14.5f, 15.552f, 14.5f, 15f)
                verticalLineTo(9f)
                curveTo(14.5f, 8.448f, 14.052f, 8f, 13.5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 17f)
                curveTo(8.052f, 17f, 8.5f, 16.552f, 8.5f, 16f)
                lineTo(8.5f, 8f)
                curveTo(8.5f, 7.448f, 8.052f, 7f, 7.5f, 7f)
                curveTo(6.948f, 7f, 6.5f, 7.448f, 6.5f, 8f)
                lineTo(6.5f, 16f)
                curveTo(6.5f, 16.552f, 6.948f, 17f, 7.5f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 13f)
                curveTo(5.5f, 13.552f, 5.052f, 14f, 4.5f, 14f)
                curveTo(3.948f, 14f, 3.5f, 13.552f, 3.5f, 13f)
                verticalLineTo(11f)
                curveTo(3.5f, 10.448f, 3.948f, 10f, 4.5f, 10f)
                curveTo(5.052f, 10f, 5.5f, 10.448f, 5.5f, 11f)
                lineTo(5.5f, 13f)
                close()
            }
        }.build()

        return waveform!!
    }

private var waveform: ImageVector? = null