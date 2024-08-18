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

object ListItemDefaults {

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
    ): ListItemColors = ListItemColors(
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
        rightCounterSizes: CounterSizes = CounterDefaults.digitSizes(),
        rightSuffixTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        rightButtonSizes: ButtonSizes = ButtonDefaults.smallSizes(),
        rightIconButtonSizes: IconButtonSizes = IconButtonDefaults.smallSizes(),
        rightCheckboxSizes: CheckboxSizes = CheckboxDefaults.sizes(),
        rightRadioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes(),

        dividerSizes: DividerSizes = DividerDefaults.sizes(),
    ): ListItemSizes = ListItemSizes(
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
    @Stable
    fun titleColor(enabled: Boolean): Color =
        if (enabled) titleColor else disabledTitleColor

    @Stable
    fun bodyColor(enabled: Boolean): Color =
        if (enabled) bodyColor else disabledBodyColor

    @Stable
    fun subheadColor(enabled: Boolean): Color =
        if (enabled) subheadColor else disabledSubheadColor

    @Stable
    fun newLabelColor(enabled: Boolean): Color =
        if (enabled) newLabelColor else disabledNewLabelColor

    @Stable
    fun newLabelContainerColor(enabled: Boolean): Color =
        if (enabled) newLabelContainerColor else disabledNewLabelContainerColor

    @Stable
    fun dragColor(enabled: Boolean): Color =
        if (enabled) editDragColor else disabledEditDragColor

    @Stable
    fun leftIconColor(enabled: Boolean): Color =
        if (enabled) leftIconColor else disabledLeftIconColor

    @Stable
    fun suffixColor(enabled: Boolean): Color =
        if (enabled) rightSuffixColor else disabledRightSuffixColor

    @Stable
    fun rightIconColor(enabled: Boolean): Color =
        if (enabled) rightIconColor else disabledRightIconColor

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
    ): ListItemColors = ListItemColors(
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
    ): ListItemSizes = ListItemSizes(
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