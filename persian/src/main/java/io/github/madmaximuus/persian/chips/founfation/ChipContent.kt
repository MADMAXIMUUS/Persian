package io.github.madmaximuus.persian.chips.founfation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * Base implementation the content for a chip.
 *
 * @param label The text to be displayed on the chip.
 * @param labelTextStyle The text style to be applied to the chip's label.
 * @param leading The optional leading content of the chip.
 * @param trailing The optional trailing content of the chip.
 * @param labelColor The color of the chip's label text.
 */
@Composable
internal fun ChipContent(
    label: String,
    labelTextStyle: TextStyle,
    leading: (@Composable () -> Unit)?,
    trailing: (@Composable () -> Unit)?,
    labelColor: Color,
) {
    Row(
        modifier = Modifier
            .height(32.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        leading?.let { it() } ?: Spacer(modifier = Modifier.width(PersianTheme.spacing.size16))
        Text(
            text = label,
            color = labelColor,
            style = labelTextStyle.copy(platformStyle = PlatformTextStyle(includeFontPadding = false)),
        )
        trailing?.let { it() } ?: Spacer(modifier = Modifier.width(PersianTheme.spacing.size16))
    }
}