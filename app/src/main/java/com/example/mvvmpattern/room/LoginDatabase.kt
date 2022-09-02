package com.example.mvvmpattern.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmpattern.model.LoginModel

@Database(entities = [LoginModel::class], version = 1, exportSchema = false)
abstract class LoginDatabase : RoomDatabase() {
    abstract fun loginDao(): LoginDao

    companion object {
        private var INSTANCE: LoginDatabase? = null
        fun getInstance(context: Context): LoginDatabase? {
            if (INSTANCE == null) {
                synchronized(LoginDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        LoginDatabase::class.java, "loginInfo.db"
                    ).allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }

}