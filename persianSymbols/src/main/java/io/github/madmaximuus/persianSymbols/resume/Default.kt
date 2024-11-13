package io.github.madmaximuus.persianSymbols.resume

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Resume: ImageVector
    get() {
        if (resume != null) {
            return resume!!
        }
        resume = Builder(
            name = "resume-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 7f)
                curveTo(8f, 6.448f, 7.552f, 6f, 7f, 6f)
                curveTo(6.448f, 6f, 6f, 6.448f, 6f, 7f)
                verticalLineTo(17f)
                curveTo(6f, 17.552f, 6.448f, 18f, 7f, 18f)
                curveTo(7.552f, 18f, 8f, 17.552f, 8f, 17f)
                lineTo(8f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.53f, 6.864f)
                curveTo(11.471f, 6.107f, 10f, 6.864f, 10f, 8.166f)
                verticalLineTo(15.834f)
                curveTo(10f, 17.135f, 11.471f, 17.892f, 12.53f, 17.136f)
                lineTo(17.898f, 13.302f)
                curveTo(18.791f, 12.664f, 18.791f, 11.336f, 17.898f, 10.698f)
                lineTo(12.53f, 6.864f)
                close()
                moveTo(16.279f, 12f)
                lineTo(12f, 15.057f)
                verticalLineTo(8.943f)
                lineTo(16.279f, 12f)
                close()
            }
        }.build()
        return resume!!
    }

private var resume: ImageVector? = null