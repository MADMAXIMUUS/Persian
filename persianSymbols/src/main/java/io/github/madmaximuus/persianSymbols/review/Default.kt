package io.github.madmaximuus.persianSymbols.review

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Review: ImageVector
    get() {
        if (review != null) {
            return review!!
        }
        review = Builder(
            name = "review-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.5f, 4f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(4f)
                curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
                verticalLineTo(8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                close()
                moveTo(20f, 8.5f)
                curveTo(20f, 7.119f, 18.881f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 6f, 4f, 7.119f, 4f, 8.5f)
                verticalLineTo(18f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 18f, 20f, 16.881f, 20f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(12.285f, 8.378f)
                curveTo(12.196f, 8.102f, 11.804f, 8.102f, 11.715f, 8.378f)
                lineTo(10.945f, 10.748f)
                curveTo(10.905f, 10.871f, 10.789f, 10.955f, 10.66f, 10.955f)
                horizontalLineTo(8.168f)
                curveTo(7.877f, 10.955f, 7.757f, 11.327f, 7.992f, 11.498f)
                lineTo(10.007f, 12.962f)
                curveTo(10.113f, 13.038f, 10.156f, 13.174f, 10.116f, 13.297f)
                lineTo(9.346f, 15.667f)
                curveTo(9.257f, 15.943f, 9.573f, 16.173f, 9.808f, 16.002f)
                lineTo(11.824f, 14.538f)
                curveTo(11.929f, 14.462f, 12.071f, 14.462f, 12.176f, 14.538f)
                lineTo(14.192f, 16.002f)
                curveTo(14.427f, 16.173f, 14.743f, 15.943f, 14.654f, 15.667f)
                lineTo(13.884f, 13.297f)
                curveTo(13.844f, 13.174f, 13.887f, 13.038f, 13.993f, 12.962f)
                lineTo(16.008f, 11.498f)
                curveTo(16.243f, 11.327f, 16.123f, 10.955f, 15.832f, 10.955f)
                horizontalLineTo(13.34f)
                curveTo(13.211f, 10.955f, 13.095f, 10.871f, 13.055f, 10.748f)
                lineTo(12.285f, 8.378f)
                close()
            }
        }.build()
        return review!!
    }

private var review: ImageVector? = null