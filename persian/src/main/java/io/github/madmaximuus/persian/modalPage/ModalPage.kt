package io.github.madmaximuus.persian.modalPage

import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.modalPage.util.DragAnchor
import kotlinx.coroutines.launch

/**
 * Modal bottom sheets are used as an alternative to inline menus or simple dialogs on mobile,
 * especially when offering a long list of action items, or when items require longer descriptions
 * and icons. Like dialogs, modal bottom sheets appear in front of app content, disabling all other
 * app functionality when they appear, and remaining on screen until confirmed, dismissed, or a
 * required action has been taken.
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
    top: @Composable (ModalPageTopScope.() -> Unit)? = null,
    contentWindowInsets: WindowInsets = WindowInsets.navigationBars,
    properties: ModalPageProperties = ModalPageProperties(),
    colors: ModalPageColors = ModalPageDefaults.colors(),
    sizes: ModalPageSizes = ModalPageDefaults.sizes(),
    content: @Composable ColumnScope.(PaddingValues) -> Unit,
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

    val predictiveBackProgress = remember { Animatable(initialValue = 0f) }

    ModalPageDialog(
        properties = properties,
        onDismissRequest = {
            if (pageState.currentValue == DragAnchor.Expanded) {
                // Smoothly animate away predictive back transformations since we are not fully
                // dismissing. We don't need to do this in the else below because we want to
                // preserve the predictive back transformations (scale) during the hide animation.
                scope.launch { predictiveBackProgress.animateTo(0f) }
            } else { // Is expanded without collapsed state or is collapsed.
                scope.launch { pageState.hide() }.invokeOnCompletion { onDismissRequest() }
            }
        },
        predictiveBackProgress = predictiveBackProgress,
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
                predictiveBackProgress,
                settleToDismiss,
                modifier,
                pageState,
                colors,
                sizes,
                top,
                contentWindowInsets,
                content
            )
        }
    }
    if (pageState.dragAnchors.isNotEmpty()) {
        LaunchedEffect(pageState) { pageState.show() }
    }
}