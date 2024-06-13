package ru.rabbit.persian.appShowcase.screens

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.foundation.dashedBorder
import io.github.madmaximuus.persianSymbols.camera.plus.CameraPlus
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.appShowcase.util.createImageFile
import java.io.File
import java.io.FileOutputStream


object CropPhoto : Screen {
    override val name: String = "Crop Photo"

    override val navigation: String = "cropPhoto"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {

        var imageUri by remember { mutableStateOf<Uri?>(null) }
        var photo by remember { mutableStateOf(Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565)) }
        var croppedPhoto by remember { mutableStateOf<Bitmap?>(null) }
        val context = LocalContext.current
        var showDialog by remember { mutableStateOf(false) }

        val cameraLauncher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.TakePicture(),
            onResult = { success ->
                if (success) {
                    imageUri?.let {
                        val bitmap = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                            ImageDecoder.decodeBitmap(
                                ImageDecoder.createSource(
                                    context.contentResolver, it
                                )
                            )
                        } else {
                            @Suppress("DEPRECATION")
                            MediaStore.Images.Media.getBitmap(context.contentResolver, it)
                        }
                        photo = bitmap
                    }
                }
            }
        )

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
        ) {
            Box(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
            ) {
                if (croppedPhoto == null) {
                    IconButton(
                        modifier = Modifier
                            .size(160.dp)
                            .dashedBorder(4.dp, MaterialTheme.colorScheme.primary, 20.dp),
                        onClick = {

                        }
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                modifier = Modifier.size(48.dp),
                                painter = rememberVectorPainter(image = PersianSymbols.Default.CameraPlus),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = "Upload",
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                } else {
                    val file: File? = createImageFile(context)
                    val uri = if (file != null) {
                        val fout: FileOutputStream
                        try {
                            fout = FileOutputStream(file)
                            croppedPhoto!!.compress(Bitmap.CompressFormat.PNG, 70, fout)
                            fout.flush()
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                        Uri.fromFile(file)
                    } else Uri.EMPTY
                    PersianAvatar(
                        imageUrl = uri,
                        sizes = PersianAvatarsDefaults.size96(),
                        onClick = { showDialog = true }
                    )
                }
            }
        }
    }
}