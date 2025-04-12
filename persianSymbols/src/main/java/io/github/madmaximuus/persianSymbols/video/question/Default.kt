package io.github.madmaximuus.persianSymbols.video.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.VideoQuestion: ImageVector
    get() {
        if (videoQuestion != null) {
            return videoQuestion!!
        }
        videoQuestion = ImageVector.Builder(
            name = "video-question-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.866f, 15.875f)
                curveTo(10.866f, 16.427f, 10.418f, 16.875f, 9.866f, 16.875f)
                curveTo(9.314f, 16.875f, 8.866f, 16.427f, 8.866f, 15.875f)
                curveTo(8.866f, 15.323f, 9.314f, 14.875f, 9.866f, 14.875f)
                curveTo(10.418f, 14.875f, 10.866f, 15.323f, 10.866f, 15.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(13.5f)
                curveTo(15.674f, 4f, 17.488f, 5.542f, 17.908f, 7.591f)
                lineTo(19.973f, 6.817f)
                curveTo(20.954f, 6.449f, 22f, 7.174f, 22f, 8.222f)
                verticalLineTo(15.778f)
                curveTo(22f, 16.826f, 20.954f, 17.551f, 19.973f, 17.183f)
                lineTo(17.908f, 16.409f)
                curveTo(17.488f, 18.458f, 15.674f, 20f, 13.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(18f, 14.307f)
                verticalLineTo(9.693f)
                lineTo(20f, 8.943f)
                verticalLineTo(15.057f)
                lineTo(18f, 14.307f)
                close()
                moveTo(16f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(16f, 16.881f, 14.881f, 18f, 13.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 6f, 16f, 7.119f, 16f, 8.5f)
                close()
            }
        }.build()

        return videoQuestion!!
    }

private var videoQuestion: ImageVector? = null