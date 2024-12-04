package ru.rabbit.persian.appShowcase.util

import android.content.Context
import androidx.compose.runtime.compositionLocalOf
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SettingsManager(context: Context) {
    private val Context.dataStore by preferencesDataStore(name = "app_settings")
    private val dataStore = context.dataStore

    companion object {
        val THEME_KEY = stringPreferencesKey("theme")
        val COLOR_THEME_KEY = stringPreferencesKey("color_theme")
    }

    val theme: Flow<Theme> = dataStore.data.map { preferences ->
        preferences[THEME_KEY]?.let { enumValueOf<Theme>(it) } ?: Theme.SYSTEM
    }

    val colorTheme: Flow<ColorsTheme> = dataStore.data.map { preferences ->
        preferences[COLOR_THEME_KEY]?.let { enumValueOf<ColorsTheme>(it) } ?: ColorsTheme.BASELINE
    }

    suspend fun updateTheme(theme: Theme) {
        dataStore.edit { preferences ->
            preferences[THEME_KEY] = theme.name
        }
    }

    suspend fun updateColorTheme(colorTheme: ColorsTheme) {
        dataStore.edit { preferences ->
            preferences[COLOR_THEME_KEY] = colorTheme.name
        }
    }
}

enum class Theme {
    SYSTEM, LIGHT, DARK
}

enum class ColorsTheme {
    BASELINE, DYNAMIC
}

val LocalAppSettingsManager = compositionLocalOf<SettingsManager> {
    error("No AppSettingsManager provided")
}