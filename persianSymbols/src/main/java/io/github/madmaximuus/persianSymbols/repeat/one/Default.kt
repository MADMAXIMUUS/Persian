package io.github.madmaximuus.persianSymbols.repeat.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Repeat1: ImageVector
    get() {
        if (repeat1 != null) {
            return repeat1!!
        }
        repeat1 = Builder(
            name = "repeat-1-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.555f, 2.168f)
                curveTo(18.095f, 1.862f, 17.474f, 1.986f, 17.168f, 2.445f)
                curveTo(16.862f, 2.905f, 16.986f, 3.526f, 17.445f, 3.832f)
                lineTo(17.697f, 4f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 4f, 3f, 6.015f, 3f, 8.5f)
                verticalLineTo(12f)
                curveTo(3f, 12.552f, 3.448f, 13f, 4f, 13f)
                curveTo(4.552f, 13f, 5f, 12.552f, 5f, 12f)
                verticalLineTo(8.5f)
                curveTo(5f, 7.119f, 6.119f, 6f, 7.5f, 6f)
                horizontalLineTo(17.697f)
                lineTo(17.445f, 6.168f)
                curveTo(16.986f, 6.474f, 16.862f, 7.095f, 17.168f, 7.555f)
                curveTo(17.474f, 8.014f, 18.095f, 8.138f, 18.555f, 7.832f)
                lineTo(20.931f, 6.248f)
                curveTo(21.821f, 5.654f, 21.821f, 4.346f, 20.931f, 3.752f)
                lineTo(18.555f, 2.168f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 12f)
                curveTo(21f, 11.448f, 20.552f, 11f, 20f, 11f)
                curveTo(19.448f, 11f, 19f, 11.448f, 19f, 12f)
                verticalLineTo(15.5f)
                curveTo(19f, 16.881f, 17.881f, 18f, 16.5f, 18f)
                horizontalLineTo(6.303f)
                lineTo(6.555f, 17.832f)
                curveTo(7.014f, 17.526f, 7.138f, 16.905f, 6.832f, 16.445f)
                curveTo(6.526f, 15.986f, 5.905f, 15.862f, 5.445f, 16.168f)
                lineTo(3.069f, 17.752f)
                curveTo(2.179f, 18.346f, 2.179f, 19.654f, 3.069f, 20.248f)
                lineTo(5.445f, 21.832f)
                curveTo(5.905f, 22.138f, 6.526f, 22.014f, 6.832f, 21.555f)
                curveTo(7.138f, 21.095f, 7.014f, 20.474f, 6.555f, 20.168f)
                lineTo(6.303f, 20f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 20f, 21f, 17.985f, 21f, 15.5f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.17f, 8f)
                curveTo(13.17f, 7.697f, 12.988f, 7.423f, 12.707f, 7.307f)
                curveTo(12.427f, 7.191f, 12.105f, 7.255f, 11.89f, 7.47f)
                lineTo(9.539f, 9.82f)
                curveTo(9.246f, 10.113f, 9.246f, 10.588f, 9.539f, 10.881f)
                curveTo(9.832f, 11.174f, 10.307f, 11.174f, 10.6f, 10.881f)
                lineTo(11.67f, 9.811f)
                verticalLineTo(16f)
                curveTo(11.67f, 16.414f, 12.006f, 16.75f, 12.42f, 16.75f)
                curveTo(12.835f, 16.75f, 13.17f, 16.414f, 13.17f, 16f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        return repeat1!!
    }

private var repeat1: ImageVector? = null