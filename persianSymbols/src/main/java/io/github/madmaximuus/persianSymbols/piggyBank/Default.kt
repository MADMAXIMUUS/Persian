package io.github.madmaximuus.persianSymbols.piggyBank

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PiggyBank: ImageVector
    get() {
        if (piggyBank != null) {
            return piggyBank!!
        }
        piggyBank = Builder(
            name = "piggy-bank-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 8f)
                curveTo(8.25f, 7.586f, 8.586f, 7.25f, 9f, 7.25f)
                horizontalLineTo(12f)
                curveTo(12.414f, 7.25f, 12.75f, 7.586f, 12.75f, 8f)
                curveTo(12.75f, 8.414f, 12.414f, 8.75f, 12f, 8.75f)
                horizontalLineTo(9f)
                curveTo(8.586f, 8.75f, 8.25f, 8.414f, 8.25f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.25f, 11.5f)
                curveTo(16.94f, 11.5f, 17.5f, 10.94f, 17.5f, 10.25f)
                curveTo(17.5f, 9.56f, 16.94f, 9f, 16.25f, 9f)
                curveTo(15.56f, 9f, 15f, 9.56f, 15f, 10.25f)
                curveTo(15f, 10.94f, 15.56f, 11.5f, 16.25f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.777f, 4.131f)
                curveTo(17.773f, 4.141f, 17.769f, 4.152f, 17.764f, 4.166f)
                curveTo(17.733f, 4.254f, 17.7f, 4.384f, 17.667f, 4.553f)
                curveTo(17.604f, 4.877f, 17.561f, 5.255f, 17.534f, 5.56f)
                lineTo(19.862f, 7.5f)
                horizontalLineTo(20f)
                curveTo(21.105f, 7.5f, 22f, 8.395f, 22f, 9.5f)
                verticalLineTo(12.823f)
                curveTo(22f, 13.641f, 21.502f, 14.376f, 20.743f, 14.68f)
                lineTo(19.404f, 15.215f)
                lineTo(19.403f, 15.217f)
                curveTo(19.402f, 15.219f, 19.399f, 15.223f, 19.399f, 15.228f)
                curveTo(19.118f, 16.947f, 18.803f, 18.124f, 18.181f, 19.734f)
                curveTo(17.882f, 20.508f, 17.137f, 21f, 16.327f, 21f)
                horizontalLineTo(14f)
                curveTo(12.852f, 21f, 12.076f, 20.078f, 11.964f, 19.117f)
                curveTo(11.917f, 18.708f, 11.818f, 18.422f, 11.688f, 18.254f)
                curveTo(11.601f, 18.141f, 11.444f, 18f, 11f, 18f)
                curveTo(10.556f, 18f, 10.399f, 18.141f, 10.312f, 18.254f)
                curveTo(10.182f, 18.422f, 10.083f, 18.708f, 10.036f, 19.117f)
                curveTo(9.924f, 20.078f, 9.148f, 21f, 8f, 21f)
                horizontalLineTo(6.035f)
                curveTo(5.373f, 21f, 4.727f, 20.67f, 4.36f, 20.074f)
                curveTo(2.461f, 16.996f, 2f, 13.884f, 2f, 10f)
                curveTo(2f, 7.511f, 2.964f, 5.894f, 4.306f, 4.965f)
                curveTo(5.567f, 4.093f, 7.04f, 3.91f, 8.047f, 4f)
                lineTo(12.517f, 4f)
                curveTo(12.519f, 4f, 12.522f, 3.999f, 12.528f, 3.996f)
                curveTo(12.541f, 3.99f, 12.561f, 3.977f, 12.582f, 3.954f)
                curveTo(13.709f, 2.742f, 14.967f, 2.225f, 15.95f, 2.115f)
                curveTo(16.412f, 2.063f, 16.91f, 2.091f, 17.312f, 2.275f)
                curveTo(17.492f, 2.357f, 17.847f, 2.56f, 18f, 2.994f)
                curveTo(18.171f, 3.477f, 17.982f, 3.888f, 17.777f, 4.131f)
                close()
                moveTo(15.697f, 4.208f)
                curveTo(15.227f, 4.36f, 14.634f, 4.685f, 14.047f, 5.316f)
                curveTo(13.68f, 5.711f, 13.141f, 6f, 12.519f, 6f)
                lineTo(8f, 6f)
                curveTo(7.967f, 6f, 7.934f, 5.998f, 7.9f, 5.995f)
                curveTo(7.241f, 5.929f, 6.244f, 6.056f, 5.444f, 6.61f)
                curveTo(4.703f, 7.123f, 4f, 8.089f, 4f, 10f)
                curveTo(4f, 13.704f, 4.439f, 16.382f, 6.047f, 19f)
                horizontalLineTo(7.996f)
                curveTo(7.998f, 18.999f, 8f, 18.997f, 8.003f, 18.994f)
                curveTo(8.019f, 18.978f, 8.043f, 18.941f, 8.049f, 18.886f)
                curveTo(8.113f, 18.339f, 8.271f, 17.623f, 8.73f, 17.03f)
                curveTo(9.232f, 16.381f, 9.999f, 16f, 11f, 16f)
                curveTo(12.001f, 16f, 12.767f, 16.381f, 13.27f, 17.03f)
                curveTo(13.729f, 17.623f, 13.887f, 18.339f, 13.951f, 18.886f)
                curveTo(13.957f, 18.941f, 13.981f, 18.978f, 13.998f, 18.994f)
                lineTo(14f, 18.997f)
                lineTo(14.004f, 19f)
                horizontalLineTo(16.321f)
                curveTo(16.888f, 17.531f, 17.166f, 16.489f, 17.425f, 14.906f)
                curveTo(17.537f, 14.217f, 17.998f, 13.624f, 18.661f, 13.358f)
                lineTo(20f, 12.823f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.862f)
                curveTo(19.394f, 9.5f, 18.941f, 9.336f, 18.582f, 9.036f)
                lineTo(16.242f, 7.087f)
                curveTo(15.764f, 6.688f, 15.482f, 6.073f, 15.539f, 5.417f)
                curveTo(15.567f, 5.089f, 15.616f, 4.634f, 15.697f, 4.208f)
                close()
            }
        }.build()
        return piggyBank!!
    }

private var piggyBank: ImageVector? = null