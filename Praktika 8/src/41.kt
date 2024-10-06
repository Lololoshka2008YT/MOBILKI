fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В строке ${vowels(str)} гласных")
}

fun vowels(str: String): Int
{
    return str.filter { it in "АОУЫЭЕЁИЮЯаоуыэеёиюя" }.length
}