package io.github.madmaximuus.persianSymbols.chart.pie.dollar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChartPieDollar: ImageVector
    get() {
        if (chartPieDollarDefault != null) {
            return chartPieDollarDefault!!
        }
        chartPieDollarDefault = ImageVector.Builder(
            name = "chart-pie-dollar-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.776f, 6.713f)
                curveTo(8.19f, 6.713f, 8.526f, 7.048f, 8.526f, 7.463f)
                verticalLineTo(7.549f)
                curveTo(9.353f, 7.742f, 10.066f, 8.251f, 10.423f, 8.983f)
                curveTo(10.604f, 9.355f, 10.449f, 9.804f, 10.077f, 9.985f)
                curveTo(9.705f, 10.167f, 9.256f, 10.012f, 9.074f, 9.64f)
                curveTo(8.91f, 9.304f, 8.452f, 8.975f, 7.813f, 8.963f)
                curveTo(7.8f, 8.964f, 7.788f, 8.964f, 7.776f, 8.964f)
                curveTo(7.763f, 8.964f, 7.75f, 8.964f, 7.738f, 8.963f)
                curveTo(6.86f, 8.979f, 6.4f, 9.546f, 6.4f, 9.963f)
                curveTo(6.4f, 10.386f, 6.873f, 10.963f, 7.775f, 10.963f)
                curveTo(9.221f, 10.963f, 10.651f, 11.953f, 10.651f, 13.464f)
                curveTo(10.651f, 14.71f, 9.677f, 15.601f, 8.526f, 15.875f)
                verticalLineTo(15.965f)
                curveTo(8.526f, 16.379f, 8.19f, 16.715f, 7.776f, 16.715f)
                curveTo(7.361f, 16.715f, 7.026f, 16.379f, 7.026f, 15.965f)
                verticalLineTo(15.878f)
                curveTo(6.21f, 15.687f, 5.506f, 15.19f, 5.144f, 14.476f)
                curveTo(4.957f, 14.106f, 5.105f, 13.655f, 5.474f, 13.468f)
                curveTo(5.844f, 13.281f, 6.295f, 13.429f, 6.482f, 13.798f)
                curveTo(6.653f, 14.136f, 7.122f, 14.462f, 7.77f, 14.464f)
                lineTo(7.776f, 14.464f)
                lineTo(7.781f, 14.464f)
                curveTo(8.68f, 14.461f, 9.151f, 13.885f, 9.151f, 13.464f)
                curveTo(9.151f, 13.041f, 8.678f, 12.463f, 7.775f, 12.463f)
                curveTo(6.33f, 12.463f, 4.9f, 11.473f, 4.9f, 9.963f)
                curveTo(4.9f, 8.717f, 5.873f, 7.825f, 7.026f, 7.551f)
                verticalLineTo(7.463f)
                curveTo(7.026f, 7.048f, 7.361f, 6.713f, 7.776f, 6.713f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
                horizontalLineTo(14f)
                curveTo(13.448f, 13f, 13f, 13.448f, 13f, 14f)
                verticalLineTo(21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                curveTo(4f, 16.08f, 7.054f, 19.446f, 11f, 19.938f)
                verticalLineTo(14f)
                curveTo(11f, 12.343f, 12.343f, 11f, 14f, 11f)
                horizontalLineTo(19.938f)
                curveTo(19.446f, 7.054f, 16.08f, 4f, 12f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 14f)
                curveTo(14.448f, 14f, 14f, 14.448f, 14f, 15f)
                verticalLineTo(22f)
                curveTo(14f, 22.552f, 14.448f, 23f, 15f, 23f)
                curveTo(19.418f, 23f, 23f, 19.418f, 23f, 15f)
                curveTo(23f, 14.448f, 22.552f, 14f, 22f, 14f)
                horizontalLineTo(15f)
                close()
                moveTo(16f, 20.917f)
                verticalLineTo(16f)
                horizontalLineTo(20.917f)
                curveTo(20.496f, 18.513f, 18.513f, 20.496f, 16f, 20.917f)
                close()
            }
        }.build()

        return chartPieDollarDefault!!
    }

private var chartPieDollarDefault: ImageVector? = null
