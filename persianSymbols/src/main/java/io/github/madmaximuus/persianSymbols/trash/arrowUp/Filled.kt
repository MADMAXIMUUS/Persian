package io.github.madmaximuus.persianSymbols.trash.arrowUp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.TrashArrowUp: ImageVector
    get() {
        if (trashArrowUp != null) {
            return trashArrowUp!!
        }
        trashArrowUp = Builder(
            name = "trash-arrow-up-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2.5f)
                curveTo(7.448f, 2.5f, 7f, 2.948f, 7f, 3.5f)
                lineTo(4f, 3.5f)
                curveTo(3.448f, 3.5f, 3f, 3.948f, 3f, 4.5f)
                curveTo(3f, 5.053f, 3.448f, 5.5f, 4f, 5.5f)
                verticalLineTo(17.1f)
                curveTo(4f, 19.53f, 5.97f, 21.5f, 8.4f, 21.5f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 21.5f, 20f, 19.53f, 20f, 17.1f)
                verticalLineTo(5.5f)
                curveTo(20.552f, 5.5f, 21f, 5.053f, 21f, 4.5f)
                curveTo(21f, 3.948f, 20.552f, 3.5f, 20f, 3.5f)
                horizontalLineTo(17f)
                curveTo(17f, 2.948f, 16.552f, 2.5f, 16f, 2.5f)
                horizontalLineTo(8f)
                close()
                moveTo(7.99f, 12.3f)
                curveTo(7.686f, 12.018f, 7.669f, 11.543f, 7.95f, 11.24f)
                lineTo(11.428f, 7.496f)
                curveTo(11.514f, 7.403f, 11.621f, 7.335f, 11.738f, 7.295f)
                curveTo(11.82f, 7.265f, 11.909f, 7.248f, 12.002f, 7.248f)
                curveTo(12.281f, 7.249f, 12.525f, 7.403f, 12.653f, 7.63f)
                lineTo(16.046f, 11.236f)
                curveTo(16.33f, 11.538f, 16.316f, 12.012f, 16.014f, 12.296f)
                curveTo(15.712f, 12.58f, 15.238f, 12.566f, 14.954f, 12.264f)
                lineTo(12.745f, 9.917f)
                lineTo(12.731f, 16.002f)
                curveTo(12.73f, 16.416f, 12.393f, 16.751f, 11.979f, 16.75f)
                curveTo(11.565f, 16.749f, 11.23f, 16.412f, 11.231f, 15.998f)
                lineTo(11.245f, 9.896f)
                lineTo(9.05f, 12.26f)
                curveTo(8.768f, 12.564f, 8.293f, 12.581f, 7.99f, 12.3f)
                close()
            }
        }.build()
        return trashArrowUp!!
    }

private var trashArrowUp: ImageVector? = null