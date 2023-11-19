package io.github.madmaximuus.persian.dividers

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.spacing


@Deprecated("Replace with PersianDividerDefaults")
object PersianDividerSizes {

    @Composable
    fun small(
        inset: Dp = MaterialTheme.spacing.large,
        strokeThickness: Dp = 1.dp
    ) = remember(inset, strokeThickness) {
        DividerSizes(
            inset = inset,
            strokeThickness = strokeThickness
        )
    }

}