package io.github.madmaximuus.persianSymbols.dollar.rectangle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DollarRectangle: ImageVector
    get() {
        if (dollarRectangle != null) {
            return dollarRectangle!!
        }
        dollarRectangle = Builder(
            name = "dollar-rectangle-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
                moveTo(12.75f, 7.833f)
                curveTo(12.75f, 7.419f, 12.414f, 7.083f, 12f, 7.083f)
                curveTo(11.586f, 7.083f, 11.25f, 7.419f, 11.25f, 7.833f)
                verticalLineTo(7.909f)
                curveTo(10.121f, 8.182f, 9.167f, 9.058f, 9.167f, 10.285f)
                curveTo(9.167f, 11.776f, 10.578f, 12.75f, 12f, 12.75f)
                curveTo(12.879f, 12.75f, 13.333f, 13.312f, 13.333f, 13.716f)
                curveTo(13.333f, 14.12f, 12.879f, 14.682f, 12f, 14.682f)
                curveTo(11.366f, 14.682f, 10.911f, 14.363f, 10.745f, 14.037f)
                curveTo(10.558f, 13.668f, 10.107f, 13.52f, 9.737f, 13.707f)
                curveTo(9.368f, 13.894f, 9.22f, 14.346f, 9.407f, 14.715f)
                curveTo(9.763f, 15.416f, 10.452f, 15.905f, 11.25f, 16.094f)
                verticalLineTo(16.167f)
                curveTo(11.25f, 16.581f, 11.586f, 16.917f, 12f, 16.917f)
                curveTo(12.414f, 16.917f, 12.75f, 16.581f, 12.75f, 16.167f)
                verticalLineTo(16.092f)
                curveTo(13.88f, 15.819f, 14.833f, 14.942f, 14.833f, 13.716f)
                curveTo(14.833f, 12.225f, 13.422f, 11.25f, 12f, 11.25f)
                curveTo(11.121f, 11.25f, 10.667f, 10.688f, 10.667f, 10.285f)
                curveTo(10.667f, 9.881f, 11.121f, 9.319f, 12f, 9.319f)
                curveTo(12.642f, 9.319f, 13.099f, 9.644f, 13.26f, 9.974f)
                curveTo(13.441f, 10.347f, 13.891f, 10.501f, 14.263f, 10.32f)
                curveTo(14.635f, 10.138f, 14.79f, 9.689f, 14.608f, 9.317f)
                curveTo(14.258f, 8.599f, 13.56f, 8.099f, 12.75f, 7.906f)
                verticalLineTo(7.833f)
                close()
            }
        }.build()
        return dollarRectangle!!
    }

private var dollarRectangle: ImageVector? = null