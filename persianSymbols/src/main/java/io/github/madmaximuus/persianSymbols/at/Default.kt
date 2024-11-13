package io.github.madmaximuus.persianSymbols.at

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.At: ImageVector
    get() {
        if (at != null) {
            return at!!
        }
        at = Builder(
            name = "at-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                verticalLineTo(12.062f)
                lineTo(20.008f, 12.124f)
                curveTo(20.078f, 12.686f, 20.046f, 13.497f, 19.789f, 14.117f)
                curveTo(19.666f, 14.414f, 19.508f, 14.626f, 19.325f, 14.764f)
                curveTo(19.154f, 14.893f, 18.903f, 15f, 18.5f, 15f)
                curveTo(18.097f, 15f, 17.846f, 14.893f, 17.675f, 14.764f)
                curveTo(17.492f, 14.626f, 17.334f, 14.414f, 17.211f, 14.117f)
                curveTo(17.025f, 13.667f, 16.957f, 13.118f, 16.96f, 12.635f)
                curveTo(16.986f, 12.432f, 16.999f, 12.225f, 17f, 12.015f)
                curveTo(17f, 12.004f, 17f, 11.993f, 17f, 11.982f)
                curveTo(16.99f, 9.229f, 14.755f, 7f, 12f, 7f)
                curveTo(9.239f, 7f, 7f, 9.239f, 7f, 12f)
                curveTo(7f, 14.761f, 9.239f, 17f, 12f, 17f)
                curveTo(13.434f, 17f, 14.727f, 16.396f, 15.639f, 15.429f)
                curveTo(15.847f, 15.772f, 16.119f, 16.096f, 16.472f, 16.361f)
                curveTo(17.02f, 16.774f, 17.703f, 17f, 18.5f, 17f)
                curveTo(19.297f, 17f, 19.98f, 16.774f, 20.528f, 16.361f)
                curveTo(21.065f, 15.957f, 21.414f, 15.419f, 21.636f, 14.883f)
                curveTo(22.059f, 13.865f, 22.087f, 12.711f, 22f, 11.939f)
                curveTo(21.967f, 6.444f, 17.503f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                horizontalLineTo(17f)
                curveTo(17.552f, 22f, 18f, 21.552f, 18f, 21f)
                curveTo(18f, 20.448f, 17.552f, 20f, 17f, 20f)
                horizontalLineTo(12f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
                moveTo(15f, 11.945f)
                curveTo(14.981f, 12.106f, 14.968f, 12.284f, 14.963f, 12.473f)
                curveTo(14.736f, 13.905f, 13.496f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
                curveTo(13.639f, 9f, 14.97f, 10.314f, 15f, 11.945f)
                close()
            }
        }.build()
        return at!!
    }

private var at: ImageVector? = null