package io.github.madmaximuus.persianSymbols.user.group

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserGroup: ImageVector
    get() {
        if (userGroup != null) {
            return userGroup!!
        }
        userGroup = ImageVector.Builder(
            name = "user-group-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.501f, 7.5f)
                curveTo(13.501f, 9.985f, 11.486f, 12f, 9.001f, 12f)
                curveTo(6.516f, 12f, 4.501f, 9.985f, 4.501f, 7.5f)
                curveTo(4.501f, 5.015f, 6.516f, 3f, 9.001f, 3f)
                curveTo(11.486f, 3f, 13.501f, 5.015f, 13.501f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 13f)
                curveTo(6.115f, 13f, 3.586f, 14.528f, 2.179f, 16.818f)
                curveTo(0.907f, 18.889f, 2.97f, 21f, 5.4f, 21f)
                horizontalLineTo(12.6f)
                curveTo(15.03f, 21f, 17.093f, 18.889f, 15.821f, 16.818f)
                curveTo(14.414f, 14.528f, 11.885f, 13f, 9f, 13f)
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
                curveTo(14.577f, 13.786f, 15.779f, 14.695f, 16.646f, 15.844f)
                curveTo(17.127f, 16.482f, 17.374f, 17.217f, 17.337f, 17.978f)
                curveTo(17.302f, 18.724f, 17.001f, 19.379f, 16.587f, 19.894f)
                close()
            }
        }.build()

        return userGroup!!
    }

private var userGroup: ImageVector? = null