package com.example.p2glet_lens

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.p2glet_lens.databinding.ActivityMainBinding
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors.newSingleThreadExecutor


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    var lensFacing = CameraSelector.LENS_FACING_FRONT

    var camera : Camera? = null
    var cameraProvider : ProcessCameraProvider? = null
    lateinit var cameraExecutor : ExecutorService

    var preview : Preview? = null
    var imageCapture : ImageCapture? = null
    var imageAnalysis : ImageAnalysis? = null

    var wudth = 320
    var height = 240

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        cameraExecutor = Executor.newSingleThreadExecutor()
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 0)
    }
}