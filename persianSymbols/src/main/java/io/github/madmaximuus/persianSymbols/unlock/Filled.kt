package io.github.madmaximuus.persianSymbols.unlock

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

val PersianSymbols.Filled.Unlock: ImageVector
    get() {
        if (unlock != null) {
            return unlock!!
        }
        unlock = Builder(
            name = "unlock-filled",
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
                moveTo(9.4282f, 5.3526f)
                curveTo(9.6378f, 4.9597f, 9.9194f, 4.6349f, 10.3012f, 4.4036f)
                curveTo(10.6822f, 4.1728f, 11.2209f, 4.0f, 12.0f, 4.0f)
                curveTo(12.7981f, 4.0f, 13.3442f, 4.1812f, 13.7276f, 4.4213f)
                curveTo(14.1125f, 4.6624f, 14.3948f, 5.0016f, 14.6028f, 5.4121f)
                curveTo(15.0136f, 6.223f, 15.0972f, 7.24f, 15.0794f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(7.8756f, 8.0f, 7.7564f, 8.0227f, 7.6465f, 8.0643f)
                curveTo(5.5755f, 8.4216f, 4.0f, 10.2268f, 4.0f, 12.4f)
                verticalLineTo(17.6f)
                curveTo(4.0f, 20.0301f, 5.97f, 22.0f, 8.4f, 22.0f)
                horizontalLineTo(15.6f)
                curveTo(18.0301f, 22.0f, 20.0f, 20.0301f, 20.0f, 17.6f)
                verticalLineTo(12.4f)
                curveTo(20.0f, 10.486f, 18.7779f, 8.8574f, 17.0713f, 8.252f)
                curveTo(17.0725f, 8.2339f, 17.0735f, 8.2156f, 17.0742f, 8.1973f)
                curveTo(17.108f, 7.3161f, 17.0515f, 5.8201f, 16.3869f, 4.5082f)
                curveTo(16.046f, 3.8354f, 15.5366f, 3.1945f, 14.7892f, 2.7264f)
                curveTo(14.0402f, 2.2572f, 13.1134f, 2.0f, 12.0f, 2.0f)
                curveTo(10.914f, 2.0f, 10.005f, 2.2447f, 9.2649f, 2.693f)
                curveTo(8.5257f, 3.1409f, 8.0127f, 3.7569f, 7.6637f, 4.411f)
                curveTo(7.4037f, 4.8982f, 7.5879f, 5.504f, 8.0751f, 5.764f)
                curveTo(8.5624f, 6.024f, 9.1681f, 5.8398f, 9.4282f, 5.3526f)
                close()
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 16.1046f, 13.1046f, 17.0f, 12.0f, 17.0f)
                curveTo(10.8954f, 17.0f, 10.0f, 16.1046f, 10.0f, 15.0f)
                curveTo(10.0f, 13.8954f, 10.8954f, 13.0f, 12.0f, 13.0f)
                curveTo(13.1046f, 13.0f, 14.0f, 13.8954f, 14.0f, 15.0f)
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
                imageVector = PersianSymbols.Filled.Unlock,
                contentDescription = ""
            )
        }
    }
}