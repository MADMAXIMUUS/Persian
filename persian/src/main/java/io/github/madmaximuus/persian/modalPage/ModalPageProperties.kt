package io.github.madmaximuus.persian.modalPage

import android.view.WindowManager
import androidx.compose.runtime.Immutable
import androidx.compose.ui.window.SecureFlagPolicy

/**
 * Properties used to customize the behavior of a [ModalPage].
 *
 * @param securePolicy Policy for setting [WindowManager.LayoutParams.FLAG_SECURE] on the bottom
 *   sheet's window.
 * @param shouldDismissOnBackPress Whether the modal bottom sheet can be dismissed by pressing the
 *   back button. If true, pressing the back button will call onDismissRequest.
 */
@Immutable
class ModalPageProperties(
    val securePolicy: SecureFlagPolicy = SecureFlagPolicy.Inherit,
    val shouldDismissOnBackPress: Boolean = true,
) {
    constructor(
        shouldDismissOnBackPress: Boolean,
    ) : this(
        securePolicy = SecureFlagPolicy.Inherit,
        shouldDismissOnBackPress = shouldDismissOnBackPress
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModalPageProperties) return false
        if (securePolicy != other.securePolicy) return false

        return true
    }

    override fun hashCode(): Int {
        var result = securePolicy.hashCode()
        result = 31 * result + shouldDismissOnBackPress.hashCode()
        return result
    }
}