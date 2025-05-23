package io.github.madmaximuus.persianSymbols.device.tablet.android

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceTabletAndroid: ImageVector
    get() {
        if (deviceTabletAndroid != null) {
            return deviceTabletAndroid!!
        }
        deviceTabletAndroid = Builder(
            name = "device-tablet-android-default",
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.104f, 9.386f)
                curveTo(9.061f, 9.316f, 8.969f, 9.293f, 8.898f, 9.336f)
                curveTo(8.828f, 9.379f, 8.805f, 9.471f, 8.848f, 9.542f)
                lineTo(9.622f, 10.819f)
                curveTo(8.638f, 11.547f, 8f, 12.717f, 8f, 14.036f)
                horizontalLineTo(16f)
                curveTo(16f, 12.717f, 15.362f, 11.547f, 14.378f, 10.819f)
                lineTo(15.152f, 9.542f)
                curveTo(15.195f, 9.471f, 15.172f, 9.379f, 15.102f, 9.336f)
                curveTo(15.031f, 9.293f, 14.939f, 9.316f, 14.896f, 9.386f)
                lineTo(14.13f, 10.649f)
                curveTo(13.513f, 10.26f, 12.783f, 10.036f, 12f, 10.036f)
                curveTo(11.217f, 10.036f, 10.487f, 10.26f, 9.87f, 10.649f)
                lineTo(9.104f, 9.386f)
                close()
                moveTo(13.881f, 13.226f)
                curveTo(13.552f, 13.226f, 13.286f, 12.96f, 13.286f, 12.631f)
                curveTo(13.286f, 12.302f, 13.552f, 12.036f, 13.881f, 12.036f)
                curveTo(14.21f, 12.036f, 14.476f, 12.302f, 14.476f, 12.631f)
                curveTo(14.476f, 12.96f, 14.21f, 13.226f, 13.881f, 13.226f)
                close()
                moveTo(9.524f, 12.631f)
                curveTo(9.524f, 12.96f, 9.79f, 13.226f, 10.119f, 13.226f)
                curveTo(10.448f, 13.226f, 10.714f, 12.96f, 10.714f, 12.631f)
                curveTo(10.714f, 12.302f, 10.448f, 12.036f, 10.119f, 12.036f)
                curveTo(9.79f, 12.036f, 9.524f, 12.302f, 9.524f, 12.631f)
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
        return deviceTabletAndroid!!
    }

private var deviceTabletAndroid: ImageVector? = null