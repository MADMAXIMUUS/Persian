package io.github.madmaximuus.persianSymbols.four

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Four: ImageVector
    get() {
        if (four != null) {
            return four!!
        }
        four = ImageVector.Builder(
            name = "four-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.813f, 2.552f)
                curveTo(16.22f, 2.689f, 16.494f, 3.071f, 16.494f, 3.5f)
                verticalLineTo(14.994f)
                horizontalLineTo(17.46f)
                curveTo(18.013f, 14.994f, 18.46f, 15.441f, 18.46f, 15.994f)
                curveTo(18.46f, 16.546f, 18.013f, 16.994f, 17.46f, 16.994f)
                horizontalLineTo(16.494f)
                verticalLineTo(20.5f)
                curveTo(16.494f, 21.052f, 16.046f, 21.5f, 15.494f, 21.5f)
                curveTo(14.941f, 21.5f, 14.494f, 21.052f, 14.494f, 20.5f)
                verticalLineTo(16.994f)
                horizontalLineTo(6f)
                curveTo(5.62f, 16.994f, 5.273f, 16.778f, 5.104f, 16.438f)
                curveTo(4.935f, 16.098f, 4.974f, 15.691f, 5.204f, 15.389f)
                lineTo(14.698f, 2.895f)
                curveTo(14.957f, 2.553f, 15.406f, 2.415f, 15.813f, 2.552f)
                close()
                moveTo(14.494f, 14.994f)
                verticalLineTo(6.469f)
                lineTo(8.016f, 14.994f)
                horizontalLineTo(14.494f)
                close()
            }
        }.build()

        return four!!
    }

private var four: ImageVector? = null
