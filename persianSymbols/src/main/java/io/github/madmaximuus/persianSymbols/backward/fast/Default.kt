package io.github.madmaximuus.persianSymbols.backward.fast

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BackwardFast: ImageVector
    get() {
        if (backwardFast != null) {
            return backwardFast!!
        }
        backwardFast = ImageVector.Builder(
            name = "backward-fast-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.501f, 7f)
                curveTo(4.501f, 6.448f, 4.053f, 6f, 3.501f, 6f)
                curveTo(2.949f, 6f, 2.501f, 6.448f, 2.501f, 7f)
                verticalLineTo(17f)
                curveTo(2.501f, 17.552f, 2.949f, 18f, 3.501f, 18f)
                curveTo(4.053f, 18f, 4.501f, 17.552f, 4.501f, 17f)
                verticalLineTo(13.448f)
                lineTo(10.995f, 17.291f)
                curveTo(11.995f, 17.883f, 13.259f, 17.162f, 13.259f, 16f)
                verticalLineTo(13.755f)
                lineTo(19.235f, 17.291f)
                curveTo(20.235f, 17.883f, 21.499f, 17.162f, 21.499f, 16f)
                verticalLineTo(8.002f)
                curveTo(21.499f, 6.84f, 20.235f, 6.12f, 19.235f, 6.711f)
                lineTo(13.259f, 10.248f)
                verticalLineTo(8.002f)
                curveTo(13.259f, 6.84f, 11.995f, 6.12f, 10.995f, 6.711f)
                lineTo(4.501f, 10.554f)
                verticalLineTo(7f)
                close()
                moveTo(11.259f, 8.879f)
                verticalLineTo(15.123f)
                lineTo(5.983f, 12.001f)
                lineTo(11.259f, 8.879f)
                close()
                moveTo(19.499f, 8.879f)
                verticalLineTo(15.123f)
                lineTo(14.223f, 12.001f)
                lineTo(19.499f, 8.879f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.501f, 7f)
                curveTo(4.501f, 6.448f, 4.053f, 6f, 3.501f, 6f)
                curveTo(2.949f, 6f, 2.501f, 6.448f, 2.501f, 7f)
                verticalLineTo(17f)
                curveTo(2.501f, 17.552f, 2.949f, 18f, 3.501f, 18f)
                curveTo(4.053f, 18f, 4.501f, 17.552f, 4.501f, 17f)
                verticalLineTo(13.448f)
                lineTo(10.995f, 17.291f)
                curveTo(11.995f, 17.883f, 13.259f, 17.162f, 13.259f, 16f)
                verticalLineTo(13.755f)
                lineTo(19.235f, 17.291f)
                curveTo(20.235f, 17.883f, 21.499f, 17.162f, 21.499f, 16f)
                verticalLineTo(8.002f)
                curveTo(21.499f, 6.84f, 20.235f, 6.12f, 19.235f, 6.711f)
                lineTo(13.259f, 10.248f)
                verticalLineTo(8.002f)
                curveTo(13.259f, 6.84f, 11.995f, 6.12f, 10.995f, 6.711f)
                lineTo(4.501f, 10.554f)
                verticalLineTo(7f)
                close()
                moveTo(11.259f, 15.123f)
                lineTo(5.983f, 12.001f)
                lineTo(11.259f, 8.879f)
                verticalLineTo(15.123f)
                close()
                moveTo(19.499f, 15.123f)
                lineTo(14.223f, 12.001f)
                lineTo(19.499f, 8.879f)
                verticalLineTo(15.123f)
                close()
            }
        }.build()
        return backwardFast!!
    }

private var backwardFast: ImageVector? = null