package io.github.madmaximuus.persianSymbols.check.box

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

val PersianSymbols.Filled.CheckBox: ImageVector
    get() {
        if (checkBox != null) {
            return checkBox!!
        }
        checkBox = ImageVector.Builder(
            name = "check-box-filled",
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
                moveTo(7.4f, 3.0f)
                curveTo(4.97f, 3.0f, 3.0f, 4.97f, 3.0f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3.0f, 19.0301f, 4.97f, 21.0f, 7.4f, 21.0f)
                horizontalLineTo(16.6f)
                curveTo(19.0301f, 21.0f, 21.0f, 19.0301f, 21.0f, 16.6f)
                verticalLineTo(7.4f)
                curveTo(21.0f, 4.97f, 19.0301f, 3.0f, 16.6f, 3.0f)
                horizontalLineTo(7.4f)
                close()
                moveTo(17.3033f, 8.4644f)
                curveTo(17.6938f, 8.8549f, 17.6938f, 9.4881f, 17.3033f, 9.8786f)
                lineTo(11.6464f, 15.5354f)
                curveTo(11.4374f, 15.7445f, 11.1587f, 15.8417f, 10.885f, 15.8269f)
                curveTo(10.6106f, 15.8423f, 10.331f, 15.7452f, 10.1213f, 15.5356f)
                lineTo(7.2929f, 12.7071f)
                curveTo(6.9024f, 12.3166f, 6.9024f, 11.6834f, 7.2929f, 11.2929f)
                curveTo(7.6834f, 10.9024f, 8.3166f, 10.9024f, 8.7071f, 11.2929f)
                lineTo(10.8838f, 13.4696f)
                lineTo(15.8891f, 8.4644f)
                curveTo(16.2796f, 8.0738f, 16.9128f, 8.0738f, 17.3033f, 8.4644f)
                close()
            }
        }.build()
        return checkBox!!
    }

private var checkBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.CheckBox,
                contentDescription = ""
            )
        }
    }
}