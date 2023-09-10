package ru.rabbit.persian.navigationBar.item

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Immutable
data class NavigationBarItemSizes(
    val textStyle: TextStyle,
    val paddingValues: PaddingValues
)

object PersianNavigationBarItemSizes {

    @Composable
    fun iconAndLabel(
        textStyle: TextStyle = MaterialTheme.typography.labelMedium,
        paddingValues: PaddingValues = PaddingValues(
            horizontal = 0.dp,
            vertical = 4.dp
        )
    ) = remember(textStyle, paddingValues) {
        NavigationBarItemSizes(
            textStyle = textStyle,
            paddingValues = paddingValues
        )
    }

    @Composable
    fun onlyIcon(
        textStyle: TextStyle = MaterialTheme.typography.labelMedium,
        paddingValues: PaddingValues = PaddingValues(
            horizontal = 0.dp,
            vertical = 12.dp
        )
    ) = remember(textStyle, paddingValues) {
        NavigationBarItemSizes(
            textStyle = textStyle,
            paddingValues = paddingValues
        )
    }
}