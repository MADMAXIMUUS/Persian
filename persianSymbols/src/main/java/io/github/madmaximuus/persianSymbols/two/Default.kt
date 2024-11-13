package io.github.madmaximuus.persianSymbols.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Two: ImageVector
    get() {
        if (two != null) {
            return two!!
        }
        two = ImageVector.Builder(
            name = "two-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.748f, 4.5f)
                curveTo(9.264f, 4.5f, 7.25f, 6.514f, 7.25f, 9f)
                curveTo(7.25f, 9.552f, 6.802f, 10f, 6.25f, 10f)
                curveTo(5.698f, 10f, 5.25f, 9.552f, 5.25f, 9f)
                curveTo(5.25f, 5.411f, 8.159f, 2.5f, 11.748f, 2.5f)
                curveTo(15.337f, 2.5f, 18.245f, 5.411f, 18.245f, 9f)
                curveTo(18.245f, 10.79f, 17.37f, 12.181f, 16.222f, 13.285f)
                curveTo(15.093f, 14.37f, 13.618f, 15.258f, 12.255f, 16.05f)
                curveTo(12.097f, 16.141f, 11.942f, 16.231f, 11.788f, 16.32f)
                curveTo(10.561f, 17.029f, 9.456f, 17.668f, 8.611f, 18.361f)
                curveTo(8.121f, 18.763f, 7.777f, 19.138f, 7.559f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.302f, 19.5f, 18.75f, 19.948f, 18.75f, 20.5f)
                curveTo(18.75f, 21.052f, 18.302f, 21.5f, 17.75f, 21.5f)
                horizontalLineTo(6.26f)
                curveTo(5.708f, 21.5f, 5.26f, 21.052f, 5.26f, 20.5f)
                curveTo(5.26f, 18.914f, 6.231f, 17.728f, 7.342f, 16.816f)
                curveTo(8.323f, 16.01f, 9.584f, 15.282f, 10.785f, 14.589f)
                curveTo(10.941f, 14.499f, 11.097f, 14.409f, 11.251f, 14.32f)
                curveTo(12.633f, 13.518f, 13.905f, 12.739f, 14.836f, 11.843f)
                curveTo(15.748f, 10.966f, 16.245f, 10.062f, 16.245f, 9f)
                curveTo(16.245f, 6.514f, 14.231f, 4.5f, 11.748f, 4.5f)
                close()
            }
        }.build()

        return two!!
    }

private var two: ImageVector? = null
