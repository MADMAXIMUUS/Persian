package io.github.madmaximuus.persianSymbols.sigmal.xmark

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

val PersianSymbols.Default.SignalXMark: ImageVector
    get() {
        if (signalXMark != null) {
            return signalXMark!!
        }
        signalXMark = Builder(
            name = "signal-xmark-default",
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
                moveTo(21.0f, 3.0f)
                curveTo(21.0f, 2.4477f, 20.5523f, 2.0f, 20.0f, 2.0f)
                curveTo(19.4477f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                verticalLineTo(12.083f)
                curveTo(19.7179f, 12.2034f, 20.3926f, 12.4513f, 21.0f, 12.8027f)
                verticalLineTo(3.0f)
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
                moveTo(17.0f, 7.0f)
                verticalLineTo(12.083f)
                curveTo(16.2821f, 12.2034f, 15.6074f, 12.4513f, 15.0f, 12.8027f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 6.4477f, 15.4477f, 6.0f, 16.0f, 6.0f)
                curveTo(16.5523f, 6.0f, 17.0f, 6.4477f, 17.0f, 7.0f)
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
                moveTo(13.0f, 11.0f)
                verticalLineTo(14.6822f)
                curveTo(12.3682f, 15.6325f, 12.0f, 16.7733f, 12.0f, 18.0f)
                curveTo(12.0f, 19.2037f, 12.3545f, 20.3247f, 12.9647f, 21.2641f)
                curveTo(12.8489f, 21.6883f, 12.4609f, 22.0f, 12.0f, 22.0f)
                curveTo(11.4477f, 22.0f, 11.0f, 21.5523f, 11.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(11.0f, 10.4477f, 11.4477f, 10.0f, 12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 10.4477f, 13.0f, 11.0f)
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
                moveTo(8.0f, 14.0f)
                curveTo(8.5523f, 14.0f, 9.0f, 14.4477f, 9.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(9.0f, 21.5523f, 8.5523f, 22.0f, 8.0f, 22.0f)
                curveTo(7.4477f, 22.0f, 7.0f, 21.5523f, 7.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 14.4477f, 7.4477f, 14.0f, 8.0f, 14.0f)
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
                moveTo(4.0f, 18.0f)
                curveTo(4.5523f, 18.0f, 5.0f, 18.4477f, 5.0f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 4.5523f, 22.0f, 4.0f, 22.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 18.4477f, 3.4477f, 18.0f, 4.0f, 18.0f)
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
                moveTo(17.4697f, 16.4091f)
                curveTo(17.1768f, 16.1162f, 16.7019f, 16.1162f, 16.409f, 16.4091f)
                curveTo(16.1161f, 16.702f, 16.1161f, 17.1769f, 16.409f, 17.4698f)
                lineTo(16.9393f, 18.0001f)
                lineTo(16.409f, 18.5305f)
                curveTo(16.1161f, 18.8234f, 16.1161f, 19.2982f, 16.409f, 19.5911f)
                curveTo(16.7019f, 19.884f, 17.1768f, 19.884f, 17.4697f, 19.5911f)
                lineTo(18.0f, 19.0608f)
                lineTo(18.5303f, 19.5911f)
                curveTo(18.8232f, 19.884f, 19.2981f, 19.884f, 19.591f, 19.5911f)
                curveTo(19.8839f, 19.2982f, 19.8839f, 18.8233f, 19.591f, 18.5304f)
                lineTo(19.0607f, 18.0001f)
                lineTo(19.591f, 17.4698f)
                curveTo(19.8839f, 17.1769f, 19.8839f, 16.702f, 19.591f, 16.4091f)
                curveTo(19.2981f, 16.1162f, 18.8232f, 16.1162f, 18.5303f, 16.4091f)
                lineTo(18.0f, 16.9395f)
                lineTo(17.4697f, 16.4091f)
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
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
            }
        }.build()
        return signalXMark!!
    }

private var signalXMark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.SignalXMark,
                contentDescription = ""
            )
        }
    }
}