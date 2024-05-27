package io.github.madmaximuus.persianSymbols.question.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Default.Question: ImageVector
    get() {
        if (question != null) {
            return question!!
        }
        question = Builder(
            name = "question-default",
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
                moveTo(11.0f, 15.0f)
                curveTo(11.0f, 15.5523f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 15.5523f, 13.0f, 15.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(12.9898f, 10.8769f)
                lineTo(13.2225f, 11.8494f)
                horizontalLineTo(13.2225f)
                lineTo(12.9898f, 10.8769f)
                close()
                moveTo(12.0f, 3.5f)
                verticalLineTo(2.5f)
                horizontalLineTo(12.0f)
                lineTo(12.0f, 3.5f)
                close()
                moveTo(7.0f, 7.2f)
                curveTo(7.0f, 7.7523f, 7.4477f, 8.2f, 8.0f, 8.2f)
                curveTo(8.5523f, 8.2f, 9.0f, 7.7523f, 9.0f, 7.2f)
                horizontalLineTo(7.0f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(13.1046f, 21.0f, 14.0f, 20.1046f, 14.0f, 19.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 20.1046f, 10.8954f, 21.0f, 12.0f, 21.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineTo(17.0f)
                curveTo(10.8954f, 17.0f, 10.0f, 17.8954f, 10.0f, 19.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 17.8954f, 13.1046f, 17.0f, 12.0f, 17.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.2225f, 11.8494f)
                curveTo(14.0316f, 11.6559f, 14.9763f, 11.2418f, 15.7276f, 10.4515f)
                curveTo(16.4985f, 9.6406f, 17.0f, 8.5009f, 17.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 8.0206f, 14.6737f, 8.6573f, 14.2781f, 9.0735f)
                curveTo(13.8629f, 9.5103f, 13.3025f, 9.7738f, 12.7572f, 9.9043f)
                lineTo(13.2225f, 11.8494f)
                close()
                moveTo(17.0f, 7.0f)
                curveTo(17.0f, 5.1826f, 16.1992f, 3.9855f, 15.0914f, 3.2952f)
                curveTo(14.0545f, 2.6491f, 12.8406f, 2.5f, 12.0f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(12.6594f, 4.5f, 13.4455f, 4.6261f, 14.0336f, 4.9926f)
                curveTo(14.5508f, 5.3148f, 15.0f, 5.8677f, 15.0f, 7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(12.0f, 2.5f)
                curveTo(11.2419f, 2.5f, 10.0259f, 2.6368f, 8.967f, 3.3039f)
                curveTo(7.8362f, 4.0163f, 7.0f, 5.2645f, 7.0f, 7.2f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 5.9355f, 9.4971f, 5.3337f, 10.033f, 4.9961f)
                curveTo(10.6407f, 4.6132f, 11.4248f, 4.5f, 12.0f, 4.5f)
                lineTo(12.0f, 2.5f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 11.9996f, 13.0f, 11.9998f, 12.9999f, 12.0001f)
                curveTo(12.9999f, 12.0004f, 13.0001f, 11.9992f, 13.0012f, 11.9965f)
                curveTo(13.0036f, 11.9909f, 13.0108f, 11.9768f, 13.0289f, 11.9571f)
                curveTo(13.0685f, 11.9141f, 13.1381f, 11.8696f, 13.2225f, 11.8494f)
                lineTo(12.7572f, 9.9043f)
                curveTo(11.9025f, 10.1087f, 11.0f, 10.8615f, 11.0f, 12.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }.build()
        return question!!
    }

private var question: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Question,
                contentDescription = ""
            )
        }
    }
}