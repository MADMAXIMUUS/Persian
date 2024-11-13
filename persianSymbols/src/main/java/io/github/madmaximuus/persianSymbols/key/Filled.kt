package io.github.madmaximuus.persianSymbols.key

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Key: ImageVector
    get() {
        if (key != null) {
            return key!!
        }
        key = Builder(
            name = "key-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 14.761f, 4.238f, 17f, 7f, 17f)
                curveTo(8.848f, 17f, 10.463f, 15.996f, 11.328f, 14.504f)
                horizontalLineTo(13.114f)
                lineTo(14.604f, 16.166f)
                curveTo(15.003f, 16.611f, 15.7f, 16.609f, 16.096f, 16.163f)
                lineTo(17.569f, 14.504f)
                lineTo(18.737f, 15.831f)
                curveTo(19.218f, 16.378f, 20.103f, 16.244f, 20.4f, 15.579f)
                lineTo(22.001f, 12f)
                verticalLineTo(9.496f)
                horizontalLineTo(11.328f)
                curveTo(10.463f, 8.004f, 8.848f, 7f, 7f, 7f)
                curveTo(4.238f, 7f, 2f, 9.239f, 2f, 12f)
                close()
                moveTo(7.004f, 13.75f)
                curveTo(7.97f, 13.75f, 8.754f, 12.967f, 8.754f, 12f)
                curveTo(8.754f, 11.033f, 7.97f, 10.25f, 7.004f, 10.25f)
                curveTo(6.037f, 10.25f, 5.254f, 11.033f, 5.254f, 12f)
                curveTo(5.254f, 12.967f, 6.037f, 13.75f, 7.004f, 13.75f)
                close()
            }
        }.build()
        return key!!
    }

private var key: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Key,
                contentDescription = ""
            )
        }
    }
}