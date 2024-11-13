package io.github.madmaximuus.persianSymbols.question.tooltip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.QuestionTooltip: ImageVector
    get() {
        if (questionTooltip != null) {
            return questionTooltip!!
        }
        questionTooltip = Builder(
            name = "question-tooltip-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3f)
                curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
                verticalLineTo(17.278f)
                curveTo(3f, 19.211f, 4.567f, 20.778f, 6.5f, 20.778f)
                horizontalLineTo(8.929f)
                curveTo(9.455f, 20.778f, 9.96f, 20.985f, 10.334f, 21.355f)
                lineTo(11.297f, 22.306f)
                curveTo(11.687f, 22.691f, 12.313f, 22.691f, 12.703f, 22.306f)
                lineTo(13.666f, 21.355f)
                curveTo(14.04f, 20.985f, 14.545f, 20.778f, 15.071f, 20.778f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 20.778f, 21f, 19.211f, 21f, 17.278f)
                verticalLineTo(6.5f)
                curveTo(21f, 4.567f, 19.433f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                close()
                moveTo(12f, 7.898f)
                curveTo(10.842f, 7.898f, 9.904f, 8.837f, 9.904f, 9.995f)
                curveTo(9.904f, 10.409f, 9.568f, 10.745f, 9.154f, 10.745f)
                curveTo(8.74f, 10.745f, 8.404f, 10.409f, 8.404f, 9.995f)
                curveTo(8.404f, 8.008f, 10.014f, 6.398f, 12f, 6.398f)
                curveTo(13.986f, 6.398f, 15.596f, 8.008f, 15.596f, 9.995f)
                curveTo(15.596f, 11.365f, 14.571f, 12.212f, 13.8f, 12.66f)
                curveTo(13.417f, 12.884f, 13.039f, 13.044f, 12.75f, 13.15f)
                verticalLineTo(14.148f)
                curveTo(12.75f, 14.563f, 12.414f, 14.898f, 12f, 14.898f)
                curveTo(11.586f, 14.898f, 11.25f, 14.563f, 11.25f, 14.148f)
                verticalLineTo(12.603f)
                curveTo(11.25f, 12.259f, 11.484f, 11.959f, 11.818f, 11.875f)
                lineTo(11.819f, 11.875f)
                curveTo(11.819f, 11.875f, 11.819f, 11.875f, 12f, 12.603f)
                lineTo(11.819f, 11.875f)
                lineTo(11.82f, 11.875f)
                lineTo(11.836f, 11.871f)
                curveTo(11.852f, 11.866f, 11.877f, 11.859f, 11.91f, 11.85f)
                curveTo(11.976f, 11.83f, 12.073f, 11.8f, 12.191f, 11.757f)
                curveTo(12.43f, 11.671f, 12.741f, 11.542f, 13.046f, 11.364f)
                curveTo(13.698f, 10.984f, 14.096f, 10.527f, 14.096f, 9.995f)
                curveTo(14.096f, 8.837f, 13.158f, 7.898f, 12f, 7.898f)
                close()
                moveTo(13f, 16.602f)
                curveTo(13f, 17.154f, 12.552f, 17.602f, 12f, 17.602f)
                curveTo(11.448f, 17.602f, 11f, 17.154f, 11f, 16.602f)
                curveTo(11f, 16.049f, 11.448f, 15.602f, 12f, 15.602f)
                curveTo(12.552f, 15.602f, 13f, 16.049f, 13f, 16.602f)
                close()
            }
        }.build()
        return questionTooltip!!
    }

private var questionTooltip: ImageVector? = null