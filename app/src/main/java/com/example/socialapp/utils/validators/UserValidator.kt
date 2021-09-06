package com.example.socialapp.utils.validators

import com.example.socialapp.model.User

object UserValidator {

    private val userList = listOf<String>("test@test.com", "test1@test.com")

    fun validateUser(user: User): Boolean{
        if (user.email.isEmpty() && user.password.isEmpty()){
            return false
        }

        if (user.email in userList){
            return false
        }

        if (user.password.count { it.isDigit() } < 2){
            return false
        }

        return true
    }

}