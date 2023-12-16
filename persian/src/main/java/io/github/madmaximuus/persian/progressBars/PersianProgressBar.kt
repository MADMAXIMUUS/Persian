package io.github.madmaximuus.persian.progressBars

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
import io.github.madmaximuus.persian.foundation.PersianTheme

@Composable
fun PersianLinearProgressBar(
    modifier: Modifier = Modifier,
    colors: ProgressBarColors = PersianProgressBarDefaults.colors(),
    sizes: LinearProgressBarSizes = PersianProgressBarDefaults.linearMedium(),
) {
    LinearProgressIndicator(
        modifier = modifier.height(sizes.strokeSize),
        color = colors.progressColor,
        trackColor = colors.backgroundColor,
        strokeCap = StrokeCap.Round,
    )
}

@Composable
fun PersianLinearProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    colors: ProgressBarColors = PersianProgressBarDefaults.colors(),
    sizes: LinearProgressBarSizes = PersianProgressBarDefaults.linearMedium(),
) {
    LinearProgressIndicator(
        progress = progress,
        modifier = modifier.height(sizes.strokeSize),
        color = colors.progressColor,
        trackColor = colors.backgroundColor
    )
}

@Composable
fun PersianCircularProgressBar(
    modifier: Modifier = Modifier,
    colors: ProgressBarColors = PersianProgressBarDefaults.colors(),
    sizes: CircularProgressBarSizes = PersianProgressBarDefaults.circularMedium(),
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
fun PersianCircularProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    colors: ProgressBarColors = PersianProgressBarDefaults.colors(),
    sizes: CircularProgressBarSizes = PersianProgressBarDefaults.circularMedium(),
    counter: Boolean = false
) {
    Box(
        modifier = modifier
            .size(size = sizes.boxSize),
    ) {
        if (counter) {
            CompositionLocalProvider(
                LocalCircularProgress provides progress
            ) {
                Box(
                    modifier = Modifier
                        .padding(sizes.strokeSize + sizes.contentPadding)
                ) {
                    PersianProgressBarContent()
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

@Preview
@Composable
fun LinearProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianLinearProgressBar(
                sizes = PersianProgressBarDefaults.linearMedium()
            )
        }
    }
}

@Preview
@Composable
fun LinearProgressProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianLinearProgressBar(
                progress = 0.5f,
                sizes = PersianProgressBarDefaults.linearMedium()
            )
        }
    }
}

@Preview
@Composable
fun CircularProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianCircularProgressBar(
                sizes = PersianProgressBarDefaults.circularMedium(),
            )
        }
    }
}

@Preview
@Composable
fun CircularProgressProgressBarPreview() {
    PersianTheme {
        Surface {
            PersianCircularProgressBar(
                progress = 0.8f,
                sizes = PersianProgressBarDefaults.circularMedium(),
                counter = true
            )
        }
    }
}