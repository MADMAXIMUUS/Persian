package io.github.madmaximuus.persianSymbols.mic.slash

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

val PersianSymbols.Default.MicSlash: ImageVector
    get() {
        if (micSlash != null) {
            return micSlash!!
        }
        micSlash = Builder(
            name = "mic-slash-default",
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
                moveTo(8.0f, 4.9999f)
                curveTo(8.0f, 3.343f, 9.3432f, 1.9999f, 11.0f, 1.9999f)
                horizontalLineTo(13.0f)
                curveTo(14.6569f, 1.9999f, 16.0f, 3.343f, 16.0f, 4.9999f)
                verticalLineTo(10.9999f)
                curveTo(16.0f, 11.7009f, 15.7595f, 12.3458f, 15.3566f, 12.8566f)
                lineTo(13.9116f, 11.4116f)
                curveTo(13.9684f, 11.286f, 14.0f, 11.1466f, 14.0f, 10.9999f)
                verticalLineTo(4.9999f)
                curveTo(14.0f, 4.4476f, 13.5523f, 3.9999f, 13.0f, 3.9999f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 3.9999f, 10.0f, 4.4476f, 10.0f, 4.9999f)
                verticalLineTo(7.5f)
                lineTo(8.0f, 5.5f)
                verticalLineTo(4.9999f)
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
                moveTo(8.0f, 10.5f)
                lineTo(11.4999f, 13.9999f)
                horizontalLineTo(11.0f)
                curveTo(9.3432f, 13.9999f, 8.0f, 12.6567f, 8.0f, 10.9999f)
                verticalLineTo(10.5f)
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
                moveTo(14.4775f, 16.9775f)
                lineTo(12.5f, 15.0f)
                horizontalLineTo(9.9999f)
                curveTo(8.343f, 15.0f, 6.9999f, 13.6569f, 6.9999f, 12.0f)
                curveTo(6.9999f, 11.4477f, 6.5522f, 11.0f, 5.9999f, 11.0f)
                curveTo(5.4476f, 11.0f, 4.9999f, 11.4477f, 4.9999f, 12.0f)
                curveTo(4.9999f, 14.7614f, 7.2385f, 17.0f, 9.9999f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 20.0f, 7.0f, 20.4477f, 7.0f, 21.0f)
                curveTo(7.0f, 21.5523f, 7.4477f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 22.0f, 17.0f, 21.5523f, 17.0f, 21.0f)
                curveTo(17.0f, 20.4477f, 16.5523f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.9999f)
                curveTo(14.161f, 17.0f, 14.3203f, 16.9924f, 14.4775f, 16.9775f)
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
                moveTo(16.3566f, 13.8566f)
                lineTo(17.7767f, 15.2767f)
                curveTo(18.5387f, 14.3991f, 18.9999f, 13.2534f, 18.9999f, 12.0f)
                curveTo(18.9999f, 11.4477f, 18.5522f, 11.0f, 17.9999f, 11.0f)
                curveTo(17.4476f, 11.0f, 16.9999f, 11.4477f, 16.9999f, 12.0f)
                curveTo(16.9999f, 12.701f, 16.7594f, 13.3458f, 16.3566f, 13.8566f)
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
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
                close()
            }
        }.build()
        return micSlash!!
    }

private var micSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.MicSlash,
                contentDescription = ""
            )
        }
    }
}