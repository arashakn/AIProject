package com.example.aiproject.models

data class HeadLines(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)