package io.github.madmaximuus.persianSymbols.unlock

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

val PersianSymbols.Default.Unlock: ImageVector
    get() {
        if (unlock != null) {
            return unlock!!
        }
        unlock = Builder(
            name = "unlock-default",
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
                moveTo(10.3012f, 4.4036f)
                curveTo(9.9194f, 4.6349f, 9.6379f, 4.9597f, 9.4282f, 5.3526f)
                curveTo(9.1682f, 5.8398f, 8.5624f, 6.024f, 8.0752f, 5.764f)
                curveTo(7.5879f, 5.504f, 7.4037f, 4.8982f, 7.6637f, 4.411f)
                curveTo(8.0128f, 3.7569f, 8.5257f, 3.1409f, 9.2649f, 2.693f)
                curveTo(10.005f, 2.2447f, 10.914f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1134f, 2.0f, 14.0403f, 2.2572f, 14.7893f, 2.7264f)
                curveTo(15.5366f, 3.1945f, 16.0461f, 3.8354f, 16.3869f, 4.5082f)
                curveTo(17.0515f, 5.8201f, 17.108f, 7.3161f, 17.0742f, 8.1973f)
                curveTo(17.0732f, 8.2255f, 17.0715f, 8.2535f, 17.0692f, 8.2812f)
                curveTo(18.7808f, 8.918f, 20.0f, 10.5666f, 20.0f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(20.0f, 19.9853f, 17.9853f, 22.0f, 15.5f, 22.0f)
                horizontalLineTo(8.5f)
                curveTo(6.0147f, 22.0f, 4.0f, 19.9853f, 4.0f, 17.5f)
                verticalLineTo(12.5f)
                curveTo(4.0f, 10.3326f, 5.5323f, 8.5231f, 7.5727f, 8.0956f)
                curveTo(7.7023f, 8.0343f, 7.8471f, 8.0f, 8.0f, 8.0f)
                horizontalLineTo(15.0794f)
                curveTo(15.0972f, 7.24f, 15.0136f, 6.223f, 14.6028f, 5.4121f)
                curveTo(14.3948f, 5.0016f, 14.1126f, 4.6624f, 13.7276f, 4.4213f)
                curveTo(13.3443f, 4.1812f, 12.7981f, 4.0f, 12.0f, 4.0f)
                curveTo(11.2209f, 4.0f, 10.6823f, 4.1728f, 10.3012f, 4.4036f)
                close()
                moveTo(6.0f, 12.5f)
                curveTo(6.0f, 11.1193f, 7.1193f, 10.0f, 8.5f, 10.0f)
                horizontalLineTo(15.5f)
                curveTo(16.8807f, 10.0f, 18.0f, 11.1193f, 18.0f, 12.5f)
                verticalLineTo(17.5f)
                curveTo(18.0f, 18.8807f, 16.8807f, 20.0f, 15.5f, 20.0f)
                horizontalLineTo(8.5f)
                curveTo(7.1193f, 20.0f, 6.0f, 18.8807f, 6.0f, 17.5f)
                verticalLineTo(12.5f)
                close()
            }
        }.build()
        return unlock!!
    }

private var unlock: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Unlock,
                contentDescription = ""
            )
        }
    }
}