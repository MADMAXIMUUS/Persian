package io.github.madmaximuus.persian.internal

import android.content.Context
import android.content.ContextWrapper

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
