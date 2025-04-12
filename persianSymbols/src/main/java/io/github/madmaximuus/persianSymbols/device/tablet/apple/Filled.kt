package io.github.madmaximuus.persianSymbols.device.tablet.apple

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceTabletApple: ImageVector
    get() {
        if (deviceTabletApple != null) {
            return deviceTabletApple!!
        }
        deviceTabletApple = Builder(
            name = "device-tablet-apple-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6.4f)
                curveTo(4f, 3.97f, 5.97f, 2f, 8.4f, 2f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 2f, 20f, 3.97f, 20f, 6.4f)
                verticalLineTo(17.6f)
                curveTo(20f, 20.03f, 18.03f, 22f, 15.6f, 22f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22f, 4f, 20.03f, 4f, 17.6f)
                verticalLineTo(6.4f)
                close()
                moveTo(8.75f, 19.5f)
                curveTo(8.75f, 19.362f, 8.862f, 19.25f, 9f, 19.25f)
                horizontalLineTo(15f)
                curveTo(15.138f, 19.25f, 15.25f, 19.362f, 15.25f, 19.5f)
                curveTo(15.25f, 19.638f, 15.138f, 19.75f, 15f, 19.75f)
                horizontalLineTo(9f)
                curveTo(8.862f, 19.75f, 8.75f, 19.638f, 8.75f, 19.5f)
                close()
                moveTo(13.915f, 7.726f)
                curveTo(14.438f, 7.203f, 14.696f, 6.547f, 14.645f, 6.006f)
                curveTo(14.104f, 5.955f, 13.448f, 6.213f, 12.925f, 6.736f)
                curveTo(12.401f, 7.26f, 12.144f, 7.916f, 12.195f, 8.456f)
                curveTo(12.735f, 8.508f, 13.392f, 8.25f, 13.915f, 7.726f)
                close()
                moveTo(11.125f, 15.525f)
                curveTo(11.431f, 15.525f, 11.723f, 15.468f, 11.992f, 15.365f)
                curveTo(12.142f, 15.308f, 12.308f, 15.308f, 12.458f, 15.365f)
                curveTo(12.727f, 15.468f, 13.019f, 15.525f, 13.325f, 15.525f)
                curveTo(13.954f, 15.525f, 14.527f, 14.852f, 14.958f, 14f)
                curveTo(15.09f, 13.739f, 15.209f, 13.46f, 15.312f, 13.179f)
                curveTo(14.631f, 12.906f, 14.15f, 12.24f, 14.15f, 11.461f)
                curveTo(14.15f, 10.683f, 14.63f, 10.017f, 15.311f, 9.744f)
                curveTo(14.872f, 9.12f, 14.146f, 8.711f, 13.325f, 8.711f)
                curveTo(13.019f, 8.711f, 12.727f, 8.768f, 12.458f, 8.871f)
                curveTo(12.308f, 8.928f, 12.142f, 8.928f, 11.992f, 8.871f)
                curveTo(11.723f, 8.768f, 11.431f, 8.711f, 11.125f, 8.711f)
                curveTo(9.786f, 8.711f, 8.7f, 9.797f, 8.7f, 11.136f)
                curveTo(8.7f, 11.847f, 9.005f, 13.038f, 9.492f, 14f)
                curveTo(9.923f, 14.852f, 10.496f, 15.525f, 11.125f, 15.525f)
                close()
            }
        }.build()
        return deviceTabletApple!!
    }

private var deviceTabletApple: ImageVector? = null