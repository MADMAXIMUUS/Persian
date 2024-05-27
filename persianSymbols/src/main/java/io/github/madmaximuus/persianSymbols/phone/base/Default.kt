package io.github.madmaximuus.persianSymbols.phone.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(6.8288f)
                curveTo(7.976f, 3.0f, 8.976f, 3.7807f, 9.2542f, 4.8937f)
                lineTo(9.7642f, 6.9335f)
                curveTo(9.9771f, 7.7855f, 9.7275f, 8.6867f, 9.1066f, 9.3076f)
                lineTo(7.0414f, 11.3728f)
                curveTo(8.4386f, 13.7078f, 10.4419f, 15.6007f, 12.6969f, 16.9168f)
                lineTo(14.9443f, 14.8299f)
                curveTo(15.573f, 14.2461f, 16.4572f, 14.0255f, 17.2865f, 14.2455f)
                lineTo(19.1411f, 14.7375f)
                curveTo(20.237f, 15.0283f, 21.0f, 16.0201f, 21.0f, 17.1539f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                curveTo(12.0296f, 21.0f, 3.0f, 14.1307f, 3.0f, 4.0f)
                close()
                moveTo(6.0927f, 9.4931f)
                curveTo(5.5157f, 8.1082f, 5.144f, 6.6033f, 5.0341f, 5.0f)
                horizontalLineTo(6.8288f)
                curveTo(7.0583f, 5.0f, 7.2583f, 5.1561f, 7.3139f, 5.3787f)
                lineTo(7.8239f, 7.4186f)
                curveTo(7.8665f, 7.589f, 7.8165f, 7.7692f, 7.6924f, 7.8934f)
                lineTo(6.0927f, 9.4931f)
                close()
                moveTo(19.0f, 18.9594f)
                curveTo(17.5326f, 18.8414f, 16.0429f, 18.4683f, 14.6097f, 17.8699f)
                lineTo(16.3052f, 16.2955f)
                curveTo(16.431f, 16.1787f, 16.6078f, 16.1346f, 16.7737f, 16.1786f)
                lineTo(18.6282f, 16.6707f)
                curveTo(18.8474f, 16.7288f, 19.0f, 16.9272f, 19.0f, 17.1539f)
                verticalLineTo(18.9594f)
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
                imageVector = PersianSymbols.Default.Phone,
                contentDescription = ""
            )
        }
    }
}