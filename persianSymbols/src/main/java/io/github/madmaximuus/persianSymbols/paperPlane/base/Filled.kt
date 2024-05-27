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
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PaperPlane: ImageVector
    get() {
        if (paperPlane != null) {
            return paperPlane!!
        }
        paperPlane = Builder(
            name = "paper-plane-filled",
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
                moveTo(5.1156f, 3.952f)
                lineTo(20.9735f, 11.0881f)
                curveTo(21.7597f, 11.4419f, 21.7597f, 12.5581f, 20.9735f, 12.9119f)
                lineTo(5.1156f, 20.048f)
                curveTo(4.1229f, 20.4947f, 3.0f, 19.7686f, 3.0f, 18.6801f)
                verticalLineTo(14.0126f)
                curveTo(3.0f, 13.5062f, 3.3785f, 13.0798f, 3.8813f, 13.0197f)
                lineTo(8.2583f, 12.4965f)
                curveTo(8.8459f, 12.4262f, 8.8459f, 11.5738f, 8.2583f, 11.5035f)
                lineTo(3.8813f, 10.9803f)
                curveTo(3.3785f, 10.9202f, 3.0f, 10.4938f, 3.0f, 9.9874f)
                verticalLineTo(5.3199f)
                curveTo(3.0f, 4.2314f, 4.1229f, 3.5053f, 5.1156f, 3.952f)
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
                imageVector = PersianSymbols.Filled.PaperPlane,
                contentDescription = ""
            )
        }
    }
}