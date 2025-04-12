package io.github.madmaximuus.persianSymbols.folder.badge.gear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FolderBadgeGear: ImageVector
    get() {
        if (folderBadgeGear != null) {
            return folderBadgeGear!!
        }
        folderBadgeGear = ImageVector.Builder(
            name = "folder-badge-gear-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 3f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
                horizontalLineTo(13.389f)
                curveTo(13f, 20.403f, 12.724f, 19.727f, 12.591f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 19f, 4f, 17.881f, 4f, 16.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(20f)
                verticalLineTo(12.875f)
                curveTo(20.765f, 13.174f, 21.446f, 13.638f, 22f, 14.225f)
                verticalLineTo(8f)
                curveTo(22f, 6.343f, 20.657f, 5f, 19f, 5f)
                horizontalLineTo(11.672f)
                curveTo(11.479f, 5f, 11.29f, 4.944f, 11.128f, 4.839f)
                lineTo(9.042f, 3.484f)
                curveTo(8.555f, 3.168f, 7.988f, 3f, 7.408f, 3f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 5f)
                horizontalLineTo(7.408f)
                curveTo(7.601f, 5f, 7.79f, 5.056f, 7.952f, 5.161f)
                lineTo(10.038f, 6.516f)
                curveTo(10.525f, 6.832f, 11.092f, 7f, 11.672f, 7f)
                horizontalLineTo(19f)
                curveTo(19.552f, 7f, 20f, 7.448f, 20f, 8f)
                verticalLineTo(9.25f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
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

        return folderBadgeGear!!
    }

private var folderBadgeGear: ImageVector? = null