package ru.rabbit.persian.appShowcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import ru.rabbit.persian.appShowcase.screens.ActionSheet
import ru.rabbit.persian.appShowcase.screens.Alert
import ru.rabbit.persian.appShowcase.screens.Avatar
import ru.rabbit.persian.appShowcase.screens.Banner
import ru.rabbit.persian.appShowcase.screens.Button
import ru.rabbit.persian.appShowcase.screens.CheckBox
import ru.rabbit.persian.appShowcase.screens.CodeInput
import ru.rabbit.persian.appShowcase.screens.Counter
import ru.rabbit.persian.appShowcase.screens.DatePickerDialog
import ru.rabbit.persian.appShowcase.screens.Divider
import ru.rabbit.persian.appShowcase.screens.Fab
import ru.rabbit.persian.appShowcase.screens.Forms
import ru.rabbit.persian.appShowcase.screens.IconButton
import ru.rabbit.persian.appShowcase.screens.Inputs
import ru.rabbit.persian.appShowcase.screens.ModalPage
import ru.rabbit.persian.appShowcase.screens.NavigationBar
import ru.rabbit.persian.appShowcase.screens.ProgressBar
import ru.rabbit.persian.appShowcase.screens.RadioButton
import ru.rabbit.persian.appShowcase.screens.Search
import ru.rabbit.persian.appShowcase.screens.Skeleton
import ru.rabbit.persian.appShowcase.screens.Snackbar
import ru.rabbit.persian.appShowcase.screens.Tabs
import ru.rabbit.persian.appShowcase.screens.TextArea
import ru.rabbit.persian.appShowcase.screens.TopAppBar

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalLayoutApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            PersianTheme {
                val navController = rememberNavController()
                val screens = remember {
                    arrayListOf(
                        ActionSheet,
                        Alert,
                        Button,
                        Avatar,
                        Banner,
                        CheckBox,
                        Counter,
                        Divider,
                        Fab,
                        Forms,
                        IconButton,
                        Inputs,
                        ModalPage,
                        NavigationBar,
                        ProgressBar,
                        RadioButton,
                        Search,
                        Snackbar,
                        Tabs,
                        TextArea,
                        TopAppBar,
                        CodeInput,
                        DatePickerDialog,
                        Skeleton
                    )
                }
                NavHost(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(PaddingValues(0.dp))
                        .consumeWindowInsets(PaddingValues(0.dp))
                        .windowInsetsPadding(
                            WindowInsets.safeDrawing.only(
                                WindowInsetsSides.Horizontal,
                            ),
                        ),
                    navController = navController,
                    startDestination = "dashboard"
                ) {
                    composable("dashboard") { _ ->
                        DashboardScreen(navController, screens.sortedBy { it.name })
                    }
                    screens.forEach { screen ->
                        composable(screen.navigation) { screen.Content(navController) }
                    }
                }
            }
        }
    }
}