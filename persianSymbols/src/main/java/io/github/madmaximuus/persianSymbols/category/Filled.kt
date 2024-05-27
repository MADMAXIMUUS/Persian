package io.github.madmaximuus.persianSymbols.category

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Category: ImageVector
    get() {
        if (category != null) {
            return category!!
        }
        category = Builder(
            name = "category-filled",
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
                pathFillType = NonZero
            ) {
                moveTo(8.0826f, 11.0f)
                horizontalLineTo(15.9175f)
                curveTo(16.3887f, 11.0f, 16.676f, 10.4817f, 16.4263f, 10.082f)
                lineTo(12.5088f, 3.8141f)
                curveTo(12.2738f, 3.4381f, 11.7262f, 3.4381f, 11.4912f, 3.8141f)
                lineTo(7.5738f, 10.082f)
                curveTo(7.324f, 10.4817f, 7.6113f, 11.0f, 8.0826f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.5f, 14.8f)
                curveTo(3.5f, 13.2536f, 4.7536f, 12.0f, 6.3f, 12.0f)
                horizontalLineTo(8.7f)
                curveTo(10.2464f, 12.0f, 11.5f, 13.2536f, 11.5f, 14.8f)
                verticalLineTo(17.2f)
                curveTo(11.5f, 18.7464f, 10.2464f, 20.0f, 8.7f, 20.0f)
                horizontalLineTo(6.3f)
                curveTo(4.7536f, 20.0f, 3.5f, 18.7464f, 3.5f, 17.2f)
                verticalLineTo(14.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.5f, 16.0f)
                curveTo(20.5f, 18.2092f, 18.7091f, 20.0f, 16.5f, 20.0f)
                curveTo(14.2909f, 20.0f, 12.5f, 18.2092f, 12.5f, 16.0f)
                curveTo(12.5f, 13.7909f, 14.2909f, 12.0f, 16.5f, 12.0f)
                curveTo(18.7091f, 12.0f, 20.5f, 13.7909f, 20.5f, 16.0f)
                close()
            }
        }.build()
        return category!!
    }

private var category: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Category,
                contentDescription = ""
            )
        }
    }
}