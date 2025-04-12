package io.github.madmaximuus.persianSymbols.image.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ImageBadgeCheck: ImageVector
    get() {
        if (imageBadgeCheck != null) {
            return imageBadgeCheck!!
        }
        imageBadgeCheck = ImageVector.Builder(
            name = "image-badge-check-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 3f, 21f, 5.015f, 21f, 7.5f)
                verticalLineTo(13.389f)
                curveTo(20.403f, 13f, 19.727f, 12.724f, 19f, 12.591f)
                verticalLineTo(7.5f)
                curveTo(19f, 6.119f, 17.881f, 5f, 16.5f, 5f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 5f, 5f, 6.119f, 5f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(5f, 17.881f, 6.119f, 19f, 7.5f, 19f)
                horizontalLineTo(12.591f)
                curveTo(12.724f, 19.727f, 13f, 20.403f, 13.389f, 21f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 21f, 3f, 18.985f, 3f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.886f, 10.771f)
                lineTo(15.948f, 12.896f)
                curveTo(14.225f, 13.589f, 12.934f, 15.129f, 12.591f, 17f)
                horizontalLineTo(6.777f)
                curveTo(6.452f, 17f, 6.263f, 16.632f, 6.452f, 16.368f)
                lineTo(8.724f, 13.186f)
                curveTo(8.868f, 12.984f, 9.159f, 12.961f, 9.334f, 13.138f)
                lineTo(11.582f, 15.411f)
                curveTo(11.782f, 15.613f, 12.122f, 15.548f, 12.234f, 15.287f)
                lineTo(14.16f, 10.793f)
                curveTo(14.294f, 10.48f, 14.733f, 10.467f, 14.886f, 10.771f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
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