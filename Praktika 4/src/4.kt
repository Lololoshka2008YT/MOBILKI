fun main() {
    println("Введите час от 0 до 23 ")
    val hour = readln().toInt()
    if (hour in 0..23) {
        val timesOfDay = when (hour) {
            in 0..5 -> "Ночь"
            in 6..11 -> "Утро"
            in 12..17 -> "День"
            in 18..21 -> "Вечер"
            else -> "Ночь"
        }

        println("Сейчас: $timesOfDay")
    } else {
        println("ОШИБОЧКА")
    }
}