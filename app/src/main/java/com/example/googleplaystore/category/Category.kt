package com.example.googleplaystore.category

import com.example.googleplaystore.app.AppData

data class Category (
    val categoryName: String,
    val apps: ArrayList<AppData>
)