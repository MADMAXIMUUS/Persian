package io.github.madmaximuus.persianIcons.xmark.circle

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

public val PersianSymbols.Filled.XMarkCircle: ImageVector
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 6.4771f, 17.5228f, 2f, 12f, 2f)
                curveTo(6.4771f, 2f, 2f, 6.4771f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.4771f, 22f, 12f, 22f)
                close()
                moveTo(9.70711f, 8.29289f)
                curveTo(9.3166f, 7.9024f, 8.6834f, 7.9024f, 8.2929f, 8.2929f)
                curveTo(7.9024f, 8.6834f, 7.9024f, 9.3166f, 8.2929f, 9.7071f)
                lineTo(10.5858f, 12f)
                lineTo(8.29289f, 14.2929f)
                curveTo(7.9024f, 14.6834f, 7.9024f, 15.3166f, 8.2929f, 15.7071f)
                curveTo(8.6834f, 16.0976f, 9.3166f, 16.0976f, 9.7071f, 15.7071f)
                lineTo(12f, 13.4142f)
                lineTo(14.2929f, 15.7071f)
                curveTo(14.6834f, 16.0976f, 15.3166f, 16.0976f, 15.7071f, 15.7071f)
                curveTo(16.0976f, 15.3166f, 16.0976f, 14.6834f, 15.7071f, 14.2929f)
                lineTo(13.4142f, 12f)
                lineTo(15.7071f, 9.70711f)
                curveTo(16.0976f, 9.3166f, 16.0976f, 8.6834f, 15.7071f, 8.2929f)
                curveTo(15.3166f, 7.9024f, 14.6834f, 7.9024f, 14.2929f, 8.2929f)
                lineTo(12f, 10.5858f)
                lineTo(9.70711f, 8.29289f)
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