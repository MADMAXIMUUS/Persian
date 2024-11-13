package io.github.madmaximuus.persian.internal

import android.content.Context
import android.content.ContextWrapper

/**
 * Searches for the first context in the hierarchy that matches the specified type `T`.
 *
 * This function traverses the context hierarchy starting from the provided [context].
 * It checks each context in the hierarchy to see if it is an instance of the specified type `T`.
 * If a matching context is found, it is returned; otherwise, `null` is returned.
 *
 * @param T The type of the context to search for.
 * @param context The starting context from which to begin the search.
 */
internal inline fun <reified T> findOwner(context: Context): T? {
    var innerContext = context
    while (innerContext is ContextWrapper) {
        if (innerContext is T) {
            return innerContext
        }
        innerContext = innerContext.baseContext
    }
    return null
}
