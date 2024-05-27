package io.github.madmaximuus.persianSymbols.keyboard

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

val PersianSymbols.Default.Keyboard: ImageVector
    get() {
        if (keyboard != null) {
            return keyboard!!
        }
        keyboard = Builder(
            name = "keyboard-default",
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
                moveTo(5.7f, 8.0f)
                curveTo(5.3134f, 8.0f, 5.0f, 8.3134f, 5.0f, 8.7f)
                verticalLineTo(9.3f)
                curveTo(5.0f, 9.6866f, 5.3134f, 10.0f, 5.7f, 10.0f)
                horizontalLineTo(6.3f)
                curveTo(6.6866f, 10.0f, 7.0f, 9.6866f, 7.0f, 9.3f)
                verticalLineTo(8.7f)
                curveTo(7.0f, 8.3134f, 6.6866f, 8.0f, 6.3f, 8.0f)
                horizontalLineTo(5.7f)
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
                moveTo(7.7f, 15.0f)
                curveTo(7.3134f, 15.0f, 7.0f, 15.3134f, 7.0f, 15.7f)
                verticalLineTo(16.3f)
                curveTo(7.0f, 16.6866f, 7.3134f, 17.0f, 7.7f, 17.0f)
                horizontalLineTo(16.3f)
                curveTo(16.6866f, 17.0f, 17.0f, 16.6866f, 17.0f, 16.3f)
                verticalLineTo(15.7f)
                curveTo(17.0f, 15.3134f, 16.6866f, 15.0f, 16.3f, 15.0f)
                horizontalLineTo(7.7f)
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
                moveTo(5.0f, 11.7f)
                curveTo(5.0f, 11.3134f, 5.3134f, 11.0f, 5.7f, 11.0f)
                horizontalLineTo(6.3f)
                curveTo(6.6866f, 11.0f, 7.0f, 11.3134f, 7.0f, 11.7f)
                verticalLineTo(12.3f)
                curveTo(7.0f, 12.6866f, 6.6866f, 13.0f, 6.3f, 13.0f)
                horizontalLineTo(5.7f)
                curveTo(5.3134f, 13.0f, 5.0f, 12.6866f, 5.0f, 12.3f)
                verticalLineTo(11.7f)
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
                moveTo(8.7f, 8.0f)
                curveTo(8.3134f, 8.0f, 8.0f, 8.3134f, 8.0f, 8.7f)
                verticalLineTo(9.3f)
                curveTo(8.0f, 9.6866f, 8.3134f, 10.0f, 8.7f, 10.0f)
                horizontalLineTo(9.3f)
                curveTo(9.6866f, 10.0f, 10.0f, 9.6866f, 10.0f, 9.3f)
                verticalLineTo(8.7f)
                curveTo(10.0f, 8.3134f, 9.6866f, 8.0f, 9.3f, 8.0f)
                horizontalLineTo(8.7f)
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
                moveTo(8.0f, 11.7f)
                curveTo(8.0f, 11.3134f, 8.3134f, 11.0f, 8.7f, 11.0f)
                horizontalLineTo(9.3f)
                curveTo(9.6866f, 11.0f, 10.0f, 11.3134f, 10.0f, 11.7f)
                verticalLineTo(12.3f)
                curveTo(10.0f, 12.6866f, 9.6866f, 13.0f, 9.3f, 13.0f)
                horizontalLineTo(8.7f)
                curveTo(8.3134f, 13.0f, 8.0f, 12.6866f, 8.0f, 12.3f)
                verticalLineTo(11.7f)
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
                moveTo(11.7f, 8.0f)
                curveTo(11.3134f, 8.0f, 11.0f, 8.3134f, 11.0f, 8.7f)
                verticalLineTo(9.3f)
                curveTo(11.0f, 9.6866f, 11.3134f, 10.0f, 11.7f, 10.0f)
                horizontalLineTo(12.3f)
                curveTo(12.6866f, 10.0f, 13.0f, 9.6866f, 13.0f, 9.3f)
                verticalLineTo(8.7f)
                curveTo(13.0f, 8.3134f, 12.6866f, 8.0f, 12.3f, 8.0f)
                horizontalLineTo(11.7f)
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
                moveTo(11.0f, 11.7f)
                curveTo(11.0f, 11.3134f, 11.3134f, 11.0f, 11.7f, 11.0f)
                horizontalLineTo(12.3f)
                curveTo(12.6866f, 11.0f, 13.0f, 11.3134f, 13.0f, 11.7f)
                verticalLineTo(12.3f)
                curveTo(13.0f, 12.6866f, 12.6866f, 13.0f, 12.3f, 13.0f)
                horizontalLineTo(11.7f)
                curveTo(11.3134f, 13.0f, 11.0f, 12.6866f, 11.0f, 12.3f)
                verticalLineTo(11.7f)
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
                moveTo(14.7f, 8.0f)
                curveTo(14.3134f, 8.0f, 14.0f, 8.3134f, 14.0f, 8.7f)
                verticalLineTo(9.3f)
                curveTo(14.0f, 9.6866f, 14.3134f, 10.0f, 14.7f, 10.0f)
                horizontalLineTo(15.3f)
                curveTo(15.6866f, 10.0f, 16.0f, 9.6866f, 16.0f, 9.3f)
                verticalLineTo(8.7f)
                curveTo(16.0f, 8.3134f, 15.6866f, 8.0f, 15.3f, 8.0f)
                horizontalLineTo(14.7f)
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
                moveTo(14.0f, 11.7f)
                curveTo(14.0f, 11.3134f, 14.3134f, 11.0f, 14.7f, 11.0f)
                horizontalLineTo(15.3f)
                curveTo(15.6866f, 11.0f, 16.0f, 11.3134f, 16.0f, 11.7f)
                verticalLineTo(12.3f)
                curveTo(16.0f, 12.6866f, 15.6866f, 13.0f, 15.3f, 13.0f)
                horizontalLineTo(14.7f)
                curveTo(14.3134f, 13.0f, 14.0f, 12.6866f, 14.0f, 12.3f)
                verticalLineTo(11.7f)
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
                moveTo(17.7f, 8.0f)
                curveTo(17.3134f, 8.0f, 17.0f, 8.3134f, 17.0f, 8.7f)
                verticalLineTo(9.3f)
                curveTo(17.0f, 9.6866f, 17.3134f, 10.0f, 17.7f, 10.0f)
                horizontalLineTo(18.3f)
                curveTo(18.6866f, 10.0f, 19.0f, 9.6866f, 19.0f, 9.3f)
                verticalLineTo(8.7f)
                curveTo(19.0f, 8.3134f, 18.6866f, 8.0f, 18.3f, 8.0f)
                horizontalLineTo(17.7f)
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
                moveTo(17.0f, 11.7f)
                curveTo(17.0f, 11.3134f, 17.3134f, 11.0f, 17.7f, 11.0f)
                horizontalLineTo(18.3f)
                curveTo(18.6866f, 11.0f, 19.0f, 11.3134f, 19.0f, 11.7f)
                verticalLineTo(12.3f)
                curveTo(19.0f, 12.6866f, 18.6866f, 13.0f, 18.3f, 13.0f)
                horizontalLineTo(17.7f)
                curveTo(17.3134f, 13.0f, 17.0f, 12.6866f, 17.0f, 12.3f)
                verticalLineTo(11.7f)
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
                moveTo(6.5f, 4.0f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 17.9853f, 4.0147f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 20.0f, 22.0f, 17.9853f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6.0f, 20.0f, 7.1193f, 20.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20.0f, 16.8807f, 18.8807f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return keyboard!!
    }

private var keyboard: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Keyboard,
                contentDescription = ""
            )
        }
    }
}