package io.github.madmaximuus.persian.snackbar

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
import io.github.madmaximuus.persian.foundation.spacing

data class PersianSnackbarVisuals(
    override val message: String,
    override val actionLabel: String? = null,
    override val withDismissAction: Boolean = false,
    override val duration: SnackbarDuration = SnackbarDuration.Indefinite,
    val showOnTop: Boolean = false,
    val left: PersianSnackbarLeft? = null,
    val right: PersianSnackbarRight? = null,
    val onDismiss: (() -> Unit)? = null
) : SnackbarVisuals

object PersianSnackbar {

    @Composable
    fun Primary(
        text: String,
        left: PersianSnackbarLeft? = null,
        colors: SnackbarColors = PersianSnackbarDefaults.colors(),
        sizes: SnackbarSizes = PersianSnackbarDefaults.sizes(),
        right: PersianSnackbarRight? = null,
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
                    when (left) {
                        is PersianSnackbarLeft.Avatar -> {
                            PersianSnackbarLeftAvatar(avatarUrl = left.avatarUrl)
                        }

                        is PersianSnackbarLeft.Icon -> {
                            PersianSnackbarLeftIcon(
                                icon = left.icon,
                                color = left.color,
                                contentDescription = ""
                            )
                        }

                        is PersianSnackbarLeft.Image -> {
                            PersianSnackbarLeftImage(imageUrl = left.imageUrl)
                        }

                        is PersianSnackbarLeft.Progress -> {
                            PersianSnackbarLeftProgress(progress = left.progress)
                        }

                        null -> {}
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
                                    horizontal = MaterialTheme.spacing.medium,
                                    vertical = MaterialTheme.spacing.medium
                                ),
                            text = text,
                            style = sizes.textStyle,
                            color = colors.textColor
                        )
                    }
                    when (right) {
                        is PersianSnackbarRight.Action -> {
                            PersianSnackbarRightAction(
                                text = right.text,
                                onClick = right.onClick
                            )
                        }

                        is PersianSnackbarRight.Close -> {
                            PersianSnackbarRightClose(
                                onClick = right.onClick
                            )
                        }

                        null -> {}
                    }
                }
            }
        )
    }
}