package io.github.madmaximuus.persianSymbols.bolt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bolt: ImageVector
    get() {
        if (bolt != null) {
            return bolt!!
        }
        bolt = Builder(
            name = "bolt-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.317f, 2.073f)
                curveTo(14.759f, 2.235f, 15.028f, 2.684f, 14.963f, 3.15f)
                lineTo(14.149f, 9f)
                horizontalLineTo(17f)
                curveTo(17.365f, 9f, 17.701f, 9.199f, 17.877f, 9.519f)
                curveTo(18.052f, 9.839f, 18.039f, 10.23f, 17.843f, 10.538f)
                lineTo(10.82f, 21.549f)
                curveTo(10.567f, 21.947f, 10.07f, 22.114f, 9.628f, 21.949f)
                curveTo(9.186f, 21.785f, 8.919f, 21.334f, 8.987f, 20.868f)
                lineTo(9.844f, 15f)
                horizontalLineTo(7f)
                curveTo(6.635f, 15f, 6.299f, 14.801f, 6.124f, 14.482f)
                curveTo(5.948f, 14.162f, 5.96f, 13.772f, 6.156f, 13.464f)
                lineTo(13.128f, 2.476f)
                curveTo(13.38f, 2.079f, 13.875f, 1.911f, 14.317f, 2.073f)
                close()
                moveTo(8.819f, 13f)
                horizontalLineTo(11f)
                curveTo(11.29f, 13f, 11.566f, 13.126f, 11.756f, 13.346f)
                curveTo(11.946f, 13.566f, 12.031f, 13.857f, 11.99f, 14.144f)
                lineTo(11.639f, 16.546f)
                lineTo(15.176f, 11f)
                horizontalLineTo(13f)
                curveTo(12.711f, 11f, 12.436f, 10.875f, 12.246f, 10.656f)
                curveTo(12.056f, 10.438f, 11.97f, 10.149f, 12.009f, 9.862f)
                lineTo(12.347f, 7.441f)
                lineTo(8.819f, 13f)
                close()
            }
        }.build()
        return bolt!!
    }

private var bolt: ImageVector? = null