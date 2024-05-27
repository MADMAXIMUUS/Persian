package io.github.madmaximuus.persianSymbols.info.circle

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

val PersianSymbols.Filled.InfoCircle: ImageVector
    get() {
        if (infoCircle != null) {
            return infoCircle!!
        }
        infoCircle = Builder(
            name = "info-circle-filled",
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
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 10.4477f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 10.4477f, 11.0f, 11.0f)
                verticalLineTo(16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 7.4477f, 12.5523f, 7.0f, 12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                curveTo(11.0f, 8.5523f, 11.4477f, 9.0f, 12.0f, 9.0f)
                curveTo(12.5523f, 9.0f, 13.0f, 8.5523f, 13.0f, 8.0f)
                close()
            }
        }.build()
        return infoCircle!!
    }

private var infoCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.InfoCircle,
                contentDescription = ""
            )
        }
    }
}