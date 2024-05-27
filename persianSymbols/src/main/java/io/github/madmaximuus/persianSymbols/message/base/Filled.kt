package io.github.madmaximuus.persianSymbols.message.base

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

val PersianSymbols.Filled.Message: ImageVector
    get() {
        if (message != null) {
            return message!!
        }
        message = Builder(
            name = "message-filled",
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
                moveTo(17.6f, 3.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 3.0f, 2.0f, 4.97f, 2.0f, 7.4f)
                verticalLineTo(19.5772f)
                curveTo(2.0f, 20.2698f, 2.6871f, 20.7527f, 3.3387f, 20.5181f)
                lineTo(6.9809f, 19.2069f)
                curveTo(7.3611f, 19.07f, 7.7622f, 19.0f, 8.1664f, 19.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 19.0f, 22.0f, 17.0301f, 22.0f, 14.6f)
                verticalLineTo(7.4f)
                curveTo(22.0f, 4.97f, 20.0301f, 3.0f, 17.6f, 3.0f)
                close()
            }
        }.build()
        return message!!
    }

private var message: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Message,
                contentDescription = ""
            )
        }
    }
}