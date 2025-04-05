package io.github.madmaximuus.persian.section

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.ListItemColors
import io.github.madmaximuus.persian.listItem.ListItemDefaults
import io.github.madmaximuus.persian.listItem.ListItemSizes

object SectionDefaults {

    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        titleTextColor: Color = PersianTheme.colorScheme.primary,
        detailsTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        captionTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        itemColors: ListItemColors = ListItemDefaults.colors()
    ) = SectionColors(
        containerColor = containerColor,
        titleTextColor = titleTextColor,
        detailsTextColor = detailsTextColor,
        captionTextColor = captionTextColor,
        itemColors = itemColors
    )

    @Composable
    fun sizes(
        shape: Shape = PersianTheme.shapes.shape18,
        titleTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        detailsTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        captionTextStyle: TextStyle = PersianTheme.typography.bodySmall,
        itemSizes: ListItemSizes = ListItemDefaults.sizes()
    ) = SectionSizes(
        shape = shape,
        titleTextStyle = titleTextStyle,
        detailsTextStyle = detailsTextStyle,
        captionTextStyle = captionTextStyle,
        itemSizes = itemSizes
    )
}

@Immutable
class SectionColors internal constructor(
    internal val containerColor: Color,
    internal val titleTextColor: Color,
    internal val detailsTextColor: Color,
    internal val captionTextColor: Color,
    internal val itemColors: ListItemColors
)

@Immutable
class SectionSizes internal constructor(
    internal val shape: Shape,
    internal val titleTextStyle: TextStyle,
    internal val detailsTextStyle: TextStyle,
    internal val captionTextStyle: TextStyle,
    internal val itemSizes: ListItemSizes
)
