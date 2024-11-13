package io.github.madmaximuus.persianSymbols.question.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.QuestionBox: ImageVector
    get() {
        if (questionBox != null) {
            return questionBox!!
        }
        questionBox = Builder(
            name = "question-box-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.625f)
                curveTo(11.135f, 8.625f, 10.434f, 9.326f, 10.434f, 10.191f)
                curveTo(10.434f, 10.605f, 10.098f, 10.941f, 9.684f, 10.941f)
                curveTo(9.27f, 10.941f, 8.934f, 10.605f, 8.934f, 10.191f)
                curveTo(8.934f, 8.498f, 10.307f, 7.125f, 12f, 7.125f)
                curveTo(13.693f, 7.125f, 15.066f, 8.498f, 15.066f, 10.191f)
                curveTo(15.066f, 11.384f, 14.173f, 12.109f, 13.535f, 12.481f)
                curveTo(13.254f, 12.645f, 12.976f, 12.767f, 12.75f, 12.855f)
                verticalLineTo(13.571f)
                curveTo(12.75f, 13.985f, 12.414f, 14.321f, 12f, 14.321f)
                curveTo(11.586f, 14.321f, 11.25f, 13.985f, 11.25f, 13.571f)
                verticalLineTo(12.313f)
                curveTo(11.25f, 11.969f, 11.484f, 11.669f, 11.818f, 11.586f)
                lineTo(11.819f, 11.585f)
                lineTo(11.83f, 11.582f)
                curveTo(11.842f, 11.579f, 11.861f, 11.574f, 11.887f, 11.566f)
                curveTo(11.938f, 11.551f, 12.015f, 11.527f, 12.108f, 11.493f)
                curveTo(12.297f, 11.425f, 12.542f, 11.323f, 12.781f, 11.184f)
                curveTo(13.3f, 10.882f, 13.566f, 10.546f, 13.566f, 10.191f)
                curveTo(13.566f, 9.326f, 12.865f, 8.625f, 12f, 8.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 15.875f)
                curveTo(13f, 16.427f, 12.552f, 16.875f, 12f, 16.875f)
                curveTo(11.448f, 16.875f, 11f, 16.427f, 11f, 15.875f)
                curveTo(11f, 15.323f, 11.448f, 14.875f, 12f, 14.875f)
                curveTo(12.552f, 14.875f, 13f, 15.323f, 13f, 15.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21f, 5.015f, 18.985f, 3f, 16.5f, 3f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5f, 7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 5f, 19f, 6.119f, 19f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19f, 17.881f, 17.881f, 19f, 16.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return questionBox!!
    }

private var questionBox: ImageVector? = null