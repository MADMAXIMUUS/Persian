package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBar
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarLeft
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarMiddle
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarRight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersianDynamicHeightModalPage(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    sheetState: SheetState = rememberModalBottomSheetState(),
    shape: Shape = MaterialTheme.shapes.extraLarge.copy(
        bottomStart = CornerSize(0.dp),
        bottomEnd = CornerSize(0.dp)
    ),
    backgroundColor: Color = MaterialTheme.extendedColorScheme.surface,
    top: PersianModalPageTop = PersianModalPageTop.Handle,
    content: @Composable BoxScope.() -> Unit
) {
    val height = LocalConfiguration.current.screenHeightDp.dp
    ModalBottomSheet(
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        containerColor = backgroundColor,
        sheetState = sheetState,
        tonalElevation = 0.dp,
        shape = shape,
        dragHandle = null,
        windowInsets = WindowInsets(0, 0, 0, 0),
        content = {
            Scaffold(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = height),
                topBar = {
                    when (top) {
                        PersianModalPageTop.Handle -> {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Box(
                                    modifier = Modifier
                                        .padding(vertical = MaterialTheme.spacing.large)
                                        .width(40.dp)
                                        .height(6.dp)
                                        .background(
                                            color = MaterialTheme.extendedColorScheme.onSurface
                                                .copy(PersianContentStateDisabled),
                                            shape = MaterialTheme.shapes.extraLarge
                                        )
                                )
                            }
                        }

                        is PersianModalPageTop.TopBar -> {
                            PersianTopAppBar(
                                windowInsets = WindowInsets(0, 0, 0, 0),
                                left = PersianTopAppBarLeft.Close(onClick = { onDismissRequest() }),
                                middle = PersianTopAppBarMiddle.Title(text = top.title),
                                right = PersianTopAppBarRight.Action(
                                    text = top.actionTitle,
                                    onClick = top.onActionClick
                                ),
                                actionItemsCount = 1
                            )
                        }
                    }
                }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(it)
                ) {
                    content()
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersianExtendedModalPage(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    sheetState: SheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    ),
    shape: Shape = MaterialTheme.shapes.extraLarge.copy(
        bottomStart = CornerSize(0.dp),
        bottomEnd = CornerSize(0.dp)
    ),
    backgroundColor: Color = MaterialTheme.extendedColorScheme.surface,
    title: String,
    actionTitle: String,
    onActionClick: () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    val height = LocalConfiguration.current.screenHeightDp.dp
    ModalBottomSheet(
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        containerColor = backgroundColor,
        sheetState = sheetState,
        tonalElevation = 0.dp,
        shape = shape,
        dragHandle = null,
        windowInsets = WindowInsets(0, 0, 0, 0),
        content = {
            Scaffold(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height),
                topBar = {
                    PersianTopAppBar(
                        windowInsets = WindowInsets(0, 0, 0, 0),
                        left = PersianTopAppBarLeft.Close(onClick = { onDismissRequest() }),
                        middle = PersianTopAppBarMiddle.Title(text = title),
                        right = PersianTopAppBarRight.Action(
                            text = actionTitle,
                            onClick = onActionClick
                        ),
                        actionItemsCount = 1
                    )
                }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(it)
                ) {
                    content()
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersianFullScreenModalPage(
    onDismissRequest: () -> Unit,
    title: String,
    actionTitle: String,
    onActionClick: () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(
            decorFitsSystemWindows = false,
            usePlatformDefaultWidth = false
        ),
        content = {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    PersianTopAppBar(
                        windowInsets = WindowInsets(0, 0, 0, 0),
                        left = PersianTopAppBarLeft.Close(onClick = { onDismissRequest() }),
                        middle = PersianTopAppBarMiddle.Title(text = title),
                        right = PersianTopAppBarRight.Action(
                            text = actionTitle,
                            onClick = onActionClick
                        ),
                        actionItemsCount = 1
                    )
                },
                contentWindowInsets = WindowInsets(0, 0, 0, 0)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it)
                ) {
                    content()
                }
            }
        }
    )
}