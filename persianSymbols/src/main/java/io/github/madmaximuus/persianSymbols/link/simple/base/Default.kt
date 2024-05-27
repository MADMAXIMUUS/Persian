package io.github.madmaximuus.persianSymbols.link.simple.base

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

val PersianSymbols.Default.LinkSimple: ImageVector
    get() {
        if (linkSimple != null) {
            return linkSimple!!
        }
        linkSimple = Builder(
            name = "link-simple-default",
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
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 9.7909f, 5.7909f, 8.0f, 8.0f, 8.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 8.0f, 11.0f, 7.5523f, 11.0f, 7.0f)
                curveTo(11.0f, 6.4477f, 10.5523f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(4.6863f, 6.0f, 2.0f, 8.6863f, 2.0f, 12.0f)
                curveTo(2.0f, 15.3137f, 4.6863f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 18.0f, 11.0f, 17.5523f, 11.0f, 17.0f)
                curveTo(11.0f, 16.4477f, 10.5523f, 16.0f, 10.0f, 16.0f)
                horizontalLineTo(8.0f)
                curveTo(5.7909f, 16.0f, 4.0f, 14.2091f, 4.0f, 12.0f)
                close()
                moveTo(13.0f, 7.0f)
                curveTo(13.0f, 6.4477f, 13.4477f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(19.3137f, 6.0f, 22.0f, 8.6863f, 22.0f, 12.0f)
                curveTo(22.0f, 15.3137f, 19.3137f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 18.0f, 13.0f, 17.5523f, 13.0f, 17.0f)
                curveTo(13.0f, 16.4477f, 13.4477f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(18.2091f, 16.0f, 20.0f, 14.2091f, 20.0f, 12.0f)
                curveTo(20.0f, 9.7909f, 18.2091f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 8.0f, 13.0f, 7.5523f, 13.0f, 7.0f)
                close()
                moveTo(7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 16.5523f, 13.0f, 16.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                close()
            }
        }.build()
        return linkSimple!!
    }

private var linkSimple: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.LinkSimple,
                contentDescription = ""
            )
        }
    }
}