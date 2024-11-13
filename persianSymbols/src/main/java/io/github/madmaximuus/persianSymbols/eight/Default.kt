package io.github.madmaximuus.persianSymbols.eight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Eight: ImageVector
    get() {
        if (_EightDefault != null) {
            return _EightDefault!!
        }
        _EightDefault = ImageVector.Builder(
            name = "eight-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4.5f)
                curveTo(10.343f, 4.5f, 9f, 5.843f, 9f, 7.5f)
                curveTo(9f, 9.157f, 10.343f, 10.5f, 12f, 10.5f)
                curveTo(13.657f, 10.5f, 15f, 9.157f, 15f, 7.5f)
                curveTo(15f, 5.843f, 13.657f, 4.5f, 12f, 4.5f)
                close()
                moveTo(15.077f, 11.441f)
                curveTo(16.248f, 10.526f, 17f, 9.101f, 17f, 7.5f)
                curveTo(17f, 4.739f, 14.761f, 2.5f, 12f, 2.5f)
                curveTo(9.239f, 2.5f, 7f, 4.739f, 7f, 7.5f)
                curveTo(7f, 9.101f, 7.752f, 10.526f, 8.922f, 11.441f)
                curveTo(7.461f, 12.429f, 6.5f, 14.103f, 6.5f, 16f)
                curveTo(6.5f, 19.038f, 8.962f, 21.5f, 12f, 21.5f)
                curveTo(15.037f, 21.5f, 17.5f, 19.038f, 17.5f, 16f)
                curveTo(17.5f, 14.103f, 16.539f, 12.43f, 15.077f, 11.441f)
                close()
                moveTo(12f, 12.5f)
                curveTo(10.067f, 12.5f, 8.5f, 14.067f, 8.5f, 16f)
                curveTo(8.5f, 17.933f, 10.067f, 19.5f, 12f, 19.5f)
                curveTo(13.933f, 19.5f, 15.5f, 17.933f, 15.5f, 16f)
                curveTo(15.5f, 14.067f, 13.933f, 12.5f, 12f, 12.5f)
                close()
            }
        }.build()

        return _EightDefault!!
    }

private var _EightDefault: ImageVector? = null
