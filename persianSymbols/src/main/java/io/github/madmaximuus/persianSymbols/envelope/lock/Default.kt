package io.github.madmaximuus.persianSymbols.envelope.lock

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

val PersianSymbols.Default.EnvelopeLock: ImageVector
    get() {
        if (envelopeLock != null) {
            return envelopeLock!!
        }
        envelopeLock = Builder(
            name = "envelope-lock-default",
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
                horizontalLineTo(14.2f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 8.1171f, 4.0861f, 7.7543f, 4.2399f, 7.43f)
                lineTo(10.2f, 11.9f)
                curveTo(11.2667f, 12.7f, 12.7333f, 12.7f, 13.8f, 11.9f)
                lineTo(19.7601f, 7.43f)
                curveTo(19.9139f, 7.7543f, 20.0f, 8.1171f, 20.0f, 8.5f)
                verticalLineTo(12.8035f)
                curveTo(21.1733f, 13.36f, 21.5214f, 14.5747f, 21.6003f, 15.5376f)
                curveTo(21.74f, 15.6232f, 21.8698f, 15.7233f, 21.9877f, 15.8358f)
                curveTo(21.9958f, 15.7249f, 22.0f, 15.613f, 22.0f, 15.5f)
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
                moveTo(17.1826f, 13.5937f)
                curveTo(17.5464f, 13.3661f, 17.9841f, 13.25f, 18.485f, 13.25f)
                curveTo(18.9859f, 13.25f, 19.4236f, 13.3661f, 19.7874f, 13.5937f)
                curveTo(20.1501f, 13.8206f, 20.394f, 14.1297f, 20.5538f, 14.4448f)
                curveTo(20.8264f, 14.9821f, 20.8729f, 15.5713f, 20.8699f, 15.9569f)
                curveTo(21.5428f, 16.3202f, 22.0f, 17.0317f, 22.0f, 17.8501f)
                verticalLineTo(19.8501f)
                curveTo(22.0f, 21.0375f, 21.0374f, 22.0001f, 19.85f, 22.0001f)
                horizontalLineTo(17.05f)
                curveTo(15.8626f, 22.0001f, 14.9f, 21.0375f, 14.9f, 19.8501f)
                verticalLineTo(17.8501f)
                curveTo(14.9f, 17.0037f, 15.389f, 16.2716f, 16.1f, 15.9208f)
                curveTo(16.1002f, 15.5351f, 16.152f, 14.9656f, 16.4162f, 14.4448f)
                curveTo(16.576f, 14.1297f, 16.8199f, 13.8206f, 17.1826f, 13.5937f)
                close()
                moveTo(17.7539f, 15.1234f)
                curveTo(17.6763f, 15.2764f, 17.6337f, 15.4634f, 17.614f, 15.65f)
                horizontalLineTo(19.356f)
                curveTo(19.3363f, 15.4634f, 19.2937f, 15.2764f, 19.2161f, 15.1234f)
                curveTo(19.1561f, 15.0052f, 19.0829f, 14.9223f, 18.992f, 14.8654f)
                curveTo(18.9022f, 14.8093f, 18.7498f, 14.75f, 18.485f, 14.75f)
                curveTo(18.2202f, 14.75f, 18.0678f, 14.8093f, 17.978f, 14.8654f)
                curveTo(17.8871f, 14.9223f, 17.8139f, 15.0052f, 17.7539f, 15.1234f)
                close()
                moveTo(17.05f, 17.2001f)
                curveTo(16.691f, 17.2001f, 16.4f, 17.4911f, 16.4f, 17.8501f)
                verticalLineTo(19.8501f)
                curveTo(16.4f, 20.2091f, 16.691f, 20.5001f, 17.05f, 20.5001f)
                horizontalLineTo(19.85f)
                curveTo(20.209f, 20.5001f, 20.5f, 20.2091f, 20.5f, 19.8501f)
                verticalLineTo(17.8501f)
                curveTo(20.5f, 17.4911f, 20.209f, 17.2001f, 19.85f, 17.2001f)
                horizontalLineTo(17.05f)
                close()
            }
        }.build()
        return envelopeLock!!
    }

private var envelopeLock: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.EnvelopeLock,
                contentDescription = ""
            )
        }
    }
}