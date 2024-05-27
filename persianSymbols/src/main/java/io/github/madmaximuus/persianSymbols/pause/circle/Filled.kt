package io.github.madmaximuus.persianSymbols.pause.circle

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

val PersianSymbols.Filled.PauseCircle: ImageVector
    get() {
        if (pauseCircle != null) {
            return pauseCircle!!
        }
        pauseCircle = Builder(
            name = "pause-circle-filled",
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
                moveTo(11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 10.5523f, 8.0f, 10.0f, 8.0f)
                curveTo(9.4477f, 8.0f, 9.0f, 8.4477f, 9.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 15.5523f, 9.4477f, 16.0f, 10.0f, 16.0f)
                curveTo(10.5523f, 16.0f, 11.0f, 15.5523f, 11.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(15.0f, 8.4477f, 14.5523f, 8.0f, 14.0f, 8.0f)
                curveTo(13.4477f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(13.0f, 15.5523f, 13.4477f, 16.0f, 14.0f, 16.0f)
                curveTo(14.5523f, 16.0f, 15.0f, 15.5523f, 15.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }.build()
        return pauseCircle!!
    }

private var pauseCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.PauseCircle,
                contentDescription = ""
            )
        }
    }
}