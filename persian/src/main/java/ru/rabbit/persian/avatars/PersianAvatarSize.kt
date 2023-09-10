package ru.rabbit.persian.avatars

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class AvatarSize(
    val boxSizes: Dp,
    val cornerShape: CornerBasedShape
)

object PersianAvatarsSizes {

    @Composable
    fun large(
        boxSizes: Dp = 48.dp,
        cornerShape: CornerBasedShape = MaterialTheme.shapes.large
    ) = remember(boxSizes, cornerShape) {
        AvatarSize(boxSizes, cornerShape)
    }

    @Composable
    fun medium(
        boxSizes: Dp = 32.dp,
        cornerShape: CornerBasedShape = MaterialTheme.shapes.medium
    ) = remember(boxSizes, cornerShape) {
        AvatarSize(boxSizes, cornerShape)
    }

    @Composable
    fun small(
        boxSizes: Dp = 24.dp,
        cornerShape: CornerBasedShape = MaterialTheme.shapes.small
    ) = remember(boxSizes, cornerShape) {
        AvatarSize(boxSizes, cornerShape)
    }
}