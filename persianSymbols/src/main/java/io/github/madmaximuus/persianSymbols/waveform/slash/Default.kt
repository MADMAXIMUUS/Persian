package io.github.madmaximuus.persianSymbols.waveform.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.WaveformSlash: ImageVector
    get() {
        if (waveformSlash != null) {
            return waveformSlash!!
        }
        waveformSlash = ImageVector.Builder(
            name = "waveform-slash-default",
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
                moveTo(6.5f, 16f)
                lineTo(6.5f, 8.975f)
                lineTo(8.5f, 10.975f)
                lineTo(8.5f, 16f)
                curveTo(8.5f, 16.552f, 8.052f, 17f, 7.5f, 17f)
                curveTo(6.948f, 17f, 6.5f, 16.552f, 6.5f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 19f)
                lineTo(9.5f, 11.975f)
                lineTo(11.5f, 13.975f)
                verticalLineTo(19f)
                curveTo(11.5f, 19.552f, 11.052f, 20f, 10.5f, 20f)
                curveTo(9.948f, 20f, 9.5f, 19.552f, 9.5f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 15f)
                verticalLineTo(14.975f)
                lineTo(13.525f, 16f)
                curveTo(13.517f, 16f, 13.508f, 16f, 13.5f, 16f)
                curveTo(12.948f, 16f, 12.5f, 15.552f, 12.5f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 9f)
                verticalLineTo(10.025f)
                lineTo(14.5f, 12.025f)
                verticalLineTo(9f)
                curveTo(14.5f, 8.448f, 14.052f, 8f, 13.5f, 8f)
                curveTo(12.948f, 8f, 12.5f, 8.448f, 12.5f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 18f)
                verticalLineTo(17.975f)
                lineTo(16.525f, 19f)
                curveTo(16.517f, 19f, 16.508f, 19f, 16.5f, 19f)
                curveTo(15.948f, 19f, 15.5f, 18.552f, 15.5f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 13.025f)
                lineTo(17.5f, 15.025f)
                lineTo(17.5f, 6f)
                curveTo(17.5f, 5.448f, 17.052f, 5f, 16.5f, 5f)
                curveTo(15.948f, 5f, 15.5f, 5.448f, 15.5f, 6f)
                lineTo(15.5f, 13.025f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 5f)
                verticalLineTo(7.025f)
                lineTo(11.5f, 9.025f)
                verticalLineTo(5f)
                curveTo(11.5f, 4.448f, 11.052f, 4f, 10.5f, 4f)
                curveTo(9.948f, 4f, 9.5f, 4.448f, 9.5f, 5f)
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
                moveTo(5.5f, 13f)
                curveTo(5.5f, 13.552f, 5.052f, 14f, 4.5f, 14f)
                curveTo(3.948f, 14f, 3.5f, 13.552f, 3.5f, 13f)
                verticalLineTo(11f)
                curveTo(3.5f, 10.448f, 3.948f, 10f, 4.5f, 10f)
                curveTo(5.052f, 10f, 5.5f, 10.448f, 5.5f, 11f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return waveformSlash!!
    }

private var waveformSlash: ImageVector? = null