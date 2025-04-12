package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.foundation.getAllIcons
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Symbols : Screen {
    override val name: String = "Symbols"

    override val image: Int = R.drawable.symbols

    override val navigation: String = "symbols"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        val allIcons = PersianSymbols.getAllIcons()
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            LazyVerticalGrid(
                modifier = Modifier
                    .padding(it)
                    .padding(horizontal = PersianTheme.spacing.size12)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                columns = GridCells.FixedSize(48.dp),
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size24),
                horizontalArrangement = Arrangement.spacedBy(
                    PersianTheme.spacing.size24,
                    Alignment.CenterHorizontally
                )
            ) {
                items(
                    items = allIcons,
                    key = { it.name },
                    contentType = { it }
                ) { item ->
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            painter = rememberVectorPainter(item),
                            sizes = IconDefaults.size48(),
                            tint = PersianTheme.colorScheme.onSurface
                        )
                    }
                }
                item(
                    span = { GridItemSpan(maxLineSpan) }
                ) {
                    Spacer(
                        modifier = Modifier
                            .windowInsetsBottomHeight(WindowInsets.navigationBars)
                    )
                }
            }
        }
    }
}