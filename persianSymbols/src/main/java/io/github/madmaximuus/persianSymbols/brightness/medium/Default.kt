package io.github.madmaximuus.persianSymbols.brightness.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BrightnessMedium: ImageVector
    get() {
        if (brightnessMedium != null) {
            return brightnessMedium!!
        }
        brightnessMedium = Builder(
            name = "brightness-medium-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 12f)
                curveTo(17f, 14.421f, 15.279f, 16.441f, 12.994f, 16.901f)
                curveTo(12.452f, 17.01f, 12f, 16.552f, 12f, 16f)
                verticalLineTo(8f)
                curveTo(12f, 7.448f, 12.452f, 6.99f, 12.994f, 7.099f)
                curveTo(15.279f, 7.56f, 17f, 9.579f, 17f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.769f, 3.357f)
                curveTo(12.793f, 2.378f, 11.207f, 2.378f, 10.231f, 3.357f)
                lineTo(9.098f, 4.492f)
                curveTo(9.004f, 4.586f, 8.876f, 4.639f, 8.743f, 4.639f)
                lineTo(7.139f, 4.637f)
                curveTo(5.757f, 4.636f, 4.636f, 5.757f, 4.637f, 7.139f)
                lineTo(4.639f, 8.743f)
                curveTo(4.639f, 8.876f, 4.586f, 9.004f, 4.492f, 9.098f)
                lineTo(3.357f, 10.231f)
                curveTo(2.378f, 11.207f, 2.378f, 12.793f, 3.357f, 13.769f)
                lineTo(4.492f, 14.903f)
                curveTo(4.586f, 14.996f, 4.639f, 15.124f, 4.639f, 15.257f)
                lineTo(4.637f, 16.861f)
                curveTo(4.636f, 18.243f, 5.757f, 19.364f, 7.139f, 19.363f)
                lineTo(8.743f, 19.361f)
                curveTo(8.876f, 19.361f, 9.004f, 19.414f, 9.098f, 19.508f)
                lineTo(10.231f, 20.643f)
                curveTo(11.207f, 21.622f, 12.793f, 21.622f, 13.769f, 20.643f)
                lineTo(14.903f, 19.508f)
                curveTo(14.996f, 19.414f, 15.124f, 19.361f, 15.257f, 19.361f)
                lineTo(16.861f, 19.363f)
                curveTo(18.243f, 19.364f, 19.364f, 18.243f, 19.363f, 16.861f)
                lineTo(19.361f, 15.257f)
                curveTo(19.361f, 15.124f, 19.414f, 14.996f, 19.508f, 14.903f)
                lineTo(20.643f, 13.769f)
                curveTo(21.622f, 12.793f, 21.622f, 11.207f, 20.643f, 10.231f)
                lineTo(19.508f, 9.098f)
                curveTo(19.414f, 9.004f, 19.361f, 8.876f, 19.361f, 8.743f)
                lineTo(19.363f, 7.139f)
                curveTo(19.364f, 5.757f, 18.243f, 4.636f, 16.861f, 4.637f)
                lineTo(15.257f, 4.639f)
                curveTo(15.124f, 4.639f, 14.996f, 4.586f, 14.903f, 4.492f)
                lineTo(13.769f, 3.357f)
                close()
                moveTo(11.646f, 4.77f)
                curveTo(11.842f, 4.574f, 12.158f, 4.574f, 12.354f, 4.77f)
                lineTo(13.487f, 5.905f)
                curveTo(13.957f, 6.375f, 14.594f, 6.639f, 15.258f, 6.639f)
                lineTo(16.862f, 6.637f)
                curveTo(17.139f, 6.637f, 17.363f, 6.861f, 17.363f, 7.138f)
                lineTo(17.361f, 8.742f)
                curveTo(17.361f, 9.406f, 17.625f, 10.043f, 18.095f, 10.513f)
                lineTo(19.23f, 11.646f)
                curveTo(19.426f, 11.842f, 19.426f, 12.158f, 19.23f, 12.354f)
                lineTo(18.095f, 13.487f)
                curveTo(17.625f, 13.957f, 17.361f, 14.594f, 17.361f, 15.258f)
                lineTo(17.363f, 16.862f)
                curveTo(17.363f, 17.139f, 17.139f, 17.363f, 16.862f, 17.363f)
                lineTo(15.258f, 17.361f)
                curveTo(14.594f, 17.361f, 13.957f, 17.625f, 13.487f, 18.095f)
                lineTo(12.354f, 19.23f)
                curveTo(12.158f, 19.426f, 11.842f, 19.426f, 11.646f, 19.23f)
                lineTo(10.513f, 18.095f)
                curveTo(10.043f, 17.625f, 9.406f, 17.361f, 8.742f, 17.361f)
                lineTo(7.138f, 17.363f)
                curveTo(6.861f, 17.363f, 6.637f, 17.139f, 6.637f, 16.862f)
                lineTo(6.639f, 15.258f)
                curveTo(6.639f, 14.594f, 6.375f, 13.957f, 5.905f, 13.487f)
                lineTo(4.77f, 12.354f)
                curveTo(4.574f, 12.158f, 4.574f, 11.842f, 4.77f, 11.646f)
                lineTo(5.905f, 10.513f)
                curveTo(6.375f, 10.043f, 6.639f, 9.406f, 6.639f, 8.742f)
                lineTo(6.637f, 7.138f)
                curveTo(6.637f, 6.861f, 6.861f, 6.637f, 7.138f, 6.637f)
                lineTo(8.742f, 6.639f)
                curveTo(9.406f, 6.639f, 10.043f, 6.375f, 10.513f, 5.905f)
                lineTo(11.646f, 4.77f)
                close()
            }
        }.build()
        return brightnessMedium!!
    }

private var brightnessMedium: ImageVector? = null