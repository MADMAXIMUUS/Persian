package ru.rabbit.persian.appShowcase.componets

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.snackbar.SnackbarHost
import io.github.madmaximuus.persian.snackbar.SnackbarHostState
import io.github.madmaximuus.persian.topAppBar.IconButton
import io.github.madmaximuus.persian.topAppBar.TopAppBar
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.TopAppBarScrollBehavior
import io.github.madmaximuus.persianSymbols.arrow.left.ArrowLeft
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

@Composable
fun SampleScaffold(
    title: String,
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit)? = null,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    topAppBarScrollBehavior: TopAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
    navigationBar: @Composable () -> Unit = {},
    content: @Composable (padding: PaddingValues) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                leading = onBackClick?.let {
                    {
                        IconButton(
                            icon = rememberVectorPainter(PersianSymbols.Default.ArrowLeft),
                            onClick = onBackClick
                        )
                    }
                },
                title = title,
                scrollBehavior = topAppBarScrollBehavior,
            )
        },
        modifier = modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        content = {
            content(it)
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        bottomBar = navigationBar
    )
}