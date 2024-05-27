package io.github.madmaximuus.persianSymbols.key

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Key: ImageVector
    get() {
        if (key != null) {
            return key!!
        }
        key = Builder(
            name = "key-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.9981f, 16.0128f)
                curveTo(4.7889f, 16.0128f, 2.998f, 14.222f, 2.998f, 12.0128f)
                curveTo(2.998f, 9.8037f, 4.7889f, 8.0128f, 6.9981f, 8.0128f)
                curveTo(8.4753f, 8.0128f, 9.7655f, 8.8136f, 10.4583f, 10.0049f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0128f)
                lineTo(19.0f, 16.0f)
                lineTo(17.0f, 14.0f)
                lineTo(15.0f, 16.0f)
                lineTo(13.0f, 14.0f)
                horizontalLineTo(10.4583f)
                curveTo(9.7655f, 15.1912f, 8.4753f, 16.0128f, 6.9981f, 16.0128f)
                close()
                moveTo(7.0f, 15.0f)
                curveTo(8.6568f, 15.0f, 10.0f, 13.6569f, 10.0f, 12.0f)
                curveTo(10.0f, 10.3431f, 8.6568f, 9.0f, 7.0f, 9.0f)
                curveTo(5.3432f, 9.0f, 4.0f, 10.3431f, 4.0f, 12.0f)
                curveTo(4.0f, 13.6569f, 5.3432f, 15.0f, 7.0f, 15.0f)
                close()
            }
        }.build()
        return key!!
    }

private var key: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Key,
                contentDescription = ""
            )
        }
    }
}