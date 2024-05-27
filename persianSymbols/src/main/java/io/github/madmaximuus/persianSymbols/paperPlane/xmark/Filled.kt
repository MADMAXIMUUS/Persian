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

val PersianSymbols.Filled.PaperPlaneXMark: ImageVector
    get() {
        if (paperPlaneXMark != null) {
            return paperPlaneXMark!!
        }
        paperPlaneXMark = Builder(
            name = "paper-plane-xmark-filled",
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
                moveTo(5.1156f, 3.9521f)
                lineTo(20.9735f, 11.0882f)
                curveTo(21.7203f, 11.4242f, 21.7577f, 12.4483f, 21.0857f, 12.8533f)
                curveTo(20.1841f, 12.3116f, 19.1284f, 12.0001f, 18.0f, 12.0001f)
                curveTo(15.0602f, 12.0001f, 12.6142f, 14.1143f, 12.0997f, 16.9052f)
                lineTo(5.1156f, 20.0481f)
                curveTo(4.1229f, 20.4948f, 3.0f, 19.7687f, 3.0f, 18.6802f)
                verticalLineTo(14.0127f)
                curveTo(3.0f, 13.5063f, 3.3785f, 13.0798f, 3.8813f, 13.0197f)
                lineTo(8.2583f, 12.4965f)
                curveTo(8.8459f, 12.4263f, 8.8459f, 11.5738f, 8.2583f, 11.5036f)
                lineTo(3.8813f, 10.9804f)
                curveTo(3.3785f, 10.9203f, 3.0f, 10.4939f, 3.0f, 9.9875f)
                verticalLineTo(5.32f)
                curveTo(3.0f, 4.2315f, 4.1229f, 3.5054f, 5.1156f, 3.9521f)
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
                imageVector = PersianSymbols.Filled.PaperPlaneXMark,
                contentDescription = ""
            )
        }
    }
}