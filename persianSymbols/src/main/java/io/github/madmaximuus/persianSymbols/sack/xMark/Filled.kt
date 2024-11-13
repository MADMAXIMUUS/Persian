package io.github.madmaximuus.persianSymbols.sack.xMark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.SackXMark: ImageVector
    get() {
        if (sackXMark != null) {
            return sackXMark!!
        }
        sackXMark = ImageVector.Builder(
            name = "sack-xmark-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.464f, 4.121f)
                lineTo(8.557f, 6.524f)
                curveTo(4.973f, 8.31f, 4f, 14.22f, 4f, 17.429f)
                verticalLineTo(17.6f)
                curveTo(4f, 20.03f, 5.97f, 22f, 8.4f, 22f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 22f, 20f, 20.03f, 20f, 17.6f)
                verticalLineTo(17.429f)
                curveTo(20f, 14.22f, 19.027f, 8.31f, 15.443f, 6.524f)
                lineTo(16.536f, 4.121f)
                curveTo(16.987f, 3.128f, 16.261f, 2f, 15.17f, 2f)
                horizontalLineTo(8.83f)
                curveTo(7.739f, 2f, 7.013f, 3.128f, 7.464f, 4.121f)
                close()
                moveTo(9.03f, 10.97f)
                curveTo(8.737f, 10.677f, 8.263f, 10.677f, 7.97f, 10.97f)
                curveTo(7.677f, 11.263f, 7.677f, 11.737f, 7.97f, 12.03f)
                lineTo(10.939f, 15f)
                lineTo(7.97f, 17.97f)
                curveTo(7.677f, 18.263f, 7.677f, 18.737f, 7.97f, 19.03f)
                curveTo(8.263f, 19.323f, 8.737f, 19.323f, 9.03f, 19.03f)
                lineTo(12f, 16.061f)
                lineTo(14.97f, 19.03f)
                curveTo(15.263f, 19.323f, 15.737f, 19.323f, 16.03f, 19.03f)
                curveTo(16.323f, 18.737f, 16.323f, 18.263f, 16.03f, 17.97f)
                lineTo(13.061f, 15f)
                lineTo(16.03f, 12.03f)
                curveTo(16.323f, 11.737f, 16.323f, 11.263f, 16.03f, 10.97f)
                curveTo(15.737f, 10.677f, 15.263f, 10.677f, 14.97f, 10.97f)
                lineTo(12f, 13.939f)
                lineTo(9.03f, 10.97f)
                close()
            }
        }.build()

        return sackXMark!!
    }

private var sackXMark: ImageVector? = null
