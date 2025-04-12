package io.github.madmaximuus.persianSymbols.file.arrow.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FileArrowUp: ImageVector
    get() {
        if (fileArrowUp != null) {
            return fileArrowUp!!
        }
        fileArrowUp = ImageVector.Builder(
            name = "file-arrow-up-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6.5f)
                curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
                horizontalLineTo(13.172f)
                curveTo(13.967f, 2f, 14.73f, 2.316f, 15.293f, 2.879f)
                lineTo(19.121f, 6.707f)
                curveTo(19.684f, 7.27f, 20f, 8.033f, 20f, 8.828f)
                verticalLineTo(17.5f)
                curveTo(20f, 19.985f, 17.985f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(8.5f, 4f)
                curveTo(7.119f, 4f, 6f, 5.119f, 6f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 20f, 18f, 18.881f, 18f, 17.5f)
                verticalLineTo(10.25f)
                horizontalLineTo(14.5f)
                curveTo(12.981f, 10.25f, 11.75f, 9.019f, 11.75f, 7.5f)
                verticalLineTo(4f)
                horizontalLineTo(8.5f)
                close()
                moveTo(17.707f, 8.121f)
                curveTo(17.876f, 8.29f, 17.978f, 8.514f, 17.997f, 8.75f)
                horizontalLineTo(14.5f)
                curveTo(13.81f, 8.75f, 13.25f, 8.19f, 13.25f, 7.5f)
                verticalLineTo(4.003f)
                curveTo(13.486f, 4.022f, 13.71f, 4.124f, 13.879f, 4.293f)
                lineTo(17.707f, 8.121f)
                close()
            }
        }.build()

        return fileArrowUp!!
    }

private var fileArrowUp: ImageVector? = null