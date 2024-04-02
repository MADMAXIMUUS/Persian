package io.github.madmaximuus.persian.actionSheet

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.state38

object PersianActionSheetDefaults {

    val shape: Shape @Composable get() = MaterialTheme.shapes.large

    @Composable
    fun colors(
        titleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        subtitleColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        containerColor: Color = MaterialTheme.extendedColorScheme.surface1
    ): ActionSheetColors =
        ActionSheetColors(
            titleColor = titleColor,
            subtitleColor = subtitleColor,
            containerColor = containerColor
        )

    @Composable
    fun itemColors(
        defaultColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        errorColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,

        defaultIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        errorIconColor: Color = MaterialTheme.extendedColorScheme.error,
        disabledIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
    ): ActionSheetItemColors =
        ActionSheetItemColors(
            defaultTextColor = defaultColor,
            errorTextColor = errorColor,
            disabledTextColor = disabledColor,

            defaultIconColor = defaultIconColor,
            errorIconColor = errorIconColor,
            disabledIconColor = disabledIconColor,
        )
}

@Immutable
class ActionSheetColors(
    internal val titleColor: Color,
    internal val subtitleColor: Color,
    internal val containerColor: Color
)

@Immutable
class ActionSheetItemColors(
    internal val defaultTextColor: Color,
    private val disabledTextColor: Color,
    private val errorTextColor: Color,

    internal val defaultIconColor: Color,
    private val disabledIconColor: Color,
    private val errorIconColor: Color,
) {
    @Stable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): Color = when {
        !enabled -> disabledTextColor
        isError -> errorTextColor
        else -> defaultTextColor
    }

    @Stable
    internal fun iconColor(
        enabled: Boolean,
        isError: Boolean
    ): Color = when {
        !enabled -> disabledIconColor
        isError -> errorIconColor
        else -> defaultIconColor
    }

    fun copy(
        defaultTextColor: Color = this.defaultTextColor,
        disabledTextColor: Color = this.disabledTextColor,
        errorTextColor: Color = this.errorTextColor,

        defaultIconColor: Color = this.defaultIconColor,
        disabledIconColor: Color = this.disabledIconColor,
        errorIconColor: Color = this.errorIconColor,
    ) = ActionSheetItemColors(
        defaultTextColor.takeOrElse { this.defaultTextColor },
        disabledTextColor.takeOrElse { this.disabledTextColor },
        errorTextColor.takeOrElse { this.errorTextColor },

        defaultIconColor.takeOrElse { this.defaultIconColor },
        disabledIconColor.takeOrElse { this.disabledIconColor },
        errorIconColor.takeOrElse { this.errorIconColor },
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ActionSheetItemColors) return false

        if (defaultTextColor != other.defaultTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (errorTextColor != other.errorTextColor) return false

        if (defaultIconColor != other.defaultIconColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        return errorIconColor == other.errorIconColor
    }

    override fun hashCode(): Int {
        var result = defaultTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()

        result = 31 * result + defaultIconColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        result = 31 * result + errorIconColor.hashCode()
        return result
    }
}