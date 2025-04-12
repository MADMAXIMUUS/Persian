package io.github.madmaximuus.persianSymbols.printer.dotmatrix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PrinterDotmatrix: ImageVector
    get() {
        if (printerDotmatrix != null) {
            return printerDotmatrix!!
        }
        printerDotmatrix = ImageVector.Builder(
            name = "printer-dotmatrix-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                curveTo(18.105f, 2f, 19f, 2.895f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(5f, 2.895f, 5.895f, 2f, 7f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.8f, 5f)
                horizontalLineTo(5.2f)
                curveTo(3.433f, 5f, 2f, 6.433f, 2f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(2f, 17.143f, 2.827f, 18.293f, 4f, 18.767f)
                verticalLineTo(13f)
                curveTo(4f, 11.343f, 5.343f, 10f, 7f, 10f)
                horizontalLineTo(17f)
                curveTo(18.657f, 10f, 20f, 11.343f, 20f, 13f)
                verticalLineTo(18.767f)
                curveTo(21.173f, 18.292f, 22f, 17.143f, 22f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(22f, 6.433f, 20.567f, 5f, 18.8f, 5f)
                close()
                moveTo(18.25f, 9f)
                curveTo(18.664f, 9f, 19f, 8.664f, 19f, 8.25f)
                curveTo(19f, 7.836f, 18.664f, 7.5f, 18.25f, 7.5f)
                curveTo(17.836f, 7.5f, 17.5f, 7.836f, 17.5f, 8.25f)
                curveTo(17.5f, 8.664f, 17.836f, 9f, 18.25f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 13.5f)
                curveTo(5f, 12.119f, 6.119f, 11f, 7.5f, 11f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 11f, 19f, 12.119f, 19f, 13.5f)
                verticalLineTo(19.5f)
                curveTo(19f, 20.881f, 17.881f, 22f, 16.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 22f, 5f, 20.881f, 5f, 19.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(9.75f, 14.5f)
                curveTo(9.75f, 14.914f, 9.414f, 15.25f, 9f, 15.25f)
                curveTo(8.586f, 15.25f, 8.25f, 14.914f, 8.25f, 14.5f)
                curveTo(8.25f, 14.086f, 8.586f, 13.75f, 9f, 13.75f)
                curveTo(9.414f, 13.75f, 9.75f, 14.086f, 9.75f, 14.5f)
                close()
                moveTo(9f, 17.25f)
                curveTo(9.414f, 17.25f, 9.75f, 16.914f, 9.75f, 16.5f)
                curveTo(9.75f, 16.086f, 9.414f, 15.75f, 9f, 15.75f)
                curveTo(8.586f, 15.75f, 8.25f, 16.086f, 8.25f, 16.5f)
                curveTo(8.25f, 16.914f, 8.586f, 17.25f, 9f, 17.25f)
                close()
                moveTo(9.75f, 18.5f)
                curveTo(9.75f, 18.914f, 9.414f, 19.25f, 9f, 19.25f)
                curveTo(8.586f, 19.25f, 8.25f, 18.914f, 8.25f, 18.5f)
                curveTo(8.25f, 18.086f, 8.586f, 17.75f, 9f, 17.75f)
                curveTo(9.414f, 17.75f, 9.75f, 18.086f, 9.75f, 18.5f)
                close()
                moveTo(15f, 15.25f)
                curveTo(15.414f, 15.25f, 15.75f, 14.914f, 15.75f, 14.5f)
                curveTo(15.75f, 14.086f, 15.414f, 13.75f, 15f, 13.75f)
                curveTo(14.586f, 13.75f, 14.25f, 14.086f, 14.25f, 14.5f)
                curveTo(14.25f, 14.914f, 14.586f, 15.25f, 15f, 15.25f)
                close()
                moveTo(15.75f, 16.5f)
                curveTo(15.75f, 16.914f, 15.414f, 17.25f, 15f, 17.25f)
                curveTo(14.586f, 17.25f, 14.25f, 16.914f, 14.25f, 16.5f)
                curveTo(14.25f, 16.086f, 14.586f, 15.75f, 15f, 15.75f)
                curveTo(15.414f, 15.75f, 15.75f, 16.086f, 15.75f, 16.5f)
                close()
                moveTo(15f, 19.25f)
                curveTo(15.414f, 19.25f, 15.75f, 18.914f, 15.75f, 18.5f)
                curveTo(15.75f, 18.086f, 15.414f, 17.75f, 15f, 17.75f)
                curveTo(14.586f, 17.75f, 14.25f, 18.086f, 14.25f, 18.5f)
                curveTo(14.25f, 18.914f, 14.586f, 19.25f, 15f, 19.25f)
                close()
            }
        }.build()

        return printerDotmatrix!!
    }

private var printerDotmatrix: ImageVector? = null