package ru.rabbit.persian.appShowcase.util

import android.content.Context
import android.icu.text.SimpleDateFormat
import java.io.File
import java.io.IOException
import java.util.Date
import java.util.Locale

fun createImageFile(context: Context): File? {
    val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
    val imageFileName = "JPEG_" + timeStamp + "_"
    var mFileTemp: File? = null
    val root: String = context.getDir("my_sub_dir", Context.MODE_PRIVATE).absolutePath
    val myDir = File("$root/Img")
    if (!myDir.exists()) {
        myDir.mkdirs()
    }
    try {
        mFileTemp = File.createTempFile(imageFileName, ".jpg", myDir.absoluteFile)
    } catch (e1: IOException) {
        e1.printStackTrace()
    }
    return mFileTemp
}