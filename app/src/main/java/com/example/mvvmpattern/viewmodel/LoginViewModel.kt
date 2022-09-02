package com.example.mvvmpattern.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpattern.model.LoginModel
import com.example.mvvmpattern.repository.LoginRepository
import com.example.mvvmpattern.room.LoginDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoginViewModel(application: Application):AndroidViewModel(application){
        val allUserInfo:LiveData<List<LoginModel>>
        val loginRepository:LoginRepository

        init {
            val dao= LoginDatabase.getInstance(application)!!.loginDao()
            loginRepository= LoginRepository(dao)
            allUserInfo=loginRepository.allUserInfo
        }

    fun userInsert(loginModel: LoginModel) = GlobalScope.launch(Dispatchers.IO) {
        loginRepository.userInsert(loginModel)
    }

    fun userDelete(loginModel: LoginModel) = GlobalScope.launch(Dispatchers.IO) {
        loginRepository.userDelete(loginModel)
    }

    fun userUpdate(loginModel: LoginModel) = GlobalScope.launch(Dispatchers.IO) {
        loginRepository.userUpdate(loginModel)
    }
}