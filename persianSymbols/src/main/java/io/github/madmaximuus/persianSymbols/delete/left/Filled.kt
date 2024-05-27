package io.github.madmaximuus.persianSymbols.delete.left

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

val PersianSymbols.Filled.DeleteLeft: ImageVector
    get() {
        if (deleteLeft != null) {
            return deleteLeft!!
        }
        deleteLeft = Builder(
            name = "delete-left-filled",
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
                moveTo(17.6f, 4.0f)
                curveTo(20.03f, 4.0f, 22.0f, 5.97f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 18.0301f, 20.03f, 20.0f, 17.6f, 20.0f)
                horizontalLineTo(9.3777f)
                curveTo(8.9267f, 20.0f, 8.4996f, 19.7971f, 8.2148f, 19.4474f)
                lineTo(2.7896f, 12.7884f)
                curveTo(2.3322f, 12.227f, 2.3412f, 11.419f, 2.8109f, 10.8679f)
                lineTo(8.2158f, 4.5269f)
                curveTo(8.5008f, 4.1926f, 8.918f, 4.0f, 9.3574f, 4.0f)
                horizontalLineTo(17.6f)
                close()
                moveTo(12.2071f, 8.2929f)
                curveTo(11.8166f, 7.9024f, 11.1834f, 7.9024f, 10.7929f, 8.2929f)
                curveTo(10.4023f, 8.6834f, 10.4023f, 9.3166f, 10.7929f, 9.7071f)
                lineTo(13.0858f, 12.0f)
                lineTo(10.7929f, 14.2929f)
                curveTo(10.4023f, 14.6834f, 10.4023f, 15.3166f, 10.7929f, 15.7071f)
                curveTo(11.1834f, 16.0976f, 11.8166f, 16.0976f, 12.2071f, 15.7071f)
                lineTo(14.5f, 13.4142f)
                lineTo(16.7929f, 15.7071f)
                curveTo(17.1834f, 16.0976f, 17.8166f, 16.0976f, 18.2071f, 15.7071f)
                curveTo(18.5976f, 15.3166f, 18.5976f, 14.6834f, 18.2071f, 14.2929f)
                lineTo(15.9142f, 12.0f)
                lineTo(18.2071f, 9.7071f)
                curveTo(18.5976f, 9.3166f, 18.5976f, 8.6834f, 18.2071f, 8.2929f)
                curveTo(17.8166f, 7.9024f, 17.1834f, 7.9024f, 16.7929f, 8.2929f)
                lineTo(14.5f, 10.5858f)
                lineTo(12.2071f, 8.2929f)
                close()
            }
        }.build()
        return deleteLeft!!
    }

private var deleteLeft: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.DeleteLeft,
                contentDescription = ""
            )
        }
    }
}