package io.github.madmaximuus.persianSymbols.user.gear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserGear: ImageVector
    get() {
        if (userGear != null) {
            return userGear!!
        }
        userGear = Builder(
            name = "user-gear-default",
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
        return userGear!!
    }

private var userGear: ImageVector? = null