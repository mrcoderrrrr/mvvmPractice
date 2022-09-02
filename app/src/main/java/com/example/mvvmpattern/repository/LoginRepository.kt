package com.example.mvvmpattern.repository

import androidx.lifecycle.LiveData
import com.example.mvvmpattern.model.LoginModel
import com.example.mvvmpattern.room.LoginDao

class LoginRepository(val loginDao: LoginDao) {

    val allUserInfo: LiveData<List<LoginModel>> = loginDao.userInfo()

    suspend fun userInsert(loginModel: LoginModel) {
        loginDao.userInsert(loginModel)
    }

    suspend fun userDelete(loginModel: LoginModel) {
        loginDao.userDelete(loginModel)
    }

    suspend fun userUpdate(loginModel: LoginModel) {
        loginDao.userUpdate(loginModel)
    }

}