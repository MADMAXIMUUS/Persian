package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.progressBars.PersianCircularProgressBar
import io.github.madmaximuus.persian.progressBars.PersianLinearProgressBar
import io.github.madmaximuus.persian.progressBars.PersianProgressBarDefaults
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

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
                        PersianLinearProgressBar(
                            sizes = PersianProgressBarDefaults.linearSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Inherit Linear Progress Medium") {
                        PersianLinearProgressBar(
                            sizes = PersianProgressBarDefaults.linearMedium()
                        )
                    }
                }
                item {
                    SampleRow(text = "Inherit Linear Progress Large") {
                        PersianLinearProgressBar(
                            sizes = PersianProgressBarDefaults.linearLarge()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress small") {
                        PersianLinearProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.linearSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress Medium") {
                        PersianLinearProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.linearMedium()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress Large") {
                        PersianLinearProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.linearLarge()
                        )
                    }
                }
                item {
                    SampleRow(text = "Inherit Circular Progress") {
                        PersianCircularProgressBar(
                            sizes = PersianProgressBarDefaults.circularLarge()
                        )
                        PersianCircularProgressBar(
                            sizes = PersianProgressBarDefaults.circularMedium()
                        )
                        PersianCircularProgressBar(
                            sizes = PersianProgressBarDefaults.circularSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Circular Progress") {
                        PersianCircularProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.circularLarge()
                        )
                        PersianCircularProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.circularMedium()
                        )
                        PersianCircularProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.circularSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Circular Progress With Content", lastItem = true) {
                        PersianCircularProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.circularLarge(),
                            counter = true
                        )
                        PersianCircularProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.circularMedium(),
                            counter = true
                        )
                        PersianCircularProgressBar(
                            progress = 0.5f,
                            sizes = PersianProgressBarDefaults.circularSmall(),
                            counter = true
                        )
                    }
                }
            }
        }
    }
}