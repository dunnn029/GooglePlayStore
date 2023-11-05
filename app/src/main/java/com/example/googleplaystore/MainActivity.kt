package com.example.googleplaystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.category.CategoryAdapter
import com.example.googleplaystore.category.FakeCategorySource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryList = FakeCategorySource().getCategory()
        val categoryAdapter = CategoryAdapter(this, categoryList)

        val recycleViewCategory: RecyclerView = findViewById(R.id.rcvCategory)
        val linearLayoutManager = LinearLayoutManager(this)
        recycleViewCategory.layoutManager = linearLayoutManager
        recycleViewCategory.adapter = categoryAdapter
    }
}