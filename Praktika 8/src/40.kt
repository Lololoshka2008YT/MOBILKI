import kotlin.random.Random

fun main(){
    val a = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${a.joinToString()}")
    print("Копия массива: ${cop(a).joinToString("  ")}")
}

fun cop(a: Array<Int>): Array<Int> = a.copyOf()