package io.github.madmaximuus.persianSymbols.heart

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Heart: ImageVector
    get() {
        if (heart != null) {
            return heart!!
        }
        heart = ImageVector.Builder(
            name = "heart-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.619f, 4.49f)
                curveTo(11.744f, 4.622f, 11.862f, 4.759f, 11.973f, 4.9f)
                lineTo(11.99f, 4.882f)
                lineTo(12.018f, 4.911f)
                curveTo(12.131f, 4.766f, 12.252f, 4.626f, 12.381f, 4.49f)
                curveTo(14.581f, 2.17f, 18.149f, 2.17f, 20.35f, 4.49f)
                curveTo(22.55f, 6.81f, 22.55f, 10.572f, 20.35f, 12.892f)
                curveTo(20.221f, 13.028f, 20.088f, 13.155f, 19.951f, 13.275f)
                lineTo(19.959f, 13.284f)
                lineTo(12.708f, 20.929f)
                curveTo(12.315f, 21.344f, 11.666f, 21.344f, 11.273f, 20.929f)
                lineTo(4.022f, 13.284f)
                lineTo(4.039f, 13.266f)
                curveTo(3.905f, 13.149f, 3.776f, 13.024f, 3.65f, 12.892f)
                curveTo(1.45f, 10.572f, 1.45f, 6.81f, 3.65f, 4.49f)
                curveTo(5.851f, 2.17f, 9.419f, 2.17f, 11.619f, 4.49f)
                close()
            }
        }.build()
        return heart!!
    }

private var heart: ImageVector? = null