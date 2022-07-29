import enums.SpotifyMenu
import feature.CredentialFeature
import java.util.Scanner

private val scanner = Scanner(System.`in`)

private lateinit var  credentialFeature: CredentialFeature


fun main() {
    setup()
    welcome()

}

fun welcome(){
    println("Selamat datang di Aplikasi PlayList")
    println("1. Login")
    println("2. Profile")
    print("Pilih menu: ")

    val selectedMenu = scanner.nextLine()

    when (selectedMenu) {
        SpotifyMenu.LOGIN.id -> {
            credentialFeature.login()
        }
        SpotifyMenu.PROFILE.id -> {
            credentialFeature.getProfile()
        }
        else -> println("Input tidak dapat di proses")
    }
    welcome()
}

fun setup(){
    credentialFeature = CredentialFeature(scanner)
}