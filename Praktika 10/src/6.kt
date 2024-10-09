fun main() {
    println("Введите количество слов:")
    val n = readln().toInt()
    val strings = Array(n) { "" } 

    println("Введите слова:")
    for (i in 0 until n) {
        strings[i] = readln()
    }

    val sortedStrings = strings.sortedArray()

    println("Отсортированный массив:")
    for (string in sortedStrings) {
        println(string)
    }
}