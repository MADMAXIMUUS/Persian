package io.github.madmaximuus.persian.banner

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.TertiaryButton

/**
 * The banner button scope for bottom button in [Banner].
 *
 * @property sizes The size of action button of this banner.
 * @property colors The size of action button of this banner.
 */
interface BannerActionScope : RowScope {
    val sizes: BannerSizes
    val colors: BannerColors
}

/**
 * The banner button scope wrapper for bottom button in [Banner].
 *
 * @param scope The column scope used in banner.
 * @param sizes The size of action button of this banner.
 * @param colors The size of action button of this banner.
 */
internal class BannerActionScopeWrapper(
    val scope: RowScope,
    override val sizes: BannerSizes,
    override val colors: BannerColors
) : BannerActionScope, RowScope by scope

/**
 * The extension function for [BannerActionScope] that represent action button in this [Banner].
 *
 * @param modifier the [Modifier] to be applied to banner action button.
 * @param text text that will be displayed in the action.
 * @param onClick called when this action is clicked
 */
@Composable
fun BannerActionScope.Action(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    TertiaryButton(
        modifier = modifier.weight(1f),
        text = text,
        onClick = onClick,
        colors = ButtonDefaults.tertiaryColors(
            contentColor = colors.actionColor
        ),
        sizes = sizes.actionSizes
    )
}