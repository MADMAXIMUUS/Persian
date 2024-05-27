package io.github.madmaximuus.persianSymbols.gear

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

public val PersianSymbols.Filled.Gear: ImageVector
    get() {
        if (gear != null) {
            return gear!!
        }
        gear = ImageVector.Builder(
            name = "gear-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.5f, 3.9999f)
                curveTo(9.5f, 3.4476f, 9.9477f, 2.9999f, 10.5f, 2.9999f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 2.9999f, 14.5f, 3.4476f, 14.5f, 3.9999f)
                verticalLineTo(5.4595f)
                curveTo(15.1981f, 5.7265f, 15.8425f, 6.1021f, 16.4126f, 6.5655f)
                lineTo(17.6764f, 5.8358f)
                curveTo(18.1547f, 5.5597f, 18.7681f, 5.7226f, 19.0442f, 6.2009f)
                lineTo(20.5442f, 8.7989f)
                curveTo(20.8204f, 9.2772f, 20.6565f, 9.8888f, 20.1782f, 10.165f)
                lineTo(18.9133f, 10.8952f)
                curveTo(18.9704f, 11.2551f, 19.0f, 11.624f, 19.0f, 11.9999f)
                curveTo(19.0f, 12.3758f, 18.9704f, 12.7447f, 18.9133f, 13.1046f)
                lineTo(20.1782f, 13.8348f)
                curveTo(20.6565f, 14.111f, 20.8204f, 14.7226f, 20.5442f, 15.2009f)
                lineTo(19.0442f, 17.7989f)
                curveTo(18.7681f, 18.2772f, 18.1565f, 18.4411f, 17.6782f, 18.165f)
                lineTo(16.4126f, 17.4343f)
                curveTo(15.8425f, 17.8977f, 15.1981f, 18.2733f, 14.5f, 18.5402f)
                verticalLineTo(19.9999f)
                curveTo(14.5f, 20.5522f, 14.0523f, 20.9999f, 13.5f, 20.9999f)
                horizontalLineTo(10.5f)
                curveTo(9.9477f, 20.9999f, 9.5f, 20.5522f, 9.5f, 19.9999f)
                verticalLineTo(18.5402f)
                curveTo(8.8019f, 18.2733f, 8.1575f, 17.8977f, 7.5874f, 17.4342f)
                lineTo(6.3218f, 18.165f)
                curveTo(5.8435f, 18.4411f, 5.2319f, 18.2772f, 4.9558f, 17.7989f)
                lineTo(3.4558f, 15.2009f)
                curveTo(3.1796f, 14.7226f, 3.3452f, 14.11f, 3.8235f, 13.8338f)
                lineTo(5.0867f, 13.1046f)
                curveTo(5.0296f, 12.7447f, 5.0f, 12.3758f, 5.0f, 11.9999f)
                curveTo(5.0f, 11.624f, 5.0296f, 11.2551f, 5.0867f, 10.8952f)
                lineTo(3.8218f, 10.165f)
                curveTo(3.3435f, 9.8888f, 3.1796f, 9.2772f, 3.4558f, 8.7989f)
                lineTo(4.9558f, 6.2009f)
                curveTo(5.2319f, 5.7226f, 5.8435f, 5.5587f, 6.3218f, 5.8348f)
                lineTo(7.5874f, 6.5655f)
                curveTo(8.1575f, 6.1021f, 8.8019f, 5.7265f, 9.5f, 5.4595f)
                verticalLineTo(3.9999f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
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
                imageVector = PersianSymbols.Filled.Gear,
                contentDescription = ""
            )
        }
    }
}