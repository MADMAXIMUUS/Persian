package io.github.madmaximuus.persianSymbols.thumb.down

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

val PersianSymbols.Filled.ThumbDown: ImageVector
    get() {
        if (thumbDown != null) {
            return thumbDown!!
        }
        thumbDown = Builder(
            name = "thumb-down-filled",
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
                moveTo(8.0f, 14.9399f)
                lineTo(13.5337f, 20.8993f)
                curveTo(13.8549f, 21.2452f, 14.4325f, 20.9943f, 14.3988f, 20.5235f)
                lineTo(14.0765f, 16.0112f)
                curveTo(14.0352f, 15.4323f, 14.4936f, 14.9399f, 15.074f, 14.9399f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 14.9399f, 22.0f, 14.0445f, 22.0f, 12.9399f)
                verticalLineTo(10.4934f)
                curveTo(22.0f, 10.211f, 21.9402f, 9.9317f, 21.8244f, 9.6741f)
                lineTo(19.3302f, 4.1205f)
                curveTo(19.0076f, 3.4021f, 18.2933f, 2.9399f, 17.5058f, 2.9399f)
                lineTo(8.0f, 2.9399f)
                verticalLineTo(14.9399f)
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
                moveTo(6.0f, 14.9399f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 14.9399f, 2.0f, 14.0445f, 2.0f, 12.9399f)
                verticalLineTo(4.9399f)
                curveTo(2.0f, 3.8354f, 2.8954f, 2.9399f, 4.0f, 2.9399f)
                lineTo(6.0f, 2.9399f)
                verticalLineTo(14.9399f)
                close()
            }
        }.build()
        return thumbDown!!
    }

private var thumbDown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ThumbDown,
                contentDescription = ""
            )
        }
    }
}