package io.github.madmaximuus.persianSymbols.globe

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Filled.Globe: ImageVector
    get() {
        if (globe != null) {
            return globe!!
        }
        globe = Builder(
            name = "globe-filled",
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
                moveTo(12.0f, 3.602f)
                curveTo(11.2363f, 4.6606f, 10.3309f, 6.2114f, 9.716f, 8.0f)
                horizontalLineTo(14.284f)
                curveTo(13.6691f, 6.2114f, 12.7637f, 4.6606f, 12.0f, 3.602f)
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
                moveTo(14.8128f, 10.0f)
                horizontalLineTo(9.1873f)
                curveTo(9.068f, 10.6531f, 9.0f, 11.3231f, 9.0f, 12.0f)
                curveTo(9.0f, 12.6769f, 9.068f, 13.3469f, 9.1873f, 14.0f)
                horizontalLineTo(14.8127f)
                curveTo(14.932f, 13.3469f, 15.0f, 12.6769f, 15.0f, 11.9999f)
                curveTo(15.0f, 11.323f, 14.932f, 10.6531f, 14.8128f, 10.0f)
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
                moveTo(16.8412f, 14.0f)
                curveTo(16.943f, 13.3473f, 17.0f, 12.6785f, 17.0f, 11.9999f)
                curveTo(17.0f, 11.3214f, 16.943f, 10.6526f, 16.8412f, 10.0f)
                horizontalLineTo(21.8f)
                curveTo(21.9311f, 10.6462f, 22.0f, 11.315f, 22.0f, 12.0f)
                curveTo(22.0f, 12.6849f, 21.9311f, 13.3538f, 21.8f, 14.0f)
                horizontalLineTo(16.8412f)
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
                moveTo(14.284f, 16.0f)
                horizontalLineTo(9.716f)
                curveTo(10.3309f, 17.7885f, 11.2363f, 19.3393f, 12.0f, 20.3979f)
                curveTo(12.7636f, 19.3393f, 13.6691f, 17.7886f, 14.284f, 16.0f)
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
                moveTo(13.3697f, 21.9069f)
                curveTo(14.3621f, 20.604f, 15.6398f, 18.4915f, 16.3846f, 16.0f)
                horizontalLineTo(21.1679f)
                curveTo(19.7997f, 19.1316f, 16.8739f, 21.427f, 13.3697f, 21.9069f)
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
                moveTo(16.3847f, 8.0f)
                curveTo(15.6399f, 5.5085f, 14.3622f, 3.396f, 13.3698f, 2.093f)
                curveTo(16.8739f, 2.5731f, 19.7997f, 4.8684f, 21.1679f, 8.0f)
                horizontalLineTo(16.3847f)
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
                moveTo(2.8321f, 8.0f)
                curveTo(4.2003f, 4.8684f, 7.1261f, 2.573f, 10.6302f, 2.093f)
                curveTo(9.6379f, 3.3959f, 8.3602f, 5.5085f, 7.6153f, 8.0f)
                horizontalLineTo(2.8321f)
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
                moveTo(7.1588f, 10.0f)
                curveTo(7.057f, 10.6526f, 7.0f, 11.3214f, 7.0f, 12.0f)
                curveTo(7.0f, 12.6785f, 7.057f, 13.3473f, 7.1588f, 14.0f)
                horizontalLineTo(2.2f)
                curveTo(2.0689f, 13.3538f, 2.0f, 12.6849f, 2.0f, 12.0f)
                curveTo(2.0f, 11.315f, 2.0689f, 10.6462f, 2.2f, 10.0f)
                horizontalLineTo(7.1588f)
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
                moveTo(7.6153f, 16.0f)
                curveTo(8.3602f, 18.4914f, 9.6379f, 20.604f, 10.6302f, 21.9069f)
                curveTo(7.1261f, 21.4269f, 4.2003f, 19.1316f, 2.8321f, 16.0f)
                horizontalLineTo(7.6153f)
                close()
            }
        }.build()
        return globe!!
    }

private var globe: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Globe,
                contentDescription = ""
            )
        }
    }
}