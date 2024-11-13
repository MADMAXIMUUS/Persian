package io.github.madmaximuus.persianSymbols.address.card.email

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.AddressCardEmail: ImageVector
    get() {
        if (addressCardEmail != null) {
            return addressCardEmail!!
        }
        addressCardEmail = Builder(
            name = "address-card-email-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.597f, 12.5f)
                curveTo(7.597f, 11.81f, 8.157f, 11.25f, 8.847f, 11.25f)
                curveTo(9.537f, 11.25f, 10.097f, 11.81f, 10.097f, 12.5f)
                curveTo(10.097f, 13.19f, 9.537f, 13.75f, 8.847f, 13.75f)
                curveTo(8.157f, 13.75f, 7.597f, 13.19f, 7.597f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.329f, 9.665f)
                curveTo(13.514f, 9.294f, 13.965f, 9.144f, 14.335f, 9.329f)
                lineTo(16f, 10.161f)
                lineTo(17.665f, 9.329f)
                curveTo(18.035f, 9.144f, 18.486f, 9.294f, 18.671f, 9.665f)
                curveTo(18.856f, 10.035f, 18.706f, 10.486f, 18.335f, 10.671f)
                lineTo(16.335f, 11.671f)
                curveTo(16.124f, 11.776f, 15.876f, 11.776f, 15.665f, 11.671f)
                lineTo(13.665f, 10.671f)
                curveTo(13.294f, 10.486f, 13.144f, 10.035f, 13.329f, 9.665f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(13.597f)
                curveTo(13.597f, 18.883f, 12.991f, 17.928f, 12.125f, 17.279f)
                curveTo(11.26f, 16.629f, 10.098f, 16.25f, 8.847f, 16.25f)
                curveTo(7.596f, 16.25f, 6.434f, 16.629f, 5.569f, 17.279f)
                curveTo(4.866f, 17.806f, 4.334f, 18.534f, 4.159f, 19.387f)
                curveTo(2.866f, 18.621f, 2f, 17.212f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(8.847f, 9.75f)
                curveTo(7.328f, 9.75f, 6.097f, 10.981f, 6.097f, 12.5f)
                curveTo(6.097f, 14.019f, 7.328f, 15.25f, 8.847f, 15.25f)
                curveTo(10.366f, 15.25f, 11.597f, 14.019f, 11.597f, 12.5f)
                curveTo(11.597f, 10.981f, 10.366f, 9.75f, 8.847f, 9.75f)
                close()
                moveTo(12.5f, 10f)
                curveTo(12.5f, 9.448f, 12.948f, 9f, 13.5f, 9f)
                horizontalLineTo(18.5f)
                curveTo(19.052f, 9f, 19.5f, 9.448f, 19.5f, 10f)
                verticalLineTo(13f)
                curveTo(19.5f, 13.552f, 19.052f, 14f, 18.5f, 14f)
                horizontalLineTo(13.5f)
                curveTo(12.948f, 14f, 12.5f, 13.552f, 12.5f, 13f)
                verticalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.225f, 18.479f)
                curveTo(11.807f, 18.915f, 12.097f, 19.461f, 12.097f, 20f)
                horizontalLineTo(6.4f)
                curveTo(6.126f, 20f, 5.859f, 19.975f, 5.599f, 19.927f)
                curveTo(5.624f, 19.412f, 5.913f, 18.895f, 6.469f, 18.479f)
                curveTo(7.051f, 18.042f, 7.889f, 17.75f, 8.847f, 17.75f)
                curveTo(9.805f, 17.75f, 10.643f, 18.042f, 11.225f, 18.479f)
                close()
            }
        }.build()
        return addressCardEmail!!
    }

private var addressCardEmail: ImageVector? = null