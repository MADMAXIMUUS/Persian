package io.github.madmaximuus.persianSymbols.user.pen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserPen: ImageVector
    get() {
        if (userPen != null) {
            return userPen!!
        }
        userPen = Builder(
            name = "user-pen-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.5f, 3.5f)
                curveTo(9.015f, 3.5f, 7f, 5.515f, 7f, 8f)
                curveTo(7f, 10.485f, 9.015f, 12.5f, 11.5f, 12.5f)
                curveTo(13.985f, 12.5f, 16f, 10.485f, 16f, 8f)
                curveTo(16f, 5.515f, 13.985f, 3.5f, 11.5f, 3.5f)
                close()
                moveTo(9f, 8f)
                curveTo(9f, 6.619f, 10.119f, 5.5f, 11.5f, 5.5f)
                curveTo(12.881f, 5.5f, 14f, 6.619f, 14f, 8f)
                curveTo(14f, 9.381f, 12.881f, 10.5f, 11.5f, 10.5f)
                curveTo(10.119f, 10.5f, 9f, 9.381f, 9f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.421f, 17.85f)
                curveTo(7.463f, 16.467f, 9.326f, 15.5f, 11.505f, 15.5f)
                curveTo(12.205f, 15.5f, 12.872f, 15.6f, 13.49f, 15.781f)
                lineTo(15.05f, 14.221f)
                curveTo(13.975f, 13.757f, 12.77f, 13.5f, 11.505f, 13.5f)
                curveTo(8.75f, 13.5f, 6.274f, 14.722f, 4.824f, 16.645f)
                curveTo(4.406f, 17.199f, 4.203f, 17.821f, 4.233f, 18.454f)
                curveTo(4.262f, 19.077f, 4.514f, 19.633f, 4.874f, 20.08f)
                curveTo(5.581f, 20.957f, 6.765f, 21.5f, 8.005f, 21.5f)
                horizontalLineTo(11.696f)
                curveTo(11.567f, 21.136f, 11.531f, 20.731f, 11.614f, 20.312f)
                lineTo(11.777f, 19.5f)
                horizontalLineTo(8.005f)
                curveTo(7.313f, 19.5f, 6.724f, 19.188f, 6.431f, 18.825f)
                curveTo(6.291f, 18.652f, 6.237f, 18.491f, 6.231f, 18.36f)
                curveTo(6.225f, 18.238f, 6.256f, 18.068f, 6.421f, 17.85f)
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