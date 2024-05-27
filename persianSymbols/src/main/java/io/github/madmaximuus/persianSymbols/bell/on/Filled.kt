package io.github.madmaximuus.persianSymbols.bell.on

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

val PersianSymbols.Filled.BellOn: ImageVector
    get() {
        if (bellOn != null) {
            return bellOn!!
        }
        bellOn = Builder(
            name = "bell-on-filled",
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
                moveTo(8.3945f, 2.0528f)
                curveTo(8.6414f, 2.5467f, 8.4412f, 3.1474f, 7.9472f, 3.3944f)
                curveTo(7.1452f, 3.7954f, 5.3451f, 4.95f, 4.9939f, 8.1104f)
                curveTo(4.9329f, 8.6593f, 4.4385f, 9.0548f, 3.8896f, 8.9939f)
                curveTo(3.3407f, 8.9329f, 2.9451f, 8.4384f, 3.0061f, 7.8895f)
                curveTo(3.455f, 3.8499f, 5.8549f, 2.2045f, 7.0528f, 1.6056f)
                curveTo(7.5468f, 1.3586f, 8.1475f, 1.5588f, 8.3945f, 2.0528f)
                close()
                moveTo(15.6056f, 2.0528f)
                curveTo(15.3586f, 2.5467f, 15.5588f, 3.1474f, 16.0528f, 3.3944f)
                curveTo(16.8548f, 3.7954f, 18.655f, 4.95f, 19.0061f, 8.1104f)
                curveTo(19.0671f, 8.6593f, 19.5615f, 9.0548f, 20.1104f, 8.9939f)
                curveTo(20.6593f, 8.9329f, 21.0549f, 8.4384f, 20.9939f, 7.8895f)
                curveTo(20.545f, 3.8499f, 18.1452f, 2.2045f, 16.9472f, 1.6056f)
                curveTo(16.4532f, 1.3586f, 15.8526f, 1.5588f, 15.6056f, 2.0528f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(12.5523f, 2.0f, 13.0f, 2.4477f, 13.0f, 3.0f)
                verticalLineTo(3.0205f)
                curveTo(15.8377f, 3.4965f, 18.0f, 5.9645f, 18.0f, 8.9375f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 17.0f, 20.0f, 17.4477f, 20.0f, 18.0f)
                curveTo(20.0f, 18.5523f, 19.5523f, 19.0f, 19.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                horizontalLineTo(17.0f)
                horizontalLineTo(7.0f)
                horizontalLineTo(6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 19.0f, 4.0f, 18.5523f, 4.0f, 18.0f)
                curveTo(4.0f, 17.4477f, 4.4477f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.9375f)
                curveTo(6.0f, 5.9645f, 8.1623f, 3.4965f, 11.0f, 3.0205f)
                verticalLineTo(3.0f)
                curveTo(11.0f, 2.4477f, 11.4477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.0f, 17.0f)
                verticalLineTo(8.9375f)
                curveTo(16.0f, 6.97f, 14.5795f, 5.3343f, 12.7082f, 5.0f)
                horizontalLineTo(11.2918f)
                curveTo(9.4205f, 5.3343f, 8.0f, 6.97f, 8.0f, 8.9375f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(11.1993f, 22.0f, 10.4718f, 21.6863f, 9.9338f, 21.1751f)
                curveTo(9.4335f, 20.6997f, 9.8946f, 20.0f, 10.5848f, 20.0f)
                horizontalLineTo(13.4152f)
                curveTo(14.1054f, 20.0f, 14.5665f, 20.6997f, 14.0662f, 21.1751f)
                curveTo(13.5282f, 21.6863f, 12.8007f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }.build()
        return bellOn!!
    }

private var bellOn: ImageVector? = null


@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.BellOn,
                contentDescription = ""
            )
        }
    }
}