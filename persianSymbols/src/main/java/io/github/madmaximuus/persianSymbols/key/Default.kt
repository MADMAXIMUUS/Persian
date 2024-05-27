package io.github.madmaximuus.persianSymbols.key

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val PersianSymbols.Default.Key: ImageVector
    get() {
        if (key != null) {
            return key!!
        }
        key = Builder(
            name = "key-default",
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
                moveTo(6.9981f, 13.9999f)
                curveTo(8.1026f, 13.9999f, 8.998f, 13.1044f, 8.998f, 11.9999f)
                curveTo(8.998f, 10.8953f, 8.1026f, 9.9999f, 6.9981f, 9.9999f)
                curveTo(5.8935f, 9.9999f, 4.9981f, 10.8953f, 4.9981f, 11.9999f)
                curveTo(4.9981f, 13.1044f, 5.8935f, 13.9999f, 6.9981f, 13.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.9981f, 7.0128f)
                curveTo(4.2366f, 7.0128f, 1.998f, 9.2514f, 1.998f, 12.0128f)
                curveTo(1.998f, 14.7742f, 4.2366f, 17.0128f, 6.9981f, 17.0128f)
                curveTo(8.6393f, 17.0128f, 10.0855f, 16.2068f, 10.9928f, 15.0f)
                horizontalLineTo(12.5858f)
                lineTo(14.2929f, 16.7071f)
                curveTo(14.6834f, 17.0976f, 15.3166f, 17.0976f, 15.7071f, 16.7071f)
                lineTo(17.0f, 15.4142f)
                lineTo(18.2929f, 16.7071f)
                curveTo(18.52f, 16.9342f, 18.8424f, 17.0384f, 19.1595f, 16.9872f)
                curveTo(19.4767f, 16.9359f, 19.7498f, 16.7355f, 19.8939f, 16.4484f)
                lineTo(21.8939f, 12.4612f)
                curveTo(21.9637f, 12.322f, 22.0f, 12.1685f, 22.0f, 12.0128f)
                verticalLineTo(10.0049f)
                curveTo(22.0f, 9.4526f, 21.5523f, 9.0049f, 21.0f, 9.0049f)
                horizontalLineTo(10.9923f)
                curveTo(10.0808f, 7.7964f, 8.6314f, 7.0128f, 6.9981f, 7.0128f)
                close()
                moveTo(3.998f, 12.0128f)
                curveTo(3.998f, 10.356f, 5.3412f, 9.0128f, 6.9981f, 9.0128f)
                curveTo(8.1047f, 9.0128f, 9.0728f, 9.6116f, 9.5939f, 10.5076f)
                curveTo(9.7729f, 10.8154f, 10.1022f, 11.0049f, 10.4583f, 11.0049f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.7761f)
                lineTo(18.7274f, 14.3132f)
                lineTo(17.7071f, 13.2929f)
                curveTo(17.3166f, 12.9024f, 16.6834f, 12.9024f, 16.2929f, 13.2929f)
                lineTo(15.0f, 14.5858f)
                lineTo(13.7071f, 13.2929f)
                curveTo(13.5196f, 13.1054f, 13.2652f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(10.4583f)
                curveTo(10.1022f, 13.0f, 9.7729f, 13.1894f, 9.5939f, 13.4973f)
                curveTo(9.0676f, 14.4021f, 8.095f, 15.0128f, 6.9981f, 15.0128f)
                curveTo(5.3412f, 15.0128f, 3.998f, 13.6697f, 3.998f, 12.0128f)
                close()
            }
        }.build()
        return key!!
    }

private var key: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Key,
                contentDescription = ""
            )
        }
    }
}