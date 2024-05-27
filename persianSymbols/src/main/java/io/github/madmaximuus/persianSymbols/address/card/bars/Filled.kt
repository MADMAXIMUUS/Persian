package io.github.madmaximuus.persianSymbols.address.card.bars

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

val PersianSymbols.Filled.AddressCardBars: ImageVector
    get() {
        if (addressCardBars != null) {
            return addressCardBars!!
        }
        addressCardBars = Builder(
            name = "address-card-bars-filled",
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
                moveTo(7.8469f, 12.0f)
                curveTo(7.8469f, 11.4477f, 8.2946f, 11.0f, 8.8469f, 11.0f)
                curveTo(9.3992f, 11.0f, 9.8469f, 11.4477f, 9.8469f, 12.0f)
                curveTo(9.8469f, 12.5523f, 9.3992f, 13.0f, 8.8469f, 13.0f)
                curveTo(8.2946f, 13.0f, 7.8469f, 12.5523f, 7.8469f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 8.4f)
                curveTo(2.0f, 5.97f, 3.9699f, 4.0f, 6.4f, 4.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 4.0f, 22.0f, 5.97f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 18.0301f, 20.0301f, 20.0f, 17.6f, 20.0f)
                horizontalLineTo(13.8469f)
                curveTo(13.8469f, 18.7862f, 13.1886f, 17.7636f, 12.2754f, 17.0787f)
                curveTo(11.3624f, 16.3939f, 10.1469f, 16.0f, 8.8469f, 16.0f)
                curveTo(7.5469f, 16.0f, 6.3315f, 16.3939f, 5.4185f, 17.0787f)
                curveTo(4.7017f, 17.6163f, 4.1419f, 18.3619f, 3.9343f, 19.2447f)
                curveTo(2.767f, 18.4535f, 2.0f, 17.1163f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(8.8469f, 9.0f)
                curveTo(7.1901f, 9.0f, 5.8469f, 10.3431f, 5.8469f, 12.0f)
                curveTo(5.8469f, 13.6569f, 7.1901f, 15.0f, 8.8469f, 15.0f)
                curveTo(10.5038f, 15.0f, 11.8469f, 13.6569f, 11.8469f, 12.0f)
                curveTo(11.8469f, 10.3431f, 10.5038f, 9.0f, 8.8469f, 9.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveTo(14.0f, 9.4477f, 14.4477f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 9.0f, 20.0f, 9.4477f, 20.0f, 10.0f)
                curveTo(20.0f, 10.5523f, 19.5523f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 11.0f, 14.0f, 10.5523f, 14.0f, 10.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveTo(14.0f, 12.4477f, 14.4477f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 12.0f, 18.0f, 12.4477f, 18.0f, 13.0f)
                curveTo(18.0f, 13.5523f, 17.5523f, 14.0f, 17.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 14.0f, 14.0f, 13.5523f, 14.0f, 13.0f)
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
                moveTo(11.0754f, 18.6787f)
                curveTo(11.6098f, 19.0795f, 11.8469f, 19.5569f, 11.8469f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(6.2128f, 20.0f, 6.0284f, 19.9883f, 5.8474f, 19.9656f)
                curveTo(5.8594f, 19.5323f, 6.0978f, 19.0692f, 6.6185f, 18.6787f)
                curveTo(7.1532f, 18.2776f, 7.9378f, 18.0f, 8.8469f, 18.0f)
                curveTo(9.7561f, 18.0f, 10.5406f, 18.2776f, 11.0754f, 18.6787f)
                close()
            }
        }.build()
        return addressCardBars!!
    }

private var addressCardBars: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.AddressCardBars,
                contentDescription = ""
            )
        }
    }
}