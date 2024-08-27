package io.github.madmaximuus.persian.modalPage

import android.view.WindowManager
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarLeft
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarRight
import io.github.madmaximuus.persian.topAppBar.TopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FullScreenModalPage(
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
            val dialogWindowProvider = LocalView.current.parent as? DialogWindowProvider
            dialogWindowProvider?.window?.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    TopAppBar(
                        windowInsets = WindowInsets(0, 0, 0, 0),
                        left = PersianTopAppBarLeft.Close(onClick = { onDismissRequest() }),
                        title = title,
                        right = PersianTopAppBarRight.Action(
                            text = actionTitle,
                            onClick = onActionClick
                        ),
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