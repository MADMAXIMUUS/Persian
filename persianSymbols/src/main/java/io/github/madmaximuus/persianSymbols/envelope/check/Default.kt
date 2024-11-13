package io.github.madmaximuus.persianSymbols.envelope.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeCheck: ImageVector
    get() {
        if (envelopeCheck != null) {
            return envelopeCheck!!
        }
        envelopeCheck = Builder(
            name = "envelope-check-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.114f, 5.536f)
                curveTo(2.42f, 6.328f, 2f, 7.365f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(12.341f)
                curveTo(12.12f, 19.374f, 12f, 18.701f, 12f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 8.117f, 4.086f, 7.754f, 4.24f, 7.43f)
                lineTo(10.2f, 11.9f)
                curveTo(11.267f, 12.7f, 12.733f, 12.7f, 13.8f, 11.9f)
                lineTo(19.76f, 7.43f)
                curveTo(19.914f, 7.754f, 20f, 8.117f, 20f, 8.5f)
                verticalLineTo(12.341f)
                curveTo(20.745f, 12.605f, 21.423f, 13.011f, 22f, 13.528f)
                verticalLineTo(8.5f)
                curveTo(22f, 7.365f, 21.58f, 6.328f, 20.886f, 5.536f)
                curveTo(20.861f, 5.489f, 20.833f, 5.444f, 20.8f, 5.4f)
                curveTo(20.708f, 5.277f, 20.592f, 5.181f, 20.464f, 5.114f)
                curveTo(19.672f, 4.42f, 18.635f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(5.365f, 4f, 4.328f, 4.42f, 3.536f, 5.114f)
                curveTo(3.408f, 5.181f, 3.293f, 5.277f, 3.2f, 5.4f)
                curveTo(3.167f, 5.444f, 3.139f, 5.489f, 3.114f, 5.536f)
                close()
                moveTo(18.201f, 6.1f)
                curveTo(17.978f, 6.035f, 17.743f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(6.257f, 6f, 6.022f, 6.035f, 5.799f, 6.1f)
                lineTo(11.4f, 10.3f)
                curveTo(11.756f, 10.567f, 12.244f, 10.567f, 12.6f, 10.3f)
                lineTo(18.201f, 6.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.969f, 16.414f)
                curveTo(20.292f, 16.673f, 20.344f, 17.145f, 20.086f, 17.469f)
                lineTo(18.086f, 19.969f)
                curveTo(17.952f, 20.135f, 17.754f, 20.237f, 17.542f, 20.249f)
                curveTo(17.329f, 20.261f, 17.121f, 20.181f, 16.97f, 20.03f)
                lineTo(15.97f, 19.03f)
                curveTo(15.677f, 18.737f, 15.677f, 18.263f, 15.97f, 17.97f)
                curveTo(16.263f, 17.677f, 16.737f, 17.677f, 17.03f, 17.97f)
                lineTo(17.438f, 18.377f)
                lineTo(18.914f, 16.531f)
                curveTo(19.173f, 16.208f, 19.645f, 16.156f, 19.969f, 16.414f)
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
        return envelopeCheck!!
    }

private var envelopeCheck: ImageVector? = null