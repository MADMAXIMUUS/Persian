package io.github.madmaximuus.persianIcons.check.box

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Default.CheckBox: ImageVector
    get() {
        if (checkBox != null) {
            return checkBox!!
        }
        checkBox = ImageVector.Builder(
            name = "check-box-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(17.3034f, 8.46434f)
                curveTo(17.6939f, 8.8549f, 17.6939f, 9.488f, 17.3034f, 9.8786f)
                lineTo(11.6465f, 15.5354f)
                curveTo(11.4374f, 15.7445f, 11.1588f, 15.8416f, 10.8851f, 15.8268f)
                curveTo(10.6106f, 15.8423f, 10.331f, 15.7452f, 10.1214f, 15.5355f)
                lineTo(7.29295f, 12.7071f)
                curveTo(6.9024f, 12.3166f, 6.9024f, 11.6834f, 7.293f, 11.2929f)
                curveTo(7.6835f, 10.9024f, 8.3166f, 10.9024f, 8.7072f, 11.2929f)
                lineTo(10.8839f, 13.4696f)
                lineTo(15.8891f, 8.46434f)
                curveTo(16.2797f, 8.0738f, 16.9128f, 8.0738f, 17.3034f, 8.4643f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 2.99994f)
                curveTo(5.0147f, 2.9999f, 3f, 5.0147f, 3f, 7.4999f)
                verticalLineTo(16.4999f)
                curveTo(3f, 18.9852f, 5.0147f, 20.9999f, 7.5f, 20.9999f)
                horizontalLineTo(16.4999f)
                curveTo(18.9852f, 20.9999f, 20.9999f, 18.9852f, 20.9999f, 16.4999f)
                verticalLineTo(7.49994f)
                curveTo(20.9999f, 5.0147f, 18.9852f, 2.9999f, 16.4999f, 2.9999f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5f, 7.49994f)
                curveTo(5f, 6.1192f, 6.1193f, 4.9999f, 7.5f, 4.9999f)
                horizontalLineTo(16.4999f)
                curveTo(17.8807f, 4.9999f, 18.9999f, 6.1192f, 18.9999f, 7.4999f)
                verticalLineTo(16.4999f)
                curveTo(18.9999f, 17.8806f, 17.8807f, 18.9999f, 16.4999f, 18.9999f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 18.9999f, 5f, 17.8806f, 5f, 16.4999f)
                verticalLineTo(7.49994f)
                close()
            }
        }.build()
        return checkBox!!
    }

private var checkBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CheckBox,
                contentDescription = ""
            )
        }
    }
}