package ru.rabbit.persian.appShowcase.componets

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.snackbar.PersianSnackbar
import io.github.madmaximuus.persian.snackbar.PersianSnackbarVisuals
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBar
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarLeft

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleScaffold(
    title: String,
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit)? = null,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    topAppBarScrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
    content: @Composable (padding: PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = {
            PersianTopAppBar(
                left = onBackClick?.let {
                    PersianTopAppBarLeft.Navigation(
                        onClick = onBackClick
                    )
                },
                title = title,
                scrollBehavior = topAppBarScrollBehavior,
            )
        },
        modifier = modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        content = { content(it) },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState) { snackbarData ->
                val customVisuals = snackbarData.visuals as? PersianSnackbarVisuals
                if (customVisuals != null) {
                    PersianSnackbar(
                        text = customVisuals.message,
                        left = customVisuals.left,
                        right = customVisuals.right,
                    )
                } else {
                    Snackbar(snackbarData = snackbarData)
                }
            }
        }
    )
}