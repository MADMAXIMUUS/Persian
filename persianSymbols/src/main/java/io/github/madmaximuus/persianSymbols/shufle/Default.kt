package io.github.madmaximuus.persianSymbols.shufle

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

val PersianSymbols.Default.Shuffle: ImageVector
    get() {
        if (shuffle != null) {
            return shuffle!!
        }
        shuffle = Builder(
            name = "shuffle-default",
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
                moveTo(2.2929f, 20.2929f)
                curveTo(1.9024f, 20.6834f, 1.9024f, 21.3166f, 2.2929f, 21.7071f)
                curveTo(2.6834f, 22.0976f, 3.3166f, 22.0976f, 3.7071f, 21.7071f)
                lineTo(20.0f, 5.4142f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 7.5523f, 20.4477f, 8.0f, 21.0f, 8.0f)
                curveTo(21.5523f, 8.0f, 22.0f, 7.5523f, 22.0f, 7.0f)
                verticalLineTo(3.5f)
                curveTo(22.0f, 3.4058f, 21.9913f, 3.3136f, 21.9747f, 3.2241f)
                curveTo(22.049f, 2.8998f, 21.9598f, 2.5456f, 21.7071f, 2.2929f)
                curveTo(21.4544f, 2.0402f, 21.1002f, 1.951f, 20.7758f, 2.0253f)
                curveTo(20.6864f, 2.0087f, 20.5942f, 2.0f, 20.5f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(16.4477f, 2.0f, 16.0f, 2.4477f, 16.0f, 3.0f)
                curveTo(16.0f, 3.5523f, 16.4477f, 4.0f, 17.0f, 4.0f)
                horizontalLineTo(18.5858f)
                lineTo(2.2929f, 20.2929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.2929f, 2.2929f)
                curveTo(2.6834f, 1.9024f, 3.3166f, 1.9024f, 3.7071f, 2.2929f)
                lineTo(11.2929f, 9.8787f)
                lineTo(9.8787f, 11.2929f)
                lineTo(2.2929f, 3.7071f)
                curveTo(1.9024f, 3.3166f, 1.9024f, 2.6834f, 2.2929f, 2.2929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.7071f, 14.1213f)
                lineTo(14.1213f, 12.7071f)
                lineTo(20.0f, 18.5858f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 16.4477f, 20.4477f, 16.0f, 21.0f, 16.0f)
                curveTo(21.5523f, 16.0f, 22.0f, 16.4477f, 22.0f, 17.0f)
                verticalLineTo(20.5f)
                curveTo(22.0f, 20.5942f, 21.9913f, 20.6864f, 21.9747f, 20.7758f)
                curveTo(22.049f, 21.1002f, 21.9598f, 21.4544f, 21.7071f, 21.7071f)
                curveTo(21.4544f, 21.9598f, 21.1002f, 22.049f, 20.7758f, 21.9747f)
                curveTo(20.6864f, 21.9913f, 20.5942f, 22.0f, 20.5f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(16.4477f, 22.0f, 16.0f, 21.5523f, 16.0f, 21.0f)
                curveTo(16.0f, 20.4477f, 16.4477f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(18.5858f)
                lineTo(12.7071f, 14.1213f)
                close()
            }
        }.build()
        return shuffle!!
    }

private var shuffle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Shuffle,
                contentDescription = ""
            )
        }
    }
}