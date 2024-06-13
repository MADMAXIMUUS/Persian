package io.github.madmaximuus.persian.cropPhoto

import android.graphics.Bitmap
import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.fab.PersianFabDefaults
import io.github.madmaximuus.persian.fab.PersianMediumFab
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.scafold.Scaffold
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import kotlin.math.abs
import kotlin.math.roundToInt

@Composable
private fun CropPhoto(
    image: Bitmap,
    imageWidth: Int,
    imageHeight: Int,
    onDoneClicked: (Bitmap?) -> Unit
) {
    val configuration = LocalConfiguration.current
    val screenWidth =
        with(LocalDensity.current) { configuration.screenWidthDp.dp.roundToPx() - 30f }
    val background = PersianTheme.colorScheme.surface
    val onBackground = PersianTheme.colorScheme.surface
    var outBitmap: Bitmap? = null
    val preScale = if (imageWidth < imageHeight) screenWidth / imageWidth
    else screenWidth / imageHeight

    val newImageWidth = (imageWidth * preScale).roundToInt()
    val newImageHeight = (imageHeight * preScale).roundToInt()

    val scaledBitmap = Bitmap
        .createScaledBitmap(
            image,
            newImageWidth,
            newImageHeight,
            true
        )

    var zoom by remember { mutableFloatStateOf(1f) }
    var offset by remember { mutableStateOf(Offset.Zero) }

    Scaffold(
        floatingActionButton = {
            PersianMediumFab(
                icon = rememberVectorPainter(image = PersianSymbols.Default.Check),
                colors = PersianFabDefaults.primaryColors(),
                onClick = {
                    val x =
                        (((newImageWidth * zoom / 2f - screenWidth / 2f) - offset.x) / zoom)
                            .roundToInt()
                    val y =
                        (((newImageHeight * zoom / 2f - screenWidth / 2f) - offset.y) / zoom)
                            .roundToInt()

                    val sizeX = (screenWidth / zoom).roundToInt()
                    val sizeY = (screenWidth / zoom).roundToInt()

                    try {
                        outBitmap = Bitmap.createBitmap(scaledBitmap, x, y, sizeX, sizeY)
                        outBitmap = Bitmap.createScaledBitmap(
                            outBitmap!!,
                            (sizeX * zoom).toInt(),
                            (sizeY * zoom).toInt(),
                            true
                        )
                    } catch (e: IllegalArgumentException) {
                        e.localizedMessage?.let { Log.e("Cropped Error", it) }
                    }
                    onDoneClicked(outBitmap)
                }
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .drawWithContent {
                    drawContent()
                    val circlePath = Path().apply {
                        addOval(Rect(center, screenWidth / 2f))
                    }
                    clipPath(circlePath, clipOp = ClipOp.Difference) {
                        drawRect(
                            color = background.copy(alpha = 0.8f),
                        )
                    }
                    drawCircle(
                        color = onBackground,
                        center = center,
                        radius = screenWidth / 2f,
                        style = Stroke(width = 5f)
                    )
                }
                .clipToBounds()
                .padding(it),
            contentAlignment = Alignment.Center
        ) {
            Canvas(
                modifier = Modifier
                    .pointerInput(Unit) {
                        detectTransformGestures(
                            onGesture = { _, gesturePan, gestureZoom, _ ->
                                val newScale = (zoom * gestureZoom).coerceAtLeast(1f)
                                val newOffset = offset + gesturePan
                                zoom = newScale

                                val maxX =
                                    abs((screenWidth - newImageWidth * zoom) / 2f)
                                val maxY =
                                    abs((screenWidth - newImageHeight * zoom) / 2f)

                                offset = Offset(
                                    newOffset.x.coerceIn(-maxX, maxX),
                                    newOffset.y.coerceIn(-maxY, maxY)
                                )
                            }
                        )
                    }
                    .fillMaxSize()
            ) {
                val canvasWidth = size.width
                val canvasHeight = size.height
                translate(left = offset.x, top = offset.y) {
                    scale(scaleX = zoom, scaleY = zoom) {
                        drawImage(
                            image = scaledBitmap.asImageBitmap(),
                            topLeft = Offset(
                                x = (canvasWidth - newImageWidth) / 2f,
                                y = (canvasHeight - newImageHeight) / 2f
                            )
                        )
                    }
                }
            }
        }
    }
}