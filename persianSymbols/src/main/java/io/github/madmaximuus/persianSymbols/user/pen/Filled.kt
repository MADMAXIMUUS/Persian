package io.github.madmaximuus.persianSymbols.user.pen

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

val PersianSymbols.Filled.UserPen: ImageVector
    get() {
        if (userPen != null) {
            return userPen!!
        }
        userPen = Builder(
            name = "user-pen-filled",
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
                moveTo(12.0f, 12.5f)
                curveTo(14.7615f, 12.5f, 17.0f, 10.2614f, 17.0f, 7.5f)
                curveTo(17.0f, 4.7386f, 14.7615f, 2.5f, 12.0f, 2.5f)
                curveTo(9.2386f, 2.5f, 7.0f, 4.7386f, 7.0f, 7.5f)
                curveTo(7.0f, 10.2614f, 9.2386f, 12.5f, 12.0f, 12.5f)
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
                moveTo(5.1787f, 17.3182f)
                curveTo(6.5859f, 15.0276f, 9.1146f, 13.5f, 12.0f, 13.5f)
                curveTo(13.1122f, 13.5f, 14.1714f, 13.727f, 15.1338f, 14.1371f)
                lineTo(12.8671f, 16.4039f)
                curveTo(12.4832f, 16.7878f, 12.2215f, 17.2767f, 12.115f, 17.8091f)
                lineTo(11.6144f, 20.3123f)
                curveTo(11.5307f, 20.7309f, 11.5673f, 21.1363f, 11.6959f, 21.5f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 21.5f, 3.9066f, 19.3887f, 5.1787f, 17.3182f)
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
                moveTo(17.6027f, 13.0825f)
                curveTo(18.2862f, 12.3991f, 19.3942f, 12.3991f, 20.0776f, 13.0825f)
                lineTo(21.4918f, 14.4967f)
                curveTo(22.1752f, 15.1801f, 22.1752f, 16.2882f, 21.4918f, 16.9716f)
                lineTo(17.4633f, 21.0001f)
                curveTo(17.219f, 21.2444f, 16.9078f, 21.411f, 16.569f, 21.4787f)
                lineTo(14.0658f, 21.9794f)
                curveTo(13.1912f, 22.1543f, 12.42f, 21.3831f, 12.595f, 20.5085f)
                lineTo(13.0956f, 18.0053f)
                curveTo(13.1634f, 17.6665f, 13.3299f, 17.3554f, 13.5742f, 17.1111f)
                lineTo(17.6027f, 13.0825f)
                close()
                moveTo(14.6348f, 18.1717f)
                lineTo(17.1938f, 15.6128f)
                lineTo(18.9616f, 17.3805f)
                lineTo(16.4026f, 19.9395f)
                curveTo(16.3677f, 19.9744f, 16.3233f, 19.9982f, 16.2749f, 20.0079f)
                lineTo(14.1394f, 20.4349f)
                lineTo(14.5665f, 18.2995f)
                curveTo(14.5762f, 18.2511f, 14.5999f, 18.2066f, 14.6348f, 18.1717f)
                close()
            }
        }.build()
        return userPen!!
    }

private var userPen: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserPen,
                contentDescription = ""
            )
        }
    }
}