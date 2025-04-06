package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Spacing : Screen {
    override val name: String = "Spacing"
    override val image: Int = R.drawable.spacing
    override val navigation: String = "spacing"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .verticalScroll(rememberScrollState())
                    .navigationBarsPadding(),
                verticalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
            ) {
                SampleRow(text = "2dp", firstItem = true) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size2)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "4dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size4)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "6dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size6)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "8dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size8)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "10dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size10)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "12dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size12)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "14dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size14)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "16dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size16)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "18dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size18)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "20dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size20)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "22dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size22)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
                SampleRow(text = "24dp") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(PersianTheme.spacing.size24)
                            .background(PersianTheme.colorScheme.onSurface)
                    )
                }
            }
        }
    }
}