package io.github.madmaximuus.persianSymbols.folder.question

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FolderQuestion: ImageVector
    get() {
        if (folderQuestion != null) {
            return folderQuestion!!
        }
        folderQuestion = ImageVector.Builder(
            name = "folder-question-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 8.25f)
                verticalLineTo(16.6f)
                curveTo(22f, 19.03f, 20.03f, 21f, 17.6f, 21f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 21f, 2f, 19.03f, 2f, 16.6f)
                verticalLineTo(8.804f)
                verticalLineTo(5f)
                curveTo(2f, 3.895f, 2.895f, 3f, 4f, 3f)
                horizontalLineTo(6.658f)
                curveTo(7.244f, 3f, 7.817f, 3.171f, 8.306f, 3.493f)
                lineTo(10.227f, 4.757f)
                curveTo(10.717f, 5.079f, 11.29f, 5.25f, 11.876f, 5.25f)
                horizontalLineTo(19f)
                curveTo(20.657f, 5.25f, 22f, 6.593f, 22f, 8.25f)
                close()
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
                moveTo(13f, 16.875f)
                curveTo(13f, 17.427f, 12.552f, 17.875f, 12f, 17.875f)
                curveTo(11.448f, 17.875f, 11f, 17.427f, 11f, 16.875f)
                curveTo(11f, 16.323f, 11.448f, 15.875f, 12f, 15.875f)
                curveTo(12.552f, 15.875f, 13f, 16.323f, 13f, 16.875f)
                close()
            }
        }.build()

        return folderQuestion!!
    }

private var folderQuestion: ImageVector? = null