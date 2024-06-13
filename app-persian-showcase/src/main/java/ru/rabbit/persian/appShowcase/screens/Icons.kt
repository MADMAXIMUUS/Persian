package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.iconBox.Icon
import io.github.madmaximuus.persian.iconBox.IconDefaults
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.foundation.getAllIcons
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Icons : Screen {
    override val name: String = "Icons"

    override val navigation: String = "icons"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
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
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                columns = GridCells.Fixed(3),
                verticalArrangement = Arrangement.spacedBy(40.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                items(PersianSymbols.getAllIcons()) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            painter = rememberVectorPainter(it),
                            size = IconDefaults.size48(
                                width = 64.dp
                            )
                        )
                    }
                }
            }
        }
    }
}