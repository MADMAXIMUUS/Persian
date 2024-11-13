package io.github.madmaximuus.persianSymbols.delete.left

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeleteLeft: ImageVector
    get() {
        if (deleteLeft != null) {
            return deleteLeft!!
        }
        deleteLeft = Builder(
            name = "delete-left-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.453f, 4f)
                curveTo(8.877f, 4f, 8.329f, 4.248f, 7.949f, 4.681f)
                lineTo(2.813f, 10.538f)
                curveTo(2.163f, 11.28f, 2.151f, 12.385f, 2.784f, 13.141f)
                lineTo(7.934f, 19.285f)
                curveTo(8.314f, 19.738f, 8.875f, 20f, 9.467f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(9.453f)
                close()
                moveTo(9.453f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                lineTo(9.467f, 18f)
                lineTo(4.317f, 11.857f)
                lineTo(9.453f, 6f)
                close()
            }
        }.build()
        return deleteLeft!!
    }

private var deleteLeft: ImageVector? = null