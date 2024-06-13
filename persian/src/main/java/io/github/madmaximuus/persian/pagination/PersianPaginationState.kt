package io.github.madmaximuus.persian.pagination

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import java.io.Serializable

class PersianPaginationState internal constructor(
    pageCount: Int,
    stateData: PaginationStateData? = null,
) {

    internal val pageCount by mutableIntStateOf(stateData?.pageCount ?: pageCount)
    var currentPosition by mutableIntStateOf(stateData?.currentPage ?: 0)

    internal val isPrevDisabled: Boolean
        get() = currentPosition == 0

    internal val isNextDisabled: Boolean
        get() = currentPosition == pageCount - 1

    internal fun prevPage() {
        currentPosition--
    }

    internal fun nextPage() {
        currentPosition++
    }

    fun goToPage(page: Int) {
        currentPosition = page
    }

    companion object {
        fun Saver(
            pageCount: Int
        ): Saver<PersianPaginationState, *> = Saver(
            save = { state ->
                PaginationStateData(
                    pageCount = state.pageCount,
                    currentPage = state.currentPosition,
                )
            },
            restore = { data ->
                PersianPaginationState(pageCount, data)
            }
        )
    }

    data class PaginationStateData(
        val pageCount: Int,
        val currentPage: Int
    ) : Serializable {

        override fun equals(other: Any?): Boolean {

            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as PaginationStateData

            if (pageCount == other.pageCount) return false
            if (currentPage == other.currentPage) return false

            return true
        }

        override fun hashCode(): Int {
            var result = pageCount.hashCode()
            result = 31 * result + currentPage.hashCode()
            return result
        }
    }
}

@Composable
fun rememberPaginationState(
    pageCount: Int
): PersianPaginationState = rememberSaveable(
    inputs = arrayOf(pageCount),
    saver = PersianPaginationState.Saver(pageCount),
    init = { PersianPaginationState(pageCount) }
)
