package io.github.madmaximuus.persianSymbols.user.magnifyingGlass

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

val PersianSymbols.Default.UserMagnifyingGlass: ImageVector
    get() {
        if (userMagnifyingGlass != null) {
            return userMagnifyingGlass!!
        }
        userMagnifyingGlass = Builder(
            name = "user-magnifying-glass-default",
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
                moveTo(12.0054f, 2.0f)
                curveTo(9.244f, 2.0f, 7.0054f, 4.2386f, 7.0054f, 7.0f)
                curveTo(7.0054f, 9.7614f, 9.244f, 12.0f, 12.0054f, 12.0f)
                curveTo(14.7668f, 12.0f, 17.0054f, 9.7614f, 17.0054f, 7.0f)
                curveTo(17.0054f, 4.2386f, 14.7668f, 2.0f, 12.0054f, 2.0f)
                close()
                moveTo(9.0054f, 7.0f)
                curveTo(9.0054f, 5.3432f, 10.3486f, 4.0f, 12.0054f, 4.0f)
                curveTo(13.6623f, 4.0f, 15.0054f, 5.3432f, 15.0054f, 7.0f)
                curveTo(15.0054f, 8.6568f, 13.6623f, 10.0f, 12.0054f, 10.0f)
                curveTo(10.3486f, 10.0f, 9.0054f, 8.6568f, 9.0054f, 7.0f)
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
                moveTo(6.9206f, 17.3495f)
                curveTo(7.9631f, 15.967f, 9.8258f, 15.0f, 12.0054f, 15.0f)
                curveTo(12.2671f, 15.0f, 12.5241f, 15.0139f, 12.7758f, 15.0408f)
                curveTo(13.0463f, 14.3289f, 13.5026f, 13.7084f, 14.0855f, 13.2388f)
                curveTo(13.4198f, 13.0826f, 12.7221f, 13.0f, 12.0054f, 13.0f)
                curveTo(9.2502f, 13.0f, 6.7744f, 14.2215f, 5.3237f, 16.1454f)
                curveTo(4.9063f, 16.699f, 4.7029f, 17.3213f, 4.7329f, 17.9541f)
                curveTo(4.7624f, 18.5772f, 5.014f, 19.1333f, 5.3738f, 19.5799f)
                curveTo(6.0807f, 20.4573f, 7.2652f, 21.0f, 8.5054f, 21.0f)
                horizontalLineTo(15.5054f)
                curveTo(15.9507f, 21.0f, 16.3888f, 20.93f, 16.8002f, 20.7998f)
                lineTo(16.75f, 20.8001f)
                curveTo(15.3151f, 20.8001f, 14.0463f, 20.089f, 13.2768f, 19.0f)
                horizontalLineTo(8.5054f)
                curveTo(7.8127f, 19.0f, 7.2237f, 18.6882f, 6.9312f, 18.3251f)
                curveTo(6.7914f, 18.1516f, 6.7369f, 17.991f, 6.7306f, 17.8595f)
                curveTo(6.7249f, 17.7378f, 6.7562f, 17.5676f, 6.9206f, 17.3495f)
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
                moveTo(13.2935f, 16.594f)
                curveTo(13.2935f, 14.6553f, 14.8651f, 13.0836f, 16.8038f, 13.0836f)
                curveTo(18.7426f, 13.0836f, 20.3142f, 14.6553f, 20.3142f, 16.594f)
                curveTo(20.3142f, 17.346f, 20.0778f, 18.0427f, 19.6752f, 18.614f)
                lineTo(21.6122f, 20.551f)
                curveTo(21.9051f, 20.8439f, 21.9051f, 21.3187f, 21.6122f, 21.6116f)
                curveTo(21.3193f, 21.9045f, 20.8444f, 21.9045f, 20.5515f, 21.6116f)
                lineTo(18.5689f, 19.629f)
                curveTo(18.0504f, 19.9313f, 17.4473f, 20.1044f, 16.8038f, 20.1044f)
                curveTo(14.8651f, 20.1044f, 13.2935f, 18.5327f, 13.2935f, 16.594f)
                close()
                moveTo(16.8038f, 14.5836f)
                curveTo(15.6935f, 14.5836f, 14.7935f, 15.4837f, 14.7935f, 16.594f)
                curveTo(14.7935f, 17.7043f, 15.6935f, 18.6044f, 16.8038f, 18.6044f)
                curveTo(17.9141f, 18.6044f, 18.8142f, 17.7043f, 18.8142f, 16.594f)
                curveTo(18.8142f, 15.4837f, 17.9141f, 14.5836f, 16.8038f, 14.5836f)
                close()
            }
        }.build()
        return userMagnifyingGlass!!
    }

private var userMagnifyingGlass: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.UserMagnifyingGlass,
                contentDescription = ""
            )
        }
    }
}