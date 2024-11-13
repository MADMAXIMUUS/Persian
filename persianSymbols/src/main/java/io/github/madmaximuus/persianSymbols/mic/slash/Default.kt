package io.github.madmaximuus.persianSymbols.mic.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MicSlash: ImageVector
    get() {
        if (micSlash != null) {
            return micSlash!!
        }
        micSlash = Builder(
            name = "mic-slash-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5f)
                curveTo(8f, 3.343f, 9.343f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(14.657f, 2f, 16f, 3.343f, 16f, 5f)
                verticalLineTo(11f)
                curveTo(16f, 11.701f, 15.759f, 12.346f, 15.357f, 12.857f)
                lineTo(13.912f, 11.412f)
                curveTo(13.968f, 11.286f, 14f, 11.147f, 14f, 11f)
                verticalLineTo(5f)
                curveTo(14f, 4.448f, 13.552f, 4f, 13f, 4f)
                horizontalLineTo(11f)
                curveTo(10.448f, 4f, 10f, 4.448f, 10f, 5f)
                verticalLineTo(7.5f)
                lineTo(8f, 5.5f)
                verticalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 10.5f)
                lineTo(11.5f, 14f)
                horizontalLineTo(11f)
                curveTo(9.343f, 14f, 8f, 12.657f, 8f, 11f)
                verticalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.477f, 16.978f)
                lineTo(12.5f, 15f)
                horizontalLineTo(10f)
                curveTo(8.343f, 15f, 7f, 13.657f, 7f, 12f)
                curveTo(7f, 11.448f, 6.552f, 11f, 6f, 11f)
                curveTo(5.448f, 11f, 5f, 11.448f, 5f, 12f)
                curveTo(5f, 14.761f, 7.238f, 17f, 10f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                curveTo(7.448f, 20f, 7f, 20.448f, 7f, 21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16.552f, 22f, 17f, 21.552f, 17f, 21f)
                curveTo(17f, 20.448f, 16.552f, 20f, 16f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                curveTo(14.161f, 17f, 14.32f, 16.992f, 14.477f, 16.978f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.357f, 13.857f)
                lineTo(17.777f, 15.277f)
                curveTo(18.539f, 14.399f, 19f, 13.253f, 19f, 12f)
                curveTo(19f, 11.448f, 18.552f, 11f, 18f, 11f)
                curveTo(17.448f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.701f, 16.759f, 13.346f, 16.357f, 13.857f)
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
        return micSlash!!
    }

private var micSlash: ImageVector? = null