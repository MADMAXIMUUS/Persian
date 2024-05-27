package io.github.madmaximuus.persianSymbols.brightness.exclamation

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

val PersianSymbols.Default.BrightnessExclamation: ImageVector
    get() {
        if (brightnessExclamation != null) {
            return brightnessExclamation!!
        }
        brightnessExclamation = Builder(
            name = "brightness-exclamation-default",
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
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 13.5523f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 13.5523f, 11.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
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
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                curveTo(11.0f, 15.4477f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 15.4477f, 13.0f, 16.0f)
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
                moveTo(13.7692f, 3.3567f)
                curveTo(12.7926f, 2.3785f, 11.2074f, 2.3785f, 10.2308f, 3.3567f)
                lineTo(9.0975f, 4.4918f)
                curveTo(9.0036f, 4.5859f, 8.8762f, 4.6387f, 8.7433f, 4.6386f)
                lineTo(7.1393f, 4.6373f)
                curveTo(5.757f, 4.6361f, 4.6361f, 5.757f, 4.6373f, 7.1393f)
                lineTo(4.6386f, 8.7433f)
                curveTo(4.6387f, 8.8762f, 4.5859f, 9.0036f, 4.4918f, 9.0975f)
                lineTo(3.3567f, 10.2308f)
                curveTo(2.3785f, 11.2074f, 2.3785f, 12.7926f, 3.3567f, 13.7692f)
                lineTo(4.4918f, 14.9025f)
                curveTo(4.5859f, 14.9963f, 4.6387f, 15.1238f, 4.6386f, 15.2567f)
                lineTo(4.6373f, 16.8607f)
                curveTo(4.6361f, 18.243f, 5.757f, 19.3639f, 7.1393f, 19.3627f)
                lineTo(8.7433f, 19.3614f)
                curveTo(8.8762f, 19.3613f, 9.0036f, 19.4141f, 9.0975f, 19.5081f)
                lineTo(10.2308f, 20.6433f)
                curveTo(11.2074f, 21.6215f, 12.7926f, 21.6215f, 13.7692f, 20.6433f)
                lineTo(14.9025f, 19.5081f)
                curveTo(14.9964f, 19.4141f, 15.1238f, 19.3613f, 15.2567f, 19.3614f)
                lineTo(16.8607f, 19.3627f)
                curveTo(18.243f, 19.3639f, 19.3639f, 18.243f, 19.3627f, 16.8607f)
                lineTo(19.3614f, 15.2567f)
                curveTo(19.3613f, 15.1238f, 19.4141f, 14.9963f, 19.5082f, 14.9025f)
                lineTo(20.6433f, 13.7692f)
                curveTo(21.6215f, 12.7926f, 21.6215f, 11.2074f, 20.6433f, 10.2308f)
                lineTo(19.5082f, 9.0975f)
                curveTo(19.4141f, 9.0036f, 19.3613f, 8.8762f, 19.3614f, 8.7433f)
                lineTo(19.3627f, 7.1393f)
                curveTo(19.3639f, 5.757f, 18.243f, 4.6361f, 16.8607f, 4.6373f)
                lineTo(15.2567f, 4.6386f)
                curveTo(15.1238f, 4.6387f, 14.9964f, 4.5859f, 14.9025f, 4.4918f)
                lineTo(13.7692f, 3.3567f)
                close()
                moveTo(11.6462f, 4.7698f)
                curveTo(11.8415f, 4.5741f, 12.1585f, 4.5741f, 12.3538f, 4.7698f)
                lineTo(13.4871f, 5.9049f)
                curveTo(13.9566f, 6.3751f, 14.5939f, 6.6391f, 15.2584f, 6.6386f)
                lineTo(16.8623f, 6.6373f)
                curveTo(17.1388f, 6.637f, 17.363f, 6.8612f, 17.3627f, 7.1377f)
                lineTo(17.3614f, 8.7416f)
                curveTo(17.3609f, 9.4061f, 17.6249f, 10.0434f, 18.0951f, 10.5129f)
                lineTo(19.2302f, 11.6461f)
                curveTo(19.4259f, 11.8415f, 19.4259f, 12.1585f, 19.2302f, 12.3538f)
                lineTo(18.0951f, 13.4871f)
                curveTo(17.6249f, 13.9565f, 17.3609f, 14.5939f, 17.3614f, 15.2583f)
                lineTo(17.3627f, 16.8623f)
                curveTo(17.363f, 17.1388f, 17.1388f, 17.3629f, 16.8623f, 17.3627f)
                lineTo(15.2584f, 17.3614f)
                curveTo(14.5939f, 17.3609f, 13.9566f, 17.6249f, 13.4871f, 18.0951f)
                lineTo(12.3538f, 19.2302f)
                curveTo(12.1585f, 19.4258f, 11.8415f, 19.4258f, 11.6462f, 19.2302f)
                lineTo(10.5129f, 18.0951f)
                curveTo(10.0435f, 17.6249f, 9.4061f, 17.3609f, 8.7416f, 17.3614f)
                lineTo(7.1377f, 17.3627f)
                curveTo(6.8612f, 17.3629f, 6.6371f, 17.1388f, 6.6373f, 16.8623f)
                lineTo(6.6386f, 15.2583f)
                curveTo(6.6391f, 14.5939f, 6.3751f, 13.9565f, 5.9049f, 13.4871f)
                lineTo(4.7698f, 12.3538f)
                curveTo(4.5742f, 12.1585f, 4.5742f, 11.8415f, 4.7698f, 11.6461f)
                lineTo(5.9049f, 10.5129f)
                curveTo(6.3751f, 10.0434f, 6.6391f, 9.4061f, 6.6386f, 8.7416f)
                lineTo(6.6373f, 7.1377f)
                curveTo(6.6371f, 6.8612f, 6.8612f, 6.637f, 7.1377f, 6.6373f)
                lineTo(8.7416f, 6.6386f)
                curveTo(9.4061f, 6.6391f, 10.0435f, 6.3751f, 10.5129f, 5.9049f)
                lineTo(11.6462f, 4.7698f)
                close()
            }
        }.build()
        return brightnessExclamation!!
    }

private var brightnessExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BrightnessExclamation,
                contentDescription = ""
            )
        }
    }
}