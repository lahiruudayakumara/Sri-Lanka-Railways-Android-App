package com.example.srilankarailways

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    private lateinit var signUpName : EditText
    private lateinit var signUpEmail : EditText
    private lateinit var signUpPassword : EditText
    private lateinit var signUpButton : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        signUpName = findViewById(R.id.signUpName)
        signUpEmail = findViewById(R.id.signUpEmail)
        signUpPassword = findViewById(R.id.signUpPassword)
        signUpButton = findViewById(R.id.signUpBtn)

        signUpButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}