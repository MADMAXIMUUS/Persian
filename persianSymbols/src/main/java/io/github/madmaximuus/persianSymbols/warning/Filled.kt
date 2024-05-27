package io.github.madmaximuus.persianSymbols.warning

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

val PersianSymbols.Filled.Warning: ImageVector
    get() {
        if (warning != null) {
            return warning!!
        }
        warning = Builder(
            name = "warning-filled",
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
                moveTo(4.427f, 21.9999f)
                horizontalLineTo(19.5729f)
                curveTo(20.688f, 21.9999f, 21.4133f, 20.8264f, 20.9146f, 19.8291f)
                lineTo(13.3416f, 4.6832f)
                curveTo(12.7888f, 3.5776f, 11.2111f, 3.5776f, 10.6584f, 4.6832f)
                lineTo(3.0854f, 19.8291f)
                curveTo(2.5867f, 20.8264f, 3.312f, 21.9999f, 4.427f, 21.9999f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 10.4477f, 13.0f, 10.9999f)
                verticalLineTo(14.9999f)
                curveTo(13.0f, 15.5522f, 12.5523f, 15.9999f, 12.0f, 15.9999f)
                curveTo(11.4477f, 15.9999f, 11.0f, 15.5522f, 11.0f, 14.9999f)
                verticalLineTo(10.9999f)
                curveTo(11.0f, 10.4477f, 11.4477f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(11.0f, 17.9999f)
                curveTo(11.0f, 18.5522f, 11.4477f, 18.9999f, 12.0f, 18.9999f)
                curveTo(12.5523f, 18.9999f, 13.0f, 18.5522f, 13.0f, 17.9999f)
                curveTo(13.0f, 17.4477f, 12.5523f, 16.9999f, 12.0f, 16.9999f)
                curveTo(11.4477f, 16.9999f, 11.0f, 17.4477f, 11.0f, 17.9999f)
                close()
            }
        }.build()
        return warning!!
    }

private var warning: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Warning,
                contentDescription = ""
            )
        }
    }
}