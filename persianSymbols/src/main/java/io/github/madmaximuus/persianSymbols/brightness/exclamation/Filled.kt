package io.github.madmaximuus.persianSymbols.brightness.exclamation

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

val PersianSymbols.Filled.BrightnessExclamation: ImageVector
    get() {
        if (brightnessExclamation != null) {
            return brightnessExclamation!!
        }
        brightnessExclamation = Builder(
            name = "brightness-exclamation-filled",
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
                moveTo(13.4154f, 3.4176f)
                curveTo(12.6341f, 2.635f, 11.3659f, 2.635f, 10.5846f, 3.4176f)
                lineTo(9.6591f, 4.3446f)
                curveTo(9.2836f, 4.7208f, 8.7737f, 4.932f, 8.2421f, 4.9316f)
                lineTo(6.9322f, 4.9305f)
                curveTo(5.8264f, 4.9296f, 4.9297f, 5.8263f, 4.9306f, 6.9321f)
                lineTo(4.9317f, 8.2421f)
                curveTo(4.9321f, 8.7736f, 4.7209f, 9.2835f, 4.3447f, 9.6591f)
                lineTo(3.4177f, 10.5846f)
                curveTo(2.6351f, 11.3659f, 2.6351f, 12.634f, 3.4177f, 13.4153f)
                lineTo(4.3447f, 14.3408f)
                curveTo(4.7209f, 14.7164f, 4.9321f, 15.2263f, 4.9317f, 15.7578f)
                lineTo(4.9306f, 17.0677f)
                curveTo(4.9297f, 18.1736f, 5.8264f, 19.0703f, 6.9322f, 19.0694f)
                lineTo(8.2421f, 19.0683f)
                curveTo(8.7737f, 19.0679f, 9.2836f, 19.2791f, 9.6591f, 19.6552f)
                lineTo(10.5846f, 20.5823f)
                curveTo(11.3659f, 21.3648f, 12.6341f, 21.3648f, 13.4154f, 20.5823f)
                lineTo(14.3409f, 19.6552f)
                curveTo(14.7164f, 19.2791f, 15.2263f, 19.0679f, 15.7579f, 19.0683f)
                lineTo(17.0678f, 19.0694f)
                curveTo(18.1736f, 19.0703f, 19.0703f, 18.1736f, 19.0694f, 17.0677f)
                lineTo(19.0684f, 15.7578f)
                curveTo(19.0679f, 15.2263f, 19.2791f, 14.7164f, 19.6553f, 14.3408f)
                lineTo(20.5823f, 13.4153f)
                curveTo(21.3649f, 12.634f, 21.3649f, 11.3659f, 20.5823f, 10.5846f)
                lineTo(19.6553f, 9.6591f)
                curveTo(19.2791f, 9.2835f, 19.0679f, 8.7736f, 19.0684f, 8.2421f)
                lineTo(19.0694f, 6.9321f)
                curveTo(19.0703f, 5.8263f, 18.1736f, 4.9296f, 17.0678f, 4.9305f)
                lineTo(15.7579f, 4.9316f)
                curveTo(15.2263f, 4.932f, 14.7164f, 4.7208f, 14.3409f, 4.3446f)
                lineTo(13.4154f, 3.4176f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 13.5523f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 13.5523f, 11.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                curveTo(11.0f, 15.4477f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 15.4477f, 13.0f, 16.0f)
                close()
            }
        }.build()
        return brightnessExclamation!!
    }

private var brightnessExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.BrightnessExclamation,
                contentDescription = ""
            )
        }
    }
}