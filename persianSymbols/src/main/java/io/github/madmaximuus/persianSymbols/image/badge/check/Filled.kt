package io.github.madmaximuus.persianSymbols.image.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ImageBadgeCheck: ImageVector
    get() {
        if (imageBadgeCheck != null) {
            return imageBadgeCheck!!
        }
        imageBadgeCheck = ImageVector.Builder(
            name = "image-badge-check-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 7.4f)
                curveTo(3f, 4.97f, 4.97f, 3f, 7.4f, 3f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 3f, 21f, 4.97f, 21f, 7.4f)
                verticalLineTo(13.389f)
                curveTo(20.137f, 12.827f, 19.107f, 12.5f, 18f, 12.5f)
                curveTo(17.275f, 12.5f, 16.582f, 12.64f, 15.948f, 12.896f)
                lineTo(14.886f, 10.771f)
                curveTo(14.733f, 10.467f, 14.294f, 10.48f, 14.16f, 10.793f)
                lineTo(12.234f, 15.287f)
                curveTo(12.122f, 15.548f, 11.782f, 15.613f, 11.582f, 15.411f)
                lineTo(9.334f, 13.138f)
                curveTo(9.159f, 12.961f, 8.868f, 12.984f, 8.724f, 13.186f)
                lineTo(6.452f, 16.368f)
                curveTo(6.263f, 16.632f, 6.452f, 17f, 6.777f, 17f)
                horizontalLineTo(12.591f)
                curveTo(12.531f, 17.324f, 12.5f, 17.659f, 12.5f, 18f)
                curveTo(12.5f, 19.107f, 12.827f, 20.137f, 13.389f, 21f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 21f, 3f, 19.03f, 3f, 16.6f)
                verticalLineTo(7.4f)
                close()
                moveTo(7.75f, 9f)
                curveTo(8.44f, 9f, 9f, 8.44f, 9f, 7.75f)
                curveTo(9f, 7.06f, 8.44f, 6.5f, 7.75f, 6.5f)
                curveTo(7.06f, 6.5f, 6.5f, 7.06f, 6.5f, 7.75f)
                curveTo(6.5f, 8.44f, 7.06f, 9f, 7.75f, 9f)
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

        return imageBadgeCheck!!
    }

private var imageBadgeCheck: ImageVector? = null