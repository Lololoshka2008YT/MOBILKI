import kotlin.random.Random

fun main()
{
    val a = Array<Int>(10, { Random.nextInt(1, 100) })
    println(a.joinToString (" ") )
}