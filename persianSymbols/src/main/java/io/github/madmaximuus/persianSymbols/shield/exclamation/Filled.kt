package io.github.madmaximuus.persianSymbols.shield.exclamation

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

val PersianSymbols.Filled.ShieldExclamation: ImageVector
    get() {
        if (shieldExclamation != null) {
            return shieldExclamation!!
        }
        shieldExclamation = Builder(
            name = "shield-exclamation-filled",
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
                moveTo(12.3418f, 3.1244f)
                curveTo(12.1211f, 3.0441f, 11.8791f, 3.0441f, 11.6583f, 3.1244f)
                lineTo(3.6583f, 6.0335f)
                curveTo(3.2631f, 6.1772f, 2.997f, 6.5532f, 3.0153f, 6.9733f)
                curveTo(3.2602f, 12.6038f, 6.4463f, 17.7619f, 11.525f, 20.7318f)
                curveTo(11.8185f, 20.9034f, 12.1816f, 20.9034f, 12.4751f, 20.7318f)
                curveTo(17.5538f, 17.7619f, 20.7399f, 12.6038f, 20.9848f, 6.9733f)
                curveTo(21.0031f, 6.5532f, 20.737f, 6.1772f, 20.3418f, 6.0335f)
                lineTo(12.3418f, 3.1244f)
                close()
                moveTo(11.9999f, 7.0f)
                curveTo(12.5522f, 7.0f, 12.9999f, 7.4477f, 12.9999f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.9999f, 13.5523f, 12.5522f, 14.0f, 11.9999f, 14.0f)
                curveTo(11.4477f, 14.0f, 10.9999f, 13.5523f, 10.9999f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(10.9999f, 7.4477f, 11.4477f, 7.0f, 11.9999f, 7.0f)
                close()
                moveTo(12.9999f, 16.0f)
                curveTo(12.9999f, 16.5523f, 12.5522f, 17.0f, 11.9999f, 17.0f)
                curveTo(11.4477f, 17.0f, 10.9999f, 16.5523f, 10.9999f, 16.0f)
                curveTo(10.9999f, 15.4477f, 11.4477f, 15.0f, 11.9999f, 15.0f)
                curveTo(12.5522f, 15.0f, 12.9999f, 15.4477f, 12.9999f, 16.0f)
                close()
            }
        }.build()
        return shieldExclamation!!
    }

private var shieldExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ShieldExclamation,
                contentDescription = ""
            )
        }
    }
}