package io.github.madmaximuus.persianSymbols.user.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserCircle: ImageVector
    get() {
        if (userCircle != null) {
            return userCircle!!
        }
        userCircle = Builder(
            name = "user-circle-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.199f, 17.726f)
                curveTo(21.334f, 16.104f, 22f, 14.13f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 14.13f, 2.666f, 16.104f, 3.801f, 17.726f)
                curveTo(6.116f, 16.166f, 8.947f, 15.25f, 12f, 15.25f)
                curveTo(15.053f, 15.25f, 17.884f, 16.166f, 20.199f, 17.726f)
                close()
                moveTo(16.25f, 9.25f)
                curveTo(16.25f, 11.597f, 14.347f, 13.5f, 12f, 13.5f)
                curveTo(9.653f, 13.5f, 7.75f, 11.597f, 7.75f, 9.25f)
                curveTo(7.75f, 6.903f, 9.653f, 5f, 12f, 5f)
                curveTo(14.347f, 5f, 16.25f, 6.903f, 16.25f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.245f, 18.893f)
                curveTo(17.196f, 17.544f, 14.699f, 16.75f, 12f, 16.75f)
                curveTo(9.301f, 16.75f, 6.804f, 17.544f, 4.755f, 18.893f)
                curveTo(6.577f, 20.807f, 9.149f, 22f, 12f, 22f)
                curveTo(14.851f, 22f, 17.423f, 20.807f, 19.245f, 18.893f)
                close()
            }
        }.build()
        return userCircle!!
    }

private var userCircle: ImageVector? = null