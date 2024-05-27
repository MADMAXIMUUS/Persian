package io.github.madmaximuus.persianSymbols.creditCard

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

val PersianSymbols.Filled.CreditCard: ImageVector
    get() {
        if (creditCard != null) {
            return creditCard!!
        }
        creditCard = Builder(
            name = "credit-card-filled",
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
                moveTo(6.4f, 4.0f)
                curveTo(4.1048f, 4.0f, 2.22f, 5.7574f, 2.0179f, 8.0f)
                horizontalLineTo(21.9821f)
                curveTo(21.78f, 5.7574f, 19.8952f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
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
                moveTo(22.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 20.0f, 22.0f, 18.0301f, 22.0f, 15.6f)
                verticalLineTo(10.0f)
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
                imageVector = PersianSymbols.Filled.CreditCard,
                contentDescription = ""
            )
        }
    }
}