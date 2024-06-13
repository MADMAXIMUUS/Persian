package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.shimmer
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Skeleton : Screen {

    override val name: String = "Skeleton"

    override val navigation: String = "skeleton"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                item {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Infinite loading",
                        textAlign = TextAlign.Center,
                        style = PersianTheme.typography.titleLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                item {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "These loaders show one of the library's features",
                        textAlign = TextAlign.Center,
                        style = PersianTheme.typography.labelLarge,
                        color = PersianTheme.colorScheme.onSurface
                    )
                }
                items(4) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .padding(horizontal = PersianTheme.spacing.size12)
                            .shimmer(true)
                    ) {

                    }
                }
            }
        }
    }
}