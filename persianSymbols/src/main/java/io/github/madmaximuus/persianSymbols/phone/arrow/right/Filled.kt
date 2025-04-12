package io.github.madmaximuus.persianSymbols.phone.arrow.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PhoneArrowRight: ImageVector
    get() {
        if (phoneArrowRight != null) {
            return phoneArrowRight!!
        }
        phoneArrowRight = ImageVector.Builder(
            name = "phone-arrow-right-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.095f, 19.441f)
                curveTo(2.393f, 15.025f, 2.393f, 8.975f, 4.095f, 4.559f)
                curveTo(5.046f, 2.094f, 7.696f, 1f, 10.338f, 1f)
                curveTo(11.511f, 1f, 12.392f, 2.071f, 12.165f, 3.222f)
                lineTo(11.679f, 5.684f)
                curveTo(11.459f, 6.797f, 10.629f, 7.69f, 9.536f, 7.99f)
                curveTo(8.405f, 8.301f, 7.59f, 9.249f, 7.585f, 10.422f)
                curveTo(7.581f, 11.366f, 7.606f, 12.46f, 7.631f, 13.416f)
                curveTo(7.664f, 14.647f, 8.502f, 15.726f, 9.689f, 16.052f)
                curveTo(10.689f, 16.327f, 11.447f, 17.143f, 11.648f, 18.16f)
                lineTo(12.165f, 20.778f)
                curveTo(12.392f, 21.928f, 11.511f, 23f, 10.338f, 23f)
                curveTo(7.696f, 23f, 5.046f, 21.906f, 4.095f, 19.441f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.471f, 15.293f)
                curveTo(15.081f, 15.683f, 15.081f, 16.317f, 15.471f, 16.707f)
                curveTo(15.862f, 17.098f, 16.495f, 17.098f, 16.886f, 16.707f)
                lineTo(20.886f, 12.707f)
                curveTo(21.276f, 12.317f, 21.276f, 11.683f, 20.886f, 11.293f)
                lineTo(16.886f, 7.293f)
                curveTo(16.495f, 6.902f, 15.862f, 6.902f, 15.471f, 7.293f)
                curveTo(15.081f, 7.683f, 15.081f, 8.317f, 15.471f, 8.707f)
                lineTo(17.764f, 11f)
                horizontalLineTo(10.179f)
                curveTo(9.626f, 11f, 9.179f, 11.448f, 9.179f, 12f)
                curveTo(9.179f, 12.552f, 9.626f, 13f, 10.179f, 13f)
                horizontalLineTo(17.764f)
                lineTo(15.471f, 15.293f)
                close()
            }
        }.build()

        return phoneArrowRight!!
    }

private var phoneArrowRight: ImageVector? = null