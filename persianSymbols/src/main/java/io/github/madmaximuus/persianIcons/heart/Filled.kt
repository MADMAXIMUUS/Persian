package io.github.madmaximuus.persianIcons.heart

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Filled.Heart: ImageVector
    get() {
        if (heart != null) {
            return heart!!
        }
        heart = ImageVector.Builder(
            name = "heart-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.6621f, 5.49645f)
                curveTo(11.7732f, 5.6075f, 11.8779f, 5.7225f, 11.9764f, 5.841f)
                lineTo(11.9914f, 5.82591f)
                lineTo(12.0159f, 5.85034f)
                curveTo(12.1166f, 5.7286f, 12.2239f, 5.6104f, 12.3379f, 5.4965f)
                curveTo(14.2905f, 3.5438f, 17.4563f, 3.5438f, 19.4089f, 5.4965f)
                curveTo(21.3616f, 7.4491f, 21.3616f, 10.6149f, 19.4089f, 12.5675f)
                curveTo(19.295f, 12.6815f, 19.1768f, 12.7888f, 19.0551f, 12.8895f)
                lineTo(19.0625f, 12.897f)
                lineTo(11.9914f, 19.9681f)
                lineTo(4.92038f, 12.897f)
                lineTo(4.93559f, 12.8818f)
                curveTo(4.8171f, 12.7833f, 4.7021f, 12.6786f, 4.5911f, 12.5675f)
                curveTo(2.6384f, 10.6149f, 2.6384f, 7.4491f, 4.5911f, 5.4965f)
                curveTo(6.5437f, 3.5438f, 9.7095f, 3.5438f, 11.6621f, 5.4965f)
                close()
            }
        }.build()
        return heart!!
    }

private var heart: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Heart,
                contentDescription = ""
            )
        }
    }
}