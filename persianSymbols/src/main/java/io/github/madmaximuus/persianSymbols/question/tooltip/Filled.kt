package io.github.madmaximuus.persianSymbols.question.tooltip

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

val PersianSymbols.Filled.QuestionTooltip: ImageVector
    get() {
        if (questionTooltip != null) {
            return questionTooltip!!
        }
        questionTooltip = Builder(
            name = "question-tooltip-filled",
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
                moveTo(6.5f, 3.0f)
                curveTo(4.567f, 3.0f, 3.0f, 4.567f, 3.0f, 6.5f)
                verticalLineTo(17.2778f)
                curveTo(3.0f, 19.2108f, 4.567f, 20.7778f, 6.5f, 20.7778f)
                horizontalLineTo(8.9288f)
                curveTo(9.455f, 20.7778f, 9.9599f, 20.9851f, 10.3342f, 21.3548f)
                lineTo(11.2973f, 22.306f)
                curveTo(11.6868f, 22.6907f, 12.3132f, 22.6907f, 12.7027f, 22.306f)
                lineTo(13.6658f, 21.3548f)
                curveTo(14.0401f, 20.9851f, 14.545f, 20.7778f, 15.0712f, 20.7778f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 20.7778f, 21.0f, 19.2108f, 21.0f, 17.2778f)
                verticalLineTo(6.5f)
                curveTo(21.0f, 4.567f, 19.433f, 3.0f, 17.5f, 3.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(11.8328f, 14.1782f)
                curveTo(12.2547f, 14.1782f, 12.5833f, 13.8342f, 12.6793f, 13.4232f)
                curveTo(12.6966f, 13.3491f, 12.7165f, 13.2774f, 12.7391f, 13.2082f)
                curveTo(12.8312f, 12.9208f, 13.0061f, 12.6549f, 13.264f, 12.4106f)
                curveTo(13.5633f, 12.1184f, 13.8419f, 11.8262f, 14.0998f, 11.534f)
                curveTo(14.3576f, 11.237f, 14.5671f, 10.9184f, 14.7283f, 10.5783f)
                curveTo(14.8894f, 10.2334f, 14.97f, 9.8502f, 14.97f, 9.4286f)
                curveTo(14.97f, 8.8442f, 14.8526f, 8.346f, 14.6178f, 7.9341f)
                curveTo(14.3875f, 7.5173f, 14.0537f, 7.2011f, 13.6163f, 6.9856f)
                curveTo(13.1788f, 6.7652f, 12.6516f, 6.655f, 12.0346f, 6.655f)
                curveTo(11.4774f, 6.655f, 10.9732f, 6.758f, 10.5219f, 6.964f)
                curveTo(10.0707f, 7.17f, 9.7115f, 7.479f, 9.4445f, 7.8909f)
                curveTo(9.3122f, 8.0949f, 9.2116f, 8.3223f, 9.1426f, 8.5732f)
                curveTo(9.0185f, 9.0242f, 9.4215f, 9.4143f, 9.8893f, 9.4143f)
                curveTo(10.3334f, 9.4143f, 10.6532f, 9.0251f, 10.8949f, 8.6526f)
                curveTo(11.0192f, 8.4562f, 11.1827f, 8.3125f, 11.3853f, 8.2215f)
                curveTo(11.5879f, 8.1257f, 11.8043f, 8.0778f, 12.0346f, 8.0778f)
                curveTo(12.3108f, 8.0778f, 12.5411f, 8.1328f, 12.7253f, 8.243f)
                curveTo(12.9141f, 8.3532f, 13.0568f, 8.5137f, 13.1535f, 8.7245f)
                curveTo(13.2502f, 8.9352f, 13.2985f, 9.1915f, 13.2985f, 9.4933f)
                curveTo(13.2985f, 9.7711f, 13.2479f, 10.0178f, 13.1466f, 10.2334f)
                curveTo(13.0453f, 10.4442f, 12.9094f, 10.6454f, 12.7391f, 10.837f)
                curveTo(12.5687f, 11.0238f, 12.3776f, 11.2226f, 12.1658f, 11.4334f)
                curveTo(11.8941f, 11.7112f, 11.6754f, 11.9747f, 11.5096f, 12.2238f)
                curveTo(11.3485f, 12.4729f, 11.2334f, 12.7507f, 11.1643f, 13.0573f)
                curveTo(11.1401f, 13.1631f, 11.1198f, 13.2778f, 11.1035f, 13.4013f)
                curveTo(11.0474f, 13.8265f, 11.4038f, 14.1782f, 11.8328f, 14.1782f)
                close()
                moveTo(11.1712f, 15.7662f)
                curveTo(11.0008f, 15.9435f, 10.9156f, 16.1614f, 10.9156f, 16.4201f)
                curveTo(10.9156f, 16.6788f, 11.0008f, 16.8991f, 11.1712f, 17.0812f)
                curveTo(11.3416f, 17.2584f, 11.5741f, 17.347f, 11.8688f, 17.347f)
                curveTo(12.1635f, 17.347f, 12.396f, 17.2584f, 12.5664f, 17.0812f)
                curveTo(12.7368f, 16.8991f, 12.822f, 16.6788f, 12.822f, 16.4201f)
                curveTo(12.822f, 16.1614f, 12.7368f, 15.9435f, 12.5664f, 15.7662f)
                curveTo(12.396f, 15.5842f, 12.1635f, 15.4932f, 11.8688f, 15.4932f)
                curveTo(11.5741f, 15.4932f, 11.3416f, 15.5842f, 11.1712f, 15.7662f)
                close()
            }
        }.build()
        return questionTooltip!!
    }

private var questionTooltip: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.QuestionTooltip,
                contentDescription = ""
            )
        }
    }
}