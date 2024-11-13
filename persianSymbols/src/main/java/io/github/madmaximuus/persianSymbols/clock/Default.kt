package io.github.madmaximuus.persianSymbols.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Clock: ImageVector
    get() {
        if (clock != null) {
            return clock!!
        }
        clock = Builder(
            name = "clock-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return clock!!
    }

private var clock: ImageVector? = null