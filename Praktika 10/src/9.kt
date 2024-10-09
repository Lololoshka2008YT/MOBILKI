fun main() {
    print("Введите длину пароля: ")
    val n = readln().toInt()

    print("Ваш пароль:: ${password(n)}")
}

fun password(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('!'..'?')
    return (1..length).map { allowedChars.random() }.joinToString("")
}