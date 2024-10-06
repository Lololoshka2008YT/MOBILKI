import kotlin.random.Random

fun main()
{
    val a = Array<Int>(10, { Random.nextInt(0, 100) })
    println("Массив ${a.joinToString(" ")}")
    println()
    val b= readln().toInt()
    println(Find(a,b))
}
fun Find(a:Array<Int>,b:Int):String
{
    for (index in a.indices) {
        if (a[index] == b) {
            return "Элемент $b найден на позиции $index."
        }
    }
    return "Элемент $b не найден в массиве."
}
