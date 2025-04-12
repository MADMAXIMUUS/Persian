package io.github.madmaximuus.persianSymbols.pin.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PinSlash: ImageVector
    get() {
        if (pinSlash != null) {
            return pinSlash!!
        }
        pinSlash = ImageVector.Builder(
            name = "pin-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 12f)
                verticalLineTo(10.475f)
                lineTo(13f, 15.475f)
                verticalLineTo(20.364f)
                lineTo(12.171f, 21.721f)
                curveTo(12.093f, 21.848f, 11.907f, 21.848f, 11.829f, 21.721f)
                lineTo(11f, 20.364f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                curveTo(6.448f, 14f, 6f, 13.552f, 6f, 13f)
                curveTo(6f, 12.448f, 6.448f, 12f, 7f, 12f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 14f)
                lineTo(16.475f, 14f)
                lineTo(14f, 11.525f)
                verticalLineTo(6f)
                curveTo(14f, 4.895f, 13.105f, 4f, 12f, 4f)
                curveTo(10.895f, 4f, 10f, 4.895f, 10f, 6f)
                verticalLineTo(7.525f)
                lineTo(8.025f, 5.55f)
                curveTo(8.249f, 3.553f, 9.943f, 2f, 12f, 2f)
                curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                curveTo(17.552f, 12f, 18f, 12.448f, 18f, 13f)
                curveTo(18f, 13.552f, 17.552f, 14f, 17f, 14f)
                close()
            }
        }.build()

        return pinSlash!!
    }

private var pinSlash: ImageVector? = null