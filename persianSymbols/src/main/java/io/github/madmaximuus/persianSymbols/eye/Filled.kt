package io.github.madmaximuus.persianSymbols.eye

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Eye: ImageVector
    get() {
        if (eye != null) {
            return eye!!
        }
        eye = Builder(
            name = "eye-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 12f)
                curveTo(9.75f, 10.757f, 10.757f, 9.75f, 12f, 9.75f)
                curveTo(13.243f, 9.75f, 14.25f, 10.757f, 14.25f, 12f)
                curveTo(14.25f, 13.243f, 13.243f, 14.25f, 12f, 14.25f)
                curveTo(10.757f, 14.25f, 9.75f, 13.243f, 9.75f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.237f, 9.321f)
                curveTo(4.69f, 7.191f, 7.432f, 5f, 12f, 5f)
                curveTo(16.568f, 5f, 19.31f, 7.191f, 20.763f, 9.321f)
                curveTo(21.853f, 10.92f, 21.718f, 13.028f, 20.579f, 14.594f)
                curveTo(19.084f, 16.648f, 16.382f, 19f, 12f, 19f)
                curveTo(7.618f, 19f, 4.916f, 16.648f, 3.421f, 14.594f)
                curveTo(2.282f, 13.028f, 2.147f, 10.92f, 3.237f, 9.321f)
                close()
                moveTo(12f, 8.25f)
                curveTo(9.929f, 8.25f, 8.25f, 9.929f, 8.25f, 12f)
                curveTo(8.25f, 14.071f, 9.929f, 15.75f, 12f, 15.75f)
                curveTo(14.071f, 15.75f, 15.75f, 14.071f, 15.75f, 12f)
                curveTo(15.75f, 9.929f, 14.071f, 8.25f, 12f, 8.25f)
                close()
            }
        }.build()
        return eye!!
    }

private var eye: ImageVector? = null