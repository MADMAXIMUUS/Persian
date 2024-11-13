package io.github.madmaximuus.persianSymbols.user.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBox: ImageVector
    get() {
        if (userBox != null) {
            return userBox!!
        }
        userBox = Builder(
            name = "user-box-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21f, 5.015f, 18.985f, 3f, 16.5f, 3f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5f, 7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(16.5f)
                curveTo(17.881f, 5f, 19f, 6.119f, 19f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19f, 16.828f, 18.937f, 17.141f, 18.822f, 17.428f)
                curveTo(16.866f, 16.053f, 14.521f, 15.25f, 12f, 15.25f)
                curveTo(9.478f, 15.25f, 7.134f, 16.053f, 5.178f, 17.428f)
                curveTo(5.063f, 17.141f, 5f, 16.828f, 5f, 16.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(6.131f, 18.592f)
                curveTo(6.524f, 18.85f, 6.995f, 19f, 7.5f, 19f)
                horizontalLineTo(16.5f)
                curveTo(17.005f, 19f, 17.476f, 18.85f, 17.869f, 18.592f)
                curveTo(16.169f, 17.423f, 14.156f, 16.75f, 12f, 16.75f)
                curveTo(9.844f, 16.75f, 7.831f, 17.423f, 6.131f, 18.592f)
                close()
                moveTo(12f, 7.25f)
                curveTo(10.481f, 7.25f, 9.25f, 8.481f, 9.25f, 10f)
                curveTo(9.25f, 11.519f, 10.481f, 12.75f, 12f, 12.75f)
                curveTo(13.519f, 12.75f, 14.75f, 11.519f, 14.75f, 10f)
                curveTo(14.75f, 8.481f, 13.519f, 7.25f, 12f, 7.25f)
                close()
                moveTo(7.75f, 10f)
                curveTo(7.75f, 7.653f, 9.653f, 5.75f, 12f, 5.75f)
                curveTo(14.347f, 5.75f, 16.25f, 7.653f, 16.25f, 10f)
                curveTo(16.25f, 12.347f, 14.347f, 14.25f, 12f, 14.25f)
                curveTo(9.653f, 14.25f, 7.75f, 12.347f, 7.75f, 10f)
                close()
            }
        }.build()
        return userBox!!
    }

private var userBox: ImageVector? = null