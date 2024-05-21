package io.github.madmaximuus.persianIcons.add.circle

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Filled.AddCircle: ImageVector
    get() {
        if (addCircle != null) {
            return addCircle!!
        }
        addCircle = ImageVector.Builder(
            name = "add-circle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.9999f, 22f)
                curveTo(17.5228f, 22f, 21.9999f, 17.5228f, 21.9999f, 12f)
                curveTo(21.9999f, 6.4771f, 17.5228f, 2f, 11.9999f, 2f)
                curveTo(6.4771f, 2f, 1.9999f, 6.4771f, 1.9999f, 12f)
                curveTo(1.9999f, 17.5228f, 6.4771f, 22f, 11.9999f, 22f)
                close()
                moveTo(12f, 7.00001f)
                curveTo(12.5523f, 7f, 13f, 7.4477f, 13f, 8f)
                verticalLineTo(10.9999f)
                horizontalLineTo(16f)
                curveTo(16.5523f, 10.9999f, 17f, 11.4476f, 17f, 11.9999f)
                curveTo(17f, 12.5522f, 16.5523f, 12.9999f, 16f, 12.9999f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                curveTo(13f, 16.5523f, 12.5523f, 17f, 12f, 17f)
                curveTo(11.4477f, 17f, 11f, 16.5523f, 11f, 16f)
                verticalLineTo(12.9999f)
                horizontalLineTo(7.99999f)
                curveTo(7.4477f, 12.9999f, 7f, 12.5522f, 7f, 11.9999f)
                curveTo(7f, 11.4476f, 7.4477f, 10.9999f, 8f, 10.9999f)
                horizontalLineTo(11f)
                verticalLineTo(8.00001f)
                curveTo(11f, 7.4477f, 11.4477f, 7f, 12f, 7f)
                close()
            }
        }.build()
        return addCircle!!
    }

private var addCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.AddCircle,
                contentDescription = ""
            )
        }
    }
}