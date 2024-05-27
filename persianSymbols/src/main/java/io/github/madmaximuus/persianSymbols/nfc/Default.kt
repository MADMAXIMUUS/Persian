package io.github.madmaximuus.persianSymbols.nfc

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Nfc: ImageVector
    get() {
        if (nfc != null) {
            return nfc!!
        }
        nfc = Builder(
            name = "nfc-default",
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
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 7.0f)
                curveTo(7.8954f, 7.0f, 7.0f, 7.8954f, 7.0f, 9.0f)
                verticalLineTo(14.25f)
                curveTo(7.0f, 15.7688f, 8.2312f, 17.0f, 9.75f, 17.0f)
                horizontalLineTo(14.25f)
                curveTo(15.7688f, 17.0f, 17.0f, 15.7688f, 17.0f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(17.0f, 8.2312f, 15.7688f, 7.0f, 14.25f, 7.0f)
                horizontalLineTo(12.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                verticalLineTo(10.2676f)
                curveTo(10.4022f, 10.6134f, 10.0f, 11.2597f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 11.2597f, 13.5978f, 10.6134f, 13.0f, 10.2676f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 9.0f, 15.0f, 9.3358f, 15.0f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(15.0f, 14.6642f, 14.6642f, 15.0f, 14.25f, 15.0f)
                horizontalLineTo(9.75f)
                curveTo(9.3358f, 15.0f, 9.0f, 14.6642f, 9.0f, 14.25f)
                verticalLineTo(9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 8.5523f, 10.0f, 8.0f)
                curveTo(10.0f, 7.4477f, 9.5523f, 7.0f, 9.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5f, 3.0f)
                curveTo(5.0147f, 3.0f, 3.0f, 5.0147f, 3.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 18.9853f, 5.0147f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 21.0f, 21.0f, 18.9853f, 21.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.0f, 5.0147f, 18.9853f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.0f, 7.5f)
                curveTo(5.0f, 6.1193f, 6.1193f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 5.0f, 19.0f, 6.1193f, 19.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 17.8807f, 17.8807f, 19.0f, 16.5f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 19.0f, 5.0f, 17.8807f, 5.0f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()
        return nfc!!
    }

private var nfc: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Nfc,
                contentDescription = ""
            )
        }
    }
}