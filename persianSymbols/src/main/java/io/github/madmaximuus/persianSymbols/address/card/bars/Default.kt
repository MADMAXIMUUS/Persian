package io.github.madmaximuus.persianSymbols.address.card.bars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.AddressCardBars: ImageVector
    get() {
        if (addressCardBars != null) {
            return addressCardBars!!
        }
        addressCardBars = Builder(
            name = "address-card-bars-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.847f, 8.75f)
                curveTo(7.328f, 8.75f, 6.097f, 9.981f, 6.097f, 11.5f)
                curveTo(6.097f, 13.019f, 7.328f, 14.25f, 8.847f, 14.25f)
                curveTo(10.366f, 14.25f, 11.597f, 13.019f, 11.597f, 11.5f)
                curveTo(11.597f, 9.981f, 10.366f, 8.75f, 8.847f, 8.75f)
                close()
                moveTo(7.597f, 11.5f)
                curveTo(7.597f, 10.81f, 8.157f, 10.25f, 8.847f, 10.25f)
                curveTo(9.537f, 10.25f, 10.097f, 10.81f, 10.097f, 11.5f)
                curveTo(10.097f, 12.19f, 9.537f, 12.75f, 8.847f, 12.75f)
                curveTo(8.157f, 12.75f, 7.597f, 12.19f, 7.597f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.25f, 10f)
                curveTo(13.25f, 9.586f, 13.586f, 9.25f, 14f, 9.25f)
                horizontalLineTo(18f)
                curveTo(18.414f, 9.25f, 18.75f, 9.586f, 18.75f, 10f)
                curveTo(18.75f, 10.414f, 18.414f, 10.75f, 18f, 10.75f)
                horizontalLineTo(14f)
                curveTo(13.586f, 10.75f, 13.25f, 10.414f, 13.25f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.25f, 13f)
                curveTo(13.25f, 12.586f, 13.586f, 12.25f, 14f, 12.25f)
                horizontalLineTo(16f)
                curveTo(16.414f, 12.25f, 16.75f, 12.586f, 16.75f, 13f)
                curveTo(16.75f, 13.414f, 16.414f, 13.75f, 16f, 13.75f)
                horizontalLineTo(14f)
                curveTo(13.586f, 13.75f, 13.25f, 13.414f, 13.25f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.5f)
                curveTo(2f, 6.015f, 4.015f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 4f, 22f, 6.015f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(6.5f, 6f)
                curveTo(5.119f, 6f, 4f, 7.119f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.158f, 4.254f, 16.756f, 4.669f, 17.202f)
                curveTo(5.503f, 15.984f, 7.128f, 15.25f, 8.847f, 15.25f)
                curveTo(10.098f, 15.25f, 11.26f, 15.629f, 12.125f, 16.279f)
                curveTo(12.719f, 16.724f, 13.191f, 17.313f, 13.429f, 18f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 18f, 20f, 16.881f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 7.119f, 18.881f, 6f, 17.5f, 6f)
                horizontalLineTo(6.5f)
                close()
                moveTo(6.5f, 18f)
                curveTo(6.324f, 18f, 6.152f, 17.982f, 5.987f, 17.947f)
                curveTo(6.509f, 17.282f, 7.534f, 16.75f, 8.847f, 16.75f)
                curveTo(9.805f, 16.75f, 10.643f, 17.042f, 11.225f, 17.479f)
                curveTo(11.44f, 17.639f, 11.615f, 17.815f, 11.75f, 18f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return addressCardBars!!
    }

private var addressCardBars: ImageVector? = null