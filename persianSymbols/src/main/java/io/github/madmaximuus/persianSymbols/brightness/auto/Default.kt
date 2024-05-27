package io.github.madmaximuus.persianSymbols.brightness.auto

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

val PersianSymbols.Default.BrightnessAuto: ImageVector
    get() {
        if (brightnessAuto != null) {
            return brightnessAuto!!
        }
        brightnessAuto = Builder(
            name = "brightness-auto-default",
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
                moveTo(9.3525f, 16.0f)
                curveTo(8.8911f, 16.0f, 8.5712f, 15.5397f, 8.7321f, 15.1072f)
                lineTo(11.1818f, 8.5211f)
                curveTo(11.2983f, 8.2078f, 11.5973f, 8.0f, 11.9316f, 8.0f)
                horizontalLineTo(12.0583f)
                curveTo(12.3922f, 8.0f, 12.691f, 8.2074f, 12.8078f, 8.5202f)
                lineTo(15.2654f, 15.1036f)
                curveTo(15.4274f, 15.5376f, 15.1065f, 16.0f, 14.6432f, 16.0f)
                curveTo(14.3583f, 16.0f, 14.1052f, 15.8183f, 14.014f, 15.5484f)
                lineTo(13.5337f, 14.1264f)
                horizontalLineTo(10.4594f)
                lineTo(9.9799f, 15.5494f)
                curveTo(9.8892f, 15.8186f, 9.6367f, 16.0f, 9.3525f, 16.0f)
                close()
                moveTo(10.8278f, 13.033f)
                horizontalLineTo(13.1643f)
                lineTo(12.1464f, 10.0192f)
                curveTo(12.0973f, 9.8741f, 11.8921f, 9.8741f, 11.8431f, 10.0193f)
                lineTo(10.8278f, 13.033f)
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
                curveTo(14.9963f, 19.4141f, 15.1238f, 19.3613f, 15.2567f, 19.3614f)
                lineTo(16.8607f, 19.3627f)
                curveTo(18.243f, 19.3639f, 19.3639f, 18.243f, 19.3627f, 16.8607f)
                lineTo(19.3614f, 15.2567f)
                curveTo(19.3613f, 15.1238f, 19.4141f, 14.9963f, 19.5081f, 14.9025f)
                lineTo(20.6433f, 13.7692f)
                curveTo(21.6215f, 12.7926f, 21.6215f, 11.2074f, 20.6433f, 10.2308f)
                lineTo(19.5081f, 9.0975f)
                curveTo(19.4141f, 9.0036f, 19.3613f, 8.8762f, 19.3614f, 8.7433f)
                lineTo(19.3627f, 7.1393f)
                curveTo(19.3639f, 5.757f, 18.243f, 4.6361f, 16.8607f, 4.6373f)
                lineTo(15.2567f, 4.6386f)
                curveTo(15.1238f, 4.6387f, 14.9963f, 4.5859f, 14.9025f, 4.4918f)
                lineTo(13.7692f, 3.3567f)
                close()
                moveTo(11.6461f, 4.7698f)
                curveTo(11.8415f, 4.5741f, 12.1585f, 4.5741f, 12.3538f, 4.7698f)
                lineTo(13.4871f, 5.9049f)
                curveTo(13.9565f, 6.3751f, 14.5939f, 6.6391f, 15.2583f, 6.6386f)
                lineTo(16.8623f, 6.6373f)
                curveTo(17.1388f, 6.637f, 17.3629f, 6.8612f, 17.3627f, 7.1377f)
                lineTo(17.3614f, 8.7416f)
                curveTo(17.3609f, 9.4061f, 17.6249f, 10.0434f, 18.0951f, 10.5129f)
                lineTo(19.2302f, 11.6461f)
                curveTo(19.4258f, 11.8415f, 19.4258f, 12.1585f, 19.2302f, 12.3538f)
                lineTo(18.0951f, 13.4871f)
                curveTo(17.6249f, 13.9565f, 17.3609f, 14.5939f, 17.3614f, 15.2583f)
                lineTo(17.3627f, 16.8623f)
                curveTo(17.3629f, 17.1388f, 17.1388f, 17.3629f, 16.8623f, 17.3627f)
                lineTo(15.2583f, 17.3614f)
                curveTo(14.5939f, 17.3609f, 13.9565f, 17.6249f, 13.4871f, 18.0951f)
                lineTo(12.3538f, 19.2302f)
                curveTo(12.1585f, 19.4258f, 11.8415f, 19.4258f, 11.6461f, 19.2302f)
                lineTo(10.5129f, 18.0951f)
                curveTo(10.0434f, 17.6249f, 9.4061f, 17.3609f, 8.7416f, 17.3614f)
                lineTo(7.1377f, 17.3627f)
                curveTo(6.8612f, 17.3629f, 6.637f, 17.1388f, 6.6373f, 16.8623f)
                lineTo(6.6386f, 15.2583f)
                curveTo(6.6391f, 14.5939f, 6.3751f, 13.9565f, 5.9049f, 13.4871f)
                lineTo(4.7698f, 12.3538f)
                curveTo(4.5741f, 12.1585f, 4.5741f, 11.8415f, 4.7698f, 11.6461f)
                lineTo(5.9049f, 10.5129f)
                curveTo(6.3751f, 10.0434f, 6.6391f, 9.4061f, 6.6386f, 8.7416f)
                lineTo(6.6373f, 7.1377f)
                curveTo(6.637f, 6.8612f, 6.8612f, 6.637f, 7.1377f, 6.6373f)
                lineTo(8.7416f, 6.6386f)
                curveTo(9.4061f, 6.6391f, 10.0434f, 6.3751f, 10.5129f, 5.9049f)
                lineTo(11.6461f, 4.7698f)
                close()
            }
        }.build()
        return brightnessAuto!!
    }

private var brightnessAuto: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BrightnessAuto,
                contentDescription = ""
            )
        }
    }
}