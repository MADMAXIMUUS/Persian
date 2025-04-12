package io.github.madmaximuus.persianSymbols.user.badge.gear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.UserBadgeGear: ImageVector
    get() {
        if (userBadgeGear != null) {
            return userBadgeGear!!
        }
        userBadgeGear = Builder(
            name = "user-badge-gear-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.21f, 11.5f)
                curveTo(13.695f, 11.5f, 15.71f, 9.485f, 15.71f, 7f)
                curveTo(15.71f, 4.515f, 13.695f, 2.5f, 11.21f, 2.5f)
                curveTo(8.725f, 2.5f, 6.71f, 4.515f, 6.71f, 7f)
                curveTo(6.71f, 9.485f, 8.725f, 11.5f, 11.21f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.388f, 16.318f)
                curveTo(5.795f, 14.028f, 8.323f, 12.5f, 11.209f, 12.5f)
                curveTo(12.559f, 12.5f, 13.831f, 12.834f, 14.946f, 13.425f)
                curveTo(13.471f, 14.411f, 12.5f, 16.092f, 12.5f, 18f)
                curveTo(12.5f, 18.9f, 12.716f, 19.75f, 13.1f, 20.5f)
                horizontalLineTo(7.609f)
                curveTo(5.179f, 20.5f, 3.116f, 18.389f, 4.388f, 16.318f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 17.25f)
                curveTo(17.586f, 17.25f, 17.25f, 17.586f, 17.25f, 18f)
                curveTo(17.25f, 18.414f, 17.586f, 18.75f, 18f, 18.75f)
                curveTo(18.414f, 18.75f, 18.75f, 18.414f, 18.75f, 18f)
                curveTo(18.75f, 17.586f, 18.414f, 17.25f, 18f, 17.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.001f, 18.104f)
                curveTo(14f, 18.069f, 14f, 18.035f, 14f, 18f)
                curveTo(14f, 17.965f, 14f, 17.931f, 14.001f, 17.896f)
                curveTo(13.609f, 17.427f, 13.529f, 16.744f, 13.853f, 16.183f)
                lineTo(14.353f, 15.317f)
                curveTo(14.677f, 14.757f, 15.307f, 14.484f, 15.91f, 14.589f)
                curveTo(15.969f, 14.552f, 16.03f, 14.517f, 16.091f, 14.484f)
                curveTo(16.302f, 13.91f, 16.853f, 13.5f, 17.5f, 13.5f)
                horizontalLineTo(18.5f)
                curveTo(19.147f, 13.5f, 19.698f, 13.91f, 19.909f, 14.484f)
                curveTo(19.97f, 14.517f, 20.031f, 14.552f, 20.09f, 14.589f)
                curveTo(20.693f, 14.484f, 21.323f, 14.757f, 21.647f, 15.317f)
                lineTo(22.147f, 16.183f)
                curveTo(22.471f, 16.744f, 22.391f, 17.427f, 21.999f, 17.896f)
                curveTo(22f, 17.931f, 22f, 17.965f, 22f, 18f)
                curveTo(22f, 18.035f, 22f, 18.069f, 21.999f, 18.104f)
                curveTo(22.391f, 18.573f, 22.471f, 19.256f, 22.147f, 19.817f)
                lineTo(21.647f, 20.683f)
                curveTo(21.323f, 21.243f, 20.693f, 21.516f, 20.09f, 21.411f)
                curveTo(20.031f, 21.448f, 19.97f, 21.483f, 19.909f, 21.516f)
                curveTo(19.698f, 22.09f, 19.147f, 22.5f, 18.5f, 22.5f)
                horizontalLineTo(17.5f)
                curveTo(16.853f, 22.5f, 16.302f, 22.09f, 16.091f, 21.516f)
                curveTo(16.03f, 21.483f, 15.969f, 21.448f, 15.91f, 21.411f)
                curveTo(15.307f, 21.516f, 14.677f, 21.243f, 14.353f, 20.683f)
                lineTo(13.853f, 19.817f)
                curveTo(13.529f, 19.256f, 13.609f, 18.573f, 14.001f, 18.104f)
                close()
                moveTo(15.75f, 18f)
                curveTo(15.75f, 16.757f, 16.757f, 15.75f, 18f, 15.75f)
                curveTo(19.243f, 15.75f, 20.25f, 16.757f, 20.25f, 18f)
                curveTo(20.25f, 19.243f, 19.243f, 20.25f, 18f, 20.25f)
                curveTo(16.757f, 20.25f, 15.75f, 19.243f, 15.75f, 18f)
                close()
            }
        }.build()
        return userBadgeGear!!
    }

private var userBadgeGear: ImageVector? = null