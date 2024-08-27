package io.github.madmaximuus.persian.modalPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarLeft
import io.github.madmaximuus.persian.topAppBar.PersianTopAppBarRight
import io.github.madmaximuus.persian.topAppBar.TopAppBar

interface ModalPageTopScope {
    val colors: ModalPageColors
    val sizes: ModalPageSizes
}

internal class ModalPageTopScopeWrapper(
    override val sizes: ModalPageSizes,
    override val colors: ModalPageColors,
) : ModalPageTopScope

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalPageTopScope.TopBar(
    title: String,
    actionTitle: String,
    onActionClick: () -> Unit
) {
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        left = PersianTopAppBarLeft.Close(
            onClick = {}
        ),
        title = title,
        right = PersianTopAppBarRight.Action(
            text = actionTitle,
            onClick = onActionClick
        )
    )
}

@Composable
fun ModalPageTopScope.Handle(
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = PersianTheme.spacing.size16),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(this@Handle.sizes.dragHandleSizes)
                .background(this@Handle.colors.dragHandleColor, PersianTheme.shapes.full)
        )
    }
}