package com.example.repository

import androidx.lifecycle.LiveData
import com.example.dao.UserDao
import com.example.models.User

class UserRepository(private val userDao: UserDao) {
    val allUsers: LiveData<List<User>> = userDao.getAllUsers()
    suspend fun insert(user: User) {
        userDao.insert(user)
    }
    suspend fun delete(user: User) {
        userDao.deleteUser(user)
    }
}
