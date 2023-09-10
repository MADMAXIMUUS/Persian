package ru.rabbit.persian.buttons

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.PersianContentStateDisabled
import ru.rabbit.persian.foundation.PersianStatesDisabled
import ru.rabbit.persian.foundation.extendedColorScheme

@Immutable
data class ButtonColors(
    val contentColor: Color,
    val containerColor: Color,
    val disabledContentColor: Color,
    val disabledContainerColor: Color
) {
    fun contentColor(enabled: Boolean) = if (enabled) contentColor else disabledContentColor

    fun containerColor(enabled: Boolean) = if (enabled) containerColor else disabledContainerColor
}

object PersianButtonColors {

    @Composable
    fun primary(
        style: PersianComponentStyle,
        containerColor: Color = MaterialTheme.extendedColorScheme.primary,
        contentColor: Color = MaterialTheme.extendedColorScheme.onPrimary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = remember(
        containerColor,
        contentColor,
        disabledContainerColor,
        disabledContentColor
    ) {
        when (style) {
            PersianComponentStyle.FILL -> ButtonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )

            PersianComponentStyle.OUTLINED -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.STANDARD -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            else -> {
                ButtonColors(
                    containerColor = containerColor,
                    contentColor = contentColor,
                    disabledContainerColor = disabledContainerColor,
                    disabledContentColor = disabledContentColor
                )
            }
        }
    }


    @Composable
    fun secondary(
        style: PersianComponentStyle,
        containerColor: Color = MaterialTheme.extendedColorScheme.secondary,
        contentColor: Color = MaterialTheme.extendedColorScheme.onSecondary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = remember(
        containerColor,
        contentColor,
        disabledContainerColor,
        disabledContentColor
    ) {
        when (style) {
            PersianComponentStyle.FILL -> ButtonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )

            PersianComponentStyle.OUTLINED -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.STANDARD -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            else -> {
                ButtonColors(
                    containerColor = containerColor,
                    contentColor = contentColor,
                    disabledContainerColor = disabledContainerColor,
                    disabledContentColor = disabledContentColor
                )
            }
        }
    }

    @Composable
    fun tertiary(
        style: PersianComponentStyle,
        containerColor: Color = MaterialTheme.extendedColorScheme.tertiary,
        contentColor: Color = MaterialTheme.extendedColorScheme.onTertiary,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = remember(
        containerColor,
        contentColor,
        disabledContainerColor,
        disabledContentColor
    ) {
        when (style) {
            PersianComponentStyle.FILL -> ButtonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )

            PersianComponentStyle.OUTLINED -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.STANDARD -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            else -> {
                ButtonColors(
                    containerColor = containerColor,
                    contentColor = contentColor,
                    disabledContainerColor = disabledContainerColor,
                    disabledContentColor = disabledContentColor
                )
            }
        }
    }

    @Composable
    fun negative(
        style: PersianComponentStyle,
        containerColor: Color = MaterialTheme.extendedColorScheme.error,
        contentColor: Color = MaterialTheme.extendedColorScheme.onError,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
    ): ButtonColors = remember(
        containerColor,
        contentColor,
        disabledContainerColor,
        disabledContentColor
    ) {
        when (style) {
            PersianComponentStyle.FILL -> ButtonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )

            PersianComponentStyle.OUTLINED -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.STANDARD -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            else -> {
                ButtonColors(
                    containerColor = containerColor,
                    contentColor = contentColor,
                    disabledContainerColor = disabledContainerColor,
                    disabledContentColor = disabledContentColor
                )
            }
        }
    }

    @Composable
    fun neutral(
        style: PersianComponentStyle,
        containerColor: Color = MaterialTheme.extendedColorScheme.inverseSurface,
        contentColor: Color = MaterialTheme.extendedColorScheme.inverseOnSurface,
        disabledContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledContentColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
    ): ButtonColors = remember(
        containerColor,
        contentColor,
        disabledContainerColor,
        disabledContentColor
    ) {
        when (style) {
            PersianComponentStyle.FILL -> ButtonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                disabledContainerColor = disabledContainerColor,
                disabledContentColor = disabledContentColor
            )

            PersianComponentStyle.OUTLINED -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            PersianComponentStyle.STANDARD -> ButtonColors(
                containerColor = Color.Transparent,
                contentColor = containerColor,
                disabledContainerColor = Color.Transparent,
                disabledContentColor = disabledContainerColor
            )

            else -> {
                ButtonColors(
                    containerColor = containerColor,
                    contentColor = contentColor,
                    disabledContainerColor = disabledContainerColor,
                    disabledContentColor = disabledContentColor
                )
            }
        }
    }

}