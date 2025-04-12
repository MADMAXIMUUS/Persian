package io.github.madmaximuus.persianSymbols.user.badge.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBadgeMinus: ImageVector
    get() {
        if (userBadgeMinus != null) {
            return userBadgeMinus!!
        }
        userBadgeMinus = Builder(
            name = "user-badge-minus-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.77f, 7f)
                curveTo(6.77f, 4.515f, 8.785f, 2.5f, 11.27f, 2.5f)
                curveTo(13.755f, 2.5f, 15.77f, 4.515f, 15.77f, 7f)
                curveTo(15.77f, 9.485f, 13.755f, 11.5f, 11.27f, 11.5f)
                curveTo(8.785f, 11.5f, 6.77f, 9.485f, 6.77f, 7f)
                close()
                moveTo(11.27f, 4.5f)
                curveTo(9.889f, 4.5f, 8.77f, 5.619f, 8.77f, 7f)
                curveTo(8.77f, 8.381f, 9.889f, 9.5f, 11.27f, 9.5f)
                curveTo(12.651f, 9.5f, 13.77f, 8.381f, 13.77f, 7f)
                curveTo(13.77f, 5.619f, 12.651f, 4.5f, 11.27f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.275f, 14.5f)
                curveTo(9.096f, 14.5f, 7.233f, 15.467f, 6.191f, 16.85f)
                curveTo(6.026f, 17.068f, 5.995f, 17.238f, 6.001f, 17.36f)
                curveTo(6.007f, 17.491f, 6.061f, 17.652f, 6.201f, 17.825f)
                curveTo(6.494f, 18.188f, 7.083f, 18.5f, 7.775f, 18.5f)
                horizontalLineTo(12.522f)
                curveTo(12.587f, 19.215f, 12.788f, 19.89f, 13.1f, 20.5f)
                horizontalLineTo(7.775f)
                curveTo(6.535f, 20.5f, 5.351f, 19.957f, 4.644f, 19.08f)
                curveTo(4.284f, 18.633f, 4.032f, 18.077f, 4.003f, 17.454f)
                curveTo(3.973f, 16.821f, 4.176f, 16.199f, 4.594f, 15.645f)
                curveTo(6.044f, 13.722f, 8.52f, 12.5f, 11.275f, 12.5f)
                curveTo(12.642f, 12.5f, 13.941f, 12.801f, 15.079f, 13.339f)
                curveTo(14.453f, 13.732f, 13.912f, 14.248f, 13.489f, 14.852f)
                curveTo(12.808f, 14.626f, 12.063f, 14.5f, 11.275f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 17.25f)
                curveTo(16.086f, 17.25f, 15.75f, 17.586f, 15.75f, 18f)
                curveTo(15.75f, 18.414f, 16.086f, 18.75f, 16.5f, 18.75f)
                horizontalLineTo(19.5f)
                curveTo(19.914f, 18.75f, 20.25f, 18.414f, 20.25f, 18f)
                curveTo(20.25f, 17.586f, 19.914f, 17.25f, 19.5f, 17.25f)
                horizontalLineTo(16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()
        return userBadgeMinus!!
    }

private var userBadgeMinus: ImageVector? = null