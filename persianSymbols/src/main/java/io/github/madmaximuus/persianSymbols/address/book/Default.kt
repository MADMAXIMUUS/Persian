package io.github.madmaximuus.persianSymbols.address.book

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.AddressBook: ImageVector
    get() {
        if (addressBook != null) {
            return addressBook!!
        }
        addressBook = ImageVector.Builder(
            name = "address-book-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.0002f, 5f)
                curveTo(9.0671f, 5f, 7.5001f, 6.567f, 7.5001f, 8.5f)
                curveTo(7.5001f, 10.433f, 9.0671f, 12f, 11.0002f, 12f)
                curveTo(12.9331f, 12f, 14.5002f, 10.433f, 14.5002f, 8.5f)
                curveTo(14.5002f, 6.567f, 12.9331f, 5f, 11.0002f, 5f)
                close()
                moveTo(9.50015f, 8.5f)
                curveTo(9.5001f, 7.6716f, 10.1717f, 7f, 11.0002f, 7f)
                curveTo(11.8286f, 7f, 12.5002f, 7.6716f, 12.5002f, 8.5f)
                curveTo(12.5002f, 9.3284f, 11.8286f, 10f, 11.0002f, 10f)
                curveTo(10.1717f, 10f, 9.5001f, 9.3284f, 9.5001f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 12.5f)
                curveTo(8.6643f, 12.5f, 6.705f, 14.1006f, 6.1544f, 16.2634f)
                curveTo(5.8126f, 17.6057f, 6.9883f, 18.5f, 8f, 18.5f)
                horizontalLineTo(14f)
                curveTo(15.0117f, 18.5f, 16.1874f, 17.6057f, 15.8457f, 16.2634f)
                curveTo(15.2951f, 14.1006f, 13.3357f, 12.5f, 11f, 12.5f)
                close()
                moveTo(11f, 14.5f)
                curveTo(12.3053f, 14.5f, 13.4178f, 15.3344f, 13.8296f, 16.5f)
                horizontalLineTo(8.17043f)
                curveTo(8.5822f, 15.3344f, 9.6948f, 14.5f, 11f, 14.5f)
                close()
                moveTo(14f, 16.5f)
                curveTo(14.0022f, 16.5f, 14.0021f, 16.4996f, 14f, 16.5f)
                close()
                moveTo(8.00011f, 16.5f)
                curveTo(7.998f, 16.4996f, 7.998f, 16.5f, 8.0001f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6.49988f)
                curveTo(3f, 4.0146f, 5.0147f, 1.9999f, 7.5f, 1.9999f)
                horizontalLineTo(14.5f)
                curveTo(16.9853f, 1.9999f, 19f, 4.0146f, 19f, 6.4999f)
                verticalLineTo(17.4999f)
                curveTo(19f, 19.9852f, 16.9853f, 21.9999f, 14.5f, 21.9999f)
                horizontalLineTo(7.5f)
                curveTo(5.0147f, 21.9999f, 3f, 19.9852f, 3f, 17.4999f)
                verticalLineTo(6.49988f)
                close()
                moveTo(7.5f, 3.99988f)
                curveTo(6.1193f, 3.9999f, 5f, 5.1192f, 5f, 6.4999f)
                verticalLineTo(17.4999f)
                curveTo(5f, 18.8806f, 6.1193f, 19.9999f, 7.5f, 19.9999f)
                horizontalLineTo(14.5f)
                curveTo(15.8807f, 19.9999f, 17f, 18.8806f, 17f, 17.4999f)
                verticalLineTo(6.49988f)
                curveTo(17f, 5.1192f, 15.8807f, 3.9999f, 14.5f, 3.9999f)
                horizontalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20f, 8f)
                curveTo(20f, 8.5523f, 20.4477f, 9f, 21f, 9f)
                curveTo(21.5523f, 9f, 22f, 8.5523f, 22f, 8f)
                verticalLineTo(5.99988f)
                curveTo(22f, 5.4476f, 21.5523f, 4.9999f, 21f, 4.9999f)
                curveTo(20.4477f, 4.9999f, 20f, 5.4476f, 20f, 5.9999f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(19.9999f, 13f)
                curveTo(19.9999f, 13.5523f, 20.4477f, 14f, 20.9999f, 14f)
                curveTo(21.5522f, 14f, 21.9999f, 13.5523f, 21.9999f, 13f)
                verticalLineTo(10.9999f)
                curveTo(21.9999f, 10.4476f, 21.5522f, 9.9999f, 20.9999f, 9.9999f)
                curveTo(20.4477f, 9.9999f, 19.9999f, 10.4476f, 19.9999f, 10.9999f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20.9999f, 18.9999f)
                curveTo(20.4476f, 18.9999f, 19.9999f, 18.5522f, 19.9999f, 17.9999f)
                verticalLineTo(15.9999f)
                curveTo(19.9999f, 15.4476f, 20.4476f, 14.9999f, 20.9999f, 14.9999f)
                curveTo(21.5522f, 14.9999f, 21.9999f, 15.4476f, 21.9999f, 15.9999f)
                verticalLineTo(17.9999f)
                curveTo(21.9999f, 18.5522f, 21.5522f, 18.9999f, 20.9999f, 18.9999f)
                close()
            }
        }.build()
        return addressBook!!
    }

private var addressBook: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.AddressBook,
                contentDescription = ""
            )
        }
    }
}