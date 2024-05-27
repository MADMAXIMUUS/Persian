package io.github.madmaximuus.persianSymbols.creditCard

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

val PersianSymbols.Default.CreditCard: ImageVector
    get() {
        if (creditCard != null) {
            return creditCard!!
        }
        creditCard = Builder(
            name = "credit-card-default",
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
                moveTo(6.5f, 4.0f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 17.9853f, 4.0147f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 20.0f, 22.0f, 17.9853f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.05f, 8.0f)
                curveTo(4.2816f, 6.8589f, 5.2905f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.7095f, 6.0f, 19.7184f, 6.8589f, 19.95f, 8.0f)
                horizontalLineTo(4.05f)
                close()
                moveTo(4.0f, 10.0f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 16.8807f, 5.1193f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 18.0f, 20.0f, 16.8807f, 20.0f, 15.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }.build()
        return creditCard!!
    }

private var creditCard: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CreditCard,
                contentDescription = ""
            )
        }
    }
}