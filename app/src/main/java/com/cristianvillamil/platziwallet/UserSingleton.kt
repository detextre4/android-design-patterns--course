package com.cristianvillamil.platziwallet

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class UserSingleton {
    var username = "detextre4"

    companion object {
        private var instance : UserSingleton? = null

        fun getInstance() : UserSingleton {
            if (instance == null) instance = UserSingleton()
            return instance as UserSingleton
        }
    }
}
