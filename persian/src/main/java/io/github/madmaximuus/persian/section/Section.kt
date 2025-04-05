package io.github.madmaximuus.persian.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

@Composable
fun Section(
    modifier: Modifier = Modifier,
    title: String? = null,
    details: String? = null,
    caption: String? = null,
    colors: SectionColors = SectionDefaults.colors(),
    sizes: SectionSizes = SectionDefaults.sizes(),
    items: @Composable SectionItemScope.() -> Unit
) {
    val padding = if (title != null) PaddingValues(bottom = PersianTheme.spacing.size6)
    else PaddingValues(vertical = PersianTheme.spacing.size6)
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 800.dp)
                .fillMaxWidth()
                .padding(padding)
                .background(colors.containerColor, sizes.shape)
                .clip(sizes.shape),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (title != null) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = PersianTheme.spacing.size16)
                        .padding(top = PersianTheme.spacing.size12)
                        .padding(bottom = PersianTheme.spacing.size4),
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
            val scope = remember(colors, sizes) {
                SectionItemScopeWrapper(this, sizes.itemSizes, colors.itemColors)
            }
            scope.items()
        }
        if (caption != null) {
            Text(
                modifier = Modifier
                    .widthIn(max = 800.dp)
                    .fillMaxWidth()
                    .padding(top = PersianTheme.spacing.size6)
                    .padding(horizontal = PersianTheme.spacing.size16)
                    .padding(bottom = PersianTheme.spacing.size8),
                text = caption,
                style = sizes.captionTextStyle,
                color = colors.captionTextColor
            )
        }
    }
}