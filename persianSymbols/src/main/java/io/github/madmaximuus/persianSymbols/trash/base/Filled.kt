package io.github.madmaximuus.persianSymbols.trash.base

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 7.4999f)
                curveTo(9.5523f, 7.4999f, 10.0f, 7.9476f, 10.0f, 8.4999f)
                verticalLineTo(16.4999f)
                curveTo(10.0f, 17.0522f, 9.5523f, 17.4999f, 9.0f, 17.4999f)
                curveTo(8.4477f, 17.4999f, 8.0f, 17.0522f, 8.0f, 16.4999f)
                verticalLineTo(8.4999f)
                curveTo(8.0f, 7.9476f, 8.4477f, 7.4999f, 9.0f, 7.4999f)
                close()
                moveTo(12.0f, 7.4999f)
                curveTo(12.5523f, 7.4999f, 13.0f, 7.9476f, 13.0f, 8.4999f)
                verticalLineTo(16.4999f)
                curveTo(13.0f, 17.0522f, 12.5523f, 17.4999f, 12.0f, 17.4999f)
                curveTo(11.4477f, 17.4999f, 11.0f, 17.0522f, 11.0f, 16.4999f)
                verticalLineTo(8.4999f)
                curveTo(11.0f, 7.9476f, 11.4477f, 7.4999f, 12.0f, 7.4999f)
                close()
                moveTo(16.0f, 8.4999f)
                curveTo(16.0f, 7.9476f, 15.5523f, 7.4999f, 15.0f, 7.4999f)
                curveTo(14.4477f, 7.4999f, 14.0f, 7.9476f, 14.0f, 8.4999f)
                verticalLineTo(16.4999f)
                curveTo(14.0f, 17.0522f, 14.4477f, 17.4999f, 15.0f, 17.4999f)
                curveTo(15.5523f, 17.4999f, 16.0f, 17.0522f, 16.0f, 16.4999f)
                verticalLineTo(8.4999f)
                close()
                moveTo(6.9998f, 3.4999f)
                curveTo(6.9998f, 2.9476f, 7.4475f, 2.4999f, 7.9998f, 2.4999f)
                horizontalLineTo(15.9998f)
                curveTo(16.5521f, 2.4999f, 16.9998f, 2.9476f, 16.9998f, 3.4999f)
                lineTo(20.0f, 3.5001f)
                curveTo(20.5523f, 3.5001f, 21.0f, 3.9478f, 21.0f, 4.5001f)
                curveTo(21.0f, 5.0524f, 20.5523f, 5.5001f, 20.0f, 5.5001f)
                verticalLineTo(17.1001f)
                curveTo(20.0f, 19.5302f, 18.0301f, 21.5001f, 15.6f, 21.5001f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 21.5001f, 4.0f, 19.5302f, 4.0f, 17.1001f)
                verticalLineTo(5.5001f)
                curveTo(3.4477f, 5.5001f, 3.0f, 5.0524f, 3.0f, 4.5001f)
                curveTo(3.0f, 3.9478f, 3.4477f, 3.5001f, 4.0f, 3.5001f)
                lineTo(6.9998f, 3.4999f)
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