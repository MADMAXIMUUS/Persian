package io.github.madmaximuus.persianSymbols.chevronRight.base

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronRight: ImageVector
    get() {
        if (chevronRight != null) {
            return chevronRight!!
        }
        chevronRight = ImageVector.Builder(
            name = "chevron-right-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(11.0199f, 7.0579f)
                curveTo(10.6294f, 6.6674f, 9.9928f, 6.664f, 9.5982f, 7.0503f)
                curveTo(9.2035f, 7.4367f, 9.2002f, 8.0664f, 9.5907f, 8.457f)
                lineTo(13.1338f, 12.0001f)
                lineTo(9.5907f, 15.5431f)
                curveTo(9.2002f, 15.9337f, 9.2036f, 16.5634f, 9.5982f, 16.9498f)
                curveTo(9.9929f, 17.3361f, 10.6294f, 17.3327f, 11.0199f, 16.9422f)
                lineTo(15.2508f, 12.7113f)
                lineTo(15.255f, 12.7072f)
                curveTo(15.6497f, 12.3208f, 15.653f, 11.691f, 15.2625f, 11.3005f)
                lineTo(11.0199f, 7.0579f)
                close()
            }
        }.build()
        return chevronRight!!
    }

private var chevronRight: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ChevronRight,
                contentDescription = ""
            )
        }
    }
}