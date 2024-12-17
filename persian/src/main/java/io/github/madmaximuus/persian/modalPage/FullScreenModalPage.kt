package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import io.github.madmaximuus.persian.foundation.LocalTheme
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.surface.Surface

/**
 * A modal page is useful for displaying important information or requiring user interaction in
 * a focused and overlaying manner, providing a dedicated interface for specific tasks. It offers
 * a straightforward and effective method for capturing user attention and ensuring critical actions
 * are completed, making it an essential tool for enhancing user experience and workflow management.
 *
 * @param onDismissRequest A callback to be invoked when the modal page is dismissed.
 * @param colors The colors to be used for the modal page.
 * @param sizes The sizes to be used for the modal page.
 * @param top A composable function that defines the content for the top section of the modal page.
 * @param bottom An optional composable function that defines the content for the bottom section of the modal page.
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
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

/**
 * A private composable function that displays a full-screen modal page optimized for compact window sizes.
 *
 * This function uses a [Dialog] to present the modal page, with specific properties and layout settings
 * tailored for compact window sizes.
 *
 * @param onDismissRequest A callback to be invoked when the modal page is dismissed.
 * @param colors The colors to be used for the modal page.
 * @param sizes The sizes to be used for the modal page.
 * @param top An optional composable function that defines the content for the top section of the modal page.
 * @param bottom An optional composable function that defines the content for the bottom section of the modal page.
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
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
    ModalPageDialog(
        onDismissRequest = onDismissRequest,
        properties = ModalPageProperties(),
        lightStatusBar = !LocalTheme.current,
        content = {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                containerColor = colors.containerColor,
                topBar = {
                    val scope = remember(colors, sizes) {
                        ModalPageTopScopeWrapper(sizes, colors, onDismissRequest)
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

/**
 * An internal composable function that displays a modal page optimized for medium window sizes.
 *
 * This function uses a [Dialog] to present the modal page, with specific properties and layout settings
 * tailored for medium window sizes. The size of the dialog is adjusted based on the current window size class.
 *
 * @param onDismissRequest A callback to be invoked when the modal page is dismissed.
 * @param colors The colors to be used for the modal page.
 * @param sizes The sizes to be used for the modal page.
 * @param top An optional composable function that defines the content for the top section of the modal page.
 * @param bottom An optional composable function that defines the content for the bottom section of the modal page.
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
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
                            ModalPageTopScopeWrapper(sizes, colors, onDismissRequest)
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
                    Box(
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        content(paddingValues)
                    }
                }
            }
        }
    )
}