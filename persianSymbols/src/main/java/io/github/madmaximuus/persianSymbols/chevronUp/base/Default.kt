package io.github.madmaximuus.persianSymbols.chevronUp.base

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronUp: ImageVector
    get() {
        if (chevronUp != null) {
            return chevronUp!!
        }
        chevronUp = ImageVector.Builder(
            name = "chevron-up-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(6.7752f, 13.2353f)
                curveTo(6.3847f, 13.6258f, 6.3813f, 14.2623f, 6.7677f, 14.657f)
                curveTo(7.154f, 15.0516f, 7.7838f, 15.055f, 8.1743f, 14.6644f)
                lineTo(11.7174f, 11.1214f)
                lineTo(15.2605f, 14.6644f)
                curveTo(15.651f, 15.0549f, 16.2808f, 15.0516f, 16.6671f, 14.6569f)
                curveTo(17.0535f, 14.2622f, 17.0501f, 13.6257f, 16.6596f, 13.2352f)
                lineTo(12.4286f, 9.0043f)
                lineTo(12.4245f, 9.0001f)
                curveTo(12.0382f, 8.6054f, 11.4084f, 8.6021f, 11.0179f, 8.9926f)
                lineTo(6.7752f, 13.2353f)
                close()
            }
        }.build()
        return chevronUp!!
    }

private var chevronUp: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ChevronUp,
                contentDescription = ""
            )
        }
    }
}