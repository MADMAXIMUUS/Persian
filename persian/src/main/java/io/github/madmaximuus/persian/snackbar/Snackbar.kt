package io.github.madmaximuus.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

@Composable
fun Snackbar(
    snackbarData: SnackbarData,
    modifier: Modifier = Modifier,
    colors: SnackbarColors = SnackbarDefaults.colors(),
    sizes: SnackbarSizes = SnackbarDefaults.sizes(),
) {
    Surface(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size12)
            .widthIn(max = 500.dp)
            .fillMaxWidth()
            .heightIn(min = 52.dp),
        shape = sizes.cornerRadius,
        color = colors.backgroundColor,
        content = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                with(SnackbarLeftScope(snackbarData)) {
                    snackbarData.visuals.left?.let { it() }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                horizontal = PersianTheme.spacing.size12,
                                vertical = PersianTheme.spacing.size12
                            ),
                        text = snackbarData.visuals.message,
                        style = sizes.textStyle,
                        color = colors.textColor
                    )
                }
                with(SnackbarRightScope(snackbarData)) {
                    snackbarData.visuals.right?.let { it() }
                }
            }
        }
    )
}

/*
@Composable
fun Snackbar(
    message: String,
    modifier: Modifier = Modifier,
    left: (@Composable SnackbarLeftScope.() -> Unit)? = null,
    right: (@Composable SnackbarRightScope.() -> Unit)? = null,
    colors: SnackbarColors = SnackbarDefaults.colors(),
    sizes: SnackbarSizes = SnackbarDefaults.sizes(),
) {
    Surface(
        modifier = modifier
            .widthIn(max = 500.dp)
            .fillMaxWidth()
            .heightIn(min = 52.dp)
            .padding(horizontal = PersianTheme.spacing.size16),
        shape = sizes.cornerRadius,
        color = colors.backgroundColor,
        content = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 52.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                with(SnackbarLeftScope()) {
                    left?.let { it() }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                horizontal = PersianTheme.spacing.size12,
                                vertical = PersianTheme.spacing.size12
                            ),
                        text = message,
                        style = sizes.textStyle,
                        color = colors.textColor
                    )
                }
                with(SnackbarRightScope()) {
                    right?.let { it() }
                }
            }
        }
    )
}*/
