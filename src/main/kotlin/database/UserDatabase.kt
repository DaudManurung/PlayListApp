package database

import model.UserData

interface UserDatabase {
    fun findAllUser(): List<UserData>

    fun findUser(usename: String):UserData?

    fun addUser(data: UserData)
}