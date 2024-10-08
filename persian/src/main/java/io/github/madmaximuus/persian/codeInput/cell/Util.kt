package io.github.madmaximuus.persian.codeInput.cell

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * A [VisualTransformation] that masks the input text with a bullet character (●),
 * typically used for password fields or other sensitive input.
 *
 * This transformation replaces each character in the input text with a bullet character,
 * ensuring that the actual input is not visible to the user.
 */
class SecretTransformation : VisualTransformation {

    /**
     * Filters the input text to replace each character with a bullet character (●).
     *
     * @param text The original [AnnotatedString] to be transformed.
     * @return A [TransformedText] containing the masked text.
     */
    override fun filter(text: AnnotatedString): TransformedText {
        val newRow = if (text.text.isEmpty()) text.toString() else "●"
        return TransformedText(
            text = AnnotatedString(text = newRow),
            offsetMapping = OffsetMapping.Identity
        )
    }
}
