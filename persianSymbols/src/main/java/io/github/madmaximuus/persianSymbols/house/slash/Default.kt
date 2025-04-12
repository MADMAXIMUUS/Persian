package io.github.madmaximuus.persianSymbols.house.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.HouseSlash: ImageVector
    get() {
        if (houseSlash != null) {
            return houseSlash!!
        }
        houseSlash = ImageVector.Builder(
            name = "house-slash-default",
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
                moveTo(2.386f, 9.211f)
                lineTo(4.833f, 7.308f)
                lineTo(6.258f, 8.733f)
                lineTo(6f, 8.934f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.709f, 6.859f, 19.718f, 8f, 19.95f)
                verticalLineTo(15f)
                curveTo(8f, 13.895f, 8.895f, 13f, 10f, 13f)
                horizontalLineTo(10.525f)
                lineTo(12.525f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(21.972f)
                curveTo(5.75f, 21.724f, 4f, 19.816f, 4f, 17.5f)
                verticalLineTo(10.49f)
                lineTo(3.614f, 10.79f)
                curveTo(3.178f, 11.129f, 2.55f, 11.051f, 2.211f, 10.615f)
                curveTo(1.872f, 10.179f, 1.95f, 9.55f, 2.386f, 9.211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 8.934f)
                verticalLineTo(15.525f)
                lineTo(20f, 17.525f)
                lineTo(20f, 17.5f)
                verticalLineTo(10.49f)
                lineTo(20.386f, 10.79f)
                curveTo(20.822f, 11.129f, 21.45f, 11.051f, 21.789f, 10.615f)
                curveTo(22.128f, 10.179f, 22.05f, 9.55f, 21.614f, 9.211f)
                lineTo(12.614f, 2.211f)
                curveTo(12.253f, 1.93f, 11.747f, 1.93f, 11.386f, 2.211f)
                lineTo(7.617f, 5.142f)
                lineTo(9.042f, 6.568f)
                lineTo(12f, 4.267f)
                lineTo(18f, 8.934f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 19.95f)
                verticalLineTo(18.475f)
                lineTo(14f, 16.475f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(21.972f)
                curveTo(16.926f, 21.87f, 17.766f, 21.487f, 18.436f, 20.911f)
                lineTo(17.014f, 19.489f)
                curveTo(16.721f, 19.713f, 16.376f, 19.874f, 16f, 19.95f)
                close()
            }
        }.build()

        return houseSlash!!
    }

private var houseSlash: ImageVector? = null