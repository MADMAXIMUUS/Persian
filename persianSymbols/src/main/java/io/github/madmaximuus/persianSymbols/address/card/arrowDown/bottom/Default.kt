package io.github.madmaximuus.persianSymbols.address.card.arrowDown.bottom

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

val PersianSymbols.Default.AddressCardArrowDownBottom: ImageVector
    get() {
        if (addressCardArrowDownBottom != null) {
            return addressCardArrowDownBottom!!
        }
        addressCardArrowDownBottom = Builder(
            name = "address-card-arrow-down-bottom-default",
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
                moveTo(2.0f, 8.5f)
                curveTo(2.0f, 6.0147f, 4.0147f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 4.0f, 22.0f, 6.0147f, 22.0f, 8.5f)
                verticalLineTo(13.5278f)
                curveTo(21.4229f, 13.0113f, 20.7452f, 12.6048f, 20.0f, 12.3414f)
                verticalLineTo(8.5f)
                curveTo(20.0f, 7.1193f, 18.8807f, 6.0f, 17.5f, 6.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 6.0f, 4.0f, 7.1193f, 4.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 16.0644f, 4.187f, 16.5851f, 4.5025f, 17.0035f)
                curveTo(5.4037f, 15.7362f, 7.098f, 15.0f, 8.8469f, 15.0f)
                curveTo(10.147f, 15.0f, 11.3624f, 15.3939f, 12.2754f, 16.0787f)
                lineTo(12.3064f, 16.1021f)
                curveTo(12.1076f, 16.6986f, 12.0f, 17.3367f, 12.0f, 18.0f)
                curveTo(12.0f, 18.7013f, 12.1203f, 19.3744f, 12.3414f, 20.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 20.0f, 2.0f, 17.9853f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 18.0f)
                curveTo(6.4253f, 18.0f, 6.3513f, 17.9967f, 6.2783f, 17.9903f)
                curveTo(6.7694f, 17.4477f, 7.6666f, 17.0f, 8.8469f, 17.0f)
                curveTo(9.7561f, 17.0f, 10.5406f, 17.2776f, 11.0754f, 17.6787f)
                curveTo(11.2123f, 17.7814f, 11.3297f, 17.8891f, 11.4286f, 18.0f)
                horizontalLineTo(6.5f)
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
                moveTo(16.0f, 12.0f)
                curveTo(16.2087f, 12.0f, 16.4024f, 12.0639f, 16.5627f, 12.1732f)
                curveTo(15.4086f, 12.457f, 14.3858f, 13.0746f, 13.6026f, 13.9179f)
                curveTo(13.248f, 13.7642f, 13.0f, 13.4111f, 13.0f, 13.0f)
                curveTo(13.0f, 12.4477f, 13.4477f, 12.0f, 14.0f, 12.0f)
                horizontalLineTo(16.0f)
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
                moveTo(8.8469f, 8.0f)
                curveTo(7.1901f, 8.0f, 5.847f, 9.3432f, 5.847f, 11.0f)
                curveTo(5.847f, 12.6569f, 7.1901f, 14.0f, 8.8469f, 14.0f)
                curveTo(10.5038f, 14.0f, 11.8469f, 12.6569f, 11.8469f, 11.0f)
                curveTo(11.8469f, 9.3432f, 10.5038f, 8.0f, 8.8469f, 8.0f)
                close()
                moveTo(7.847f, 11.0f)
                curveTo(7.847f, 10.4477f, 8.2947f, 10.0f, 8.8469f, 10.0f)
                curveTo(9.3992f, 10.0f, 9.8469f, 10.4477f, 9.8469f, 11.0f)
                curveTo(9.8469f, 11.5523f, 9.3992f, 12.0f, 8.8469f, 12.0f)
                curveTo(8.2947f, 12.0f, 7.847f, 11.5523f, 7.847f, 11.0f)
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
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 9.4477f, 13.4477f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 9.0f, 19.0f, 9.4477f, 19.0f, 10.0f)
                curveTo(19.0f, 10.5523f, 18.5523f, 11.0f, 18.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 11.0f, 13.0f, 10.5523f, 13.0f, 10.0f)
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
                moveTo(19.5303f, 17.9697f)
                curveTo(19.8232f, 18.2626f, 19.8232f, 18.7374f, 19.5303f, 19.0303f)
                lineTo(18.5303f, 20.0303f)
                curveTo(18.2374f, 20.3232f, 17.7626f, 20.3232f, 17.4697f, 20.0303f)
                lineTo(16.4697f, 19.0303f)
                curveTo(16.1768f, 18.7374f, 16.1768f, 18.2626f, 16.4697f, 17.9697f)
                curveTo(16.6807f, 17.7586f, 16.9862f, 17.6997f, 17.25f, 17.7927f)
                verticalLineTo(16.5f)
                curveTo(17.25f, 16.0858f, 17.5858f, 15.75f, 18.0f, 15.75f)
                curveTo(18.4142f, 15.75f, 18.75f, 16.0858f, 18.75f, 16.5f)
                verticalLineTo(17.7927f)
                curveTo(19.0138f, 17.6997f, 19.3193f, 17.7586f, 19.5303f, 17.9697f)
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
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
            }
        }.build()
        return addressCardArrowDownBottom!!
    }

private var addressCardArrowDownBottom: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.AddressCardArrowDownBottom,
                contentDescription = ""
            )
        }
    }
}