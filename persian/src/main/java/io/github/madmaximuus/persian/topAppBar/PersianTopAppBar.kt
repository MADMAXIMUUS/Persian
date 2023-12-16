package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersianTopAppBar(
    modifier: Modifier = Modifier,
    topAppBarColors: TopAppBarColors = PersianTopAppBarDefaults.colors(),
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
    left: PersianTopAppBarLeft? = null,
    middle: PersianTopAppBarMiddle,
    right: PersianTopAppBarRight? = null,
    scrollBehavior: TopAppBarScrollBehavior? = null,
    actionItemsCount: Int
) {
    CompositionLocalProvider(LocalPersianTopAppBarColors provides topAppBarColors) {
        val colors = LocalPersianTopAppBarColors.current
        if (actionItemsCount < 2) {
            CenterAlignedTopAppBar(
                modifier = modifier,
                title = {
                    when (middle) {
                        is PersianTopAppBarMiddle.Icon -> {
                            PersianTopAppBarMiddleIcon(icon = middle.icon)
                        }

                        is PersianTopAppBarMiddle.Title -> {
                            PersianTopAppBarMiddleTitle(
                                text = middle.text
                            )
                        }
                    }
                },
                navigationIcon = {
                    when (left) {
                        is PersianTopAppBarLeft.Close -> {
                            PersianTopAppBarLeftClose(
                                onClick = left.onClick
                            )
                        }

                        is PersianTopAppBarLeft.Navigation -> {
                            PersianTopAppBarLeftNavigation(
                                onClick = left.onClick
                            )
                        }

                        is PersianTopAppBarLeft.Avatar -> {
                            PersianTopAppBarLeftAvatar(
                                image = left.avatarUrl,
                                onClick = left.onClick
                            )
                        }

                        null -> {}
                    }
                },
                actions = {
                    when (right) {
                        is PersianTopAppBarRight.Icons -> {
                            PersianTopAppBarRightIcons(actions = right.actionItem)
                        }

                        is PersianTopAppBarRight.Action -> {
                            PersianTopAppBarRightButton(
                                text = right.text,
                                onClick = right.onClick
                            )
                        }

                        null -> {}
                    }
                },
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = colors.background,
                    scrolledContainerColor = colors.scrolledBackgroundColor
                ),
                windowInsets = windowInsets
            )
        } else {
            TopAppBar(
                modifier = modifier,
                title = {
                    when (middle) {
                        is PersianTopAppBarMiddle.Icon -> {
                            PersianTopAppBarMiddleIcon(icon = middle.icon)
                        }

                        is PersianTopAppBarMiddle.Title -> {
                            PersianTopAppBarMiddleTitle(
                                text = middle.text
                            )
                        }
                    }
                },
                navigationIcon = {
                    when (left) {
                        is PersianTopAppBarLeft.Close -> {
                            PersianTopAppBarLeftClose(
                                onClick = left.onClick
                            )
                        }

                        is PersianTopAppBarLeft.Navigation -> {
                            PersianTopAppBarLeftNavigation(
                                onClick = left.onClick
                            )
                        }

                        is PersianTopAppBarLeft.Avatar -> {
                            PersianTopAppBarLeftAvatar(
                                image = left.avatarUrl,
                                onClick = left.onClick
                            )
                        }

                        null -> {}
                    }
                },
                actions = {
                    when (right) {
                        is PersianTopAppBarRight.Icons -> {
                            PersianTopAppBarRightIcons(actions = right.actionItem)
                        }

                        is PersianTopAppBarRight.Action -> {
                            PersianTopAppBarRightButton(
                                text = right.text,
                                onClick = right.onClick
                            )
                        }

                        null -> {}
                    }
                },
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = colors.background,
                    scrolledContainerColor = colors.scrolledBackgroundColor
                ),
                windowInsets = windowInsets
            )

        }
    }
}