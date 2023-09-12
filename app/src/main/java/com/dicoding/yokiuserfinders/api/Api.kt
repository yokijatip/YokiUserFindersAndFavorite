package com.dicoding.yokiuserfinders.api

import com.dicoding.yokiuserfinders.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query("q") query: String
    ):Call<UserResponse>

}