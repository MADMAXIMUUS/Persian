package io.github.madmaximuus.persianSymbols.eye.base

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

val PersianSymbols.Filled.Eye: ImageVector
    get() {
        if (eye != null) {
            return eye!!
        }
        eye = Builder(
            name = "eye-filled",
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
                moveTo(12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
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
                moveTo(12.0f, 5.0f)
                curveTo(7.432f, 5.0f, 4.6899f, 7.191f, 3.2374f, 9.321f)
                curveTo(2.1467f, 10.9205f, 2.2818f, 13.0283f, 3.4211f, 14.5936f)
                curveTo(4.916f, 16.6476f, 7.6178f, 19.0f, 12.0f, 19.0f)
                curveTo(16.3822f, 19.0f, 19.084f, 16.6476f, 20.579f, 14.5936f)
                curveTo(21.7182f, 13.0283f, 21.8534f, 10.9205f, 20.7627f, 9.321f)
                curveTo(19.3102f, 7.191f, 16.568f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 14.2091f, 14.2092f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                curveTo(8.0f, 9.7909f, 9.7909f, 8.0f, 12.0f, 8.0f)
                curveTo(14.2092f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                close()
            }
        }.build()
        return eye!!
    }

private var eye: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Eye,
                contentDescription = ""
            )
        }
    }
}