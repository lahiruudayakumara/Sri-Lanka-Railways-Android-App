
package com.example.srilankarailways

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.srilankarailways.R.id.complainConstrain

class MainActivity : AppCompatActivity() {

    data class Destination(val title: String, val description: String, val imageResId: Int)

    private lateinit var fromSpinner : Spinner
    private lateinit var toSpinner : Spinner
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewMoreBtn2 : Button
    private lateinit var searchTrain : Button
    private lateinit var complainIcon : ImageView
    private lateinit var notifyIcon : ImageView
    private lateinit var announcementIcon : ImageView

    private val names = arrayOf("Colombo", "Kandy", "Jaffna", "Gampaha")
    private val names2 = arrayOf("Kandy", "Colombo", "Jaffna", "Gampaha")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        fromSpinner = findViewById(R.id.fromSpinner)
        toSpinner = findViewById(R.id.toSpinner)

        viewMoreBtn2 = findViewById(R.id.viewMoreBtn2)
        searchTrain = findViewById(R.id.searchTrainBtn)
        complainIcon = findViewById(R.id.complaion_icon)

        announcementIcon = findViewById(R.id.imageButton)
        notifyIcon = findViewById(R.id.imageButton5)

        // Create an ArrayAdapter using the string array and a default spinner layout
        val fromAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, names)
        val toAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, names2)

        // Specify the layout to use when the list of choices appears
        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        fromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        fromSpinner.adapter = fromAdapter
        toSpinner.adapter = toAdapter

        viewMoreBtn2.setOnClickListener {
            val intent = Intent(this, DestinationViewActivity::class.java)
            startActivity(intent)
        }

        searchTrain.setOnClickListener {
            val intent = Intent(this, SearchResultActivity::class.java)
            startActivity(intent)
        }

        complainIcon.setOnClickListener {
            val intent = Intent(this, ComplainActivity::class.java)
            startActivity(intent)
        }

        announcementIcon.setOnClickListener {
            val intent = Intent(this, AnnouncementActivity::class.java)
            startActivity(intent)
        }

        notifyIcon.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }


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