package io.github.madmaximuus.persian.codeInput.cell

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class SecretTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val newRow = if (text.text.isEmpty()) text.toString() else "●"
        return TransformedText(
            text = AnnotatedString(text =  newRow),
            offsetMapping = OffsetMapping.Identity
        )
    }
}
