package io.github.madmaximuus.persianSymbols.stop.circle

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

val PersianSymbols.Filled.StopCircle: ImageVector
    get() {
        if (stopCircle != null) {
            return stopCircle!!
        }
        stopCircle = Builder(
            name = "stop-circle-filled",
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
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(10.0f, 8.0f)
                curveTo(8.8954f, 8.0f, 8.0f, 8.8954f, 8.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(8.0f, 15.1046f, 8.8954f, 16.0f, 10.0f, 16.0f)
                horizontalLineTo(14.0f)
                curveTo(15.1046f, 16.0f, 16.0f, 15.1046f, 16.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(16.0f, 8.8954f, 15.1046f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }.build()
        return stopCircle!!
    }

private var stopCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.StopCircle,
                contentDescription = ""
            )
        }
    }
}