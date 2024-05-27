package io.github.madmaximuus.persianSymbols.user.box.base

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

val PersianSymbols.Filled.UserBox: ImageVector
    get() {
        if (userBox != null) {
            return userBox!!
        }
        userBox = Builder(
            name = "user-box-filled",
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
                moveTo(3.0f, 7.4f)
                curveTo(3.0f, 4.97f, 4.97f, 3.0f, 7.4f, 3.0f)
                horizontalLineTo(16.6f)
                curveTo(19.0301f, 3.0f, 21.0f, 4.97f, 21.0f, 7.4f)
                verticalLineTo(16.6f)
                curveTo(21.0f, 16.8651f, 20.9766f, 17.1247f, 20.9316f, 17.3769f)
                lineTo(20.4906f, 17.1286f)
                curveTo(18.1012f, 15.7835f, 15.1617f, 15.0f, 12.0f, 15.0f)
                curveTo(8.8382f, 15.0f, 5.8988f, 15.7835f, 3.5094f, 17.1286f)
                lineTo(3.0684f, 17.3769f)
                curveTo(3.0234f, 17.1247f, 3.0f, 16.8651f, 3.0f, 16.6f)
                verticalLineTo(7.4f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(14.2091f, 13.0f, 16.0f, 11.2091f, 16.0f, 9.0f)
                curveTo(16.0f, 6.7909f, 14.2091f, 5.0f, 12.0f, 5.0f)
                curveTo(9.7908f, 5.0f, 8.0f, 6.7909f, 8.0f, 9.0f)
                curveTo(8.0f, 11.2091f, 9.7908f, 13.0f, 12.0f, 13.0f)
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
                moveTo(19.5094f, 18.8714f)
                lineTo(20.1333f, 19.2226f)
                curveTo(19.3314f, 20.3012f, 18.0473f, 21.0f, 16.6f, 21.0f)
                horizontalLineTo(7.4f)
                curveTo(5.9527f, 21.0f, 4.6686f, 20.3012f, 3.8667f, 19.2226f)
                lineTo(4.4906f, 18.8714f)
                curveTo(6.5641f, 17.7041f, 9.1627f, 17.0f, 12.0f, 17.0f)
                curveTo(14.8373f, 17.0f, 17.4359f, 17.7041f, 19.5094f, 18.8714f)
                close()
            }
        }.build()
        return userBox!!
    }

private var userBox: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserBox,
                contentDescription = ""
            )
        }
    }
}