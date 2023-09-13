package com.dicoding.yokiuserfinders.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.yokiuserfinders.api.RetrofitClient
import com.dicoding.yokiuserfinders.data.model.User
import com.dicoding.yokiuserfinders.data.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Query

class UserViewModel : ViewModel() {
    val listUsers = MutableLiveData<ArrayList<User>>()

    //    Fungsi Setter
    fun setSearchUsers(query: String) {
        RetrofitClient.apiInstance
            .getSearchUsers(query)
            .enqueue(object : Callback<UserResponse> {
                override fun onResponse(
                    call: Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    if (response.isSuccessful) {
                        listUsers.postValue(response.body()?.items)
                    }
                }

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    t.message?.let { Log.d("Failure", it) }
                }

            })
    }

    //    Fungsi Getter
    fun getSearchUsers(): LiveData<ArrayList<User>> {
        return listUsers
    }
}