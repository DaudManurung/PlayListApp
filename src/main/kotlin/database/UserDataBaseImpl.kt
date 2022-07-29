package database

import model.UserData

class UserDataBaseImpl : UserDatabase {

    private val userList = mutableListOf(
        UserData(1, "Daud Manurung", "Daud", "daudmanru", "Uluan"),
        UserData(2, "Bebas", "bebas", "bebas", "Bebas")

    )

    override fun findAllUser(): List<UserData> {
        return userList
    }

    override fun findUser(usename: String): UserData? = userList.find {
        it.username.equals(usename, true)
    }

    override fun addUser(data: UserData) {
        userList.add(data)
    }


}