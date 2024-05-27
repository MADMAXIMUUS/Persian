package io.github.madmaximuus.persianSymbols.backward.base

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

val PersianSymbols.Default.Backward: ImageVector
    get() {
        if (backward != null) {
            return backward!!
        }
        backward = Builder(
            name = "backward-default",
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
                moveTo(10.494f, 6.7114f)
                curveTo(11.4939f, 6.1197f, 12.7579f, 6.8404f, 12.7579f, 8.0023f)
                verticalLineTo(10.2476f)
                lineTo(18.7337f, 6.7114f)
                curveTo(19.7337f, 6.1197f, 20.9976f, 6.8404f, 20.9976f, 8.0023f)
                verticalLineTo(16.0003f)
                curveTo(20.9976f, 17.1621f, 19.7337f, 17.8829f, 18.7337f, 17.2912f)
                lineTo(12.7579f, 13.755f)
                verticalLineTo(16.0003f)
                curveTo(12.7579f, 17.1621f, 11.494f, 17.8829f, 10.494f, 17.2912f)
                lineTo(3.7361f, 13.2922f)
                curveTo(2.7546f, 12.7114f, 2.7546f, 11.2912f, 3.7361f, 10.7104f)
                lineTo(10.494f, 6.7114f)
                close()
                moveTo(10.7579f, 15.1234f)
                verticalLineTo(8.8792f)
                lineTo(5.4818f, 12.0013f)
                lineTo(10.7579f, 15.1234f)
                close()
                moveTo(18.9976f, 15.1234f)
                verticalLineTo(8.8792f)
                lineTo(13.7215f, 12.0013f)
                lineTo(18.9976f, 15.1234f)
                close()
            }
        }.build()
        return backward!!
    }

private var backward: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Backward,
                contentDescription = ""
            )
        }
    }
}