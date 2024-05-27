package io.github.madmaximuus.persianSymbols.user.base

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

val PersianSymbols.Default.User: ImageVector
    get() {
        if (user != null) {
            return user!!
        }
        user = Builder(
            name = "user-default",
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
                moveTo(12.0f, 3.0f)
                curveTo(9.2386f, 3.0f, 7.0001f, 5.2386f, 7.0001f, 8.0f)
                curveTo(7.0001f, 10.7614f, 9.2386f, 13.0f, 12.0f, 13.0f)
                curveTo(14.7615f, 13.0f, 17.0f, 10.7614f, 17.0f, 8.0f)
                curveTo(17.0f, 5.2386f, 14.7615f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(9.0f, 6.3432f, 10.3432f, 5.0f, 12.0f, 5.0f)
                curveTo(13.6569f, 5.0f, 15.0f, 6.3432f, 15.0f, 8.0f)
                curveTo(15.0f, 9.6568f, 13.6569f, 11.0f, 12.0f, 11.0f)
                curveTo(10.3432f, 11.0f, 9.0f, 9.6568f, 9.0f, 8.0f)
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
                moveTo(12.0001f, 14.0f)
                curveTo(9.2449f, 14.0f, 6.7691f, 15.2215f, 5.3183f, 17.1454f)
                curveTo(4.9009f, 17.699f, 4.6975f, 18.3213f, 4.7275f, 18.9541f)
                curveTo(4.757f, 19.5772f, 5.0086f, 20.1333f, 5.3684f, 20.5799f)
                curveTo(6.0753f, 21.4573f, 7.2598f, 22.0f, 8.5001f, 22.0f)
                horizontalLineTo(15.5001f)
                curveTo(16.7403f, 22.0f, 17.9248f, 21.4573f, 18.6317f, 20.5799f)
                curveTo(18.9915f, 20.1333f, 19.2431f, 19.5772f, 19.2726f, 18.9541f)
                curveTo(19.3026f, 18.3213f, 19.0992f, 17.699f, 18.6818f, 17.1454f)
                curveTo(17.2311f, 15.2215f, 14.7552f, 14.0f, 12.0001f, 14.0f)
                close()
                moveTo(6.9152f, 18.3495f)
                curveTo(7.9577f, 16.967f, 9.8204f, 16.0f, 12.0001f, 16.0f)
                curveTo(14.1797f, 16.0f, 16.0424f, 16.967f, 17.0849f, 18.3495f)
                curveTo(17.2493f, 18.5676f, 17.2806f, 18.7378f, 17.2748f, 18.8595f)
                curveTo(17.2686f, 18.991f, 17.2141f, 19.1516f, 17.0743f, 19.3251f)
                curveTo(16.7818f, 19.6882f, 16.1928f, 20.0f, 15.5001f, 20.0f)
                horizontalLineTo(8.5001f)
                curveTo(7.8073f, 20.0f, 7.2183f, 19.6882f, 6.9258f, 19.3251f)
                curveTo(6.786f, 19.1516f, 6.7315f, 18.991f, 6.7253f, 18.8595f)
                curveTo(6.7195f, 18.7378f, 6.7508f, 18.5676f, 6.9152f, 18.3495f)
                close()
            }
        }.build()
        return user!!
    }

private var user: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.User,
                contentDescription = ""
            )
        }
    }
}