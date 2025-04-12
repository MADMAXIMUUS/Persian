package io.github.madmaximuus.persianSymbols.sigmal.stream.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.SignalStreamSlash: ImageVector
    get() {
        if (signalStreamSlash != null) {
            return signalStreamSlash!!
        }
        signalStreamSlash = Builder(
            name = "signal-stream-slash-default",
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
                curveTo(2f, 9.871f, 2.666f, 7.897f, 3.8f, 6.275f)
                lineTo(5.242f, 7.717f)
                curveTo(4.455f, 8.955f, 4f, 10.424f, 4f, 12f)
                curveTo(4f, 14.207f, 4.892f, 16.203f, 6.337f, 17.651f)
                curveTo(6.728f, 18.042f, 6.727f, 18.675f, 6.336f, 19.065f)
                curveTo(5.945f, 19.455f, 5.312f, 19.455f, 4.922f, 19.064f)
                curveTo(3.117f, 17.256f, 2f, 14.757f, 2f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 12f)
                curveTo(6f, 10.98f, 6.255f, 10.019f, 6.704f, 9.178f)
                lineTo(8.218f, 10.693f)
                curveTo(8.077f, 11.103f, 8f, 11.542f, 8f, 12f)
                curveTo(8f, 13.108f, 8.449f, 14.109f, 9.178f, 14.835f)
                curveTo(9.569f, 15.224f, 9.57f, 15.857f, 9.181f, 16.249f)
                curveTo(8.791f, 16.64f, 8.158f, 16.641f, 7.766f, 16.252f)
                curveTo(6.676f, 15.166f, 6f, 13.661f, 6f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.178f, 6.704f)
                lineTo(10.693f, 8.218f)
                curveTo(11.103f, 8.077f, 11.542f, 8f, 12f, 8f)
                curveTo(14.209f, 8f, 16f, 9.791f, 16f, 12f)
                curveTo(16f, 12.458f, 15.923f, 12.898f, 15.782f, 13.307f)
                lineTo(17.296f, 14.821f)
                curveTo(17.745f, 13.98f, 18f, 13.02f, 18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(10.98f, 6f, 10.019f, 6.255f, 9.178f, 6.704f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.077f, 12.552f)
                curveTo(10.267f, 13.213f, 10.787f, 13.733f, 11.448f, 13.923f)
                lineTo(10.077f, 12.552f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.552f, 10.077f)
                lineTo(13.923f, 11.448f)
                curveTo(13.733f, 10.787f, 13.213f, 10.267f, 12.552f, 10.077f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12f)
                curveTo(22f, 14.129f, 21.334f, 16.104f, 20.2f, 17.725f)
                lineTo(18.758f, 16.283f)
                curveTo(19.545f, 15.045f, 20f, 13.576f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                curveTo(10.424f, 4f, 8.955f, 4.455f, 7.717f, 5.242f)
                lineTo(6.275f, 3.8f)
                curveTo(7.897f, 2.666f, 9.871f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
            }
        }.build()
        return signalStreamSlash!!
    }

private var signalStreamSlash: ImageVector? = null