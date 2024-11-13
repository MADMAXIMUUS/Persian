package io.github.madmaximuus.persianSymbols.message.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageQuestion: ImageVector
    get() {
        if (messageQuestion != null) {
            return messageQuestion!!
        }
        messageQuestion = Builder(
            name = "message-question-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 3f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 3f, 22f, 5.017f, 22f, 7.506f)
                verticalLineTo(14.878f)
                curveTo(22f, 17.367f, 20.03f, 19.384f, 17.6f, 19.384f)
                horizontalLineTo(8.166f)
                curveTo(7.762f, 19.384f, 7.361f, 19.456f, 6.981f, 19.596f)
                lineTo(3.339f, 20.939f)
                curveTo(2.687f, 21.179f, 2f, 20.684f, 2f, 19.975f)
                verticalLineTo(7.506f)
                curveTo(2f, 5.017f, 3.97f, 3f, 6.4f, 3f)
                close()
                moveTo(12f, 7.614f)
                curveTo(11.135f, 7.614f, 10.434f, 8.315f, 10.434f, 9.18f)
                curveTo(10.434f, 9.594f, 10.098f, 9.93f, 9.684f, 9.93f)
                curveTo(9.27f, 9.93f, 8.934f, 9.594f, 8.934f, 9.18f)
                curveTo(8.934f, 7.487f, 10.307f, 6.114f, 12f, 6.114f)
                curveTo(13.693f, 6.114f, 15.066f, 7.487f, 15.066f, 9.18f)
                curveTo(15.066f, 10.373f, 14.173f, 11.099f, 13.535f, 11.47f)
                curveTo(13.254f, 11.634f, 12.976f, 11.757f, 12.75f, 11.844f)
                verticalLineTo(12.56f)
                curveTo(12.75f, 12.974f, 12.414f, 13.31f, 12f, 13.31f)
                curveTo(11.586f, 13.31f, 11.25f, 12.974f, 11.25f, 12.56f)
                verticalLineTo(11.302f)
                curveTo(11.25f, 10.958f, 11.484f, 10.658f, 11.818f, 10.575f)
                lineTo(11.819f, 10.575f)
                lineTo(11.83f, 10.571f)
                curveTo(11.842f, 10.568f, 11.861f, 10.563f, 11.887f, 10.556f)
                curveTo(11.938f, 10.54f, 12.015f, 10.516f, 12.108f, 10.483f)
                curveTo(12.297f, 10.415f, 12.542f, 10.313f, 12.781f, 10.174f)
                curveTo(13.3f, 9.871f, 13.566f, 9.535f, 13.566f, 9.18f)
                curveTo(13.566f, 8.315f, 12.865f, 7.614f, 12f, 7.614f)
                close()
                moveTo(13f, 14.864f)
                curveTo(13f, 15.417f, 12.552f, 15.864f, 12f, 15.864f)
                curveTo(11.448f, 15.864f, 11f, 15.417f, 11f, 14.864f)
                curveTo(11f, 14.312f, 11.448f, 13.864f, 12f, 13.864f)
                curveTo(12.552f, 13.864f, 13f, 14.312f, 13f, 14.864f)
                close()
            }
        }.build()
        return messageQuestion!!
    }

private var messageQuestion: ImageVector? = null