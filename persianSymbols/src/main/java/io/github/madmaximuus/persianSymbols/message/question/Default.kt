package io.github.madmaximuus.persianSymbols.message.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MessageQuestion: ImageVector
    get() {
        if (messageQuestion != null) {
            return messageQuestion!!
        }
        messageQuestion = Builder(
            name = "message-question-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 14.864f)
                curveTo(13f, 15.417f, 12.552f, 15.864f, 12f, 15.864f)
                curveTo(11.448f, 15.864f, 11f, 15.417f, 11f, 14.864f)
                curveTo(11f, 14.312f, 11.448f, 13.864f, 12f, 13.864f)
                curveTo(12.552f, 13.864f, 13f, 14.312f, 13f, 14.864f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3f)
                curveTo(4.015f, 3f, 2f, 5.015f, 2f, 7.5f)
                verticalLineTo(20f)
                curveTo(2f, 20.332f, 2.165f, 20.642f, 2.439f, 20.828f)
                curveTo(2.714f, 21.014f, 3.063f, 21.052f, 3.371f, 20.928f)
                lineTo(7.746f, 19.179f)
                curveTo(8.041f, 19.061f, 8.356f, 19f, 8.674f, 19f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 19f, 22f, 16.985f, 22f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 5.015f, 19.985f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 7.5f)
                curveTo(4f, 6.119f, 5.119f, 5f, 6.5f, 5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 5f, 20f, 6.119f, 20f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
                horizontalLineTo(8.674f)
                curveTo(8.102f, 17f, 7.534f, 17.109f, 7.003f, 17.322f)
                lineTo(4f, 18.523f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return messageQuestion!!
    }

private var messageQuestion: ImageVector? = null