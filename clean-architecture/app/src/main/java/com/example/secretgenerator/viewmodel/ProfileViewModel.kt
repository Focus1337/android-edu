package com.example.secretgenerator.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.usecase.TodoUseCase
import com.example.domain.dto.TodoData
import kotlinx.coroutines.launch


class ProfileViewModel : ViewModel() {

    private val todoUseCase = TodoUseCase()
    val todoDataMutable = MutableLiveData<TodoData?>()

    fun getTodoData(id: Int) {
        viewModelScope.launch {
            todoDataMutable.postValue(todoUseCase.getTodo(id))
        }
    }
}