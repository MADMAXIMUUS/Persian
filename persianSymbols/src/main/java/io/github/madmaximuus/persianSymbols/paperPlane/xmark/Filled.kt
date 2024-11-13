package io.github.madmaximuus.persianSymbols.paperPlane.xmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PaperPlaneXMark: ImageVector
    get() {
        if (paperPlaneXMark != null) {
            return paperPlaneXMark!!
        }
        paperPlaneXMark = Builder(
            name = "paper-plane-xmark-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.116f, 3.952f)
                lineTo(20.973f, 11.088f)
                curveTo(21.72f, 11.424f, 21.758f, 12.448f, 21.086f, 12.853f)
                curveTo(20.184f, 12.312f, 19.128f, 12f, 18f, 12f)
                curveTo(15.06f, 12f, 12.614f, 14.114f, 12.1f, 16.905f)
                lineTo(5.116f, 20.048f)
                curveTo(4.123f, 20.495f, 3f, 19.769f, 3f, 18.68f)
                verticalLineTo(14.013f)
                curveTo(3f, 13.506f, 3.379f, 13.08f, 3.881f, 13.02f)
                lineTo(8.258f, 12.497f)
                curveTo(8.846f, 12.426f, 8.846f, 11.574f, 8.258f, 11.504f)
                lineTo(3.881f, 10.98f)
                curveTo(3.379f, 10.92f, 3f, 10.494f, 3f, 9.987f)
                verticalLineTo(5.32f)
                curveTo(3f, 4.231f, 4.123f, 3.505f, 5.116f, 3.952f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.47f, 16.409f)
                curveTo(17.177f, 16.116f, 16.702f, 16.116f, 16.409f, 16.409f)
                curveTo(16.116f, 16.702f, 16.116f, 17.177f, 16.409f, 17.47f)
                lineTo(16.939f, 18f)
                lineTo(16.409f, 18.531f)
                curveTo(16.116f, 18.823f, 16.116f, 19.298f, 16.409f, 19.591f)
                curveTo(16.702f, 19.884f, 17.177f, 19.884f, 17.47f, 19.591f)
                lineTo(18f, 19.061f)
                lineTo(18.53f, 19.591f)
                curveTo(18.823f, 19.884f, 19.298f, 19.884f, 19.591f, 19.591f)
                curveTo(19.884f, 19.298f, 19.884f, 18.823f, 19.591f, 18.53f)
                lineTo(19.061f, 18f)
                lineTo(19.591f, 17.47f)
                curveTo(19.884f, 17.177f, 19.884f, 16.702f, 19.591f, 16.409f)
                curveTo(19.298f, 16.116f, 18.823f, 16.116f, 18.53f, 16.409f)
                lineTo(18f, 16.94f)
                lineTo(17.47f, 16.409f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()
        return paperPlaneXMark!!
    }

private var paperPlaneXMark: ImageVector? = null