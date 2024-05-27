package io.github.madmaximuus.persianSymbols.user.magnifyingGlass

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

val PersianSymbols.Filled.UserMagnifyingGlass: ImageVector
    get() {
        if (userMagnifyingGlass != null) {
            return userMagnifyingGlass!!
        }
        userMagnifyingGlass = Builder(
            name = "user-magnifying-glass-filled",
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
                moveTo(11.9989f, 12.0f)
                curveTo(14.7604f, 12.0f, 16.9989f, 9.7614f, 16.9989f, 7.0f)
                curveTo(16.9989f, 4.2386f, 14.7604f, 2.0f, 11.9989f, 2.0f)
                curveTo(9.2375f, 2.0f, 6.9989f, 4.2386f, 6.9989f, 7.0f)
                curveTo(6.9989f, 9.7614f, 9.2375f, 12.0f, 11.9989f, 12.0f)
                close()
                moveTo(5.1776f, 16.8182f)
                curveTo(6.5848f, 14.5276f, 9.1135f, 13.0f, 11.9989f, 13.0f)
                curveTo(12.7087f, 13.0f, 13.3969f, 13.0924f, 14.0522f, 13.2659f)
                curveTo(13.1044f, 14.0454f, 12.5f, 15.2271f, 12.5f, 16.5501f)
                curveTo(12.5f, 18.8973f, 14.4028f, 20.8001f, 16.75f, 20.8001f)
                curveTo(16.7962f, 20.8001f, 16.8422f, 20.7993f, 16.888f, 20.7979f)
                curveTo(16.4832f, 20.9281f, 16.0473f, 21.0f, 15.5989f, 21.0f)
                horizontalLineTo(8.3989f)
                curveTo(5.9689f, 21.0f, 3.9056f, 18.8887f, 5.1776f, 16.8182f)
                close()
                moveTo(16.8038f, 14.5836f)
                curveTo(15.6935f, 14.5836f, 14.7935f, 15.4837f, 14.7935f, 16.594f)
                curveTo(14.7935f, 17.7043f, 15.6935f, 18.6044f, 16.8038f, 18.6044f)
                curveTo(17.9141f, 18.6044f, 18.8142f, 17.7043f, 18.8142f, 16.594f)
                curveTo(18.8142f, 15.4837f, 17.9141f, 14.5836f, 16.8038f, 14.5836f)
                close()
                moveTo(13.2935f, 16.594f)
                curveTo(13.2935f, 14.6553f, 14.8651f, 13.0836f, 16.8038f, 13.0836f)
                curveTo(18.7426f, 13.0836f, 20.3142f, 14.6553f, 20.3142f, 16.594f)
                curveTo(20.3142f, 17.346f, 20.0778f, 18.0427f, 19.6752f, 18.614f)
                lineTo(21.6122f, 20.551f)
                curveTo(21.9051f, 20.8439f, 21.9051f, 21.3187f, 21.6122f, 21.6116f)
                curveTo(21.3193f, 21.9045f, 20.8444f, 21.9045f, 20.5515f, 21.6116f)
                lineTo(18.5689f, 19.629f)
                curveTo(18.0504f, 19.9313f, 17.4473f, 20.1044f, 16.8038f, 20.1044f)
                curveTo(14.8651f, 20.1044f, 13.2935f, 18.5327f, 13.2935f, 16.594f)
                close()
            }
        }.build()
        return userMagnifyingGlass!!
    }

private var userMagnifyingGlass: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserMagnifyingGlass,
                contentDescription = ""
            )
        }
    }
}