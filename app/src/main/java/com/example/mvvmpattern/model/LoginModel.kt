package com.example.mvvmpattern.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "loginTable")
data class LoginModel(
    @PrimaryKey(autoGenerate = true)
    val userId:Int,
    val username:String,
    val password:String
)
