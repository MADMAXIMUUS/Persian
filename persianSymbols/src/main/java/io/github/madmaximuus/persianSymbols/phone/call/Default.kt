package io.github.madmaximuus.persianSymbols.phone.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PhoneCall: ImageVector
    get() {
        if (phoneCall != null) {
            return phoneCall!!
        }
        phoneCall = Builder(
            name = "phone-call-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                curveTo(3f, 14.131f, 12.03f, 21f, 20f, 21f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(17.154f)
                curveTo(21f, 16.02f, 20.237f, 15.028f, 19.141f, 14.738f)
                lineTo(17.287f, 14.245f)
                curveTo(16.457f, 14.026f, 15.573f, 14.246f, 14.944f, 14.83f)
                lineTo(12.697f, 16.917f)
                curveTo(10.442f, 15.601f, 8.439f, 13.708f, 7.041f, 11.373f)
                lineTo(9.107f, 9.308f)
                curveTo(9.728f, 8.687f, 9.977f, 7.785f, 9.764f, 6.934f)
                lineTo(9.254f, 4.894f)
                curveTo(8.976f, 3.781f, 7.976f, 3f, 6.829f, 3f)
                horizontalLineTo(4f)
                close()
                moveTo(5.034f, 5f)
                curveTo(5.144f, 6.603f, 5.516f, 8.108f, 6.093f, 9.493f)
                lineTo(7.692f, 7.893f)
                curveTo(7.817f, 7.769f, 7.866f, 7.589f, 7.824f, 7.419f)
                lineTo(7.314f, 5.379f)
                curveTo(7.258f, 5.156f, 7.058f, 5f, 6.829f, 5f)
                horizontalLineTo(5.034f)
                close()
                moveTo(14.61f, 17.87f)
                curveTo(16.043f, 18.468f, 17.533f, 18.841f, 19f, 18.959f)
                verticalLineTo(17.154f)
                curveTo(19f, 16.927f, 18.847f, 16.729f, 18.628f, 16.671f)
                lineTo(16.774f, 16.179f)
                curveTo(16.608f, 16.135f, 16.431f, 16.179f, 16.305f, 16.295f)
                lineTo(14.61f, 17.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4f)
                curveTo(12f, 3.448f, 12.448f, 3f, 13f, 3f)
                curveTo(17.418f, 3f, 21f, 6.582f, 21f, 11f)
                curveTo(21f, 11.552f, 20.552f, 12f, 20f, 12f)
                curveTo(19.448f, 12f, 19f, 11.552f, 19f, 11f)
                curveTo(19f, 7.686f, 16.314f, 5f, 13f, 5f)
                curveTo(12.448f, 5f, 12f, 4.552f, 12f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8f)
                curveTo(12f, 7.448f, 12.448f, 7f, 13f, 7f)
                curveTo(15.209f, 7f, 17f, 8.791f, 17f, 11f)
                curveTo(17f, 11.552f, 16.552f, 12f, 16f, 12f)
                curveTo(15.448f, 12f, 15f, 11.552f, 15f, 11f)
                curveTo(15f, 9.895f, 14.105f, 9f, 13f, 9f)
                curveTo(12.448f, 9f, 12f, 8.552f, 12f, 8f)
                close()
            }
        }.build()
        return phoneCall!!
    }

private var phoneCall: ImageVector? = null