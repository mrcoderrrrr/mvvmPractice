package com.example.mvvmpattern.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvmpattern.model.LoginModel

@Dao
interface LoginDao {

    @Insert
    fun userInsert(loginModel: LoginModel)

    @Query("SELECT * FROM loginTable")
    fun userInfo():LiveData<List<LoginModel>>

    @Delete
    fun userDelete(loginModel: LoginModel)

    @Update
    fun userUpdate(loginModel: LoginModel)

}