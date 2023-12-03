package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.pagination.PersianPagination
import io.github.madmaximuus.persian.pagination.rememberPaginationState
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Pagination : Screen {

    override val name: String = "Pagination"

    override val navigation: String = "pagination"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() }
        ) {
            LazyColumn(Modifier.padding(it)) {
                item {
                    PersianPagination(
                        modifier = Modifier.fillMaxWidth(),
                        state = rememberPaginationState(100)
                    )
                }
            }

        }
    }
}