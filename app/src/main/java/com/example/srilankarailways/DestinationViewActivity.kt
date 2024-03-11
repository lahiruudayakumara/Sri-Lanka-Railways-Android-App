package com.example.srilankarailways

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DestinationViewActivity : AppCompatActivity() {

    private lateinit var backBtn : ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_destination_view)

        // Find your VideoView by its ID
        val videoView = findViewById<VideoView>(R.id.videoView)

        // Prepare the URL for the video
        val videoUrl = "https://www.youtube.com/watch?v=hxITmHjOD-w"

        // Convert the String URL into a URI object
        val uri = Uri.parse(videoUrl)

        // Set the URI as the video source for the VideoView
        videoView.setVideoURI(uri)

        // Start playing the video
        videoView.start()

        backBtn = findViewById(R.id.backBtn)

        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}