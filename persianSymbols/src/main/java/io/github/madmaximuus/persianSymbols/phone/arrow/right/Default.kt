package io.github.madmaximuus.persianSymbols.phone.arrow.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PhoneArrowRight: ImageVector
    get() {
        if (phoneArrowRight != null) {
            return phoneArrowRight!!
        }
        phoneArrowRight = ImageVector.Builder(
            name = "phone-arrow-right-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.135f, 3.658f)
                curveTo(12.41f, 2.283f, 11.358f, 1f, 9.956f, 1f)
                curveTo(7.473f, 1f, 4.935f, 2.301f, 4.034f, 4.847f)
                curveTo(2.417f, 9.415f, 2.417f, 14.585f, 4.034f, 19.152f)
                curveTo(4.935f, 21.698f, 7.473f, 23f, 9.956f, 23f)
                curveTo(11.358f, 23f, 12.41f, 21.717f, 12.135f, 20.342f)
                lineTo(11.707f, 18.202f)
                curveTo(11.451f, 16.921f, 10.327f, 16f, 9.021f, 16f)
                curveTo(8.716f, 16f, 8.52f, 15.835f, 8.458f, 15.667f)
                curveTo(7.609f, 13.378f, 7.609f, 10.622f, 8.458f, 8.333f)
                curveTo(8.52f, 8.165f, 8.716f, 8f, 9.021f, 8f)
                curveTo(10.327f, 8f, 11.451f, 7.079f, 11.707f, 5.798f)
                lineTo(12.135f, 3.658f)
                close()
                moveTo(9.956f, 3f)
                curveTo(10.096f, 3f, 10.201f, 3.128f, 10.174f, 3.265f)
                lineTo(9.745f, 5.406f)
                curveTo(9.676f, 5.751f, 9.373f, 6f, 9.021f, 6f)
                curveTo(8.009f, 6f, 6.978f, 6.571f, 6.582f, 7.638f)
                curveTo(5.568f, 10.375f, 5.568f, 13.624f, 6.582f, 16.362f)
                curveTo(6.978f, 17.429f, 8.009f, 18f, 9.021f, 18f)
                curveTo(9.373f, 18f, 9.676f, 18.249f, 9.745f, 18.594f)
                lineTo(10.174f, 20.734f)
                curveTo(10.201f, 20.872f, 10.096f, 21f, 9.956f, 21f)
                curveTo(8.092f, 21f, 6.468f, 20.036f, 5.919f, 18.485f)
                curveTo(4.456f, 14.35f, 4.456f, 9.65f, 5.919f, 5.515f)
                curveTo(6.468f, 3.963f, 8.092f, 3f, 9.956f, 3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.472f, 15.293f)
                curveTo(15.081f, 15.683f, 15.081f, 16.317f, 15.472f, 16.707f)
                curveTo(15.862f, 17.098f, 16.495f, 17.098f, 16.886f, 16.707f)
                lineTo(20.886f, 12.707f)
                curveTo(21.276f, 12.317f, 21.276f, 11.683f, 20.886f, 11.293f)
                lineTo(16.886f, 7.293f)
                curveTo(16.495f, 6.902f, 15.862f, 6.902f, 15.472f, 7.293f)
                curveTo(15.081f, 7.683f, 15.081f, 8.317f, 15.472f, 8.707f)
                lineTo(17.764f, 11f)
                horizontalLineTo(10.179f)
                curveTo(9.626f, 11f, 9.179f, 11.448f, 9.179f, 12f)
                curveTo(9.179f, 12.552f, 9.626f, 13f, 10.179f, 13f)
                horizontalLineTo(17.764f)
                lineTo(15.472f, 15.293f)
                close()
            }
        }.build()

        return phoneArrowRight!!
    }

private var phoneArrowRight: ImageVector? = null