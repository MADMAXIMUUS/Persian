package io.github.madmaximuus.persianSymbols.backward.ten

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Backward10: ImageVector
    get() {
        if (backward10 != null) {
            return backward10!!
        }
        backward10 = Builder(
            name = "backward-10-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.379f, 2.734f)
                curveTo(12.784f, 2.358f, 12.808f, 1.726f, 12.433f, 1.321f)
                curveTo(12.058f, 0.915f, 11.425f, 0.891f, 11.02f, 1.266f)
                lineTo(8.321f, 3.766f)
                curveTo(8.116f, 3.956f, 8f, 4.221f, 8f, 4.5f)
                curveTo(8f, 4.779f, 8.116f, 5.044f, 8.321f, 5.234f)
                lineTo(11.02f, 7.734f)
                curveTo(11.425f, 8.109f, 12.058f, 8.085f, 12.433f, 7.68f)
                curveTo(12.808f, 7.274f, 12.784f, 6.642f, 12.379f, 6.266f)
                lineTo(11.551f, 5.5f)
                horizontalLineTo(12f)
                curveTo(15.59f, 5.5f, 18.5f, 8.41f, 18.5f, 12f)
                curveTo(18.5f, 15.59f, 15.59f, 18.5f, 12f, 18.5f)
                curveTo(8.41f, 18.5f, 5.5f, 15.59f, 5.5f, 12f)
                curveTo(5.5f, 11.448f, 5.052f, 11f, 4.5f, 11f)
                curveTo(3.948f, 11f, 3.5f, 11.448f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                horizontalLineTo(11.551f)
                lineTo(12.379f, 2.734f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.013f, 8.89f)
                curveTo(10.299f, 9.003f, 10.487f, 9.28f, 10.487f, 9.588f)
                verticalLineTo(15.887f)
                curveTo(10.487f, 16.302f, 10.151f, 16.638f, 9.737f, 16.638f)
                curveTo(9.323f, 16.638f, 8.987f, 16.302f, 8.987f, 15.887f)
                verticalLineTo(11.483f)
                lineTo(8.547f, 11.952f)
                curveTo(8.264f, 12.254f, 7.789f, 12.269f, 7.487f, 11.986f)
                curveTo(7.185f, 11.702f, 7.17f, 11.228f, 7.453f, 10.926f)
                lineTo(9.19f, 9.074f)
                curveTo(9.401f, 8.85f, 9.727f, 8.777f, 10.013f, 8.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 11.629f)
                curveTo(12.75f, 10.849f, 13.309f, 10.341f, 13.853f, 10.341f)
                curveTo(14.396f, 10.341f, 14.956f, 10.849f, 14.956f, 11.629f)
                horizontalLineTo(16.456f)
                curveTo(16.456f, 10.158f, 15.356f, 8.841f, 13.853f, 8.841f)
                curveTo(12.35f, 8.841f, 11.25f, 10.158f, 11.25f, 11.629f)
                horizontalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 13.853f)
                verticalLineTo(11.629f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.853f)
                curveTo(11.25f, 15.324f, 12.35f, 16.641f, 13.853f, 16.641f)
                curveTo(15.356f, 16.641f, 16.456f, 15.324f, 16.456f, 13.853f)
                verticalLineTo(11.629f)
                horizontalLineTo(14.956f)
                verticalLineTo(13.853f)
                curveTo(14.956f, 14.633f, 14.396f, 15.141f, 13.853f, 15.141f)
                curveTo(13.309f, 15.141f, 12.75f, 14.633f, 12.75f, 13.853f)
                close()
            }
        }.build()
        return backward10!!
    }

private var backward10: ImageVector? = null