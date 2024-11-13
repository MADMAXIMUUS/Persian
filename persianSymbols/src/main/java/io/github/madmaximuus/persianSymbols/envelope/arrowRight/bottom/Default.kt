package io.github.madmaximuus.persianSymbols.envelope.arrowRight.bottom

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeArrowRightBottom: ImageVector
    get() {
        if (envelopeArrowRightBottom != null) {
            return envelopeArrowRightBottom!!
        }
        envelopeArrowRightBottom = Builder(
            name = "envelope-arrow-right-bottom-default",
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
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(17.97f, 16.47f)
                curveTo(18.263f, 16.177f, 18.737f, 16.177f, 19.03f, 16.47f)
                lineTo(20.03f, 17.47f)
                curveTo(20.323f, 17.763f, 20.323f, 18.237f, 20.03f, 18.53f)
                lineTo(19.03f, 19.53f)
                curveTo(18.737f, 19.823f, 18.263f, 19.823f, 17.97f, 19.53f)
                curveTo(17.759f, 19.319f, 17.7f, 19.014f, 17.793f, 18.75f)
                horizontalLineTo(16.5f)
                curveTo(16.086f, 18.75f, 15.75f, 18.414f, 15.75f, 18f)
                curveTo(15.75f, 17.586f, 16.086f, 17.25f, 16.5f, 17.25f)
                horizontalLineTo(17.793f)
                curveTo(17.7f, 16.986f, 17.759f, 16.681f, 17.97f, 16.47f)
                close()
            }
        }.build()
        return envelopeArrowRightBottom!!
    }

private var envelopeArrowRightBottom: ImageVector? = null