package io.github.madmaximuus.persian.foundation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import ru.rabbit.persian.R

@Suppress("UNUSED")
@Immutable
object PersianIcons {

    val appLogo: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_app_logo)

    val google: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_google)

    val arrowBack: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_arrow_back)

    val visibility: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_visibility)

    val visibilityOff: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_visibility_off)

    val error: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_error)

    val checkCircle: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_check_circle)

    val cameraEnhance: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_camera_enhance)

    val wifiOff: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_wifi_off)

    val close: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_close)

    val homeOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_home_outlined)

    val homeFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_home_filled)

    val searchOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_search_outlined)

    val searchFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_search_filled)

    val mailOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_mail_outlined)

    val mailFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_mail_filled)

    val personOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_person_outlined)

    val personFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_person_filled)

    val add: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_add)

    val alternateEmail: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_alternate_email)

    val favoriteOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_favorite_outlined)

    val favoriteFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_favorite_filled)

    val share: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_share)

    val cached: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_cached)

    val moreVert: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_more_vert)

    val listAlt: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_list_alt)

    val comment: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_comment)

    val modeCommentOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_mode_comment_outlined)

    val modeCommentFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_mode_comment_filled)

    val chartData: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_chart_data)

    val pushPinFilled: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_push_pin_filled)

    val pushPinOutlined: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_push_pin_outlined)

    val edit: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_edit)

    val expandCircleDown: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_expand_circle_down)

    val expandCircleUp: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_expand_circle_up)

    val settings: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_settings)

    val notifications: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_notifications)

    val help: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_help)

    val bookmark: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_bookmark)

    val globeUk: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_globe_uk)

    val image: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_image)

    val gifBox: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_gif_box)

    val ballot: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_ballot)

    val locationOn: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_location_on)

    val photoCamera: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_photo_camera)

    val chevronRight: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_chevron_right)

    val chevronLeft: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_chevron_left)

    val barChart: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_bar_chart)

    val block: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_block)

    val personRemove: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_person_remove)

    val bookmarkAdd: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_bookmark_add)

    val volumeOff: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_volume_off)

    val groupAdd: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_group_add)

    val flag: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_flag)

    val bookmarkRemove: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_bookmark_remove)

    val premium: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_premium)

    val group: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_group)

    val delete: Painter
        @Composable
        get() = painterResource(id = R.drawable.ic_delete)

    val sentimentDissatisfied
        @Composable
        get() = painterResource(id = R.drawable.ic_sentiment_dissatisfied)
}

val LocalPersianIcons = staticCompositionLocalOf { PersianIcons }

val MaterialTheme.icons: PersianIcons
    @Composable
    @ReadOnlyComposable
    get() = LocalPersianIcons.current