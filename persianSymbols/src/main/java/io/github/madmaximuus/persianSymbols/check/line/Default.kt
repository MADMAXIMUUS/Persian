package io.github.madmaximuus.persianSymbols.check.line

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

val PersianSymbols.Default.CheckLine: ImageVector
    get() {
        if (checkLine != null) {
            return checkLine!!
        }
        checkLine = Builder(
            name = "check-line-default",
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
                moveTo(19.071f, 5.5503f)
                curveTo(19.5021f, 5.8954f, 19.5351f, 6.4918f, 19.1446f, 6.8823f)
                lineTo(10.7668f, 15.2601f)
                curveTo(10.7174f, 15.3288f, 10.657f, 15.3927f, 10.5857f, 15.4498f)
                curveTo(10.3832f, 15.6119f, 10.129f, 15.6897f, 9.8758f, 15.6863f)
                curveTo(9.6244f, 15.6885f, 9.3724f, 15.6106f, 9.1715f, 15.4498f)
                curveTo(9.1002f, 15.3928f, 9.0399f, 15.3289f, 8.9905f, 15.2602f)
                lineTo(4.8553f, 11.125f)
                curveTo(4.4648f, 10.7345f, 4.4977f, 10.1381f, 4.9288f, 9.793f)
                curveTo(5.36f, 9.4478f, 6.0261f, 9.4846f, 6.4166f, 9.8751f)
                lineTo(9.8786f, 13.3371f)
                lineTo(17.5832f, 5.6325f)
                curveTo(17.9737f, 5.242f, 18.6398f, 5.2052f, 19.071f, 5.5503f)
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
                moveTo(3.9999f, 16.7427f)
                curveTo(3.4476f, 16.7427f, 2.9999f, 17.1905f, 2.9999f, 17.7427f)
                curveTo(2.9999f, 18.295f, 3.4476f, 18.7427f, 3.9999f, 18.7427f)
                horizontalLineTo(19.9999f)
                curveTo(20.5522f, 18.7427f, 20.9999f, 18.295f, 20.9999f, 17.7427f)
                curveTo(20.9999f, 17.1905f, 20.5522f, 16.7427f, 19.9999f, 16.7427f)
                horizontalLineTo(3.9999f)
                close()
            }
        }.build()
        return checkLine!!
    }

private var checkLine: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CheckLine,
                contentDescription = ""
            )
        }
    }
}