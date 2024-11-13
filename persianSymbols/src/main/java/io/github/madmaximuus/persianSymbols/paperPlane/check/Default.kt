package io.github.madmaximuus.persianSymbols.paperPlane.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PaperPlaneCheck: ImageVector
    get() {
        if (paperPlaneCheck != null) {
            return paperPlaneCheck!!
        }
        paperPlaneCheck = Builder(
            name = "paper-plane-check-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 5.576f)
                curveTo(3f, 4.11f, 4.525f, 3.142f, 5.852f, 3.766f)
                lineTo(20.464f, 10.643f)
                curveTo(21.351f, 11.06f, 21.553f, 12.13f, 21.07f, 12.844f)
                curveTo(20.331f, 12.403f, 19.49f, 12.117f, 18.59f, 12.029f)
                lineTo(18.652f, 12f)
                lineTo(5f, 5.576f)
                lineTo(5f, 9.219f)
                lineTo(11.466f, 10.836f)
                curveTo(12.678f, 11.139f, 12.678f, 12.861f, 11.466f, 13.164f)
                lineTo(5f, 14.781f)
                verticalLineTo(18.424f)
                lineTo(13.022f, 14.649f)
                curveTo(12.496f, 15.429f, 12.148f, 16.34f, 12.038f, 17.323f)
                lineTo(5.852f, 20.234f)
                curveTo(4.525f, 20.858f, 3f, 19.89f, 3f, 18.424f)
                verticalLineTo(14.39f)
                curveTo(3f, 13.702f, 3.468f, 13.102f, 4.136f, 12.935f)
                lineTo(7.877f, 12f)
                lineTo(4.136f, 11.065f)
                curveTo(3.468f, 10.898f, 3f, 10.298f, 3f, 9.61f)
                verticalLineTo(5.576f)
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