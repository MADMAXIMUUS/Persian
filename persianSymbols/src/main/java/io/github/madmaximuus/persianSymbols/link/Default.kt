package io.github.madmaximuus.persianSymbols.link

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Link: ImageVector
    get() {
        if (link != null) {
            return link!!
        }
        link = Builder(
            name = "link-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 9.791f, 5.791f, 8f, 8f, 8f)
                horizontalLineTo(10f)
                curveTo(10.552f, 8f, 11f, 7.552f, 11f, 7f)
                curveTo(11f, 6.448f, 10.552f, 6f, 10f, 6f)
                horizontalLineTo(8f)
                curveTo(4.686f, 6f, 2f, 8.686f, 2f, 12f)
                curveTo(2f, 15.314f, 4.686f, 18f, 8f, 18f)
                horizontalLineTo(10f)
                curveTo(10.552f, 18f, 11f, 17.552f, 11f, 17f)
                curveTo(11f, 16.448f, 10.552f, 16f, 10f, 16f)
                horizontalLineTo(8f)
                curveTo(5.791f, 16f, 4f, 14.209f, 4f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 7f)
                curveTo(13f, 6.448f, 13.448f, 6f, 14f, 6f)
                horizontalLineTo(16f)
                curveTo(19.314f, 6f, 22f, 8.686f, 22f, 12f)
                curveTo(22f, 15.314f, 19.314f, 18f, 16f, 18f)
                horizontalLineTo(14f)
                curveTo(13.448f, 18f, 13f, 17.552f, 13f, 17f)
                curveTo(13f, 16.448f, 13.448f, 16f, 14f, 16f)
                horizontalLineTo(16f)
                curveTo(18.209f, 16f, 20f, 14.209f, 20f, 12f)
                curveTo(20f, 9.791f, 18.209f, 8f, 16f, 8f)
                horizontalLineTo(14f)
                curveTo(13.448f, 8f, 13f, 7.552f, 13f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 12f)
                curveTo(7.75f, 11.586f, 8.086f, 11.25f, 8.5f, 11.25f)
                horizontalLineTo(15.5f)
                curveTo(15.914f, 11.25f, 16.25f, 11.586f, 16.25f, 12f)
                curveTo(16.25f, 12.414f, 15.914f, 12.75f, 15.5f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.086f, 12.75f, 7.75f, 12.414f, 7.75f, 12f)
                close()
            }
        }.build()
        return link!!
    }

private var link: ImageVector? = null