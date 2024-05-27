package io.github.madmaximuus.persianSymbols.house

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.House: ImageVector
    get() {
        if (house != null) {
            return house!!
        }
        house = ImageVector.Builder(
            name = "home-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                lineTo(3.0f, 10.0007f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.5f)
                curveTo(5.0f, 19.8807f, 6.1193f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                curveTo(9.0f, 14.8954f, 9.8954f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1046f, 14.0f, 15.0f, 14.8954f, 15.0f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 21.0f, 19.0f, 19.8807f, 19.0f, 18.5f)
                verticalLineTo(10.0007f)
                horizontalLineTo(21.0f)
                lineTo(12.0f, 3.0f)
                close()
            }
        }.build()
        return house!!
    }

private var house: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.House,
                contentDescription = ""
            )
        }
    }
}