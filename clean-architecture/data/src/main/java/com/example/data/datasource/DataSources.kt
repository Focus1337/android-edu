package com.example.data.datasource

import com.example.core.RetrofitClient
import com.example.domain.datasource.ITodoDataSource


class DataSources {
    companion object {
        val userService: ITodoDataSource =
            RetrofitClient.retrofitClient.create(ITodoDataSource::class.java)
    }
}