package io.github.madmaximuus.persianSymbols.message

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Message: ImageVector
    get() {
        if (message != null) {
            return message!!
        }
        message = Builder(
            name = "message-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 7.5f)
                curveTo(2f, 5.015f, 4.015f, 3f, 6.5f, 3f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 3f, 22f, 5.015f, 22f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(22f, 16.985f, 19.985f, 19f, 17.5f, 19f)
                horizontalLineTo(8.674f)
                curveTo(8.356f, 19f, 8.041f, 19.061f, 7.746f, 19.179f)
                lineTo(3.371f, 20.928f)
                curveTo(3.063f, 21.052f, 2.714f, 21.014f, 2.439f, 20.828f)
                curveTo(2.165f, 20.642f, 2f, 20.332f, 2f, 20f)
                verticalLineTo(7.5f)
                close()
                moveTo(6.5f, 5f)
                curveTo(5.119f, 5f, 4f, 6.119f, 4f, 7.5f)
                verticalLineTo(18.523f)
                lineTo(7.003f, 17.322f)
                curveTo(7.534f, 17.109f, 8.102f, 17f, 8.674f, 17f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 17f, 20f, 15.881f, 20f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(20f, 6.119f, 18.881f, 5f, 17.5f, 5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return message!!
    }

private var message: ImageVector? = null