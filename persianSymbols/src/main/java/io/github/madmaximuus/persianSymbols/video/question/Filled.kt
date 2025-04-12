package io.github.madmaximuus.persianSymbols.video.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.VideoQuestion: ImageVector
    get() {
        if (videoQuestion != null) {
            return videoQuestion!!
        }
        videoQuestion = ImageVector.Builder(
            name = "video-question-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(13.6f)
                curveTo(15.854f, 4f, 17.713f, 5.695f, 17.97f, 7.881f)
                lineTo(20.292f, 6.797f)
                curveTo(21.088f, 6.426f, 22f, 7.006f, 22f, 7.884f)
                verticalLineTo(16.116f)
                curveTo(22f, 16.994f, 21.088f, 17.574f, 20.292f, 17.203f)
                lineTo(17.97f, 16.119f)
                curveTo(17.713f, 18.305f, 15.854f, 20f, 13.6f, 20f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(9.866f, 8.625f)
                curveTo(9.001f, 8.625f, 8.3f, 9.326f, 8.3f, 10.191f)
                curveTo(8.3f, 10.605f, 7.964f, 10.941f, 7.55f, 10.941f)
                curveTo(7.136f, 10.941f, 6.8f, 10.605f, 6.8f, 10.191f)
                curveTo(6.8f, 8.498f, 8.173f, 7.125f, 9.866f, 7.125f)
                curveTo(11.559f, 7.125f, 12.932f, 8.498f, 12.932f, 10.191f)
                curveTo(12.932f, 11.384f, 12.039f, 12.109f, 11.401f, 12.481f)
                curveTo(11.119f, 12.645f, 10.842f, 12.767f, 10.616f, 12.855f)
                verticalLineTo(13.571f)
                curveTo(10.616f, 13.985f, 10.28f, 14.321f, 9.866f, 14.321f)
                curveTo(9.452f, 14.321f, 9.116f, 13.985f, 9.116f, 13.571f)
                verticalLineTo(12.313f)
                curveTo(9.116f, 11.969f, 9.35f, 11.669f, 9.684f, 11.586f)
                lineTo(9.685f, 11.585f)
                lineTo(9.696f, 11.582f)
                curveTo(9.708f, 11.579f, 9.727f, 11.574f, 9.753f, 11.566f)
                curveTo(9.804f, 11.551f, 9.881f, 11.527f, 9.974f, 11.493f)
                curveTo(10.163f, 11.425f, 10.408f, 11.323f, 10.646f, 11.184f)
                curveTo(11.166f, 10.882f, 11.432f, 10.546f, 11.432f, 10.191f)
                curveTo(11.432f, 9.326f, 10.731f, 8.625f, 9.866f, 8.625f)
                close()
                moveTo(10.866f, 15.875f)
                curveTo(10.866f, 16.427f, 10.418f, 16.875f, 9.866f, 16.875f)
                curveTo(9.314f, 16.875f, 8.866f, 16.427f, 8.866f, 15.875f)
                curveTo(8.866f, 15.323f, 9.314f, 14.875f, 9.866f, 14.875f)
                curveTo(10.418f, 14.875f, 10.866f, 15.323f, 10.866f, 15.875f)
                close()
            }
        }.build()

        return videoQuestion!!
    }

private var videoQuestion: ImageVector? = null