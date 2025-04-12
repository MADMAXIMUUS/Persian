package io.github.madmaximuus.persianSymbols.file.arrow.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FileArrowDown: ImageVector
    get() {
        if (fileArrowDown != null) {
            return fileArrowDown!!
        }
        fileArrowDown = ImageVector.Builder(
            name = "file-arrow-down-filled",
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

        return fileArrowDown!!
    }

private var fileArrowDown: ImageVector? = null