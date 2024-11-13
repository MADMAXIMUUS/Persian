package io.github.madmaximuus.persianSymbols.stop.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.StopCircle: ImageVector
    get() {
        if (stopCircle != null) {
            return stopCircle!!
        }
        stopCircle = Builder(
            name = "stop-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 8f)
                curveTo(8.895f, 8f, 8f, 8.895f, 8f, 10f)
                verticalLineTo(14f)
                curveTo(8f, 15.105f, 8.895f, 16f, 10f, 16f)
                horizontalLineTo(14f)
                curveTo(15.105f, 16f, 16f, 15.105f, 16f, 14f)
                verticalLineTo(10f)
                curveTo(16f, 8.895f, 15.105f, 8f, 14f, 8f)
                horizontalLineTo(10f)
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
        return stopCircle!!
    }

private var stopCircle: ImageVector? = null