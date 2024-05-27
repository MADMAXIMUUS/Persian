package io.github.madmaximuus.persianSymbols.at

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

val PersianSymbols.Default.At: ImageVector
    get() {
        if (at != null) {
            return at!!
        }
        at = Builder(
            name = "at-default",
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
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                verticalLineTo(12.0623f)
                lineTo(20.0077f, 12.124f)
                curveTo(20.078f, 12.686f, 20.0462f, 13.4966f, 19.7889f, 14.1167f)
                curveTo(19.6655f, 14.4141f, 19.5077f, 14.6262f, 19.3253f, 14.7635f)
                curveTo(19.1537f, 14.8926f, 18.9027f, 15.0f, 18.5f, 15.0f)
                curveTo(18.0973f, 15.0f, 17.8463f, 14.8926f, 17.6747f, 14.7635f)
                curveTo(17.4923f, 14.6262f, 17.3345f, 14.4141f, 17.2111f, 14.1167f)
                curveTo(17.0246f, 13.6672f, 16.9566f, 13.1176f, 16.96f, 12.6352f)
                curveTo(16.9858f, 12.4319f, 16.9994f, 12.2248f, 17.0f, 12.0147f)
                curveTo(17.0002f, 12.0038f, 17.0001f, 11.993f, 17.0f, 11.9822f)
                curveTo(16.9904f, 9.229f, 14.7555f, 7.0f, 12.0f, 7.0f)
                curveTo(9.2386f, 7.0f, 7.0f, 9.2386f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(13.4342f, 17.0f, 14.7273f, 16.3962f, 15.6391f, 15.4289f)
                curveTo(15.847f, 15.7718f, 16.1187f, 16.0956f, 16.4721f, 16.3615f)
                curveTo(17.0204f, 16.7741f, 17.7027f, 17.0f, 18.5f, 17.0f)
                curveTo(19.2973f, 17.0f, 19.9796f, 16.7741f, 20.5279f, 16.3615f)
                curveTo(21.0652f, 15.9571f, 21.4137f, 15.4192f, 21.6361f, 14.8833f)
                curveTo(22.0587f, 13.865f, 22.0874f, 12.7113f, 21.9998f, 11.9392f)
                curveTo(21.9671f, 6.4444f, 17.5026f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 22.0f, 18.0f, 21.5523f, 18.0f, 21.0f)
                curveTo(18.0f, 20.4477f, 17.5523f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(12.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                close()
                moveTo(14.9995f, 11.9452f)
                curveTo(14.9814f, 12.1063f, 14.9684f, 12.2838f, 14.9629f, 12.4731f)
                curveTo(14.736f, 13.9052f, 13.4959f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6385f, 9.0f, 14.9703f, 10.3136f, 14.9995f, 11.9452f)
                close()
            }
        }.build()
        return at!!
    }

private var at: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.At,
                contentDescription = ""
            )
        }
    }
}