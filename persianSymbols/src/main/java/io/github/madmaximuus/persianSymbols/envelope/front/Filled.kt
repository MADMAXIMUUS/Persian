package io.github.madmaximuus.persianSymbols.envelope.front

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopeFront: ImageVector
    get() {
        if (envelopeFront != null) {
            return envelopeFront!!
        }
        envelopeFront = ImageVector.Builder(
            name = "envelope-front-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(15f, 8.5f)
                curveTo(15f, 7.672f, 15.672f, 7f, 16.5f, 7f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 7f, 19f, 7.672f, 19f, 8.5f)
                verticalLineTo(9.5f)
                curveTo(19f, 10.328f, 18.328f, 11f, 17.5f, 11f)
                horizontalLineTo(16.5f)
                curveTo(15.672f, 11f, 15f, 10.328f, 15f, 9.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(8f, 16.75f)
                curveTo(7.586f, 16.75f, 7.25f, 16.414f, 7.25f, 16f)
                curveTo(7.25f, 15.586f, 7.586f, 15.25f, 8f, 15.25f)
                horizontalLineTo(11f)
                curveTo(11.414f, 15.25f, 11.75f, 15.586f, 11.75f, 16f)
                curveTo(11.75f, 16.414f, 11.414f, 16.75f, 11f, 16.75f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 14.75f)
                curveTo(7.586f, 14.75f, 7.25f, 14.414f, 7.25f, 14f)
                curveTo(7.25f, 13.586f, 7.586f, 13.25f, 8f, 13.25f)
                horizontalLineTo(14f)
                curveTo(14.414f, 13.25f, 14.75f, 13.586f, 14.75f, 14f)
                curveTo(14.75f, 14.414f, 14.414f, 14.75f, 14f, 14.75f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return envelopeFront!!
    }

private var envelopeFront: ImageVector? = null