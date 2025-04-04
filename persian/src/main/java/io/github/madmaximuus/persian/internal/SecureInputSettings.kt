package io.github.madmaximuus.persian.internal

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

/**
 * A sealed interface representing the security settings for input fields.
 *
 * @see NotSecure
 * @see Secure
 */
@Stable
sealed interface SecureInputSettings {

    /**
     * Represents a setting where the input is not secure.
     */
    object NotSecure : SecureInputSettings {

        override fun toString(): String {
            return "SecureInputSettings.NotSecure"
        }
    }

    /**
     * Represents a setting where the input is secure.
     *
     * @property visible Indicates whether the secure input is visible. Default is `false`.
     * @property textObfuscationChar The character used to obfuscate the text. Default is `'\u2022'` (bullet).
     */
    @Immutable
    class Secure(
        val visible: Boolean = false,
        val textObfuscationChar: Char = '\u25CF'
    ) : SecureInputSettings {

        override fun toString(): String =
            "Secure(visible=$visible, textObfuscationChar=$textObfuscationChar)"

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other === null) return false
            if (this::class != other::class) return false
            other as Secure
            if (visible != other.visible) return false
            if (textObfuscationChar != other.textObfuscationChar) return false
            return true
        }

        override fun hashCode(): Int {
            var result = visible.hashCode()
            result = 31 * result + textObfuscationChar.hashCode()
            return result
        }
    }
}