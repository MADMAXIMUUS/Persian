package io.github.madmaximuus.persianSymbols.address.book

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 5.75f)
                curveTo(9.205f, 5.75f, 7.75f, 7.205f, 7.75f, 9f)
                curveTo(7.75f, 10.795f, 9.205f, 12.25f, 11f, 12.25f)
                curveTo(12.795f, 12.25f, 14.25f, 10.795f, 14.25f, 9f)
                curveTo(14.25f, 7.205f, 12.795f, 5.75f, 11f, 5.75f)
                close()
                moveTo(9.25f, 9f)
                curveTo(9.25f, 8.034f, 10.034f, 7.25f, 11f, 7.25f)
                curveTo(11.967f, 7.25f, 12.75f, 8.034f, 12.75f, 9f)
                curveTo(12.75f, 9.967f, 11.967f, 10.75f, 11f, 10.75f)
                curveTo(10.034f, 10.75f, 9.25f, 9.967f, 9.25f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 12.75f)
                curveTo(8.781f, 12.75f, 6.92f, 14.271f, 6.397f, 16.325f)
                curveTo(6.106f, 17.466f, 7.103f, 18.25f, 8f, 18.25f)
                horizontalLineTo(14f)
                curveTo(14.897f, 18.25f, 15.894f, 17.466f, 15.603f, 16.325f)
                curveTo(15.08f, 14.271f, 13.219f, 12.75f, 11f, 12.75f)
                close()
                moveTo(7.854f, 16.696f)
                lineTo(7.851f, 16.693f)
                curveTo(8.21f, 15.288f, 9.485f, 14.25f, 11f, 14.25f)
                curveTo(12.516f, 14.25f, 13.79f, 15.288f, 14.149f, 16.693f)
                lineTo(14.146f, 16.696f)
                curveTo(14.126f, 16.719f, 14.074f, 16.75f, 14f, 16.75f)
                horizontalLineTo(8f)
                curveTo(7.926f, 16.75f, 7.874f, 16.719f, 7.854f, 16.696f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6.5f)
                curveTo(3f, 4.015f, 5.015f, 2f, 7.5f, 2f)
                horizontalLineTo(14.5f)
                curveTo(16.985f, 2f, 19f, 4.015f, 19f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(19f, 19.985f, 16.985f, 22f, 14.5f, 22f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 22f, 3f, 19.985f, 3f, 17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(7.5f, 4f)
                curveTo(6.119f, 4f, 5f, 5.119f, 5f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(5f, 18.881f, 6.119f, 20f, 7.5f, 20f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 20f, 17f, 18.881f, 17f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(17f, 5.119f, 15.881f, 4f, 14.5f, 4f)
                horizontalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 8f)
                curveTo(20f, 8.552f, 20.448f, 9f, 21f, 9f)
                curveTo(21.552f, 9f, 22f, 8.552f, 22f, 8f)
                verticalLineTo(6f)
                curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
                curveTo(20.448f, 5f, 20f, 5.448f, 20f, 6f)
                verticalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 13f)
                curveTo(20f, 13.552f, 20.448f, 14f, 21f, 14f)
                curveTo(21.552f, 14f, 22f, 13.552f, 22f, 13f)
                verticalLineTo(11f)
                curveTo(22f, 10.448f, 21.552f, 10f, 21f, 10f)
                curveTo(20.448f, 10f, 20f, 10.448f, 20f, 11f)
                verticalLineTo(13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 19f)
                curveTo(20.448f, 19f, 20f, 18.552f, 20f, 18f)
                verticalLineTo(16f)
                curveTo(20f, 15.448f, 20.448f, 15f, 21f, 15f)
                curveTo(21.552f, 15f, 22f, 15.448f, 22f, 16f)
                verticalLineTo(18f)
                curveTo(22f, 18.552f, 21.552f, 19f, 21f, 19f)
                close()
            }
        }.build()
        return addressBook!!
    }

private var addressBook: ImageVector? = null