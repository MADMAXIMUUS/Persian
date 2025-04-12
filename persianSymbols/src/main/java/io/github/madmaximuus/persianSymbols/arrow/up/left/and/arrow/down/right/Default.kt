package io.github.madmaximuus.persianSymbols.arrow.up.left.and.arrow.down.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowUpLeftAndArrowDownRight: ImageVector
    get() {
        if (arrowUpLeftAndArrowDownRight != null) {
            return arrowUpLeftAndArrowDownRight!!
        }
        arrowUpLeftAndArrowDownRight = ImageVector.Builder(
            name = "arrow-up-left-and-arrow-down-right-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.996f, 11.977f)
                curveTo(5.548f, 11.979f, 5.998f, 11.533f, 6f, 10.981f)
                lineTo(6.013f, 7.405f)
                lineTo(9.802f, 11.193f)
                curveTo(10.192f, 11.584f, 10.825f, 11.584f, 11.216f, 11.193f)
                curveTo(11.606f, 10.803f, 11.606f, 10.169f, 11.216f, 9.779f)
                lineTo(7.423f, 5.986f)
                lineTo(11.019f, 6f)
                curveTo(11.571f, 6.002f, 12.021f, 5.556f, 12.023f, 5.004f)
                curveTo(12.025f, 4.451f, 11.579f, 4.002f, 11.026f, 4f)
                lineTo(5.026f, 3.977f)
                curveTo(4.474f, 3.975f, 4.025f, 4.421f, 4.023f, 4.973f)
                lineTo(4f, 10.973f)
                curveTo(3.998f, 11.526f, 4.444f, 11.975f, 4.996f, 11.977f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.023f, 12f)
                curveTo(18.471f, 12f, 18.023f, 12.448f, 18.023f, 13f)
                verticalLineTo(16.586f)
                lineTo(14.228f, 12.791f)
                curveTo(13.837f, 12.4f, 13.204f, 12.4f, 12.814f, 12.791f)
                curveTo(12.423f, 13.181f, 12.423f, 13.814f, 12.814f, 14.205f)
                lineTo(16.609f, 18f)
                horizontalLineTo(13.023f)
                curveTo(12.471f, 18f, 12.023f, 18.448f, 12.023f, 19f)
                curveTo(12.023f, 19.552f, 12.471f, 20f, 13.023f, 20f)
                horizontalLineTo(19.007f)
                curveTo(19.266f, 20.004f, 19.525f, 19.908f, 19.724f, 19.713f)
                curveTo(19.735f, 19.702f, 19.747f, 19.69f, 19.758f, 19.678f)
                curveTo(19.822f, 19.609f, 19.875f, 19.532f, 19.915f, 19.452f)
                curveTo(19.984f, 19.316f, 20.023f, 19.163f, 20.023f, 19f)
                verticalLineTo(13f)
                curveTo(20.023f, 12.448f, 19.575f, 12f, 19.023f, 12f)
                close()
            }
        }.build()

        return arrowUpLeftAndArrowDownRight!!
    }

@Suppress("ObjectPropertyName")
private var arrowUpLeftAndArrowDownRight: ImageVector? = null
