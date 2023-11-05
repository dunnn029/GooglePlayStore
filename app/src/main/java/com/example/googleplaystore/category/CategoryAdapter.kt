package com.example.googleplaystore.category

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.R
import com.example.googleplaystore.app.AppAdapter

class CategoryAdapter(private val context: Context, private val categoryList: ArrayList<Category>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val category = view.findViewById<TextView>(R.id.category)
        val rcvApp = view.findViewById<RecyclerView>(R.id.rcvApp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.category.text = categoryList[position].categoryName

        val linearLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        holder.rcvApp.layoutManager = linearLayoutManager

        val appList = categoryList[position].apps

        val appAdapter = AppAdapter(appList)
        holder.rcvApp.adapter = appAdapter
    }

    override fun getItemCount() = categoryList.size
}