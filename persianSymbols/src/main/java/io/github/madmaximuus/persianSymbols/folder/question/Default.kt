package io.github.madmaximuus.persianSymbols.folder.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.FolderQuestion: ImageVector
    get() {
        if (folderQuestion != null) {
            return folderQuestion!!
        }
        folderQuestion = ImageVector.Builder(
            name = "folder-question-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.625f)
                curveTo(11.135f, 9.625f, 10.434f, 10.326f, 10.434f, 11.191f)
                curveTo(10.434f, 11.605f, 10.098f, 11.941f, 9.684f, 11.941f)
                curveTo(9.27f, 11.941f, 8.934f, 11.605f, 8.934f, 11.191f)
                curveTo(8.934f, 9.498f, 10.307f, 8.125f, 12f, 8.125f)
                curveTo(13.693f, 8.125f, 15.066f, 9.498f, 15.066f, 11.191f)
                curveTo(15.066f, 12.384f, 14.173f, 13.109f, 13.535f, 13.481f)
                curveTo(13.254f, 13.645f, 12.976f, 13.767f, 12.75f, 13.855f)
                verticalLineTo(14.571f)
                curveTo(12.75f, 14.985f, 12.414f, 15.321f, 12f, 15.321f)
                curveTo(11.586f, 15.321f, 11.25f, 14.985f, 11.25f, 14.571f)
                verticalLineTo(13.313f)
                curveTo(11.25f, 12.969f, 11.484f, 12.669f, 11.818f, 12.586f)
                lineTo(11.819f, 12.585f)
                lineTo(11.83f, 12.582f)
                curveTo(11.842f, 12.579f, 11.861f, 12.574f, 11.887f, 12.566f)
                curveTo(11.938f, 12.551f, 12.015f, 12.527f, 12.108f, 12.493f)
                curveTo(12.297f, 12.425f, 12.542f, 12.323f, 12.781f, 12.184f)
                curveTo(13.3f, 11.882f, 13.566f, 11.546f, 13.566f, 11.191f)
                curveTo(13.566f, 10.326f, 12.865f, 9.625f, 12f, 9.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 16.875f)
                curveTo(13f, 17.427f, 12.552f, 17.875f, 12f, 17.875f)
                curveTo(11.448f, 17.875f, 11f, 17.427f, 11f, 16.875f)
                curveTo(11f, 16.323f, 11.448f, 15.875f, 12f, 15.875f)
                curveTo(12.552f, 15.875f, 13f, 16.323f, 13f, 16.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 3f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(16.5f)
                curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 21f, 22f, 18.985f, 22f, 16.5f)
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
                verticalLineTo(16.5f)
                curveTo(20f, 17.881f, 18.881f, 19f, 17.5f, 19f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 19f, 4f, 17.881f, 4f, 16.5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return folderQuestion!!
    }

private var folderQuestion: ImageVector? = null