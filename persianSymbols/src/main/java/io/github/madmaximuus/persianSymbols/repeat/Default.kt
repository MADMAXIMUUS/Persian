package io.github.madmaximuus.persianSymbols.repeat

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Repeat: ImageVector
    get() {
        if (repeat != null) {
            return repeat!!
        }
        repeat = Builder(
            name = "repeat-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.168f, 2.445f)
                curveTo(17.474f, 1.986f, 18.095f, 1.862f, 18.555f, 2.168f)
                lineTo(20.931f, 3.752f)
                curveTo(21.821f, 4.346f, 21.821f, 5.654f, 20.931f, 6.248f)
                lineTo(18.555f, 7.832f)
                curveTo(18.095f, 8.138f, 17.474f, 8.014f, 17.168f, 7.555f)
                curveTo(16.862f, 7.095f, 16.986f, 6.474f, 17.445f, 6.168f)
                lineTo(17.697f, 6f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 6f, 5f, 7.119f, 5f, 8.5f)
                verticalLineTo(12f)
                curveTo(5f, 12.552f, 4.552f, 13f, 4f, 13f)
                curveTo(3.448f, 13f, 3f, 12.552f, 3f, 12f)
                verticalLineTo(8.5f)
                curveTo(3f, 6.015f, 5.015f, 4f, 7.5f, 4f)
                horizontalLineTo(17.697f)
                lineTo(17.445f, 3.832f)
                curveTo(16.986f, 3.526f, 16.862f, 2.905f, 17.168f, 2.445f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 11f)
                curveTo(20.552f, 11f, 21f, 11.448f, 21f, 12f)
                verticalLineTo(15.5f)
                curveTo(21f, 17.985f, 18.985f, 20f, 16.5f, 20f)
                horizontalLineTo(6.303f)
                lineTo(6.555f, 20.168f)
                curveTo(7.014f, 20.474f, 7.138f, 21.095f, 6.832f, 21.555f)
                curveTo(6.526f, 22.014f, 5.905f, 22.138f, 5.445f, 21.832f)
                lineTo(3.069f, 20.248f)
                curveTo(2.179f, 19.654f, 2.179f, 18.346f, 3.069f, 17.752f)
                lineTo(5.445f, 16.168f)
                curveTo(5.905f, 15.862f, 6.526f, 15.986f, 6.832f, 16.445f)
                curveTo(7.138f, 16.905f, 7.014f, 17.526f, 6.555f, 17.832f)
                lineTo(6.303f, 18f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 18f, 19f, 16.881f, 19f, 15.5f)
                verticalLineTo(12f)
                curveTo(19f, 11.448f, 19.448f, 11f, 20f, 11f)
                close()
            }
        }.build()
        return repeat!!
    }

private var repeat: ImageVector? = null