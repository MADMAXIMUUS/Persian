package io.github.madmaximuus.persianSymbols.question.circle

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

val PersianSymbols.Default.QuestionCircle: ImageVector
    get() {
        if (questionCircle != null) {
            return questionCircle!!
        }
        questionCircle = Builder(
            name = "question-circle-default",
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
                moveTo(11.8327f, 14.1773f)
                curveTo(12.2547f, 14.1773f, 12.5832f, 13.8332f, 12.6792f, 13.4222f)
                curveTo(12.6965f, 13.3481f, 12.7165f, 13.2764f, 12.739f, 13.2072f)
                curveTo(12.8311f, 12.9198f, 13.0061f, 12.6539f, 13.2639f, 12.4096f)
                curveTo(13.5632f, 12.1174f, 13.8418f, 11.8252f, 14.0997f, 11.533f)
                curveTo(14.3575f, 11.236f, 14.5671f, 10.9174f, 14.7282f, 10.5773f)
                curveTo(14.8894f, 10.2324f, 14.97f, 9.8492f, 14.97f, 9.4277f)
                curveTo(14.97f, 8.8432f, 14.8525f, 8.345f, 14.6177f, 7.9331f)
                curveTo(14.3875f, 7.5163f, 14.0536f, 7.2002f, 13.6162f, 6.9846f)
                curveTo(13.1788f, 6.7642f, 12.6515f, 6.654f, 12.0345f, 6.654f)
                curveTo(11.4773f, 6.654f, 10.9731f, 6.757f, 10.5219f, 6.963f)
                curveTo(10.0706f, 7.169f, 9.7115f, 7.478f, 9.4444f, 7.89f)
                curveTo(9.3122f, 8.0939f, 9.2115f, 8.3213f, 9.1425f, 8.5723f)
                curveTo(9.0185f, 9.0233f, 9.4215f, 9.4133f, 9.8892f, 9.4133f)
                curveTo(10.3333f, 9.4133f, 10.6531f, 9.0241f, 10.8949f, 8.6516f)
                curveTo(11.0192f, 8.4552f, 11.1826f, 8.3115f, 11.3852f, 8.2205f)
                curveTo(11.5879f, 8.1247f, 11.8043f, 8.0768f, 12.0345f, 8.0768f)
                curveTo(12.3108f, 8.0768f, 12.541f, 8.1319f, 12.7252f, 8.242f)
                curveTo(12.914f, 8.3522f, 13.0567f, 8.5127f, 13.1534f, 8.7235f)
                curveTo(13.2501f, 8.9342f, 13.2985f, 9.1905f, 13.2985f, 9.4923f)
                curveTo(13.2985f, 9.7702f, 13.2478f, 10.0169f, 13.1465f, 10.2324f)
                curveTo(13.0452f, 10.4432f, 12.9094f, 10.6444f, 12.739f, 10.836f)
                curveTo(12.5686f, 11.0228f, 12.3776f, 11.2216f, 12.1657f, 11.4324f)
                curveTo(11.8941f, 11.7102f, 11.6753f, 11.9737f, 11.5096f, 12.2228f)
                curveTo(11.3484f, 12.4719f, 11.2333f, 12.7497f, 11.1642f, 13.0563f)
                curveTo(11.14f, 13.1621f, 11.1197f, 13.2768f, 11.1035f, 13.4003f)
                curveTo(11.0474f, 13.8255f, 11.4038f, 14.1773f, 11.8327f, 14.1773f)
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
                moveTo(11.1711f, 15.7652f)
                curveTo(11.0008f, 15.9425f, 10.9156f, 16.1604f, 10.9156f, 16.4191f)
                curveTo(10.9156f, 16.6778f, 11.0008f, 16.8982f, 11.1711f, 17.0802f)
                curveTo(11.3415f, 17.2574f, 11.574f, 17.3461f, 11.8687f, 17.3461f)
                curveTo(12.1634f, 17.3461f, 12.396f, 17.2574f, 12.5663f, 17.0802f)
                curveTo(12.7367f, 16.8982f, 12.8219f, 16.6778f, 12.8219f, 16.4191f)
                curveTo(12.8219f, 16.1604f, 12.7367f, 15.9425f, 12.5663f, 15.7652f)
                curveTo(12.396f, 15.5832f, 12.1634f, 15.4922f, 11.8687f, 15.4922f)
                curveTo(11.574f, 15.4922f, 11.3415f, 15.5832f, 11.1711f, 15.7652f)
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
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.5817f, 7.5817f, 4.0f, 12.0f, 4.0f)
                curveTo(16.4183f, 4.0f, 20.0f, 7.5817f, 20.0f, 12.0f)
                curveTo(20.0f, 16.4183f, 16.4183f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                close()
            }
        }.build()
        return questionCircle!!
    }

private var questionCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.QuestionCircle,
                contentDescription = ""
            )
        }
    }
}