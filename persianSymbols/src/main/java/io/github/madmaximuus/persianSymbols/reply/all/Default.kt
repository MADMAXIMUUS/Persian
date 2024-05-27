package io.github.madmaximuus.persianSymbols.reply.all

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

val PersianSymbols.Default.ReplyAll: ImageVector
    get() {
        if (replyAll != null) {
            return replyAll!!
        }
        replyAll = Builder(
            name = "reply-all-default",
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
                moveTo(7.8481f, 7.3014f)
                curveTo(8.2907f, 6.971f, 8.3817f, 6.3444f, 8.0513f, 5.9019f)
                curveTo(7.7209f, 5.4593f, 7.0943f, 5.3683f, 6.6517f, 5.6987f)
                lineTo(2.6517f, 8.6847f)
                curveTo(2.3995f, 8.873f, 2.2506f, 9.1691f, 2.2499f, 9.4838f)
                curveTo(2.2492f, 9.7986f, 2.3968f, 10.0953f, 2.6481f, 10.2847f)
                lineTo(6.6481f, 13.2987f)
                curveTo(7.0892f, 13.6311f, 7.7162f, 13.5429f, 8.0486f, 13.1018f)
                curveTo(8.3809f, 12.6608f, 8.2928f, 12.0338f, 7.8517f, 11.7014f)
                lineTo(4.9166f, 9.4898f)
                lineTo(7.8481f, 7.3014f)
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
                moveTo(12.0513f, 5.9019f)
                curveTo(12.3817f, 6.3444f, 12.2908f, 6.971f, 11.8482f, 7.3014f)
                lineTo(10.2425f, 8.5001f)
                horizontalLineTo(17.25f)
                curveTo(19.7353f, 8.5001f, 21.75f, 10.5148f, 21.75f, 13.0001f)
                verticalLineTo(17.5001f)
                curveTo(21.75f, 18.0523f, 21.3023f, 18.5001f, 20.75f, 18.5001f)
                curveTo(20.1977f, 18.5001f, 19.75f, 18.0523f, 19.75f, 17.5001f)
                verticalLineTo(13.0001f)
                curveTo(19.75f, 11.6193f, 18.6307f, 10.5001f, 17.25f, 10.5001f)
                horizontalLineTo(10.2574f)
                lineTo(11.8518f, 11.7014f)
                curveTo(12.2929f, 12.0338f, 12.381f, 12.6608f, 12.0487f, 13.1018f)
                curveTo(11.7163f, 13.5429f, 11.0893f, 13.6311f, 10.6482f, 13.2987f)
                lineTo(6.6482f, 10.2847f)
                curveTo(6.3968f, 10.0953f, 6.2493f, 9.7986f, 6.25f, 9.4838f)
                curveTo(6.2507f, 9.1691f, 6.3996f, 8.873f, 6.6518f, 8.6847f)
                lineTo(10.6518f, 5.6987f)
                curveTo(11.0944f, 5.3683f, 11.721f, 5.4593f, 12.0513f, 5.9019f)
                close()
            }
        }.build()
        return replyAll!!
    }

private var replyAll: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ReplyAll,
                contentDescription = ""
            )
        }
    }
}