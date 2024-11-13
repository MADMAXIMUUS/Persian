package io.github.madmaximuus.persianSymbols.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Pen: ImageVector
    get() {
        if (pen != null) {
            return pen!!
        }
        pen = Builder(
            name = "pen-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.466f, 3.12f)
                curveTo(18.685f, 2.339f, 17.419f, 2.339f, 16.638f, 3.12f)
                lineTo(3.777f, 15.98f)
                curveTo(3.559f, 16.198f, 3.4f, 16.469f, 3.317f, 16.767f)
                lineTo(2.272f, 20.495f)
                curveTo(2.175f, 20.843f, 2.273f, 21.216f, 2.528f, 21.472f)
                curveTo(2.784f, 21.727f, 3.157f, 21.825f, 3.505f, 21.728f)
                lineTo(7.233f, 20.683f)
                curveTo(7.53f, 20.6f, 7.801f, 20.441f, 8.02f, 20.222f)
                lineTo(20.88f, 7.362f)
                curveTo(21.661f, 6.581f, 21.661f, 5.315f, 20.88f, 4.534f)
                lineTo(19.466f, 3.12f)
                close()
                moveTo(16.823f, 5.762f)
                lineTo(18.052f, 4.534f)
                lineTo(19.466f, 5.948f)
                lineTo(18.237f, 7.177f)
                lineTo(16.823f, 5.762f)
                close()
                moveTo(15.762f, 6.823f)
                lineTo(5.229f, 17.357f)
                lineTo(4.678f, 19.322f)
                lineTo(6.643f, 18.771f)
                lineTo(17.177f, 8.237f)
                lineTo(15.762f, 6.823f)
                close()
            }
        }.build()
        return pen!!
    }

private var pen: ImageVector? = null