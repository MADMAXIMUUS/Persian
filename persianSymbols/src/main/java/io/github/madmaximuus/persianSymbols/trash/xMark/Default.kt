package io.github.madmaximuus.persianSymbols.trash.xMark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.TrashXMark: ImageVector
    get() {
        if (trashXMark != null) {
            return trashXMark!!
        }
        trashXMark = Builder(
            name = "trash-xmark-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.03f, 7.97f)
                curveTo(8.737f, 7.677f, 8.263f, 7.677f, 7.97f, 7.97f)
                curveTo(7.677f, 8.263f, 7.677f, 8.737f, 7.97f, 9.03f)
                lineTo(10.939f, 12f)
                lineTo(7.97f, 14.97f)
                curveTo(7.677f, 15.263f, 7.677f, 15.737f, 7.97f, 16.03f)
                curveTo(8.263f, 16.323f, 8.737f, 16.323f, 9.03f, 16.03f)
                lineTo(12f, 13.061f)
                lineTo(14.97f, 16.03f)
                curveTo(15.263f, 16.323f, 15.737f, 16.323f, 16.03f, 16.03f)
                curveTo(16.323f, 15.737f, 16.323f, 15.263f, 16.03f, 14.97f)
                lineTo(13.061f, 12f)
                lineTo(16.03f, 9.03f)
                curveTo(16.323f, 8.737f, 16.323f, 8.263f, 16.03f, 7.97f)
                curveTo(15.737f, 7.677f, 15.263f, 7.677f, 14.97f, 7.97f)
                lineTo(12f, 10.939f)
                lineTo(9.03f, 7.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2.5f)
                curveTo(7.448f, 2.5f, 7f, 2.948f, 7f, 3.5f)
                lineTo(4f, 3.5f)
                curveTo(3.448f, 3.5f, 3f, 3.948f, 3f, 4.5f)
                curveTo(3f, 5.052f, 3.448f, 5.5f, 4f, 5.5f)
                verticalLineTo(17f)
                curveTo(4f, 19.485f, 6.015f, 21.5f, 8.5f, 21.5f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 21.5f, 20f, 19.485f, 20f, 17f)
                verticalLineTo(5.5f)
                curveTo(20.552f, 5.5f, 21f, 5.053f, 21f, 4.5f)
                curveTo(21f, 3.948f, 20.552f, 3.5f, 20f, 3.5f)
                horizontalLineTo(17f)
                curveTo(17f, 2.948f, 16.552f, 2.5f, 16f, 2.5f)
                horizontalLineTo(8f)
                close()
                moveTo(6f, 17f)
                verticalLineTo(5.5f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                curveTo(18f, 18.381f, 16.881f, 19.5f, 15.5f, 19.5f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 19.5f, 6f, 18.381f, 6f, 17f)
                close()
            }
        }.build()
        return trashXMark!!
    }

private var trashXMark: ImageVector? = null