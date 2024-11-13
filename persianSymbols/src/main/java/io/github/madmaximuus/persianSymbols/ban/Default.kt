package io.github.madmaximuus.persianSymbols.ban

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Ban: ImageVector
    get() {
        if (ban != null) {
            return ban!!
        }
        ban = Builder(
            name = "ban-default",
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
                moveTo(7.094f, 5.68f)
                curveTo(8.449f, 4.627f, 10.151f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 13.849f, 19.373f, 15.551f, 18.32f, 16.906f)
                lineTo(7.094f, 5.68f)
                close()
                moveTo(5.68f, 7.094f)
                curveTo(4.627f, 8.449f, 4f, 10.151f, 4f, 12f)
                curveTo(4f, 16.418f, 7.582f, 20f, 12f, 20f)
                curveTo(13.849f, 20f, 15.551f, 19.373f, 16.906f, 18.32f)
                lineTo(5.68f, 7.094f)
                close()
            }
        }.build()
        return ban!!
    }

private var ban: ImageVector? = null