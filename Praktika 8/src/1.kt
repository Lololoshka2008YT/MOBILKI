fun main() {
    println("Введите несколько чисел, разделенных пробелами:")
    val input = readln()
    val numbers = input.split(" ").map { it.toInt() }
    val result = sum(numbers)
    println("Сумма чисел: $result")
}

fun sum(numbers: List<Int>): Int {
    var summa = 0
    for (number in numbers) {
        summa += number
    }
    return summa
}