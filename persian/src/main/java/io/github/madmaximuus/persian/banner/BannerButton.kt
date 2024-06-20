package io.github.madmaximuus.persian.banner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.button.PersianButtonDefaults
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.button.SecondaryButton
import io.github.madmaximuus.persian.button.TertiaryButton

@Stable
object BannerButtonScope {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        text: String,
        onClick: () -> Unit
    ) {
        PrimaryButton(
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
        SecondaryButton(
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
        TertiaryButton(
            modifier = modifier,
            text = text,
            onClick = onClick,
            sizes = PersianButtonDefaults.smallSizes()
        )
    }
}