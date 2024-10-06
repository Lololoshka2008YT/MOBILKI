fun main() {
    println("Введите строку")
    val a = readln()
    println(CAPS(a))
}

fun CAPS(a: String): String =a.uppercase()
