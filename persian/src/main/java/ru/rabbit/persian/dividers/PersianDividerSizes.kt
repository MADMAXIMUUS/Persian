package ru.rabbit.persian.dividers

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.spacing

@Immutable
data class DividerSizes(
    val inset: Dp,
    val strokeThickness: Dp
)

object PersianDividerSizes {

    @Composable
    fun small(
        inset: Dp = MaterialTheme.spacing.large,
        strokeThickness: Dp = 1.dp
    ) = remember(inset,strokeThickness) {
        DividerSizes(
            inset = inset,
            strokeThickness = strokeThickness
        )
    }

}