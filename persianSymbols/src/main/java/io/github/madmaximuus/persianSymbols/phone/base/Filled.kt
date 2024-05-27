package io.github.madmaximuus.persianSymbols.phone.base

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

val PersianSymbols.Filled.Phone: ImageVector
    get() {
        if (phone != null) {
            return phone!!
        }
        phone = Builder(
            name = "phone-filled",
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
                moveTo(4.0456f, 3.001f)
                curveTo(4.0305f, 3.0003f, 4.0153f, 3.0f, 4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                curveTo(3.0f, 14.1307f, 12.0296f, 21.0f, 20.0f, 21.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                curveTo(21.0f, 19.9847f, 20.9997f, 19.9695f, 20.999f, 19.9544f)
                curveTo(20.9997f, 19.9408f, 21.0f, 19.9271f, 21.0f, 19.9133f)
                verticalLineTo(16.904f)
                curveTo(21.0f, 16.0132f, 20.4109f, 15.2298f, 19.5551f, 14.9826f)
                lineTo(17.2954f, 14.3298f)
                curveTo(16.5918f, 14.1265f, 15.8333f, 14.3241f, 15.3183f, 14.8448f)
                lineTo(13.0637f, 17.1245f)
                curveTo(10.5517f, 15.7442f, 8.3217f, 13.6554f, 6.8471f, 11.0384f)
                lineTo(9.1032f, 8.9664f)
                curveTo(9.654f, 8.4606f, 9.8766f, 7.6897f, 9.6802f, 6.968f)
                lineTo(9.0014f, 4.4747f)
                curveTo(8.7645f, 3.6041f, 7.9739f, 3.0f, 7.0717f, 3.0f)
                horizontalLineTo(4.0867f)
                curveTo(4.0729f, 3.0f, 4.0592f, 3.0003f, 4.0456f, 3.001f)
                close()
            }
        }.build()
        return phone!!
    }

private var phone: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Phone,
                contentDescription = ""
            )
        }
    }
}