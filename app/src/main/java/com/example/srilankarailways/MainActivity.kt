
package com.example.srilankarailways

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    data class Destination(val title: String, val description: String, val imageResId: Int)

    private lateinit var fromSpinner : Spinner
    private lateinit var toSpinner : Spinner
    private lateinit var recyclerView: RecyclerView

    private val names = arrayOf("Colombo", "Kandy", "Jaffna", "Gampaha")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        fromSpinner = findViewById(R.id.fromSpinner)
        toSpinner = findViewById(R.id.toSpinner)

        // Create an ArrayAdapter using the string array and a default spinner layout
        val fromAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, names)
        val toAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, names)

        // Specify the layout to use when the list of choices appears
        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        fromSpinner.adapter = fromAdapter
        toSpinner.adapter = toAdapter

//        recyclerView = findViewById(R.id.mainRecycleView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        val destinations = listOf(
//            Destination("Title 1", "Description 1", R.drawable.logo),
//            Destination("Title 2", "Description 2", R.drawable.logo),
//            Destination("Title 3", "Description 3", R.drawable.logo)
//            // Add more items as needed
//        )
//
//        val adapter = DestinationAdapter(destinations)
//        recyclerView.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val signInButton: Button = findViewById(R.id.signInButton)
//
//        signInButton.setOnClickListener {
//            // Start the LoginActivity
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }


    }
}