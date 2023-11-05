package com.example.googleplaystore.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.R
import com.google.android.material.imageview.ShapeableImageView

class AppAdapter(private val appList: ArrayList<AppData>): RecyclerView.Adapter<AppAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val appLogo = view.findViewById<ShapeableImageView>(R.id.appLogo)
        val appName = view.findViewById<TextView>(R.id.appName)
        val appRating = view.findViewById<TextView>(R.id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_app, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.appLogo.setImageResource(appList[position].resourceID)
        holder.appName.text = appList[position].appName
        holder.appRating.text = appList[position].appRating
    }

    override fun getItemCount() = appList.size
}