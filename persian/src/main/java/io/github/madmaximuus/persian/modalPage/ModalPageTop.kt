package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.Action
import io.github.madmaximuus.persian.topAppBar.CenteredTopAppBar
import io.github.madmaximuus.persian.topAppBar.IconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

interface ModalPageTopScope {
    val colors: ModalPageColors
    val sizes: ModalPageSizes
    val onDismiss: () -> Unit
}

internal class ModalPageTopScopeWrapper(
    override val sizes: ModalPageSizes,
    override val colors: ModalPageColors,
    override val onDismiss: () -> Unit,
) : ModalPageTopScope

@Composable
fun ModalPageTopScope.TopBar(
    title: String,
    actionTitle: String,
    onActionClick: () -> Unit
) {
    CenteredTopAppBar(
        modifier = Modifier.fillMaxWidth(),
        left = {
            IconButton(
                icon = rememberVectorPainter(PersianSymbols.Default.XMark),
                onClick = onDismiss
            )
        },
        title = title,
        right = {
            Action(
                text = actionTitle,
                onClick = onActionClick
            )
        }
    )
}

/**
 * Showing only with [WindowWidthSizeClass.COMPACT] width or [WindowHeightSizeClass.COMPACT]  height
 */
@Composable
fun ModalPageTopScope.Handle() {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = PersianTheme.spacing.size16),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(this@Handle.sizes.dragHandleSizes)
                    .background(this@Handle.colors.dragHandleColor, PersianTheme.shapes.full)
            )
        }
    }
}