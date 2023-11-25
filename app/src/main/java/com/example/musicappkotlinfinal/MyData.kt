package com.example.musicappkotlinfinal

data class MyData(
    val `data`: List<Data>,
    val next: String,
    val total: Int,
    val title: String,
    val cover: String,
    val album: Album,
    val preview:String
)