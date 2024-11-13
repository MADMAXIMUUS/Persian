package io.github.madmaximuus.persianSymbols.nfc

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Nfc: ImageVector
    get() {
        if (nfc != null) {
            return nfc!!
        }
        nfc = Builder(
            name = "nfc-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.4f, 3f)
                curveTo(4.97f, 3f, 3f, 4.97f, 3f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3f, 19.03f, 4.97f, 21f, 7.4f, 21f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 21f, 21f, 19.03f, 21f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21f, 4.97f, 19.03f, 3f, 16.6f, 3f)
                horizontalLineTo(7.4f)
                close()
                moveTo(9f, 7f)
                curveTo(7.895f, 7f, 7f, 7.895f, 7f, 9f)
                verticalLineTo(14.25f)
                curveTo(7f, 15.769f, 8.231f, 17f, 9.75f, 17f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 17f, 17f, 15.769f, 17f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(17f, 8.231f, 15.769f, 7f, 14.25f, 7f)
                horizontalLineTo(12f)
                curveTo(11.448f, 7f, 11f, 7.448f, 11f, 8f)
                verticalLineTo(10.268f)
                curveTo(10.402f, 10.613f, 10f, 11.26f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                curveTo(14f, 11.26f, 13.598f, 10.613f, 13f, 10.268f)
                verticalLineTo(9f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 9f, 15f, 9.336f, 15f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(15f, 14.664f, 14.664f, 15f, 14.25f, 15f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 15f, 9f, 14.664f, 9f, 14.25f)
                verticalLineTo(9f)
                curveTo(9.552f, 9f, 10f, 8.552f, 10f, 8f)
                curveTo(10f, 7.448f, 9.552f, 7f, 9f, 7f)
                close()
            }
        }.build()
        return nfc!!
    }

private var nfc: ImageVector? = null