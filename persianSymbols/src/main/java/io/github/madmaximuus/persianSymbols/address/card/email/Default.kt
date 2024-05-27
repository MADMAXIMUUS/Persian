package io.github.madmaximuus.persianSymbols.address.card.email

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

val PersianSymbols.Default.AddressCardEmail: ImageVector
    get() {
        if (addressCardEmail != null) {
            return addressCardEmail!!
        }
        addressCardEmail = Builder(
            name = "address-card-email-default",
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
                pathFillType = EvenOdd
            ) {
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 9.4477f, 13.4477f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 9.0f, 19.0f, 9.4477f, 19.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 12.5523f, 18.5523f, 13.0f, 18.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.5528f, 9.7764f)
                curveTo(13.6763f, 9.5294f, 13.9766f, 9.4293f, 14.2236f, 9.5528f)
                lineTo(16.0f, 10.441f)
                lineTo(17.7764f, 9.5528f)
                curveTo(18.0234f, 9.4293f, 18.3237f, 9.5294f, 18.4472f, 9.7764f)
                curveTo(18.5707f, 10.0234f, 18.4706f, 10.3237f, 18.2236f, 10.4472f)
                lineTo(16.2236f, 11.4472f)
                curveTo(16.0828f, 11.5176f, 15.9172f, 11.5176f, 15.7764f, 11.4472f)
                lineTo(13.7764f, 10.4472f)
                curveTo(13.5294f, 10.3237f, 13.4293f, 10.0234f, 13.5528f, 9.7764f)
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
                moveTo(2.0f, 8.5f)
                curveTo(2.0f, 6.0147f, 4.0147f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 4.0f, 22.0f, 6.0147f, 22.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 17.9853f, 19.9853f, 20.0f, 17.5f, 20.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 20.0f, 2.0f, 17.9853f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6.0f)
                curveTo(5.1193f, 6.0f, 4.0f, 7.1193f, 4.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 16.0644f, 4.187f, 16.5851f, 4.5025f, 17.0035f)
                curveTo(5.4037f, 15.7362f, 7.098f, 15.0f, 8.8469f, 15.0f)
                curveTo(10.147f, 15.0f, 11.3624f, 15.3939f, 12.2754f, 16.0787f)
                curveTo(12.925f, 16.5659f, 13.4456f, 17.2239f, 13.692f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 18.0f, 20.0f, 16.8807f, 20.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20.0f, 7.1193f, 18.8807f, 6.0f, 17.5f, 6.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(6.5f, 18.0f)
                curveTo(6.4253f, 18.0f, 6.3513f, 17.9967f, 6.2783f, 17.9903f)
                curveTo(6.7694f, 17.4477f, 7.6666f, 17.0f, 8.8469f, 17.0f)
                curveTo(9.7561f, 17.0f, 10.5406f, 17.2776f, 11.0754f, 17.6787f)
                curveTo(11.2123f, 17.7814f, 11.3297f, 17.8891f, 11.4286f, 18.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return addressCardEmail!!
    }

private var addressCardEmail: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.AddressCardEmail,
                contentDescription = ""
            )
        }
    }
}