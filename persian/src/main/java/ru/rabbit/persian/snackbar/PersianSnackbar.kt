package ru.rabbit.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import ru.rabbit.persian.foundation.spacing

data class PersianSnackbarVisuals(
    override val message: String,
    override val actionLabel: String? = null,
    override val withDismissAction: Boolean = false,
    override val duration: SnackbarDuration = SnackbarDuration.Indefinite,
    val showOnTop: Boolean = false,
    val left: (@Composable PersianSnackbarLeft.() -> Unit)? = null,
    val right: (@Composable PersianSnackbarRight.() -> Unit)? = null,
    val onDismiss: (() -> Unit)? = null
) : SnackbarVisuals

object PersianSnackbar {

    @Composable
    fun Primary(
        text: String,
        left: (@Composable PersianSnackbarLeft.() -> Unit)? = null,
        colors: SnackbarColors = PersianSnackbarColors.primary(),
        sizes: SnackbarSizes = PersianSnackbarSizes.large(),
        right: (@Composable PersianSnackbarRight.() -> Unit)? = null,
        showOnTop: Boolean = false
    ) {
        val configuration = LocalConfiguration.current

        val spacingLarge = MaterialTheme.spacing.large

        val padding by remember {
            mutableStateOf(
                if (showOnTop) {
                    PaddingValues(
                        start = spacingLarge,
                        top = 50.dp,
                        bottom = configuration.screenHeightDp.dp - 100.dp,
                        end = spacingLarge
                    )
                } else {
                    PaddingValues(horizontal = spacingLarge, vertical = 70.dp)
                }
            )
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(min = 52.dp)
                .padding(padding),
            shape = sizes.cornerRadius,
            color = colors.backgroundColor,
            content = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    if (left != null) PersianSnackbarLeft.left()
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
                                    horizontal = MaterialTheme.spacing.medium,
                                    vertical = MaterialTheme.spacing.medium
                                ),
                            text = text,
                            style = sizes.textStyle,
                            color = colors.textColor
                        )
                    }
                    if (right != null)
                        PersianSnackbarRight.right()
                }
            }
        )
    }
}