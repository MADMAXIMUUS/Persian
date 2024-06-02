package io.github.madmaximuus.persian.dividers

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing

object PersianDividerDefaults {
    @Composable
    fun sizes(
        inset: Dp = MaterialTheme.spacing.size16,
        strokeThickness: Dp = 1.dp
    ) = remember(inset, strokeThickness) {
        DividerSizes(
            inset = inset,
            strokeThickness = strokeThickness
        )
    }
}

@Immutable
data class DividerSizes(
    val inset: Dp,
    val strokeThickness: Dp
)