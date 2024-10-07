package io.github.madmaximuus.persian.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.fab.MediumFab
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianSubcomposeLayout
import io.github.madmaximuus.persian.foundation.ProvideTextStyle
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.progressIndicator.CircularProgressIndicator
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

/**
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Primary buttons are high-emphasis buttons. Primary buttons have the most visual impact after the
 * [MediumFab], and should be used for important, final actions that complete a flow,
 * like "Save", "Join now", or "Confirm".
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [SecondaryButton] for a medium-emphasis button.
 * - See [TertiaryButton] for a low-emphasis button.
 * - See [OutlinedButton] for a middle ground between [SecondaryButton] and [PrimaryButton].
 *
 * @param text The text inside the button.
 * @param additionInfoText The second row text inside the button. Not applicable with the small button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param leadingIcon The optional icon to be displayed at the start of the button container.
 * @param trailingIcon The optional icon to be displayed at the end of the button container.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param loading Controls the loading state of this button. When `true`, this component will
 *   show to user [CircularProgressIndicator] loader.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = ButtonDefaults.primaryColors(),
    sizes: ButtonSizes = ButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = ButtonImpl(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = null,
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Secondary buttons are medium-emphasis buttons that is an alternative middle ground between
 * default [PrimaryButton]s and [TertiaryButton]s. They can be used in contexts where
 * lower-priority button requires slightly more emphasis than [TertiaryButton], such as "Next"
 * in an onboarding flow. Secondary buttons use the primary container color mapping.
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [PrimaryButton] for a high-emphasis button.
 * - See [TertiaryButton] for a low-emphasis button.
 * - See [OutlinedButton] for a middle ground between [SecondaryButton] and [PrimaryButton].
 *
 * @param text The text inside the button.
 * @param additionInfoText The second row text inside the button. Not applicable with the small button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param leadingIcon The optional icon to be displayed at the start of the button container.
 * @param trailingIcon The optional icon to be displayed at the end of the button container.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param loading Controls the loading state of this button. When `true`, this component will
 *   show to user [CircularProgressIndicator] loader.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = ButtonDefaults.secondaryColors(),
    sizes: ButtonSizes = ButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = ButtonImpl(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = null,
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Outlined buttons are middle-emphasis buttons. They contain actions that are important, but are
 * not the primary action in an app.
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [PrimaryButton] for a high-emphasis button.
 * - See [SecondaryButton] for a medium-emphasis button.
 * - See [TertiaryButton] for a middle ground between [SecondaryButton] and [PrimaryButton].
 *
 * @param text The text inside the button.
 * @param additionInfoText The second row text inside the button. Not applicable with the small button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param leadingIcon The optional icon to be displayed at the start of the button container.
 * @param trailingIcon The optional icon to be displayed at the end of the button container.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param loading Controls the loading state of this button. When `true`, this component will
 *   show to user [CircularProgressIndicator] loader.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun TertiaryButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = ButtonDefaults.tertiaryColors(),
    sizes: ButtonSizes = ButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = ButtonImpl(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = null,
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * Buttons help people initiate actions, from sending an email, to sharing a document, to liking a
 * post.
 *
 * Tertiary buttons are typically used for less-pronounced actions, including those located in dialogs
 * and cards. In cards, tertiary buttons help maintain an emphasis on card content. Tertiary buttons are
 * used for the lowest priority actions, especially when presenting multiple options.
 *
 * Choose the best button for an action based on the amount of emphasis it needs. The more important
 * an action is, the higher emphasis its button should be.
 * - See [PrimaryButton] for a high-emphasis button.
 * - See [SecondaryButton] for a medium-emphasis button.
 * - See [OutlinedButton] for a low-emphasis button.
 *
 * @param text The text inside the button.
 * @param additionInfoText The second row text inside the button. Not applicable with the small button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param leadingIcon The optional icon to be displayed at the start of the button container.
 * @param trailingIcon The optional icon to be displayed at the end of the button container.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param loading Controls the loading state of this button. When `true`, this component will
 *   show to user [CircularProgressIndicator] loader.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun OutlinedButton(
    text: String,
    modifier: Modifier = Modifier,
    additionInfoText: String? = null,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    enabled: Boolean = true,
    loading: Boolean = false,
    colors: ButtonColors = ButtonDefaults.outlinedColors(),
    sizes: ButtonSizes = ButtonDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit
) = ButtonImpl(
    modifier = modifier,
    text = text,
    additionInfoText = additionInfoText,
    enabled = enabled,
    colors = colors,
    loading = loading,
    sizes = sizes,
    leadingIcon = leadingIcon,
    trailingIcon = trailingIcon,
    border = BorderStroke(
        1.dp,
        color = colors.contentColor(enabled),
    ),
    interactionSource = interactionSource,
    onClick = onClick
)

/**
 * Base composable function to implement button
 *
 * @param text The text inside the button.
 * @param additionInfoText The second row text inside the button. Not applicable with the small button.
 * @param modifier The [Modifier] to be applied to this button.
 * @param leadingIcon The optional icon to be displayed at the start of the button container.
 * @param trailingIcon The optional icon to be displayed at the end of the button container.
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param loading Controls the loading state of this button. When `true`, this component will
 *   show to user [CircularProgressIndicator] loader.
 * @param colors The colors of the background and the content in enabled and disabled.
 * @param sizes The sizes for the content, paddings, shape and height.
 * @param onClick Called when this button is clicked.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the button's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
private fun ButtonImpl(
    text: String,
    modifier: Modifier = Modifier,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    additionInfoText: String? = null,
    enabled: Boolean,
    colors: ButtonColors,
    loading: Boolean,
    sizes: ButtonSizes,
    border: BorderStroke?,
    interactionSource: MutableInteractionSource,
    onClick: () -> Unit
) {
    val containerColor = colors.containerColor(enabled)
    val contentColor = colors.contentColor(enabled)
    CompositionLocalProvider(LocalContentColor provides contentColor) {
        Surface(
            onClick = onClick,
            modifier = modifier.semantics { role = Role.Button },
            enabled = enabled,
            shape = sizes.shape,
            color = containerColor,
            contentColor = contentColor,
            border = border,
            interactionSource = interactionSource
        ) {
            ProvideTextStyle(value = sizes.textStyle) {
                Row(
                    Modifier
                        .height(sizes.height),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val textWithIcons = @Composable {
                        Row(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(sizes.contentPadding),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            leadingIcon?.let {
                                Icon(
                                    painter = it,
                                    sizes = sizes.iconSizes
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp),
                            ) {
                                Text(
                                    modifier = Modifier.align(Alignment.CenterHorizontally),
                                    text = text,
                                    style = sizes.textStyle,
                                    overflow = TextOverflow.Ellipsis,
                                    textAlign = TextAlign.Center,
                                    color = colors.contentColor(enabled),
                                    maxLines = 1
                                )
                                if (sizes.additionInfoTextStyle != null && additionInfoText != null)
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterHorizontally),
                                        text = additionInfoText,
                                        style = sizes.additionInfoTextStyle,
                                        overflow = TextOverflow.Ellipsis,
                                        textAlign = TextAlign.Center,
                                        color = colors.contentColor(enabled),
                                        maxLines = 1
                                    )
                            }
                            trailingIcon?.let {
                                Icon(
                                    painter = it,
                                    sizes = sizes.iconSizes
                                )
                            }
                        }
                    }

                    val loader = @Composable {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(
                                sizes = sizes.loaderSize,
                                colors = ProgressIndicatorDefaults.colors(
                                    trackColor = Color.Transparent,
                                    progressColor = colors.contentColor(enabled)
                                )
                            )
                        }
                    }
                    PersianSubcomposeLayout(
                        mainContent = {
                            textWithIcons()
                        },
                        dependentContent = {
                            Box(
                                modifier = Modifier
                                    .size(it),
                                contentAlignment = Alignment.Center
                            ) {
                                if (loading && enabled)
                                    loader()
                                else
                                    textWithIcons()
                            }
                        }
                    )
                }
            }
        }
    }
}