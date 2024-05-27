package io.github.madmaximuus.persianSymbols.eye.base

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

val PersianSymbols.Default.Eye: ImageVector
    get() {
        if (eye != null) {
            return eye!!
        }
        eye = Builder(
            name = "eye-default",
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
                moveTo(12.0f, 8.0f)
                curveTo(9.7908f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7908f, 16.0f, 12.0f, 16.0f)
                curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1045f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1045f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
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
                moveTo(12.0f, 5.0f)
                curveTo(7.8966f, 5.0f, 5.227f, 6.7411f, 3.6733f, 8.6355f)
                curveTo(2.0458f, 10.6199f, 2.266f, 13.4214f, 3.8559f, 15.291f)
                curveTo(5.3985f, 17.1051f, 8.0082f, 19.0f, 12.0f, 19.0f)
                curveTo(15.9917f, 19.0f, 18.6015f, 17.1051f, 20.1441f, 15.291f)
                curveTo(21.734f, 13.4214f, 21.9542f, 10.6199f, 20.3267f, 8.6355f)
                curveTo(18.7729f, 6.7411f, 16.1034f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(5.2197f, 9.9038f)
                curveTo(6.4177f, 8.4431f, 8.5327f, 7.0f, 12.0f, 7.0f)
                curveTo(15.4673f, 7.0f, 17.5823f, 8.4431f, 18.7802f, 9.9038f)
                curveTo(19.7247f, 11.0554f, 19.658f, 12.7753f, 18.6205f, 13.9954f)
                curveTo(17.3638f, 15.4732f, 15.2741f, 17.0f, 12.0f, 17.0f)
                curveTo(8.7259f, 17.0f, 6.6361f, 15.4732f, 5.3795f, 13.9954f)
                curveTo(4.342f, 12.7753f, 4.2752f, 11.0554f, 5.2197f, 9.9038f)
                close()
            }
        }.build()
        return eye!!
    }

private var eye: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Eye,
                contentDescription = ""
            )
        }
    }
}