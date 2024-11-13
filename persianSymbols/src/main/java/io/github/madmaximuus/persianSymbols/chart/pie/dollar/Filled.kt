package io.github.madmaximuus.persianSymbols.chart.pie.dollar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ChartPieDollar: ImageVector
    get() {
        if (chartPieDollarFilled != null) {
            return chartPieDollarFilled!!
        }
        chartPieDollarFilled = ImageVector.Builder(
            name = "chart-pie-dollar-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 17.186f, 5.947f, 21.45f, 11.001f, 21.951f)
                curveTo(11.551f, 22.005f, 12f, 21.552f, 12f, 21f)
                verticalLineTo(14f)
                curveTo(12f, 12.895f, 12.895f, 12f, 14f, 12f)
                horizontalLineTo(21f)
                curveTo(21.552f, 12f, 22.005f, 11.551f, 21.951f, 11.001f)
                curveTo(21.45f, 5.947f, 17.186f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                close()
                moveTo(8.526f, 7.463f)
                curveTo(8.526f, 7.048f, 8.19f, 6.713f, 7.776f, 6.713f)
                curveTo(7.361f, 6.713f, 7.026f, 7.048f, 7.026f, 7.463f)
                verticalLineTo(7.551f)
                curveTo(5.873f, 7.825f, 4.9f, 8.717f, 4.9f, 9.963f)
                curveTo(4.9f, 11.473f, 6.33f, 12.463f, 7.775f, 12.463f)
                curveTo(8.678f, 12.463f, 9.151f, 13.041f, 9.151f, 13.464f)
                curveTo(9.151f, 13.885f, 8.68f, 14.461f, 7.781f, 14.464f)
                lineTo(7.776f, 14.464f)
                lineTo(7.77f, 14.464f)
                curveTo(7.122f, 14.462f, 6.653f, 14.136f, 6.482f, 13.798f)
                curveTo(6.295f, 13.429f, 5.844f, 13.281f, 5.474f, 13.468f)
                curveTo(5.105f, 13.655f, 4.957f, 14.106f, 5.144f, 14.476f)
                curveTo(5.506f, 15.19f, 6.21f, 15.687f, 7.026f, 15.878f)
                verticalLineTo(15.965f)
                curveTo(7.026f, 16.379f, 7.361f, 16.715f, 7.776f, 16.715f)
                curveTo(8.19f, 16.715f, 8.526f, 16.379f, 8.526f, 15.965f)
                verticalLineTo(15.875f)
                curveTo(9.677f, 15.601f, 10.651f, 14.71f, 10.651f, 13.464f)
                curveTo(10.651f, 11.953f, 9.221f, 10.963f, 7.775f, 10.963f)
                curveTo(6.873f, 10.963f, 6.4f, 10.386f, 6.4f, 9.963f)
                curveTo(6.4f, 9.546f, 6.86f, 8.979f, 7.738f, 8.963f)
                curveTo(7.75f, 8.964f, 7.763f, 8.964f, 7.776f, 8.964f)
                curveTo(7.788f, 8.964f, 7.8f, 8.964f, 7.813f, 8.963f)
                curveTo(8.452f, 8.975f, 8.91f, 9.304f, 9.074f, 9.64f)
                curveTo(9.256f, 10.012f, 9.705f, 10.167f, 10.077f, 9.985f)
                curveTo(10.449f, 9.804f, 10.604f, 9.355f, 10.423f, 8.983f)
                curveTo(10.066f, 8.251f, 9.353f, 7.742f, 8.526f, 7.549f)
                verticalLineTo(7.463f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.999f, 22.951f)
                curveTo(18.724f, 22.482f, 22.482f, 18.724f, 22.951f, 13.999f)
                curveTo(23.005f, 13.449f, 22.552f, 13f, 22f, 13f)
                horizontalLineTo(14f)
                curveTo(13.448f, 13f, 13f, 13.448f, 13f, 14f)
                verticalLineTo(22f)
                curveTo(13f, 22.552f, 13.449f, 23.005f, 13.999f, 22.951f)
                close()
            }
        }.build()

        return chartPieDollarFilled!!
    }

private var chartPieDollarFilled: ImageVector? = null
