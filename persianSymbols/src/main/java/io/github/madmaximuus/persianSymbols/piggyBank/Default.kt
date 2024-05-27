package io.github.madmaximuus.persianSymbols.piggyBank

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

val PersianSymbols.Default.PiggyBank: ImageVector
    get() {
        if (piggyBank != null) {
            return piggyBank!!
        }
        piggyBank = Builder(
            name = "piggy-bank-default",
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
                moveTo(8.0f, 8.0f)
                curveTo(8.0f, 7.4477f, 8.4477f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                curveTo(13.0f, 8.5522f, 12.5523f, 9.0f, 12.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 9.0f, 8.0f, 8.5522f, 8.0f, 8.0f)
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
                moveTo(16.0f, 11.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 10.5523f, 17.0f, 10.0f)
                curveTo(17.0f, 9.4477f, 16.5523f, 9.0f, 16.0f, 9.0f)
                curveTo(15.4477f, 9.0f, 15.0f, 9.4477f, 15.0f, 10.0f)
                curveTo(15.0f, 10.5523f, 15.4477f, 11.0f, 16.0f, 11.0f)
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
                moveTo(17.7766f, 4.1314f)
                curveTo(17.773f, 4.1406f, 17.7687f, 4.1521f, 17.7639f, 4.166f)
                curveTo(17.7334f, 4.2538f, 17.6999f, 4.384f, 17.6671f, 4.5528f)
                curveTo(17.6042f, 4.8773f, 17.5612f, 5.255f, 17.5341f, 5.56f)
                lineTo(19.862f, 7.5f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 7.5f, 22.0f, 8.3954f, 22.0f, 9.5f)
                verticalLineTo(12.823f)
                curveTo(22.0f, 13.6408f, 21.5021f, 14.3762f, 20.7428f, 14.6799f)
                lineTo(19.4044f, 15.2153f)
                lineTo(19.4032f, 15.2166f)
                curveTo(19.4015f, 15.2188f, 19.3994f, 15.2227f, 19.3985f, 15.2283f)
                curveTo(19.118f, 16.9466f, 18.803f, 18.1244f, 18.1813f, 19.7339f)
                curveTo(17.8822f, 20.5082f, 17.1371f, 21.0f, 16.3266f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8523f, 21.0f, 12.0756f, 20.0776f, 11.9641f, 19.1169f)
                curveTo(11.9165f, 18.7076f, 11.8185f, 18.4222f, 11.6883f, 18.2541f)
                curveTo(11.6011f, 18.1414f, 11.4444f, 18.0f, 11.0f, 18.0f)
                curveTo(10.5556f, 18.0f, 10.3989f, 18.1414f, 10.3117f, 18.2541f)
                curveTo(10.1815f, 18.4222f, 10.0835f, 18.7076f, 10.0359f, 19.1169f)
                curveTo(9.9244f, 20.0776f, 9.1477f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(6.0352f)
                curveTo(5.3733f, 21.0f, 4.7272f, 20.6701f, 4.3596f, 20.0742f)
                curveTo(2.4605f, 16.9958f, 2.0f, 13.8836f, 2.0f, 10.0f)
                curveTo(2.0f, 7.511f, 2.9636f, 5.894f, 4.306f, 4.9651f)
                curveTo(5.5668f, 4.0927f, 7.0405f, 3.9104f, 8.047f, 4.0f)
                lineTo(12.5173f, 4.0f)
                curveTo(12.5189f, 3.9996f, 12.5224f, 3.9985f, 12.528f, 3.9959f)
                curveTo(12.541f, 3.9898f, 12.561f, 3.9769f, 12.5821f, 3.9542f)
                curveTo(13.709f, 2.742f, 14.9674f, 2.2247f, 15.9501f, 2.1147f)
                curveTo(16.4121f, 2.0631f, 16.9105f, 2.0914f, 17.312f, 2.2748f)
                curveTo(17.4922f, 2.3571f, 17.8466f, 2.5603f, 17.9999f, 2.9937f)
                curveTo(18.171f, 3.4774f, 17.9821f, 3.8878f, 17.7766f, 4.1314f)
                close()
                moveTo(15.6968f, 4.2081f)
                curveTo(15.2266f, 4.3601f, 14.6337f, 4.6847f, 14.0469f, 5.3159f)
                curveTo(13.68f, 5.7107f, 13.141f, 6.0f, 12.5194f, 6.0f)
                lineTo(8.0f, 6.0f)
                curveTo(7.9668f, 6.0f, 7.9336f, 5.9983f, 7.9005f, 5.995f)
                curveTo(7.2411f, 5.9291f, 6.2445f, 6.0559f, 5.444f, 6.6098f)
                curveTo(4.703f, 7.1226f, 4.0f, 8.0889f, 4.0f, 10.0f)
                curveTo(4.0f, 13.7044f, 4.4391f, 16.3818f, 6.0469f, 19.0f)
                horizontalLineTo(7.9961f)
                curveTo(7.9977f, 18.9988f, 7.9998f, 18.997f, 8.0025f, 18.9943f)
                curveTo(8.0195f, 18.9777f, 8.043f, 18.9405f, 8.0493f, 18.8863f)
                curveTo(8.1129f, 18.3387f, 8.2708f, 17.6233f, 8.7301f, 17.0298f)
                curveTo(9.2325f, 16.3809f, 9.9988f, 16.0f, 11.0f, 16.0f)
                curveTo(12.0012f, 16.0f, 12.7675f, 16.3809f, 13.2699f, 17.0298f)
                curveTo(13.7293f, 17.6233f, 13.8871f, 18.3387f, 13.9507f, 18.8863f)
                curveTo(13.957f, 18.9405f, 13.9805f, 18.9777f, 13.9975f, 18.9943f)
                lineTo(14.0005f, 18.9972f)
                lineTo(14.0039f, 19.0f)
                horizontalLineTo(16.3207f)
                curveTo(16.8875f, 17.5309f, 17.1663f, 16.4885f, 17.4246f, 14.9062f)
                curveTo(17.537f, 14.2175f, 17.9984f, 13.6236f, 18.6613f, 13.3585f)
                lineTo(20.0f, 12.823f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.862f)
                curveTo(19.3942f, 9.5f, 18.9411f, 9.336f, 18.5817f, 9.0365f)
                lineTo(16.2422f, 7.0869f)
                curveTo(15.7637f, 6.6881f, 15.4819f, 6.0728f, 15.5389f, 5.417f)
                curveTo(15.5674f, 5.0894f, 15.6164f, 4.6339f, 15.6968f, 4.2081f)
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
                imageVector = PersianSymbols.Default.PiggyBank,
                contentDescription = ""
            )
        }
    }
}