package io.github.madmaximuus.persianSymbols.check.badge

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

val PersianSymbols.Filled.CheckBadge: ImageVector
    get() {
        if (checkBadge != null) {
            return checkBadge!!
        }
        checkBadge = Builder(
            name = "check-badge-filled",
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
                moveTo(13.5106f, 3.741f)
                curveTo(12.7132f, 2.822f, 11.2868f, 2.822f, 10.4894f, 3.741f)
                lineTo(10.4252f, 3.815f)
                curveTo(9.9397f, 4.3745f, 9.1846f, 4.6199f, 8.4629f, 4.4525f)
                lineTo(8.3675f, 4.4304f)
                curveTo(7.1823f, 4.1557f, 6.0283f, 4.9941f, 5.9233f, 6.2063f)
                lineTo(5.9149f, 6.3038f)
                curveTo(5.851f, 7.0419f, 5.3843f, 7.6842f, 4.7021f, 7.973f)
                lineTo(4.612f, 8.0112f)
                curveTo(3.4915f, 8.4856f, 3.0508f, 9.8422f, 3.6784f, 10.8846f)
                lineTo(3.7289f, 10.9685f)
                curveTo(4.111f, 11.6031f, 4.111f, 12.397f, 3.7289f, 13.0317f)
                lineTo(3.6784f, 13.1156f)
                curveTo(3.0508f, 14.158f, 3.4915f, 15.5145f, 4.612f, 15.9889f)
                lineTo(4.7021f, 16.0271f)
                curveTo(5.3843f, 16.316f, 5.851f, 16.9583f, 5.9149f, 17.6963f)
                lineTo(5.9233f, 17.7939f)
                curveTo(6.0283f, 19.0061f, 7.1823f, 19.8445f, 8.3675f, 19.5697f)
                lineTo(8.4629f, 19.5476f)
                curveTo(9.1846f, 19.3803f, 9.9397f, 19.6256f, 10.4252f, 20.1852f)
                lineTo(10.4894f, 20.2591f)
                curveTo(11.2868f, 21.1781f, 12.7132f, 21.1781f, 13.5106f, 20.2591f)
                lineTo(13.5748f, 20.1852f)
                curveTo(14.0603f, 19.6256f, 14.8154f, 19.3803f, 15.5371f, 19.5476f)
                lineTo(15.6325f, 19.5697f)
                curveTo(16.8178f, 19.8445f, 17.9717f, 19.0061f, 18.0767f, 17.7939f)
                lineTo(18.0851f, 17.6963f)
                curveTo(18.149f, 16.9583f, 18.6157f, 16.316f, 19.2979f, 16.0271f)
                lineTo(19.388f, 15.9889f)
                curveTo(20.5085f, 15.5145f, 20.9493f, 14.158f, 20.3216f, 13.1156f)
                lineTo(20.2711f, 13.0317f)
                curveTo(19.889f, 12.397f, 19.889f, 11.6031f, 20.2711f, 10.9685f)
                lineTo(20.3216f, 10.8846f)
                curveTo(20.9493f, 9.8422f, 20.5085f, 8.4856f, 19.388f, 8.0112f)
                lineTo(19.2979f, 7.973f)
                curveTo(18.6157f, 7.6842f, 18.149f, 7.0419f, 18.0851f, 6.3038f)
                lineTo(18.0767f, 6.2063f)
                curveTo(17.9717f, 4.9941f, 16.8178f, 4.1557f, 15.6325f, 4.4304f)
                lineTo(15.5371f, 4.4525f)
                curveTo(14.8154f, 4.6199f, 14.0603f, 4.3745f, 13.5748f, 3.815f)
                lineTo(13.5106f, 3.741f)
                close()
                moveTo(16.2071f, 10.7071f)
                curveTo(16.5976f, 10.3165f, 16.5976f, 9.6834f, 16.2071f, 9.2928f)
                curveTo(15.8166f, 8.9023f, 15.1834f, 8.9023f, 14.7929f, 9.2928f)
                lineTo(11.0f, 13.0857f)
                lineTo(9.7071f, 11.7928f)
                curveTo(9.3166f, 11.4023f, 8.6834f, 11.4023f, 8.2929f, 11.7928f)
                curveTo(7.9024f, 12.1834f, 7.9024f, 12.8165f, 8.2929f, 13.2071f)
                lineTo(10.2929f, 15.2071f)
                curveTo(10.6834f, 15.5976f, 11.3166f, 15.5976f, 11.7071f, 15.2071f)
                lineTo(16.2071f, 10.7071f)
                close()
            }
        }.build()
        return checkBadge!!
    }

private var checkBadge: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.CheckBadge,
                contentDescription = ""
            )
        }
    }
}