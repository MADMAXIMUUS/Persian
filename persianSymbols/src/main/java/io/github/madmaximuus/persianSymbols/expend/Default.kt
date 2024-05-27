package io.github.madmaximuus.persianSymbols.expend

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
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Expend: ImageVector
    get() {
        if (expend != null) {
            return expend!!
        }
        expend = Builder(
            name = "expend-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0001f, 3.9999f)
                horizontalLineTo(4.999f)
                curveTo(4.4467f, 3.9999f, 3.999f, 4.4476f, 3.999f, 4.9999f)
                verticalLineTo(8.0f)
                moveTo(16.0001f, 3.9999f)
                horizontalLineTo(18.999f)
                curveTo(19.5513f, 3.9999f, 19.999f, 4.4476f, 19.999f, 4.9999f)
                verticalLineTo(8.0f)
                moveTo(3.999f, 16.0f)
                verticalLineTo(18.9999f)
                curveTo(3.999f, 19.5522f, 4.4467f, 19.9999f, 4.999f, 19.9999f)
                horizontalLineTo(8.0001f)
                moveTo(16.0001f, 19.9999f)
                horizontalLineTo(18.999f)
                curveTo(19.5513f, 19.9999f, 19.999f, 19.5522f, 19.999f, 18.9999f)
                verticalLineTo(16.0f)
            }
        }.build()
        return expend!!
    }

private var expend: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Expend,
                contentDescription = ""
            )
        }
    }
}