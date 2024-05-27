package io.github.madmaximuus.persianSymbols.phone.call

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                curveTo(3.0f, 14.1307f, 12.0296f, 21.0f, 20.0f, 21.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(17.1539f)
                curveTo(21.0f, 16.0201f, 20.237f, 15.0283f, 19.1411f, 14.7375f)
                lineTo(17.2865f, 14.2455f)
                curveTo(16.4572f, 14.0255f, 15.573f, 14.2461f, 14.9443f, 14.8299f)
                lineTo(12.6969f, 16.9168f)
                curveTo(10.4419f, 15.6007f, 8.4386f, 13.7078f, 7.0414f, 11.3728f)
                lineTo(9.1066f, 9.3076f)
                curveTo(9.7275f, 8.6867f, 9.9771f, 7.7855f, 9.7642f, 6.9335f)
                lineTo(9.2542f, 4.8937f)
                curveTo(8.976f, 3.7807f, 7.976f, 3.0f, 6.8288f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.0341f, 5.0f)
                curveTo(5.144f, 6.6033f, 5.5157f, 8.1082f, 6.0927f, 9.4931f)
                lineTo(7.6924f, 7.8934f)
                curveTo(7.8165f, 7.7692f, 7.8665f, 7.589f, 7.8239f, 7.4186f)
                lineTo(7.3139f, 5.3787f)
                curveTo(7.2583f, 5.1561f, 7.0583f, 5.0f, 6.8288f, 5.0f)
                horizontalLineTo(5.0341f)
                close()
                moveTo(14.6097f, 17.8699f)
                curveTo(16.0429f, 18.4683f, 17.5326f, 18.8414f, 19.0f, 18.9594f)
                verticalLineTo(17.1539f)
                curveTo(19.0f, 16.9272f, 18.8474f, 16.7288f, 18.6282f, 16.6707f)
                lineTo(16.7737f, 16.1786f)
                curveTo(16.6078f, 16.1346f, 16.431f, 16.1787f, 16.3052f, 16.2955f)
                lineTo(14.6097f, 17.8699f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.0f)
                curveTo(12.0f, 3.4477f, 12.4477f, 3.0f, 13.0f, 3.0f)
                curveTo(17.4183f, 3.0f, 21.0f, 6.5817f, 21.0f, 11.0f)
                curveTo(21.0f, 11.5523f, 20.5523f, 12.0f, 20.0f, 12.0f)
                curveTo(19.4477f, 12.0f, 19.0f, 11.5523f, 19.0f, 11.0f)
                curveTo(19.0f, 7.6863f, 16.3137f, 5.0f, 13.0f, 5.0f)
                curveTo(12.4477f, 5.0f, 12.0f, 4.5523f, 12.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.0f)
                curveTo(12.0f, 7.4477f, 12.4477f, 7.0f, 13.0f, 7.0f)
                curveTo(15.2091f, 7.0f, 17.0f, 8.7909f, 17.0f, 11.0f)
                curveTo(17.0f, 11.5523f, 16.5523f, 12.0f, 16.0f, 12.0f)
                curveTo(15.4477f, 12.0f, 15.0f, 11.5523f, 15.0f, 11.0f)
                curveTo(15.0f, 9.8954f, 14.1046f, 9.0f, 13.0f, 9.0f)
                curveTo(12.4477f, 9.0f, 12.0f, 8.5523f, 12.0f, 8.0f)
                close()
            }
        }.build()
        return phoneCall!!
    }

private var phoneCall: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PhoneCall,
                contentDescription = ""
            )
        }
    }
}