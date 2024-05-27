package io.github.madmaximuus.persianSymbols.thumb.up

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

val PersianSymbols.Filled.ThumbUp: ImageVector
    get() {
        if (thumbUp != null) {
            return thumbUp!!
        }
        thumbUp = Builder(
            name = "thumb-up-filled",
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
                moveTo(8.0f, 9.0604f)
                lineTo(13.5337f, 3.101f)
                curveTo(13.8549f, 2.7551f, 14.4325f, 3.006f, 14.3988f, 3.4769f)
                lineTo(14.0765f, 7.9892f)
                curveTo(14.0352f, 8.568f, 14.4936f, 9.0604f, 15.074f, 9.0604f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 9.0604f, 22.0f, 9.9558f, 22.0f, 11.0604f)
                verticalLineTo(13.5069f)
                curveTo(22.0f, 13.7894f, 21.9402f, 14.0686f, 21.8244f, 14.3263f)
                lineTo(19.3302f, 19.8798f)
                curveTo(19.0076f, 20.5982f, 18.2933f, 21.0604f, 17.5058f, 21.0604f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0604f)
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
                moveTo(6.0f, 9.0604f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 9.0604f, 2.0f, 9.9558f, 2.0f, 11.0604f)
                verticalLineTo(19.0604f)
                curveTo(2.0f, 20.165f, 2.8954f, 21.0604f, 4.0f, 21.0604f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0604f)
                close()
            }
        }.build()
        return thumbUp!!
    }

private var thumbUp: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ThumbUp,
                contentDescription = ""
            )
        }
    }
}