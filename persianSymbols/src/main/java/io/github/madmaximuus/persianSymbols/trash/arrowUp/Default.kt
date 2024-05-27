package io.github.madmaximuus.persianSymbols.trash.arrowUp

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

val PersianSymbols.Default.TrashArrowUp: ImageVector
    get() {
        if (trashArrowUp != null) {
            return trashArrowUp!!
        }
        trashArrowUp = Builder(
            name = "trash-arrow-up-default",
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
                moveTo(8.4033f, 13.8063f)
                curveTo(7.9601f, 13.4768f, 7.868f, 12.8503f, 8.1976f, 12.4071f)
                lineTo(11.175f, 8.4033f)
                curveTo(11.2967f, 8.2396f, 11.4638f, 8.1193f, 11.6519f, 8.0545f)
                curveTo(11.761f, 8.014f, 11.8791f, 7.992f, 12.0023f, 7.9922f)
                curveTo(12.4041f, 7.9932f, 12.7499f, 8.2309f, 12.9081f, 8.573f)
                lineTo(15.7981f, 12.4014f)
                curveTo(16.1309f, 12.8422f, 16.0433f, 13.4692f, 15.6025f, 13.802f)
                curveTo(15.1617f, 14.1347f, 14.5346f, 14.0472f, 14.2019f, 13.6064f)
                lineTo(12.9927f, 12.0046f)
                lineTo(12.9807f, 17.0024f)
                curveTo(12.9794f, 17.5547f, 12.5306f, 18.0013f, 11.9783f, 18.0f)
                curveTo(11.426f, 17.9987f, 10.9794f, 17.5499f, 10.9807f, 16.9976f)
                lineTo(10.9927f, 12.0f)
                lineTo(9.8024f, 13.6006f)
                curveTo(9.4729f, 14.0438f, 8.8464f, 14.1359f, 8.4033f, 13.8063f)
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
                moveTo(7.9998f, 3.0f)
                curveTo(7.4475f, 3.0f, 6.9998f, 3.4477f, 6.9998f, 4.0f)
                lineTo(4.0f, 4.0002f)
                curveTo(3.4477f, 4.0002f, 3.0f, 4.448f, 3.0f, 5.0002f)
                curveTo(3.0f, 5.5525f, 3.4476f, 6.0002f, 3.9999f, 6.0002f)
                verticalLineTo(17.5f)
                curveTo(3.9999f, 19.9853f, 6.0146f, 22.0f, 8.4999f, 22.0f)
                horizontalLineTo(15.4999f)
                curveTo(17.9851f, 22.0f, 19.9999f, 19.9853f, 19.9999f, 17.5f)
                verticalLineTo(6.0002f)
                curveTo(20.5521f, 6.0002f, 21.0f, 5.5525f, 21.0f, 5.0002f)
                curveTo(21.0f, 4.448f, 20.5523f, 4.0002f, 20.0f, 4.0002f)
                horizontalLineTo(16.9998f)
                curveTo(16.9998f, 3.448f, 16.5521f, 3.0f, 15.9998f, 3.0f)
                horizontalLineTo(7.9998f)
                close()
                moveTo(5.9999f, 17.5f)
                verticalLineTo(6.0002f)
                horizontalLineTo(17.9999f)
                verticalLineTo(17.5f)
                curveTo(17.9999f, 18.8808f, 16.8806f, 20.0f, 15.4999f, 20.0f)
                horizontalLineTo(8.4999f)
                curveTo(7.1192f, 20.0f, 5.9999f, 18.8808f, 5.9999f, 17.5f)
                close()
            }
        }.build()
        return trashArrowUp!!
    }

private var trashArrowUp: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.TrashArrowUp,
                contentDescription = ""
            )
        }
    }
}