package io.github.madmaximuus.persianSymbols.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.One: ImageVector
    get() {
        if (one != null) {
            return one!!
        }
        one = ImageVector.Builder(
            name = "one-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.878f, 2.576f)
                curveTo(14.252f, 2.731f, 14.495f, 3.096f, 14.495f, 3.5f)
                verticalLineTo(20.5f)
                curveTo(14.495f, 21.052f, 14.048f, 21.5f, 13.495f, 21.5f)
                curveTo(12.943f, 21.5f, 12.495f, 21.052f, 12.495f, 20.5f)
                verticalLineTo(5.914f)
                lineTo(9.207f, 9.203f)
                curveTo(8.817f, 9.593f, 8.183f, 9.593f, 7.793f, 9.203f)
                curveTo(7.402f, 8.812f, 7.402f, 8.179f, 7.793f, 7.788f)
                lineTo(12.788f, 2.793f)
                curveTo(13.074f, 2.507f, 13.504f, 2.421f, 13.878f, 2.576f)
                close()
            }
        }.build()

        return one!!
    }

private var one: ImageVector? = null
