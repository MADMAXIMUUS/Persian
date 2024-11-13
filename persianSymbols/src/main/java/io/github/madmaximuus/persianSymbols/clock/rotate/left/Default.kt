package io.github.madmaximuus.persianSymbols.clock.rotate.left

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockRotateLeft: ImageVector
    get() {
        if (clockRotateLeft != null) {
            return clockRotateLeft!!
        }
        clockRotateLeft = Builder(
            name = "clock-rotate-left-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(9.475f, 4f, 7.221f, 5.17f, 5.754f, 7f)
                horizontalLineTo(7.5f)
                curveTo(8.052f, 7f, 8.5f, 7.448f, 8.5f, 8f)
                curveTo(8.5f, 8.552f, 8.052f, 9f, 7.5f, 9f)
                horizontalLineTo(3.956f)
                curveTo(3.942f, 9f, 3.928f, 9f, 3.914f, 9f)
                horizontalLineTo(3.5f)
                curveTo(2.948f, 9f, 2.5f, 8.552f, 2.5f, 8f)
                verticalLineTo(4f)
                curveTo(2.5f, 3.448f, 2.948f, 3f, 3.5f, 3f)
                curveTo(4.052f, 3f, 4.5f, 3.448f, 4.5f, 4f)
                verticalLineTo(5.386f)
                curveTo(6.332f, 3.31f, 9.012f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
                curveTo(3.552f, 11f, 4f, 11.448f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(16.418f, 20f, 20f, 16.418f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
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
        return clockRotateLeft!!
    }

private var clockRotateLeft: ImageVector? = null