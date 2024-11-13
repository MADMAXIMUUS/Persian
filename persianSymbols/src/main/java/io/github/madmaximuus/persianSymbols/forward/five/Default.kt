package io.github.madmaximuus.persianSymbols.forward.five

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Forward5: ImageVector
    get() {
        if (forward5 != null) {
            return forward5!!
        }
        forward5 = Builder(
            name = "forward-5-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.567f, 1.321f)
                curveTo(11.192f, 1.726f, 11.216f, 2.358f, 11.621f, 2.734f)
                lineTo(12.449f, 3.5f)
                horizontalLineTo(12f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 11.448f, 20.052f, 11f, 19.5f, 11f)
                curveTo(18.948f, 11f, 18.5f, 11.448f, 18.5f, 12f)
                curveTo(18.5f, 15.59f, 15.59f, 18.5f, 12f, 18.5f)
                curveTo(8.41f, 18.5f, 5.5f, 15.59f, 5.5f, 12f)
                curveTo(5.5f, 8.41f, 8.41f, 5.5f, 12f, 5.5f)
                horizontalLineTo(12.449f)
                lineTo(11.621f, 6.266f)
                curveTo(11.216f, 6.642f, 11.192f, 7.274f, 11.567f, 7.68f)
                curveTo(11.942f, 8.085f, 12.575f, 8.109f, 12.98f, 7.734f)
                lineTo(15.679f, 5.234f)
                curveTo(15.884f, 5.044f, 16f, 4.779f, 16f, 4.5f)
                curveTo(16f, 4.221f, 15.884f, 3.956f, 15.679f, 3.766f)
                lineTo(12.98f, 1.266f)
                curveTo(12.575f, 0.891f, 11.942f, 0.915f, 11.567f, 1.321f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.515f, 8.998f)
                curveTo(10.135f, 8.998f, 9.815f, 9.283f, 9.77f, 9.661f)
                lineTo(9.402f, 12.791f)
                curveTo(9.362f, 13.135f, 9.562f, 13.462f, 9.888f, 13.583f)
                curveTo(10.213f, 13.702f, 10.578f, 13.584f, 10.77f, 13.296f)
                curveTo(11.001f, 12.951f, 11.39f, 12.728f, 11.828f, 12.728f)
                curveTo(12.529f, 12.728f, 13.103f, 13.3f, 13.103f, 14.013f)
                curveTo(13.103f, 14.727f, 12.529f, 15.298f, 11.828f, 15.298f)
                curveTo(11.39f, 15.298f, 11.001f, 15.075f, 10.77f, 14.73f)
                curveTo(10.54f, 14.386f, 10.074f, 14.294f, 9.73f, 14.524f)
                curveTo(9.386f, 14.754f, 9.293f, 15.22f, 9.524f, 15.564f)
                curveTo(10.02f, 16.306f, 10.866f, 16.798f, 11.828f, 16.798f)
                curveTo(13.364f, 16.798f, 14.603f, 15.548f, 14.603f, 14.013f)
                curveTo(14.603f, 12.479f, 13.364f, 11.228f, 11.828f, 11.228f)
                curveTo(11.571f, 11.228f, 11.321f, 11.263f, 11.085f, 11.329f)
                lineTo(11.182f, 10.498f)
                horizontalLineTo(13.668f)
                curveTo(14.082f, 10.498f, 14.418f, 10.163f, 14.418f, 9.748f)
                curveTo(14.418f, 9.334f, 14.082f, 8.998f, 13.668f, 8.998f)
                horizontalLineTo(10.515f)
                close()
            }
        }.build()
        return forward5!!
    }

private var forward5: ImageVector? = null