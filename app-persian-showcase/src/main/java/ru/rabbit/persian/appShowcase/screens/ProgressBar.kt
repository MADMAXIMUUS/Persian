package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.progressBars.PersianCircularProgressBarSize
import ru.rabbit.persian.progressBars.PersianLinearProgressBarSize
import ru.rabbit.persian.progressBars.PersianProgressBar

object ProgressBar : Screen {

    override val name: String = "Progress Bars"

    override val navigation: String = "progress"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            }
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Inherit Linear Progress Small", firstItem = true) {
                        PersianProgressBar.Linear(
                            sizes = PersianLinearProgressBarSize.small()
                        )
                    }
                }
                item {
                    SampleRow(text = "Inherit Linear Progress Medium") {
                        PersianProgressBar.Linear(
                            sizes = PersianLinearProgressBarSize.medium()
                        )
                    }
                }
                item {
                    SampleRow(text = "Inherit Linear Progress Large") {
                        PersianProgressBar.Linear(
                            sizes = PersianLinearProgressBarSize.large()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress small") {
                        PersianProgressBar.Linear(
                            progress = 0.5f,
                            sizes = PersianLinearProgressBarSize.small()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress Medium") {
                        PersianProgressBar.Linear(
                            progress = 0.5f,
                            sizes = PersianLinearProgressBarSize.medium()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress Large") {
                        PersianProgressBar.Linear(
                            progress = 0.5f,
                            sizes = PersianLinearProgressBarSize.large()
                        )
                    }
                }
                item {
                    SampleRow(text = "Inherit Circular Progress") {
                        PersianProgressBar.Circular(
                            sizes = PersianCircularProgressBarSize.large()
                        )
                        PersianProgressBar.Circular(
                            sizes = PersianCircularProgressBarSize.medium()
                        )
                        PersianProgressBar.Circular(
                            sizes = PersianCircularProgressBarSize.small()
                        )
                    }
                }
                item {
                    SampleRow(text = "Circular Progress") {
                        PersianProgressBar.Circular(
                            progress = 0.5f,
                            sizes = PersianCircularProgressBarSize.large()
                        )
                        PersianProgressBar.Circular(
                            progress = 0.5f,
                            sizes = PersianCircularProgressBarSize.medium()
                        )
                        PersianProgressBar.Circular(
                            progress = 0.5f,
                            sizes = PersianCircularProgressBarSize.small()
                        )
                    }
                }
                item {
                    SampleRow(text = "Circular Progress With Content", lastItem = true) {
                        PersianProgressBar.Circular(
                            progress = 0.5f,
                            sizes = PersianCircularProgressBarSize.large(),
                            content = { Text() }
                        )
                        PersianProgressBar.Circular(
                            progress = 0.5f,
                            sizes = PersianCircularProgressBarSize.medium(),
                            content = { Text() }
                        )
                        PersianProgressBar.Circular(
                            progress = 0.5f,
                            sizes = PersianCircularProgressBarSize.small(),
                            content = { Text() }
                        )
                    }
                }
            }
        }
    }
}