package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.buttons.PersianPrimaryButton
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.snackbar.PersianSnackbarLeft
import io.github.madmaximuus.persian.snackbar.PersianSnackbarRight
import io.github.madmaximuus.persian.snackbar.PersianSnackbarVisuals
import kotlinx.coroutines.launch
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Snackbar : Screen {

    override val name: String = "Snackbar"

    override val navigation: String = "snackbar"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val snackbarHostState = remember { SnackbarHostState() }
        val coroutineScope = rememberCoroutineScope()
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.navigateUp()
            },
            snackbarHostState = snackbarHostState,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
            ) {
                PersianPrimaryButton(
                    text = "Only text",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short
                            )
                        )
                    }
                }
                PersianPrimaryButton(
                    text = "With Action Button",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short,
                                right = PersianSnackbarRight.Action(
                                    text = "Action",
                                    onClick = {}
                                )
                            )
                        )
                    }
                }
                PersianPrimaryButton(
                    text = "With Close Button",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short,
                                right = PersianSnackbarRight.Close(onClick = {})
                            )
                        )
                    }
                }
                val icon = MaterialTheme.icons.errorCircle
                val color = MaterialTheme.extendedColorScheme.primary
                PersianPrimaryButton(
                    text = "With icon",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short,
                                left = PersianSnackbarLeft.Icon(
                                    icon = icon,
                                    color = color
                                )
                            )
                        )
                    }
                }
                PersianPrimaryButton(
                    text = "With image",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short,
                                left = PersianSnackbarLeft.Image(
                                    imageUrl = "https://loremflickr.com/320/240"
                                )
                            )
                        )
                    }
                }
                PersianPrimaryButton(
                    text = "With avatar",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short,
                                left = PersianSnackbarLeft.Avatar(
                                    avatarUrl = "https://loremflickr.com/320/240"
                                )
                            )
                        )
                    }
                }
                PersianPrimaryButton(
                    text = "With counter",
                    sizes = PersianButtonDefaults.largeSizes()
                ) {
                    coroutineScope.launch {
                        snackbarHostState.currentSnackbarData?.dismiss()
                        snackbarHostState.showSnackbar(
                            PersianSnackbarVisuals(
                                message = "Simple Snackbar",
                                duration = SnackbarDuration.Short,
                                left = PersianSnackbarLeft.Progress(
                                    progress = 0.5f
                                )
                            )
                        )
                    }
                }
            }
        }
    }
}