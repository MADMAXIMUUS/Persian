package io.github.madmaximuus.persianSymbols.lock

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

val PersianSymbols.Default.Lock: ImageVector
    get() {
        if (lock != null) {
            return lock!!
        }
        lock = Builder(
            name = "lock-default",
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
                moveTo(12.0f, 17.0f)
                curveTo(13.1046f, 17.0f, 14.0f, 16.1046f, 14.0f, 15.0f)
                curveTo(14.0f, 13.8954f, 13.1046f, 13.0f, 12.0f, 13.0f)
                curveTo(10.8954f, 13.0f, 10.0f, 13.8954f, 10.0f, 15.0f)
                curveTo(10.0f, 16.1046f, 10.8954f, 17.0f, 12.0f, 17.0f)
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
                moveTo(6.9258f, 8.1973f)
                curveTo(6.9269f, 8.2255f, 6.9286f, 8.2535f, 6.9308f, 8.2811f)
                curveTo(5.2193f, 8.918f, 4.0f, 10.5666f, 4.0f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 19.9853f, 6.0147f, 22.0f, 8.5f, 22.0f)
                horizontalLineTo(15.5f)
                curveTo(17.9853f, 22.0f, 20.0f, 19.9853f, 20.0f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(20.0f, 10.5666f, 18.7808f, 8.918f, 17.0692f, 8.2812f)
                curveTo(17.0715f, 8.2535f, 17.0732f, 8.2255f, 17.0742f, 8.1973f)
                curveTo(17.108f, 7.3161f, 17.0515f, 5.8201f, 16.3869f, 4.5082f)
                curveTo(16.0461f, 3.8354f, 15.5366f, 3.1945f, 14.7893f, 2.7264f)
                curveTo(14.0403f, 2.2572f, 13.1134f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8866f, 2.0f, 9.9598f, 2.2572f, 9.2108f, 2.7264f)
                curveTo(8.4634f, 3.1945f, 7.954f, 3.8354f, 7.6132f, 4.5082f)
                curveTo(6.9486f, 5.8201f, 6.892f, 7.3161f, 6.9258f, 8.1973f)
                close()
                moveTo(15.0794f, 8.0f)
                curveTo(15.0972f, 7.24f, 15.0136f, 6.223f, 14.6028f, 5.4121f)
                curveTo(14.3948f, 5.0016f, 14.1126f, 4.6624f, 13.7276f, 4.4213f)
                curveTo(13.3443f, 4.1812f, 12.7981f, 4.0f, 12.0f, 4.0f)
                curveTo(11.202f, 4.0f, 10.6558f, 4.1812f, 10.2725f, 4.4213f)
                curveTo(9.8875f, 4.6624f, 9.6052f, 5.0016f, 9.3973f, 5.4121f)
                curveTo(8.9864f, 6.223f, 8.9029f, 7.24f, 8.9206f, 8.0f)
                horizontalLineTo(15.0794f)
                close()
                moveTo(8.5f, 10.0f)
                horizontalLineTo(15.5f)
                curveTo(16.8807f, 10.0f, 18.0f, 11.1193f, 18.0f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(18.0f, 18.8807f, 16.8807f, 20.0f, 15.5f, 20.0f)
                horizontalLineTo(8.5f)
                curveTo(7.1193f, 20.0f, 6.0f, 18.8807f, 6.0f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(6.0f, 11.1193f, 7.1193f, 10.0f, 8.5f, 10.0f)
                close()
            }
        }.build()
        return lock!!
    }

private var lock: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Lock,
                contentDescription = ""
            )
        }
    }
}