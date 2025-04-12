package io.github.madmaximuus.persianSymbols.message.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessagePlus: ImageVector
    get() {
        if (messagePlus != null) {
            return messagePlus!!
        }
        messagePlus = ImageVector.Builder(
            name = "message-plus-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 6.017f, 22f, 8.506f)
                verticalLineTo(15.878f)
                curveTo(22f, 18.367f, 20.03f, 20.384f, 17.6f, 20.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 20.384f, 7.361f, 20.456f, 6.981f, 20.596f)
                lineTo(3.339f, 21.939f)
                curveTo(2.687f, 22.179f, 2f, 21.684f, 2f, 20.975f)
                verticalLineTo(8.506f)
                curveTo(2f, 6.017f, 3.97f, 4f, 6.4f, 4f)
                close()
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
        }.build()

        return messagePlus!!
    }

private var messagePlus: ImageVector? = null