package io.github.madmaximuus.persianSymbols.printer.dotmatrix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PrinterDotmatrix: ImageVector
    get() {
        if (printerDotmatrix != null) {
            return printerDotmatrix!!
        }
        printerDotmatrix = ImageVector.Builder(
            name = "printer-dotmatrix-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.25f, 9f)
                curveTo(18.664f, 9f, 19f, 8.664f, 19f, 8.25f)
                curveTo(19f, 7.836f, 18.664f, 7.5f, 18.25f, 7.5f)
                curveTo(17.836f, 7.5f, 17.5f, 7.836f, 17.5f, 8.25f)
                curveTo(17.5f, 8.664f, 17.836f, 9f, 18.25f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 14.5f)
                curveTo(9.75f, 14.914f, 9.414f, 15.25f, 9f, 15.25f)
                curveTo(8.586f, 15.25f, 8.25f, 14.914f, 8.25f, 14.5f)
                curveTo(8.25f, 14.086f, 8.586f, 13.75f, 9f, 13.75f)
                curveTo(9.414f, 13.75f, 9.75f, 14.086f, 9.75f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 17.25f)
                curveTo(9.414f, 17.25f, 9.75f, 16.914f, 9.75f, 16.5f)
                curveTo(9.75f, 16.086f, 9.414f, 15.75f, 9f, 15.75f)
                curveTo(8.586f, 15.75f, 8.25f, 16.086f, 8.25f, 16.5f)
                curveTo(8.25f, 16.914f, 8.586f, 17.25f, 9f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 18.5f)
                curveTo(9.75f, 18.914f, 9.414f, 19.25f, 9f, 19.25f)
                curveTo(8.586f, 19.25f, 8.25f, 18.914f, 8.25f, 18.5f)
                curveTo(8.25f, 18.086f, 8.586f, 17.75f, 9f, 17.75f)
                curveTo(9.414f, 17.75f, 9.75f, 18.086f, 9.75f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 15.25f)
                curveTo(15.414f, 15.25f, 15.75f, 14.914f, 15.75f, 14.5f)
                curveTo(15.75f, 14.086f, 15.414f, 13.75f, 15f, 13.75f)
                curveTo(14.586f, 13.75f, 14.25f, 14.086f, 14.25f, 14.5f)
                curveTo(14.25f, 14.914f, 14.586f, 15.25f, 15f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 16.5f)
                curveTo(15.75f, 16.914f, 15.414f, 17.25f, 15f, 17.25f)
                curveTo(14.586f, 17.25f, 14.25f, 16.914f, 14.25f, 16.5f)
                curveTo(14.25f, 16.086f, 14.586f, 15.75f, 15f, 15.75f)
                curveTo(15.414f, 15.75f, 15.75f, 16.086f, 15.75f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 19.25f)
                curveTo(15.414f, 19.25f, 15.75f, 18.914f, 15.75f, 18.5f)
                curveTo(15.75f, 18.086f, 15.414f, 17.75f, 15f, 17.75f)
                curveTo(14.586f, 17.75f, 14.25f, 18.086f, 14.25f, 18.5f)
                curveTo(14.25f, 18.914f, 14.586f, 19.25f, 15f, 19.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 5f)
                curveTo(5f, 3.343f, 6.343f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(17.657f, 2f, 19f, 3.343f, 19f, 5f)
                verticalLineTo(5.05f)
                curveTo(20.703f, 5.335f, 22f, 6.816f, 22f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(22f, 17.184f, 20.702f, 18.664f, 19f, 18.95f)
                verticalLineTo(19f)
                curveTo(19f, 20.657f, 17.657f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(6.343f, 22f, 5f, 20.657f, 5f, 19f)
                verticalLineTo(18.95f)
                curveTo(3.297f, 18.664f, 2f, 17.184f, 2f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(2f, 6.816f, 3.297f, 5.335f, 5f, 5.05f)
                verticalLineTo(5f)
                close()
                moveTo(5.582f, 7f)
                curveTo(4.706f, 7.01f, 4f, 7.722f, 4f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(4f, 16.071f, 4.414f, 16.646f, 5f, 16.884f)
                verticalLineTo(14f)
                curveTo(5f, 12.343f, 6.343f, 11f, 8f, 11f)
                horizontalLineTo(16f)
                curveTo(17.657f, 11f, 19f, 12.343f, 19f, 14f)
                verticalLineTo(16.884f)
                curveTo(19.586f, 16.646f, 20f, 16.071f, 20f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(20f, 7.722f, 19.293f, 7.01f, 18.418f, 7f)
                horizontalLineTo(5.582f)
                close()
                moveTo(16f, 4f)
                curveTo(16.552f, 4f, 17f, 4.448f, 17f, 5f)
                horizontalLineTo(7f)
                curveTo(7f, 4.448f, 7.448f, 4f, 8f, 4f)
                horizontalLineTo(16f)
                close()
                moveTo(7f, 18.016f)
                lineTo(7f, 18f)
                lineTo(7f, 17.984f)
                verticalLineTo(14f)
                curveTo(7f, 13.448f, 7.448f, 13f, 8f, 13f)
                horizontalLineTo(16f)
                curveTo(16.552f, 13f, 17f, 13.448f, 17f, 14f)
                verticalLineTo(19f)
                curveTo(17f, 19.552f, 16.552f, 20f, 16f, 20f)
                horizontalLineTo(8f)
                curveTo(7.448f, 20f, 7f, 19.552f, 7f, 19f)
                verticalLineTo(18.016f)
                close()
            }
        }.build()

        return printerDotmatrix!!
    }

private var printerDotmatrix: ImageVector? = null