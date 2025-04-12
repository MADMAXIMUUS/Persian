package io.github.madmaximuus.persianSymbols.headphones

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Headphones: ImageVector
    get() {
        if (headphones != null) {
            return headphones!!
        }
        headphones = ImageVector.Builder(
            name = "headphones-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                verticalLineTo(12.675f)
                lineTo(5.588f, 12.221f)
                curveTo(6.546f, 11.947f, 7.5f, 12.667f, 7.5f, 13.663f)
                verticalLineTo(20.337f)
                curveTo(7.5f, 21.334f, 6.546f, 22.053f, 5.588f, 21.78f)
                lineTo(3.451f, 21.169f)
                curveTo(2.592f, 20.924f, 2f, 20.139f, 2f, 19.246f)
                verticalLineTo(19.016f)
                lineTo(2f, 19f)
                verticalLineTo(12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                verticalLineTo(14.732f)
                curveTo(22f, 14.74f, 22f, 14.747f, 22f, 14.755f)
                verticalLineTo(19.246f)
                curveTo(22f, 20.139f, 21.408f, 20.924f, 20.55f, 21.169f)
                lineTo(18.412f, 21.78f)
                curveTo(17.454f, 22.053f, 16.5f, 21.334f, 16.5f, 20.337f)
                verticalLineTo(13.663f)
                curveTo(16.5f, 12.667f, 17.454f, 11.947f, 18.412f, 12.221f)
                lineTo(20f, 12.675f)
                verticalLineTo(12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
                moveTo(20f, 14.755f)
                lineTo(18.5f, 14.326f)
                verticalLineTo(19.674f)
                lineTo(20f, 19.246f)
                verticalLineTo(19.016f)
                curveTo(20f, 19.011f, 20f, 19.006f, 20f, 19f)
                verticalLineTo(14.755f)
                close()
                moveTo(5.5f, 14.326f)
                lineTo(4f, 14.755f)
                verticalLineTo(19.246f)
                lineTo(5.5f, 19.674f)
                verticalLineTo(14.326f)
                close()
            }
        }.build()

        return headphones!!
    }

private var headphones: ImageVector? = null