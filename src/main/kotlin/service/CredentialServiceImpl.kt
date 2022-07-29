package service

import database.UserDataBaseImpl
import database.UserDatabase
import model.UserData

class CredentialServiceImpl: CredentialService {

    private val database : UserDatabase = UserDataBaseImpl()
    private var  loggedInUser: UserData? = null


    override fun doLogin(username: String, password: String): UserData? {
       //ambil username dan password yang sesuai
        if (username.isEmpty() && password.isEmpty())  {
            println("Username dan Password harus di isi")
            return null
            }

        val userData: UserData? = database.findUser(username)
        if (userData == null){
            println("User tidak ditemukan")
            return null
        }
        if (!userData.password.equals(password, true)){
            println("password tidak sama")
            return null
        }
        println("Berhasil login")
        return userData

    }

    override fun getLoggedInUser(): UserData? = loggedInUser


    override fun doRegister() {
        TODO("Not yet implemented")
    }

}