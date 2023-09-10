package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.forms.PersianForm

object Forms : Screen {

    override val name: String = "Forms"

    override val navigation: String = "form"

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
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Subhead Optional + Input", firstItem = true) {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead")
                            },
                            content = {
                                Input(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead Required + Input") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                Input(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }

                item {
                    SampleRow(text = "Subhead Required + Input Error") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                Input(
                                    value = "Some Input",
                                    isError = true,
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead Required + Input Success") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                Input(
                                    value = "Some Input",
                                    isSuccess = true,
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead Required + Input Disabled") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                Input(
                                    value = "Some Input",
                                    enabled = false,
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                /*item {
                    SampleRow(text = "Caption + Input Error") {
                        PersianForm.Primary(
                            content = {
                                Input(
                                    value = "Some Input",
                                    isError = true,
                                    onValueChange = {}
                                )
                            },
                            caption = "Caption"
                        )
                    }
                }
                item {
                    SampleRow(text = "Caption Disabled + Input Disabled") {
                        PersianForm.Primary(
                            enabled = false,
                            content = {
                                Input(
                                    value = "Some Input",
                                    enabled = false,
                                    onValueChange = {}
                                )
                            },
                            caption = "Caption"
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead + Caption + Input") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead")
                            },
                            content = {
                                Input(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            },
                            caption = "Caption"
                        )
                    }
                }*/
                item {
                    SampleRow(text = "Subhead Optional + TexArea") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead")
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead Required + TextArea") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                /*item {
                    SampleRow(text = "Subhead Required With Counter + TextArea") {
                        PersianForm.Primary(
                            subhead = {
                                WithCounter(
                                    text = "Subhead",
                                    required = true,
                                    counter = 10,
                                    counterMax = 20
                                )
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }*/
                item {
                    SampleRow(text = "Subhead Required + TextArea Error") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    isError = true,
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead Required + TextArea Success") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    isSuccess = true,
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead Required + TextArea Disabled") {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead", required = true)
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    enabled = false,
                                    onValueChange = {}
                                )
                            }
                        )
                    }
                }
                /*item {
                    SampleRow(text = "Caption + TextArea Error") {
                        PersianForm.Primary(
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    isError = true,
                                    onValueChange = {}
                                )
                            },
                            caption = "Caption"
                        )
                    }
                }
                item {
                    SampleRow(text = "Caption Disabled + TextArea Disabled") {
                        PersianForm.Primary(
                            enabled = false,
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    enabled = false,
                                    onValueChange = {}
                                )
                            },
                            caption = "Caption"
                        )
                    }
                }
                item {
                    SampleRow(text = "Subhead + Caption + TextArea", lastItem = true) {
                        PersianForm.Primary(
                            subhead = {
                                Default(text = "Subhead")
                            },
                            content = {
                                TextArea(
                                    value = "Some Input",
                                    onValueChange = {}
                                )
                            },
                            caption = "Caption"
                        )
                    }
                }*/
            }
        }
    }
}