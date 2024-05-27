package io.github.madmaximuus.persianSymbols.review

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

val PersianSymbols.Default.Review: ImageVector
    get() {
        if (review != null) {
            return review!!
        }
        review = Builder(
            name = "review-default",
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
                moveTo(17.5f, 4.0f)
                curveTo(19.9853f, 4.0f, 22.0f, 6.0147f, 22.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 17.9853f, 19.9853f, 20.0f, 17.5f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 20.0f, 2.0f, 19.1046f, 2.0f, 18.0f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 6.0147f, 4.0147f, 4.0f, 6.5f, 4.0f)
                horizontalLineTo(17.5f)
                close()
                moveTo(20.0f, 8.5f)
                curveTo(20.0f, 7.1193f, 18.8807f, 6.0f, 17.5f, 6.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 6.0f, 4.0f, 7.1193f, 4.0f, 8.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 18.0f, 20.0f, 16.8807f, 20.0f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(12.2853f, 8.3781f)
                curveTo(12.1955f, 8.1017f, 11.8045f, 8.1017f, 11.7147f, 8.3781f)
                lineTo(10.9448f, 10.7476f)
                curveTo(10.9046f, 10.8712f, 10.7894f, 10.9549f, 10.6595f, 10.9549f)
                horizontalLineTo(8.168f)
                curveTo(7.8774f, 10.9549f, 7.7566f, 11.3268f, 7.9917f, 11.4976f)
                lineTo(10.0073f, 12.9621f)
                curveTo(10.1125f, 13.0384f, 10.1565f, 13.1739f, 10.1163f, 13.2975f)
                lineTo(9.3464f, 15.667f)
                curveTo(9.2566f, 15.9434f, 9.5729f, 16.1732f, 9.808f, 16.0024f)
                lineTo(11.8237f, 14.5379f)
                curveTo(11.9288f, 14.4616f, 12.0712f, 14.4616f, 12.1763f, 14.5379f)
                lineTo(14.192f, 16.0024f)
                curveTo(14.4271f, 16.1732f, 14.7434f, 15.9434f, 14.6536f, 15.667f)
                lineTo(13.8837f, 13.2975f)
                curveTo(13.8435f, 13.1739f, 13.8875f, 13.0384f, 13.9927f, 12.9621f)
                lineTo(16.0083f, 11.4976f)
                curveTo(16.2434f, 11.3268f, 16.1226f, 10.9549f, 15.832f, 10.9549f)
                horizontalLineTo(13.3405f)
                curveTo(13.2106f, 10.9549f, 13.0954f, 10.8712f, 13.0552f, 10.7476f)
                lineTo(12.2853f, 8.3781f)
                close()
            }
        }.build()
        return review!!
    }

private var review: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Review,
                contentDescription = ""
            )
        }
    }
}