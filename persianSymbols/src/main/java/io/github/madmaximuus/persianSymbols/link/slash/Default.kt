package io.github.madmaximuus.persianSymbols.link.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.LinkSlash: ImageVector
    get() {
        if (linkSlash != null) {
            return linkSlash!!
        }
        linkSlash = Builder(
            name = "link-slash-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 12f)
                curveTo(2f, 9.954f, 3.025f, 8.146f, 4.589f, 7.063f)
                lineTo(6.038f, 8.513f)
                curveTo(4.822f, 9.199f, 4f, 10.504f, 4f, 12f)
                curveTo(4f, 14.209f, 5.791f, 16f, 8f, 16f)
                horizontalLineTo(10f)
                curveTo(10.552f, 16f, 11f, 16.448f, 11f, 17f)
                curveTo(11f, 17.552f, 10.552f, 18f, 10f, 18f)
                horizontalLineTo(8f)
                curveTo(4.686f, 18f, 2f, 15.314f, 2f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 11.25f)
                horizontalLineTo(8.775f)
                lineTo(10.275f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.086f, 12.75f, 7.75f, 12.414f, 7.75f, 12f)
                curveTo(7.75f, 11.586f, 8.086f, 11.25f, 8.5f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.725f, 11.25f)
                lineTo(15.225f, 12.75f)
                horizontalLineTo(15.5f)
                curveTo(15.914f, 12.75f, 16.25f, 12.414f, 16.25f, 12f)
                curveTo(16.25f, 11.586f, 15.914f, 11.25f, 15.5f, 11.25f)
                horizontalLineTo(13.725f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 17f)
                curveTo(13f, 16.588f, 13.25f, 16.234f, 13.606f, 16.081f)
                lineTo(15.525f, 18f)
                horizontalLineTo(14f)
                curveTo(13.448f, 18f, 13f, 17.552f, 13f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.962f, 15.487f)
                lineTo(19.411f, 16.937f)
                curveTo(20.976f, 15.854f, 22f, 14.046f, 22f, 12f)
                curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
                horizontalLineTo(14f)
                curveTo(13.448f, 6f, 13f, 6.448f, 13f, 7f)
                curveTo(13f, 7.552f, 13.448f, 8f, 14f, 8f)
                horizontalLineTo(16f)
                curveTo(18.209f, 8f, 20f, 9.791f, 20f, 12f)
                curveTo(20f, 13.496f, 19.178f, 14.801f, 17.962f, 15.487f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.475f, 6f)
                lineTo(10.394f, 7.919f)
                curveTo(10.75f, 7.766f, 11f, 7.412f, 11f, 7f)
                curveTo(11f, 6.448f, 10.552f, 6f, 10f, 6f)
                horizontalLineTo(8.475f)
                close()
            }
        }.build()
        return linkSlash!!
    }

private var linkSlash: ImageVector? = null