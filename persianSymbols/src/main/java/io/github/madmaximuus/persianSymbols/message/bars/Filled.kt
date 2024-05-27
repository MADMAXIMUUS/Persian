package io.github.madmaximuus.persianSymbols.message.bars

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

val PersianSymbols.Filled.MessageBars: ImageVector
    get() {
        if (messageBars != null) {
            return messageBars!!
        }
        messageBars = Builder(
            name = "message-bars-filled",
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
                moveTo(6.4f, 3.21f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 3.21f, 22.0f, 5.1799f, 22.0f, 7.61f)
                verticalLineTo(14.81f)
                curveTo(22.0f, 17.24f, 20.0301f, 19.21f, 17.6f, 19.21f)
                horizontalLineTo(8.1664f)
                curveTo(7.7622f, 19.21f, 7.3611f, 19.28f, 6.9809f, 19.4169f)
                lineTo(3.3387f, 20.728f)
                curveTo(2.6871f, 20.9626f, 2.0f, 20.4797f, 2.0f, 19.7871f)
                verticalLineTo(7.61f)
                curveTo(2.0f, 5.1799f, 3.9699f, 3.21f, 6.4f, 3.21f)
                close()
                moveTo(7.0f, 7.21f)
                curveTo(6.4477f, 7.21f, 6.0f, 7.6577f, 6.0f, 8.21f)
                curveTo(6.0f, 8.7622f, 6.4477f, 9.21f, 7.0f, 9.21f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 9.21f, 18.0f, 8.7622f, 18.0f, 8.21f)
                curveTo(18.0f, 7.6577f, 17.5523f, 7.21f, 17.0f, 7.21f)
                horizontalLineTo(7.0f)
                close()
                moveTo(7.0f, 10.21f)
                curveTo(6.4477f, 10.21f, 6.0f, 10.6577f, 6.0f, 11.21f)
                curveTo(6.0f, 11.7622f, 6.4477f, 12.21f, 7.0f, 12.21f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 12.21f, 18.0f, 11.7622f, 18.0f, 11.21f)
                curveTo(18.0f, 10.6577f, 17.5523f, 10.21f, 17.0f, 10.21f)
                horizontalLineTo(7.0f)
                close()
                moveTo(6.0f, 14.21f)
                curveTo(6.0f, 13.6577f, 6.4477f, 13.21f, 7.0f, 13.21f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 13.21f, 14.0f, 13.6577f, 14.0f, 14.21f)
                curveTo(14.0f, 14.7622f, 13.5523f, 15.21f, 13.0f, 15.21f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 15.21f, 6.0f, 14.7622f, 6.0f, 14.21f)
                close()
            }
        }.build()
        return messageBars!!
    }

private var messageBars: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.MessageBars,
                contentDescription = ""
            )
        }
    }
}