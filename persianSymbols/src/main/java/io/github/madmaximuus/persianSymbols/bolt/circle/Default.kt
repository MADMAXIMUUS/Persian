package io.github.madmaximuus.persianSymbols.bolt.circle

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

val PersianSymbols.Default.BoltCircle: ImageVector
    get() {
        if (boltCircle != null) {
            return boltCircle!!
        }
        boltCircle = Builder(
            name = "bolt-circle-default",
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
                moveTo(12.8619f, 6.5175f)
                lineTo(8.7046f, 13.0691f)
                curveTo(8.6159f, 13.2089f, 8.7164f, 13.3916f, 8.882f, 13.3916f)
                horizontalLineTo(11.0571f)
                curveTo(11.1852f, 13.3916f, 11.2834f, 13.5052f, 11.2649f, 13.6319f)
                lineTo(10.7252f, 17.3318f)
                curveTo(10.6925f, 17.5557f, 10.9883f, 17.6658f, 11.11f, 17.475f)
                lineTo(15.2941f, 10.9145f)
                curveTo(15.3832f, 10.7747f, 15.2828f, 10.5916f, 15.117f, 10.5916f)
                horizontalLineTo(12.9412f)
                curveTo(12.8138f, 10.5916f, 12.7157f, 10.4789f, 12.7333f, 10.3527f)
                lineTo(13.2473f, 6.6589f)
                curveTo(13.2784f, 6.4353f, 12.9829f, 6.3268f, 12.8619f, 6.5175f)
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
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                close()
            }
        }.build()
        return boltCircle!!
    }

private var boltCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BoltCircle,
                contentDescription = ""
            )
        }
    }
}