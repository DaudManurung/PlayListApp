package model

data class UserData(
    val id: Int,
    val name:String,
    val username: String,
    val password: String,
    val address: String? = null
)