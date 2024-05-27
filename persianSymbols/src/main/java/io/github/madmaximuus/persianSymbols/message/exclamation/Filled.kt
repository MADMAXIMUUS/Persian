package io.github.madmaximuus.persianSymbols.message.exclamation

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

val PersianSymbols.Filled.MessageExclamation: ImageVector
    get() {
        if (messageExclamation != null) {
            return messageExclamation!!
        }
        messageExclamation = Builder(
            name = "message-exclamation-filled",
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
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 4.0f, 22.0f, 5.97f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 18.0301f, 20.0301f, 20.0f, 17.6f, 20.0f)
                horizontalLineTo(8.1664f)
                curveTo(7.7622f, 20.0f, 7.3611f, 20.07f, 6.9809f, 20.2069f)
                lineTo(3.3387f, 21.5181f)
                curveTo(2.6871f, 21.7527f, 2.0f, 21.2698f, 2.0f, 20.5772f)
                verticalLineTo(8.4f)
                curveTo(2.0f, 5.97f, 3.9699f, 4.0f, 6.4f, 4.0f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(12.5523f, 7.5f, 13.0f, 7.9477f, 13.0f, 8.5f)
                verticalLineTo(12.5f)
                curveTo(13.0f, 13.0523f, 12.5523f, 13.5f, 12.0f, 13.5f)
                curveTo(11.4477f, 13.5f, 11.0f, 13.0523f, 11.0f, 12.5f)
                verticalLineTo(8.5f)
                curveTo(11.0f, 7.9477f, 11.4477f, 7.5f, 12.0f, 7.5f)
                close()
                moveTo(11.0f, 15.5f)
                curveTo(11.0f, 16.0523f, 11.4477f, 16.5f, 12.0f, 16.5f)
                curveTo(12.5523f, 16.5f, 13.0f, 16.0523f, 13.0f, 15.5f)
                curveTo(13.0f, 14.9477f, 12.5523f, 14.5f, 12.0f, 14.5f)
                curveTo(11.4477f, 14.5f, 11.0f, 14.9477f, 11.0f, 15.5f)
                close()
            }
        }.build()
        return messageExclamation!!
    }

private var messageExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.MessageExclamation,
                contentDescription = ""
            )
        }
    }
}