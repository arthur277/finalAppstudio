package com.example.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.repository.UserRepository
import com.example.models.User
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserRepository) : ViewModel() {
    val allUsers: LiveData<List<User>> = repository.allUsers
    fun insert(user: User) {
        viewModelScope.launch {
        repository.insert(user)
        }    }
    fun delete(user: User) {
        viewModelScope.launch {
            repository.delete(user)
        }
    }}