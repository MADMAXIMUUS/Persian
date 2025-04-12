package io.github.madmaximuus.persianSymbols.message.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageBadgeCheck: ImageVector
    get() {
        if (messageBadgeCheck != null) {
            return messageBadgeCheck!!
        }
        messageBadgeCheck = ImageVector.Builder(
            name = "message-badge-check-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 7.5f)
                curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 3f, 22f, 5.015f, 22f, 7.5f)
                verticalLineTo(14.225f)
                curveTo(21.446f, 13.638f, 20.765f, 13.174f, 20f, 12.875f)
                verticalLineTo(7.5f)
                curveTo(20f, 6.119f, 18.881f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 5f, 4f, 6.119f, 4f, 7.5f)
                verticalLineTo(18.523f)
                lineTo(7.003f, 17.322f)
                curveTo(7.534f, 17.109f, 8.102f, 17f, 8.674f, 17f)
                horizontalLineTo(12.591f)
                curveTo(12.531f, 17.324f, 12.5f, 17.659f, 12.5f, 18f)
                curveTo(12.5f, 18.341f, 12.531f, 18.676f, 12.591f, 19f)
                horizontalLineTo(8.674f)
                curveTo(8.356f, 19f, 8.041f, 19.061f, 7.746f, 19.179f)
                lineTo(3.371f, 20.928f)
                curveTo(3.063f, 21.052f, 2.714f, 21.014f, 2.439f, 20.828f)
                curveTo(2.165f, 20.642f, 2f, 20.332f, 2f, 20f)
                verticalLineTo(7.5f)
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

        return messageBadgeCheck!!
    }

private var messageBadgeCheck: ImageVector? = null