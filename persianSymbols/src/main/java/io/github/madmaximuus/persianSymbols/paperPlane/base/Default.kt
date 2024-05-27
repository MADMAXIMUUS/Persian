package io.github.madmaximuus.persianSymbols.paperPlane.base

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

val PersianSymbols.Default.PaperPlane: ImageVector
    get() {
        if (paperPlane != null) {
            return paperPlane!!
        }
        paperPlane = Builder(
            name = "paper-plane-default",
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
                moveTo(5.4258f, 4.671f)
                lineTo(20.0386f, 11.5476f)
                curveTo(20.4214f, 11.7277f, 20.4214f, 12.2723f, 20.0386f, 12.4524f)
                lineTo(5.4258f, 19.329f)
                curveTo(4.7625f, 19.6412f, 4.0f, 19.1572f, 4.0f, 18.4242f)
                verticalLineTo(14.3904f)
                curveTo(4.0f, 14.161f, 4.1561f, 13.961f, 4.3787f, 13.9053f)
                lineTo(11.2239f, 12.194f)
                curveTo(11.4259f, 12.1435f, 11.4259f, 11.8565f, 11.2239f, 11.806f)
                lineTo(4.3787f, 10.0947f)
                curveTo(4.1561f, 10.039f, 4.0f, 9.8391f, 4.0f, 9.6096f)
                verticalLineTo(5.5758f)
                curveTo(4.0f, 4.8428f, 4.7625f, 4.3589f, 5.4258f, 4.671f)
                close()
            }
        }.build()
        return paperPlane!!
    }

private var paperPlane: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PaperPlane,
                contentDescription = ""
            )
        }
    }
}