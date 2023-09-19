package io.github.madmaximuus.persian.forms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.spacing

object PersianForm {

    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        subhead: (@Composable PersianFormSubhead.() -> Unit)? = null,
        content: @Composable PersianFormContent.() -> Unit,
        caption: (@Composable PersianFormCaption.() -> Unit)? = null,
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraExtraSmall)
        ) {
            if (subhead != null) {
                PersianFormSubhead.subhead()
            }
            PersianFormContent.content()
            if (caption != null) {
                PersianFormCaption.caption()
            }
        }
    }
}

@Composable
private fun captionColor(
    enabled: Boolean,
    isError: Boolean,
    captionColor: Color
): State<Color> {
    val color = when {
        isError -> MaterialTheme.extendedColorScheme.error
        !enabled -> captionColor

        else -> MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled)
    }
    return rememberUpdatedState(newValue = color)
}