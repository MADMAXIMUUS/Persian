package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

@Immutable
class AvatarSize internal constructor(
    internal val boxSizes: Dp,
    internal val placeholderSize: IconBoxSize,
    internal val overlayIconBoxSize: IconBoxSize
){
    fun copy(
        boxSizes: Dp = this.boxSizes,
        placeholderSize: IconBoxSize = this.placeholderSize,
        overlayIconBoxSize: IconBoxSize = this.overlayIconBoxSize,
    ) = AvatarSize(
        boxSizes.takeOrElse { this.boxSizes },
        placeholderSize,
        overlayIconBoxSize
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AvatarSize) return false

        if (boxSizes != other.boxSizes) return false
        if (placeholderSize != other.placeholderSize) return false
        return overlayIconBoxSize == other.overlayIconBoxSize
    }

    override fun hashCode(): Int {
        var result = boxSizes.hashCode()
        result = 31 * result + placeholderSize.hashCode()
        result = 31 * result + overlayIconBoxSize.hashCode()
        return result
    }
}

object PersianAvatarsDefaults {

    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.size48(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.size32()
    ) = AvatarSize(boxSizes, placeholderSize, editIconBoxSize)

    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.size48(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.size32()
    ) = AvatarSize(boxSizes, placeholderSize, editIconBoxSize)

    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.size32(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.size24()
    ) = AvatarSize(boxSizes, placeholderSize, editIconBoxSize)

    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.size24(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.size24()
    ) = AvatarSize(boxSizes, placeholderSize, editIconBoxSize)

    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.size20(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.size20()
    ) = AvatarSize(boxSizes, placeholderSize, editIconBoxSize)

    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderSize: IconBoxSize = PersianIconBoxDefaults.size18(),
        editIconBoxSize: IconBoxSize = PersianIconBoxDefaults.size18()
    ) = AvatarSize(boxSizes, placeholderSize, editIconBoxSize)
}