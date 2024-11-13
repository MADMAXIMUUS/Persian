package io.github.madmaximuus.persianSymbols.arrow.trend.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowTrendDown: ImageVector
    get() {
        if (arrowTrendDown != null) {
            return arrowTrendDown!!
        }
        arrowTrendDown = Builder(
            name = "arrow-trend-down-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.25f, 15.75f)
                curveTo(15.698f, 15.75f, 15.25f, 16.198f, 15.25f, 16.75f)
                curveTo(15.25f, 17.302f, 15.698f, 17.75f, 16.25f, 17.75f)
                horizontalLineTo(20.75f)
                curveTo(21.302f, 17.75f, 21.75f, 17.302f, 21.75f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(21.75f, 11.698f, 21.302f, 11.25f, 20.75f, 11.25f)
                curveTo(20.198f, 11.25f, 19.75f, 11.698f, 19.75f, 12.25f)
                verticalLineTo(14.336f)
                lineTo(14.664f, 9.25f)
                curveTo(13.883f, 8.469f, 12.617f, 8.469f, 11.836f, 9.25f)
                lineTo(9.25f, 11.836f)
                lineTo(3.957f, 6.543f)
                curveTo(3.567f, 6.152f, 2.933f, 6.152f, 2.543f, 6.543f)
                curveTo(2.152f, 6.933f, 2.152f, 7.567f, 2.543f, 7.957f)
                lineTo(7.836f, 13.25f)
                curveTo(8.617f, 14.031f, 9.883f, 14.031f, 10.664f, 13.25f)
                lineTo(13.25f, 10.664f)
                lineTo(18.336f, 15.75f)
                horizontalLineTo(16.25f)
                close()
            }
        }.build()
        return arrowTrendDown!!
    }

private var arrowTrendDown: ImageVector? = null