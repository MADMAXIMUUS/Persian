package io.github.madmaximuus.persianSymbols.thumb.up

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

val PersianSymbols.Default.ThumbUp: ImageVector
    get() {
        if (thumbUp != null) {
            return thumbUp!!
        }
        thumbUp = Builder(
            name = "thumb-up-default",
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
                moveTo(4.5f, 20.5286f)
                curveTo(3.1193f, 20.5286f, 2.0f, 19.4093f, 2.0f, 18.0286f)
                verticalLineTo(11.0286f)
                curveTo(2.0f, 9.6479f, 3.1193f, 8.5286f, 4.5f, 8.5286f)
                horizontalLineTo(7.5f)
                curveTo(7.528f, 8.5286f, 7.5559f, 8.5293f, 7.5835f, 8.5309f)
                lineTo(12.1896f, 3.9247f)
                curveTo(13.2215f, 2.8929f, 14.9698f, 3.7926f, 14.7299f, 5.232f)
                lineTo(14.1805f, 8.5286f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 8.5286f, 22.0f, 9.8717f, 22.0f, 11.5286f)
                verticalLineTo(13.0564f)
                curveTo(22.0f, 13.5222f, 21.8916f, 13.9815f, 21.6833f, 14.3981f)
                lineTo(19.4472f, 18.8702f)
                curveTo(18.939f, 19.8866f, 17.9002f, 20.5286f, 16.7639f, 20.5286f)
                horizontalLineTo(4.5f)
                close()
                moveTo(12.2077f, 8.1998f)
                lineTo(12.5006f, 6.4422f)
                lineTo(8.9977f, 9.9451f)
                curveTo(8.9992f, 9.9727f, 9.0f, 10.0005f, 9.0f, 10.0286f)
                verticalLineTo(18.5286f)
                horizontalLineTo(16.7639f)
                curveTo(17.1427f, 18.5286f, 17.489f, 18.3146f, 17.6584f, 17.9758f)
                lineTo(19.8944f, 13.5036f)
                curveTo(19.9639f, 13.3648f, 20.0f, 13.2117f, 20.0f, 13.0564f)
                verticalLineTo(11.5286f)
                curveTo(20.0f, 10.9763f, 19.5523f, 10.5286f, 19.0f, 10.5286f)
                horizontalLineTo(14.1805f)
                curveTo(12.9446f, 10.5286f, 12.0045f, 9.4188f, 12.2077f, 8.1998f)
                close()
                moveTo(7.0f, 18.5286f)
                verticalLineTo(10.5286f)
                horizontalLineTo(4.5f)
                curveTo(4.2239f, 10.5286f, 4.0f, 10.7524f, 4.0f, 11.0286f)
                verticalLineTo(18.0286f)
                curveTo(4.0f, 18.3047f, 4.2239f, 18.5286f, 4.5f, 18.5286f)
                horizontalLineTo(7.0f)
                close()
            }
        }.build()
        return thumbUp!!
    }

private var thumbUp: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ThumbUp,
                contentDescription = ""
            )
        }
    }
}