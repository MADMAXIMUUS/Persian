package io.github.madmaximuus.persianSymbols.thumb.down

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

val PersianSymbols.Default.ThumbDown: ImageVector
    get() {
        if (thumbDown != null) {
            return thumbDown!!
        }
        thumbDown = Builder(
            name = "thumb-down-default",
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
                moveTo(4.5f, 3.48f)
                curveTo(3.1193f, 3.48f, 2.0f, 4.5993f, 2.0f, 5.98f)
                verticalLineTo(12.98f)
                curveTo(2.0f, 14.3607f, 3.1193f, 15.48f, 4.5f, 15.48f)
                horizontalLineTo(7.5f)
                curveTo(7.528f, 15.48f, 7.5559f, 15.4792f, 7.5835f, 15.4777f)
                lineTo(12.1896f, 20.0838f)
                curveTo(13.2215f, 21.1157f, 14.9698f, 20.216f, 14.7299f, 18.7766f)
                lineTo(14.1805f, 15.48f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 15.48f, 22.0f, 14.1368f, 22.0f, 12.48f)
                verticalLineTo(10.9521f)
                curveTo(22.0f, 10.4864f, 21.8916f, 10.027f, 21.6833f, 9.6105f)
                lineTo(19.4472f, 5.1383f)
                curveTo(18.939f, 4.122f, 17.9002f, 3.48f, 16.7639f, 3.48f)
                horizontalLineTo(4.5f)
                close()
                moveTo(12.2077f, 15.8088f)
                lineTo(12.5006f, 17.5664f)
                lineTo(8.9977f, 14.0635f)
                curveTo(8.9992f, 14.0358f, 9.0f, 14.008f, 9.0f, 13.98f)
                verticalLineTo(5.48f)
                horizontalLineTo(16.7639f)
                curveTo(17.1427f, 5.48f, 17.489f, 5.694f, 17.6584f, 6.0328f)
                lineTo(19.8944f, 10.5049f)
                curveTo(19.9639f, 10.6438f, 20.0f, 10.7969f, 20.0f, 10.9521f)
                verticalLineTo(12.48f)
                curveTo(20.0f, 13.0323f, 19.5523f, 13.48f, 19.0f, 13.48f)
                horizontalLineTo(14.1805f)
                curveTo(12.9446f, 13.48f, 12.0045f, 14.5897f, 12.2077f, 15.8088f)
                close()
                moveTo(7.0f, 5.48f)
                verticalLineTo(13.48f)
                horizontalLineTo(4.5f)
                curveTo(4.2239f, 13.48f, 4.0f, 13.2561f, 4.0f, 12.98f)
                verticalLineTo(5.98f)
                curveTo(4.0f, 5.7038f, 4.2239f, 5.48f, 4.5f, 5.48f)
                horizontalLineTo(7.0f)
                close()
            }
        }.build()
        return thumbDown!!
    }

private var thumbDown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ThumbDown,
                contentDescription = ""
            )
        }
    }
}