package io.github.madmaximuus.persianSymbols.headphones

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Headphones: ImageVector
    get() {
        if (headphones != null) {
            return headphones!!
        }
        headphones = ImageVector.Builder(
            name = "headphones-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(7.582f, 4f, 4f, 7.582f, 4f, 12f)
                verticalLineTo(12.796f)
                lineTo(6.278f, 12.278f)
                curveTo(6.904f, 12.136f, 7.5f, 12.611f, 7.5f, 13.253f)
                verticalLineTo(20.748f)
                curveTo(7.5f, 21.389f, 6.904f, 21.865f, 6.279f, 21.723f)
                lineTo(3.557f, 21.104f)
                curveTo(2.646f, 20.897f, 2f, 20.088f, 2f, 19.154f)
                verticalLineTo(19.016f)
                lineTo(2f, 19f)
                verticalLineTo(12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                verticalLineTo(19.154f)
                curveTo(22f, 20.088f, 21.354f, 20.897f, 20.443f, 21.104f)
                lineTo(17.722f, 21.723f)
                curveTo(17.096f, 21.865f, 16.5f, 21.389f, 16.5f, 20.747f)
                verticalLineTo(13.253f)
                curveTo(16.5f, 12.611f, 17.096f, 12.136f, 17.722f, 12.278f)
                lineTo(20f, 12.796f)
                verticalLineTo(12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return headphones!!
    }

private var headphones: ImageVector? = null