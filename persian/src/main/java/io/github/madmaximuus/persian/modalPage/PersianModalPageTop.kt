package io.github.madmaximuus.persian.modalPage

sealed class PersianModalPageTop {

    data object Handle : PersianModalPageTop()

    data class TopBar(
        val title: String,
        val actionTitle: String,
        val onActionClick: () -> Unit
    ) : PersianModalPageTop()

}
