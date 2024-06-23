package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.navigation.NavController
import io.github.madmaximuus.persian.counter.Badge
import io.github.madmaximuus.persian.counter.Counter
import io.github.madmaximuus.persian.counter.TonalCounter
import io.github.madmaximuus.persian.counter.TransparentCounter
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Counter : Screen {

    override val name: String = "Counters"

    override val navigation: String = "counter"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Counter Default", firstItem = true) {
                        Counter(count = 1)
                        Counter(count = 10)
                        Counter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Counter Tonal") {
                        TonalCounter(count = 1)
                        TonalCounter(count = 10)
                        TonalCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Counter Transparent") {
                        TransparentCounter(count = 1)
                        TransparentCounter(count = 10)
                        TransparentCounter(count = 100)
                    }
                }
                item {
                    SampleRow(text = "Badge", lastItem = true) {
                        Badge(
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            },
                        )
                        Badge(
                            count = 1,
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 10,
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                        Badge(
                            count = 100,
                            content = {
                                PersianTertiaryIconButton(
                                    icon = rememberVectorPainter(image = PersianSymbols.Default.User),
                                    onClick = {}
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}