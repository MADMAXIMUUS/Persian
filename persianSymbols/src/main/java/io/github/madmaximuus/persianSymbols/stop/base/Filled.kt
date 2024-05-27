package io.github.madmaximuus.persianSymbols.stop.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Stop: ImageVector
    get() {
        if (stop != null) {
            return stop!!
        }
        stop = Builder(
            name = "stop-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.4f, 5.0f)
                lineTo(14.6f, 5.0f)
                arcTo(
                    horizontalEllipseRadius = 4.4f,
                    verticalEllipseRadius = 4.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 9.4f
                )
                lineTo(19.0f, 14.6f)
                arcTo(
                    horizontalEllipseRadius = 4.4f,
                    verticalEllipseRadius = 4.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.6f,
                    y1 = 19.0f
                )
                lineTo(9.4f, 19.0f)
                arcTo(
                    horizontalEllipseRadius = 4.4f,
                    verticalEllipseRadius = 4.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 14.6f
                )
                lineTo(5.0f, 9.4f)
                arcTo(
                    horizontalEllipseRadius = 4.4f,
                    verticalEllipseRadius = 4.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.4f,
                    y1 = 5.0f
                )
                close()
            }
        }.build()
        return stop!!
    }

private var stop: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Stop,
                contentDescription = ""
            )
        }
    }
}