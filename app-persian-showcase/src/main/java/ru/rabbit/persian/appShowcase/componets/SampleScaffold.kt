package ru.rabbit.persian.appShowcase.componets

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persian.snackbar.Snackbar
import io.github.madmaximuus.persian.snackbar.SnackbarHost
import io.github.madmaximuus.persian.snackbar.SnackbarHostState
import io.github.madmaximuus.persian.topAppBar.IconButton
import io.github.madmaximuus.persian.topAppBar.TopAppBar
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.TopAppBarScrollBehavior
import io.github.madmaximuus.persianSymbols.arrow.left.ArrowLeft
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.pallete.Palette

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
    var showSettings by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                left = onBackClick?.let {
                    {
                        IconButton(
                            icon = rememberVectorPainter(PersianSymbols.Default.ArrowLeft),
                            onClick = onBackClick
                        )
                    }
                },
                title = title,
                scrollBehavior = topAppBarScrollBehavior,
                right = {
                    IconButton(
                        icon = rememberVectorPainter(PersianSymbols.Default.Palette)
                    ) {
                        showSettings = true
                    }
                }
            )
        },
        modifier = modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        content = {
            content(it)
            if (showSettings)
                SettingsModalPage {
                    showSettings = false
                }
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState) { snackbarData ->
                Snackbar(
                    snackbarData,
                    modifier = Modifier.padding(bottom = 40.dp)
                )
            }
        },
        bottomBar = navigationBar
    )
}