package io.github.madmaximuus.persianSymbols.image

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Image: ImageVector
    get() {
        if (image != null) {
            return image!!
        }
        image = Builder(
            name = "image-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 7.4f)
                curveTo(3f, 4.97f, 4.97f, 3f, 7.4f, 3f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 3f, 21f, 4.97f, 21f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(21f, 19.03f, 19.03f, 21f, 16.6f, 21f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 21f, 3f, 19.03f, 3f, 16.6f)
                verticalLineTo(7.4f)
                close()
                moveTo(17.353f, 17f)
                horizontalLineTo(6.777f)
                curveTo(6.452f, 17f, 6.263f, 16.632f, 6.452f, 16.368f)
                lineTo(8.724f, 13.186f)
                curveTo(8.868f, 12.984f, 9.159f, 12.961f, 9.334f, 13.138f)
                lineTo(11.582f, 15.411f)
                curveTo(11.782f, 15.613f, 12.122f, 15.548f, 12.234f, 15.287f)
                lineTo(14.16f, 10.793f)
                curveTo(14.294f, 10.48f, 14.733f, 10.467f, 14.886f, 10.771f)
                lineTo(17.711f, 16.421f)
                curveTo(17.844f, 16.687f, 17.65f, 17f, 17.353f, 17f)
                close()
                moveTo(7.75f, 9f)
                curveTo(8.44f, 9f, 9f, 8.44f, 9f, 7.75f)
                curveTo(9f, 7.06f, 8.44f, 6.5f, 7.75f, 6.5f)
                curveTo(7.06f, 6.5f, 6.5f, 7.06f, 6.5f, 7.75f)
                curveTo(6.5f, 8.44f, 7.06f, 9f, 7.75f, 9f)
                close()
            }
        }.build()
        return image!!
    }

private var image: ImageVector? = null