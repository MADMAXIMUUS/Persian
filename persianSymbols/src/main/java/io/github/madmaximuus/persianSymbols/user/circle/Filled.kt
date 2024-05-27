package io.github.madmaximuus.persianSymbols.user.circle

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

val PersianSymbols.Filled.UserCircle: ImageVector
    get() {
        if (userCircle != null) {
            return userCircle!!
        }
        userCircle = Builder(
            name = "user-circle-filled",
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
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 13.8928f, 21.4741f, 15.6628f, 20.5605f, 17.1718f)
                curveTo(20.538f, 17.1566f, 20.5147f, 17.1422f, 20.4906f, 17.1286f)
                curveTo(18.1012f, 15.7835f, 15.1618f, 15.0f, 12.0f, 15.0f)
                curveTo(8.8383f, 15.0f, 5.8988f, 15.7835f, 3.5094f, 17.1286f)
                curveTo(3.4853f, 17.1422f, 3.462f, 17.1566f, 3.4395f, 17.1718f)
                curveTo(2.5259f, 15.6628f, 2.0f, 13.8928f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(14.2091f, 13.0f, 16.0f, 11.2091f, 16.0f, 9.0f)
                curveTo(16.0f, 6.7909f, 14.2091f, 5.0f, 12.0f, 5.0f)
                curveTo(9.7909f, 5.0f, 8.0f, 6.7909f, 8.0f, 9.0f)
                curveTo(8.0f, 11.2091f, 9.7909f, 13.0f, 12.0f, 13.0f)
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
                moveTo(12.0f, 17.0f)
                curveTo(14.7644f, 17.0f, 17.3022f, 17.6684f, 19.3485f, 18.7823f)
                curveTo(17.5215f, 20.7609f, 14.9055f, 22.0f, 12.0f, 22.0f)
                curveTo(9.0946f, 22.0f, 6.4785f, 20.7609f, 4.6515f, 18.7823f)
                curveTo(6.6978f, 17.6684f, 9.2356f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }.build()
        return userCircle!!
    }

private var userCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserCircle,
                contentDescription = ""
            )
        }
    }
}