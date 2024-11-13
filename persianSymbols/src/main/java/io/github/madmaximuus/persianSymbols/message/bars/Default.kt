package io.github.madmaximuus.persianSymbols.message.bars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageBars: ImageVector
    get() {
        if (messageBars != null) {
            return messageBars!!
        }
        messageBars = Builder(
            name = "message-bars-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 7.25f)
                curveTo(6.586f, 7.25f, 6.25f, 7.586f, 6.25f, 8f)
                curveTo(6.25f, 8.414f, 6.586f, 8.75f, 7f, 8.75f)
                horizontalLineTo(17f)
                curveTo(17.414f, 8.75f, 17.75f, 8.414f, 17.75f, 8f)
                curveTo(17.75f, 7.586f, 17.414f, 7.25f, 17f, 7.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 10.25f)
                curveTo(6.586f, 10.25f, 6.25f, 10.586f, 6.25f, 11f)
                curveTo(6.25f, 11.414f, 6.586f, 11.75f, 7f, 11.75f)
                horizontalLineTo(17f)
                curveTo(17.414f, 11.75f, 17.75f, 11.414f, 17.75f, 11f)
                curveTo(17.75f, 10.586f, 17.414f, 10.25f, 17f, 10.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.25f, 14f)
                curveTo(6.25f, 13.586f, 6.586f, 13.25f, 7f, 13.25f)
                horizontalLineTo(13f)
                curveTo(13.414f, 13.25f, 13.75f, 13.586f, 13.75f, 14f)
                curveTo(13.75f, 14.414f, 13.414f, 14.75f, 13f, 14.75f)
                horizontalLineTo(7f)
                curveTo(6.586f, 14.75f, 6.25f, 14.414f, 6.25f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3f)
                curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
                verticalLineTo(20f)
                curveTo(2f, 20.332f, 2.165f, 20.642f, 2.439f, 20.828f)
                curveTo(2.714f, 21.014f, 3.063f, 21.052f, 3.371f, 20.928f)
                lineTo(7.746f, 19.179f)
                curveTo(8.041f, 19.061f, 8.356f, 19f, 8.674f, 19f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 19f, 22f, 16.985f, 22f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 5.015f, 19.985f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 7.5f)
                curveTo(4f, 6.119f, 5.119f, 5f, 6.5f, 5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 5f, 20f, 6.119f, 20f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 17f, 7.534f, 17.109f, 7.003f, 17.322f)
                lineTo(4f, 18.523f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return messageBars!!
    }

private var messageBars: ImageVector? = null