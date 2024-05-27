package io.github.madmaximuus.persianSymbols.play.base

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

val PersianSymbols.Default.Play: ImageVector
    get() {
        if (play != null) {
            return play!!
        }
        play = Builder(
            name = "play-default",
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
                moveTo(17.7519f, 11.168f)
                lineTo(8.5547f, 5.0365f)
                curveTo(7.8902f, 4.5934f, 7.0f, 5.0698f, 7.0f, 5.8685f)
                verticalLineTo(18.1315f)
                curveTo(7.0f, 18.9302f, 7.8901f, 19.4066f, 8.5547f, 18.9635f)
                lineTo(17.7519f, 12.8321f)
                curveTo(18.3457f, 12.4362f, 18.3457f, 11.5638f, 17.7519f, 11.168f)
                close()
            }
        }.build()
        return play!!
    }

private var play: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Play,
                contentDescription = ""
            )
        }
    }
}