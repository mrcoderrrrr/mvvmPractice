package com.example.mvvmpattern.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvmpattern.R
import com.example.mvvmpattern.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var dataBinding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
    }
}