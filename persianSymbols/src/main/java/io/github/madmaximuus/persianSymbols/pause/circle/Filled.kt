package io.github.madmaximuus.persianSymbols.pause.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PauseCircle: ImageVector
    get() {
        if (pauseCircle != null) {
            return pauseCircle!!
        }
        pauseCircle = Builder(
            name = "pause-circle-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(10.75f, 8.5f)
                curveTo(10.75f, 8.086f, 10.414f, 7.75f, 10f, 7.75f)
                curveTo(9.586f, 7.75f, 9.25f, 8.086f, 9.25f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(9.25f, 15.914f, 9.586f, 16.25f, 10f, 16.25f)
                curveTo(10.414f, 16.25f, 10.75f, 15.914f, 10.75f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(14.75f, 8.5f)
                curveTo(14.75f, 8.086f, 14.414f, 7.75f, 14f, 7.75f)
                curveTo(13.586f, 7.75f, 13.25f, 8.086f, 13.25f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(13.25f, 15.914f, 13.586f, 16.25f, 14f, 16.25f)
                curveTo(14.414f, 16.25f, 14.75f, 15.914f, 14.75f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return pauseCircle!!
    }

private var pauseCircle: ImageVector? = null