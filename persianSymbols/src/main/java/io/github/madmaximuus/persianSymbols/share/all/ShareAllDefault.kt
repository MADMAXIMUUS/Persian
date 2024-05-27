package io.github.madmaximuus.persianSymbols.share.all

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

val PersianSymbols.Default.ShareAll: ImageVector
    get() {
        if (shareAll != null) {
            return shareAll!!
        }
        shareAll = Builder(
            name = "share-all-default",
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
                moveTo(11.9486f, 5.9019f)
                curveTo(11.6182f, 6.3444f, 11.7092f, 6.971f, 12.1518f, 7.3014f)
                lineTo(13.7575f, 8.5001f)
                horizontalLineTo(6.75f)
                curveTo(4.2647f, 8.5001f, 2.25f, 10.5148f, 2.25f, 13.0001f)
                verticalLineTo(17.5001f)
                curveTo(2.25f, 18.0523f, 2.6977f, 18.5001f, 3.25f, 18.5001f)
                curveTo(3.8022f, 18.5001f, 4.25f, 18.0523f, 4.25f, 17.5001f)
                verticalLineTo(13.0001f)
                curveTo(4.25f, 11.6193f, 5.3693f, 10.5001f, 6.75f, 10.5001f)
                horizontalLineTo(13.7425f)
                lineTo(12.1482f, 11.7014f)
                curveTo(11.7071f, 12.0338f, 11.619f, 12.6608f, 11.9513f, 13.1018f)
                curveTo(12.2837f, 13.5429f, 12.9107f, 13.6311f, 13.3518f, 13.2987f)
                lineTo(17.3518f, 10.2847f)
                curveTo(17.6031f, 10.0953f, 17.7507f, 9.7986f, 17.75f, 9.4838f)
                curveTo(17.7493f, 9.1691f, 17.6004f, 8.873f, 17.3482f, 8.6847f)
                lineTo(13.3482f, 5.6987f)
                curveTo(12.9056f, 5.3683f, 12.279f, 5.4593f, 11.9486f, 5.9019f)
                close()
                moveTo(16.1518f, 7.3014f)
                curveTo(15.7092f, 6.971f, 15.6183f, 6.3444f, 15.9487f, 5.9019f)
                curveTo(16.279f, 5.4593f, 16.9056f, 5.3683f, 17.3482f, 5.6987f)
                lineTo(21.3482f, 8.6847f)
                curveTo(21.6004f, 8.873f, 21.7493f, 9.1691f, 21.75f, 9.4838f)
                curveTo(21.7507f, 9.7986f, 21.6032f, 10.0953f, 21.3518f, 10.2847f)
                lineTo(17.3518f, 13.2987f)
                curveTo(16.9107f, 13.6311f, 16.2837f, 13.5429f, 15.9513f, 13.1018f)
                curveTo(15.619f, 12.6608f, 15.7071f, 12.0338f, 16.1482f, 11.7014f)
                lineTo(19.0833f, 9.4898f)
                lineTo(16.1518f, 7.3014f)
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
                moveTo(11.9486f, 5.9019f)
                curveTo(11.6182f, 6.3444f, 11.7092f, 6.971f, 12.1518f, 7.3014f)
                lineTo(13.7575f, 8.5001f)
                horizontalLineTo(6.75f)
                curveTo(4.2647f, 8.5001f, 2.25f, 10.5148f, 2.25f, 13.0001f)
                verticalLineTo(17.5001f)
                curveTo(2.25f, 18.0523f, 2.6977f, 18.5001f, 3.25f, 18.5001f)
                curveTo(3.8022f, 18.5001f, 4.25f, 18.0523f, 4.25f, 17.5001f)
                verticalLineTo(13.0001f)
                curveTo(4.25f, 11.6193f, 5.3693f, 10.5001f, 6.75f, 10.5001f)
                horizontalLineTo(13.7425f)
                lineTo(12.1482f, 11.7014f)
                curveTo(11.7071f, 12.0338f, 11.619f, 12.6608f, 11.9513f, 13.1018f)
                curveTo(12.2837f, 13.5429f, 12.9107f, 13.6311f, 13.3518f, 13.2987f)
                lineTo(17.3518f, 10.2847f)
                curveTo(17.6031f, 10.0953f, 17.7507f, 9.7986f, 17.75f, 9.4838f)
                curveTo(17.7493f, 9.1691f, 17.6004f, 8.873f, 17.3482f, 8.6847f)
                lineTo(13.3482f, 5.6987f)
                curveTo(12.9056f, 5.3683f, 12.279f, 5.4593f, 11.9486f, 5.9019f)
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
                moveTo(16.1518f, 7.3014f)
                curveTo(15.7092f, 6.971f, 15.6183f, 6.3444f, 15.9487f, 5.9019f)
                curveTo(16.279f, 5.4593f, 16.9056f, 5.3683f, 17.3482f, 5.6987f)
                lineTo(21.3482f, 8.6847f)
                curveTo(21.6004f, 8.873f, 21.7493f, 9.1691f, 21.75f, 9.4838f)
                curveTo(21.7507f, 9.7986f, 21.6032f, 10.0953f, 21.3518f, 10.2847f)
                lineTo(17.3518f, 13.2987f)
                curveTo(16.9107f, 13.6311f, 16.2837f, 13.5429f, 15.9513f, 13.1018f)
                curveTo(15.619f, 12.6608f, 15.7071f, 12.0338f, 16.1482f, 11.7014f)
                lineTo(19.0833f, 9.4898f)
                lineTo(16.1518f, 7.3014f)
                close()
            }
        }.build()
        return shareAll!!
    }

private var shareAll: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ShareAll,
                contentDescription = ""
            )
        }
    }
}