import kotlin.random.Random

fun main()
{
    val a = Array<Int>(10, { Random.nextInt(0, 100) })
    println(a.joinToString (" ") )
    println(MaxMin(a))
}
fun MaxMin(a:Array<Int>):Pair<Int,Int>
{
    return Pair(a.max(),a.min())

}