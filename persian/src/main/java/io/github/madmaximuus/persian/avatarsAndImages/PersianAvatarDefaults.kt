package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults
import io.github.madmaximuus.persian.iconBox.PersianIconBoxSize

data class AvatarSize(
    val boxSizes: Dp,
    val placeholderSize: IconBoxSize,
    val editIconBoxSize: IconBoxSize
)

@Deprecated("Replace with PersianAvatarsDefaults")
object PersianAvatarsSizes {

    @Composable
    fun profile(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxSize.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxSize.extraLarge()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun large(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxSize.large(),
        editIconBoxSize: IconBoxSize = PersianIconBoxSize.large()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun medium(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxSize.medium(),
        editIconBoxSize: IconBoxSize = PersianIconBoxSize.medium()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun small(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxSize.small(),
        editIconBoxSize: IconBoxSize = PersianIconBoxSize.small()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }
}

object PersianAvatarDefaults {

    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraExtraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.extraLarge()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.extraLarge(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.large(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.large()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.medium(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.medium()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }

    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.small(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.small()
    ) = remember(boxSizes, placeholderSize, editIconBoxSize) {
        AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
    }
}