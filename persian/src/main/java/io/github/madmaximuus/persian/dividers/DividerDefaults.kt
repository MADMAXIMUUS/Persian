package io.github.madmaximuus.persian.dividers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

object DividerDefaults {

    @Composable
    fun sizes(
        inset: Dp = PersianTheme.spacing.size16,
        strokeThickness: Dp = 1.dp
    ): DividerSizes =
        DividerSizes(
            inset = inset,
            strokeThickness = strokeThickness
        )

}

@Immutable
data class DividerSizes(
    val inset: Dp,
    val strokeThickness: Dp
)