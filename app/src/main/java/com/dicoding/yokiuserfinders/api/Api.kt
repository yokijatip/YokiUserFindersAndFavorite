package com.dicoding.yokiuserfinders.api

import com.dicoding.yokiuserfinders.data.model.DetailUserResponse
import com.dicoding.yokiuserfinders.data.model.User
import com.dicoding.yokiuserfinders.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query("q") query: String
    ):Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ):Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ):Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ):Call<ArrayList<User>>


}