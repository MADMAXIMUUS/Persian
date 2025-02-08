package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.shimmer
import io.github.madmaximuus.persian.text.Text
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Skeleton : Screen {

    override val name: String = "Skeleton"

    override val navigation: String = "skeleton"

    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size4)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Infinite loading",
                    textAlign = TextAlign.Center,
                    style = PersianTheme.typography.titleLarge,
                    color = PersianTheme.colorScheme.onSurface
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "These loaders show one of the library's features",
                    textAlign = TextAlign.Center,
                    style = PersianTheme.typography.labelLarge,
                    color = PersianTheme.colorScheme.onSurface
                )
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .clip(PersianTheme.shapes.full)
                        .shimmer()
                )
                repeat(4) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .padding(horizontal = PersianTheme.spacing.size12)
                            .shimmer()
                    )
                }
            }
        }
    }
}