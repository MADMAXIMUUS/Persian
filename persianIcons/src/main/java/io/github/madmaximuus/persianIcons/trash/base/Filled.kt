package io.github.madmaximuus.persianIcons.trash.base

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

val PersianSymbols.Filled.Trash: ImageVector
    get() {
        if (trash != null) {
            return trash!!
        }
        trash = ImageVector.Builder(
            name = "trash-filled",
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
                moveTo(8.99999f, 7.49994f)
                curveTo(9.5523f, 7.4999f, 10f, 7.9477f, 10f, 8.4999f)
                verticalLineTo(16.4999f)
                curveTo(10f, 17.0522f, 9.5523f, 17.4999f, 9f, 17.4999f)
                curveTo(8.4477f, 17.4999f, 8f, 17.0522f, 8f, 16.4999f)
                verticalLineTo(8.49994f)
                curveTo(8f, 7.9477f, 8.4477f, 7.4999f, 9f, 7.4999f)
                close()
                moveTo(12f, 7.49994f)
                curveTo(12.5523f, 7.4999f, 13f, 7.9477f, 13f, 8.4999f)
                verticalLineTo(16.4999f)
                curveTo(13f, 17.0522f, 12.5523f, 17.4999f, 12f, 17.4999f)
                curveTo(11.4477f, 17.4999f, 11f, 17.0522f, 11f, 16.4999f)
                verticalLineTo(8.49994f)
                curveTo(11f, 7.9477f, 11.4477f, 7.4999f, 12f, 7.4999f)
                close()
                moveTo(16f, 8.49994f)
                curveTo(16f, 7.9477f, 15.5523f, 7.4999f, 15f, 7.4999f)
                curveTo(14.4477f, 7.4999f, 14f, 7.9477f, 14f, 8.4999f)
                verticalLineTo(16.4999f)
                curveTo(14f, 17.0522f, 14.4477f, 17.4999f, 15f, 17.4999f)
                curveTo(15.5523f, 17.4999f, 16f, 17.0522f, 16f, 16.4999f)
                verticalLineTo(8.49994f)
                close()
                moveTo(6.99983f, 3.49988f)
                curveTo(6.9998f, 2.9476f, 7.4475f, 2.4999f, 7.9998f, 2.4999f)
                horizontalLineTo(15.9998f)
                curveTo(16.5521f, 2.4999f, 16.9998f, 2.9476f, 16.9998f, 3.4999f)
                lineTo(20f, 3.50012f)
                curveTo(20.5523f, 3.5001f, 21f, 3.9478f, 21f, 4.5001f)
                curveTo(21f, 5.0524f, 20.5523f, 5.5001f, 20f, 5.5001f)
                verticalLineTo(17.1001f)
                curveTo(20f, 19.5302f, 18.0301f, 21.5001f, 15.6f, 21.5001f)
                horizontalLineTo(8.4f)
                curveTo(5.9699f, 21.5001f, 4f, 19.5302f, 4f, 17.1001f)
                verticalLineTo(5.50012f)
                curveTo(3.4477f, 5.5001f, 3f, 5.0524f, 3f, 4.5001f)
                curveTo(3f, 3.9478f, 3.4477f, 3.5001f, 4f, 3.5001f)
                lineTo(6.99983f, 3.49988f)
                close()
            }
        }.build()
        return trash!!
    }

private var trash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Trash,
                contentDescription = ""
            )
        }
    }
}