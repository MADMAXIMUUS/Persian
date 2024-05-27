package io.github.madmaximuus.persianSymbols.user.box.base

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

val PersianSymbols.Default.UserBox: ImageVector
    get() {
        if (userBox != null) {
            return userBox!!
        }
        userBox = Builder(
            name = "user-box-default",
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
                moveTo(7.5f, 3.0f)
                curveTo(5.0147f, 3.0f, 3.0f, 5.0147f, 3.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 18.9853f, 5.0147f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 21.0f, 21.0f, 18.9853f, 21.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.0f, 5.0147f, 18.9853f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.0f, 7.5f)
                curveTo(5.0f, 6.1193f, 6.1193f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 5.0f, 19.0f, 6.1193f, 19.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 16.6077f, 18.9932f, 16.7138f, 18.98f, 16.8179f)
                curveTo(16.9703f, 15.665f, 14.5693f, 15.0f, 12.0f, 15.0f)
                curveTo(9.4307f, 15.0f, 7.0297f, 15.665f, 5.02f, 16.8179f)
                curveTo(5.0068f, 16.7138f, 5.0f, 16.6077f, 5.0f, 16.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(6.047f, 18.5346f)
                curveTo(6.4565f, 18.8276f, 6.9581f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.0419f, 19.0f, 17.5435f, 18.8276f, 17.953f, 18.5346f)
                curveTo(16.2569f, 17.569f, 14.2115f, 17.0f, 12.0f, 17.0f)
                curveTo(9.7885f, 17.0f, 7.7432f, 17.569f, 6.047f, 18.5346f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 8.8954f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f)
                curveTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8954f, 13.1046f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveTo(8.0f, 7.7909f, 9.7909f, 6.0f, 12.0f, 6.0f)
                curveTo(14.2091f, 6.0f, 16.0f, 7.7909f, 16.0f, 10.0f)
                curveTo(16.0f, 12.2091f, 14.2091f, 14.0f, 12.0f, 14.0f)
                curveTo(9.7909f, 14.0f, 8.0f, 12.2091f, 8.0f, 10.0f)
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
                moveTo(8.0f, 10.0f)
                curveTo(8.0f, 7.7909f, 9.7909f, 6.0f, 12.0f, 6.0f)
                curveTo(14.2091f, 6.0f, 16.0f, 7.7909f, 16.0f, 10.0f)
                curveTo(16.0f, 12.2091f, 14.2091f, 14.0f, 12.0f, 14.0f)
                curveTo(9.7909f, 14.0f, 8.0f, 12.2091f, 8.0f, 10.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 8.8954f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f)
                curveTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8954f, 13.1046f, 8.0f, 12.0f, 8.0f)
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
                moveTo(7.5f, 3.0f)
                curveTo(5.0147f, 3.0f, 3.0f, 5.0147f, 3.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 18.9853f, 5.0147f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 21.0f, 21.0f, 18.9853f, 21.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.0f, 5.0147f, 18.9853f, 3.0f, 16.5f, 3.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(5.0f, 7.5f)
                curveTo(5.0f, 6.1193f, 6.1193f, 5.0f, 7.5f, 5.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 5.0f, 19.0f, 6.1193f, 19.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 16.6077f, 18.9932f, 16.7138f, 18.98f, 16.8179f)
                curveTo(16.9703f, 15.665f, 14.5693f, 15.0f, 12.0f, 15.0f)
                curveTo(9.4307f, 15.0f, 7.0297f, 15.665f, 5.02f, 16.8179f)
                curveTo(5.0068f, 16.7138f, 5.0f, 16.6077f, 5.0f, 16.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(6.047f, 18.5346f)
                curveTo(6.4565f, 18.8276f, 6.9581f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.0419f, 19.0f, 17.5435f, 18.8276f, 17.953f, 18.5346f)
                curveTo(16.2569f, 17.569f, 14.2115f, 17.0f, 12.0f, 17.0f)
                curveTo(9.7885f, 17.0f, 7.7432f, 17.569f, 6.047f, 18.5346f)
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
                imageVector = PersianSymbols.Default.UserBox,
                contentDescription = ""
            )
        }
    }
}