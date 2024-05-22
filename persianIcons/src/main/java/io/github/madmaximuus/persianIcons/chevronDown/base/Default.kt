package io.github.madmaximuus.persianIcons.chevronDown.base

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

val PersianSymbols.Default.ChevronDown: ImageVector
    get() {
        if (chevronDown != null) {
            return chevronDown!!
        }
        chevronDown = ImageVector.Builder(
            name = "chevron-down-default",
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16.9422f, 10.5932f)
                curveTo(17.3327f, 10.2027f, 17.3361f, 9.5662f, 16.9497f, 9.1715f)
                curveTo(16.5634f, 8.7769f, 15.9336f, 8.7735f, 15.5431f, 9.1641f)
                lineTo(12f, 12.7072f)
                lineTo(8.4569f, 9.16411f)
                curveTo(8.0664f, 8.7736f, 7.4366f, 8.7769f, 7.0503f, 9.1716f)
                curveTo(6.6639f, 9.5663f, 6.6673f, 10.2028f, 7.0578f, 10.5933f)
                lineTo(11.2887f, 14.8242f)
                lineTo(11.2929f, 14.8284f)
                curveTo(11.6792f, 15.2231f, 12.309f, 15.2264f, 12.6995f, 14.8359f)
                lineTo(16.9422f, 10.5932f)
                close()
            }
        }.build()
        return chevronDown!!
    }

private var chevronDown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ChevronDown,
                contentDescription = ""
            )
        }
    }
}