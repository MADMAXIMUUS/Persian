package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import io.github.madmaximuus.persian.banners.PersianBanner
import io.github.madmaximuus.persian.banners.PersianBannerLeft
import io.github.madmaximuus.persian.banners.PersianBannerRight
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.forms.PersianForm
import io.github.madmaximuus.persian.forms.PersianFormContent
import io.github.madmaximuus.persian.forms.PersianFormSubheadConfig
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.inputs.PersianInput
import io.github.madmaximuus.persian.select.SelectActionItem
import io.github.madmaximuus.persian.textAreas.PersianTextArea
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Banner : Screen {

    override val name: String = "Banner"

    override val navigation: String = "banner"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            val (titleValue, onTitleValueChange) = remember { mutableStateOf("Some Title") }
            val (descriptionValue, onDescriptionValueChange) = remember { mutableStateOf("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet imperdiet consectetur. Nam vitae massa a metus dignissim malesuada. Duis.") }
            var title by remember { mutableStateOf(true) }
            var description by remember { mutableStateOf(true) }

            val leftImage = PersianBannerLeft.Image("https://loremflickr.com/320/240")
            val leftAvatar = PersianBannerLeft.Avatar("https://loremflickr.com/320/240")
            val leftIcon = PersianBannerLeft.Icon(painterResource(id = R.drawable.ic_person_filled))
            var left by remember { mutableStateOf<PersianBannerLeft?>(null) }
            val leftOptions = listOf(
                SelectActionItem.WithoutIcon("None"),
                SelectActionItem.WithoutIcon("Image"),
                SelectActionItem.WithoutIcon("Icon"),
                SelectActionItem.WithoutIcon("Avatar")
            )
            var selectedLeft by remember { mutableStateOf("None") }

            val rightOpen = PersianBannerRight.Open(onClick = {})
            val rightClose = PersianBannerRight.Close(onClick = {})
            var right by remember { mutableStateOf<PersianBannerRight?>(null) }
            val rightOptions = listOf(
                SelectActionItem.WithoutIcon("None"),
                SelectActionItem.WithoutIcon("Close"),
                SelectActionItem.WithoutIcon("Open")
            )
            var selectedRight by remember { mutableStateOf("None") }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                SampleRow(
                    text = "Sample Banner",
                    firstItem = true
                ) {
                    PersianBanner(
                        title = if (title) titleValue else null,
                        description = if (description) descriptionValue else null,
                        left = left,
                        right = right
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(
                            horizontal = MaterialTheme.spacing.large,
                            vertical = MaterialTheme.spacing.large
                        )
                ) {
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Title",
                        checked = title,
                        onCheckedChange = { isChecked ->
                            title = isChecked
                            if (!description && !isChecked) description = true
                        }
                    )
                    if (title) {
                        PersianInput(
                            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                            value = titleValue,
                            onValueChange = onTitleValueChange
                        )
                        Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                    }
                    PersianCheckbox(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Description",
                        checked = description,
                        onCheckedChange = { isChecked ->
                            description = isChecked
                            if (!title && !isChecked) title = true
                        }
                    )
                    if (description) {
                        PersianTextArea(
                            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                            value = descriptionValue,
                            onValueChange = onDescriptionValueChange
                        )
                        Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                    }
                    /*PersianForm(
                        subhead = PersianFormSubheadConfig(
                            text = "Description",
                            textStyle = MaterialTheme.typography.titleMedium
                        ),
                        content = PersianFormContent.TextArea(
                            value = descriptionValue,
                            onValueChange = onDescriptionValueChange
                        )
                    )*/
                    PersianForm(
                        subhead = PersianFormSubheadConfig(
                            text = "Left",
                            textStyle = MaterialTheme.typography.titleMedium
                        ),
                        content = PersianFormContent.Select(
                            selected = selectedLeft,
                            values = leftOptions,
                            onSelectedChange = { option, index ->
                                selectedLeft = option
                                when (index) {
                                    0 -> left = null
                                    1 -> left = leftImage
                                    2 -> left = leftIcon
                                    3 -> left = leftAvatar
                                }
                            }
                        )
                    )
                    PersianForm(
                        subhead = PersianFormSubheadConfig(
                            text = "Right",
                            textStyle = MaterialTheme.typography.titleMedium
                        ),
                        content = PersianFormContent.Select(
                            selected = selectedRight,
                            values = rightOptions,
                            onSelectedChange = { option, index ->
                                selectedRight = option
                                when (index) {
                                    0 -> right = null
                                    1 -> right = rightClose
                                    2 -> right = rightOpen
                                }
                            }
                        )
                    )
                }
            }
        }
    }
}