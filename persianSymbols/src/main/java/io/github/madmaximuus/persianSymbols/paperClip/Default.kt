package io.github.madmaximuus.persianSymbols.paperClip

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.PaperClip: ImageVector
    get() {
        if (paperClip != null) {
            return paperClip!!
        }
        paperClip = Builder(
            name = "paper-clip-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 7.0f, 16.0f, 15.0f, 16.0f, 16.0f)
                curveTo(16.0f, 17.0f, 16.0f, 21.0f, 11.5f, 21.0f)
                curveTo(7.0f, 21.0f, 7.0f, 17.5f, 7.0f, 16.0f)
                curveTo(7.0f, 13.0f, 7.0f, 8.4f, 7.0f, 6.0f)
                curveTo(7.0f, 3.6f, 9.0f, 3.0f, 10.0f, 3.0f)
                curveTo(11.05f, 3.0f, 13.0f, 3.6f, 13.0f, 6.0f)
                curveTo(13.0f, 8.4f, 13.0f, 13.8333f, 13.0f, 16.0f)
                curveTo(13.0f, 16.5f, 13.1667f, 18.0f, 11.5f, 18.0f)
                curveTo(10.0f, 18.0f, 10.0f, 16.5f, 10.0f, 16.0f)
                verticalLineTo(7.0f)
            }
        }.build()
        return paperClip!!
    }

private var paperClip: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PaperClip,
                contentDescription = ""
            )
        }
    }
}