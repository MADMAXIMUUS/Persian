package io.github.madmaximuus.persianSymbols.eye

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Eye: ImageVector
    get() {
        if (eye != null) {
            return eye!!
        }
        eye = Builder(
            name = "eye-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 8.25f)
                curveTo(9.929f, 8.25f, 8.25f, 9.929f, 8.25f, 12f)
                curveTo(8.25f, 14.071f, 9.929f, 15.75f, 12f, 15.75f)
                curveTo(14.071f, 15.75f, 15.75f, 14.071f, 15.75f, 12f)
                curveTo(15.75f, 9.929f, 14.071f, 8.25f, 12f, 8.25f)
                close()
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
                moveTo(12f, 5f)
                curveTo(7.897f, 5f, 5.227f, 6.741f, 3.673f, 8.635f)
                curveTo(2.046f, 10.62f, 2.266f, 13.421f, 3.856f, 15.291f)
                curveTo(5.398f, 17.105f, 8.008f, 19f, 12f, 19f)
                curveTo(15.992f, 19f, 18.601f, 17.105f, 20.144f, 15.291f)
                curveTo(21.734f, 13.421f, 21.954f, 10.62f, 20.327f, 8.635f)
                curveTo(18.773f, 6.741f, 16.103f, 5f, 12f, 5f)
                close()
                moveTo(5.22f, 9.904f)
                curveTo(6.418f, 8.443f, 8.533f, 7f, 12f, 7f)
                curveTo(15.467f, 7f, 17.582f, 8.443f, 18.78f, 9.904f)
                curveTo(19.725f, 11.055f, 19.658f, 12.775f, 18.621f, 13.995f)
                curveTo(17.364f, 15.473f, 15.274f, 17f, 12f, 17f)
                curveTo(8.726f, 17f, 6.636f, 15.473f, 5.379f, 13.995f)
                curveTo(4.342f, 12.775f, 4.275f, 11.055f, 5.22f, 9.904f)
                close()
            }
        }.build()
        return eye!!
    }

private var eye: ImageVector? = null