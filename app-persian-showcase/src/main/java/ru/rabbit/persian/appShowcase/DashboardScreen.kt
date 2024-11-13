package ru.rabbit.persian.appShowcase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavHostController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.listItem.Icon
import io.github.madmaximuus.persian.listItem.ListItem
import io.github.madmaximuus.persian.listItem.ListItemDefaults
import io.github.madmaximuus.persian.listItem.Middle
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.chevronRight.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.appShowcase.screens.Screen

@Composable
fun DashboardScreen(
    navController: NavHostController,
    screens: List<Screen>
) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    SampleScaffold(
        title = "Persian",
        topAppBarScrollBehavior = topAppBarScrollBehavior
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
            contentPadding = padding,
            verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
        ) {
            items(screens, key = { it.name }) {
                ListItem(
                    middle = {
                        Middle(title = it.name)
                    },
                    sizes = ListItemDefaults.sizes(
                        titleTextStyle = PersianTheme.typography.titleLarge
                    ),
                    right = {
                        Icon(icon = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight))
                    },
                    enabled = true,
                    onClick = {
                        navController.navigate(it.navigation)
                    }
                )
            }
            item {
                Spacer(
                    modifier = Modifier
                        .windowInsetsBottomHeight(WindowInsets.navigationBars)
                )
            }
        }
    }
}
