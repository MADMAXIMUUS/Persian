package io.github.madmaximuus.persianSymbols.arrow.right.rotate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowRightRotate: ImageVector
    get() {
        if (arrowRightRotate != null) {
            return arrowRightRotate!!
        }
        arrowRightRotate = ImageVector.Builder(
            name = "arrow-right-rotate-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.464f, 12f)
                curveTo(4.464f, 7.582f, 8.046f, 4f, 12.464f, 4f)
                curveTo(14.989f, 4f, 17.243f, 5.17f, 18.71f, 7f)
                horizontalLineTo(16.04f)
                curveTo(15.488f, 7f, 15.04f, 7.448f, 15.04f, 8f)
                curveTo(15.04f, 8.552f, 15.488f, 9f, 16.04f, 9f)
                horizontalLineTo(20.364f)
                curveTo(20.566f, 9.035f, 20.781f, 9.009f, 20.979f, 8.911f)
                curveTo(21.339f, 8.733f, 21.544f, 8.368f, 21.536f, 7.992f)
                verticalLineTo(3.5f)
                curveTo(21.536f, 2.948f, 21.088f, 2.5f, 20.536f, 2.5f)
                curveTo(19.983f, 2.5f, 19.536f, 2.948f, 19.536f, 3.5f)
                verticalLineTo(4.93f)
                curveTo(17.727f, 3.12f, 15.227f, 2f, 12.464f, 2f)
                curveTo(6.941f, 2f, 2.464f, 6.477f, 2.464f, 12f)
                curveTo(2.464f, 17.523f, 6.941f, 22f, 12.464f, 22f)
                curveTo(16.398f, 22f, 19.8f, 19.728f, 21.432f, 16.428f)
                curveTo(21.677f, 15.934f, 21.474f, 15.334f, 20.979f, 15.089f)
                curveTo(20.484f, 14.844f, 19.884f, 15.047f, 19.639f, 15.542f)
                curveTo(18.332f, 18.185f, 15.609f, 20f, 12.464f, 20f)
                curveTo(8.046f, 20f, 4.464f, 16.418f, 4.464f, 12f)
                close()
            }
        }.build()
        return arrowRightRotate!!
    }

private var arrowRightRotate: ImageVector? = null