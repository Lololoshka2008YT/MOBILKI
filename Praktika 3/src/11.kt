fun main() {
    println("Введите натурально число ")
    val x = readln().toInt()
    if (x % 2 == 0)
        println("Число $x четное")
    else println("Число $x нечетное")
    if (x % 10 == 7)
        println("Число $x оканчивается на 7")
    else println("Число $x не оканчивается на 7")
}
