package io.github.madmaximuus.persianSymbols.warning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Warning: ImageVector
    get() {
        if (warning != null) {
            return warning!!
        }
        warning = Builder(
            name = "warning-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.5f)
                curveTo(12.414f, 8.5f, 12.75f, 8.836f, 12.75f, 9.25f)
                lineTo(12.75f, 14.724f)
                curveTo(12.75f, 15.138f, 12.414f, 15.474f, 12f, 15.474f)
                curveTo(11.586f, 15.474f, 11.25f, 15.138f, 11.25f, 14.724f)
                lineTo(11.25f, 9.25f)
                curveTo(11.25f, 8.836f, 11.586f, 8.5f, 12f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.002f, 17.09f)
                curveTo(13.002f, 17.642f, 12.554f, 18.09f, 12.002f, 18.09f)
                curveTo(11.45f, 18.09f, 11.002f, 17.642f, 11.002f, 17.09f)
                curveTo(11.002f, 16.538f, 11.45f, 16.09f, 12.002f, 16.09f)
                curveTo(12.554f, 16.09f, 13.002f, 16.538f, 13.002f, 17.09f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.789f, 3.724f)
                curveTo(13.052f, 2.25f, 10.948f, 2.25f, 10.211f, 3.724f)
                lineTo(2.829f, 18.488f)
                curveTo(2.164f, 19.817f, 3.131f, 21.382f, 4.618f, 21.382f)
                horizontalLineTo(19.382f)
                curveTo(20.869f, 21.382f, 21.836f, 19.817f, 21.171f, 18.488f)
                lineTo(13.789f, 3.724f)
                close()
                moveTo(12f, 4.618f)
                lineTo(19.382f, 19.382f)
                horizontalLineTo(4.618f)
                lineTo(12f, 4.618f)
                close()
            }
        }.build()
        return warning!!
    }

private var warning: ImageVector? = null