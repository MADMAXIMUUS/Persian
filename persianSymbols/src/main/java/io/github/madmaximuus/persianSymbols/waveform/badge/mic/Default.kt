package io.github.madmaximuus.persianSymbols.waveform.badge.mic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.WaveformBadgeMic: ImageVector
    get() {
        if (waveformBadgeMic != null) {
            return waveformBadgeMic!!
        }
        waveformBadgeMic = ImageVector.Builder(
            name = "waveform-badge-mic-default",
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
                verticalLineTo(11.05f)
                curveTo(16.364f, 11.28f, 15.508f, 12.281f, 15.5f, 13.482f)
                lineTo(15.5f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 11f)
                curveTo(19.563f, 11f, 20.082f, 11.186f, 20.5f, 11.5f)
                verticalLineTo(10f)
                curveTo(20.5f, 9.448f, 20.052f, 9f, 19.5f, 9f)
                curveTo(18.948f, 9f, 18.5f, 9.448f, 18.5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
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
                verticalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 11.75f)
                curveTo(17.033f, 11.75f, 16.25f, 12.533f, 16.25f, 13.5f)
                verticalLineTo(16.5f)
                curveTo(16.25f, 17.466f, 17.033f, 18.25f, 18f, 18.25f)
                horizontalLineTo(19f)
                curveTo(19.966f, 18.25f, 20.75f, 17.466f, 20.75f, 16.5f)
                verticalLineTo(13.5f)
                curveTo(20.75f, 12.533f, 19.966f, 11.75f, 19f, 11.75f)
                horizontalLineTo(18f)
                close()
                moveTo(17.75f, 13.5f)
                curveTo(17.75f, 13.362f, 17.862f, 13.25f, 18f, 13.25f)
                horizontalLineTo(19f)
                curveTo(19.138f, 13.25f, 19.25f, 13.362f, 19.25f, 13.5f)
                verticalLineTo(16.5f)
                curveTo(19.25f, 16.638f, 19.138f, 16.75f, 19f, 16.75f)
                horizontalLineTo(18f)
                curveTo(17.862f, 16.75f, 17.75f, 16.638f, 17.75f, 16.5f)
                verticalLineTo(13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 17.5f)
                curveTo(15.75f, 17.086f, 15.414f, 16.75f, 15f, 16.75f)
                curveTo(14.586f, 16.75f, 14.25f, 17.086f, 14.25f, 17.5f)
                curveTo(14.25f, 19.019f, 15.481f, 20.25f, 17f, 20.25f)
                horizontalLineTo(17.75f)
                verticalLineTo(20.75f)
                horizontalLineTo(16.5f)
                curveTo(16.086f, 20.75f, 15.75f, 21.086f, 15.75f, 21.5f)
                curveTo(15.75f, 21.914f, 16.086f, 22.25f, 16.5f, 22.25f)
                horizontalLineTo(20.5f)
                curveTo(20.914f, 22.25f, 21.25f, 21.914f, 21.25f, 21.5f)
                curveTo(21.25f, 21.086f, 20.914f, 20.75f, 20.5f, 20.75f)
                horizontalLineTo(19.25f)
                verticalLineTo(20.25f)
                horizontalLineTo(20f)
                curveTo(21.519f, 20.25f, 22.75f, 19.019f, 22.75f, 17.5f)
                curveTo(22.75f, 17.086f, 22.414f, 16.75f, 22f, 16.75f)
                curveTo(21.586f, 16.75f, 21.25f, 17.086f, 21.25f, 17.5f)
                curveTo(21.25f, 18.19f, 20.69f, 18.75f, 20f, 18.75f)
                horizontalLineTo(17f)
                curveTo(16.31f, 18.75f, 15.75f, 18.19f, 15.75f, 17.5f)
                close()
            }
        }.build()

        return waveformBadgeMic!!
    }

private var waveformBadgeMic: ImageVector? = null