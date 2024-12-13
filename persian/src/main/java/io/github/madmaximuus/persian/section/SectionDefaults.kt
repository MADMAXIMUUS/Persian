package io.github.madmaximuus.persian.section

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.ListItemColors
import io.github.madmaximuus.persian.listItem.ListItemDefaults
import io.github.madmaximuus.persian.listItem.ListItemSizes

object SectionDefaults {

    @Composable
    fun fillColors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        titleTextColor: Color = PersianTheme.colorScheme.primary,
        detailsTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        captionTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        dividerColor: Color = PersianTheme.colorScheme.outlineVariant,
        itemColors: ListItemColors = ListItemDefaults.colors()
    ): SectionColors =
        SectionColors(
            containerColor = containerColor,
            titleTextColor = titleTextColor,
            detailsTextColor = detailsTextColor,
            captionTextColor = captionTextColor,
            dividerColor = dividerColor,
            itemColors = itemColors
        )

    @Composable
    fun plainColors(
        containerColor: Color = Color.Transparent,
        titleTextColor: Color = PersianTheme.colorScheme.primary,
        detailsTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        captionTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        dividerColor: Color = PersianTheme.colorScheme.outlineVariant,
        itemColors: ListItemColors = ListItemDefaults.colors()
    ): SectionColors =
        SectionColors(
            containerColor = containerColor,
            titleTextColor = titleTextColor,
            detailsTextColor = detailsTextColor,
            captionTextColor = captionTextColor,
            dividerColor = dividerColor,
            itemColors = itemColors
        )

    @Composable
    fun sizes(
        shape: Shape = PersianTheme.shapes.shape16,
        titleTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        detailsTextStyle: TextStyle = PersianTheme.typography.bodySmall,
        captionTextStyle: TextStyle = PersianTheme.typography.bodySmall,
        dividerThickness: Dp = 8.dp,
        itemSizes: ListItemSizes = ListItemDefaults.sizes()
    ): SectionSizes =
        SectionSizes(
            shape = shape,
            titleTextStyle = titleTextStyle,
            detailsTextStyle = detailsTextStyle,
            captionTextStyle = captionTextStyle,
            dividerThickness = dividerThickness,
            itemSizes = itemSizes
        )
}

@Immutable
class SectionColors internal constructor(
    internal val containerColor: Color,
    internal val titleTextColor: Color,
    internal val detailsTextColor: Color,
    internal val captionTextColor: Color,
    internal val dividerColor: Color,
    internal val itemColors: ListItemColors
)

@Immutable
class SectionSizes internal constructor(
    internal val shape: Shape,
    internal val titleTextStyle: TextStyle,
    internal val detailsTextStyle: TextStyle,
    internal val captionTextStyle: TextStyle,
    internal val dividerThickness: Dp,
    internal val itemSizes: ListItemSizes
)
