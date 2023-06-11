package com.cristianvillamil.platziwallet.ui.home.data

import com.cristianvillamil.platziwallet.UserSingleton

class User private constructor(private val username : String, private val password : String) {
    class  Builder {
        var username : String = ""
        var password : String? = null

        fun setUsername(newUsername : String) : Builder {
            this.username = newUsername
            return this
        }

        fun setPassword(newPassword : String) : Builder {
            this.password = newPassword
            return this
        }

        fun build() : User {
            return User(username, password ?: "")
        }
    }
}