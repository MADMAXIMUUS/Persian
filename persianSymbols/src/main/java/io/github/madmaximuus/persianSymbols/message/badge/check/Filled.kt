package io.github.madmaximuus.persianSymbols.message.badge.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageBadgeCheck: ImageVector
    get() {
        if (messageBadgeCheck != null) {
            return messageBadgeCheck!!
        }
        messageBadgeCheck = ImageVector.Builder(
            name = "message-badge-check-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.6f, 3f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 3f, 2f, 5.017f, 2f, 7.506f)
                verticalLineTo(19.975f)
                curveTo(2f, 20.684f, 2.687f, 21.179f, 3.339f, 20.939f)
                lineTo(6.981f, 19.596f)
                curveTo(7.361f, 19.456f, 7.762f, 19.384f, 8.166f, 19.384f)
                horizontalLineTo(12.676f)
                curveTo(12.561f, 18.942f, 12.5f, 18.478f, 12.5f, 18f)
                curveTo(12.5f, 14.962f, 14.962f, 12.5f, 18f, 12.5f)
                curveTo(19.576f, 12.5f, 20.997f, 13.163f, 22f, 14.225f)
                verticalLineTo(7.506f)
                curveTo(22f, 5.017f, 20.03f, 3f, 17.6f, 3f)
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