package io.github.madmaximuus.persianSymbols.face.smile

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.FaceSmile: ImageVector
    get() {
        if (faceSmile != null) {
            return faceSmile!!
        }
        faceSmile = ImageVector.Builder(
            name = "face-smile-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                close()
                moveTo(8.5f, 11f)
                curveTo(9.19f, 11f, 9.75f, 10.44f, 9.75f, 9.75f)
                curveTo(9.75f, 9.06f, 9.19f, 8.5f, 8.5f, 8.5f)
                curveTo(7.81f, 8.5f, 7.25f, 9.06f, 7.25f, 9.75f)
                curveTo(7.25f, 10.44f, 7.81f, 11f, 8.5f, 11f)
                close()
                moveTo(15.5f, 11f)
                curveTo(16.19f, 11f, 16.75f, 10.44f, 16.75f, 9.75f)
                curveTo(16.75f, 9.06f, 16.19f, 8.5f, 15.5f, 8.5f)
                curveTo(14.81f, 8.5f, 14.25f, 9.06f, 14.25f, 9.75f)
                curveTo(14.25f, 10.44f, 14.81f, 11f, 15.5f, 11f)
                close()
                moveTo(9.076f, 14.02f)
                curveTo(8.811f, 13.702f, 8.338f, 13.659f, 8.02f, 13.924f)
                curveTo(7.702f, 14.189f, 7.659f, 14.662f, 7.924f, 14.98f)
                curveTo(8.837f, 16.076f, 10.346f, 16.75f, 12f, 16.75f)
                curveTo(13.654f, 16.75f, 15.163f, 16.076f, 16.076f, 14.98f)
                curveTo(16.341f, 14.662f, 16.298f, 14.189f, 15.98f, 13.924f)
                curveTo(15.662f, 13.659f, 15.189f, 13.702f, 14.924f, 14.02f)
                curveTo(14.33f, 14.732f, 13.266f, 15.25f, 12f, 15.25f)
                curveTo(10.734f, 15.25f, 9.67f, 14.732f, 9.076f, 14.02f)
                close()
            }
        }.build()

        return faceSmile!!
    }

private var faceSmile: ImageVector? = null
