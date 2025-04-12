package io.github.madmaximuus.persianSymbols.user.badge.gear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBadgeGear: ImageVector
    get() {
        if (userBadgeGear != null) {
            return userBadgeGear!!
        }
        userBadgeGear = Builder(
            name = "user-badge-gear-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.27f, 2.5f)
                curveTo(8.785f, 2.5f, 6.77f, 4.515f, 6.77f, 7f)
                curveTo(6.77f, 9.485f, 8.785f, 11.5f, 11.27f, 11.5f)
                curveTo(13.755f, 11.5f, 15.77f, 9.485f, 15.77f, 7f)
                curveTo(15.77f, 4.515f, 13.755f, 2.5f, 11.27f, 2.5f)
                close()
                moveTo(8.77f, 7f)
                curveTo(8.77f, 5.619f, 9.889f, 4.5f, 11.27f, 4.5f)
                curveTo(12.651f, 4.5f, 13.77f, 5.619f, 13.77f, 7f)
                curveTo(13.77f, 8.381f, 12.651f, 9.5f, 11.27f, 9.5f)
                curveTo(9.889f, 9.5f, 8.77f, 8.381f, 8.77f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.191f, 16.85f)
                curveTo(7.233f, 15.467f, 9.096f, 14.5f, 11.275f, 14.5f)
                curveTo(12.063f, 14.5f, 12.808f, 14.626f, 13.489f, 14.852f)
                curveTo(13.912f, 14.248f, 14.453f, 13.732f, 15.079f, 13.339f)
                curveTo(13.941f, 12.801f, 12.642f, 12.5f, 11.275f, 12.5f)
                curveTo(8.52f, 12.5f, 6.044f, 13.722f, 4.594f, 15.645f)
                curveTo(4.176f, 16.199f, 3.973f, 16.821f, 4.003f, 17.454f)
                curveTo(4.032f, 18.077f, 4.284f, 18.633f, 4.644f, 19.08f)
                curveTo(5.351f, 19.957f, 6.535f, 20.5f, 7.775f, 20.5f)
                horizontalLineTo(13.1f)
                curveTo(12.788f, 19.89f, 12.587f, 19.215f, 12.522f, 18.5f)
                horizontalLineTo(7.775f)
                curveTo(7.083f, 18.5f, 6.494f, 18.188f, 6.201f, 17.825f)
                curveTo(6.061f, 17.652f, 6.007f, 17.491f, 6.001f, 17.36f)
                curveTo(5.995f, 17.238f, 6.026f, 17.068f, 6.191f, 16.85f)
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