package io.github.madmaximuus.persianSymbols.message.question

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

val PersianSymbols.Filled.MessageQuestion: ImageVector
    get() {
        if (messageQuestion != null) {
            return messageQuestion!!
        }
        messageQuestion = Builder(
            name = "message-question-filled",
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
                moveTo(6.15f, 3.2109f)
                horizontalLineTo(17.35f)
                curveTo(19.7801f, 3.2109f, 21.75f, 5.1809f, 21.75f, 7.6109f)
                verticalLineTo(14.8109f)
                curveTo(21.75f, 17.241f, 19.7801f, 19.2109f, 17.35f, 19.2109f)
                horizontalLineTo(7.9164f)
                curveTo(7.5122f, 19.2109f, 7.1111f, 19.2809f, 6.7309f, 19.4178f)
                lineTo(3.0887f, 20.729f)
                curveTo(2.4371f, 20.9636f, 1.75f, 20.4807f, 1.75f, 19.7881f)
                verticalLineTo(7.6109f)
                curveTo(1.75f, 5.1809f, 3.7199f, 3.2109f, 6.15f, 3.2109f)
                close()
                moveTo(11.8328f, 13.3892f)
                curveTo(12.2547f, 13.3892f, 12.5833f, 13.0451f, 12.6793f, 12.6342f)
                curveTo(12.6966f, 12.56f, 12.7165f, 12.4884f, 12.7391f, 12.4191f)
                curveTo(12.8312f, 12.1317f, 13.0061f, 11.8658f, 13.264f, 11.6215f)
                curveTo(13.5633f, 11.3293f, 13.8419f, 11.0371f, 14.0998f, 10.7449f)
                curveTo(14.3576f, 10.4479f, 14.5671f, 10.1294f, 14.7283f, 9.7892f)
                curveTo(14.8894f, 9.4443f, 14.97f, 9.0611f, 14.97f, 8.6396f)
                curveTo(14.97f, 8.0551f, 14.8526f, 7.557f, 14.6178f, 7.145f)
                curveTo(14.3875f, 6.7282f, 14.0537f, 6.4121f, 13.6163f, 6.1965f)
                curveTo(13.1788f, 5.9761f, 12.6516f, 5.866f, 12.0346f, 5.866f)
                curveTo(11.4774f, 5.866f, 10.9732f, 5.969f, 10.5219f, 6.1749f)
                curveTo(10.0707f, 6.3809f, 9.7115f, 6.6899f, 9.4445f, 7.1019f)
                curveTo(9.3122f, 7.3058f, 9.2116f, 7.5333f, 9.1426f, 7.7842f)
                curveTo(9.0185f, 8.2352f, 9.4215f, 8.6252f, 9.8893f, 8.6252f)
                curveTo(10.3334f, 8.6252f, 10.6532f, 8.2361f, 10.8949f, 7.8635f)
                curveTo(11.0192f, 7.6671f, 11.1827f, 7.5234f, 11.3853f, 7.4324f)
                curveTo(11.5879f, 7.3366f, 11.8043f, 7.2887f, 12.0346f, 7.2887f)
                curveTo(12.3108f, 7.2887f, 12.5411f, 7.3438f, 12.7253f, 7.454f)
                curveTo(12.9141f, 7.5641f, 13.0568f, 7.7246f, 13.1535f, 7.9354f)
                curveTo(13.2502f, 8.1462f, 13.2985f, 8.4024f, 13.2985f, 8.7042f)
                curveTo(13.2985f, 8.9821f, 13.2479f, 9.2288f, 13.1466f, 9.4443f)
                curveTo(13.0453f, 9.6551f, 12.9094f, 9.8563f, 12.7391f, 10.0479f)
                curveTo(12.5687f, 10.2347f, 12.3776f, 10.4335f, 12.1658f, 10.6443f)
                curveTo(11.8941f, 10.9222f, 11.6754f, 11.1856f, 11.5096f, 11.4347f)
                curveTo(11.3485f, 11.6838f, 11.2334f, 11.9617f, 11.1643f, 12.2682f)
                curveTo(11.1401f, 12.3741f, 11.1198f, 12.4887f, 11.1035f, 12.6122f)
                curveTo(11.0474f, 13.0374f, 11.4038f, 13.3892f, 11.8328f, 13.3892f)
                close()
                moveTo(11.1712f, 14.9772f)
                curveTo(11.0008f, 15.1544f, 10.9156f, 15.3724f, 10.9156f, 15.631f)
                curveTo(10.9156f, 15.8897f, 11.0008f, 16.1101f, 11.1712f, 16.2921f)
                curveTo(11.3416f, 16.4693f, 11.5741f, 16.558f, 11.8688f, 16.558f)
                curveTo(12.1635f, 16.558f, 12.396f, 16.4693f, 12.5664f, 16.2921f)
                curveTo(12.7368f, 16.1101f, 12.822f, 15.8897f, 12.822f, 15.631f)
                curveTo(12.822f, 15.3724f, 12.7368f, 15.1544f, 12.5664f, 14.9772f)
                curveTo(12.396f, 14.7951f, 12.1635f, 14.7041f, 11.8688f, 14.7041f)
                curveTo(11.5741f, 14.7041f, 11.3416f, 14.7951f, 11.1712f, 14.9772f)
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
                imageVector = PersianSymbols.Filled.MessageQuestion,
                contentDescription = ""
            )
        }
    }
}