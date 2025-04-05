package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarAndImage.AvatarColors
import io.github.madmaximuus.persian.avatarAndImage.AvatarDefaults
import io.github.madmaximuus.persian.avatarAndImage.AvatarSizes
import io.github.madmaximuus.persian.avatarAndImage.ImageColors
import io.github.madmaximuus.persian.avatarAndImage.ImageDefaults
import io.github.madmaximuus.persian.avatarAndImage.ImageSizes
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.checkbox.CheckboxDefaults
import io.github.madmaximuus.persian.checkbox.CheckboxSizes
import io.github.madmaximuus.persian.checkbox.CheckboxToggleColors
import io.github.madmaximuus.persian.counter.CounterColors
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.CounterSizes
import io.github.madmaximuus.persian.divider.DividerDefaults
import io.github.madmaximuus.persian.divider.DividerSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.iconButton.IconButtonColors
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.IconButtonSizes
import io.github.madmaximuus.persian.radioButton.RadioButtonDefaults
import io.github.madmaximuus.persian.radioButton.RadioButtonSizes
import io.github.madmaximuus.persian.radioButton.RadioButtonToggleColors
import io.github.madmaximuus.persian.switch.SwitchColors
import io.github.madmaximuus.persian.switch.SwitchDefaults
import io.github.madmaximuus.persian.switch.SwitchSizes

/**
 * Contains all default values used by [ListItem]
 */
object ListItemDefaults {

    /**
     * Create a [ListItemColors] instance with the specified colors.
     *
     *
     * @param titleColor The color of the title text when enabled.
     * @param bodyColor The color of the body text when enabled.
     * @param subheadColor The color of the subhead text when enabled.
     * @param newLabelColor The color of the new label text when enabled.
     * @param newLabelContainerColor The background color of the new label container when enabled.
     * @param leadingIconColor The color of the icon in the left section when enabled.
     * @param leadingAvatarColors The colors for the avatar in the left section.
     * @param leadingImageColors The colors for the image in the left section.
     * @param trailingSwitchColors The colors for the switch in the right section.
     * @param trailingButtonColors The colors for the button in the right section.
     * @param trailingIconButtonColors The colors for the icon button in the right section.
     * @param trailingCounterColors The colors for the counter in the right section.
     * @param trailingRadioButtonColors The colors for the radio button in the right section.
     * @param trailingCheckboxToggleColors The colors for the checkbox in the right section.
     * @param trailingSuffixColor The color of the suffix text in the right section when enabled.
     * @param trailingIconColor The color of the icon in the right section when enabled.
     * @param dividerColor The color of the divider.
     */
    @Composable
    fun colors(
        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        leadingAvatarColors: AvatarColors = AvatarDefaults.colors(),
        leadingImageColors: ImageColors = ImageDefaults.colors(),
        leadingSwitchColors: SwitchColors = SwitchDefaults.colors(),
        leadingCheckboxColors: CheckboxToggleColors = CheckboxDefaults.toggleColors(),
        leadingRadioButtonColors: RadioButtonToggleColors = RadioButtonDefaults.toggleColors(),
        leadingIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(),
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        bodyColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        subheadColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        newLabelColor: Color = PersianTheme.colorScheme.onValid,
        newLabelContainerColor: Color = PersianTheme.colorScheme.valid,
        trailingSwitchColors: SwitchColors = SwitchDefaults.colors(),
        trailingButtonColors: ButtonColors = ButtonDefaults.primaryColors(),
        trailingIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(),
        trailingCounterColors: CounterColors = CounterDefaults.primaryColors(),
        trailingRadioButtonColors: RadioButtonToggleColors = RadioButtonDefaults.toggleColors(),
        trailingCheckboxToggleColors: CheckboxToggleColors = CheckboxDefaults.toggleColors(),
        trailingSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        trailingSuffixBodyColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        trailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        dividerColor: Color = PersianTheme.colorScheme.outlineVariant
    ) = ListItemColors(
        leadingIconColor = leadingIconColor,
        leadingAvatarColors = leadingAvatarColors,
        leadingImageColors = leadingImageColors,
        leadingSwitchColors = leadingSwitchColors,
        leadingCheckboxColors = leadingCheckboxColors,
        leadingRadioButtonColors = leadingRadioButtonColors,
        leadingIconButtonColors = leadingIconButtonColors,
        titleColor = titleColor,
        bodyColor = bodyColor,
        subheadColor = subheadColor,
        newLabelColor = newLabelColor,
        newLabelContainerColor = newLabelContainerColor,
        trailingSwitchColors = trailingSwitchColors,
        trailingButtonColors = trailingButtonColors,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingCounterColors = trailingCounterColors,
        trailingRadioButtonColors = trailingRadioButtonColors,
        trailingCheckboxToggleColors = trailingCheckboxToggleColors,
        trailingSuffixColor = trailingSuffixColor,
        trailingSuffixBodyColor = trailingSuffixBodyColor,
        trailingIconColor = trailingIconColor,
        dividerColor = dividerColor
    )

    /**
     * Create a [ListItemSizes] instance with the specified sizes.
     *
     * @param shape The shape of the list item.
     * @param titleTextStyle The text style for the title in the middle section.
     * @param bodyTextStyle The text style for the body text in the middle section.
     * @param subheadTextStyle The text style for the subhead text in the middle section.
     * @param newLabelTextStyle The text style for the new label in the middle section.
     * @param newLabelShape The shape for the new label in the middle section.
     * @param trailingIconSizes The sizes for the icon in the right section.
     * @param trailingSwitchSizes The sizes for the switch in the right section.
     * @param trailingCounterSizes The sizes for the counter in the right section.
     * @param trailingSuffixTextStyle The text style for the suffix text in the right section.
     * @param trailingButtonSizes The sizes for the button in the right section.
     * @param trailingIconButtonSizes The sizes for the icon button in the right section.
     * @param trailingCheckboxSizes The sizes for the checkbox in the right section.
     * @param trailingRadioButtonSizes The sizes for the radio button in the right section.
     * @param dividerSizes The sizes for the divider.
     */
    @Composable
    fun sizes(
        shape: Shape = RoundedCornerShape(0.dp),

        leadingIconSizes: IconSizes = IconDefaults.size28(),
        leadingImageSizes: ImageSizes = ImageDefaults.size40(),
        leadingAvatarSizes: AvatarSizes = AvatarDefaults.size40(),
        leadingSwitchSizes: SwitchSizes = SwitchDefaults.sizes(),
        leadingCheckboxSizes: CheckboxSizes = CheckboxDefaults.sizes(),
        leadingRadioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes(),
        leadingIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),

        titleTextStyle: TextStyle = PersianTheme.typography.titleMedium,
        bodyTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        subheadTextStyle: TextStyle = PersianTheme.typography.labelExtraSmall,
        newLabelTextStyle: TextStyle = PersianTheme.typography.labelSmall,
        newLabelShape: Shape = PersianTheme.shapes.shape6,

        trailingIconSizes: IconSizes = IconDefaults.size24(),
        trailingSwitchSizes: SwitchSizes = SwitchDefaults.sizes(),
        trailingCounterSizes: CounterSizes = CounterDefaults.sizes(),
        trailingSuffixTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        trailingSuffixBodyTextStyle: TextStyle = PersianTheme.typography.bodySmall,
        trailingButtonSizes: ButtonSizes = ButtonDefaults.smallSizes(),
        trailingIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),
        trailingCheckboxSizes: CheckboxSizes = CheckboxDefaults.sizes(),
        trailingRadioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes(),

        dividerSizes: DividerSizes = DividerDefaults.sizes(),
    ) = ListItemSizes(
        shape = shape,

        leadingIconSizes = leadingIconSizes,
        leadingImageSizes = leadingImageSizes,
        leadingAvatarSizes = leadingAvatarSizes,
        leadingSwitchSizes = leadingSwitchSizes,
        leadingCheckboxSizes = leadingCheckboxSizes,
        leadingRadioButtonSizes = leadingRadioButtonSizes,
        leadingIconButtonSizes = leadingIconButtonSizes,

        titleTextStyle = titleTextStyle,
        bodyTextStyle = bodyTextStyle,
        subheadTextStyle = subheadTextStyle,
        newLabelTextStyle = newLabelTextStyle,
        newLabelShape = newLabelShape,

        trailingIconSizes = trailingIconSizes,
        trailingSwitchSizes = trailingSwitchSizes,
        trailingCounterSizes = trailingCounterSizes,
        trailingSuffixTextStyle = trailingSuffixTextStyle,
        trailingSuffixBodyTextStyle = trailingSuffixBodyTextStyle,
        trailingButtonSizes = trailingButtonSizes,
        trailingIconButtonSizes = trailingIconButtonSizes,
        trailingCheckboxSizes = trailingCheckboxSizes,
        trailingRadioButtonSizes = trailingRadioButtonSizes,

        dividerSizes = dividerSizes
    )
}

/**
 * Immutable class representing the colors for various components within a list item.
 *
 * This class encapsulates the colors for different UI elements such as text, icons, images, buttons,
 * and dividers. It provides a way to customize the appearance of a list item by specifying the colors
 * for each component.
 *
 * @property titleColor The color of the title text when enabled.
 * @property bodyColor The color of the body text when enabled.
 * @property subheadColor The color of the subhead text when enabled.
 * @property newLabelColor The color of the new label text when enabled.
 * @property newLabelContainerColor The background color of the new label container when enabled.
 * @property leadingIconColor The color of the icon in the left section when enabled.
 * @property leadingAvatarColors The colors for the avatar in the left section.
 * @property leadingImageColors The colors for the image in the left section.
 * @property trailingSwitchColors The colors for the switch in the right section.
 * @property trailingButtonColors The colors for the button in the right section.
 * @property trailingIconButtonColors The colors for the icon button in the right section.
 * @property trailingCounterColors The colors for the counter in the right section.
 * @property trailingRadioButtonColors The colors for the radio button in the right section.
 * @property trailingCheckboxToggleColors The colors for the checkbox in the right section.
 * @property trailingSuffixColor The color of the suffix text in the right section when enabled.
 * @property trailingIconColor The color of the icon in the right section when enabled.
 * @property dividerColor The color of the divider.
 */
@Immutable
class ListItemColors(
    internal val leadingIconColor: Color,
    internal val leadingAvatarColors: AvatarColors,
    internal val leadingImageColors: ImageColors,
    internal val leadingSwitchColors: SwitchColors,
    internal val leadingCheckboxColors: CheckboxToggleColors,
    internal val leadingRadioButtonColors: RadioButtonToggleColors,
    internal val leadingIconButtonColors: IconButtonColors,

    internal val titleColor: Color,
    internal val bodyColor: Color,
    internal val subheadColor: Color,
    internal val newLabelColor: Color,
    internal val newLabelContainerColor: Color,

    internal val trailingSwitchColors: SwitchColors,
    internal val trailingButtonColors: ButtonColors,
    internal val trailingIconButtonColors: IconButtonColors,
    internal val trailingCounterColors: CounterColors,
    internal val trailingRadioButtonColors: RadioButtonToggleColors,
    internal val trailingCheckboxToggleColors: CheckboxToggleColors,
    internal val trailingSuffixColor: Color,
    internal val trailingSuffixBodyColor: Color,
    internal val trailingIconColor: Color,
    internal val dividerColor: Color
) {

    /**
     * Creates a copy of this [ListItemColors] instance with the specified properties.
     */
    fun copy(
        leadingIconColor: Color = this.leadingIconColor,
        leadingAvatarColors: AvatarColors = this.leadingAvatarColors,
        leadingImageColors: ImageColors = this.leadingImageColors,
        leadingSwitchColors: SwitchColors = this.leadingSwitchColors,
        leadingCheckboxColors: CheckboxToggleColors = this.leadingCheckboxColors,
        leadingRadioButtonColors: RadioButtonToggleColors = this.leadingRadioButtonColors,
        leadingIconButtonColors: IconButtonColors = this.leadingIconButtonColors,
        titleColor: Color = this.titleColor,
        bodyColor: Color = this.bodyColor,
        subheadColor: Color = this.subheadColor,
        newLabelColor: Color = this.newLabelColor,
        newLabelContainerColor: Color = this.newLabelContainerColor,
        trailingSwitchColors: SwitchColors = this.trailingSwitchColors,
        trailingButtonColors: ButtonColors = this.trailingButtonColors,
        trailingIconButtonColors: IconButtonColors = this.trailingIconButtonColors,
        trailingCounterColors: CounterColors = this.trailingCounterColors,
        trailingRadioButtonColors: RadioButtonToggleColors = this.trailingRadioButtonColors,
        trailingCheckboxToggleColors: CheckboxToggleColors = this.trailingCheckboxToggleColors,
        trailingSuffixColor: Color = this.trailingSuffixColor,
        trailingSuffixBodyColor: Color = this.trailingSuffixBodyColor,
        trailingIconColor: Color = this.trailingIconColor,
        dividerColor: Color = this.dividerColor
    ) = ListItemColors(
        leadingIconColor = leadingIconColor,
        leadingAvatarColors = leadingAvatarColors,
        leadingImageColors = leadingImageColors,
        leadingSwitchColors = leadingSwitchColors,
        leadingCheckboxColors = leadingCheckboxColors,
        leadingRadioButtonColors = leadingRadioButtonColors,
        leadingIconButtonColors = leadingIconButtonColors,
        titleColor = titleColor,
        bodyColor = bodyColor,
        subheadColor = subheadColor,
        newLabelColor = newLabelColor,
        newLabelContainerColor = newLabelContainerColor,
        trailingSwitchColors = trailingSwitchColors,
        trailingButtonColors = trailingButtonColors,
        trailingIconButtonColors = trailingIconButtonColors,
        trailingCounterColors = trailingCounterColors,
        trailingRadioButtonColors = trailingRadioButtonColors,
        trailingCheckboxToggleColors = trailingCheckboxToggleColors,
        trailingSuffixColor = trailingSuffixColor,
        trailingSuffixBodyColor = trailingSuffixBodyColor,
        trailingIconColor = trailingIconColor,
        dividerColor = dividerColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ListItemColors) return false

        if (leadingIconColor != other.leadingIconColor) return false
        if (leadingAvatarColors != other.leadingAvatarColors) return false
        if (leadingImageColors != other.leadingImageColors) return false
        if (leadingSwitchColors != other.leadingSwitchColors) return false
        if (leadingCheckboxColors != other.leadingCheckboxColors) return false
        if (leadingRadioButtonColors != other.leadingRadioButtonColors) return false
        if (leadingIconButtonColors != other.leadingIconButtonColors) return false
        if (titleColor != other.titleColor) return false
        if (bodyColor != other.bodyColor) return false
        if (subheadColor != other.subheadColor) return false
        if (newLabelColor != other.newLabelColor) return false
        if (newLabelContainerColor != other.newLabelContainerColor) return false
        if (trailingSwitchColors != other.trailingSwitchColors) return false
        if (trailingButtonColors != other.trailingButtonColors) return false
        if (trailingIconButtonColors != other.trailingIconButtonColors) return false
        if (trailingCounterColors != other.trailingCounterColors) return false
        if (trailingRadioButtonColors != other.trailingRadioButtonColors) return false
        if (trailingCheckboxToggleColors != other.trailingCheckboxToggleColors) return false
        if (trailingSuffixColor != other.trailingSuffixColor) return false
        if (trailingSuffixBodyColor != other.trailingSuffixBodyColor) return false
        if (trailingIconColor != other.trailingIconColor) return false
        return dividerColor == other.dividerColor
    }

    override fun hashCode(): Int {
        var result = leadingIconColor.hashCode()
        result = 31 * result + leadingAvatarColors.hashCode()
        result = 31 * result + leadingImageColors.hashCode()
        result = 31 * result + titleColor.hashCode()
        result = 31 * result + bodyColor.hashCode()
        result = 31 * result + subheadColor.hashCode()
        result = 31 * result + newLabelColor.hashCode()
        result = 31 * result + newLabelContainerColor.hashCode()
        result = 31 * result + trailingSwitchColors.hashCode()
        result = 31 * result + trailingButtonColors.hashCode()
        result = 31 * result + trailingIconButtonColors.hashCode()
        result = 31 * result + trailingCounterColors.hashCode()
        result = 31 * result + trailingRadioButtonColors.hashCode()
        result = 31 * result + trailingCheckboxToggleColors.hashCode()
        result = 31 * result + trailingSuffixColor.hashCode()
        result = 31 * result + trailingSuffixBodyColor.hashCode()
        result = 31 * result + trailingIconColor.hashCode()
        result = 31 * result + dividerColor.hashCode()
        return result
    }
}

/**
 * Immutable class representing the sizes for various components within a list item.
 *
 * This class encapsulates the sizes for different UI elements such as icons, images, text styles,
 * buttons, and dividers. It provides a way to customize the appearance of a list item by specifying
 * the sizes for each component.
 *
 * @property shape The shape of the list item.
 * @property leadingIconSizes The sizes for the icon in the left section.
 * @property leadingImageSizes The sizes for the image in the left section.
 * @property leadingAvatarSizes The sizes for the avatar in the left section.
 * @property titleTextStyle The text style for the title in the middle section.
 * @property bodyTextStyle The text style for the body text in the middle section.
 * @property subheadTextStyle The text style for the subhead text in the middle section.
 * @property newLabelTextStyle The text style for the new label in the middle section.
 * @property newLabelShape The shape for the new label in the middle section.
 * @property trailingIconSizes The sizes for the icon in the right section.
 * @property trailingSwitchSizes The sizes for the switch in the right section.
 * @property trailingCounterSizes The sizes for the counter in the right section.
 * @property trailingSuffixTextStyle The text style for the suffix text in the right section.
 * @property trailingButtonSizes The sizes for the button in the right section.
 * @property trailingIconButtonSizes The sizes for the icon button in the right section.
 * @property trailingCheckboxSizes The sizes for the checkbox in the right section.
 * @property trailingRadioButtonSizes The sizes for the radio button in the right section.
 * @property dividerSizes The sizes for the divider.
 */
@Immutable
class ListItemSizes(
    internal val shape: Shape,

    internal val leadingImageSizes: ImageSizes,
    internal val leadingAvatarSizes: AvatarSizes,
    internal val leadingIconSizes: IconSizes,
    internal val leadingSwitchSizes: SwitchSizes,
    internal val leadingCheckboxSizes: CheckboxSizes,
    internal val leadingRadioButtonSizes: RadioButtonSizes,
    internal val leadingIconButtonSizes: IconButtonSizes,

    internal val titleTextStyle: TextStyle,
    internal val bodyTextStyle: TextStyle,
    internal val subheadTextStyle: TextStyle,
    internal val newLabelTextStyle: TextStyle,
    internal val newLabelShape: Shape,

    internal val trailingIconSizes: IconSizes,
    internal val trailingSwitchSizes: SwitchSizes,
    internal val trailingCounterSizes: CounterSizes,
    internal val trailingSuffixTextStyle: TextStyle,
    internal val trailingSuffixBodyTextStyle: TextStyle,
    internal val trailingButtonSizes: ButtonSizes,
    internal val trailingIconButtonSizes: IconButtonSizes,
    internal val trailingCheckboxSizes: CheckboxSizes,
    internal val trailingRadioButtonSizes: RadioButtonSizes,

    internal val dividerSizes: DividerSizes
) {
    /**
     * Creates a copy of this [ListItemSizes] instance with the specified properties.
     */
    fun copy(
        shape: Shape = this.shape,

        leadingIconSizes: IconSizes = this.leadingIconSizes,
        leadingImageSizes: ImageSizes = this.leadingImageSizes,
        leadingAvatarSizes: AvatarSizes = this.leadingAvatarSizes,
        leadingSwitchSizes: SwitchSizes = this.leadingSwitchSizes,
        leadingCheckboxSizes: CheckboxSizes = this.leadingCheckboxSizes,
        leadingRadioButtonSizes: RadioButtonSizes = this.leadingRadioButtonSizes,
        leadingIconButtonSizes: IconButtonSizes = this.leadingIconButtonSizes,

        titleTextStyle: TextStyle = this.titleTextStyle,
        bodyTextStyle: TextStyle = this.bodyTextStyle,
        subheadTextStyle: TextStyle = this.subheadTextStyle,
        newLabelTextStyle: TextStyle = this.newLabelTextStyle,
        newLabelShape: Shape = this.newLabelShape,

        trailingIconSizes: IconSizes = this.trailingIconSizes,
        trailingSwitchSizes: SwitchSizes = this.trailingSwitchSizes,
        trailingCounterSizes: CounterSizes = this.trailingCounterSizes,
        trailingSuffixTextStyle: TextStyle = this.trailingSuffixTextStyle,
        trailingSuffixBodyTextStyle: TextStyle = this.trailingSuffixBodyTextStyle,
        trailingButtonSizes: ButtonSizes = this.trailingButtonSizes,
        trailingIconButtonSizes: IconButtonSizes = this.trailingIconButtonSizes,
        trailingCheckboxSizes: CheckboxSizes = this.trailingCheckboxSizes,
        trailingRadioButtonSizes: RadioButtonSizes = this.trailingRadioButtonSizes,

        dividerSizes: DividerSizes = this.dividerSizes,
    ) = ListItemSizes(
        shape = shape,

        leadingIconSizes = leadingIconSizes,
        leadingImageSizes = leadingImageSizes,
        leadingAvatarSizes = leadingAvatarSizes,
        leadingSwitchSizes = leadingSwitchSizes,
        leadingCheckboxSizes = leadingCheckboxSizes,
        leadingRadioButtonSizes = leadingRadioButtonSizes,
        leadingIconButtonSizes = leadingIconButtonSizes,

        titleTextStyle = titleTextStyle,
        bodyTextStyle = bodyTextStyle,
        subheadTextStyle = subheadTextStyle,
        newLabelTextStyle = newLabelTextStyle,
        newLabelShape = newLabelShape,

        trailingIconSizes = trailingIconSizes,
        trailingSwitchSizes = trailingSwitchSizes,
        trailingCounterSizes = trailingCounterSizes,
        trailingSuffixTextStyle = trailingSuffixTextStyle,
        trailingSuffixBodyTextStyle = trailingSuffixBodyTextStyle,
        trailingButtonSizes = trailingButtonSizes,
        trailingIconButtonSizes = trailingIconButtonSizes,
        trailingCheckboxSizes = trailingCheckboxSizes,
        trailingRadioButtonSizes = trailingRadioButtonSizes,

        dividerSizes = dividerSizes
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ListItemSizes) return false

        if (shape != other.shape) return false

        if (leadingIconSizes != other.leadingIconSizes) return false
        if (leadingImageSizes != other.leadingImageSizes) return false
        if (leadingAvatarSizes != other.leadingAvatarSizes) return false
        if (leadingSwitchSizes != other.leadingSwitchSizes) return false
        if (leadingCheckboxSizes != other.leadingCheckboxSizes) return false
        if (leadingRadioButtonSizes != other.leadingRadioButtonSizes) return false
        if (leadingIconButtonSizes != other.leadingIconButtonSizes) return false

        if (titleTextStyle != other.titleTextStyle) return false
        if (bodyTextStyle != other.bodyTextStyle) return false
        if (subheadTextStyle != other.subheadTextStyle) return false
        if (newLabelTextStyle != other.newLabelTextStyle) return false
        if (newLabelShape != other.newLabelShape) return false

        if (trailingIconSizes != other.trailingIconSizes) return false
        if (trailingSwitchSizes != other.trailingSwitchSizes) return false
        if (trailingCounterSizes != other.trailingCounterSizes) return false
        if (trailingSuffixTextStyle != other.trailingSuffixTextStyle) return false
        if (trailingSuffixBodyTextStyle != other.trailingSuffixBodyTextStyle) return false
        if (trailingButtonSizes != other.trailingButtonSizes) return false
        if (trailingIconButtonSizes != other.trailingIconButtonSizes) return false
        if (trailingCheckboxSizes != other.trailingCheckboxSizes) return false
        if (trailingRadioButtonSizes != other.trailingRadioButtonSizes) return false

        return dividerSizes == other.dividerSizes
    }

    override fun hashCode(): Int {
        var result = shape.hashCode()

        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + leadingImageSizes.hashCode()
        result = 31 * result + leadingAvatarSizes.hashCode()
        result = 31 * result + leadingSwitchSizes.hashCode()
        result = 31 * result + leadingCheckboxSizes.hashCode()
        result = 31 * result + leadingRadioButtonSizes.hashCode()
        result = 31 * result + leadingIconButtonSizes.hashCode()

        result = 31 * result + titleTextStyle.hashCode()
        result = 31 * result + bodyTextStyle.hashCode()
        result = 31 * result + subheadTextStyle.hashCode()
        result = 31 * result + newLabelTextStyle.hashCode()
        result = 31 * result + newLabelShape.hashCode()

        result = 31 * result + trailingIconSizes.hashCode()
        result = 31 * result + trailingSwitchSizes.hashCode()
        result = 31 * result + trailingCounterSizes.hashCode()
        result = 31 * result + trailingSuffixTextStyle.hashCode()
        result = 31 * result + trailingSuffixBodyTextStyle.hashCode()
        result = 31 * result + trailingButtonSizes.hashCode()
        result = 31 * result + trailingIconButtonSizes.hashCode()
        result = 31 * result + trailingCheckboxSizes.hashCode()
        result = 31 * result + trailingRadioButtonSizes.hashCode()

        result = 31 * result + dividerSizes.hashCode()
        return result
    }
}