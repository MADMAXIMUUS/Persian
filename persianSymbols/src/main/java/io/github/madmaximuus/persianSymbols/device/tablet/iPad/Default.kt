package io.github.madmaximuus.persianSymbols.device.tablet.iPad

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceTabletIPad: ImageVector
    get() {
        if (deviceTabletIPad != null) {
            return deviceTabletIPad!!
        }
        deviceTabletIPad = Builder(
            name = "device-tablet-ipad-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.75f, 19.5f)
                curveTo(8.75f, 19.362f, 8.862f, 19.25f, 9f, 19.25f)
                horizontalLineTo(15f)
                curveTo(15.138f, 19.25f, 15.25f, 19.362f, 15.25f, 19.5f)
                curveTo(15.25f, 19.638f, 15.138f, 19.75f, 15f, 19.75f)
                horizontalLineTo(9f)
                curveTo(8.862f, 19.75f, 8.75f, 19.638f, 8.75f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.915f, 8.726f)
                curveTo(14.438f, 8.203f, 14.696f, 7.547f, 14.645f, 7.006f)
                curveTo(14.104f, 6.955f, 13.448f, 7.213f, 12.925f, 7.736f)
                curveTo(12.401f, 8.26f, 12.144f, 8.916f, 12.195f, 9.456f)
                curveTo(12.735f, 9.508f, 13.392f, 9.25f, 13.915f, 8.726f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.125f, 16.525f)
                curveTo(11.431f, 16.525f, 11.723f, 16.468f, 11.992f, 16.365f)
                curveTo(12.142f, 16.308f, 12.308f, 16.308f, 12.458f, 16.365f)
                curveTo(12.727f, 16.468f, 13.019f, 16.525f, 13.325f, 16.525f)
                curveTo(13.954f, 16.525f, 14.527f, 15.852f, 14.958f, 15f)
                curveTo(15.09f, 14.739f, 15.209f, 14.46f, 15.312f, 14.179f)
                curveTo(14.631f, 13.906f, 14.15f, 13.24f, 14.15f, 12.461f)
                curveTo(14.15f, 11.683f, 14.63f, 11.017f, 15.311f, 10.744f)
                curveTo(14.872f, 10.12f, 14.146f, 9.711f, 13.325f, 9.711f)
                curveTo(13.019f, 9.711f, 12.727f, 9.768f, 12.458f, 9.871f)
                curveTo(12.308f, 9.928f, 12.142f, 9.928f, 11.992f, 9.871f)
                curveTo(11.723f, 9.768f, 11.431f, 9.711f, 11.125f, 9.711f)
                curveTo(9.786f, 9.711f, 8.7f, 10.797f, 8.7f, 12.136f)
                curveTo(8.7f, 12.847f, 9.005f, 14.038f, 9.492f, 15f)
                curveTo(9.923f, 15.852f, 10.496f, 16.525f, 11.125f, 16.525f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6.5f)
                curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 2f, 20f, 4.015f, 20f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(20f, 19.985f, 17.985f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(8.5f, 4f)
                curveTo(7.119f, 4f, 6f, 5.119f, 6f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 20f, 18f, 18.881f, 18f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(18f, 5.119f, 16.881f, 4f, 15.5f, 4f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        return deviceTabletIPad!!
    }

private var deviceTabletIPad: ImageVector? = null