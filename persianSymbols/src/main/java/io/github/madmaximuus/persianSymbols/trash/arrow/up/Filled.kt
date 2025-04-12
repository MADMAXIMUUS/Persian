package io.github.madmaximuus.persianSymbols.trash.arrow.up

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
                moveTo(10f, 2f)
                curveTo(9.31f, 2f, 8.75f, 2.56f, 8.75f, 3.25f)
                lineTo(8.75f, 4f)
                horizontalLineTo(4f)
                curveTo(3.448f, 4f, 3f, 4.448f, 3f, 5f)
                curveTo(3f, 5.553f, 3.448f, 6f, 4f, 6f)
                verticalLineTo(17.6f)
                curveTo(4f, 20.03f, 5.97f, 22f, 8.4f, 22f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 22f, 20f, 20.03f, 20f, 17.6f)
                verticalLineTo(6f)
                curveTo(20.552f, 6f, 21f, 5.553f, 21f, 5f)
                curveTo(21f, 4.448f, 20.552f, 4f, 20f, 4f)
                horizontalLineTo(15.25f)
                lineTo(15.25f, 3.25f)
                curveTo(15.25f, 2.56f, 14.69f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                close()
                moveTo(13.75f, 4f)
                lineTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                lineTo(10.25f, 4f)
                horizontalLineTo(13.75f)
                close()
                moveTo(7.99f, 13.05f)
                curveTo(7.686f, 12.768f, 7.669f, 12.293f, 7.95f, 11.99f)
                lineTo(11.428f, 8.246f)
                curveTo(11.514f, 8.153f, 11.621f, 8.085f, 11.738f, 8.045f)
                curveTo(11.82f, 8.015f, 11.909f, 7.998f, 12.002f, 7.998f)
                curveTo(12.281f, 7.999f, 12.525f, 8.153f, 12.653f, 8.38f)
                lineTo(16.046f, 11.986f)
                curveTo(16.33f, 12.288f, 16.316f, 12.762f, 16.014f, 13.046f)
                curveTo(15.712f, 13.33f, 15.238f, 13.316f, 14.954f, 13.014f)
                lineTo(12.745f, 10.667f)
                lineTo(12.731f, 16.752f)
                curveTo(12.73f, 17.166f, 12.393f, 17.501f, 11.979f, 17.5f)
                curveTo(11.565f, 17.499f, 11.23f, 17.162f, 11.231f, 16.748f)
                lineTo(11.245f, 10.646f)
                lineTo(9.05f, 13.01f)
                curveTo(8.768f, 13.314f, 8.293f, 13.331f, 7.99f, 13.05f)
                close()
            }
        }.build()
        return trashArrowUp!!
    }

private var trashArrowUp: ImageVector? = null