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

/**
 * A class for managing color preferences using a DataStore.
 *
 * This class provides methods to save and load a list of colors to and from the DataStore.
 * The colors are stored as ARGB integers and converted to and from strings for storage.
 *
 * @property context The context used to access the DataStore.
 */
class ColorPreferences(private val context: Context) {

    companion object {

        /**
         * A DataStore instance for storing color preferences.
         */
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "color_preferences")

        /**
         * The key used to store the list of colors in the DataStore.
         */
        private val COLORS_KEY = stringPreferencesKey("colors")
    }

    /**
     * Saves a list of colors to the DataStore.
     *
     * The colors are converted to ARGB integers and then to a comma-separated string before being stored.
     *
     * @param colors The list of colors to be saved.
     */
    suspend fun saveColors(colors: List<Color>) {
        val colorsList = colors.map { it.toArgb() }
        val colorsString = colorsList.joinToString(",")
        context.dataStore.edit { preferences ->
            preferences[COLORS_KEY] = colorsString
        }
    }

    /**
     * Loads a list of colors from the DataStore.
     *
     * The colors are retrieved as a comma-separated string, split into individual ARGB integers, and then converted back to [Color] objects.
     *
     * @return A list of colors loaded from the DataStore.
     */
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