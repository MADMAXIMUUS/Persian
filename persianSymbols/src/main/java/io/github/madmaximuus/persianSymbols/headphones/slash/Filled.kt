package io.github.madmaximuus.persianSymbols.headphones.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.HeadphonesSlash: ImageVector
    get() {
        if (headphonesSlash != null) {
            return headphonesSlash!!
        }
        headphonesSlash = ImageVector.Builder(
            name = "headphones-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(10.424f, 4f, 8.955f, 4.455f, 7.717f, 5.242f)
                lineTo(6.275f, 3.8f)
                curveTo(7.897f, 2.666f, 9.871f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                verticalLineTo(19.154f)
                curveTo(22f, 19.35f, 21.972f, 19.54f, 21.918f, 19.72f)
                curveTo(21.836f, 19.461f, 21.693f, 19.218f, 21.487f, 19.013f)
                lineTo(16.5f, 14.025f)
                verticalLineTo(13.253f)
                curveTo(16.5f, 12.611f, 17.096f, 12.136f, 17.722f, 12.278f)
                lineTo(20f, 12.796f)
                verticalLineTo(12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.8f, 6.275f)
                lineTo(5.242f, 7.717f)
                curveTo(4.455f, 8.955f, 4f, 10.424f, 4f, 12f)
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
                curveTo(2f, 9.871f, 2.666f, 7.897f, 3.8f, 6.275f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 18.975f)
                lineTo(18.965f, 21.44f)
                lineTo(17.722f, 21.723f)
                curveTo(17.096f, 21.865f, 16.5f, 21.389f, 16.5f, 20.747f)
                verticalLineTo(18.975f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
        }.build()

        return headphonesSlash!!
    }

private var headphonesSlash: ImageVector? = null