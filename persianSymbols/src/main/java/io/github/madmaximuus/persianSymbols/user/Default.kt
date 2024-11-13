package io.github.madmaximuus.persianSymbols.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.User: ImageVector
    get() {
        if (user != null) {
            return user!!
        }
        user = Builder(
            name = "user-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.99f, 3f)
                curveTo(9.505f, 3f, 7.49f, 5.015f, 7.49f, 7.5f)
                curveTo(7.49f, 9.985f, 9.505f, 12f, 11.99f, 12f)
                curveTo(14.475f, 12f, 16.49f, 9.985f, 16.49f, 7.5f)
                curveTo(16.49f, 5.015f, 14.475f, 3f, 11.99f, 3f)
                close()
                moveTo(9.49f, 7.5f)
                curveTo(9.49f, 6.119f, 10.609f, 5f, 11.99f, 5f)
                curveTo(13.371f, 5f, 14.49f, 6.119f, 14.49f, 7.5f)
                curveTo(14.49f, 8.881f, 13.371f, 10f, 11.99f, 10f)
                curveTo(10.609f, 10f, 9.49f, 8.881f, 9.49f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.995f, 13f)
                curveTo(9.24f, 13f, 6.764f, 14.222f, 5.314f, 16.145f)
                curveTo(4.896f, 16.699f, 4.693f, 17.321f, 4.723f, 17.954f)
                curveTo(4.752f, 18.577f, 5.004f, 19.133f, 5.364f, 19.58f)
                curveTo(6.071f, 20.457f, 7.255f, 21f, 8.495f, 21f)
                horizontalLineTo(15.495f)
                curveTo(16.736f, 21f, 17.92f, 20.457f, 18.627f, 19.58f)
                curveTo(18.987f, 19.133f, 19.239f, 18.577f, 19.268f, 17.954f)
                curveTo(19.298f, 17.321f, 19.095f, 16.699f, 18.677f, 16.145f)
                curveTo(17.226f, 14.222f, 14.751f, 13f, 11.995f, 13f)
                close()
                moveTo(6.911f, 17.35f)
                curveTo(7.953f, 15.967f, 9.816f, 15f, 11.995f, 15f)
                curveTo(14.175f, 15f, 16.038f, 15.967f, 17.08f, 17.35f)
                curveTo(17.245f, 17.568f, 17.276f, 17.738f, 17.27f, 17.86f)
                curveTo(17.264f, 17.991f, 17.209f, 18.152f, 17.07f, 18.325f)
                curveTo(16.777f, 18.688f, 16.188f, 19f, 15.495f, 19f)
                horizontalLineTo(8.495f)
                curveTo(7.803f, 19f, 7.214f, 18.688f, 6.921f, 18.325f)
                curveTo(6.781f, 18.152f, 6.727f, 17.991f, 6.721f, 17.86f)
                curveTo(6.715f, 17.738f, 6.746f, 17.568f, 6.911f, 17.35f)
                close()
            }
        }.build()
        return user!!
    }

private var user: ImageVector? = null