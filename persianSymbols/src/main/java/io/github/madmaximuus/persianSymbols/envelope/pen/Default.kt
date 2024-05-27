package io.github.madmaximuus.persianSymbols.envelope.pen

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

val PersianSymbols.Default.EnvelopePen: ImageVector
    get() {
        if (envelopePen != null) {
            return envelopePen!!
        }
        envelopePen = Builder(
            name = "envelope-pen-default",
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
                moveTo(3.114f, 5.5359f)
                curveTo(2.4204f, 6.3276f, 2.0f, 7.3647f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 17.9853f, 4.0147f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(11.6768f)
                lineTo(12.0768f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 8.1171f, 4.0861f, 7.7543f, 4.2399f, 7.43f)
                lineTo(10.2f, 11.9f)
                curveTo(11.2667f, 12.7f, 12.7333f, 12.7f, 13.8f, 11.9f)
                lineTo(19.7601f, 7.43f)
                curveTo(19.9139f, 7.7543f, 20.0f, 8.1171f, 20.0f, 8.5f)
                verticalLineTo(11.8256f)
                curveTo(20.2841f, 11.9577f, 20.5503f, 12.1409f, 20.7847f, 12.3753f)
                lineTo(22.0f, 13.5906f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 7.3647f, 21.5796f, 6.3276f, 20.886f, 5.5359f)
                curveTo(20.8614f, 5.4891f, 20.8327f, 5.4436f, 20.8f, 5.4f)
                curveTo(20.7075f, 5.2766f, 20.5919f, 5.1808f, 20.4638f, 5.1138f)
                curveTo(19.6722f, 4.4203f, 18.6352f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                curveTo(5.3648f, 4.0f, 4.3278f, 4.4203f, 3.5362f, 5.1138f)
                curveTo(3.4081f, 5.1807f, 3.2925f, 5.2766f, 3.2f, 5.4f)
                curveTo(3.1673f, 5.4436f, 3.1386f, 5.4891f, 3.114f, 5.5359f)
                close()
                moveTo(18.2006f, 6.0995f)
                curveTo(17.9783f, 6.0347f, 17.7432f, 6.0f, 17.5f, 6.0f)
                horizontalLineTo(6.5f)
                curveTo(6.2568f, 6.0f, 6.0217f, 6.0347f, 5.7993f, 6.0995f)
                lineTo(11.4f, 10.3f)
                curveTo(11.7556f, 10.5667f, 12.2444f, 10.5667f, 12.6f, 10.3f)
                lineTo(18.2006f, 6.0995f)
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
                moveTo(17.6027f, 13.0825f)
                curveTo(18.2862f, 12.3991f, 19.3942f, 12.3991f, 20.0776f, 13.0825f)
                lineTo(21.4918f, 14.4967f)
                curveTo(22.1752f, 15.1801f, 22.1752f, 16.2882f, 21.4918f, 16.9716f)
                lineTo(17.4633f, 21.0001f)
                curveTo(17.219f, 21.2444f, 16.9078f, 21.411f, 16.569f, 21.4787f)
                lineTo(14.0658f, 21.9794f)
                curveTo(13.1912f, 22.1543f, 12.42f, 21.3831f, 12.595f, 20.5085f)
                lineTo(13.0956f, 18.0053f)
                curveTo(13.1634f, 17.6665f, 13.3299f, 17.3554f, 13.5742f, 17.1111f)
                lineTo(17.6027f, 13.0825f)
                close()
                moveTo(14.6348f, 18.1717f)
                lineTo(17.1938f, 15.6128f)
                lineTo(18.9616f, 17.3805f)
                lineTo(16.4026f, 19.9395f)
                curveTo(16.3677f, 19.9744f, 16.3233f, 19.9982f, 16.2749f, 20.0079f)
                lineTo(14.1394f, 20.4349f)
                lineTo(14.5665f, 18.2995f)
                curveTo(14.5762f, 18.2511f, 14.5999f, 18.2066f, 14.6348f, 18.1717f)
                close()
            }
        }.build()
        return envelopePen!!
    }

private var envelopePen: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.EnvelopePen,
                contentDescription = ""
            )
        }
    }
}