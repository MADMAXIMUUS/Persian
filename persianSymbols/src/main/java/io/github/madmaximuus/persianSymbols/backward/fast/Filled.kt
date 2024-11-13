package io.github.madmaximuus.persianSymbols.backward.fast

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BackwardFast: ImageVector
    get() {
        if (backwardFast != null) {
            return backwardFast!!
        }
        backwardFast = ImageVector.Builder(
            name = "backward-fast-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.499f, 7f)
                curveTo(4.499f, 6.448f, 4.051f, 6f, 3.499f, 6f)
                curveTo(2.946f, 6f, 2.499f, 6.448f, 2.499f, 7f)
                verticalLineTo(17f)
                curveTo(2.499f, 17.552f, 2.946f, 18f, 3.499f, 18f)
                curveTo(4.051f, 18f, 4.499f, 17.552f, 4.499f, 17f)
                verticalLineTo(13.168f)
                lineTo(11.43f, 17.354f)
                curveTo(12.096f, 17.757f, 12.947f, 17.277f, 12.947f, 16.498f)
                verticalLineTo(13.104f)
                lineTo(19.984f, 17.354f)
                curveTo(20.651f, 17.757f, 21.501f, 17.277f, 21.501f, 16.498f)
                verticalLineTo(7.502f)
                curveTo(21.501f, 6.723f, 20.651f, 6.243f, 19.984f, 6.646f)
                lineTo(12.947f, 10.896f)
                verticalLineTo(7.502f)
                curveTo(12.947f, 6.723f, 12.096f, 6.243f, 11.43f, 6.646f)
                lineTo(4.499f, 10.832f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        return backwardFast!!
    }

private var backwardFast: ImageVector? = null