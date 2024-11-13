package io.github.madmaximuus.persianSymbols.battery.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BatteryQuestion: ImageVector
    get() {
        if (batteryQuestion != null) {
            return batteryQuestion!!
        }
        batteryQuestion = Builder(
            name = "battery-question-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.491f)
                curveTo(11.135f, 9.491f, 10.434f, 10.192f, 10.434f, 11.057f)
                curveTo(10.434f, 11.471f, 10.098f, 11.807f, 9.684f, 11.807f)
                curveTo(9.27f, 11.807f, 8.934f, 11.471f, 8.934f, 11.057f)
                curveTo(8.934f, 9.364f, 10.307f, 7.991f, 12f, 7.991f)
                curveTo(13.693f, 7.991f, 15.066f, 9.364f, 15.066f, 11.057f)
                curveTo(15.066f, 12.25f, 14.173f, 12.976f, 13.535f, 13.347f)
                curveTo(13.254f, 13.511f, 12.976f, 13.634f, 12.75f, 13.721f)
                verticalLineTo(14.437f)
                curveTo(12.75f, 14.851f, 12.414f, 15.187f, 12f, 15.187f)
                curveTo(11.586f, 15.187f, 11.25f, 14.851f, 11.25f, 14.437f)
                verticalLineTo(13.179f)
                curveTo(11.25f, 12.835f, 11.484f, 12.535f, 11.818f, 12.452f)
                lineTo(11.819f, 12.452f)
                lineTo(11.83f, 12.449f)
                curveTo(11.842f, 12.446f, 11.861f, 12.44f, 11.887f, 12.433f)
                curveTo(11.938f, 12.417f, 12.015f, 12.393f, 12.108f, 12.36f)
                curveTo(12.297f, 12.292f, 12.542f, 12.19f, 12.781f, 12.051f)
                curveTo(13.3f, 11.748f, 13.566f, 11.412f, 13.566f, 11.057f)
                curveTo(13.566f, 10.192f, 12.865f, 9.491f, 12f, 9.491f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 16.741f)
                curveTo(13f, 17.294f, 12.552f, 17.741f, 12f, 17.741f)
                curveTo(11.448f, 17.741f, 11f, 17.294f, 11f, 16.741f)
                curveTo(11f, 16.189f, 11.448f, 15.741f, 12f, 15.741f)
                curveTo(12.552f, 15.741f, 13f, 16.189f, 13f, 16.741f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 3f)
                curveTo(10f, 2.448f, 10.448f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15.4f)
                curveTo(16.836f, 4f, 18f, 5.164f, 18f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(18f, 20.836f, 16.836f, 22f, 15.4f, 22f)
                horizontalLineTo(8.6f)
                curveTo(7.164f, 22f, 6f, 20.836f, 6f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(6f, 5.164f, 7.164f, 4f, 8.6f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
                moveTo(8.6f, 6f)
                curveTo(8.269f, 6f, 8f, 6.269f, 8f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(8f, 19.731f, 8.269f, 20f, 8.6f, 20f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 20f, 16f, 19.731f, 16f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(16f, 6.269f, 15.731f, 6f, 15.4f, 6f)
                horizontalLineTo(8.6f)
                close()
            }
        }.build()
        return batteryQuestion!!
    }

private var batteryQuestion: ImageVector? = null