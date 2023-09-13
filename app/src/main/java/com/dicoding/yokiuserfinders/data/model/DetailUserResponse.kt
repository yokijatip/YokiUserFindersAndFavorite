package com.dicoding.yokiuserfinders.data.model

data class DetailUserResponse(
    val name : String,
    val login : String,
    val id : Int,
    val location: String,
    val avatar_url: String,
    val followers_url : String,
    val following_url : String,
    val followers : Int,
    val following : Int
)
