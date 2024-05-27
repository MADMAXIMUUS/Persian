package io.github.madmaximuus.persianSymbols.calendar.base

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

val PersianSymbols.Default.Calendar: ImageVector
    get() {
        if (calendar != null) {
            return calendar!!
        }
        calendar = Builder(
            name = "calendar-default",
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
                moveTo(8.0f, 2.0f)
                curveTo(8.5523f, 2.0f, 9.0f, 2.4477f, 9.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 2.4477f, 15.4477f, 2.0f, 16.0f, 2.0f)
                curveTo(16.5523f, 2.0f, 17.0f, 2.4477f, 17.0f, 3.0f)
                verticalLineTo(3.0275f)
                curveTo(19.25f, 3.2762f, 21.0f, 5.1837f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 18.9853f, 18.9853f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0147f, 21.0f, 3.0f, 18.9853f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 5.1837f, 4.75f, 3.2762f, 7.0f, 3.0275f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.4477f, 7.4477f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(7.5f, 5.0f)
                curveTo(6.2905f, 5.0f, 5.2816f, 5.8589f, 5.05f, 7.0f)
                horizontalLineTo(18.95f)
                curveTo(18.7184f, 5.8589f, 17.7095f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 17.8807f, 17.8807f, 19.0f, 16.5f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 19.0f, 5.0f, 17.8807f, 5.0f, 16.5f)
                verticalLineTo(9.0f)
                close()
            }
        }.build()
        return calendar!!
    }

private var calendar: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Calendar,
                contentDescription = ""
            )
        }
    }
}