package io.github.madmaximuus.persian.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.divider.Divider
import io.github.madmaximuus.persian.divider.DividerDefaults
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
fun Section(
    modifier: Modifier = Modifier,
    title: String? = null,
    details: String? = null,
    caption: String? = null,
    divider: Boolean = false,
    colors: SectionColors = SectionDefaults.plainColors(),
    sizes: SectionSizes = SectionDefaults.sizes(),
    items: @Composable SectionItemScope.() -> Unit
) {
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val padding = if (widthSizeClass == WindowWidthSizeClass.COMPACT) {
        if (title != null && caption != null) PaddingValues(0.dp)
        else if (title != null) PaddingValues(bottom = PersianTheme.spacing.size6)
        else PaddingValues(vertical = PersianTheme.spacing.size6)
    } else {
        if (title != null && caption != null) PaddingValues(
            horizontal = PersianTheme.spacing.size6,
            vertical = PersianTheme.spacing.size4
        )
        else if (title != null) PaddingValues(
            bottom = PersianTheme.spacing.size6,
            start = PersianTheme.spacing.size6,
            top = PersianTheme.spacing.size4,
            end = PersianTheme.spacing.size6
        )
        else PaddingValues(
            bottom = PersianTheme.spacing.size4,
            start = PersianTheme.spacing.size6,
            top = PersianTheme.spacing.size6,
            end = PersianTheme.spacing.size6
        )
    }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(padding)
            .background(colors.containerColor, sizes.shape)
            .clip(
                if (colors.containerColor == Color.Transparent) RoundedCornerShape(0.dp)
                else sizes.shape
            )
    ) {
        if (divider || title != null) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                if (divider) {
                    Divider(
                        sizes = DividerDefaults.sizes(strokeThickness = sizes.dividerThickness),
                        strokeColor = colors.dividerColor
                    )
                }
                if (title != null) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = PersianTheme.spacing.size16)
                            .padding(top = PersianTheme.spacing.size6)
                            .padding(bottom = PersianTheme.spacing.size2),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = title,
                            style = sizes.titleTextStyle,
                            color = colors.titleTextColor
                        )
                        if (details != null)
                            Text(
                                text = details,
                                style = sizes.detailsTextStyle,
                                color = colors.detailsTextColor
                            )
                    }
                }
            }
        }
        val scope = remember(colors, sizes) {
            SectionItemScopeWrapper(this, sizes.itemSizes, colors.itemColors)
        }
        scope.items()
        if (caption != null) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = PersianTheme.spacing.size2)
                    .padding(horizontal = PersianTheme.spacing.size16)
                    .padding(bottom = PersianTheme.spacing.size6),
                text = caption,
                style = sizes.captionTextStyle,
                color = colors.captionTextColor
            )
        }
    }
}