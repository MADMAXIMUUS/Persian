package io.github.madmaximuus.persianSymbols.trash.xMark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.TrashXMark: ImageVector
    get() {
        if (trashXMark != null) {
            return trashXMark!!
        }
        trashXMark = Builder(
            name = "trash-x-mark-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 2f)
                curveTo(9.31f, 2f, 8.75f, 2.56f, 8.75f, 3.25f)
                lineTo(8.75f, 4f)
                horizontalLineTo(4f)
                curveTo(3.448f, 4f, 3f, 4.448f, 3f, 5f)
                curveTo(3f, 5.553f, 3.448f, 6f, 4f, 6f)
                verticalLineTo(17.6f)
                curveTo(4f, 20.03f, 5.97f, 22f, 8.4f, 22f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 22f, 20f, 20.03f, 20f, 17.6f)
                verticalLineTo(6f)
                curveTo(20.552f, 6f, 21f, 5.553f, 21f, 5f)
                curveTo(21f, 4.448f, 20.552f, 4f, 20f, 4f)
                horizontalLineTo(15.25f)
                lineTo(15.25f, 3.25f)
                curveTo(15.25f, 2.56f, 14.69f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                close()
                moveTo(13.75f, 4f)
                lineTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                lineTo(10.25f, 4f)
                horizontalLineTo(13.75f)
                close()
                moveTo(9.03f, 8.47f)
                curveTo(8.737f, 8.177f, 8.263f, 8.177f, 7.97f, 8.47f)
                curveTo(7.677f, 8.763f, 7.677f, 9.237f, 7.97f, 9.53f)
                lineTo(10.939f, 12.5f)
                lineTo(7.97f, 15.47f)
                curveTo(7.677f, 15.763f, 7.677f, 16.237f, 7.97f, 16.53f)
                curveTo(8.263f, 16.823f, 8.737f, 16.823f, 9.03f, 16.53f)
                lineTo(12f, 13.561f)
                lineTo(14.97f, 16.53f)
                curveTo(15.263f, 16.823f, 15.737f, 16.823f, 16.03f, 16.53f)
                curveTo(16.323f, 16.237f, 16.323f, 15.763f, 16.03f, 15.47f)
                lineTo(13.061f, 12.5f)
                lineTo(16.03f, 9.53f)
                curveTo(16.323f, 9.237f, 16.323f, 8.763f, 16.03f, 8.47f)
                curveTo(15.737f, 8.177f, 15.263f, 8.177f, 14.97f, 8.47f)
                lineTo(12f, 11.439f)
                lineTo(9.03f, 8.47f)
                close()
            }
        }.build()
        return trashXMark!!
    }

private var trashXMark: ImageVector? = null