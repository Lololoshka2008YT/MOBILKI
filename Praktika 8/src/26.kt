import kotlin.random.Random

fun main() {
    val a = Array<Int>(10, { Random.nextInt(0, 100) })
    println("Массив: ${a.joinToString()}")
    print("Последнее число: ${Posled(a)}")
}
fun Posled(a:Array<Int>):Int
{
    return a.last()
}