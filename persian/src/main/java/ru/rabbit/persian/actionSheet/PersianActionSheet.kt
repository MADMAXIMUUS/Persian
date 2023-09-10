package ru.rabbit.persian.actionSheet

import android.view.Gravity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import ru.rabbit.persian.foundation.elevation
import ru.rabbit.persian.foundation.spacing

object PersianActionSheet {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        actions: List<ActionItem>,
        header: @Composable (PersianActionSheetHeader.() -> Unit)? = null,
        onDismissRequest: () -> Unit
    ) {
        Dialog(
            onDismissRequest = onDismissRequest,
            properties = DialogProperties(
                decorFitsSystemWindows = false,
                usePlatformDefaultWidth = false
            ),
            content = {
                val dialogWindowProvider = LocalView.current.parent as DialogWindowProvider
                dialogWindowProvider.window.setGravity(Gravity.BOTTOM)
                Surface(
                    modifier = modifier
                        .padding(
                            start = MaterialTheme.spacing.large,
                            end = MaterialTheme.spacing.large,
                            bottom = MaterialTheme.spacing.small,
                            top = 0.dp
                        ),
                    shape = MaterialTheme.shapes.large,
                    tonalElevation = MaterialTheme.elevation.extraSmall,
                ) {
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = MaterialTheme.spacing.small)
                    ) {
                        if (header != null) {
                            PersianActionSheetHeader.header()
                        }
                        actions.forEach {
                            PersianActionItem.Primary(
                                actionItem = it,
                            )
                        }
                    }
                }
            }
        )
    }

}