package io.github.madmaximuus.persianSymbols.user.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserPlus: ImageVector
    get() {
        if (userPlus != null) {
            return userPlus!!
        }
        userPlus = Builder(
            name = "user-plus-default",
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
                curveTo(11.85f, 15.5f, 12.186f, 15.524f, 12.512f, 15.57f)
                curveTo(12.81f, 14.898f, 13.228f, 14.291f, 13.739f, 13.776f)
                curveTo(13.027f, 13.596f, 12.277f, 13.5f, 11.505f, 13.5f)
                curveTo(8.75f, 13.5f, 6.274f, 14.722f, 4.824f, 16.645f)
                curveTo(4.406f, 17.199f, 4.203f, 17.821f, 4.233f, 18.454f)
                curveTo(4.262f, 19.077f, 4.514f, 19.633f, 4.874f, 20.08f)
                curveTo(5.581f, 20.957f, 6.765f, 21.5f, 8.005f, 21.5f)
                horizontalLineTo(13.126f)
                curveTo(12.698f, 20.906f, 12.377f, 20.23f, 12.189f, 19.5f)
                horizontalLineTo(8.005f)
                curveTo(7.313f, 19.5f, 6.724f, 19.188f, 6.431f, 18.825f)
                curveTo(6.291f, 18.652f, 6.237f, 18.491f, 6.231f, 18.36f)
                curveTo(6.225f, 18.238f, 6.256f, 18.068f, 6.421f, 17.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.5f)
                curveTo(18.414f, 15.5f, 18.75f, 15.836f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 17.25f, 20.5f, 17.586f, 20.5f, 18f)
                curveTo(20.5f, 18.414f, 20.164f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.164f, 18.414f, 20.5f, 18f, 20.5f)
                curveTo(17.586f, 20.5f, 17.25f, 20.164f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 18.75f, 15.5f, 18.414f, 15.5f, 18f)
                curveTo(15.5f, 17.586f, 15.836f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.836f, 17.586f, 15.5f, 18f, 15.5f)
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
        return userPlus!!
    }

private var userPlus: ImageVector? = null