package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBar

object PersianModalPage {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun DynamicHeight(
        modifier: Modifier = Modifier,
        onDismissRequest: () -> Unit,
        sheetState: SheetState = rememberModalBottomSheetState(),
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
                        .heightIn(max = height),
                    topBar = {
                        PersianTopAppBar.Primary(
                            windowInsets = WindowInsets(0, 0, 0, 0),
                            left = {
                                Close(onClick = { onDismissRequest() })
                            },
                            middle = {
                                Title(text = title)
                            },
                            right = {
                                Button(
                                    text = actionTitle,
                                    onClick = onActionClick
                                )
                            },
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
    fun Extended(
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
                        PersianTopAppBar.Primary(
                            windowInsets = WindowInsets(0, 0, 0, 0),
                            left = {
                                Close(onClick = {
                                    onDismissRequest()
                                })
                            },
                            middle = {
                                Title(text = title)
                            },
                            right = {
                                Button(text = actionTitle, onClick = onActionClick)
                            },
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
    fun FullScreen(
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
                /*val view = LocalView.current
                val dialogWindowProvider = (view.parent as DialogWindowProvider)
                dialogWindowProvider.window.setDimAmount(0f)*/
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        PersianTopAppBar.Primary(
                            left = {
                                Close(
                                    onClick = {
                                        onDismissRequest()
                                    }
                                )
                            },
                            middle = {
                                Title(text = title)
                            },
                            right = {
                                Button(
                                    text = actionTitle,
                                    onClick = onActionClick
                                )
                            },
                            actionItemsCount = 1,
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
            })
    }
}