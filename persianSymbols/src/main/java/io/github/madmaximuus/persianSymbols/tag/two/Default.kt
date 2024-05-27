package io.github.madmaximuus.persianSymbols.tag.two

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
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Tag2: ImageVector
    get() {
        if (tag2 != null) {
            return tag2!!
        }
        tag2 = Builder(
            name = "tag-2-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.3684f, 5.0f)
                horizontalLineTo(3.0f)
                lineTo(9.5f, 12.0f)
                lineTo(3.0f, 19.0f)
                horizontalLineTo(14.3684f)
                lineTo(21.0f, 12.0f)
                lineTo(14.3684f, 5.0f)
                close()
            }
        }.build()
        return tag2!!
    }

private var tag2: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Tag2,
                contentDescription = ""
            )
        }
    }
}