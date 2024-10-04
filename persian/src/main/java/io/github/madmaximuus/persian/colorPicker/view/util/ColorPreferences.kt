package io.github.madmaximuus.persian.colorPicker.view.util

import android.content.Context
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class ColorPreferences(private val context: Context) {

    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "color_preferences")
        private val COLORS_KEY = stringPreferencesKey("colors")
    }

    suspend fun saveColors(colors: List<Color>) {
        val colorsList = colors.map { it.toArgb() }
        val colorsString = colorsList.joinToString(",")
        context.dataStore.edit { preferences ->
            preferences[COLORS_KEY] = colorsString
        }
    }

    suspend fun loadColors(): List<Color> {
        val preferences = context.dataStore.data.map { preferences ->
            preferences[COLORS_KEY] ?: ""
        }
        val colorsString = preferences.first()
        return if (colorsString.isNotEmpty()) {
            colorsString.split(",").map { Color(it.toInt()) }
        } else {
            emptyList()
        }
    }
}