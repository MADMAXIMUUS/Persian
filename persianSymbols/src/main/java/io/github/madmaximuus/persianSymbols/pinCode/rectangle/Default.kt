package io.github.madmaximuus.persianSymbols.pinCode.rectangle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PinCodeRectangle: ImageVector
    get() {
        if (pinCodeRectangle != null) {
            return pinCodeRectangle!!
        }
        pinCodeRectangle = Builder(
            name = "pin-code-rectangle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.784f, 10.25f)
                curveTo(16.424f, 10.25f, 16.114f, 10.469f, 15.983f, 10.783f)
                curveTo(15.823f, 11.166f, 15.384f, 11.346f, 15.002f, 11.186f)
                curveTo(14.619f, 11.026f, 14.439f, 10.587f, 14.599f, 10.205f)
                curveTo(14.955f, 9.352f, 15.799f, 8.75f, 16.784f, 8.75f)
                curveTo(17.653f, 8.75f, 18.764f, 9.239f, 19.009f, 10.33f)
                curveTo(19.113f, 10.793f, 19.056f, 11.217f, 18.875f, 11.578f)
                curveTo(18.793f, 11.74f, 18.692f, 11.878f, 18.584f, 11.995f)
                curveTo(18.692f, 12.11f, 18.792f, 12.245f, 18.874f, 12.402f)
                curveTo(19.06f, 12.759f, 19.122f, 13.18f, 19.02f, 13.641f)
                lineTo(19.02f, 13.643f)
                curveTo(18.777f, 14.732f, 17.68f, 15.25f, 16.784f, 15.25f)
                curveTo(15.784f, 15.25f, 14.93f, 14.63f, 14.583f, 13.756f)
                curveTo(14.43f, 13.371f, 14.618f, 12.935f, 15.003f, 12.782f)
                curveTo(15.388f, 12.629f, 15.824f, 12.818f, 15.977f, 13.202f)
                curveTo(16.105f, 13.524f, 16.419f, 13.75f, 16.784f, 13.75f)
                curveTo(17.253f, 13.75f, 17.518f, 13.483f, 17.556f, 13.317f)
                curveTo(17.584f, 13.186f, 17.56f, 13.126f, 17.544f, 13.095f)
                curveTo(17.519f, 13.048f, 17.466f, 12.986f, 17.367f, 12.921f)
                curveTo(17.269f, 12.856f, 17.156f, 12.807f, 17.059f, 12.774f)
                lineTo(16.928f, 12.735f)
                lineTo(16.926f, 12.734f)
                curveTo(16.578f, 12.663f, 16.328f, 12.356f, 16.328f, 12f)
                curveTo(16.328f, 11.644f, 16.578f, 11.337f, 16.926f, 11.266f)
                lineTo(17.058f, 11.227f)
                curveTo(17.153f, 11.194f, 17.264f, 11.145f, 17.361f, 11.08f)
                curveTo(17.458f, 11.014f, 17.51f, 10.953f, 17.535f, 10.904f)
                curveTo(17.552f, 10.869f, 17.577f, 10.802f, 17.545f, 10.658f)
                curveTo(17.513f, 10.514f, 17.26f, 10.25f, 16.784f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.317f, 10.25f)
                curveTo(10.838f, 10.25f, 10.45f, 10.638f, 10.45f, 11.118f)
                curveTo(10.45f, 11.532f, 10.114f, 11.868f, 9.7f, 11.868f)
                curveTo(9.286f, 11.868f, 8.95f, 11.532f, 8.95f, 11.118f)
                curveTo(8.95f, 9.81f, 10.009f, 8.75f, 11.317f, 8.75f)
                curveTo(12.624f, 8.75f, 13.684f, 9.81f, 13.684f, 11.118f)
                curveTo(13.684f, 11.81f, 13.34f, 12.33f, 12.949f, 12.707f)
                curveTo(12.572f, 13.069f, 12.092f, 13.355f, 11.695f, 13.585f)
                lineTo(11.411f, 13.75f)
                horizontalLineTo(13.082f)
                curveTo(13.497f, 13.75f, 13.832f, 14.086f, 13.832f, 14.5f)
                curveTo(13.832f, 14.914f, 13.497f, 15.25f, 13.082f, 15.25f)
                horizontalLineTo(9.703f)
                curveTo(9.289f, 15.25f, 8.953f, 14.914f, 8.953f, 14.5f)
                curveTo(8.953f, 13.828f, 9.368f, 13.363f, 9.732f, 13.064f)
                curveTo(10.052f, 12.801f, 10.459f, 12.567f, 10.807f, 12.366f)
                curveTo(10.853f, 12.34f, 10.898f, 12.314f, 10.942f, 12.288f)
                curveTo(11.353f, 12.05f, 11.68f, 11.845f, 11.909f, 11.625f)
                curveTo(12.123f, 11.419f, 12.184f, 11.264f, 12.184f, 11.118f)
                curveTo(12.184f, 10.638f, 11.795f, 10.25f, 11.317f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.796f, 9.5f)
                curveTo(7.796f, 9.197f, 7.613f, 8.923f, 7.333f, 8.807f)
                curveTo(7.053f, 8.691f, 6.73f, 8.755f, 6.516f, 8.97f)
                lineTo(5.047f, 10.439f)
                curveTo(4.754f, 10.732f, 4.754f, 11.207f, 5.047f, 11.5f)
                curveTo(5.339f, 11.793f, 5.814f, 11.793f, 6.107f, 11.5f)
                lineTo(6.296f, 11.311f)
                verticalLineTo(14.5f)
                curveTo(6.296f, 14.914f, 6.632f, 15.25f, 7.046f, 15.25f)
                curveTo(7.46f, 15.25f, 7.796f, 14.914f, 7.796f, 14.5f)
                verticalLineTo(9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
                moveTo(4f, 8.4f)
                curveTo(4f, 7.075f, 5.074f, 6f, 6.4f, 6f)
                horizontalLineTo(17.6f)
                curveTo(18.925f, 6f, 20f, 7.075f, 20f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(20f, 16.926f, 18.925f, 18f, 17.6f, 18f)
                horizontalLineTo(6.4f)
                curveTo(5.074f, 18f, 4f, 16.926f, 4f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
        }.build()
        return pinCodeRectangle!!
    }

private var pinCodeRectangle: ImageVector? = null