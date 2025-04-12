package io.github.madmaximuus.persianSymbols.arrow.down.right.and.arrow.up.left

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowDownRightAndArrowUpLeft: ImageVector
    get() {
        if (arrowDownRightAndArrowUpLeft != null) {
            return arrowDownRightAndArrowUpLeft!!
        }
        arrowDownRightAndArrowUpLeft = ImageVector.Builder(
            name = "arrow-down-right-and-arrow-up-left-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.026f, 3.977f)
                curveTo(10.474f, 3.975f, 10.025f, 4.421f, 10.023f, 4.973f)
                lineTo(10.009f, 8.549f)
                lineTo(6.221f, 4.761f)
                curveTo(5.83f, 4.37f, 5.197f, 4.37f, 4.806f, 4.761f)
                curveTo(4.416f, 5.152f, 4.416f, 5.785f, 4.806f, 6.175f)
                lineTo(8.599f, 9.968f)
                lineTo(5.004f, 9.954f)
                curveTo(4.451f, 9.952f, 4.002f, 10.398f, 4f, 10.95f)
                curveTo(3.998f, 11.503f, 4.444f, 11.952f, 4.996f, 11.954f)
                lineTo(10.996f, 11.977f)
                curveTo(11.548f, 11.979f, 11.998f, 11.533f, 12f, 10.981f)
                lineTo(12.023f, 4.981f)
                curveTo(12.025f, 4.429f, 11.579f, 3.979f, 11.026f, 3.977f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.023f, 20f)
                curveTo(13.575f, 20f, 14.023f, 19.552f, 14.023f, 19f)
                verticalLineTo(15.414f)
                lineTo(17.818f, 19.209f)
                curveTo(18.209f, 19.6f, 18.842f, 19.6f, 19.233f, 19.209f)
                curveTo(19.623f, 18.819f, 19.623f, 18.185f, 19.233f, 17.795f)
                lineTo(15.438f, 14f)
                horizontalLineTo(19.023f)
                curveTo(19.575f, 14f, 20.023f, 13.552f, 20.023f, 13f)
                curveTo(20.023f, 12.448f, 19.575f, 12f, 19.023f, 12f)
                horizontalLineTo(13.039f)
                curveTo(12.78f, 11.996f, 12.521f, 12.091f, 12.323f, 12.286f)
                curveTo(12.311f, 12.298f, 12.299f, 12.31f, 12.288f, 12.322f)
                curveTo(12.224f, 12.391f, 12.172f, 12.467f, 12.131f, 12.548f)
                curveTo(12.062f, 12.684f, 12.023f, 12.837f, 12.023f, 13f)
                verticalLineTo(19f)
                curveTo(12.023f, 19.552f, 12.471f, 20f, 13.023f, 20f)
                close()
            }
        }.build()

        return arrowDownRightAndArrowUpLeft!!
    }

private var arrowDownRightAndArrowUpLeft: ImageVector? = null
