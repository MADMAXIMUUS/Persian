package io.github.madmaximuus.persianSymbols.message.badge.clock

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageBadgeClock: ImageVector
    get() {
        if (messageBadgeClock != null) {
            return messageBadgeClock!!
        }
        messageBadgeClock = ImageVector.Builder(
            name = "message-badge-clock-default",
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
                moveTo(22f, 14.5f)
                verticalLineTo(9.775f)
                curveTo(21.446f, 10.362f, 20.765f, 10.826f, 20f, 11.125f)
                verticalLineTo(14.5f)
                curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 17f, 7.534f, 17.109f, 7.003f, 17.322f)
                lineTo(4f, 18.523f)
                verticalLineTo(7.5f)
                curveTo(4f, 6.119f, 5.119f, 5f, 6.5f, 5f)
                horizontalLineTo(12.591f)
                curveTo(12.724f, 4.273f, 13f, 3.597f, 13.389f, 3f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
                verticalLineTo(20f)
                curveTo(2f, 20.332f, 2.165f, 20.642f, 2.439f, 20.828f)
                curveTo(2.714f, 21.014f, 3.063f, 21.052f, 3.371f, 20.928f)
                lineTo(7.746f, 19.179f)
                curveTo(8.041f, 19.061f, 8.356f, 19f, 8.674f, 19f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 19f, 22f, 16.985f, 22f, 14.5f)
                close()
            }
        }.build()

        return messageBadgeClock!!
    }

private var messageBadgeClock: ImageVector? = null