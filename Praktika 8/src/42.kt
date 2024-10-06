import kotlin.random.Random

fun main() {
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Введите элемент: ")
    val num = readln().toInt()
    println("Индекс первого вхождения: ${index2(arr, num)}")
}

fun index2(arr: Array<Int>, num : Int): Int = arr.indexOf(num)