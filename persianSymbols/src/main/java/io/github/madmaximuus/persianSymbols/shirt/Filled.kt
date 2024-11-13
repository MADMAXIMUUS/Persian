package io.github.madmaximuus.persianSymbols.shirt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Shirt: ImageVector
    get() {
        if (shirt != null) {
            return shirt!!
        }
        shirt = ImageVector.Builder(
            name = "shirt-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.359f, 20f)
                horizontalLineTo(13.639f)
                curveTo(16.069f, 20f, 18.039f, 18.03f, 18.039f, 15.6f)
                verticalLineTo(9f)
                lineTo(19.742f, 9.846f)
                curveTo(20.474f, 10.209f, 21.361f, 9.921f, 21.739f, 9.196f)
                lineTo(22.476f, 7.786f)
                curveTo(22.846f, 7.075f, 22.593f, 6.199f, 21.9f, 5.795f)
                lineTo(16.354f, 2.567f)
                curveTo(16.103f, 2.42f, 15.779f, 2.519f, 15.608f, 2.754f)
                curveTo(15.035f, 3.544f, 13.831f, 4.58f, 11.998f, 4.58f)
                curveTo(10.164f, 4.58f, 8.96f, 3.544f, 8.387f, 2.754f)
                curveTo(8.216f, 2.519f, 7.892f, 2.42f, 7.641f, 2.567f)
                lineTo(2.096f, 5.795f)
                curveTo(1.403f, 6.199f, 1.149f, 7.076f, 1.521f, 7.786f)
                lineTo(2.258f, 9.198f)
                curveTo(2.637f, 9.921f, 3.524f, 10.209f, 4.255f, 9.846f)
                lineTo(5.959f, 9f)
                verticalLineTo(15.6f)
                curveTo(5.959f, 18.03f, 7.929f, 20f, 10.359f, 20f)
                close()
            }
        }.build()

        return shirt!!
    }

private var shirt: ImageVector? = null
