package io.github.madmaximuus.persianSymbols.trash.arrowUp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.TrashArrowUp: ImageVector
    get() {
        if (trashArrowUp != null) {
            return trashArrowUp!!
        }
        trashArrowUp = Builder(
            name = "trash-arrow-up-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.99f, 12.8f)
                curveTo(7.686f, 12.518f, 7.669f, 12.043f, 7.95f, 11.74f)
                lineTo(11.428f, 7.996f)
                curveTo(11.514f, 7.903f, 11.621f, 7.835f, 11.738f, 7.795f)
                curveTo(11.82f, 7.765f, 11.909f, 7.748f, 12.002f, 7.748f)
                curveTo(12.281f, 7.749f, 12.525f, 7.903f, 12.653f, 8.13f)
                lineTo(16.046f, 11.736f)
                curveTo(16.33f, 12.038f, 16.316f, 12.512f, 16.014f, 12.796f)
                curveTo(15.712f, 13.08f, 15.238f, 13.066f, 14.954f, 12.764f)
                lineTo(12.745f, 10.417f)
                lineTo(12.731f, 16.502f)
                curveTo(12.73f, 16.916f, 12.393f, 17.251f, 11.979f, 17.25f)
                curveTo(11.565f, 17.249f, 11.23f, 16.912f, 11.231f, 16.498f)
                lineTo(11.245f, 10.396f)
                lineTo(9.05f, 12.76f)
                curveTo(8.768f, 13.064f, 8.293f, 13.081f, 7.99f, 12.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2.5f)
                curveTo(7.448f, 2.5f, 7f, 2.948f, 7f, 3.5f)
                lineTo(4f, 3.5f)
                curveTo(3.448f, 3.5f, 3f, 3.948f, 3f, 4.5f)
                curveTo(3f, 5.052f, 3.448f, 5.5f, 4f, 5.5f)
                verticalLineTo(17f)
                curveTo(4f, 19.485f, 6.015f, 21.5f, 8.5f, 21.5f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 21.5f, 20f, 19.485f, 20f, 17f)
                verticalLineTo(5.5f)
                curveTo(20.552f, 5.5f, 21f, 5.053f, 21f, 4.5f)
                curveTo(21f, 3.948f, 20.552f, 3.5f, 20f, 3.5f)
                horizontalLineTo(17f)
                curveTo(17f, 2.948f, 16.552f, 2.5f, 16f, 2.5f)
                horizontalLineTo(8f)
                close()
                moveTo(6f, 17f)
                verticalLineTo(5.5f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                curveTo(18f, 18.381f, 16.881f, 19.5f, 15.5f, 19.5f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 19.5f, 6f, 18.381f, 6f, 17f)
                close()
            }
        }.build()
        return trashArrowUp!!
    }

private var trashArrowUp: ImageVector? = null