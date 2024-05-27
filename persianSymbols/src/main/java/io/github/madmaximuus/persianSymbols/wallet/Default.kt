package io.github.madmaximuus.persianSymbols.wallet

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

val PersianSymbols.Default.Wallet: ImageVector
    get() {
        if (wallet != null) {
            return wallet!!
        }
        wallet = Builder(
            name = "wallet-default",
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
                moveTo(15.5f, 11.0f)
                curveTo(15.2239f, 11.0f, 15.0f, 11.2239f, 15.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(15.0f, 12.7761f, 15.2239f, 13.0f, 15.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.7761f, 13.0f, 17.0f, 12.7761f, 17.0f, 12.5f)
                verticalLineTo(11.5f)
                curveTo(17.0f, 11.2239f, 16.7761f, 11.0f, 16.5f, 11.0f)
                horizontalLineTo(15.5f)
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
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 5.0147f, 5.0147f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 3.0f, 21.0f, 5.0147f, 21.0f, 7.5f)
                verticalLineTo(7.7639f)
                curveTo(21.6137f, 8.3132f, 22.0f, 9.1115f, 22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 14.8885f, 21.6137f, 15.6868f, 21.0f, 16.2361f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 18.9853f, 18.9853f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0147f, 21.0f, 3.0f, 18.9853f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(16.5f, 5.0f)
                curveTo(17.7095f, 5.0f, 18.7184f, 5.8589f, 18.95f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(13.3431f, 7.0f, 12.0f, 8.3432f, 12.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(12.0f, 15.6569f, 13.3431f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(18.95f)
                curveTo(18.7184f, 18.1411f, 17.7095f, 19.0f, 16.5f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 19.0f, 5.0f, 17.8807f, 5.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(5.0f, 6.1193f, 6.1193f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(15.0f, 9.0f)
                curveTo(14.4477f, 9.0f, 14.0f, 9.4477f, 14.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.5523f, 14.4477f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 15.0f, 20.0f, 14.5523f, 20.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 9.4477f, 19.5523f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }.build()
        return wallet!!
    }

private var wallet: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Wallet,
                contentDescription = ""
            )
        }
    }
}