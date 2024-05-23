package io.github.madmaximuus.persianIcons.gear

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

val PersianSymbols.Default.Gear: ImageVector
    get() {
        if (gear != null) {
            return gear!!
        }
        gear = ImageVector.Builder(
            name = "gear-default",
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
                moveTo(12f, 7.99988f)
                curveTo(9.7909f, 7.9999f, 8f, 9.7907f, 8f, 11.9999f)
                curveTo(8f, 14.209f, 9.7909f, 15.9999f, 12f, 15.9999f)
                curveTo(14.2092f, 15.9999f, 16f, 14.209f, 16f, 11.9999f)
                curveTo(16f, 9.7907f, 14.2092f, 7.9999f, 12f, 7.9999f)
                close()
                moveTo(10f, 11.9999f)
                curveTo(10f, 10.8953f, 10.8955f, 9.9999f, 12f, 9.9999f)
                curveTo(13.1046f, 9.9999f, 14f, 10.8953f, 14f, 11.9999f)
                curveTo(14f, 13.1044f, 13.1046f, 13.9999f, 12f, 13.9999f)
                curveTo(10.8955f, 13.9999f, 10f, 13.1044f, 10f, 11.9999f)
                close()
            }
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
                moveTo(10.5f, 1.99988f)
                curveTo(9.3955f, 1.9999f, 8.5f, 2.8953f, 8.5f, 3.9999f)
                verticalLineTo(4.80436f)
                curveTo(8.1587f, 4.9707f, 7.8311f, 5.1604f, 7.5194f, 5.3715f)
                lineTo(6.82181f, 4.96881f)
                curveTo(5.8652f, 4.4165f, 4.642f, 4.7443f, 4.0898f, 5.7009f)
                lineTo(2.58976f, 8.29894f)
                curveTo(2.0375f, 9.2555f, 2.3652f, 10.4787f, 3.3218f, 11.031f)
                lineTo(4.01977f, 11.434f)
                curveTo(4.0067f, 11.621f, 4f, 11.8097f, 4f, 11.9999f)
                curveTo(4f, 12.19f, 4.0067f, 12.3787f, 4.0198f, 12.5658f)
                lineTo(3.32357f, 12.9678f)
                curveTo(2.3693f, 13.5187f, 2.0362f, 14.742f, 2.5898f, 15.7008f)
                lineTo(4.08976f, 18.2989f)
                curveTo(4.6421f, 19.2555f, 5.8652f, 19.5833f, 6.8218f, 19.031f)
                lineTo(7.51937f, 18.6282f)
                curveTo(7.8312f, 18.8393f, 8.1587f, 19.0291f, 8.5f, 19.1954f)
                verticalLineTo(19.9999f)
                curveTo(8.5f, 21.1044f, 9.3955f, 21.9999f, 10.5f, 21.9999f)
                horizontalLineTo(13.5f)
                curveTo(14.6046f, 21.9999f, 15.5f, 21.1044f, 15.5f, 19.9999f)
                verticalLineTo(19.1954f)
                curveTo(15.8413f, 19.0291f, 16.1689f, 18.8394f, 16.4806f, 18.6282f)
                lineTo(17.1782f, 19.031f)
                curveTo(18.1348f, 19.5833f, 19.358f, 19.2555f, 19.9103f, 18.2989f)
                lineTo(21.4103f, 15.7009f)
                curveTo(21.9625f, 14.7443f, 21.6348f, 13.5211f, 20.6782f, 12.9688f)
                lineTo(19.9803f, 12.5659f)
                curveTo(19.9934f, 12.3788f, 20f, 12.19f, 20f, 11.9999f)
                curveTo(20f, 11.8097f, 19.9934f, 11.621f, 19.9803f, 11.4339f)
                lineTo(20.6782f, 11.031f)
                curveTo(21.6348f, 10.4787f, 21.9626f, 9.2555f, 21.4103f, 8.2989f)
                lineTo(19.9103f, 5.70084f)
                curveTo(19.3567f, 4.742f, 18.1308f, 4.4188f, 17.1765f, 4.9698f)
                lineTo(16.4807f, 5.37153f)
                curveTo(16.1689f, 5.1604f, 15.8413f, 4.9706f, 15.5f, 4.8044f)
                verticalLineTo(3.99988f)
                curveTo(15.5f, 2.8953f, 14.6046f, 1.9999f, 13.5f, 1.9999f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.5f, 3.99988f)
                lineTo(13.5f, 3.99988f)
                verticalLineTo(6.14768f)
                lineTo(14.1428f, 6.39352f)
                curveTo(14.7404f, 6.6221f, 15.2927f, 6.9438f, 15.7818f, 7.3415f)
                lineTo(16.3162f, 7.77589f)
                lineTo(18.1765f, 6.70185f)
                lineTo(18.1787f, 6.70171f)
                lineTo(19.6782f, 9.29892f)
                lineTo(17.8181f, 10.3729f)
                lineTo(17.9257f, 11.0518f)
                curveTo(17.9745f, 11.36f, 18f, 11.6766f, 18f, 11.9999f)
                curveTo(18f, 12.3231f, 17.9745f, 12.6397f, 17.9257f, 12.948f)
                lineTo(17.818f, 13.6269f)
                lineTo(19.6782f, 14.7009f)
                lineTo(18.1782f, 17.2989f)
                lineTo(16.3162f, 16.2239f)
                lineTo(15.7818f, 16.6583f)
                curveTo(15.2927f, 17.0559f, 14.7404f, 17.3777f, 14.1428f, 17.6062f)
                lineTo(13.5f, 17.8521f)
                verticalLineTo(19.9999f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.8521f)
                lineTo(9.85725f, 17.6062f)
                curveTo(9.2597f, 17.3777f, 8.7073f, 17.0559f, 8.2182f, 16.6583f)
                lineTo(7.68386f, 16.2239f)
                lineTo(5.82182f, 17.2989f)
                lineTo(4.32232f, 14.7017f)
                lineTo(4.32284f, 14.7003f)
                lineTo(6.18198f, 13.6269f)
                lineTo(6.07435f, 12.948f)
                curveTo(6.0255f, 12.6397f, 6f, 12.3231f, 6f, 11.9999f)
                curveTo(6f, 11.6766f, 6.0255f, 11.36f, 6.0743f, 11.0518f)
                lineTo(6.18197f, 10.3729f)
                lineTo(4.32181f, 9.29894f)
                lineTo(5.82181f, 6.70086f)
                lineTo(7.68384f, 7.77591f)
                lineTo(8.21823f, 7.34147f)
                curveTo(8.7073f, 6.9438f, 9.2596f, 6.6221f, 9.8573f, 6.3935f)
                lineTo(10.5f, 6.14768f)
                verticalLineTo(3.99988f)
                close()
            }
        }.build()
        return gear!!
    }

private var gear: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Gear,
                contentDescription = ""
            )
        }
    }
}