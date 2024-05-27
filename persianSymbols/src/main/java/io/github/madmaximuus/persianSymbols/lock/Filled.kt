package io.github.madmaximuus.persianSymbols.lock

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

val PersianSymbols.Filled.Lock: ImageVector
    get() {
        if (lock != null) {
            return lock!!
        }
        lock = Builder(
            name = "lock-filled",
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
                moveTo(6.9287f, 8.252f)
                curveTo(6.9275f, 8.2339f, 6.9265f, 8.2156f, 6.9258f, 8.1973f)
                curveTo(6.892f, 7.3161f, 6.9486f, 5.8201f, 7.6132f, 4.5082f)
                curveTo(7.954f, 3.8354f, 8.4634f, 3.1945f, 9.2108f, 2.7264f)
                curveTo(9.9598f, 2.2572f, 10.8866f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1134f, 2.0f, 14.0403f, 2.2572f, 14.7893f, 2.7264f)
                curveTo(15.5366f, 3.1945f, 16.0461f, 3.8354f, 16.3869f, 4.5082f)
                curveTo(17.0515f, 5.8201f, 17.108f, 7.3161f, 17.0742f, 8.1973f)
                curveTo(17.0735f, 8.2156f, 17.0726f, 8.2339f, 17.0714f, 8.252f)
                curveTo(18.7779f, 8.8574f, 20.0f, 10.486f, 20.0f, 12.4f)
                verticalLineTo(17.6f)
                curveTo(20.0f, 20.0301f, 18.0301f, 22.0f, 15.6f, 22.0f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 22.0f, 4.0f, 20.0301f, 4.0f, 17.6f)
                verticalLineTo(12.4f)
                curveTo(4.0f, 10.4859f, 5.2222f, 8.8574f, 6.9287f, 8.252f)
                close()
                moveTo(14.6028f, 5.4121f)
                curveTo(15.0136f, 6.223f, 15.0972f, 7.24f, 15.0794f, 8.0f)
                horizontalLineTo(8.9206f)
                curveTo(8.9029f, 7.24f, 8.9864f, 6.223f, 9.3973f, 5.4121f)
                curveTo(9.6052f, 5.0016f, 9.8875f, 4.6624f, 10.2725f, 4.4213f)
                curveTo(10.6558f, 4.1812f, 11.202f, 4.0f, 12.0f, 4.0f)
                curveTo(12.7981f, 4.0f, 13.3443f, 4.1812f, 13.7276f, 4.4213f)
                curveTo(14.1126f, 4.6624f, 14.3948f, 5.0016f, 14.6028f, 5.4121f)
                close()
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 16.1046f, 13.1046f, 17.0f, 12.0f, 17.0f)
                curveTo(10.8954f, 17.0f, 10.0f, 16.1046f, 10.0f, 15.0f)
                curveTo(10.0f, 13.8954f, 10.8954f, 13.0f, 12.0f, 13.0f)
                curveTo(13.1046f, 13.0f, 14.0f, 13.8954f, 14.0f, 15.0f)
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
                imageVector = PersianSymbols.Filled.Lock,
                contentDescription = ""
            )
        }
    }
}