package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

enum class ImageShape {
    SMALL, MEDIUM, LARGE
}


@Immutable
class ImageSize internal constructor(
    internal val boxSizes: Dp,
    internal val placeholderSize: IconBoxSize,
    internal val overlayIconBoxSize: IconBoxSize,
    private val smallShape: Shape,
    private val mediumShape: Shape,
    private val largeShape: Shape
) {

    @Stable
    internal fun shape(shape: ImageShape): Shape =
        when (shape) {
            ImageShape.SMALL -> smallShape
            ImageShape.MEDIUM -> mediumShape
            ImageShape.LARGE -> largeShape
        }

    fun copy(
        boxSizes: Dp = this.boxSizes,
        placeholderSize: IconBoxSize = this.placeholderSize,
        overlayIconBoxSize: IconBoxSize = this.overlayIconBoxSize,
        smallShape: Shape = this.smallShape,
        mediumShape: Shape = this.mediumShape,
        largeShape: Shape = this.largeShape
    ) = ImageSize(
        boxSizes.takeOrElse { this.boxSizes },
        placeholderSize,
        overlayIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ImageSize) return false

        if (boxSizes != other.boxSizes) return false
        if (placeholderSize != other.placeholderSize) return false
        if (overlayIconBoxSize != other.overlayIconBoxSize) return false
        if (smallShape != other.smallShape) return false
        if (mediumShape != other.mediumShape) return false
        return largeShape == other.largeShape
    }

    override fun hashCode(): Int {
        var result = boxSizes.hashCode()
        result = 31 * result + placeholderSize.hashCode()
        result = 31 * result + overlayIconBoxSize.hashCode()
        result = 31 * result + smallShape.hashCode()
        result = 31 * result + mediumShape.hashCode()
        result = 31 * result + largeShape.hashCode()
        return result
    }
}

object PersianImagesDefaults {

    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderSize,
        editIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )

    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(11.dp),
        largeShape: Shape = RoundedCornerShape(15.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderSize,
        editIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )

    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderSize,
        editIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )

    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.large(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        smallShape: Shape = RoundedCornerShape(5.dp),
        mediumShape: Shape = RoundedCornerShape(9.dp),
        largeShape: Shape = RoundedCornerShape(12.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderSize,
        editIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )

    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(10.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderSize,
        editIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )

    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.small(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.small(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(8.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderSize,
        editIconBoxSize,
        smallShape,
        mediumShape,
        largeShape
    )
}