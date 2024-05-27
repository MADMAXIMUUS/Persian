package io.github.madmaximuus.persianSymbols.xmark.circle

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.XMarkCircle: ImageVector
    get() {
        if (xMarkCircle != null) {
            return xMarkCircle!!
        }
        xMarkCircle = ImageVector.Builder(
            name = "xMark-circle-filled",
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
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.7071f, 8.2929f)
                curveTo(9.3166f, 7.9024f, 8.6834f, 7.9024f, 8.2929f, 8.2929f)
                curveTo(7.9024f, 8.6834f, 7.9024f, 9.3166f, 8.2929f, 9.7071f)
                lineTo(10.5858f, 12.0f)
                lineTo(8.2929f, 14.2929f)
                curveTo(7.9024f, 14.6834f, 7.9024f, 15.3166f, 8.2929f, 15.7071f)
                curveTo(8.6834f, 16.0976f, 9.3166f, 16.0976f, 9.7071f, 15.7071f)
                lineTo(12.0f, 13.4142f)
                lineTo(14.2929f, 15.7071f)
                curveTo(14.6834f, 16.0976f, 15.3166f, 16.0976f, 15.7071f, 15.7071f)
                curveTo(16.0976f, 15.3166f, 16.0976f, 14.6834f, 15.7071f, 14.2929f)
                lineTo(13.4142f, 12.0f)
                lineTo(15.7071f, 9.7071f)
                curveTo(16.0976f, 9.3166f, 16.0976f, 8.6834f, 15.7071f, 8.2929f)
                curveTo(15.3166f, 7.9024f, 14.6834f, 7.9024f, 14.2929f, 8.2929f)
                lineTo(12.0f, 10.5858f)
                lineTo(9.7071f, 8.2929f)
                close()
            }
        }.build()
        return xMarkCircle!!
    }

private var xMarkCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.XMarkCircle,
                contentDescription = ""
            )
        }
    }
}