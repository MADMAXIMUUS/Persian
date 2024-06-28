package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.progressIndicator.CircularProgressIndicator
import io.github.madmaximuus.persian.progressIndicator.LinearProgressIndicator
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ProgressIndicator : Screen {

    override val name: String = "Progress Indicators"

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
                    SampleRow(text = "Indeterminate Linear Progress Small", firstItem = true) {
                        LinearProgressIndicator(
                            modifier = Modifier.fillMaxWidth(),
                            sizes = ProgressIndicatorDefaults.linearSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Indeterminate Linear Progress Medium") {
                        LinearProgressIndicator(
                            modifier = Modifier.fillMaxWidth(),
                            sizes = ProgressIndicatorDefaults.linearMedium()
                        )
                    }
                }
                item {
                    SampleRow(text = "Indeterminate Linear Progress Large") {
                        LinearProgressIndicator(
                            modifier = Modifier.fillMaxWidth(),
                            sizes = ProgressIndicatorDefaults.linearLarge()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress small") {
                        LinearProgressIndicator(
                            progress = { 0.5f },
                            modifier = Modifier.fillMaxWidth(),
                            sizes = ProgressIndicatorDefaults.linearSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress Medium") {
                        LinearProgressIndicator(
                            progress = { 0.5f },
                            modifier = Modifier.fillMaxWidth(),
                            sizes = ProgressIndicatorDefaults.linearMedium()
                        )
                    }
                }
                item {
                    SampleRow(text = "Linear Progress Large") {
                        LinearProgressIndicator(
                            progress = { 0.5f },
                            modifier = Modifier.fillMaxWidth(),
                            sizes = ProgressIndicatorDefaults.linearLarge()
                        )
                    }
                }
                item {
                    SampleRow(text = "Indeterminate Circular Progress") {
                        CircularProgressIndicator(
                            sizes = ProgressIndicatorDefaults.circularLarge()
                        )
                        CircularProgressIndicator(
                            sizes = ProgressIndicatorDefaults.circularMedium()
                        )
                        CircularProgressIndicator(
                            sizes = ProgressIndicatorDefaults.circularSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Circular Progress") {
                        CircularProgressIndicator(
                            progress = { 0.5f },
                            sizes = ProgressIndicatorDefaults.circularLarge()
                        )
                        CircularProgressIndicator(
                            progress = { 0.5f },
                            sizes = ProgressIndicatorDefaults.circularMedium()
                        )
                        CircularProgressIndicator(
                            progress = { 0.5f },
                            sizes = ProgressIndicatorDefaults.circularSmall()
                        )
                    }
                }
                item {
                    SampleRow(text = "Circular Progress With Content", lastItem = true) {
                        CircularProgressIndicator(
                            progress = { 0.5f },
                            sizes = ProgressIndicatorDefaults.circularLarge(),
                            content = true
                        )
                        CircularProgressIndicator(
                            progress = { 0.5f },
                            sizes = ProgressIndicatorDefaults.circularMedium(),
                            content = true
                        )
                        CircularProgressIndicator(
                            progress = { 0.5f },
                            sizes = ProgressIndicatorDefaults.circularSmall(),
                            content = true
                        )
                    }
                }
            }
        }
    }
}