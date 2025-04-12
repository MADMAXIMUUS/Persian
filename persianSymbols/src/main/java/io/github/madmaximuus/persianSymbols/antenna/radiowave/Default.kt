package io.github.madmaximuus.persianSymbols.antenna.radiowave

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.AntennaRadiowave: ImageVector
    get() {
        if (antennaRadiowave != null) {
            return antennaRadiowave!!
        }
        antennaRadiowave = ImageVector.Builder(
            name = "antenna-radiowave-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.331f, 4.706f)
                curveTo(6.72f, 4.314f, 6.719f, 3.681f, 6.327f, 3.291f)
                curveTo(5.936f, 2.902f, 5.303f, 2.903f, 4.913f, 3.294f)
                curveTo(3.114f, 5.102f, 2f, 7.597f, 2f, 10.35f)
                curveTo(2f, 13.123f, 3.131f, 15.635f, 4.954f, 17.445f)
                curveTo(5.346f, 17.835f, 5.979f, 17.833f, 6.368f, 17.441f)
                curveTo(6.757f, 17.049f, 6.755f, 16.416f, 6.363f, 16.026f)
                curveTo(4.902f, 14.576f, 4f, 12.569f, 4f, 10.35f)
                curveTo(4f, 8.147f, 4.889f, 6.153f, 6.331f, 4.706f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.087f, 3.294f)
                curveTo(18.697f, 2.903f, 18.064f, 2.902f, 17.673f, 3.291f)
                curveTo(17.281f, 3.681f, 17.28f, 4.314f, 17.669f, 4.706f)
                curveTo(19.111f, 6.153f, 20f, 8.147f, 20f, 10.35f)
                curveTo(20f, 12.569f, 19.097f, 14.576f, 17.637f, 16.026f)
                curveTo(17.245f, 16.416f, 17.243f, 17.049f, 17.632f, 17.441f)
                curveTo(18.021f, 17.833f, 18.654f, 17.835f, 19.046f, 17.445f)
                curveTo(20.869f, 15.635f, 22f, 13.123f, 22f, 10.35f)
                curveTo(22f, 7.597f, 20.886f, 5.102f, 19.087f, 3.294f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.129f, 6.136f)
                curveTo(9.524f, 6.522f, 9.53f, 7.155f, 9.143f, 7.55f)
                curveTo(8.435f, 8.272f, 8f, 9.259f, 8f, 10.35f)
                curveTo(8f, 11.449f, 8.442f, 12.443f, 9.161f, 13.167f)
                curveTo(9.55f, 13.559f, 9.547f, 14.192f, 9.155f, 14.581f)
                curveTo(8.763f, 14.97f, 8.13f, 14.968f, 7.741f, 14.576f)
                curveTo(6.666f, 13.493f, 6f, 11.998f, 6f, 10.35f)
                curveTo(6f, 8.715f, 6.655f, 7.231f, 7.715f, 6.15f)
                curveTo(8.102f, 5.755f, 8.735f, 5.749f, 9.129f, 6.136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.871f, 6.136f)
                curveTo(15.265f, 5.749f, 15.898f, 5.755f, 16.285f, 6.15f)
                curveTo(17.345f, 7.231f, 18f, 8.715f, 18f, 10.35f)
                curveTo(18f, 11.985f, 17.345f, 13.469f, 16.285f, 14.55f)
                curveTo(15.898f, 14.944f, 15.265f, 14.95f, 14.871f, 14.564f)
                curveTo(14.476f, 14.177f, 14.47f, 13.544f, 14.857f, 13.15f)
                curveTo(15.565f, 12.427f, 16f, 11.44f, 16f, 10.35f)
                curveTo(16f, 9.259f, 15.565f, 8.272f, 14.857f, 7.55f)
                curveTo(14.47f, 7.155f, 14.476f, 6.522f, 14.871f, 6.136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 12.082f)
                curveTo(13.598f, 11.736f, 14f, 11.09f, 14f, 10.35f)
                curveTo(14f, 9.245f, 13.105f, 8.35f, 12f, 8.35f)
                curveTo(10.895f, 8.35f, 10f, 9.245f, 10f, 10.35f)
                curveTo(10f, 11.09f, 10.402f, 11.736f, 11f, 12.082f)
                verticalLineTo(19.35f)
                curveTo(11f, 19.902f, 11.448f, 20.35f, 12f, 20.35f)
                curveTo(12.552f, 20.35f, 13f, 19.902f, 13f, 19.35f)
                verticalLineTo(12.082f)
                close()
            }
        }.build()

        return antennaRadiowave!!
    }

private var antennaRadiowave: ImageVector? = null
