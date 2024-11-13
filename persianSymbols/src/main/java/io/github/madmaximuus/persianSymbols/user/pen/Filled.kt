package io.github.madmaximuus.persianSymbols.user.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserPen: ImageVector
    get() {
        if (userPen != null) {
            return userPen!!
        }
        userPen = Builder(
            name = "user-pen-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 12.5f)
                curveTo(13.985f, 12.5f, 16f, 10.485f, 16f, 8f)
                curveTo(16f, 5.515f, 13.985f, 3.5f, 11.5f, 3.5f)
                curveTo(9.015f, 3.5f, 7f, 5.515f, 7f, 8f)
                curveTo(7f, 10.485f, 9.015f, 12.5f, 11.5f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.678f, 17.318f)
                curveTo(6.085f, 15.028f, 8.613f, 13.5f, 11.499f, 13.5f)
                curveTo(12.745f, 13.5f, 13.925f, 13.785f, 14.977f, 14.294f)
                lineTo(12.867f, 16.404f)
                curveTo(12.483f, 16.788f, 12.222f, 17.277f, 12.115f, 17.809f)
                lineTo(11.614f, 20.312f)
                curveTo(11.531f, 20.731f, 11.567f, 21.136f, 11.696f, 21.5f)
                horizontalLineTo(7.899f)
                curveTo(5.469f, 21.5f, 3.406f, 19.389f, 4.678f, 17.318f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.603f, 13.083f)
                curveTo(18.286f, 12.399f, 19.394f, 12.399f, 20.078f, 13.083f)
                lineTo(21.492f, 14.497f)
                curveTo(22.175f, 15.18f, 22.175f, 16.288f, 21.492f, 16.972f)
                lineTo(17.463f, 21f)
                curveTo(17.219f, 21.244f, 16.908f, 21.411f, 16.569f, 21.479f)
                lineTo(14.066f, 21.979f)
                curveTo(13.191f, 22.154f, 12.42f, 21.383f, 12.595f, 20.508f)
                lineTo(13.096f, 18.005f)
                curveTo(13.163f, 17.667f, 13.33f, 17.355f, 13.574f, 17.111f)
                lineTo(17.603f, 13.083f)
                close()
                moveTo(14.635f, 18.172f)
                lineTo(17.194f, 15.613f)
                lineTo(18.962f, 17.381f)
                lineTo(16.403f, 19.94f)
                curveTo(16.368f, 19.974f, 16.323f, 19.998f, 16.275f, 20.008f)
                lineTo(14.139f, 20.435f)
                lineTo(14.566f, 18.299f)
                curveTo(14.576f, 18.251f, 14.6f, 18.207f, 14.635f, 18.172f)
                close()
            }
        }.build()
        return userPen!!
    }

private var userPen: ImageVector? = null