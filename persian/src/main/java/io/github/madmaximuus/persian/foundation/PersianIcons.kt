package io.github.madmaximuus.persian.foundation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import io.github.madmaximuus.persian.R

@Suppress("UNUSED")
@Immutable
object PersianIcons {

    val expendLess: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_expand_less)

    val expendMore: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_expand_more)

    val search: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_search)

    val add: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_add)

    val person: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_person)

    val image: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_photo)

    val close: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_close)

    val chevronLeft: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_chevron_left)

    val chevronRight: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_chevron_right)

    val done: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_done)

    val checkCircle: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_check_circle)

    val errorCircle: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_error_circle_rounded)

    val arrowBack: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_arrow_back)

    val moreVert: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_more_vert)
}

val LocalPersianIcons = staticCompositionLocalOf { PersianIcons }

val MaterialTheme.icons: PersianIcons
    @Composable
    @ReadOnlyComposable
    get() = LocalPersianIcons.current