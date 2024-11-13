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
                moveTo(12f, 4f)
                curveTo(10.431f, 4f, 8.967f, 4.452f, 7.732f, 5.232f)
                lineTo(6.29f, 3.79f)
                curveTo(7.909f, 2.662f, 9.877f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 14.123f, 21.338f, 16.091f, 20.21f, 17.71f)
                lineTo(18.768f, 16.268f)
                curveTo(19.549f, 15.033f, 20f, 13.569f, 20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.79f, 6.29f)
                lineTo(5.232f, 7.732f)
                curveTo(4.452f, 8.967f, 4f, 10.431f, 4f, 12f)
                curveTo(4f, 14.207f, 4.892f, 16.203f, 6.337f, 17.651f)
                curveTo(6.728f, 18.042f, 6.727f, 18.675f, 6.336f, 19.065f)
                curveTo(5.945f, 19.455f, 5.312f, 19.455f, 4.922f, 19.064f)
                curveTo(3.117f, 17.256f, 2f, 14.757f, 2f, 12f)
                curveTo(2f, 9.877f, 2.662f, 7.909f, 3.79f, 6.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.212f, 10.712f)
                lineTo(6.695f, 9.195f)
                curveTo(6.251f, 10.032f, 6f, 10.987f, 6f, 12f)
                curveTo(6f, 13.661f, 6.676f, 15.166f, 7.766f, 16.252f)
                curveTo(8.158f, 16.641f, 8.791f, 16.64f, 9.181f, 16.249f)
                curveTo(9.57f, 15.857f, 9.569f, 15.224f, 9.178f, 14.835f)
                curveTo(8.449f, 14.109f, 8f, 13.108f, 8f, 12f)
                curveTo(8f, 11.549f, 8.075f, 11.116f, 8.212f, 10.712f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.195f, 6.695f)
                lineTo(10.712f, 8.212f)
                curveTo(11.116f, 8.075f, 11.549f, 8f, 12f, 8f)
                curveTo(14.209f, 8f, 16f, 9.791f, 16f, 12f)
                curveTo(16f, 12.451f, 15.926f, 12.884f, 15.788f, 13.288f)
                lineTo(17.305f, 14.805f)
                curveTo(17.749f, 13.968f, 18f, 13.013f, 18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(10.987f, 6f, 10.032f, 6.251f, 9.195f, 6.695f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.088f, 12.588f)
                curveTo(10.282f, 13.22f, 10.78f, 13.718f, 11.412f, 13.912f)
                lineTo(10.088f, 12.588f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.912f, 11.412f)
                lineTo(12.588f, 10.088f)
                curveTo(13.22f, 10.282f, 13.718f, 10.78f, 13.912f, 11.412f)
                close()
            }
        }.build()
        return signalStreamSlash!!
    }

private var signalStreamSlash: ImageVector? = null