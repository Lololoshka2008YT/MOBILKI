import kotlin.math.*
fun main()
{
    print("Введите 3 числа: ")//После каждого введённого числа нажать Enter
    val x = readln().toInt()
    val y = readln().toInt()
    val z = readln().toInt()
    val max=maxOf(x,y,z)
    println("Максимальное число из этих трёх: $max ")


}