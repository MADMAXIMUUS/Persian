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

val PersianSymbols.Filled.Wallet: ImageVector
    get() {
        if (wallet != null) {
            return wallet!!
        }
        wallet = Builder(
            name = "wallet-filled",
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
                moveTo(16.6f, 3.0f)
                horizontalLineTo(7.4f)
                curveTo(4.97f, 3.0f, 3.0f, 4.97f, 3.0f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(3.0f, 19.0301f, 4.97f, 21.0f, 7.4f, 21.0f)
                horizontalLineTo(16.6f)
                curveTo(19.0301f, 21.0f, 21.0f, 19.0301f, 21.0f, 16.6f)
                verticalLineTo(16.2361f)
                curveTo(20.4692f, 16.7111f, 19.7684f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(13.3431f, 17.0f, 12.0f, 15.6569f, 12.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(12.0f, 8.3432f, 13.3431f, 7.0f, 15.0f, 7.0f)
                horizontalLineTo(19.0f)
                curveTo(19.7684f, 7.0f, 20.4692f, 7.2888f, 21.0f, 7.7639f)
                verticalLineTo(7.4f)
                curveTo(21.0f, 4.97f, 19.0301f, 3.0f, 16.6f, 3.0f)
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
                moveTo(14.0f, 10.0f)
                curveTo(14.0f, 9.4477f, 14.4477f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 9.0f, 20.0f, 9.4477f, 20.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 14.5523f, 19.5523f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 15.0f, 14.0f, 14.5523f, 14.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(15.0f, 11.5f)
                curveTo(15.0f, 11.2239f, 15.2239f, 11.0f, 15.5f, 11.0f)
                horizontalLineTo(16.5f)
                curveTo(16.7761f, 11.0f, 17.0f, 11.2239f, 17.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(17.0f, 12.7761f, 16.7761f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(15.5f)
                curveTo(15.2239f, 13.0f, 15.0f, 12.7761f, 15.0f, 12.5f)
                verticalLineTo(11.5f)
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
                imageVector = PersianSymbols.Filled.Wallet,
                contentDescription = ""
            )
        }
    }
}