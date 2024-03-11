package com.example.srilankarailways

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DestinationAdapter(private val destinations: List<MainActivity.Destination>) : RecyclerView.Adapter<DestinationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.destination_viewholder, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val destination = destinations[position]
        holder.titleTextView.text = destination.title
        holder.descriptionTextView.text = destination.description
        holder.imageView.setImageResource(destination.imageResId)
    }

    override fun getItemCount(): Int {
        return destinations.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.destinationTitle)
        val descriptionTextView: TextView = itemView.findViewById(R.id.destinationDescription)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
}