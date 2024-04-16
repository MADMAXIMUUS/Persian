package io.github.madmaximuus.persianIcons.expendLessCircle

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun expendLessCircleFilled(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "expend-less-circle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 6.4771f, 17.5228f, 2f, 12f, 2f)
                curveTo(6.4771f, 2f, 2f, 6.4771f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.4771f, 22f, 12f, 22f)
                close()
                moveTo(16.0404f, 13.3736f)
                curveTo(15.6499f, 13.7641f, 15.0167f, 13.7641f, 14.6261f, 13.3736f)
                lineTo(12f, 10.7476f)
                lineTo(9.37385f, 13.3736f)
                curveTo(8.9833f, 13.7641f, 8.3501f, 13.7641f, 7.9596f, 13.3736f)
                curveTo(7.5691f, 12.9831f, 7.5691f, 12.3499f, 7.9596f, 11.9594f)
                lineTo(11.291f, 8.62813f)
                lineTo(11.2929f, 8.62627f)
                curveTo(11.6773f, 8.2418f, 12.2969f, 8.2358f, 12.6886f, 8.6082f)
                curveTo(12.6949f, 8.6142f, 12.701f, 8.6202f, 12.7071f, 8.6263f)
                lineTo(16.0404f, 11.9594f)
                curveTo(16.4309f, 12.3499f, 16.4309f, 12.9831f, 16.0404f, 13.3736f)
                close()
            }
        }.build()
    }
}



@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = expendLessCircleFilled(),
                contentDescription = ""
            )
        }
    }
}