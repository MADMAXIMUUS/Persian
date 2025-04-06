package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object ColorScheme : Screen {
    override val name: String = "Color scheme"
    override val image: Int = R.drawable.color_scheme
    override val navigation: String = "color_scheme"

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
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.primary)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Primary",
                        color = PersianTheme.colorScheme.onPrimary,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onPrimary)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Primary",
                        color = PersianTheme.colorScheme.primary,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.primaryContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Primary Container",
                        color = PersianTheme.colorScheme.onPrimaryContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onPrimaryContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Primary Container",
                        color = PersianTheme.colorScheme.primaryContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.secondary)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Secondary",
                        color = PersianTheme.colorScheme.onSecondary,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onSecondary)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Secondary",
                        color = PersianTheme.colorScheme.secondary,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.secondaryContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Secondary Container",
                        color = PersianTheme.colorScheme.onSecondaryContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onSecondaryContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Secondary Container",
                        color = PersianTheme.colorScheme.secondaryContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.tertiary)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Tertiary",
                        color = PersianTheme.colorScheme.onTertiary,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onTertiary)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Tertiary",
                        color = PersianTheme.colorScheme.tertiary,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.tertiaryContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Tertiary Container",
                        color = PersianTheme.colorScheme.onTertiaryContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onTertiaryContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Tertiary Container",
                        color = PersianTheme.colorScheme.tertiaryContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.error)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Error",
                        color = PersianTheme.colorScheme.onError,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onError)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Error",
                        color = PersianTheme.colorScheme.error,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.errorContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Error Container",
                        color = PersianTheme.colorScheme.onErrorContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onErrorContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Error Container",
                        color = PersianTheme.colorScheme.errorContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.warning)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Warning",
                        color = PersianTheme.colorScheme.onWarning,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onWarning)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Warning",
                        color = PersianTheme.colorScheme.warning,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.warningContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Warning Container",
                        color = PersianTheme.colorScheme.onWarningContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onWarningContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Warning Container",
                        color = PersianTheme.colorScheme.warningContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.valid)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Valid",
                        color = PersianTheme.colorScheme.onValid,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onValid)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Valid",
                        color = PersianTheme.colorScheme.valid,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.validContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Valid Container",
                        color = PersianTheme.colorScheme.onValidContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onValidContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Valid Container",
                        color = PersianTheme.colorScheme.validContainer,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.outline)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Outline",
                        color = PersianTheme.colorScheme.outlineVariant,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.outlineVariant)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Outline",
                        color = PersianTheme.colorScheme.outline,
                        style = PersianTheme.typography.headlineSmall
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surface)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.onSurface)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "On Surface",
                        color = PersianTheme.colorScheme.surface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceDim)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Dim",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceBright)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Bright",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceContainerLowest)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Container Lowest",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceContainerLow)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Container Low",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceContainer)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Container",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceContainerHigh)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Container High",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .background(PersianTheme.colorScheme.surfaceContainerHighest)
                        .padding(PersianTheme.spacing.size16),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = "Surface Container Highest",
                        color = PersianTheme.colorScheme.onSurface,
                        style = PersianTheme.typography.headlineSmall
                    )
                }
            }
        }
    }
}