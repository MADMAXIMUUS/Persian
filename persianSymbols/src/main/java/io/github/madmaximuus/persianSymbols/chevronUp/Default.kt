package io.github.madmaximuus.persianSymbols.chevronUp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronUp: ImageVector
    get() {
        if (chevronUp != null) {
            return chevronUp!!
        }
        chevronUp = ImageVector.Builder(
            name = "chevron-up-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.775f, 13.235f)
                curveTo(6.385f, 13.626f, 6.381f, 14.262f, 6.768f, 14.657f)
                curveTo(7.154f, 15.052f, 7.784f, 15.055f, 8.174f, 14.664f)
                lineTo(11.717f, 11.121f)
                lineTo(15.26f, 14.664f)
                curveTo(15.651f, 15.055f, 16.281f, 15.052f, 16.667f, 14.657f)
                curveTo(17.053f, 14.262f, 17.05f, 13.626f, 16.66f, 13.235f)
                lineTo(12.429f, 9.004f)
                lineTo(12.425f, 9f)
                curveTo(12.038f, 8.605f, 11.408f, 8.602f, 11.018f, 8.993f)
                lineTo(6.775f, 13.235f)
                close()
            }
        }.build()
        return chevronUp!!
    }

private var chevronUp: ImageVector? = null