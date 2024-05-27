package io.github.madmaximuus.persianSymbols.piggyBank

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

val PersianSymbols.Filled.PiggyBank: ImageVector
    get() {
        if (piggyBank != null) {
            return piggyBank!!
        }
        piggyBank = Builder(
            name = "piggy-bank-filled",
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
                moveTo(2.0f, 9.7628f)
                curveTo(2.0f, 4.8185f, 5.7037f, 3.957f, 7.5556f, 4.1443f)
                lineTo(12.6271f, 4.1443f)
                curveTo(12.9328f, 4.1443f, 13.2195f, 4.0002f, 13.4246f, 3.7736f)
                curveTo(15.5847f, 1.3873f, 18.0853f, 1.9231f, 17.5556f, 2.4588f)
                curveTo(17.2401f, 2.7778f, 17.0926f, 4.059f, 17.0335f, 4.7759f)
                curveTo(17.008f, 5.0862f, 17.1396f, 5.3857f, 17.3777f, 5.5863f)
                lineTo(20.0541f, 7.842f)
                curveTo(20.2344f, 7.994f, 20.4627f, 8.0773f, 20.6985f, 8.0773f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 8.0773f, 22.0f, 8.525f, 22.0f, 9.0773f)
                verticalLineTo(13.0217f)
                curveTo(22.0f, 13.4292f, 21.7528f, 13.7959f, 21.375f, 13.9487f)
                lineTo(19.7527f, 14.605f)
                curveTo(19.4241f, 14.7379f, 19.1912f, 15.0358f, 19.1353f, 15.3859f)
                curveTo(18.8283f, 17.3092f, 18.4929f, 18.5757f, 17.8031f, 20.3706f)
                curveTo(17.6565f, 20.7519f, 17.2878f, 21.0f, 16.8793f, 21.0f)
                horizontalLineTo(14.1111f)
                curveTo(13.5588f, 21.0f, 13.1282f, 20.5509f, 13.0766f, 20.001f)
                curveTo(12.9727f, 18.8944f, 12.5565f, 17.6288f, 10.8889f, 17.6288f)
                curveTo(9.2213f, 17.6288f, 8.8051f, 18.8944f, 8.7012f, 20.001f)
                curveTo(8.6496f, 20.5509f, 8.219f, 21.0f, 7.6667f, 21.0f)
                horizontalLineTo(5.3163f)
                curveTo(4.9801f, 21.0f, 4.6642f, 20.8317f, 4.4881f, 20.5453f)
                curveTo(2.5067f, 17.3235f, 2.0f, 14.0556f, 2.0f, 9.7628f)
                close()
                moveTo(8.0f, 8.0f)
                curveTo(8.0f, 7.4477f, 8.4477f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                curveTo(13.0f, 8.5522f, 12.5523f, 9.0f, 12.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 9.0f, 8.0f, 8.5522f, 8.0f, 8.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 10.5523f, 17.0f, 10.0f)
                curveTo(17.0f, 9.4477f, 16.5523f, 9.0f, 16.0f, 9.0f)
                curveTo(15.4477f, 9.0f, 15.0f, 9.4477f, 15.0f, 10.0f)
                curveTo(15.0f, 10.5523f, 15.4477f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }.build()
        return piggyBank!!
    }

private var piggyBank: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.PiggyBank,
                contentDescription = ""
            )
        }
    }
}