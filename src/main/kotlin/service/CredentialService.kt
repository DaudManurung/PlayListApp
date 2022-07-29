package service

import model.UserData

interface CredentialService {
    fun doLogin(username: String, password: String): UserData?

    fun getLoggedInUser(): UserData?


    fun doRegister()
}