package io.github.madmaximuus.persian.listItem

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.AvatarColors
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSizes
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.checkboxes.CheckboxDefaults
import io.github.madmaximuus.persian.checkboxes.CheckboxSizes
import io.github.madmaximuus.persian.checkboxes.CheckboxToggleColors
import io.github.madmaximuus.persian.counter.CounterColors
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.CounterSizes
import io.github.madmaximuus.persian.dividers.DividerDefaults
import io.github.madmaximuus.persian.dividers.DividerSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
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
     * @param disabledTitleColor The color of the title text when disabled.
     * @param bodyColor The color of the body text when enabled.
     * @param disabledBodyColor The color of the body text when disabled.
     * @param subheadColor The color of the subhead text when enabled.
     * @param disabledSubheadColor The color of the subhead text when disabled.
     * @param newLabelColor The color of the new label text when enabled.
     * @param disabledNewLabelColor The color of the new label text when disabled.
     * @param newLabelContainerColor The background color of the new label container when enabled.
     * @param disabledNewLabelContainerColor The background color of the new label container when disabled.
     * @param editRadioButtonColors The colors for the radio button in the edit section.
     * @param editCheckboxToggleColors The colors for the checkbox in the edit section.
     * @param editAddColor The colors for the add icon button in the edit section.
     * @param editRemoveColor The colors for the remove icon button in the edit section.
     * @param editDragColor The color of the drag icon in the edit section when enabled.
     * @param disabledEditDragColor The color of the drag icon in the edit section when disabled.
     * @param leftIconColor The color of the icon in the left section when enabled.
     * @param disabledLeftIconColor The color of the icon in the left section when disabled.
     * @param leftAvatarColors The colors for the avatar in the left section.
     * @param leftImageColors The colors for the image in the left section.
     * @param rightSwitchColors The colors for the switch in the right section.
     * @param rightButtonColors The colors for the button in the right section.
     * @param rightIconButtonColors The colors for the icon button in the right section.
     * @param rightCounterColors The colors for the counter in the right section.
     * @param rightRadioButtonColors The colors for the radio button in the right section.
     * @param rightCheckboxToggleColors The colors for the checkbox in the right section.
     * @param rightSuffixColor The color of the suffix text in the right section when enabled.
     * @param disabledRightSuffixColor The color of the suffix text in the right section when disabled.
     * @param rightIconColor The color of the icon in the right section when enabled.
     * @param disabledRightIconColor The color of the icon in the right section when disabled.
     * @param dividerColor The color of the divider.
     */
    @Composable
    fun colors(
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        disabledTitleColor: Color = PersianTheme.colorScheme.onSurface.state38,

        bodyColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledBodyColor: Color = PersianTheme.colorScheme.onSurface.state38,

        subheadColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledSubheadColor: Color = PersianTheme.colorScheme.onSurface.state38,

        newLabelColor: Color = PersianTheme.colorScheme.onValid,
        disabledNewLabelColor: Color = PersianTheme.colorScheme.onValid.state38,

        newLabelContainerColor: Color = PersianTheme.colorScheme.valid,
        disabledNewLabelContainerColor: Color = PersianTheme.colorScheme.valid.state38,

        editRadioButtonColors: RadioButtonToggleColors = RadioButtonDefaults.toggleColors(),
        editCheckboxToggleColors: CheckboxToggleColors = CheckboxDefaults.toggleColors(),
        editAddColor: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(),
        editRemoveColor: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(),

        editDragColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledEditDragColor: Color = PersianTheme.colorScheme.onSurface.state38,

        leftIconColor: Color = PersianTheme.colorScheme.primary,
        disabledLeftIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        leftAvatarColors: AvatarColors = AvatarDefaults.colors(),
        leftImageColors: ImageColors = ImageDefaults.colors(),

        rightSwitchColors: SwitchColors = SwitchDefaults.colors(),
        rightButtonColors: ButtonColors = ButtonDefaults.primaryColors(),
        rightIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(),
        rightCounterColors: CounterColors = CounterDefaults.primaryColors(),
        rightRadioButtonColors: RadioButtonToggleColors = RadioButtonDefaults.toggleColors(),
        rightCheckboxToggleColors: CheckboxToggleColors = CheckboxDefaults.toggleColors(),

        rightSuffixColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledRightSuffixColor: Color = PersianTheme.colorScheme.onSurface.state38,

        rightIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledRightIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        dividerColor: Color = PersianTheme.colorScheme.outlineVariant
    ): ListItemColors =
        ListItemColors(
            titleColor = titleColor,
            disabledTitleColor = disabledTitleColor,

            bodyColor = bodyColor,
            disabledBodyColor = disabledBodyColor,

            subheadColor = subheadColor,
            disabledSubheadColor = disabledSubheadColor,

            newLabelColor = newLabelColor,
            disabledNewLabelColor = disabledNewLabelColor,

            newLabelContainerColor = newLabelContainerColor,
            disabledNewLabelContainerColor = disabledNewLabelContainerColor,

            editRadioButtonColors = editRadioButtonColors,
            editCheckboxToggleColors = editCheckboxToggleColors,
            editAddColors = editAddColor,
            editRemoveColors = editRemoveColor,

            editDragColor = editDragColor,
            disabledEditDragColor = disabledEditDragColor,

            leftIconColor = leftIconColor,
            disabledLeftIconColor = disabledLeftIconColor,

            leftAvatarColors = leftAvatarColors,
            leftImageColors = leftImageColors,

            rightSwitchColors = rightSwitchColors,
            rightButtonColors = rightButtonColors,
            rightIconButtonColors = rightIconButtonColors,
            rightCounterColors = rightCounterColors,
            rightRadioButtonColors = rightRadioButtonColors,
            rightCheckboxToggleColors = rightCheckboxToggleColors,

            rightSuffixColor = rightSuffixColor,
            disabledRightSuffixColor = disabledRightSuffixColor,

            rightIconColor = rightIconColor,
            disabledRightIconColor = disabledRightIconColor,

            dividerColor = dividerColor
        )

    /**
     * Create a [ListItemSizes] instance with the specified sizes.
     *
     * @param shape The shape of the list item.
     * @param editDragIconSizes The sizes for the drag icon in the edit section.
     * @param editCheckboxSizes The sizes for the checkbox in the edit section.
     * @param editRadioButtonSizes The sizes for the radio button in the edit section.
     * @param editAddIconButtonSizes The sizes for the add icon button in the edit section.
     * @param editRemoveIconButtonSizes The sizes for the remove icon button in the edit section.
     * @param leftIconSizes The sizes for the icon in the left section.
     * @param leftImageSizes The sizes for the image in the left section.
     * @param leftAvatarSizes The sizes for the avatar in the left section.
     * @param titleTextStyle The text style for the title in the middle section.
     * @param bodyTextStyle The text style for the body text in the middle section.
     * @param subheadTextStyle The text style for the subhead text in the middle section.
     * @param newLabelTextStyle The text style for the new label in the middle section.
     * @param newLabelShape The shape for the new label in the middle section.
     * @param rightIconSizes The sizes for the icon in the right section.
     * @param rightSwitchSizes The sizes for the switch in the right section.
     * @param rightCounterSizes The sizes for the counter in the right section.
     * @param rightSuffixTextStyle The text style for the suffix text in the right section.
     * @param rightButtonSizes The sizes for the button in the right section.
     * @param rightIconButtonSizes The sizes for the icon button in the right section.
     * @param rightCheckboxSizes The sizes for the checkbox in the right section.
     * @param rightRadioButtonSizes The sizes for the radio button in the right section.
     * @param dividerSizes The sizes for the divider.
     */
    @Composable
    fun sizes(
        shape: Shape = RoundedCornerShape(0.dp),

        editDragIconSizes: IconSizes = IconDefaults.size24(),
        editCheckboxSizes: CheckboxSizes = CheckboxDefaults.sizes(),
        editRadioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes(),
        editAddIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),
        editRemoveIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),

        leftIconSizes: IconSizes = IconDefaults.size28(),
        leftImageSizes: ImageSizes = ImageDefaults.size44(),
        leftAvatarSizes: AvatarSizes = AvatarDefaults.size40(),

        titleTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        bodyTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        subheadTextStyle: TextStyle = PersianTheme.typography.labelMedium,
        newLabelTextStyle: TextStyle = PersianTheme.typography.labelSmall,
        newLabelShape: Shape = PersianTheme.shapes.shape4,

        rightIconSizes: IconSizes = IconDefaults.size24(),
        rightSwitchSizes: SwitchSizes = SwitchDefaults.sizes(),
        rightCounterSizes: CounterSizes = CounterDefaults.sizes(),
        rightSuffixTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        rightButtonSizes: ButtonSizes = ButtonDefaults.smallSizes(),
        rightIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),
        rightCheckboxSizes: CheckboxSizes = CheckboxDefaults.sizes(),
        rightRadioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes(),

        dividerSizes: DividerSizes = DividerDefaults.sizes(),
    ): ListItemSizes =
        ListItemSizes(
            shape = shape,

            editDragIconSizes = editDragIconSizes,
            editCheckboxSizes = editCheckboxSizes,
            editRadioButtonSizes = editRadioButtonSizes,
            editAddIconButtonSizes = editAddIconButtonSizes,
            editRemoveIconButtonSizes = editRemoveIconButtonSizes,

            leftIconSizes = leftIconSizes,
            leftImageSizes = leftImageSizes,
            leftAvatarSizes = leftAvatarSizes,

            titleTextStyle = titleTextStyle,
            bodyTextStyle = bodyTextStyle,
            subheadTextStyle = subheadTextStyle,
            newLabelTextStyle = newLabelTextStyle,
            newLabelShape = newLabelShape,

            rightIconSizes = rightIconSizes,
            rightSwitchSizes = rightSwitchSizes,
            rightCounterSizes = rightCounterSizes,
            rightSuffixTextStyle = rightSuffixTextStyle,
            rightButtonSizes = rightButtonSizes,
            rightIconButtonSizes = rightIconButtonSizes,
            rightCheckboxSizes = rightCheckboxSizes,
            rightRadioButtonSizes = rightRadioButtonSizes,

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
 * @property disabledTitleColor The color of the title text when disabled.
 * @property bodyColor The color of the body text when enabled.
 * @property disabledBodyColor The color of the body text when disabled.
 * @property subheadColor The color of the subhead text when enabled.
 * @property disabledSubheadColor The color of the subhead text when disabled.
 * @property newLabelColor The color of the new label text when enabled.
 * @property disabledNewLabelColor The color of the new label text when disabled.
 * @property newLabelContainerColor The background color of the new label container when enabled.
 * @property disabledNewLabelContainerColor The background color of the new label container when disabled.
 * @property editDragColor The color of the drag icon in the edit section when enabled.
 * @property disabledEditDragColor The color of the drag icon in the edit section when disabled.
 * @property editRadioButtonColors The colors for the radio button in the edit section.
 * @property editCheckboxToggleColors The colors for the checkbox in the edit section.
 * @property editAddColors The colors for the add icon button in the edit section.
 * @property editRemoveColors The colors for the remove icon button in the edit section.
 * @property leftIconColor The color of the icon in the left section when enabled.
 * @property disabledLeftIconColor The color of the icon in the left section when disabled.
 * @property leftAvatarColors The colors for the avatar in the left section.
 * @property leftImageColors The colors for the image in the left section.
 * @property rightSwitchColors The colors for the switch in the right section.
 * @property rightButtonColors The colors for the button in the right section.
 * @property rightIconButtonColors The colors for the icon button in the right section.
 * @property rightCounterColors The colors for the counter in the right section.
 * @property rightRadioButtonColors The colors for the radio button in the right section.
 * @property rightCheckboxToggleColors The colors for the checkbox in the right section.
 * @property rightSuffixColor The color of the suffix text in the right section when enabled.
 * @property disabledRightSuffixColor The color of the suffix text in the right section when disabled.
 * @property rightIconColor The color of the icon in the right section when enabled.
 * @property disabledRightIconColor The color of the icon in the right section when disabled.
 * @property dividerColor The color of the divider.
 */
@Immutable
class ListItemColors(
    private val titleColor: Color,
    private val disabledTitleColor: Color,

    private val bodyColor: Color,
    private val disabledBodyColor: Color,

    private val subheadColor: Color,
    private val disabledSubheadColor: Color,

    private val newLabelColor: Color,
    private val disabledNewLabelColor: Color,

    private val newLabelContainerColor: Color,
    private val disabledNewLabelContainerColor: Color,

    private val editDragColor: Color,
    private val disabledEditDragColor: Color,

    internal val editRadioButtonColors: RadioButtonToggleColors,
    internal val editCheckboxToggleColors: CheckboxToggleColors,
    internal val editAddColors: IconButtonColors,
    internal val editRemoveColors: IconButtonColors,

    private val leftIconColor: Color,
    private val disabledLeftIconColor: Color,

    internal val leftAvatarColors: AvatarColors,
    internal val leftImageColors: ImageColors,

    internal val rightSwitchColors: SwitchColors,
    internal val rightButtonColors: ButtonColors,
    internal val rightIconButtonColors: IconButtonColors,
    internal val rightCounterColors: CounterColors,
    internal val rightRadioButtonColors: RadioButtonToggleColors,
    internal val rightCheckboxToggleColors: CheckboxToggleColors,

    private val rightSuffixColor: Color,
    private val disabledRightSuffixColor: Color,

    private val rightIconColor: Color,
    private val disabledRightIconColor: Color,

    internal val dividerColor: Color
) {
    /**
     * Returns the color of the title text based on the enabled state.
     *
     * @param enabled A boolean indicating whether the title text is enabled.
     */
    @Stable
    fun titleColor(enabled: Boolean): Color =
        if (enabled) titleColor else disabledTitleColor

    /**
     * Returns the color of the body text based on the enabled state.
     *
     * @param enabled A boolean indicating whether the body text is enabled.
     */
    @Stable
    fun bodyColor(enabled: Boolean): Color =
        if (enabled) bodyColor else disabledBodyColor

    /**
     * Returns the color of the subhead text based on the enabled state.
     *
     * @param enabled A boolean indicating whether the subhead text is enabled.
     */
    @Stable
    fun subheadColor(enabled: Boolean): Color =
        if (enabled) subheadColor else disabledSubheadColor

    /**
     * Returns the color of the new label text based on the enabled state.
     *
     * @param enabled A boolean indicating whether the new label text is enabled.
     */
    @Stable
    fun newLabelColor(enabled: Boolean): Color =
        if (enabled) newLabelColor else disabledNewLabelColor

    /**
     * Returns the background color of the new label container based on the enabled state.
     *
     * @param enabled A boolean indicating whether the new label container is enabled.
     */
    @Stable
    fun newLabelContainerColor(enabled: Boolean): Color =
        if (enabled) newLabelContainerColor else disabledNewLabelContainerColor

    /**
     * Returns the color of the drag icon based on the enabled state.
     *
     * @param enabled A boolean indicating whether the drag icon is enabled.
     */
    @Stable
    fun dragColor(enabled: Boolean): Color =
        if (enabled) editDragColor else disabledEditDragColor

    /**
     * Returns the color of the icon in the left section based on the enabled state.
     *
     * @param enabled A boolean indicating whether the left icon is enabled.
     */
    @Stable
    fun leftIconColor(enabled: Boolean): Color =
        if (enabled) leftIconColor else disabledLeftIconColor

    /**
     * Returns the color of the suffix text in the right section based on the enabled state.
     *
     * @param enabled A boolean indicating whether the suffix text is enabled.
     */
    @Stable
    fun suffixColor(enabled: Boolean): Color =
        if (enabled) rightSuffixColor else disabledRightSuffixColor

    /**
     * Returns the color of the icon in the right section based on the enabled state.
     *
     * @param enabled A boolean indicating whether the right icon is enabled.
     */
    @Stable
    fun rightIconColor(enabled: Boolean): Color =
        if (enabled) rightIconColor else disabledRightIconColor

    /**
     * Creates a copy of this [ListItemColors] instance with the specified properties.
     */
    fun copy(
        titleColor: Color = this.titleColor,
        disabledTitleColor: Color = this.disabledTitleColor,

        bodyColor: Color = this.bodyColor,
        disabledBodyColor: Color = this.disabledBodyColor,

        subheadColor: Color = this.subheadColor,
        disabledSubheadColor: Color = this.disabledSubheadColor,

        newLabelColor: Color = this.newLabelColor,
        disabledNewLabelColor: Color = this.disabledNewLabelColor,

        newLabelContainerColor: Color = this.newLabelContainerColor,
        disabledNewLabelContainerColor: Color = this.disabledNewLabelContainerColor,

        editDragColor: Color = this.editDragColor,
        disabledEditDragColor: Color = this.disabledEditDragColor,

        editRadioButtonColors: RadioButtonToggleColors = this.editRadioButtonColors,
        editCheckboxToggleColors: CheckboxToggleColors = this.editCheckboxToggleColors,
        editAddColors: IconButtonColors = this.editAddColors,
        editRemoveColors: IconButtonColors = this.editRemoveColors,

        leftIconColor: Color = this.leftIconColor,
        disabledLeftIconColor: Color = this.disabledLeftIconColor,

        leftAvatarColors: AvatarColors = this.leftAvatarColors,
        leftImageColors: ImageColors = this.leftImageColors,

        rightSwitchColors: SwitchColors = this.rightSwitchColors,
        rightButtonColors: ButtonColors = this.rightButtonColors,
        rightIconButtonColors: IconButtonColors = this.rightIconButtonColors,
        rightCounterColors: CounterColors = this.rightCounterColors,
        rightRadioButtonColors: RadioButtonToggleColors = this.rightRadioButtonColors,
        rightCheckboxToggleColors: CheckboxToggleColors = this.rightCheckboxToggleColors,

        rightSuffixColor: Color = this.rightSuffixColor,
        disabledRightSuffixColor: Color = this.disabledRightSuffixColor,

        rightIconColor: Color = this.rightIconColor,
        disabledRightIconColor: Color = this.disabledRightIconColor,

        dividerColor: Color = this.dividerColor
    ): ListItemColors =
        ListItemColors(
            titleColor = titleColor.takeOrElse { this.titleColor },
            disabledTitleColor = disabledTitleColor.takeOrElse { this.disabledTitleColor },

            bodyColor = bodyColor.takeOrElse { this.bodyColor },
            disabledBodyColor = disabledBodyColor.takeOrElse { this.disabledBodyColor },

            subheadColor = subheadColor.takeOrElse { this.subheadColor },
            disabledSubheadColor = disabledSubheadColor.takeOrElse { this.disabledSubheadColor },

            newLabelColor = newLabelColor.takeOrElse { this.newLabelColor },
            disabledNewLabelColor = disabledNewLabelColor.takeOrElse { this.disabledNewLabelColor },

            newLabelContainerColor = newLabelContainerColor.takeOrElse { this.newLabelContainerColor },
            disabledNewLabelContainerColor = disabledNewLabelContainerColor.takeOrElse { this.disabledNewLabelContainerColor },

            editDragColor = editDragColor.takeOrElse { this.editDragColor },
            disabledEditDragColor = disabledEditDragColor.takeOrElse { this.disabledEditDragColor },

            editRadioButtonColors = editRadioButtonColors,
            editCheckboxToggleColors = editCheckboxToggleColors,
            editAddColors = editAddColors,
            editRemoveColors = editRemoveColors,

            leftIconColor = leftIconColor.takeOrElse { this.leftIconColor },
            disabledLeftIconColor = disabledLeftIconColor.takeOrElse { this.disabledLeftIconColor },

            leftAvatarColors = leftAvatarColors,
            leftImageColors = leftImageColors,

            rightSwitchColors = rightSwitchColors,
            rightButtonColors = rightButtonColors,
            rightIconButtonColors = rightIconButtonColors,
            rightCounterColors = rightCounterColors,
            rightRadioButtonColors = rightRadioButtonColors,
            rightCheckboxToggleColors = rightCheckboxToggleColors,

            rightSuffixColor = rightSuffixColor,
            disabledRightSuffixColor = disabledRightSuffixColor,

            rightIconColor = rightIconColor,
            disabledRightIconColor = disabledRightIconColor,

            dividerColor = dividerColor
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ListItemColors) return false

        if (titleColor != other.titleColor) return false
        if (disabledTitleColor != other.disabledTitleColor) return false

        if (bodyColor != other.bodyColor) return false
        if (disabledBodyColor != other.disabledBodyColor) return false

        if (subheadColor != other.subheadColor) return false
        if (disabledSubheadColor != other.disabledSubheadColor) return false

        if (newLabelColor != other.newLabelColor) return false
        if (disabledNewLabelColor != other.disabledNewLabelColor) return false

        if (newLabelContainerColor != other.newLabelContainerColor) return false
        if (disabledNewLabelContainerColor != other.disabledNewLabelContainerColor) return false

        if (editDragColor != other.editDragColor) return false
        if (disabledEditDragColor != other.disabledEditDragColor) return false

        if (editRadioButtonColors != other.editRadioButtonColors) return false
        if (editCheckboxToggleColors != other.editCheckboxToggleColors) return false
        if (editAddColors != other.editAddColors) return false
        if (editRemoveColors != other.editRemoveColors) return false

        if (leftIconColor != other.leftIconColor) return false
        if (disabledLeftIconColor != other.disabledLeftIconColor) return false

        if (leftAvatarColors != other.leftAvatarColors) return false
        if (leftImageColors != other.leftImageColors) return false

        if (rightSwitchColors != other.rightSwitchColors) return false
        if (rightButtonColors != other.rightButtonColors) return false
        if (rightIconButtonColors != other.rightIconButtonColors) return false
        if (rightCounterColors != other.rightCounterColors) return false
        if (rightRadioButtonColors != other.rightRadioButtonColors) return false
        if (rightCheckboxToggleColors != other.rightCheckboxToggleColors) return false

        if (rightSuffixColor != other.rightSuffixColor) return false
        if (disabledRightSuffixColor != other.disabledRightSuffixColor) return false

        if (rightIconColor != other.rightIconColor) return false
        if (disabledRightIconColor != other.disabledRightIconColor) return false
        return dividerColor == other.dividerColor
    }

    override fun hashCode(): Int {
        var result = titleColor.hashCode()
        result = 31 * result + disabledTitleColor.hashCode()

        result = 31 * result + bodyColor.hashCode()
        result = 31 * result + disabledBodyColor.hashCode()

        result = 31 * result + subheadColor.hashCode()
        result = 31 * result + disabledSubheadColor.hashCode()

        result = 31 * result + newLabelColor.hashCode()
        result = 31 * result + disabledNewLabelColor.hashCode()

        result = 31 * result + newLabelContainerColor.hashCode()
        result = 31 * result + disabledNewLabelContainerColor.hashCode()

        result = 31 * result + editDragColor.hashCode()
        result = 31 * result + disabledEditDragColor.hashCode()

        result = 31 * result + editRadioButtonColors.hashCode()
        result = 31 * result + editCheckboxToggleColors.hashCode()
        result = 31 * result + editAddColors.hashCode()
        result = 31 * result + editRemoveColors.hashCode()

        result = 31 * result + leftIconColor.hashCode()
        result = 31 * result + disabledLeftIconColor.hashCode()

        result = 31 * result + leftAvatarColors.hashCode()
        result = 31 * result + leftImageColors.hashCode()

        result = 31 * result + rightSwitchColors.hashCode()
        result = 31 * result + rightButtonColors.hashCode()
        result = 31 * result + rightIconButtonColors.hashCode()
        result = 31 * result + rightCounterColors.hashCode()
        result = 31 * result + rightRadioButtonColors.hashCode()
        result = 31 * result + rightCheckboxToggleColors.hashCode()

        result = 31 * result + rightSuffixColor.hashCode()
        result = 31 * result + disabledRightSuffixColor.hashCode()

        result = 31 * result + rightIconColor.hashCode()
        result = 31 * result + disabledRightIconColor.hashCode()
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
 * @property editDragIconSizes The sizes for the drag icon in the edit section.
 * @property editCheckboxSizes The sizes for the checkbox in the edit section.
 * @property editRadioButtonSizes The sizes for the radio button in the edit section.
 * @property editAddIconButtonSizes The sizes for the add icon button in the edit section.
 * @property editRemoveIconButtonSizes The sizes for the remove icon button in the edit section.
 * @property leftIconSizes The sizes for the icon in the left section.
 * @property leftImageSizes The sizes for the image in the left section.
 * @property leftAvatarSizes The sizes for the avatar in the left section.
 * @property titleTextStyle The text style for the title in the middle section.
 * @property bodyTextStyle The text style for the body text in the middle section.
 * @property subheadTextStyle The text style for the subhead text in the middle section.
 * @property newLabelTextStyle The text style for the new label in the middle section.
 * @property newLabelShape The shape for the new label in the middle section.
 * @property rightIconSizes The sizes for the icon in the right section.
 * @property rightSwitchSizes The sizes for the switch in the right section.
 * @property rightCounterSizes The sizes for the counter in the right section.
 * @property rightSuffixTextStyle The text style for the suffix text in the right section.
 * @property rightButtonSizes The sizes for the button in the right section.
 * @property rightIconButtonSizes The sizes for the icon button in the right section.
 * @property rightCheckboxSizes The sizes for the checkbox in the right section.
 * @property rightRadioButtonSizes The sizes for the radio button in the right section.
 * @property dividerSizes The sizes for the divider.
 */
@Immutable
class ListItemSizes(
    internal val shape: Shape,

    internal val editDragIconSizes: IconSizes,
    internal val editCheckboxSizes: CheckboxSizes,
    internal val editRadioButtonSizes: RadioButtonSizes,
    internal val editAddIconButtonSizes: IconButtonSizes,
    internal val editRemoveIconButtonSizes: IconButtonSizes,

    internal val leftIconSizes: IconSizes,
    internal val leftImageSizes: ImageSizes,
    internal val leftAvatarSizes: AvatarSizes,

    internal val titleTextStyle: TextStyle,
    internal val bodyTextStyle: TextStyle,
    internal val subheadTextStyle: TextStyle,
    internal val newLabelTextStyle: TextStyle,
    internal val newLabelShape: Shape,

    internal val rightIconSizes: IconSizes,
    internal val rightSwitchSizes: SwitchSizes,
    internal val rightCounterSizes: CounterSizes,
    internal val rightSuffixTextStyle: TextStyle,
    internal val rightButtonSizes: ButtonSizes,
    internal val rightIconButtonSizes: IconButtonSizes,
    internal val rightCheckboxSizes: CheckboxSizes,
    internal val rightRadioButtonSizes: RadioButtonSizes,

    internal val dividerSizes: DividerSizes
) {
    /**
     * Creates a copy of this [ListItemSizes] instance with the specified properties.
     */
    fun copy(
        shape: Shape = this.shape,

        editDragIconSizes: IconSizes = this.editDragIconSizes,
        editCheckboxSizes: CheckboxSizes = this.editCheckboxSizes,
        editRadioButtonSizes: RadioButtonSizes = this.editRadioButtonSizes,
        editAddIconButtonSizes: IconButtonSizes = this.editAddIconButtonSizes,
        editRemoveIconButtonSizes: IconButtonSizes = this.editRemoveIconButtonSizes,

        leftIconSizes: IconSizes = this.leftIconSizes,
        leftImageSizes: ImageSizes = this.leftImageSizes,
        leftAvatarSizes: AvatarSizes = this.leftAvatarSizes,

        titleTextStyle: TextStyle = this.titleTextStyle,
        bodyTextStyle: TextStyle = this.bodyTextStyle,
        subheadTextStyle: TextStyle = this.subheadTextStyle,
        newLabelTextStyle: TextStyle = this.newLabelTextStyle,
        newLabelShape: Shape = this.newLabelShape,

        rightIconSizes: IconSizes = this.rightIconSizes,
        rightSwitchSizes: SwitchSizes = this.rightSwitchSizes,
        rightCounterSizes: CounterSizes = this.rightCounterSizes,
        rightSuffixTextStyle: TextStyle = this.rightSuffixTextStyle,
        rightButtonSizes: ButtonSizes = this.rightButtonSizes,
        rightIconButtonSizes: IconButtonSizes = this.rightIconButtonSizes,
        rightCheckboxSizes: CheckboxSizes = this.rightCheckboxSizes,
        rightRadioButtonSizes: RadioButtonSizes = this.rightRadioButtonSizes,

        dividerSizes: DividerSizes = this.dividerSizes,
    ): ListItemSizes =
        ListItemSizes(
            shape = shape,

            editDragIconSizes = editDragIconSizes,
            editCheckboxSizes = editCheckboxSizes,
            editRadioButtonSizes = editRadioButtonSizes,
            editAddIconButtonSizes = editAddIconButtonSizes,
            editRemoveIconButtonSizes = editRemoveIconButtonSizes,

            leftIconSizes = leftIconSizes,
            leftImageSizes = leftImageSizes,
            leftAvatarSizes = leftAvatarSizes,

            titleTextStyle = titleTextStyle,
            bodyTextStyle = bodyTextStyle,
            subheadTextStyle = subheadTextStyle,
            newLabelTextStyle = newLabelTextStyle,
            newLabelShape = newLabelShape,

            rightIconSizes = rightIconSizes,
            rightSwitchSizes = rightSwitchSizes,
            rightCounterSizes = rightCounterSizes,
            rightSuffixTextStyle = rightSuffixTextStyle,
            rightButtonSizes = rightButtonSizes,
            rightIconButtonSizes = rightIconButtonSizes,
            rightCheckboxSizes = rightCheckboxSizes,
            rightRadioButtonSizes = rightRadioButtonSizes,

            dividerSizes = dividerSizes
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ListItemSizes) return false

        if (shape != other.shape) return false

        if (editDragIconSizes != other.editDragIconSizes) return false
        if (editCheckboxSizes != other.editCheckboxSizes) return false
        if (editRadioButtonSizes != other.editRadioButtonSizes) return false
        if (editAddIconButtonSizes != other.editAddIconButtonSizes) return false
        if (editRemoveIconButtonSizes != other.editRemoveIconButtonSizes) return false

        if (leftIconSizes != other.leftIconSizes) return false
        if (leftImageSizes != other.leftImageSizes) return false
        if (leftAvatarSizes != other.leftAvatarSizes) return false

        if (titleTextStyle != other.titleTextStyle) return false
        if (bodyTextStyle != other.bodyTextStyle) return false
        if (subheadTextStyle != other.subheadTextStyle) return false
        if (newLabelTextStyle != other.newLabelTextStyle) return false
        if (newLabelShape != other.newLabelShape) return false

        if (rightIconSizes != other.rightIconSizes) return false
        if (rightSwitchSizes != other.rightSwitchSizes) return false
        if (rightCounterSizes != other.rightCounterSizes) return false
        if (rightSuffixTextStyle != other.rightSuffixTextStyle) return false
        if (rightButtonSizes != other.rightButtonSizes) return false
        if (rightIconButtonSizes != other.rightIconButtonSizes) return false
        if (rightCheckboxSizes != other.rightCheckboxSizes) return false
        if (rightRadioButtonSizes != other.rightRadioButtonSizes) return false

        return dividerSizes == other.dividerSizes
    }

    override fun hashCode(): Int {
        var result = shape.hashCode()
        result = 31 * result + editDragIconSizes.hashCode()

        result = 31 * result + editCheckboxSizes.hashCode()
        result = 31 * result + editRadioButtonSizes.hashCode()
        result = 31 * result + editAddIconButtonSizes.hashCode()
        result = 31 * result + editRemoveIconButtonSizes.hashCode()

        result = 31 * result + leftIconSizes.hashCode()
        result = 31 * result + leftImageSizes.hashCode()
        result = 31 * result + leftAvatarSizes.hashCode()

        result = 31 * result + titleTextStyle.hashCode()
        result = 31 * result + bodyTextStyle.hashCode()
        result = 31 * result + subheadTextStyle.hashCode()
        result = 31 * result + newLabelTextStyle.hashCode()
        result = 31 * result + newLabelShape.hashCode()

        result = 31 * result + rightIconSizes.hashCode()
        result = 31 * result + rightSwitchSizes.hashCode()
        result = 31 * result + rightCounterSizes.hashCode()
        result = 31 * result + rightSuffixTextStyle.hashCode()
        result = 31 * result + rightButtonSizes.hashCode()
        result = 31 * result + rightIconButtonSizes.hashCode()
        result = 31 * result + rightCheckboxSizes.hashCode()
        result = 31 * result + rightRadioButtonSizes.hashCode()

        result = 31 * result + dividerSizes.hashCode()
        return result
    }
}