import kotlin.random.Random

fun main()
{
    val a = Array<Int>(10, { Random.nextInt(0, 100) })
    println(a.joinToString(" "))
    println(reversed(a).joinToString(" "))

}
fun reversed(a:Array<Int>):Array<Int> = a.reversedArray()

