package io.github.madmaximuus.persianSymbols.reply.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Default.Reply: ImageVector
    get() {
        if (reply != null) {
            return reply!!
        }
        reply = Builder(
            name = "reply-default",
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
                moveTo(8.8482f, 7.3013f)
                curveTo(9.2908f, 6.971f, 9.3817f, 6.3444f, 9.0513f, 5.9018f)
                curveTo(8.721f, 5.4592f, 8.0944f, 5.3683f, 7.6518f, 5.6987f)
                lineTo(3.6518f, 8.6847f)
                curveTo(3.3996f, 8.873f, 3.2507f, 9.169f, 3.25f, 9.4838f)
                curveTo(3.2493f, 9.7985f, 3.3968f, 10.0953f, 3.6482f, 10.2847f)
                lineTo(7.6482f, 13.2987f)
                curveTo(8.0893f, 13.631f, 8.7163f, 13.5429f, 9.0487f, 13.1018f)
                curveTo(9.381f, 12.6607f, 9.2929f, 12.0337f, 8.8518f, 11.7013f)
                lineTo(7.2574f, 10.5f)
                horizontalLineTo(16.25f)
                curveTo(17.6307f, 10.5f, 18.75f, 11.6193f, 18.75f, 13.0f)
                verticalLineTo(17.5f)
                curveTo(18.75f, 18.0523f, 19.1977f, 18.5f, 19.75f, 18.5f)
                curveTo(20.3023f, 18.5f, 20.75f, 18.0523f, 20.75f, 17.5f)
                verticalLineTo(13.0f)
                curveTo(20.75f, 10.5147f, 18.7353f, 8.5f, 16.25f, 8.5f)
                horizontalLineTo(7.2425f)
                lineTo(8.8482f, 7.3013f)
                close()
            }
        }.build()
        return reply!!
    }

private var reply: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Reply,
                contentDescription = ""
            )
        }
    }
}