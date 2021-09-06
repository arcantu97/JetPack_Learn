package com.example.socialapp.utils.validators

import com.example.socialapp.model.User
import org.junit.Assert.*
import org.junit.Test

class UserValidatorTest{
    @Test
    fun `empty user returns false`(){
        val user = User("", "")
        val result = UserValidator.validateUser(user)
        assertFalse(result)
    }

    @Test
    fun `existing user returns false`(){
        val user = User("test@test.com", "test123")
        val result = UserValidator.validateUser(user)
        assertFalse(result)
    }

    @Test
    fun `short password returns false`() {
        val user = User("test3@gmail.com", "te")
        val  result = UserValidator.validateUser(user)
        assertFalse(result)
    }
}