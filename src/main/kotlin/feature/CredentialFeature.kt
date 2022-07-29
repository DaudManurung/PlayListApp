package feature

import model.UserData
import service.CredentialService
import service.CredentialServiceImpl
import java.util.Scanner

class CredentialFeature(private val scanner: Scanner) {

    private val credentialService: CredentialService = CredentialServiceImpl()

    fun login(){
        print("Username: ")
        val inputUsername = scanner.nextLine()
        print("Password: ")
        val inputPassword = scanner.nextLine()

        val loggedInUser:UserData? = credentialService.doLogin(inputUsername, inputPassword)
        loggedInUser?.let {
        println("Username: ${it.username}")
            println("Nama: ${it.name}")
            println("Addres: ${it.address}")

        }
    }

    fun getProfile(){
        credentialService.getLoggedInUser()?.let {
            printUserData(it)
        } ?: println("anda belum login")
    }

    private fun printUserData(userData: UserData){
        println("Username: ${userData.username}")
        println("Nama: ${userData.name}")
        println("Addres: ${userData.address}")
    }
}