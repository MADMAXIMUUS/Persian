package io.github.madmaximuus.persianSymbols.user.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserCircle: ImageVector
    get() {
        if (userCircle != null) {
            return userCircle!!
        }
        userCircle = Builder(
            name = "user-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.75f, 10f)
                curveTo(7.75f, 7.653f, 9.653f, 5.75f, 12f, 5.75f)
                curveTo(14.347f, 5.75f, 16.25f, 7.653f, 16.25f, 10f)
                curveTo(16.25f, 12.347f, 14.347f, 14.25f, 12f, 14.25f)
                curveTo(9.653f, 14.25f, 7.75f, 12.347f, 7.75f, 10f)
                close()
                moveTo(12f, 7.25f)
                curveTo(10.481f, 7.25f, 9.25f, 8.481f, 9.25f, 10f)
                curveTo(9.25f, 11.519f, 10.481f, 12.75f, 12f, 12.75f)
                curveTo(13.519f, 12.75f, 14.75f, 11.519f, 14.75f, 10f)
                curveTo(14.75f, 8.481f, 13.519f, 7.25f, 12f, 7.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 13.906f, 19.333f, 15.657f, 18.22f, 17.031f)
                curveTo(16.392f, 15.9f, 14.268f, 15.25f, 12f, 15.25f)
                curveTo(9.732f, 15.25f, 7.608f, 15.9f, 5.78f, 17.031f)
                curveTo(4.667f, 15.657f, 4f, 13.906f, 4f, 12f)
                close()
                moveTo(6.861f, 18.132f)
                curveTo(8.251f, 19.298f, 10.044f, 20f, 12f, 20f)
                curveTo(13.956f, 20f, 15.748f, 19.298f, 17.139f, 18.132f)
                curveTo(15.604f, 17.248f, 13.855f, 16.75f, 12f, 16.75f)
                curveTo(10.145f, 16.75f, 8.396f, 17.248f, 6.861f, 18.132f)
                close()
            }
        }.build()
        return userCircle!!
    }

private var userCircle: ImageVector? = null