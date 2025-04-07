package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.foundation.LocalTheme
import io.github.madmaximuus.persian.modalPage.util.LayoutId
import io.github.madmaximuus.persian.modalPage.util.modalMeasurePolicy
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
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
@Composable
fun FullScreenModalPage(
    onDismissRequest: () -> Unit,
    colors: ModalPageColors = ModalPageDefaults.colors(),
    sizes: ModalPageSizes = ModalPageDefaults.sizes(),
    top: @Composable (ModalPageTopScope.() -> Unit)? = null,
    contentWindowInsets: WindowInsets = WindowInsets(0, 0, 0, 0),
    content: @Composable () -> Unit
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
            content = content
        )
    } else if (widthSizeClass != WindowWidthSizeClass.COMPACT) {
        MediumModalPage(
            onDismissRequest = onDismissRequest,
            colors = colors,
            sizes = sizes,
            top = top,
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
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
@Composable
internal fun CompactFullScreenModalPage(
    onDismissRequest: () -> Unit,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    top: (@Composable ModalPageTopScope.() -> Unit)?,
    contentWindowInsets: WindowInsets,
    content: @Composable () -> Unit
) {
    val paddingModifier = if (top == null) Modifier.fillMaxSize()
    else Modifier
        .fillMaxSize()
        .statusBarsPadding()
    ModalPageDialog(
        onDismissRequest = onDismissRequest,
        properties = ModalPageProperties(),
        lightStatusBar = !LocalTheme.current,
        content = {
            Scaffold(
                modifier = paddingModifier,
                containerColor = colors.containerColor,
                topBar = {
                    val scope = remember(colors, sizes) {
                        ModalPageTopScopeWrapper(sizes, colors)
                    }
                    top?.let { scope.it() }
                },
                contentWindowInsets = contentWindowInsets
            ) { paddingValues ->
                Box(
                    modifier = Modifier.padding(paddingValues)
                ) {
                    content()
                }
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
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
@Composable
internal fun MediumModalPage(
    onDismissRequest: () -> Unit,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    top: (@Composable ModalPageTopScope.() -> Unit)?,
    contentWindowInsets: WindowInsets,
    content: @Composable () -> Unit
) {
    val screenHeight = LocalConfiguration.current.screenHeightDp
    val statusBarSize = WindowInsets.statusBars.getTop(LocalDensity.current)
    val navigationBarSize = WindowInsets.navigationBars.getBottom(LocalDensity.current)
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
                    .widthIn(min = 400.dp, max = 1000.dp)
                    .heightIn(
                        min = 300.dp,
                        max = (screenHeight - statusBarSize - navigationBarSize).dp
                    ),
                shape = sizes.containerShape,
                color = colors.containerColor,
            ) {
                Layout(
                    measurePolicy = { measurables, constraints ->
                        modalMeasurePolicy(this, measurables, constraints)
                    },
                    content = {
                        val scope = remember(colors, sizes) {
                            ModalPageTopScopeWrapper(sizes, colors)
                        }
                        top?.let { scope.it() }
                        Box(
                            modifier = Modifier.layoutId(LayoutId.CONTENT)
                        ) {
                            content()
                        }
                    }
                )
            }
        }
    )
}