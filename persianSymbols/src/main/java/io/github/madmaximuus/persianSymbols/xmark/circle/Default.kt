package io.github.madmaximuus.persianSymbols.xmark.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.XMarkCircle: ImageVector
    get() {
        if (xMarkCircle != null) {
            return xMarkCircle!!
        }
        xMarkCircle = ImageVector.Builder(
            name = "xmark-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.03f, 7.97f)
                curveTo(8.737f, 7.677f, 8.262f, 7.677f, 7.97f, 7.97f)
                curveTo(7.677f, 8.263f, 7.677f, 8.737f, 7.97f, 9.03f)
                lineTo(10.939f, 12f)
                lineTo(7.97f, 14.97f)
                curveTo(7.677f, 15.263f, 7.677f, 15.737f, 7.97f, 16.03f)
                curveTo(8.262f, 16.323f, 8.737f, 16.323f, 9.03f, 16.03f)
                lineTo(12f, 13.061f)
                lineTo(14.969f, 16.03f)
                curveTo(15.262f, 16.323f, 15.737f, 16.323f, 16.03f, 16.03f)
                curveTo(16.323f, 15.737f, 16.323f, 15.263f, 16.03f, 14.97f)
                lineTo(13.061f, 12f)
                lineTo(16.03f, 9.03f)
                curveTo(16.323f, 8.737f, 16.323f, 8.263f, 16.03f, 7.97f)
                curveTo(15.737f, 7.677f, 15.262f, 7.677f, 14.969f, 7.97f)
                lineTo(12f, 10.939f)
                lineTo(9.03f, 7.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return xMarkCircle!!
    }

private var xMarkCircle: ImageVector? = null