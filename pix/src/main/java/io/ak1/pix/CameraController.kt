package io.ak1.pix

interface CameraController {
    fun showGallery()
    fun hideGallery()
    fun clickPicture()
    fun switchFlashMode(): Int
}