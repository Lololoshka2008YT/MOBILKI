import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Введите индекс: ")
    val index = readln().toInt()
    println("Под индексом $index число ${index(arr, index)}")
}

fun index(arr: Array<Int>, index: Int): Int = arr[index]