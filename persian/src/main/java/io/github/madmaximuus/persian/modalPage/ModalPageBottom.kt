package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.button.PrimaryButton
import io.github.madmaximuus.persian.foundation.PersianTheme

interface ModalPageBottomScope : RowScope {
    val colors: ModalPageColors
    val sizes: ModalPageSizes
}

internal class ModalPageBottomScopeWrapper(
    scope: RowScope,
    override val sizes: ModalPageSizes,
    override val colors: ModalPageColors,
) : ModalPageBottomScope, RowScope by scope

@Composable
fun ModalPageBottomScope.Action(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val fillModifier =
        if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT)
            modifier.weight(1f)
        else modifier
    PrimaryButton(
        modifier = fillModifier,
        text = text,
        onClick = onClick,
        colors = this@Action.colors.actionColors,
        sizes = this@Action.sizes.actionSizes
    )
}

@Composable
internal fun ActionRow(
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    paddingValues: PaddingValues,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    bottom: (@Composable ModalPageBottomScope.() -> Unit)?
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val navModifier =
        if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT)
            Modifier.navigationBarsPadding()
        else Modifier
    Row(
        modifier
            .fillMaxWidth()
            .padding(paddingValues)
            .then(navModifier),
        horizontalArrangement = Arrangement.spacedBy(
            PersianTheme.spacing.size12,
            horizontalAlignment
        )
    ) {
        val scope = remember(colors, sizes) {
            ModalPageBottomScopeWrapper(this, sizes, colors)
        }
        bottom?.let { scope.it() }
    }
}