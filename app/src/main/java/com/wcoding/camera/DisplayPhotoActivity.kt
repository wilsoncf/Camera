package com.wcoding.camera

// DisplayPhotoActivity.kt
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class DisplayPhotoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_photo)

        val backButton = findViewById<Button>(R.id.back_Button)
        val photoImageView = findViewById<ImageView>(R.id.photo_ImageView)

        val photoUriString = intent.getStringExtra(EXTRA_PHOTO_URI)
        val photoUri = Uri.parse(photoUriString)

        // Mostra a imagem capturada
        photoImageView.setImageURI(photoUri)

        // Destroi a activity
        backButton.setOnClickListener { finish() }
    }

    companion object {
        const val EXTRA_PHOTO_URI = "extra_photo_uri"
    }
}
