package io.github.madmaximuus.persianSymbols.paperPlane.xmark

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

val PersianSymbols.Default.PaperPlaneXMark: ImageVector
    get() {
        if (paperPlaneXMark != null) {
            return paperPlaneXMark!!
        }
        paperPlaneXMark = Builder(
            name = "paper-plane-xmark-default",
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
                moveTo(3.0f, 5.5758f)
                curveTo(3.0f, 4.1097f, 4.5251f, 3.1419f, 5.8516f, 3.7661f)
                lineTo(20.4644f, 10.6428f)
                curveTo(21.3514f, 11.0602f, 21.5533f, 12.1296f, 21.0702f, 12.8439f)
                curveTo(20.3315f, 12.4031f, 19.4901f, 12.1166f, 18.5905f, 12.0287f)
                lineTo(18.6515f, 12.0f)
                lineTo(5.0f, 5.5758f)
                lineTo(5.0f, 5.5758f)
                verticalLineTo(9.2192f)
                lineTo(11.4664f, 10.8358f)
                curveTo(12.6784f, 11.1388f, 12.6784f, 12.8612f, 11.4664f, 13.1642f)
                lineTo(5.0f, 14.7808f)
                verticalLineTo(18.4242f)
                lineTo(13.0222f, 14.6491f)
                curveTo(12.4959f, 15.4294f, 12.1482f, 16.3401f, 12.0378f, 17.3227f)
                lineTo(5.8516f, 20.2338f)
                curveTo(4.5251f, 20.8581f, 3.0f, 19.8902f, 3.0f, 18.4242f)
                verticalLineTo(14.3904f)
                curveTo(3.0f, 13.7021f, 3.4684f, 13.1021f, 4.1362f, 12.9352f)
                lineTo(7.8769f, 12.0f)
                lineTo(4.1362f, 11.0648f)
                curveTo(3.4685f, 10.8979f, 3.0f, 10.2979f, 3.0f, 9.6096f)
                verticalLineTo(5.5758f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
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
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 5.5758f)
                curveTo(3.0f, 4.1097f, 4.5251f, 3.1419f, 5.8516f, 3.7661f)
                lineTo(20.4644f, 10.6428f)
                curveTo(21.3514f, 11.0602f, 21.5533f, 12.1296f, 21.0702f, 12.8439f)
                curveTo(20.3315f, 12.4031f, 19.4901f, 12.1166f, 18.5905f, 12.0287f)
                lineTo(18.6515f, 12.0f)
                lineTo(5.0f, 5.5758f)
                lineTo(5.0f, 9.2192f)
                lineTo(11.4664f, 10.8358f)
                curveTo(12.6784f, 11.1388f, 12.6784f, 12.8612f, 11.4664f, 13.1642f)
                lineTo(5.0f, 14.7808f)
                verticalLineTo(18.4242f)
                lineTo(13.0222f, 14.6491f)
                curveTo(12.4959f, 15.4294f, 12.1482f, 16.3401f, 12.0378f, 17.3227f)
                lineTo(5.8516f, 20.2338f)
                curveTo(4.5251f, 20.8581f, 3.0f, 19.8902f, 3.0f, 18.4242f)
                verticalLineTo(14.3904f)
                curveTo(3.0f, 13.7021f, 3.4684f, 13.1021f, 4.1362f, 12.9352f)
                lineTo(7.8769f, 12.0f)
                lineTo(4.1362f, 11.0648f)
                curveTo(3.4685f, 10.8979f, 3.0f, 10.2979f, 3.0f, 9.6096f)
                verticalLineTo(5.5758f)
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
        return paperPlaneXMark!!
    }

private var paperPlaneXMark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PaperPlaneXMark,
                contentDescription = ""
            )
        }
    }
}