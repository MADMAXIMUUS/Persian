package io.github.madmaximuus.persian.banner

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.button.SecondaryButton
import io.github.madmaximuus.persian.button.TertiaryButton

/**
 * The banner button scope for bottom button in [Banner].
 *
 * @property bannerSizes The size of action button of this [Banner].
 */
interface BannerButtonScope : ColumnScope {
    val bannerSizes: BannerSizes
}

/**
 * The banner button scope wrapper for bottom button in [Banner].
 *
 * @param scope The column scope used in banner.
 * @param bannerSizes The size of action button of this banner.
 */
internal class BannerButtonScopeWrapper(
    val scope: ColumnScope,
    override val bannerSizes: BannerSizes,
) : BannerButtonScope, ColumnScope by scope

/**
 * The extension function for [BannerButtonScope] that represent action button in this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner action button.
 * @param text text that will be displayed in the action.
 * @param onClick called when this action is clicked.
 * @param colors the [ButtonColors] colors that will be applied to [PrimaryButton] in this action button.
 */
@Composable
fun BannerButtonScope.Primary(
    modifier: Modifier = Modifier,
    text: String,
    colors: ButtonColors = ButtonDefaults.primaryColors(),
    onClick: () -> Unit
) {
    PrimaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
        colors = colors,
        sizes = this@Primary.bannerSizes.buttonSizes
    )
}

/**
 * The extension function for [BannerButtonScope] that represent action button in this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner action button.
 * @param text text that will be displayed in the action.
 * @param onClick called when this action is clicked
 * @param colors the [ButtonColors] colors that will be applied to [SecondaryButton] in this action button.
 */
@Composable
fun BannerButtonScope.Secondary(
    modifier: Modifier = Modifier,
    text: String,
    colors: ButtonColors = ButtonDefaults.secondaryColors(),
    onClick: () -> Unit
) {
    SecondaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
        colors = colors,
        sizes = this@Secondary.bannerSizes.buttonSizes
    )
}

/**
 * The extension function for [BannerButtonScope] that represent action button in this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner action button.
 * @param text text that will be displayed in the action.
 * @param onClick called when this action is clicked
 * @param colors the [ButtonColors] colors that will be applied to [TertiaryButton] in this action button.
 */
@Composable
fun BannerButtonScope.Tertiary(
    modifier: Modifier = Modifier,
    text: String,
    colors: ButtonColors = ButtonDefaults.tertiaryColors(),
    onClick: () -> Unit
) {
    TertiaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
        colors = colors,
        sizes = this@Tertiary.bannerSizes.buttonSizes
    )
}