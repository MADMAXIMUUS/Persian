package io.github.madmaximuus.persianSymbols.user.base

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

val PersianSymbols.Filled.User: ImageVector
    get() {
        if (user != null) {
            return user!!
        }
        user = Builder(
            name = "user-filled",
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
                moveTo(12.0001f, 13.0f)
                curveTo(14.7615f, 13.0f, 17.0001f, 10.7614f, 17.0001f, 8.0f)
                curveTo(17.0001f, 5.2386f, 14.7615f, 3.0f, 12.0001f, 3.0f)
                curveTo(9.2387f, 3.0f, 7.0001f, 5.2386f, 7.0001f, 8.0f)
                curveTo(7.0001f, 10.7614f, 9.2387f, 13.0f, 12.0001f, 13.0f)
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
                moveTo(5.1788f, 17.8182f)
                curveTo(6.586f, 15.5276f, 9.1146f, 14.0f, 12.0001f, 14.0f)
                curveTo(14.8855f, 14.0f, 17.4141f, 15.5276f, 18.8214f, 17.8182f)
                curveTo(20.0934f, 19.8887f, 18.0301f, 22.0f, 15.6001f, 22.0f)
                horizontalLineTo(8.4001f)
                curveTo(5.97f, 22.0f, 3.9067f, 19.8887f, 5.1788f, 17.8182f)
                close()
            }
        }.build()
        return user!!
    }

private var user: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.User,
                contentDescription = ""
            )
        }
    }
}