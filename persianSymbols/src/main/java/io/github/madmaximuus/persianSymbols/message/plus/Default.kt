package io.github.madmaximuus.persianSymbols.message.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessagePlus: ImageVector
    get() {
        if (messagePlus != null) {
            return messagePlus!!
        }
        messagePlus = ImageVector.Builder(
            name = "message-plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 6.75f)
                curveTo(12.414f, 6.75f, 12.75f, 7.086f, 12.75f, 7.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.5f)
                curveTo(16.914f, 11.25f, 17.25f, 11.586f, 17.25f, 12f)
                curveTo(17.25f, 12.414f, 16.914f, 12.75f, 16.5f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.5f)
                curveTo(12.75f, 16.914f, 12.414f, 17.25f, 12f, 17.25f)
                curveTo(11.586f, 17.25f, 11.25f, 16.914f, 11.25f, 16.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 12.75f, 6.75f, 12.414f, 6.75f, 12f)
                curveTo(6.75f, 11.586f, 7.086f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.086f, 11.586f, 6.75f, 12f, 6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(21f)
                curveTo(2f, 21.332f, 2.165f, 21.642f, 2.439f, 21.828f)
                curveTo(2.714f, 22.014f, 3.063f, 22.052f, 3.371f, 21.928f)
                lineTo(7.746f, 20.179f)
                curveTo(8.041f, 20.061f, 8.356f, 20f, 8.674f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 18f, 7.534f, 18.109f, 7.003f, 18.322f)
                lineTo(4f, 19.523f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return messagePlus!!
    }

private var messagePlus: ImageVector? = null