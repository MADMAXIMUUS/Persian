package io.github.madmaximuus.persianSymbols.devices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Devices: ImageVector
    get() {
        if (devices != null) {
            return devices!!
        }
        devices = Builder(
            name = "devices-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 16.97f, 2.626f, 18.193f, 3.607f, 19f)
                horizontalLineTo(2.4f)
                curveTo(2.179f, 19f, 2f, 19.179f, 2f, 19.4f)
                verticalLineTo(20f)
                curveTo(2f, 20.552f, 2.448f, 21f, 3f, 21f)
                horizontalLineTo(13.148f)
                curveTo(13.052f, 20.718f, 13f, 20.415f, 13f, 20.1f)
                verticalLineTo(10.7f)
                curveTo(13f, 9.154f, 14.254f, 7.9f, 15.8f, 7.9f)
                horizontalLineTo(20.2f)
                curveTo(20.885f, 7.9f, 21.513f, 8.146f, 22f, 8.555f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 10.85f)
                curveTo(14f, 9.718f, 14.918f, 8.8f, 16.05f, 8.8f)
                horizontalLineTo(19.95f)
                curveTo(21.082f, 8.8f, 22f, 9.718f, 22f, 10.85f)
                verticalLineTo(19.95f)
                curveTo(22f, 21.082f, 21.082f, 22f, 19.95f, 22f)
                horizontalLineTo(16.05f)
                curveTo(14.918f, 22f, 14f, 21.082f, 14f, 19.95f)
                verticalLineTo(10.85f)
                close()
                moveTo(20.5f, 10.85f)
                verticalLineTo(11.3f)
                horizontalLineTo(15.5f)
                verticalLineTo(10.85f)
                curveTo(15.5f, 10.546f, 15.746f, 10.3f, 16.05f, 10.3f)
                horizontalLineTo(19.95f)
                curveTo(20.254f, 10.3f, 20.5f, 10.546f, 20.5f, 10.85f)
                close()
                moveTo(15.5f, 19.95f)
                verticalLineTo(12.8f)
                horizontalLineTo(20.5f)
                verticalLineTo(19.95f)
                curveTo(20.5f, 20.254f, 20.254f, 20.5f, 19.95f, 20.5f)
                horizontalLineTo(16.05f)
                curveTo(15.746f, 20.5f, 15.5f, 20.254f, 15.5f, 19.95f)
                close()
            }
        }.build()
        return devices!!
    }

private var devices: ImageVector? = null