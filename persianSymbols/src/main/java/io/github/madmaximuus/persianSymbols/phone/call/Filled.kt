package io.github.madmaximuus.persianSymbols.phone.call

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Filled.PhoneCall: ImageVector
    get() {
        if (phoneCall != null) {
            return phoneCall!!
        }
        phoneCall = Builder(
            name = "phone-call-filled",
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
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 3.0f)
                curveTo(4.0153f, 3.0f, 4.0305f, 3.0003f, 4.0456f, 3.001f)
                curveTo(4.0592f, 3.0003f, 4.0729f, 3.0f, 4.0867f, 3.0f)
                horizontalLineTo(7.0717f)
                curveTo(7.9739f, 3.0f, 8.7645f, 3.6041f, 9.0014f, 4.4747f)
                lineTo(9.6802f, 6.968f)
                curveTo(9.8766f, 7.6897f, 9.654f, 8.4606f, 9.1032f, 8.9664f)
                lineTo(6.8471f, 11.0384f)
                curveTo(8.3217f, 13.6554f, 10.5517f, 15.7442f, 13.0637f, 17.1245f)
                lineTo(15.3183f, 14.8448f)
                curveTo(15.8333f, 14.3241f, 16.5918f, 14.1265f, 17.2954f, 14.3298f)
                lineTo(19.5551f, 14.9826f)
                curveTo(20.4109f, 15.2298f, 21.0f, 16.0132f, 21.0f, 16.904f)
                verticalLineTo(19.9133f)
                curveTo(21.0f, 19.9271f, 20.9997f, 19.9408f, 20.999f, 19.9544f)
                curveTo(20.9997f, 19.9695f, 21.0f, 19.9847f, 21.0f, 20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                curveTo(12.0296f, 21.0f, 3.0f, 14.1307f, 3.0f, 4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
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
                imageVector = PersianSymbols.Filled.PhoneCall,
                contentDescription = ""
            )
        }
    }
}