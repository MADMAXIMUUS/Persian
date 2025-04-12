package io.github.madmaximuus.persianSymbols.envelope.front

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeFront: ImageVector
    get() {
        if (envelopeFront != null) {
            return envelopeFront!!
        }
        envelopeFront = ImageVector.Builder(
            name = "envelope-front-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 16.75f)
                curveTo(7.586f, 16.75f, 7.25f, 16.414f, 7.25f, 16f)
                curveTo(7.25f, 15.586f, 7.586f, 15.25f, 8f, 15.25f)
                horizontalLineTo(11f)
                curveTo(11.414f, 15.25f, 11.75f, 15.586f, 11.75f, 16f)
                curveTo(11.75f, 16.414f, 11.414f, 16.75f, 11f, 16.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 14.75f)
                curveTo(7.586f, 14.75f, 7.25f, 14.414f, 7.25f, 14f)
                curveTo(7.25f, 13.586f, 7.586f, 13.25f, 8f, 13.25f)
                horizontalLineTo(14f)
                curveTo(14.414f, 13.25f, 14.75f, 13.586f, 14.75f, 14f)
                curveTo(14.75f, 14.414f, 14.414f, 14.75f, 14f, 14.75f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(5.119f, 6f, 4f, 7.119f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 18f, 20f, 16.881f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 7.119f, 18.881f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()

        return envelopeFront!!
    }

private var envelopeFront: ImageVector? = null