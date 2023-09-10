package ru.rabbit.persian.progressBars

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import ru.rabbit.persian.foundation.PersianTheme

object PersianProgressBar {

    @Composable
    fun Linear(
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = PersianProgressBarColors.primary(),
        sizes: LinearProgressBarSizes = PersianLinearProgressBarSize.medium(),
    ) {
        LinearProgressIndicator(
            modifier = modifier.height(sizes.strokeSize),
            color = colors.progressColor,
            trackColor = colors.backgroundColor,
            strokeCap = StrokeCap.Round,
        )
    }

    @Composable
    fun Linear(
        progress: Float,
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = PersianProgressBarColors.primary(),
        sizes: LinearProgressBarSizes = PersianLinearProgressBarSize.medium(),
    ) {
        LinearProgressIndicator(
            progress = progress,
            modifier = modifier.height(sizes.strokeSize),
            color = colors.progressColor,
            trackColor = colors.backgroundColor
        )
    }

    @Composable
    fun Circular(
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = PersianProgressBarColors.primary(),
        sizes: CircularProgressBarSizes = PersianCircularProgressBarSize.medium(),
    ) {
        Box(
            modifier = modifier
                .size(size = sizes.boxSize),
        ) {
            CircularProgressIndicator(
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxSize()
                    .padding(sizes.contentPadding),
                color = colors.progressColor,
                trackColor = colors.backgroundColor,
                strokeCap = StrokeCap.Round,
                strokeWidth = sizes.strokeSize
            )
        }
    }

    @Composable
    fun Circular(
        progress: Float,
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = PersianProgressBarColors.primary(),
        sizes: CircularProgressBarSizes = PersianCircularProgressBarSize.medium(),
        content: (@Composable PersianProgressBarContent.() -> Unit)? = null
    ) {
        Box(
            modifier = modifier
                .size(size = sizes.boxSize),
        ) {
            if (content != null) {
                CompositionLocalProvider(
                    LocalCircularProgress provides progress
                ) {
                    Box(
                        modifier = Modifier
                            .padding(sizes.strokeSize + sizes.contentPadding)
                    ) {
                        PersianProgressBarContent.content()
                    }
                }
            }
            CircularProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxSize()
                    .padding(sizes.contentPadding),
                color = colors.progressColor,
                trackColor = colors.backgroundColor,
                strokeCap = StrokeCap.Round,
                strokeWidth = sizes.strokeSize
            )
        }
    }
}

@Preview
@Composable
fun LinearProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianProgressBar.Linear(
                sizes = PersianLinearProgressBarSize.small()
            )
        }
    }
}

@Preview
@Composable
fun LinearProgressProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianProgressBar.Linear(
                progress = 0.5f,
                sizes = PersianLinearProgressBarSize.small()
            )
        }
    }
}

@Preview
@Composable
fun CircularProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianProgressBar.Circular(
                sizes = PersianCircularProgressBarSize.small()
            )
        }
    }
}

@Preview
@Composable
fun CircularProgressProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianProgressBar.Circular(
                progress = 0.8f,
                sizes = PersianCircularProgressBarSize.medium(),
                content = { Text() }
            )
        }
    }
}