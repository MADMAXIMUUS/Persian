package io.github.madmaximuus.persianSymbols.check

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Check: ImageVector
    get() {
        if (check != null) {
            return check!!
        }
        check = ImageVector.Builder(
            name = "check-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.145f, 8.382f)
                curveTo(19.535f, 7.992f, 19.502f, 7.395f, 19.071f, 7.05f)
                curveTo(18.64f, 6.705f, 17.974f, 6.742f, 17.583f, 7.132f)
                lineTo(9.879f, 14.837f)
                lineTo(6.417f, 11.375f)
                curveTo(6.026f, 10.984f, 5.36f, 10.948f, 4.929f, 11.293f)
                curveTo(4.498f, 11.638f, 4.465f, 12.234f, 4.855f, 12.625f)
                lineTo(8.99f, 16.76f)
                curveTo(9.04f, 16.829f, 9.1f, 16.893f, 9.172f, 16.95f)
                curveTo(9.373f, 17.111f, 9.626f, 17.189f, 9.879f, 17.186f)
                curveTo(10.131f, 17.189f, 10.384f, 17.111f, 10.586f, 16.95f)
                curveTo(10.657f, 16.893f, 10.717f, 16.829f, 10.767f, 16.76f)
                lineTo(19.145f, 8.382f)
                close()
            }
        }.build()
        return check!!
    }

private var check: ImageVector? = null