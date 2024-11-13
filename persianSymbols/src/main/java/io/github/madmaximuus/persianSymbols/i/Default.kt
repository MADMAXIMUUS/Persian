package io.github.madmaximuus.persianSymbols.i

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.I: ImageVector
    get() {
        if (i != null) {
            return i!!
        }
        i = ImageVector.Builder(
            name = "i-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.993f, 5f)
                curveTo(12.683f, 5f, 13.243f, 4.44f, 13.243f, 3.75f)
                curveTo(13.243f, 3.06f, 12.683f, 2.5f, 11.993f, 2.5f)
                curveTo(11.302f, 2.5f, 10.743f, 3.06f, 10.743f, 3.75f)
                curveTo(10.743f, 4.44f, 11.302f, 5f, 11.993f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.993f, 7f)
                curveTo(12.993f, 6.448f, 12.545f, 6f, 11.993f, 6f)
                curveTo(11.44f, 6f, 10.993f, 6.448f, 10.993f, 7f)
                verticalLineTo(20.5f)
                curveTo(10.993f, 21.052f, 11.44f, 21.5f, 11.993f, 21.5f)
                curveTo(12.545f, 21.5f, 12.993f, 21.052f, 12.993f, 20.5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return i!!
    }

private var i: ImageVector? = null
