package io.github.madmaximuus.persianSymbols.check.circle

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CheckCircle: ImageVector
    get() {
        if (checkCircle != null) {
            return checkCircle!!
        }
        checkCircle = ImageVector.Builder(
            name = "check-circle-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(17.3033f, 9.2929f)
                curveTo(17.6938f, 9.6834f, 17.6938f, 10.3166f, 17.3033f, 10.7071f)
                lineTo(11.6505f, 16.3599f)
                lineTo(11.6464f, 16.364f)
                curveTo(11.2559f, 16.7545f, 10.6228f, 16.7545f, 10.2322f, 16.364f)
                lineTo(6.6967f, 12.8284f)
                curveTo(6.3062f, 12.4379f, 6.3062f, 11.8048f, 6.6967f, 11.4142f)
                curveTo(7.0872f, 11.0237f, 7.7204f, 11.0237f, 8.1109f, 11.4142f)
                lineTo(10.9393f, 14.2426f)
                lineTo(15.8891f, 9.2929f)
                curveTo(16.2796f, 8.9024f, 16.9128f, 8.9024f, 17.3033f, 9.2929f)
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
                moveTo(11.9999f, 1.9999f)
                curveTo(6.477f, 1.9999f, 1.9999f, 6.477f, 1.9999f, 11.9999f)
                curveTo(1.9999f, 17.5227f, 6.477f, 21.9999f, 11.9999f, 21.9999f)
                curveTo(17.5227f, 21.9999f, 21.9998f, 17.5227f, 21.9998f, 11.9999f)
                curveTo(21.9998f, 6.477f, 17.5227f, 1.9999f, 11.9999f, 1.9999f)
                close()
                moveTo(3.9999f, 11.9999f)
                curveTo(3.9999f, 7.5816f, 7.5816f, 3.9999f, 11.9999f, 3.9999f)
                curveTo(16.4181f, 3.9999f, 19.9998f, 7.5816f, 19.9998f, 11.9999f)
                curveTo(19.9998f, 16.4182f, 16.4181f, 19.9999f, 11.9999f, 19.9999f)
                curveTo(7.5816f, 19.9999f, 3.9999f, 16.4182f, 3.9999f, 11.9999f)
                close()
            }
        }.build()
        return checkCircle!!
    }

private var checkCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CheckCircle,
                contentDescription = ""
            )
        }
    }
}