package io.github.madmaximuus.persianSymbols.radar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Radar: ImageVector
    get() {
        if (radar != null) {
            return radar!!
        }
        radar = Builder(
            name = "radar-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
                curveTo(20f, 13.849f, 19.373f, 15.551f, 18.32f, 16.906f)
                lineTo(16.891f, 15.476f)
                curveTo(17.589f, 14.496f, 18f, 13.296f, 18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
                curveTo(13.296f, 18f, 14.496f, 17.589f, 15.476f, 16.891f)
                lineTo(16.906f, 18.32f)
                curveTo(15.551f, 19.373f, 13.849f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
                moveTo(15.446f, 14.032f)
                curveTo(15.798f, 13.436f, 16f, 12.742f, 16f, 12f)
                curveTo(16f, 9.791f, 14.209f, 8f, 12f, 8f)
                curveTo(9.791f, 8f, 8f, 9.791f, 8f, 12f)
                curveTo(8f, 14.209f, 9.791f, 16f, 12f, 16f)
                curveTo(12.742f, 16f, 13.436f, 15.798f, 14.032f, 15.446f)
                lineTo(12.518f, 13.932f)
                curveTo(12.353f, 13.976f, 12.179f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                curveTo(14f, 12.179f, 13.976f, 12.353f, 13.932f, 12.518f)
                lineTo(15.446f, 14.032f)
                close()
            }
        }.build()
        return radar!!
    }

private var radar: ImageVector? = null