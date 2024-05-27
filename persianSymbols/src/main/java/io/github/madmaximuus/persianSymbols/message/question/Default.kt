package io.github.madmaximuus.persianSymbols.message.question

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

val PersianSymbols.Default.MessageQuestion: ImageVector
    get() {
        if (messageQuestion != null) {
            return messageQuestion!!
        }
        messageQuestion = Builder(
            name = "message-question-default",
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
                moveTo(11.8328f, 13.1782f)
                curveTo(12.2547f, 13.1782f, 12.5833f, 12.8342f, 12.6793f, 12.4232f)
                curveTo(12.6966f, 12.3491f, 12.7165f, 12.2774f, 12.7391f, 12.2082f)
                curveTo(12.8312f, 11.9208f, 13.0061f, 11.6549f, 13.264f, 11.4106f)
                curveTo(13.5633f, 11.1184f, 13.8419f, 10.8262f, 14.0998f, 10.534f)
                curveTo(14.3576f, 10.237f, 14.5671f, 9.9184f, 14.7283f, 9.5783f)
                curveTo(14.8894f, 9.2334f, 14.97f, 8.8502f, 14.97f, 8.4286f)
                curveTo(14.97f, 7.8442f, 14.8526f, 7.346f, 14.6178f, 6.9341f)
                curveTo(14.3875f, 6.5173f, 14.0537f, 6.2011f, 13.6163f, 5.9856f)
                curveTo(13.1788f, 5.7652f, 12.6516f, 5.655f, 12.0346f, 5.655f)
                curveTo(11.4774f, 5.655f, 10.9732f, 5.758f, 10.5219f, 5.964f)
                curveTo(10.0707f, 6.17f, 9.7115f, 6.479f, 9.4445f, 6.8909f)
                curveTo(9.3122f, 7.0949f, 9.2116f, 7.3223f, 9.1426f, 7.5732f)
                curveTo(9.0185f, 8.0242f, 9.4215f, 8.4143f, 9.8893f, 8.4143f)
                curveTo(10.3334f, 8.4143f, 10.6532f, 8.0251f, 10.8949f, 7.6526f)
                curveTo(11.0192f, 7.4562f, 11.1827f, 7.3125f, 11.3853f, 7.2215f)
                curveTo(11.5879f, 7.1257f, 11.8043f, 7.0778f, 12.0346f, 7.0778f)
                curveTo(12.3108f, 7.0778f, 12.5411f, 7.1328f, 12.7253f, 7.243f)
                curveTo(12.9141f, 7.3532f, 13.0568f, 7.5137f, 13.1535f, 7.7245f)
                curveTo(13.2502f, 7.9352f, 13.2985f, 8.1915f, 13.2985f, 8.4933f)
                curveTo(13.2985f, 8.7711f, 13.2479f, 9.0178f, 13.1466f, 9.2334f)
                curveTo(13.0453f, 9.4442f, 12.9094f, 9.6454f, 12.7391f, 9.837f)
                curveTo(12.5687f, 10.0238f, 12.3776f, 10.2226f, 12.1658f, 10.4334f)
                curveTo(11.8941f, 10.7112f, 11.6754f, 10.9747f, 11.5096f, 11.2238f)
                curveTo(11.3485f, 11.4729f, 11.2334f, 11.7507f, 11.1643f, 12.0573f)
                curveTo(11.1401f, 12.1631f, 11.1198f, 12.2778f, 11.1035f, 12.4013f)
                curveTo(11.0474f, 12.8265f, 11.4038f, 13.1782f, 11.8328f, 13.1782f)
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
                moveTo(11.1712f, 14.7662f)
                curveTo(11.0008f, 14.9435f, 10.9156f, 15.1614f, 10.9156f, 15.4201f)
                curveTo(10.9156f, 15.6788f, 11.0008f, 15.8991f, 11.1712f, 16.0812f)
                curveTo(11.3416f, 16.2584f, 11.5741f, 16.347f, 11.8688f, 16.347f)
                curveTo(12.1635f, 16.347f, 12.396f, 16.2584f, 12.5664f, 16.0812f)
                curveTo(12.7368f, 15.8991f, 12.822f, 15.6788f, 12.822f, 15.4201f)
                curveTo(12.822f, 15.1614f, 12.7368f, 14.9435f, 12.5664f, 14.7662f)
                curveTo(12.396f, 14.5842f, 12.1635f, 14.4932f, 11.8688f, 14.4932f)
                curveTo(11.5741f, 14.4932f, 11.3416f, 14.5842f, 11.1712f, 14.7662f)
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
                moveTo(6.25f, 3.0f)
                curveTo(3.7647f, 3.0f, 1.75f, 5.0147f, 1.75f, 7.5f)
                verticalLineTo(20.0f)
                curveTo(1.75f, 20.3318f, 1.9146f, 20.642f, 2.1894f, 20.8281f)
                curveTo(2.4641f, 21.0141f, 2.8133f, 21.0517f, 3.1214f, 20.9285f)
                lineTo(7.4956f, 19.1788f)
                curveTo(7.7909f, 19.0607f, 8.106f, 19.0f, 8.424f, 19.0f)
                horizontalLineTo(17.25f)
                curveTo(19.7353f, 19.0f, 21.75f, 16.9853f, 21.75f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(21.75f, 5.0147f, 19.7353f, 3.0f, 17.25f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(3.75f, 7.5f)
                curveTo(3.75f, 6.1193f, 4.8693f, 5.0f, 6.25f, 5.0f)
                horizontalLineTo(17.25f)
                curveTo(18.6307f, 5.0f, 19.75f, 6.1193f, 19.75f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(19.75f, 15.8807f, 18.6307f, 17.0f, 17.25f, 17.0f)
                horizontalLineTo(8.424f)
                curveTo(7.8516f, 17.0f, 7.2843f, 17.1092f, 6.7528f, 17.3219f)
                lineTo(5.1214f, 17.9744f)
                curveTo(4.4645f, 18.2372f, 3.75f, 17.7534f, 3.75f, 17.0459f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return messageQuestion!!
    }

private var messageQuestion: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.MessageQuestion,
                contentDescription = ""
            )
        }
    }
}