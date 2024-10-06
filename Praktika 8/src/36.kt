
fun main() {
    println("Введите строку ")
    val text = readln()
    println("Введите подстроку ")
    val substring = readln()

    if (containsSubstring(text, substring)) {
        println("Подстрока '$substring' найдена в строке '$text'")
    } else {
        println("Подстрока '$substring' не найдена в строке '$text'")
    }
}
fun containsSubstring(text: String, substring: String): Boolean {
    return text.contains(substring)
}