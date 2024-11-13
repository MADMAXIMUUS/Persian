package io.github.madmaximuus.persianSymbols.newLabel.rectangle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.NewRectangle: ImageVector
    get() {
        if (newRectangle != null) {
            return newRectangle!!
        }
        newRectangle = Builder(
            name = "new-rectangle-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
                moveTo(15.024f, 9.328f)
                curveTo(14.929f, 8.925f, 14.525f, 8.675f, 14.122f, 8.77f)
                curveTo(13.719f, 8.865f, 13.469f, 9.269f, 13.564f, 9.672f)
                lineTo(14.74f, 14.672f)
                curveTo(14.82f, 15.01f, 15.122f, 15.25f, 15.47f, 15.25f)
                curveTo(15.818f, 15.25f, 16.121f, 15.011f, 16.2f, 14.672f)
                lineTo(16.647f, 12.774f)
                lineTo(17.093f, 14.672f)
                curveTo(17.173f, 15.01f, 17.475f, 15.25f, 17.823f, 15.25f)
                curveTo(18.171f, 15.25f, 18.474f, 15.011f, 18.553f, 14.672f)
                lineTo(19.73f, 9.672f)
                curveTo(19.825f, 9.269f, 19.575f, 8.865f, 19.172f, 8.77f)
                curveTo(18.768f, 8.675f, 18.365f, 8.925f, 18.27f, 9.328f)
                lineTo(17.824f, 11.224f)
                lineTo(17.378f, 9.328f)
                curveTo(17.299f, 8.99f, 16.997f, 8.75f, 16.648f, 8.75f)
                curveTo(16.3f, 8.75f, 15.998f, 8.989f, 15.918f, 9.328f)
                lineTo(15.471f, 11.227f)
                lineTo(15.024f, 9.328f)
                close()
                moveTo(9.55f, 9.5f)
                curveTo(9.55f, 9.086f, 9.886f, 8.75f, 10.3f, 8.75f)
                horizontalLineTo(12.52f)
                curveTo(12.934f, 8.75f, 13.27f, 9.086f, 13.27f, 9.5f)
                curveTo(13.27f, 9.914f, 12.934f, 10.25f, 12.52f, 10.25f)
                horizontalLineTo(11.05f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.212f)
                curveTo(12.626f, 11.25f, 12.962f, 11.586f, 12.962f, 12f)
                curveTo(12.962f, 12.414f, 12.626f, 12.75f, 12.212f, 12.75f)
                horizontalLineTo(11.05f)
                verticalLineTo(13.75f)
                horizontalLineTo(12.52f)
                curveTo(12.934f, 13.75f, 13.27f, 14.086f, 13.27f, 14.5f)
                curveTo(13.27f, 14.914f, 12.934f, 15.25f, 12.52f, 15.25f)
                horizontalLineTo(10.3f)
                curveTo(9.886f, 15.25f, 9.55f, 14.914f, 9.55f, 14.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(6.079f, 9.148f)
                curveTo(5.917f, 8.844f, 5.569f, 8.689f, 5.235f, 8.772f)
                curveTo(4.901f, 8.855f, 4.667f, 9.156f, 4.667f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(4.667f, 14.914f, 5.002f, 15.25f, 5.417f, 15.25f)
                curveTo(5.831f, 15.25f, 6.167f, 14.914f, 6.167f, 14.5f)
                verticalLineTo(12.509f)
                lineTo(7.411f, 14.852f)
                curveTo(7.573f, 15.156f, 7.921f, 15.311f, 8.255f, 15.228f)
                curveTo(8.589f, 15.144f, 8.824f, 14.844f, 8.824f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(8.824f, 9.086f, 8.488f, 8.75f, 8.074f, 8.75f)
                curveTo(7.659f, 8.75f, 7.324f, 9.086f, 7.324f, 9.5f)
                verticalLineTo(11.49f)
                lineTo(6.079f, 9.148f)
                close()
            }
        }.build()
        return newRectangle!!
    }

private var newRectangle: ImageVector? = null