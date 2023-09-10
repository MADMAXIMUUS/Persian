package ru.rabbit.persian.iconButtons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class IconButtonSizes(
    val contentPadding: PaddingValues,
    val cornerRadius: Shape,
)

object PersianIconButtonSizes {

    @Composable
    fun medium(
        contentPadding: PaddingValues = PaddingValues(0.dp),
        cornerRadius: Shape = MaterialTheme.shapes.large
    ) = remember(
        contentPadding,
        cornerRadius
    ) {
        IconButtonSizes(
            contentPadding = contentPadding,
            cornerRadius = cornerRadius
        )
    }

}