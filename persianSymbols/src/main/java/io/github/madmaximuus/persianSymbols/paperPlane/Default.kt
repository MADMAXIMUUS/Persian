package io.github.madmaximuus.persianSymbols.paperPlane

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PaperPlane: ImageVector
    get() {
        if (paperPlane != null) {
            return paperPlane!!
        }
        paperPlane = Builder(
            name = "paper-plane-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 5.576f)
                curveTo(3f, 4.11f, 4.525f, 3.142f, 5.852f, 3.766f)
                lineTo(20.464f, 10.643f)
                curveTo(21.613f, 11.183f, 21.613f, 12.817f, 20.464f, 13.357f)
                lineTo(5.852f, 20.234f)
                curveTo(4.525f, 20.858f, 3f, 19.89f, 3f, 18.424f)
                verticalLineTo(14.39f)
                curveTo(3f, 13.702f, 3.468f, 13.102f, 4.136f, 12.935f)
                lineTo(7.877f, 12f)
                lineTo(4.136f, 11.065f)
                curveTo(3.468f, 10.898f, 3f, 10.298f, 3f, 9.61f)
                verticalLineTo(5.576f)
                close()
                moveTo(5f, 5.576f)
                lineTo(5f, 5.576f)
                verticalLineTo(9.219f)
                lineTo(11.466f, 10.836f)
                curveTo(12.678f, 11.139f, 12.678f, 12.861f, 11.466f, 13.164f)
                lineTo(5f, 14.781f)
                verticalLineTo(18.424f)
                lineTo(18.652f, 12f)
                lineTo(5f, 5.576f)
                close()
            }
        }.build()
        return paperPlane!!
    }

private var paperPlane: ImageVector? = null