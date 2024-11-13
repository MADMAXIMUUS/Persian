package io.github.madmaximuus.persianSymbols.delete.left

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeleteLeft: ImageVector
    get() {
        if (deleteLeft != null) {
            return deleteLeft!!
        }
        deleteLeft = Builder(
            name = "delete-left-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.6f, 4f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 18.03f, 20.03f, 20f, 17.6f, 20f)
                horizontalLineTo(9.378f)
                curveTo(8.927f, 20f, 8.5f, 19.797f, 8.215f, 19.447f)
                lineTo(2.79f, 12.788f)
                curveTo(2.332f, 12.227f, 2.341f, 11.419f, 2.811f, 10.868f)
                lineTo(8.216f, 4.527f)
                curveTo(8.501f, 4.193f, 8.918f, 4f, 9.357f, 4f)
                horizontalLineTo(17.6f)
                close()
                moveTo(11.289f, 7.97f)
                curveTo(10.996f, 7.677f, 10.521f, 7.677f, 10.228f, 7.97f)
                curveTo(9.935f, 8.263f, 9.935f, 8.737f, 10.228f, 9.03f)
                lineTo(13.198f, 12f)
                lineTo(10.228f, 14.97f)
                curveTo(9.935f, 15.263f, 9.935f, 15.737f, 10.228f, 16.03f)
                curveTo(10.521f, 16.323f, 10.996f, 16.323f, 11.289f, 16.03f)
                lineTo(14.258f, 13.061f)
                lineTo(17.228f, 16.03f)
                curveTo(17.521f, 16.323f, 17.996f, 16.323f, 18.289f, 16.03f)
                curveTo(18.581f, 15.737f, 18.581f, 15.263f, 18.289f, 14.97f)
                lineTo(15.319f, 12f)
                lineTo(18.289f, 9.03f)
                curveTo(18.581f, 8.737f, 18.581f, 8.263f, 18.289f, 7.97f)
                curveTo(17.996f, 7.677f, 17.521f, 7.677f, 17.228f, 7.97f)
                lineTo(14.258f, 10.939f)
                lineTo(11.289f, 7.97f)
                close()
            }
        }.build()
        return deleteLeft!!
    }

private var deleteLeft: ImageVector? = null