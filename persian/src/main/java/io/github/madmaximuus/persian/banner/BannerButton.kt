package io.github.madmaximuus.persian.banner

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.button.SecondaryButton
import io.github.madmaximuus.persian.button.TertiaryButton

interface BannerButtonScope : ColumnScope {
    val bannerSizes: BannerSizes
}

class BannerButtonScopeWrapper(
    val scope: ColumnScope,
    override val bannerSizes: BannerSizes,
) : BannerButtonScope, ColumnScope by scope

@Composable
fun BannerButtonScope.Primary(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    PrimaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
        sizes = this@Primary.bannerSizes.buttonSizes
    )
}

@Composable
fun BannerButtonScope.Secondary(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    SecondaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
        sizes = this@Secondary.bannerSizes.buttonSizes
    )
}

@Composable
fun BannerButtonScope.Tertiary(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    TertiaryButton(
        modifier = modifier,
        text = text,
        onClick = onClick,
        sizes = this@Tertiary.bannerSizes.buttonSizes
    )
}