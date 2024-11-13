package io.github.madmaximuus.persianSymbols.clock.rotate.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockRotateRight: ImageVector
    get() {
        if (clockRotateRight != null) {
            return clockRotateRight!!
        }
        clockRotateRight = Builder(
            name = "clock-rotate-right-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(14.525f, 4f, 16.779f, 5.17f, 18.246f, 7f)
                horizontalLineTo(16.5f)
                curveTo(15.948f, 7f, 15.5f, 7.448f, 15.5f, 8f)
                curveTo(15.5f, 8.552f, 15.948f, 9f, 16.5f, 9f)
                horizontalLineTo(20.044f)
                curveTo(20.058f, 9f, 20.072f, 9f, 20.086f, 9f)
                horizontalLineTo(20.5f)
                curveTo(21.052f, 9f, 21.5f, 8.552f, 21.5f, 8f)
                verticalLineTo(4f)
                curveTo(21.5f, 3.448f, 21.052f, 3f, 20.5f, 3f)
                curveTo(19.948f, 3f, 19.5f, 3.448f, 19.5f, 4f)
                verticalLineTo(5.386f)
                curveTo(17.668f, 3.31f, 14.988f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 11.448f, 21.552f, 11f, 21f, 11f)
                curveTo(20.448f, 11f, 20f, 11.448f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 8f)
                curveTo(12.75f, 7.586f, 12.414f, 7.25f, 12f, 7.25f)
                curveTo(11.586f, 7.25f, 11.25f, 7.586f, 11.25f, 8f)
                verticalLineTo(11.586f)
                curveTo(11.25f, 12.05f, 11.434f, 12.495f, 11.763f, 12.823f)
                lineTo(15.47f, 16.53f)
                curveTo(15.763f, 16.823f, 16.237f, 16.823f, 16.53f, 16.53f)
                curveTo(16.823f, 16.237f, 16.823f, 15.763f, 16.53f, 15.47f)
                lineTo(12.823f, 11.763f)
                curveTo(12.776f, 11.716f, 12.75f, 11.652f, 12.75f, 11.586f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        return clockRotateRight!!
    }

private var clockRotateRight: ImageVector? = null