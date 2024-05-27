package io.github.madmaximuus.persianSymbols.radar

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

val PersianSymbols.Default.Radar: ImageVector
    get() {
        if (radar != null) {
            return radar!!
        }
        radar = Builder(
            name = "radar-default",
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
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 13.8487f, 19.3729f, 15.551f, 18.3199f, 16.9056f)
                lineTo(16.8907f, 15.4765f)
                curveTo(17.5892f, 14.4957f, 18.0f, 13.2958f, 18.0f, 12.0f)
                curveTo(18.0f, 8.6863f, 15.3137f, 6.0f, 12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 15.3137f, 8.6863f, 18.0f, 12.0f, 18.0f)
                curveTo(13.2958f, 18.0f, 14.4957f, 17.5892f, 15.4765f, 16.8907f)
                lineTo(16.9056f, 18.3199f)
                curveTo(15.551f, 19.3729f, 13.8487f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                close()
                moveTo(15.4462f, 14.032f)
                curveTo(15.7981f, 13.4365f, 16.0f, 12.7418f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
                curveTo(12.7418f, 16.0f, 13.4365f, 15.7981f, 14.032f, 15.4462f)
                lineTo(12.518f, 13.9323f)
                curveTo(12.3528f, 13.9764f, 12.1792f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 12.1792f, 13.9764f, 12.3528f, 13.9323f, 12.518f)
                lineTo(15.4462f, 14.032f)
                close()
            }
        }.build()
        return radar!!
    }

private var radar: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Radar,
                contentDescription = ""
            )
        }
    }
}