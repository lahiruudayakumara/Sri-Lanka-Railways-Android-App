package com.example.srilankarailways

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnboardingActivity : AppCompatActivity() {

    private lateinit var skip : TextView
    private lateinit var nextBtn : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)

        skip = findViewById(R.id.skip)
        nextBtn = findViewById(R.id.nextbtn)

        nextBtn.setOnClickListener {
            val intent = Intent(this, OnboardingActivity2::class.java)
            startActivity(intent)
        }

        skip.setOnClickListener {
            val intent = Intent(this, SignSelectActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}