package io.github.madmaximuus.persianSymbols.paperPlane.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PaperPlaneCheck: ImageVector
    get() {
        if (paperPlaneCheck != null) {
            return paperPlaneCheck!!
        }
        paperPlaneCheck = Builder(
            name = "paper-plane-check-filled",
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
                moveTo(19.969f, 16.414f)
                curveTo(20.292f, 16.673f, 20.344f, 17.145f, 20.086f, 17.469f)
                lineTo(18.086f, 19.969f)
                curveTo(17.952f, 20.135f, 17.754f, 20.237f, 17.542f, 20.249f)
                curveTo(17.329f, 20.261f, 17.121f, 20.181f, 16.97f, 20.03f)
                lineTo(15.97f, 19.03f)
                curveTo(15.677f, 18.737f, 15.677f, 18.263f, 15.97f, 17.97f)
                curveTo(16.263f, 17.677f, 16.737f, 17.677f, 17.03f, 17.97f)
                lineTo(17.438f, 18.377f)
                lineTo(18.914f, 16.531f)
                curveTo(19.173f, 16.208f, 19.645f, 16.156f, 19.969f, 16.414f)
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
        return paperPlaneCheck!!
    }

private var paperPlaneCheck: ImageVector? = null