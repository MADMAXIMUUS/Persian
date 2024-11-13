package io.github.madmaximuus.persianSymbols.arrow.trend.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowTrendUp: ImageVector
    get() {
        if (arrowTrendUp != null) {
            return arrowTrendUp!!
        }
        arrowTrendUp = Builder(
            name = "arrow-trend-up-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.25f, 8.25f)
                curveTo(15.698f, 8.25f, 15.25f, 7.802f, 15.25f, 7.25f)
                curveTo(15.25f, 6.698f, 15.698f, 6.25f, 16.25f, 6.25f)
                horizontalLineTo(20.75f)
                curveTo(21.302f, 6.25f, 21.75f, 6.698f, 21.75f, 7.25f)
                verticalLineTo(11.75f)
                curveTo(21.75f, 12.302f, 21.302f, 12.75f, 20.75f, 12.75f)
                curveTo(20.198f, 12.75f, 19.75f, 12.302f, 19.75f, 11.75f)
                verticalLineTo(9.664f)
                lineTo(14.664f, 14.75f)
                curveTo(13.883f, 15.531f, 12.617f, 15.531f, 11.836f, 14.75f)
                lineTo(9.25f, 12.164f)
                lineTo(3.957f, 17.457f)
                curveTo(3.567f, 17.848f, 2.933f, 17.848f, 2.543f, 17.457f)
                curveTo(2.152f, 17.067f, 2.152f, 16.433f, 2.543f, 16.043f)
                lineTo(7.836f, 10.75f)
                curveTo(8.617f, 9.969f, 9.883f, 9.969f, 10.664f, 10.75f)
                lineTo(13.25f, 13.336f)
                lineTo(18.336f, 8.25f)
                horizontalLineTo(16.25f)
                close()
            }
        }.build()
        return arrowTrendUp!!
    }

private var arrowTrendUp: ImageVector? = null