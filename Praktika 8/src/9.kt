import java.math.*

fun main()
{
    println("Введите k ")
    val k = readln().toInt()
    println("Введите n ")
    val n = readln().toInt()
    println(step(k, n))
}

fun step(k: Int, n: Int): Boolean
{
    val result = k.toBigInteger().pow(k)
    return result == n.toBigInteger()
}