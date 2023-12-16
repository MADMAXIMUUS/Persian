package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

data class ImageSize(
    val boxSizes: Dp,
    val placeholderSize: IconBoxSize,
    val editIconBoxSize: IconBoxSize,
    val shape: Shape
)

object PersianImagesDefaults {
    @Composable
    fun smallShapeSize96(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        shape: Shape = RoundedCornerShape(8.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun smallShapeSize80(
        boxSizes: Dp = 80.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        shape: Shape = RoundedCornerShape(8.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun smallShapeSize64(
        boxSizes: Dp = 64.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = RoundedCornerShape(6.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun smallShapeSize48(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.large(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = RoundedCornerShape(5.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun smallShapeSize32(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        shape: Shape = RoundedCornerShape(4.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun smallShapeSize24(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.small(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.small(),
        shape: Shape = RoundedCornerShape(3.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun mediumShapeSize96(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        shape: Shape = RoundedCornerShape(12.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun mediumShapeSize80(
        boxSizes: Dp = 80.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        shape: Shape = RoundedCornerShape(11.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun mediumShapeSize64(
        boxSizes: Dp = 64.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = RoundedCornerShape(10.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun mediumShapeSize48(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.large(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = RoundedCornerShape(9.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun mediumShapeSize32(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        shape: Shape = RoundedCornerShape(8.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun mediumShapeSize24(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.small(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.small(),
        shape: Shape = RoundedCornerShape(7.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun largeShapeSize96(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        shape: Shape = RoundedCornerShape(16.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun largeShapeSize80(
        boxSizes: Dp = 80.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        shape: Shape = RoundedCornerShape(15.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun largeShapeSize64(
        boxSizes: Dp = 64.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = RoundedCornerShape(14.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun largeShapeSize48(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.large(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large(),
        shape: Shape = RoundedCornerShape(12.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun largeShapeSize32(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        shape: Shape = RoundedCornerShape(10.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }

    @Composable
    fun largeShapeSize24(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.small(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.small(),
        shape: Shape = RoundedCornerShape(8.dp)
    ) = remember(boxSizes, placeholderSize, editIconBoxSize, shape) {
        ImageSize(boxSizes, placeholderSize, editIconBoxSize, shape)
    }
}