package io.github.madmaximuus.persian.listItem

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarAndImage.Avatar
import io.github.madmaximuus.persian.avatarAndImage.Image
import io.github.madmaximuus.persian.checkbox.toggle.CheckboxToggle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.radioButton.RadioButtonToggle
import io.github.madmaximuus.persian.switch.Switch

/**
 * Interface representing the scope for the left side of a list item.
 *
 * This interface extends [RowScope] and provides properties for managing the appearance and state
 * of the left side of a list item within a row.
 *
 * @property sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @property colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @property enabled A boolean indicating whether the list item is enabled.
 */
interface ListItemLeadingScope : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
    val checked: Boolean
}

/**
 * Internal class that wraps a [RowScope] and implements [ListItemLeadingScope].
 *
 * This class provides a way to encapsulate a [RowScope] and add additional properties related to
 * the left side of a list item, such as sizes, colors, and enabled state.
 *
 * @param scope The underlying [RowScope] being wrapped.
 * @param sizes The sizes of the list item, encapsulated in a [ListItemSizes] object.
 * @param colors The colors of the list item, encapsulated in a [ListItemColors] object.
 * @param enabled A boolean indicating whether the list item is enabled.
 */
internal class ListItemLeadingScopeWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val enabled: Boolean,
    override val checked: Boolean,
) : ListItemLeadingScope, RowScope by scope

/**
 * Composable function to display an image within the left scope of a list item.
 *
 * This function creates a [Box] with padding and contains an [Image] that represents the leading
 * image of the list item. The image's appearance is customized based on the enabled state and the
 * provided sizes, colors, and shape.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param imageUrl The URI of the image to be displayed.
 */
@Composable
fun ListItemLeadingScope.Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size8)
    ) {
        Image(
            imageUrl = imageUrl,
            sizes = this@Image.sizes.leadingImageSizes,
            colors = this@Image.colors.leadingImageColors,
        )
    }
}

/**
 * Composable function to display an avatar within the left scope of a list item.
 *
 * This function creates a [Box] with padding and contains an [Avatar] that represents the leading
 * avatar of the list item. The avatar's appearance is customized based on the enabled state and the
 * provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param avatarUrl The URI of the avatar image to be displayed.
 */
@Composable
fun ListItemLeadingScope.Avatar(
    modifier: Modifier = Modifier,
    avatarUrl: Uri,
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size8)
    ) {
        Avatar(
            imageUrl = avatarUrl,
            colors = this@Avatar.colors.leadingAvatarColors,
            sizes = this@Avatar.sizes.leadingAvatarSizes,
        )
    }
}

/**
 * Composable function to display an icon within the left scope of a list item.
 *
 * This function creates a [Box] with padding and contains an [Icon] that represents the leading
 * icon of the list item. The icon's appearance is customized based on the enabled state and the
 * provided sizes and colors.
 *
 * @param modifier The modifier to be applied to the [Box].
 * @param icon The painter for the icon.
 */
@Composable
fun ListItemLeadingScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size12)
    ) {
        Icon(
            painter = icon,
            sizes = this@Icon.sizes.leadingIconSizes,
            tint = this@Icon.colors.leadingIconColor,
            contentDescription = "List Leading Icon"
        )
    }
}

@Composable
fun ListItemLeadingScope.Switch(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size8)
    ) {
        Switch(
            checked = this@Switch.checked,
            colors = this@Switch.colors.leadingSwitchColors,
            sizes = this@Switch.sizes.leadingSwitchSizes,
            enabled = this@Switch.enabled,
            onCheckedChange = null
        )
    }
}

@Composable
fun ListItemLeadingScope.Checkbox(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size12)
    ) {
        CheckboxToggle(
            modifier = modifier
                .size(this@Checkbox.sizes.leadingCheckboxSizes.toggleSize),
            checked = this@Checkbox.checked,
            onCheckedChange = null,
            colors = this@Checkbox.colors.leadingCheckboxColors,
        )
    }
}

@Composable
fun ListItemLeadingScope.Radio(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size12)
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(this@Radio.sizes.leadingRadioButtonSizes.toggleSize),
            selected = this@Radio.checked,
            colors = this@Radio.colors.leadingRadioButtonColors,
            onClick = null
        )
    }
}

@Composable
fun ListItemLeadingScope.IconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier.padding(end = PersianTheme.spacing.size8)
    ) {
        IconButton(
            icon = icon,
            onClick = onClick,
            colors = this@IconButton.colors.leadingIconButtonColors,
            sizes = this@IconButton.sizes.leadingIconButtonSizes,
            enabled = this@IconButton.enabled
        )
    }
}