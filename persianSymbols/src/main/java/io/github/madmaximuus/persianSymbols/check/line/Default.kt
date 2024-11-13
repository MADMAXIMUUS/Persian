package io.github.madmaximuus.persianSymbols.check.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckLine: ImageVector
    get() {
        if (checkLine != null) {
            return checkLine!!
        }
        checkLine = Builder(
            name = "check-line-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.071f, 5.55f)
                curveTo(19.502f, 5.895f, 19.535f, 6.492f, 19.145f, 6.882f)
                lineTo(10.767f, 15.26f)
                curveTo(10.717f, 15.329f, 10.657f, 15.393f, 10.586f, 15.45f)
                curveTo(10.383f, 15.612f, 10.129f, 15.69f, 9.876f, 15.686f)
                curveTo(9.624f, 15.689f, 9.372f, 15.611f, 9.171f, 15.45f)
                curveTo(9.1f, 15.393f, 9.04f, 15.329f, 8.991f, 15.26f)
                lineTo(4.855f, 11.125f)
                curveTo(4.465f, 10.734f, 4.498f, 10.138f, 4.929f, 9.793f)
                curveTo(5.36f, 9.448f, 6.026f, 9.485f, 6.417f, 9.875f)
                lineTo(9.879f, 13.337f)
                lineTo(17.583f, 5.632f)
                curveTo(17.974f, 5.242f, 18.64f, 5.205f, 19.071f, 5.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 16.743f)
                curveTo(3.448f, 16.743f, 3f, 17.191f, 3f, 17.743f)
                curveTo(3f, 18.295f, 3.448f, 18.743f, 4f, 18.743f)
                horizontalLineTo(20f)
                curveTo(20.552f, 18.743f, 21f, 18.295f, 21f, 17.743f)
                curveTo(21f, 17.191f, 20.552f, 16.743f, 20f, 16.743f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        return checkLine!!
    }

private var checkLine: ImageVector? = null