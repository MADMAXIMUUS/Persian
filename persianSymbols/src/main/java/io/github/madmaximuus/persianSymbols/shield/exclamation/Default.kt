package io.github.madmaximuus.persianSymbols.shield.exclamation

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

val PersianSymbols.Default.ShieldExclamation: ImageVector
    get() {
        if (shieldExclamation != null) {
            return shieldExclamation!!
        }
        shieldExclamation = Builder(
            name = "shield-exclamation-default",
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
                moveTo(12.0f, 7.0f)
                curveTo(12.5523f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 13.5523f, 12.5523f, 14.0f, 12.0f, 14.0f)
                curveTo(11.4477f, 14.0f, 11.0f, 13.5523f, 11.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 7.4477f, 11.4477f, 7.0f, 12.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                curveTo(11.0f, 15.4477f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 15.4477f, 13.0f, 16.0f)
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
                moveTo(12.3417f, 3.0602f)
                curveTo(12.121f, 2.9799f, 11.879f, 2.9799f, 11.6583f, 3.0602f)
                lineTo(3.6583f, 5.9693f)
                curveTo(3.2631f, 6.113f, 3.0f, 6.4886f, 3.0f, 6.9091f)
                curveTo(3.0f, 12.6952f, 6.2671f, 18.0121f, 11.5211f, 20.8779f)
                curveTo(11.8196f, 21.0407f, 12.1804f, 21.0407f, 12.4789f, 20.8779f)
                curveTo(17.7329f, 18.0121f, 21.0f, 12.6952f, 21.0f, 6.9091f)
                curveTo(21.0f, 6.4886f, 20.7369f, 6.113f, 20.3417f, 5.9693f)
                lineTo(12.3417f, 3.0602f)
                close()
                moveTo(12.0f, 18.8496f)
                curveTo(7.8474f, 16.3863f, 5.257f, 12.1777f, 5.0181f, 7.6029f)
                lineTo(12.0f, 5.0641f)
                lineTo(18.9819f, 7.6029f)
                curveTo(18.743f, 12.1777f, 16.1526f, 16.3863f, 12.0f, 18.8496f)
                close()
            }
        }.build()
        return shieldExclamation!!
    }

private var shieldExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ShieldExclamation,
                contentDescription = ""
            )
        }
    }
}