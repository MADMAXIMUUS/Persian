package io.github.madmaximuus.persianSymbols.chevronUp.circle

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

val PersianSymbols.Filled.ChevronUpCircle: ImageVector
    get() {
        if (chevronUpCircle != null) {
            return chevronUpCircle!!
        }
        chevronUpCircle = Builder(
            name = "chevron-up-circle-filled",
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
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.0404f, 13.3736f)
                curveTo(15.6499f, 13.7641f, 15.0167f, 13.7641f, 14.6261f, 13.3736f)
                lineTo(12.0f, 10.7476f)
                lineTo(9.3738f, 13.3736f)
                curveTo(8.9833f, 13.7641f, 8.3501f, 13.7641f, 7.9596f, 13.3736f)
                curveTo(7.5691f, 12.9831f, 7.5691f, 12.3499f, 7.9596f, 11.9594f)
                lineTo(11.291f, 8.6281f)
                lineTo(11.2929f, 8.6263f)
                curveTo(11.6773f, 8.2418f, 12.2969f, 8.2359f, 12.6886f, 8.6082f)
                curveTo(12.6949f, 8.6142f, 12.701f, 8.6202f, 12.7071f, 8.6263f)
                lineTo(16.0404f, 11.9594f)
                curveTo(16.4309f, 12.3499f, 16.4309f, 12.9831f, 16.0404f, 13.3736f)
                close()
            }
        }.build()
        return chevronUpCircle!!
    }

private var chevronUpCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.ChevronUpCircle,
                contentDescription = ""
            )
        }
    }
}