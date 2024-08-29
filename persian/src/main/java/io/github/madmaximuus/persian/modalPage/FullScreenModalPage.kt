package io.github.madmaximuus.persian.modalPage

import android.view.WindowManager
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.surface.Surface

@Composable
fun FullScreenModalPage(
    onDismissRequest: () -> Unit,
    colors: ModalPageColors = ModalPageDefaults.colors(),
    sizes: ModalPageSizes = ModalPageDefaults.sizes(),
    top: @Composable ModalPageTopScope.() -> Unit,
    bottom: @Composable (ModalPageBottomScope.() -> Unit)? = null,
    contentWindowInsets: WindowInsets = WindowInsets(0, 0, 0, 0),
    content: @Composable (PaddingValues) -> Unit
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    if (widthSizeClass == WindowWidthSizeClass.COMPACT || heightSizeClass == WindowHeightSizeClass.COMPACT) {
        CompactFullScreenModalPage(
            onDismissRequest = onDismissRequest,
            colors = colors,
            sizes = sizes,
            top = top,
            contentWindowInsets = contentWindowInsets,
            bottom = bottom,
            content = content
        )
    } else if (widthSizeClass != WindowWidthSizeClass.COMPACT) {
        MediumModalPage(
            onDismissRequest = onDismissRequest,
            colors = colors,
            sizes = sizes,
            top = top,
            bottom = bottom,
            contentWindowInsets = contentWindowInsets,
            content = content,
        )
    }
}

@Composable
private fun CompactFullScreenModalPage(
    onDismissRequest: () -> Unit,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    top: (@Composable ModalPageTopScope.() -> Unit)?,
    bottom: @Composable (ModalPageBottomScope.() -> Unit)?,
    contentWindowInsets: WindowInsets,
    content: @Composable (PaddingValues) -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            decorFitsSystemWindows = false,
            usePlatformDefaultWidth = false
        ),
        content = {
            val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
            dialogWindowProvider?.window?.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    val scope = remember(colors, sizes) {
                        ModalPageTopScopeWrapper(sizes, colors)
                    }
                    top?.let { scope.it() }
                },
                bottomBar = {
                    ActionRow(
                        modifier = Modifier.fillMaxWidth(),
                        paddingValues = PaddingValues(
                            PersianTheme.spacing.size12,
                            PersianTheme.spacing.size12,
                        ),
                        colors = colors,
                        sizes = sizes,
                        bottom = bottom
                    )
                },
                contentWindowInsets = contentWindowInsets
            ) { paddingValues ->
                content(paddingValues)
            }
        }
    )
}

@Composable
internal fun MediumModalPage(
    onDismissRequest: () -> Unit,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    top: (@Composable ModalPageTopScope.() -> Unit)?,
    bottom: @Composable (ModalPageBottomScope.() -> Unit)?,
    contentWindowInsets: WindowInsets,
    content: @Composable (PaddingValues) -> Unit
) {
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val screenHeight = LocalConfiguration.current.screenHeightDp
    val widthCoeff = if (widthSizeClass == WindowWidthSizeClass.EXPANDED) 0.708f else 0.929f
    val heightCoeff = if (widthSizeClass == WindowWidthSizeClass.EXPANDED) 0.929f else 0.708f
    val dialogWidth = (screenWidth.toFloat() * widthCoeff).dp
    val dialogHeight = (screenHeight.toFloat() * heightCoeff).dp
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            decorFitsSystemWindows = false,
            usePlatformDefaultWidth = false
        ),
        content = {
            val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
            dialogWindowProvider?.window?.setDimAmount(0.5f)
            Surface(
                modifier = Modifier
                    .size(dialogWidth, dialogHeight),
                shape = sizes.containerShape,
                color = colors.containerColor,
            ) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        val scope = remember(colors, sizes) {
                            ModalPageTopScopeWrapper(sizes, colors)
                        }
                        top?.let { scope.it() }
                    },
                    bottomBar = {
                        ActionRow(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.End,
                            paddingValues = PaddingValues(
                                horizontal = PersianTheme.spacing.size16,
                                vertical = PersianTheme.spacing.size12,
                            ),
                            colors = colors,
                            sizes = sizes,
                            bottom = bottom
                        )
                    },
                    contentWindowInsets = contentWindowInsets
                ) { paddingValues ->
                    content(paddingValues)
                }
            }
        }
    )
}