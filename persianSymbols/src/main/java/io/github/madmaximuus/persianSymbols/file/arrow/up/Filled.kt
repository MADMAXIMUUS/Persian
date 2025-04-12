package io.github.madmaximuus.persianSymbols.file.arrow.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FileArrowUp: ImageVector
    get() {
        if (fileArrowUp != null) {
            return fileArrowUp!!
        }
        fileArrowUp = ImageVector.Builder(
            name = "file-arrow-up-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                curveTo(12f, 8.519f, 13.231f, 9.75f, 14.75f, 9.75f)
                horizontalLineTo(20f)
                verticalLineTo(18.5f)
                curveTo(20f, 20.433f, 18.433f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 22f, 4f, 20.433f, 4f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
                close()
                moveTo(7.99f, 15.05f)
                curveTo(7.686f, 14.768f, 7.669f, 14.293f, 7.95f, 13.99f)
                lineTo(11.428f, 10.246f)
                curveTo(11.514f, 10.153f, 11.621f, 10.085f, 11.738f, 10.045f)
                curveTo(11.82f, 10.015f, 11.909f, 9.998f, 12.002f, 9.998f)
                curveTo(12.281f, 9.999f, 12.525f, 10.153f, 12.653f, 10.38f)
                lineTo(16.046f, 13.986f)
                curveTo(16.33f, 14.288f, 16.316f, 14.762f, 16.014f, 15.046f)
                curveTo(15.712f, 15.33f, 15.238f, 15.316f, 14.954f, 15.014f)
                lineTo(12.745f, 12.667f)
                lineTo(12.731f, 18.752f)
                curveTo(12.73f, 19.166f, 12.393f, 19.501f, 11.979f, 19.5f)
                curveTo(11.565f, 19.499f, 11.23f, 19.162f, 11.231f, 18.748f)
                lineTo(11.245f, 12.646f)
                lineTo(9.05f, 15.01f)
                curveTo(8.768f, 15.314f, 8.293f, 15.331f, 7.99f, 15.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.394f, 6.967f)
                curveTo(19.745f, 7.308f, 19.958f, 7.765f, 19.994f, 8.25f)
                horizontalLineTo(14.75f)
                curveTo(14.06f, 8.25f, 13.5f, 7.69f, 13.5f, 7f)
                verticalLineTo(2f)
                curveTo(14.011f, 2.007f, 14.501f, 2.209f, 14.868f, 2.566f)
                lineTo(19.394f, 6.967f)
                close()
            }
        }.build()

        return fileArrowUp!!
    }

private var fileArrowUp: ImageVector? = null