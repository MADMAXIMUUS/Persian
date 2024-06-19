package io.github.madmaximuus.persian.banners

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.buttons.PersianSecondaryButton
import io.github.madmaximuus.persian.buttons.PersianTertiaryButton

@Stable
object BannerButtonScope {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        text: String,
        onClick: () -> Unit
    ) {
        PersianPrimaryButton(
            modifier = modifier,
            text = text,
            onClick = onClick,
            sizes = PersianButtonDefaults.smallSizes()
        )
    }

    @Composable
    fun Secondary(
        modifier: Modifier = Modifier,
        text: String,
        onClick: () -> Unit
    ) {
        PersianSecondaryButton(
            modifier = modifier,
            text = text,
            onClick = onClick,
            sizes = PersianButtonDefaults.smallSizes()
        )
    }

    @Composable
    fun Tertiary(
        modifier: Modifier = Modifier,
        text: String,
        onClick: () -> Unit
    ) {
        PersianTertiaryButton(
            modifier = modifier,
            text = text,
            onClick = onClick,
            sizes = PersianButtonDefaults.smallSizes()
        )
    }
}