package io.github.madmaximuus.persianSymbols.message.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageBadgeClock: ImageVector
    get() {
        if (messageBadgeClock != null) {
            return messageBadgeClock!!
        }
        messageBadgeClock = ImageVector.Builder(
            name = "message-badge-clock-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 3.75f)
                curveTo(18.414f, 3.75f, 18.75f, 4.086f, 18.75f, 4.5f)
                verticalLineTo(5.689f)
                lineTo(19.53f, 6.47f)
                curveTo(19.823f, 6.763f, 19.823f, 7.237f, 19.53f, 7.53f)
                curveTo(19.237f, 7.823f, 18.763f, 7.823f, 18.47f, 7.53f)
                lineTo(17.47f, 6.53f)
                curveTo(17.329f, 6.39f, 17.25f, 6.199f, 17.25f, 6f)
                verticalLineTo(4.5f)
                curveTo(17.25f, 4.086f, 17.586f, 3.75f, 18f, 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 6f)
                curveTo(13.25f, 3.377f, 15.377f, 1.25f, 18f, 1.25f)
                curveTo(20.623f, 1.25f, 22.75f, 3.377f, 22.75f, 6f)
                curveTo(22.75f, 8.623f, 20.623f, 10.75f, 18f, 10.75f)
                curveTo(15.377f, 10.75f, 13.25f, 8.623f, 13.25f, 6f)
                close()
                moveTo(18f, 2.75f)
                curveTo(16.205f, 2.75f, 14.75f, 4.205f, 14.75f, 6f)
                curveTo(14.75f, 7.795f, 16.205f, 9.25f, 18f, 9.25f)
                curveTo(19.795f, 9.25f, 21.25f, 7.795f, 21.25f, 6f)
                curveTo(21.25f, 4.205f, 19.795f, 2.75f, 18f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 3f)
                horizontalLineTo(13.389f)
                curveTo(12.827f, 3.863f, 12.5f, 4.893f, 12.5f, 6f)
                curveTo(12.5f, 9.038f, 14.962f, 11.5f, 18f, 11.5f)
                curveTo(19.576f, 11.5f, 20.997f, 10.837f, 22f, 9.775f)
                verticalLineTo(14.878f)
                curveTo(22f, 17.367f, 20.03f, 19.384f, 17.6f, 19.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 19.384f, 7.361f, 19.456f, 6.981f, 19.596f)
                lineTo(3.339f, 20.939f)
                curveTo(2.687f, 21.179f, 2f, 20.684f, 2f, 19.975f)
                verticalLineTo(7.506f)
                curveTo(2f, 5.017f, 3.97f, 3f, 6.4f, 3f)
                close()
            }
        }.build()

        return messageBadgeClock!!
    }

private var messageBadgeClock: ImageVector? = null