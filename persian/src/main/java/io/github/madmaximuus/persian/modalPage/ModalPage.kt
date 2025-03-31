package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.window.core.layout.WindowHeightSizeClass
import androidx.window.core.layout.WindowWidthSizeClass
import io.github.madmaximuus.persian.foundation.LocalTheme
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import io.github.madmaximuus.persian.modalPage.util.HandleVisibility
import kotlinx.coroutines.launch

/**
 * A modal page is useful for displaying important information or requiring user interaction in
 * a focused and overlaying manner, providing a dedicated interface for specific tasks. It offers
 * a straightforward and effective method for capturing user attention and ensuring critical actions
 * are completed, making it an essential tool for enhancing user experience and workflow management.
 *
 * @param onDismissRequest Executes when the user clicks outside of the bottom sheet, after sheet
 *   animates to [DragAnchor.Hidden].
 * @param modifier Optional [Modifier] for the bottom sheet.
 * @param pageState The state of the bottom sheet.
 * @param contentWindowInsets window insets to be passed to the bottom sheet content via
 *   [PaddingValues] params.
 * @param properties [ModalPageProperties] for further customization of this modal bottom
 *   sheet's window behavior.
 * @param content The content to be displayed inside the bottom sheet.
 */
@Composable
fun ModalPage(
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    pageState: PageState = rememberPageState(),
    handleVisibility: HandleVisibility = HandleVisibility.AUTO,
    top: @Composable (ModalPageTopScope.() -> Unit)? = null,
    contentWindowInsets: WindowInsets = WindowInsets.navigationBars,
    properties: ModalPageProperties = ModalPageProperties(),
    colors: ModalPageColors = ModalPageDefaults.colors(),
    sizes: ModalPageSizes = ModalPageDefaults.sizes(),
    content: @Composable () -> Unit,
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val widthSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowWidthSizeClass
    if (widthSizeClass == WindowWidthSizeClass.COMPACT) {
        CompactModalPage(
            onDismissRequest = onDismissRequest,
            colors = colors,
            sizes = sizes,
            top = top,
            contentWindowInsets = contentWindowInsets,
            pageState = pageState,
            handleVisibility = handleVisibility,
            modifier = modifier,
            properties = properties,
            content = content
        )
    } else if (heightSizeClass == WindowHeightSizeClass.COMPACT) {
        CompactFullScreenModalPage(
            onDismissRequest = onDismissRequest,
            colors = colors,
            sizes = sizes,
            top = top,
            contentWindowInsets = contentWindowInsets,
            content = content
        )
    } else {
        MediumModalPage(
            onDismissRequest = onDismissRequest,
            colors = colors,
            sizes = sizes,
            top = top,
            contentWindowInsets = contentWindowInsets,
            content = content
        )
    }
}

/**
 * A private composable function that displays a modal page optimized for compact window sizes.
 *
 * This function handles the presentation of a modal page with specific properties, including dragging and dismissing behavior.
 * It uses a [ModalPageDialog] to present the modal page and manages the state of the page using [PageState].
 *
 * @param onDismissRequest A callback to be invoked when the modal page is dismissed.
 * @param modifier The modifier to be applied to the modal page.
 * @param pageState The state of the modal page, including drag anchors and visibility.
 * @param top An optional composable function that defines the content for the top section of the modal page.
 * @param contentWindowInsets The window insets to be applied to the content of the modal page.
 * @param properties The properties to be used for the modal page.
 * @param colors The colors to be used for the modal page.
 * @param sizes The sizes to be used for the modal page.
 * @param content A composable function that defines the main content of the modal page, receiving padding values.
 */
@Composable
private fun CompactModalPage(
    onDismissRequest: () -> Unit,
    modifier: Modifier,
    pageState: PageState,
    handleVisibility: HandleVisibility,
    top: @Composable (ModalPageTopScope.() -> Unit)?,
    contentWindowInsets: WindowInsets,
    properties: ModalPageProperties,
    colors: ModalPageColors,
    sizes: ModalPageSizes,
    content: @Composable () -> Unit,
) {
    val scope = rememberCoroutineScope()
    val animateToDismiss: () -> Unit = {
        if (pageState.anchoredDraggableState.confirmValueChange(DragAnchor.Hidden)) {
            scope
                .launch { pageState.hide() }
                .invokeOnCompletion {
                    if (!pageState.isVisible) {
                        onDismissRequest()
                    }
                }
        }
    }
    val settleToDismiss: (velocity: Float) -> Unit = {
        scope
            .launch { pageState.settle(it) }
            .invokeOnCompletion { if (!pageState.isVisible) onDismissRequest() }
    }

    if (pageState.dragAnchors.isNotEmpty()) {
        ModalPageDialog(
            properties = properties,
            lightStatusBar = !LocalTheme.current,
            onDismissRequest = {
                scope.launch { pageState.hide() }.invokeOnCompletion { onDismissRequest() }
            },
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .imePadding()
            ) {
                Scrim(
                    color = PersianTheme.colorScheme.scrim,
                    onDismissRequest = animateToDismiss,
                    pageState = pageState,
                    visible = pageState.targetValue != DragAnchor.Hidden
                )
                ModalBottomSheetContent(
                    settleToDismiss = settleToDismiss,
                    onDismissRequest = onDismissRequest,
                    handleVisibility = handleVisibility,
                    modifier = modifier,
                    pageState = pageState,
                    colors = colors,
                    sizes = sizes,
                    top = top,
                    contentWindowInsets = contentWindowInsets,
                    content = content
                )
            }
        }
    }
    if (pageState.dragAnchors.isNotEmpty()) {
        LaunchedEffect(pageState) { pageState.show() }
    }
}