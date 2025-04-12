package io.github.madmaximuus.persianSymbols.user.group

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserGroup: ImageVector
    get() {
        if (userGroup != null) {
            return userGroup!!
        }
        userGroup = ImageVector.Builder(
            name = "user-group-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.561f, 7.5f)
                curveTo(4.561f, 5.015f, 6.576f, 3f, 9.061f, 3f)
                curveTo(11.546f, 3f, 13.561f, 5.015f, 13.561f, 7.5f)
                curveTo(13.561f, 9.985f, 11.546f, 12f, 9.061f, 12f)
                curveTo(6.576f, 12f, 4.561f, 9.985f, 4.561f, 7.5f)
                close()
                moveTo(9.061f, 5f)
                curveTo(7.68f, 5f, 6.561f, 6.119f, 6.561f, 7.5f)
                curveTo(6.561f, 8.881f, 7.68f, 10f, 9.061f, 10f)
                curveTo(10.442f, 10f, 11.561f, 8.881f, 11.561f, 7.5f)
                curveTo(11.561f, 6.119f, 10.442f, 5f, 9.061f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.385f, 16.145f)
                curveTo(3.835f, 14.222f, 6.311f, 13f, 9.066f, 13f)
                curveTo(11.822f, 13f, 14.297f, 14.222f, 15.748f, 16.145f)
                curveTo(16.166f, 16.699f, 16.369f, 17.321f, 16.339f, 17.954f)
                curveTo(16.309f, 18.577f, 16.058f, 19.133f, 15.698f, 19.58f)
                curveTo(14.991f, 20.457f, 13.807f, 21f, 12.566f, 21f)
                horizontalLineTo(5.566f)
                curveTo(4.326f, 21f, 3.142f, 20.457f, 2.435f, 19.58f)
                curveTo(2.075f, 19.133f, 1.823f, 18.577f, 1.794f, 17.954f)
                curveTo(1.764f, 17.321f, 1.967f, 16.699f, 2.385f, 16.145f)
                close()
                moveTo(9.066f, 15f)
                curveTo(6.887f, 15f, 5.024f, 15.967f, 3.982f, 17.35f)
                curveTo(3.817f, 17.568f, 3.786f, 17.738f, 3.792f, 17.86f)
                curveTo(3.798f, 17.991f, 3.852f, 18.152f, 3.992f, 18.325f)
                curveTo(4.285f, 18.688f, 4.874f, 19f, 5.566f, 19f)
                horizontalLineTo(12.566f)
                curveTo(13.259f, 19f, 13.848f, 18.688f, 14.141f, 18.325f)
                curveTo(14.281f, 18.152f, 14.335f, 17.991f, 14.341f, 17.86f)
                curveTo(14.347f, 17.738f, 14.316f, 17.568f, 14.151f, 17.35f)
                curveTo(13.109f, 15.967f, 11.246f, 15f, 9.066f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.001f, 12f)
                curveTo(14.167f, 12f, 13.386f, 11.773f, 12.717f, 11.378f)
                curveTo(13.842f, 10.461f, 14.56f, 9.064f, 14.56f, 7.5f)
                curveTo(14.56f, 5.936f, 13.842f, 4.539f, 12.717f, 3.622f)
                curveTo(13.386f, 3.227f, 14.167f, 3f, 15.001f, 3f)
                curveTo(17.486f, 3f, 19.501f, 5.015f, 19.501f, 7.5f)
                curveTo(19.501f, 9.985f, 17.486f, 12f, 15.001f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.587f, 19.894f)
                curveTo(16.216f, 20.353f, 15.737f, 20.728f, 15.194f, 21f)
                horizontalLineTo(18.6f)
                curveTo(21.03f, 21f, 23.093f, 18.889f, 21.821f, 16.818f)
                curveTo(20.414f, 14.528f, 17.885f, 13f, 15f, 13f)
                curveTo(14.374f, 13f, 13.764f, 13.072f, 13.179f, 13.208f)
                curveTo(14.577f, 13.786f, 15.78f, 14.695f, 16.646f, 15.844f)
                curveTo(17.127f, 16.482f, 17.374f, 17.217f, 17.337f, 17.978f)
                curveTo(17.302f, 18.724f, 17.001f, 19.379f, 16.587f, 19.894f)
                close()
            }
        }.build()

        return userGroup!!
    }

private var userGroup: ImageVector? = null