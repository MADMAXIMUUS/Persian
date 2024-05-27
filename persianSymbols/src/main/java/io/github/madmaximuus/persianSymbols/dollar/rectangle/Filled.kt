package io.github.madmaximuus.persianSymbols.dollar.rectangle

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DollarRectangle: ImageVector
    get() {
        if (dollarRectangle != null) {
            return dollarRectangle!!
        }
        dollarRectangle = Builder(
            name = "dollar-rectangle-filled",
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
                pathFillType = EvenOdd
            ) {
                moveTo(6.4f, 4.0f)
                curveTo(3.9699f, 4.0f, 2.0f, 5.97f, 2.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 20.0f, 22.0f, 18.0301f, 22.0f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22.0f, 5.97f, 20.0301f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                horizontalLineTo(10.5f)
                curveTo(9.6716f, 8.0f, 9.0f, 8.6716f, 9.0f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(9.0f, 12.3284f, 9.6716f, 13.0f, 10.5f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 14.0f, 9.0f, 14.4477f, 9.0f, 15.0f)
                curveTo(9.0f, 15.5523f, 9.4477f, 16.0f, 10.0f, 16.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                horizontalLineTo(13.5f)
                curveTo(14.3284f, 16.0f, 15.0f, 15.3284f, 15.0f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 11.6716f, 14.3284f, 11.0f, 13.5f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 10.0f, 15.0f, 9.5523f, 15.0f, 9.0f)
                curveTo(15.0f, 8.4477f, 14.5523f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }.build()
        return dollarRectangle!!
    }

private var dollarRectangle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DollarRectangle,
                contentDescription = ""
            )
        }
    }
}