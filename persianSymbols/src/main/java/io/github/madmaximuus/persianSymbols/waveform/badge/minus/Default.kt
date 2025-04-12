package io.github.madmaximuus.persianSymbols.waveform.badge.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.WaveformBadgeMinus: ImageVector
    get() {
        if (waveformBadgeMinus != null) {
            return waveformBadgeMinus!!
        }
        waveformBadgeMinus = ImageVector.Builder(
            name = "waveform-badge-minus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.5f, 20f)
                curveTo(11.052f, 20f, 11.5f, 19.552f, 11.5f, 19f)
                verticalLineTo(5f)
                curveTo(11.5f, 4.448f, 11.052f, 4f, 10.5f, 4f)
                curveTo(9.948f, 4f, 9.5f, 4.448f, 9.5f, 5f)
                lineTo(9.5f, 19f)
                curveTo(9.5f, 19.552f, 9.948f, 20f, 10.5f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 5f)
                curveTo(15.948f, 5f, 15.5f, 5.448f, 15.5f, 6f)
                lineTo(15.5f, 13.1f)
                curveTo(16.11f, 12.788f, 16.785f, 12.587f, 17.5f, 12.522f)
                lineTo(17.5f, 6f)
                curveTo(17.5f, 5.448f, 17.052f, 5f, 16.5f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 13.1f)
                curveTo(19.89f, 12.788f, 19.215f, 12.587f, 18.5f, 12.522f)
                verticalLineTo(10f)
                curveTo(18.5f, 9.448f, 18.948f, 9f, 19.5f, 9f)
                curveTo(20.052f, 9f, 20.5f, 9.448f, 20.5f, 10f)
                verticalLineTo(13.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 13.757f)
                curveTo(13.829f, 14.311f, 13.292f, 15.021f, 12.944f, 15.831f)
                curveTo(12.676f, 15.652f, 12.5f, 15.347f, 12.5f, 15f)
                verticalLineTo(9f)
                curveTo(12.5f, 8.448f, 12.948f, 8f, 13.5f, 8f)
                curveTo(14.052f, 8f, 14.5f, 8.448f, 14.5f, 9f)
                verticalLineTo(13.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 16f)
                curveTo(8.5f, 16.552f, 8.052f, 17f, 7.5f, 17f)
                curveTo(6.948f, 17f, 6.5f, 16.552f, 6.5f, 16f)
                lineTo(6.5f, 8f)
                curveTo(6.5f, 7.448f, 6.948f, 7f, 7.5f, 7f)
                curveTo(8.052f, 7f, 8.5f, 7.448f, 8.5f, 8f)
                lineTo(8.5f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.5f, 14f)
                curveTo(5.052f, 14f, 5.5f, 13.552f, 5.5f, 13f)
                verticalLineTo(11f)
                curveTo(5.5f, 10.448f, 5.052f, 10f, 4.5f, 10f)
                curveTo(3.948f, 10f, 3.5f, 10.448f, 3.5f, 11f)
                verticalLineTo(13f)
                curveTo(3.5f, 13.552f, 3.948f, 14f, 4.5f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.25f)
                curveTo(16.086f, 17.25f, 15.75f, 17.586f, 15.75f, 18f)
                curveTo(15.75f, 18.414f, 16.086f, 18.75f, 16.5f, 18.75f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 18.75f, 20.25f, 18.414f, 20.25f, 18f)
                curveTo(20.25f, 17.586f, 19.914f, 17.25f, 19.5f, 17.25f)
                horizontalLineTo(16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()

        return waveformBadgeMinus!!
    }

private var waveformBadgeMinus: ImageVector? = null