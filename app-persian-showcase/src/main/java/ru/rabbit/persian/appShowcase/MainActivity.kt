package ru.rabbit.persian.appShowcase

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Left
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Right
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import ru.rabbit.persian.appShowcase.screens.ActionSheet
import ru.rabbit.persian.appShowcase.screens.Alert
import ru.rabbit.persian.appShowcase.screens.AvatarAndImage
import ru.rabbit.persian.appShowcase.screens.Banner
import ru.rabbit.persian.appShowcase.screens.Button
import ru.rabbit.persian.appShowcase.screens.Checkbox
import ru.rabbit.persian.appShowcase.screens.Chips
import ru.rabbit.persian.appShowcase.screens.CodeInput
import ru.rabbit.persian.appShowcase.screens.ColorPicker
import ru.rabbit.persian.appShowcase.screens.ColorScheme
import ru.rabbit.persian.appShowcase.screens.Counter
import ru.rabbit.persian.appShowcase.screens.DatePicker
import ru.rabbit.persian.appShowcase.screens.Divider
import ru.rabbit.persian.appShowcase.screens.Elevation
import ru.rabbit.persian.appShowcase.screens.Fab
import ru.rabbit.persian.appShowcase.screens.FormItem
import ru.rabbit.persian.appShowcase.screens.IconButton
import ru.rabbit.persian.appShowcase.screens.Input
import ru.rabbit.persian.appShowcase.screens.ListItem
import ru.rabbit.persian.appShowcase.screens.ModalPage
import ru.rabbit.persian.appShowcase.screens.NavigationBar
import ru.rabbit.persian.appShowcase.screens.PageIndicator
import ru.rabbit.persian.appShowcase.screens.ProgressIndicator
import ru.rabbit.persian.appShowcase.screens.RadioButton
import ru.rabbit.persian.appShowcase.screens.Section
import ru.rabbit.persian.appShowcase.screens.SegmentedControls
import ru.rabbit.persian.appShowcase.screens.Select
import ru.rabbit.persian.appShowcase.screens.Shapes
import ru.rabbit.persian.appShowcase.screens.Skeleton
import ru.rabbit.persian.appShowcase.screens.Slider
import ru.rabbit.persian.appShowcase.screens.Snackbar
import ru.rabbit.persian.appShowcase.screens.Spacing
import ru.rabbit.persian.appShowcase.screens.Switch
import ru.rabbit.persian.appShowcase.screens.Symbols
import ru.rabbit.persian.appShowcase.screens.Tabs
import ru.rabbit.persian.appShowcase.screens.TextArea
import ru.rabbit.persian.appShowcase.screens.TimePicker
import ru.rabbit.persian.appShowcase.screens.TopAppBar
import ru.rabbit.persian.appShowcase.screens.Typography

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                Color.TRANSPARENT, Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.auto(
                Color.TRANSPARENT, Color.TRANSPARENT
            )
        )

        setContent {
            PersianTheme {
                val navController = rememberNavController()
                val foundationScreens = listOf(
                    Skeleton,
                    Symbols,
                    ColorScheme,
                    Typography,
                    Shapes,
                    Spacing,
                    Elevation
                )
                val componentScreens =
                    arrayListOf(
                        ActionSheet,
                        Alert,
                        Button,
                        AvatarAndImage,
                        Banner,
                        Checkbox,
                        Counter,
                        Divider,
                        Fab,
                        FormItem,
                        IconButton,
                        Input,
                        ModalPage,
                        NavigationBar,
                        ProgressIndicator,
                        RadioButton,
                        Snackbar,
                        Tabs,
                        TextArea,
                        TopAppBar,
                        CodeInput,
                        DatePicker,
                        Switch,
                        /*Charts,*/
                        PageIndicator,
                        TimePicker,
                        Chips,
                        Select,
                        ColorPicker,
                        ListItem,
                        Slider,
                        SegmentedControls,
                        Section
                    )
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
                    composable(
                        "dashboard",
                        enterTransition = {
                            slideIntoContainer(
                                towards = Left,
                            )
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                towards = Left,
                            )
                        },
                        popEnterTransition = {
                            slideIntoContainer(
                                towards = Right,
                            )
                        },
                        popExitTransition = {
                            slideOutOfContainer(
                                towards = Right,
                            )
                        }
                    ) { _ ->
                        DashboardScreen(
                            navController,
                            foundationScreens.sortedBy { it.name },
                            componentScreens.sortedBy { it.name }
                        )
                    }
                    foundationScreens.forEach { screen ->
                        composable(
                            screen.navigation,
                            enterTransition = {
                                slideIntoContainer(
                                    towards = Left,
                                )
                            },
                            exitTransition = {
                                slideOutOfContainer(
                                    towards = Left,
                                )
                            },
                            popEnterTransition = {
                                slideIntoContainer(
                                    towards = Right,
                                )
                            },
                            popExitTransition = {
                                slideOutOfContainer(
                                    towards = Right,
                                )
                            }
                        ) { screen.Content(navController) }
                    }
                    componentScreens.forEach { screen ->
                        composable(
                            screen.navigation,
                            enterTransition = {
                                slideIntoContainer(
                                    towards = Left,
                                )
                            },
                            exitTransition = {
                                slideOutOfContainer(
                                    towards = Left,
                                )
                            },
                            popEnterTransition = {
                                slideIntoContainer(
                                    towards = Right,
                                )
                            },
                            popExitTransition = {
                                slideOutOfContainer(
                                    towards = Right,
                                )
                            }
                        ) { screen.Content(navController) }
                    }
                }
            }
        }
    }
}