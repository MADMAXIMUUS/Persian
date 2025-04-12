package io.github.madmaximuus.persianSymbols.arrow.up.right.and.arrow.left.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowUpRightAndArrowLeftDown: ImageVector
    get() {
        if (arrowUpRightAndArrowLeftDown != null) {
            return arrowUpRightAndArrowLeftDown!!
        }
        arrowUpRightAndArrowLeftDown = ImageVector.Builder(
            name = "arrow-up-right-and-arrow-left-down-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.997f, 3.977f)
                curveTo(13.549f, 3.975f, 13.998f, 4.421f, 14f, 4.973f)
                lineTo(14.014f, 8.549f)
                lineTo(17.802f, 4.761f)
                curveTo(18.193f, 4.37f, 18.826f, 4.37f, 19.216f, 4.761f)
                curveTo(19.607f, 5.152f, 19.607f, 5.785f, 19.216f, 6.175f)
                lineTo(15.424f, 9.968f)
                lineTo(19.019f, 9.954f)
                curveTo(19.572f, 9.952f, 20.021f, 10.398f, 20.023f, 10.95f)
                curveTo(20.025f, 11.503f, 19.579f, 11.952f, 19.027f, 11.954f)
                lineTo(13.027f, 11.977f)
                curveTo(12.475f, 11.979f, 12.025f, 11.533f, 12.023f, 10.981f)
                lineTo(12f, 4.981f)
                curveTo(11.998f, 4.429f, 12.444f, 3.979f, 12.997f, 3.977f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 20f)
                curveTo(10.448f, 20f, 10f, 19.552f, 10f, 19f)
                verticalLineTo(15.414f)
                lineTo(6.205f, 19.209f)
                curveTo(5.814f, 19.6f, 5.181f, 19.6f, 4.79f, 19.209f)
                curveTo(4.4f, 18.819f, 4.4f, 18.185f, 4.79f, 17.795f)
                lineTo(8.585f, 14f)
                horizontalLineTo(5f)
                curveTo(4.448f, 14f, 4f, 13.552f, 4f, 13f)
                curveTo(4f, 12.448f, 4.448f, 12f, 5f, 12f)
                horizontalLineTo(10.984f)
                curveTo(11.243f, 11.996f, 11.502f, 12.091f, 11.7f, 12.286f)
                curveTo(11.712f, 12.298f, 11.724f, 12.31f, 11.735f, 12.322f)
                curveTo(11.799f, 12.391f, 11.851f, 12.467f, 11.892f, 12.548f)
                curveTo(11.961f, 12.684f, 12f, 12.837f, 12f, 13f)
                verticalLineTo(19f)
                curveTo(12f, 19.552f, 11.552f, 20f, 11f, 20f)
                close()
            }
        }.build()

        return arrowUpRightAndArrowLeftDown!!
    }

private var arrowUpRightAndArrowLeftDown: ImageVector? = null
