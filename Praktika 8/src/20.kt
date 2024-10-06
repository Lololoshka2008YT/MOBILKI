fun main()
{
    println("Введите числа, разделенные пробелом:")
    val input = readLine() ?: ""
    val a = input.split(" ").map { it.toInt() }.toTypedArray()
    println("Максимальное число: ${Max(a)}")
}
fun Max(a:Array<Int>):Int
{
    return a.max()
}