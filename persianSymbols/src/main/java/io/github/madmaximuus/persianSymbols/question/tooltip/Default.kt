package io.github.madmaximuus.persianSymbols.question.tooltip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.QuestionTooltip: ImageVector
    get() {
        if (questionTooltip != null) {
            return questionTooltip!!
        }
        questionTooltip = Builder(
            name = "question-tooltip-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 16.602f)
                curveTo(13f, 17.154f, 12.552f, 17.602f, 12f, 17.602f)
                curveTo(11.448f, 17.602f, 11f, 17.154f, 11f, 16.602f)
                curveTo(11f, 16.049f, 11.448f, 15.602f, 12f, 15.602f)
                curveTo(12.552f, 15.602f, 13f, 16.049f, 13f, 16.602f)
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
                horizontalLineTo(9.586f)
                lineTo(11.293f, 22.707f)
                curveTo(11.683f, 23.098f, 12.317f, 23.098f, 12.707f, 22.707f)
                lineTo(14.414f, 21f)
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
                horizontalLineTo(14.414f)
                curveTo(13.884f, 19f, 13.375f, 19.211f, 13f, 19.586f)
                lineTo(12f, 20.586f)
                lineTo(11f, 19.586f)
                curveTo(10.625f, 19.211f, 10.116f, 19f, 9.586f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.904f, 9.995f)
                curveTo(9.904f, 8.837f, 10.842f, 7.898f, 12f, 7.898f)
                curveTo(13.158f, 7.898f, 14.096f, 8.837f, 14.096f, 9.995f)
                curveTo(14.096f, 10.527f, 13.698f, 10.984f, 13.046f, 11.364f)
                curveTo(12.741f, 11.542f, 12.43f, 11.671f, 12.191f, 11.757f)
                lineTo(11.818f, 11.875f)
                curveTo(11.484f, 11.959f, 11.25f, 12.259f, 11.25f, 12.603f)
                verticalLineTo(14.148f)
                curveTo(11.25f, 14.563f, 11.586f, 14.898f, 12f, 14.898f)
                curveTo(12.414f, 14.898f, 12.75f, 14.563f, 12.75f, 14.148f)
                verticalLineTo(13.15f)
                curveTo(13.039f, 13.044f, 13.417f, 12.884f, 13.8f, 12.66f)
                curveTo(14.571f, 12.212f, 15.596f, 11.365f, 15.596f, 9.995f)
                curveTo(15.596f, 8.008f, 13.986f, 6.398f, 12f, 6.398f)
                curveTo(10.014f, 6.398f, 8.404f, 8.008f, 8.404f, 9.995f)
                curveTo(8.404f, 10.409f, 8.74f, 10.745f, 9.154f, 10.745f)
                curveTo(9.568f, 10.745f, 9.904f, 10.409f, 9.904f, 9.995f)
                close()
            }
        }.build()
        return questionTooltip!!
    }

private var questionTooltip: ImageVector? = null