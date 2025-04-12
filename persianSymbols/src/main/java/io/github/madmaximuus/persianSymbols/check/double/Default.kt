package io.github.madmaximuus.persianSymbols.check.double

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckDouble: ImageVector
    get() {
        if (checkDouble != null) {
            return checkDouble!!
        }
        checkDouble = Builder(
            name = "check-double-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.692f, 6.672f)
                curveTo(18.124f, 7.017f, 18.156f, 7.613f, 17.766f, 8.004f)
                lineTo(9.388f, 16.382f)
                curveTo(9.339f, 16.45f, 9.278f, 16.514f, 9.207f, 16.571f)
                curveTo(9.005f, 16.733f, 8.752f, 16.81f, 8.5f, 16.808f)
                curveTo(8.248f, 16.81f, 7.995f, 16.733f, 7.793f, 16.571f)
                curveTo(7.722f, 16.514f, 7.661f, 16.45f, 7.612f, 16.381f)
                lineTo(3.477f, 12.246f)
                curveTo(3.086f, 11.856f, 3.119f, 11.259f, 3.55f, 10.914f)
                curveTo(3.981f, 10.569f, 4.648f, 10.606f, 5.038f, 10.996f)
                lineTo(8.5f, 14.458f)
                lineTo(16.205f, 6.754f)
                curveTo(16.595f, 6.363f, 17.261f, 6.326f, 17.692f, 6.672f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.45f, 7.429f)
                curveTo(20.881f, 7.774f, 20.914f, 8.37f, 20.524f, 8.761f)
                lineTo(12.038f, 17.246f)
                curveTo(11.648f, 17.637f, 10.981f, 17.674f, 10.55f, 17.328f)
                curveTo(10.119f, 16.983f, 10.086f, 16.387f, 10.477f, 15.996f)
                lineTo(18.962f, 7.511f)
                curveTo(19.353f, 7.121f, 20.019f, 7.084f, 20.45f, 7.429f)
                close()
            }
        }.build()
        return checkDouble!!
    }

private var checkDouble: ImageVector? = null