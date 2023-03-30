package com.example.domain.datasource

import com.example.domain.dto.TodoData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ITodoDataSource {
    @GET("todos/{id}")
    fun getTodoData(@Path("id") id: Int): Call<TodoData>
}