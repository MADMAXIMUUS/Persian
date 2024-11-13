package io.github.madmaximuus.persianSymbols.phone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Phone: ImageVector
    get() {
        if (phone != null) {
            return phone!!
        }
        phone = Builder(
            name = "phone-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(6.829f)
                curveTo(7.976f, 3f, 8.976f, 3.781f, 9.254f, 4.894f)
                lineTo(9.764f, 6.934f)
                curveTo(9.977f, 7.785f, 9.728f, 8.687f, 9.107f, 9.308f)
                lineTo(7.041f, 11.373f)
                curveTo(8.439f, 13.708f, 10.442f, 15.601f, 12.697f, 16.917f)
                lineTo(14.944f, 14.83f)
                curveTo(15.573f, 14.246f, 16.457f, 14.026f, 17.287f, 14.245f)
                lineTo(19.141f, 14.738f)
                curveTo(20.237f, 15.028f, 21f, 16.02f, 21f, 17.154f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                curveTo(12.03f, 21f, 3f, 14.131f, 3f, 4f)
                close()
                moveTo(6.093f, 9.493f)
                curveTo(5.516f, 8.108f, 5.144f, 6.603f, 5.034f, 5f)
                horizontalLineTo(6.829f)
                curveTo(7.058f, 5f, 7.258f, 5.156f, 7.314f, 5.379f)
                lineTo(7.824f, 7.419f)
                curveTo(7.866f, 7.589f, 7.817f, 7.769f, 7.692f, 7.893f)
                lineTo(6.093f, 9.493f)
                close()
                moveTo(19f, 18.959f)
                curveTo(17.533f, 18.841f, 16.043f, 18.468f, 14.61f, 17.87f)
                lineTo(16.305f, 16.295f)
                curveTo(16.431f, 16.179f, 16.608f, 16.135f, 16.774f, 16.179f)
                lineTo(18.628f, 16.671f)
                curveTo(18.847f, 16.729f, 19f, 16.927f, 19f, 17.154f)
                verticalLineTo(18.959f)
                close()
            }
        }.build()
        return phone!!
    }

private var phone: ImageVector? = null