package io.github.madmaximuus.persianSymbols.file.arrow.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FileArrowDown: ImageVector
    get() {
        if (fileArrowDown != null) {
            return fileArrowDown!!
        }
        fileArrowDown = ImageVector.Builder(
            name = "file-arrow-down-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.01f, 14.45f)
                curveTo(16.314f, 14.732f, 16.331f, 15.207f, 16.049f, 15.51f)
                lineTo(12.572f, 19.254f)
                curveTo(12.486f, 19.347f, 12.379f, 19.415f, 12.262f, 19.455f)
                curveTo(12.18f, 19.485f, 12.091f, 19.502f, 11.998f, 19.501f)
                curveTo(11.719f, 19.501f, 11.475f, 19.347f, 11.347f, 19.12f)
                lineTo(7.954f, 15.514f)
                curveTo(7.67f, 15.212f, 7.684f, 14.738f, 7.986f, 14.454f)
                curveTo(8.288f, 14.17f, 8.762f, 14.184f, 9.046f, 14.486f)
                lineTo(11.255f, 16.833f)
                lineTo(11.269f, 10.748f)
                curveTo(11.27f, 10.334f, 11.607f, 9.999f, 12.021f, 10f)
                curveTo(12.435f, 10.001f, 12.77f, 10.338f, 12.769f, 10.752f)
                lineTo(12.755f, 16.854f)
                lineTo(14.95f, 14.49f)
                curveTo(15.232f, 14.186f, 15.707f, 14.169f, 16.01f, 14.45f)
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

        return fileArrowDown!!
    }

private var fileArrowDown: ImageVector? = null