package io.github.madmaximuus.persianSymbols.shield.check

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

val PersianSymbols.Default.ShieldCheck: ImageVector
    get() {
        if (shieldCheck != null) {
            return shieldCheck!!
        }
        shieldCheck = Builder(
            name = "shield-check-default",
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
                moveTo(16.4571f, 10.7071f)
                curveTo(16.8476f, 10.3166f, 16.8476f, 9.6834f, 16.4571f, 9.2929f)
                curveTo(16.0666f, 8.9024f, 15.4334f, 8.9024f, 15.0429f, 9.2929f)
                lineTo(11.25f, 13.0858f)
                lineTo(9.9571f, 11.7929f)
                curveTo(9.5666f, 11.4024f, 8.9334f, 11.4024f, 8.5429f, 11.7929f)
                curveTo(8.1524f, 12.1834f, 8.1524f, 12.8166f, 8.5429f, 13.2071f)
                lineTo(10.5429f, 15.2071f)
                curveTo(10.9334f, 15.5976f, 11.5666f, 15.5976f, 11.9571f, 15.2071f)
                lineTo(16.4571f, 10.7071f)
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
        return shieldCheck!!
    }

private var shieldCheck: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ShieldCheck,
                contentDescription = ""
            )
        }
    }
}